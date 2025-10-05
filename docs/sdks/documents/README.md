# Documents
(*documents()*)

## Overview

### Available Operations

* [downloadFile](#downloadfile) - Download File
* [uploadFile](#uploadfile) - Upload File
* [listFiles](#listfiles) - List Files
* [getFile](#getfile) - Get File
* [listFolders](#listfolders) - List Folders
* [getFolder](#getfolder) - Get Folder
* [listDrives](#listdrives) - List Drives
* [getDrive](#getdrive) - Get Drive

## downloadFile

Download File

### Example Usage

<!-- UsageSnippet language="java" operationID="documents_download_file" method="get" path="/unified/documents/files/{id}/download" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.DocumentsDownloadFileRequest;
import com.stackone.stackone_client_java.models.operations.DocumentsDownloadFileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DocumentsDownloadFileRequest req = DocumentsDownloadFileRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .format("base64")
                .exportFormat("text/plain")
                .build();

        DocumentsDownloadFileResponse res = sdk.documents().downloadFile()
                .request(req)
                .call();

        if (res.body().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DocumentsDownloadFileRequest](../../models/operations/DocumentsDownloadFileRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DocumentsDownloadFileResponse](../../models/operations/DocumentsDownloadFileResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/PreconditionFailedResponse  | 412                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## uploadFile

Upload File

### Example Usage

<!-- UsageSnippet language="java" operationID="documents_upload_file" method="post" path="/unified/documents/files/upload" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.DocumentsUploadFileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DocumentsUploadFileResponse res = sdk.documents().uploadFile()
                .xAccountId("<id>")
                .unifiedUploadRequestDto(UnifiedUploadRequestDto.builder()
                    .name("weather-forecast")
                    .fileFormat(UnifiedUploadRequestDtoFileFormat.builder()
                        .value(UnifiedUploadRequestDtoValue.PDF)
                        .sourceValue(UnifiedUploadRequestDtoSourceValue.of("application/pdf"))
                        .build())
                    .content("VGhpcyBpc24ndCByZWFsbHkgYSBzYW1wbGUgZmlsZSwgYnV0IG5vIG9uZSB3aWxsIGV2ZXIga25vdyE")
                    .categoryId("6530")
                    .path("/path/to/file")
                    .category(UnifiedUploadRequestDtoCategory.builder()
                        .value("reports, resumes")
                        .sourceValue("550e8400-e29b-41d4-a716-446655440000, CUSTOM_CATEGORY_NAME")
                        .build())
                    .confidential(UnifiedUploadRequestDtoConfidential.builder()
                        .value(UnifiedUploadRequestDtoConfidentialValue.TRUE)
                        .sourceValue(UnifiedUploadRequestDtoConfidentialSourceValue.of("public"))
                        .build())
                    .build())
                .call();

        if (res.writeResultApiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `xAccountId`                                                                  | *String*                                                                      | :heavy_check_mark:                                                            | The account identifier                                                        |
| `xStackoneApiSessionToken`                                                    | *Optional\<String>*                                                           | :heavy_minus_sign:                                                            | The session token                                                             |
| `unifiedUploadRequestDto`                                                     | [UnifiedUploadRequestDto](../../models/components/UnifiedUploadRequestDto.md) | :heavy_check_mark:                                                            | N/A                                                                           |

### Response

**[DocumentsUploadFileResponse](../../models/operations/DocumentsUploadFileResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/PreconditionFailedResponse  | 412                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## listFiles

List Files

### Example Usage

<!-- UsageSnippet language="java" operationID="documents_list_files" method="get" path="/unified/documents/files" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.*;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DocumentsListFilesRequest req = DocumentsListFilesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,url,size,file_format,path,owner_id,remote_owner_id,folder_id,remote_folder_id,drive_id,remote_drive_id,export_formats,default_download_format,created_at,updated_at,has_content,has_children,all_parent_folder_ids,remote_all_parent_folder_ids,unified_custom_fields")
                .filter(DocumentsListFilesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .name("john_doe_resume.pdf")
                    .content("FAQ of the project")
                    .createdAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .driveId("1234567890")
                    .folderId("1234567890")
                    .build())
                .folderId("1234567890")
                .nestedItems("true")
                .include("all_parent_folder_ids")
                .build();


        sdk.documents().listFiles()
                .callAsStream()
                .forEach((DocumentsListFilesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DocumentsListFilesRequest](../../models/operations/DocumentsListFilesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DocumentsListFilesResponse](../../models/operations/DocumentsListFilesResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/PreconditionFailedResponse  | 412                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## getFile

Get File

### Example Usage

<!-- UsageSnippet language="java" operationID="documents_get_file" method="get" path="/unified/documents/files/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.DocumentsGetFileRequest;
import com.stackone.stackone_client_java.models.operations.DocumentsGetFileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DocumentsGetFileRequest req = DocumentsGetFileRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,url,size,file_format,path,owner_id,remote_owner_id,folder_id,remote_folder_id,drive_id,remote_drive_id,export_formats,default_download_format,created_at,updated_at,has_content,has_children,all_parent_folder_ids,remote_all_parent_folder_ids,unified_custom_fields")
                .include("all_parent_folder_ids")
                .build();

        DocumentsGetFileResponse res = sdk.documents().getFile()
                .request(req)
                .call();

        if (res.fileResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DocumentsGetFileRequest](../../models/operations/DocumentsGetFileRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DocumentsGetFileResponse](../../models/operations/DocumentsGetFileResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/PreconditionFailedResponse  | 412                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## listFolders

List Folders

### Example Usage

<!-- UsageSnippet language="java" operationID="documents_list_folders" method="get" path="/unified/documents/folders" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.*;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DocumentsListFoldersRequest req = DocumentsListFoldersRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,url,size,path,owner_id,remote_owner_id,parent_folder_id,remote_parent_folder_id,drive_id,remote_drive_id,created_at,updated_at,has_content,has_children,is_root,all_parent_folder_ids,remote_all_parent_folder_ids,unified_custom_fields")
                .filter(DocumentsListFoldersQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .driveId("1234567890")
                    .folderId("1234567890")
                    .build())
                .folderId("1234567890")
                .nestedItems("true")
                .include("all_parent_folder_ids")
                .build();


        sdk.documents().listFolders()
                .callAsStream()
                .forEach((DocumentsListFoldersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DocumentsListFoldersRequest](../../models/operations/DocumentsListFoldersRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DocumentsListFoldersResponse](../../models/operations/DocumentsListFoldersResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/PreconditionFailedResponse  | 412                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## getFolder

Get Folder

### Example Usage

<!-- UsageSnippet language="java" operationID="documents_get_folder" method="get" path="/unified/documents/folders/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.DocumentsGetFolderRequest;
import com.stackone.stackone_client_java.models.operations.DocumentsGetFolderResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DocumentsGetFolderRequest req = DocumentsGetFolderRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,url,size,path,owner_id,remote_owner_id,parent_folder_id,remote_parent_folder_id,drive_id,remote_drive_id,created_at,updated_at,has_content,has_children,is_root,all_parent_folder_ids,remote_all_parent_folder_ids,unified_custom_fields")
                .include("all_parent_folder_ids")
                .build();

        DocumentsGetFolderResponse res = sdk.documents().getFolder()
                .request(req)
                .call();

        if (res.folderResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DocumentsGetFolderRequest](../../models/operations/DocumentsGetFolderRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DocumentsGetFolderResponse](../../models/operations/DocumentsGetFolderResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/PreconditionFailedResponse  | 412                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## listDrives

List Drives

### Example Usage

<!-- UsageSnippet language="java" operationID="documents_list_drives" method="get" path="/unified/documents/drives" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.*;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DocumentsListDrivesRequest req = DocumentsListDrivesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,url,created_at,updated_at,unified_custom_fields")
                .filter(DocumentsListDrivesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.documents().listDrives()
                .callAsStream()
                .forEach((DocumentsListDrivesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DocumentsListDrivesRequest](../../models/operations/DocumentsListDrivesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DocumentsListDrivesResponse](../../models/operations/DocumentsListDrivesResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/PreconditionFailedResponse  | 412                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## getDrive

Get Drive

### Example Usage

<!-- UsageSnippet language="java" operationID="documents_get_drive" method="get" path="/unified/documents/drives/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.DocumentsGetDriveRequest;
import com.stackone.stackone_client_java.models.operations.DocumentsGetDriveResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DocumentsGetDriveRequest req = DocumentsGetDriveRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,url,created_at,updated_at,unified_custom_fields")
                .build();

        DocumentsGetDriveResponse res = sdk.documents().getDrive()
                .request(req)
                .call();

        if (res.driveResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DocumentsGetDriveRequest](../../models/operations/DocumentsGetDriveRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DocumentsGetDriveResponse](../../models/operations/DocumentsGetDriveResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/PreconditionFailedResponse  | 412                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |