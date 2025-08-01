# Lms
(*lms()*)

## Overview

### Available Operations

* [listCourses](#listcourses) - List Courses
* [getCourse](#getcourse) - Get Course
* [listUserAssignments](#listuserassignments) - List User Assignments
* [createUserAssignment](#createuserassignment) - Create User Assignment
* [getUserAssignment](#getuserassignment) - Get User Assignment
* [batchUpsertContent](#batchupsertcontent) - Batch Upsert Content
* [listContent](#listcontent) - List Content
* [upsertContent](#upsertcontent) - Upsert Content
* [getContent](#getcontent) - Get Content
* [updateContent](#updatecontent) - Update Content
* [listUserCompletions](#listusercompletions) - List User Completions
* [createUserCompletion](#createusercompletion) - Create User Completion
* [getUserCompletion](#getusercompletion) - Get User Completion
* [deleteUserCompletion](#deleteusercompletion) - Delete User Completion
* [listCompletions](#listcompletions) - List Completions
* [getCompletion](#getcompletion) - Get Completion
* [getCategory](#getcategory) - Get Category
* [listCategories](#listcategories) - List Categories
* [listUsers](#listusers) - List Users
* [getUser](#getuser) - Get User
* [getSkill](#getskill) - Get Skill
* [listSkills](#listskills) - List Skills
* [listAssignments](#listassignments) - List Assignments
* [getAssignment](#getassignment) - Get Assignment

## listCourses

List Courses

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_courses" method="get" path="/unified/lms/courses" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListCoursesRequest req = LmsListCoursesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,external_reference,content_ids,remote_content_ids,title,description,languages,cover_url,url,active,duration,categories,skills,updated_at,created_at,content,provider,localizations,authors")
                .filter(LmsListCoursesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.lms().listCourses()
                .request(req)
                .callAsStream()
                .forEach((LmsListCoursesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [LmsListCoursesRequest](../../models/operations/LmsListCoursesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[LmsListCoursesResponse](../../models/operations/LmsListCoursesResponse.md)**

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

## getCourse

Get Course

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_course" method="get" path="/unified/lms/courses/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetCourseRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetCourseResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetCourseRequest req = LmsGetCourseRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,external_reference,content_ids,remote_content_ids,title,description,languages,cover_url,url,active,duration,categories,skills,updated_at,created_at,content,provider,localizations,authors")
                .build();

        LmsGetCourseResponse res = sdk.lms().getCourse()
                .request(req)
                .call();

        if (res.courseResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [LmsGetCourseRequest](../../models/operations/LmsGetCourseRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[LmsGetCourseResponse](../../models/operations/LmsGetCourseResponse.md)**

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

## listUserAssignments

List User Assignments

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_user_assignments" method="get" path="/unified/lms/users/{id}/assignments" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListUserAssignmentsRequest req = LmsListUserAssignmentsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,external_reference,user_id,remote_user_id,course_id,remote_course_id,updated_at,created_at,due_date,status,progress,learning_object_type,learning_object_id,remote_learning_object_id,learning_object_external_reference")
                .filter(LmsListUserAssignmentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .userId("c28xyrc55866bvuv")
                .remoteUserId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                .build();

        sdk.lms().listUserAssignments()
                .request(req)
                .callAsStream()
                .forEach((LmsListUserAssignmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [LmsListUserAssignmentsRequest](../../models/operations/LmsListUserAssignmentsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[LmsListUserAssignmentsResponse](../../models/operations/LmsListUserAssignmentsResponse.md)**

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

## createUserAssignment

Create User Assignment

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_create_user_assignment" method="post" path="/unified/lms/users/{id}/assignments" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsCreateUserAssignmentResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsCreateUserAssignmentResponse res = sdk.lms().createUserAssignment()
                .xAccountId("<id>")
                .id("<id>")
                .lmsCreateAssignmentRequestDto(LmsCreateAssignmentRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .learningObjectId("e3gd34-23tr21-er234-345er56")
                    .learningObjectExternalReference("learning-content-123")
                    .progress(40d)
                    .createdAt(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                    .dueDate(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                    .status(LmsCreateAssignmentRequestDtoStatus.builder()
                        .value(LmsCreateAssignmentRequestDtoValue.IN_PROGRESS)
                        .build())
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `xAccountId`                                                                              | *String*                                                                                  | :heavy_check_mark:                                                                        | The account identifier                                                                    |
| `id`                                                                                      | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `lmsCreateAssignmentRequestDto`                                                           | [LmsCreateAssignmentRequestDto](../../models/components/LmsCreateAssignmentRequestDto.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |

### Response

**[LmsCreateUserAssignmentResponse](../../models/operations/LmsCreateUserAssignmentResponse.md)**

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

## getUserAssignment

Get User Assignment

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_user_assignment" method="get" path="/unified/lms/users/{id}/assignments/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetUserAssignmentRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetUserAssignmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetUserAssignmentRequest req = LmsGetUserAssignmentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .build();

        LmsGetUserAssignmentResponse res = sdk.lms().getUserAssignment()
                .request(req)
                .call();

        if (res.assignmentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [LmsGetUserAssignmentRequest](../../models/operations/LmsGetUserAssignmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[LmsGetUserAssignmentResponse](../../models/operations/LmsGetUserAssignmentResponse.md)**

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

## batchUpsertContent

Batch Upsert Content

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_batch_upsert_content" method="post" path="/unified/lms/content/batch" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsBatchUpsertContentResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsBatchUpsertContentResponse res = sdk.lms().batchUpsertContent()
                .xAccountId("<id>")
                .lmsBatchUpsertContentRequestDto(LmsBatchUpsertContentRequestDto.builder()
                    .items(List.of(
                        LmsUpsertContentRequestDto.builder()
                            .unifiedCustomFields(Map.ofEntries(
                                Map.entry("my_project_custom_field_1", "REF-1236"),
                                Map.entry("my_project_custom_field_2", "some other value")))
                            .externalReference("SOFTWARE-ENG-LV1-TRAINING-VIDEO-1")
                            .title("Software Engineer Lv 1")
                            .description("This video acts as learning content for software engineers.")
                            .languages(List.of(
                                LanguageEnum.builder()
                                    .value(LanguageEnumValue.EN_GB)
                                    .build()))
                            .contentUrl("https://www.youtube.com/watch?v=16873")
                            .mobileLaunchContentUrl("https://www.mobile.youtube.com/watch?v=16873")
                            .coverUrl("https://www.googledrive.com/?v=16873")
                            .active(LmsUpsertContentRequestDtoActive.of(true))
                            .duration("P3Y6M4DT12H30M5S")
                            .skills(List.of(
                                CreateSkillsApiModel.builder()
                                    .id("12345")
                                    .name("Sales Techniques")
                                    .build()))
                            .order(1d)
                            .localizations(List.of(
                                LocalizationModel.builder()
                                    .title("Software Engineer Lv 1")
                                    .description("This course acts as learning resource for software engineers.")
                                    .build(),
                                LocalizationModel.builder()
                                    .title("Software Engineer: A comprehensive guide")
                                    .description("This course acts as learning resource for software engineers.")
                                    .build()))
                            .tags(List.of(
                                "Sales Techniques",
                                "Customer Service"))
                            .updatedAt(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                            .createdAt(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                            .categories(List.of(
                                CreateCategoriesApiModel.builder()
                                    .id("16873-IT345")
                                    .unifiedCustomFields(Map.ofEntries(
                                        Map.entry("my_project_custom_field_1", "REF-1236"),
                                        Map.entry("my_project_custom_field_2", "some other value")))
                                    .name("Information-Technology")
                                    .language(CreateCategoriesApiModelLanguage.builder()
                                        .value(CreateCategoriesApiModelLanguageValue.EN_GB)
                                        .build())
                                    .build()))
                            .additionalData(List.of(
                                AdditionalData.builder()
                                    .id("learning_outcomes")
                                    .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                                    .value(AdditionalDataValue.of("This is additional data"))
                                    .build()))
                            .build()))
                    .build())
                .call();

        if (res.batchResultApiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                  | *String*                                                                                      | :heavy_check_mark:                                                                            | The account identifier                                                                        |
| `lmsBatchUpsertContentRequestDto`                                                             | [LmsBatchUpsertContentRequestDto](../../models/components/LmsBatchUpsertContentRequestDto.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |

### Response

**[LmsBatchUpsertContentResponse](../../models/operations/LmsBatchUpsertContentResponse.md)**

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

## listContent

List Content

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_content" method="get" path="/unified/lms/content" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListContentRequest req = LmsListContentRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,external_reference,course_ids,remote_course_ids,title,description,additional_data,languages,content_url,mobile_launch_content_url,content_type,cover_url,active,duration,order,categories,skills,updated_at,created_at,provider,localizations,tags,authors")
                .filter(LmsListContentQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.lms().listContent()
                .request(req)
                .callAsStream()
                .forEach((LmsListContentResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [LmsListContentRequest](../../models/operations/LmsListContentRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[LmsListContentResponse](../../models/operations/LmsListContentResponse.md)**

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

## upsertContent

Upsert Content

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_upsert_content" method="put" path="/unified/lms/content" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsUpsertContentResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsUpsertContentResponse res = sdk.lms().upsertContent()
                .xAccountId("<id>")
                .lmsUpsertContentRequestDto(LmsUpsertContentRequestDto.builder()
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .externalReference("SOFTWARE-ENG-LV1-TRAINING-VIDEO-1")
                    .title("Software Engineer Lv 1")
                    .description("This video acts as learning content for software engineers.")
                    .languages(List.of(
                        LanguageEnum.builder()
                            .value(LanguageEnumValue.EN_GB)
                            .build()))
                    .contentUrl("https://www.youtube.com/watch?v=16873")
                    .mobileLaunchContentUrl("https://www.mobile.youtube.com/watch?v=16873")
                    .coverUrl("https://www.googledrive.com/?v=16873")
                    .active(LmsUpsertContentRequestDtoActive.of(true))
                    .duration("P3Y6M4DT12H30M5S")
                    .skills(List.of(
                        CreateSkillsApiModel.builder()
                            .id("12345")
                            .name("Sales Techniques")
                            .build()))
                    .order(1d)
                    .localizations(List.of(
                        LocalizationModel.builder()
                            .title("Software Engineer Lv 1")
                            .description("This course acts as learning resource for software engineers.")
                            .build(),
                        LocalizationModel.builder()
                            .title("Software Engineer: A comprehensive guide")
                            .description("This course acts as learning resource for software engineers.")
                            .build()))
                    .tags(List.of(
                        "Sales Techniques",
                        "Customer Service"))
                    .authors(List.of(
                        AuthorModel.builder()
                            .id("123")
                            .name("John Doe")
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                    .createdAt(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                    .categories(List.of(
                        CreateCategoriesApiModel.builder()
                            .id("16873-IT345")
                            .unifiedCustomFields(Map.ofEntries(
                                Map.entry("my_project_custom_field_1", "REF-1236"),
                                Map.entry("my_project_custom_field_2", "some other value")))
                            .name("Information-Technology")
                            .language(CreateCategoriesApiModelLanguage.builder()
                                .value(CreateCategoriesApiModelLanguageValue.EN_GB)
                                .build())
                            .build()))
                    .additionalData(List.of(
                        AdditionalData.builder()
                            .id("learning_outcomes")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .value(AdditionalDataValue.of("This is additional data"))
                            .build()))
                    .build())
                .call();

        if (res.upsertResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `xAccountId`                                                                        | *String*                                                                            | :heavy_check_mark:                                                                  | The account identifier                                                              |
| `lmsUpsertContentRequestDto`                                                        | [LmsUpsertContentRequestDto](../../models/components/LmsUpsertContentRequestDto.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |

### Response

**[LmsUpsertContentResponse](../../models/operations/LmsUpsertContentResponse.md)**

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

## getContent

Get Content

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_content" method="get" path="/unified/lms/content/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetContentRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetContentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetContentRequest req = LmsGetContentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,external_reference,course_ids,remote_course_ids,title,description,additional_data,languages,content_url,mobile_launch_content_url,content_type,cover_url,active,duration,order,categories,skills,updated_at,created_at,provider,localizations,tags,authors")
                .build();

        LmsGetContentResponse res = sdk.lms().getContent()
                .request(req)
                .call();

        if (res.contentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [LmsGetContentRequest](../../models/operations/LmsGetContentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[LmsGetContentResponse](../../models/operations/LmsGetContentResponse.md)**

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

## updateContent

Update Content

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_update_content" method="patch" path="/unified/lms/content/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsUpdateContentResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsUpdateContentResponse res = sdk.lms().updateContent()
                .xAccountId("<id>")
                .id("<id>")
                .lmsCreateContentRequestDto(LmsCreateContentRequestDto.builder()
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .externalReference("SOFTWARE-ENG-LV1-TRAINING-VIDEO-1")
                    .title("Software Engineer Lv 1")
                    .description("This video acts as learning content for software engineers.")
                    .languages(List.of(
                        LanguageEnum.builder()
                            .value(LanguageEnumValue.EN_GB)
                            .build()))
                    .contentUrl("https://www.youtube.com/watch?v=16873")
                    .mobileLaunchContentUrl("https://www.mobile.youtube.com/watch?v=16873")
                    .coverUrl("https://www.googledrive.com/?v=16873")
                    .active(LmsCreateContentRequestDtoActive.of(true))
                    .duration("P3Y6M4DT12H30M5S")
                    .skills(List.of(
                        CreateSkillsApiModel.builder()
                            .id("12345")
                            .name("Sales Techniques")
                            .build()))
                    .order(1d)
                    .localizations(List.of(
                        LocalizationModel.builder()
                            .title("Software Engineer Lv 1")
                            .description("This course acts as learning resource for software engineers.")
                            .build(),
                        LocalizationModel.builder()
                            .title("Software Engineer Lv 1")
                            .description("This video acts as learning content for software engineers.")
                            .build()))
                    .tags(List.of(
                        "Sales Techniques",
                        "Customer Service"))
                    .authors(List.of(
                        AuthorModel.builder()
                            .id("123")
                            .name("John Doe")
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                    .createdAt(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                    .categories(List.of(
                        CreateCategoriesApiModel.builder()
                            .name("Technology")
                            .build()))
                    .additionalData(List.of(
                        AdditionalData.builder()
                            .id("learning_outcomes")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .value(AdditionalDataValue.of("This is additional data"))
                            .build()))
                    .build())
                .call();

        if (res.updateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `xAccountId`                                                                        | *String*                                                                            | :heavy_check_mark:                                                                  | The account identifier                                                              |
| `id`                                                                                | *String*                                                                            | :heavy_check_mark:                                                                  | N/A                                                                                 |
| `lmsCreateContentRequestDto`                                                        | [LmsCreateContentRequestDto](../../models/components/LmsCreateContentRequestDto.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |

### Response

**[LmsUpdateContentResponse](../../models/operations/LmsUpdateContentResponse.md)**

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

## listUserCompletions

List User Completions

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_user_completions" method="get" path="/unified/lms/users/{id}/completions" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListUserCompletionsRequest req = LmsListUserCompletionsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,external_id,remote_external_id,external_reference,content_id,remote_content_id,course_id,remote_course_id,user_id,remote_user_id,completed_at,updated_at,created_at,result,content_external_reference,learning_object_type,learning_object_id,remote_learning_object_id,learning_object_external_reference,time_spent")
                .filter(LmsListUserCompletionsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.lms().listUserCompletions()
                .request(req)
                .callAsStream()
                .forEach((LmsListUserCompletionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [LmsListUserCompletionsRequest](../../models/operations/LmsListUserCompletionsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[LmsListUserCompletionsResponse](../../models/operations/LmsListUserCompletionsResponse.md)**

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

## createUserCompletion

Create User Completion

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_create_user_completion" method="post" path="/unified/lms/users/{id}/completions" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.LmsCreateCompletionRequestDto;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsCreateUserCompletionResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsCreateUserCompletionResponse res = sdk.lms().createUserCompletion()
                .xAccountId("<id>")
                .id("<id>")
                .lmsCreateCompletionRequestDto(LmsCreateCompletionRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .completedAt(OffsetDateTime.parse("2021-07-21T14:00:00.000Z"))
                    .learningObjectId("e3gd34-23tr21-er234-345er56")
                    .learningObjectExternalReference("learning-content-123")
                    .timeSpent("PT1H30M45S")
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `xAccountId`                                                                              | *String*                                                                                  | :heavy_check_mark:                                                                        | The account identifier                                                                    |
| `id`                                                                                      | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `lmsCreateCompletionRequestDto`                                                           | [LmsCreateCompletionRequestDto](../../models/components/LmsCreateCompletionRequestDto.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |

### Response

**[LmsCreateUserCompletionResponse](../../models/operations/LmsCreateUserCompletionResponse.md)**

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

## getUserCompletion

Get User Completion

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_user_completion" method="get" path="/unified/lms/users/{id}/completions/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetUserCompletionRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetUserCompletionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetUserCompletionRequest req = LmsGetUserCompletionRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .build();

        LmsGetUserCompletionResponse res = sdk.lms().getUserCompletion()
                .request(req)
                .call();

        if (res.completionResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [LmsGetUserCompletionRequest](../../models/operations/LmsGetUserCompletionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[LmsGetUserCompletionResponse](../../models/operations/LmsGetUserCompletionResponse.md)**

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

## deleteUserCompletion

Delete User Completion

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_delete_user_completion" method="delete" path="/unified/lms/users/{id}/completions/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsDeleteUserCompletionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsDeleteUserCompletionResponse res = sdk.lms().deleteUserCompletion()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .call();

        if (res.deleteResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `xAccountId`           | *String*               | :heavy_check_mark:     | The account identifier |
| `id`                   | *String*               | :heavy_check_mark:     | N/A                    |
| `subResourceId`        | *String*               | :heavy_check_mark:     | N/A                    |

### Response

**[LmsDeleteUserCompletionResponse](../../models/operations/LmsDeleteUserCompletionResponse.md)**

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

## listCompletions

List Completions

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_completions" method="get" path="/unified/lms/completions" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListCompletionsRequest req = LmsListCompletionsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,external_id,remote_external_id,external_reference,content_id,remote_content_id,course_id,remote_course_id,user_id,remote_user_id,completed_at,updated_at,created_at,result,content_external_reference,learning_object_type,learning_object_id,remote_learning_object_id,learning_object_external_reference,time_spent")
                .filter(LmsListCompletionsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.lms().listCompletions()
                .request(req)
                .callAsStream()
                .forEach((LmsListCompletionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [LmsListCompletionsRequest](../../models/operations/LmsListCompletionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[LmsListCompletionsResponse](../../models/operations/LmsListCompletionsResponse.md)**

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

## getCompletion

Get Completion

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_completion" method="get" path="/unified/lms/completions/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetCompletionRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetCompletionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetCompletionRequest req = LmsGetCompletionRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .build();

        LmsGetCompletionResponse res = sdk.lms().getCompletion()
                .request(req)
                .call();

        if (res.completionResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [LmsGetCompletionRequest](../../models/operations/LmsGetCompletionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[LmsGetCompletionResponse](../../models/operations/LmsGetCompletionResponse.md)**

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

## getCategory

Get Category

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_category" method="get" path="/unified/lms/categories/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetCategoryRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetCategoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetCategoryRequest req = LmsGetCategoryRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,active,hierarchy,level,language")
                .build();

        LmsGetCategoryResponse res = sdk.lms().getCategory()
                .request(req)
                .call();

        if (res.categoryResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [LmsGetCategoryRequest](../../models/operations/LmsGetCategoryRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[LmsGetCategoryResponse](../../models/operations/LmsGetCategoryResponse.md)**

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

## listCategories

List Categories

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_categories" method="get" path="/unified/lms/categories" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListCategoriesRequest req = LmsListCategoriesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,active,hierarchy,level,language")
                .filter(LmsListCategoriesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.lms().listCategories()
                .request(req)
                .callAsStream()
                .forEach((LmsListCategoriesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [LmsListCategoriesRequest](../../models/operations/LmsListCategoriesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[LmsListCategoriesResponse](../../models/operations/LmsListCategoriesResponse.md)**

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

## listUsers

List Users

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_users" method="get" path="/unified/lms/users" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsListUsersRequest;
import com.stackone.stackone_client_java.models.operations.LmsListUsersResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListUsersRequest req = LmsListUsersRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,external_reference,active,email,phone_number,created_at,updated_at,name")
                .filter(JsonNullable.of(null))
                .build();

        sdk.lms().listUsers()
                .request(req)
                .callAsStream()
                .forEach((LmsListUsersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [LmsListUsersRequest](../../models/operations/LmsListUsersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[LmsListUsersResponse](../../models/operations/LmsListUsersResponse.md)**

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

## getUser

Get User

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_user" method="get" path="/unified/lms/users/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetUserRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetUserRequest req = LmsGetUserRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,external_reference,active,email,phone_number,created_at,updated_at,name")
                .build();

        LmsGetUserResponse res = sdk.lms().getUser()
                .request(req)
                .call();

        if (res.userResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [LmsGetUserRequest](../../models/operations/LmsGetUserRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[LmsGetUserResponse](../../models/operations/LmsGetUserResponse.md)**

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

## getSkill

Get Skill

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_skill" method="get" path="/unified/lms/skills/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetSkillRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetSkillResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetSkillRequest req = LmsGetSkillRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,active,hierarchy,language")
                .build();

        LmsGetSkillResponse res = sdk.lms().getSkill()
                .request(req)
                .call();

        if (res.skillResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [LmsGetSkillRequest](../../models/operations/LmsGetSkillRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[LmsGetSkillResponse](../../models/operations/LmsGetSkillResponse.md)**

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

## listSkills

List Skills

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_skills" method="get" path="/unified/lms/skills" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListSkillsRequest req = LmsListSkillsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,active,hierarchy,language")
                .filter(LmsListSkillsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.lms().listSkills()
                .request(req)
                .callAsStream()
                .forEach((LmsListSkillsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [LmsListSkillsRequest](../../models/operations/LmsListSkillsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[LmsListSkillsResponse](../../models/operations/LmsListSkillsResponse.md)**

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

## listAssignments

List Assignments

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_list_assignments" method="get" path="/unified/lms/assignments" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsListAssignmentsRequest req = LmsListAssignmentsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,external_reference,user_id,remote_user_id,course_id,remote_course_id,updated_at,created_at,due_date,status,progress,learning_object_type,learning_object_id,remote_learning_object_id,learning_object_external_reference")
                .filter(LmsListAssignmentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .userId("c28xyrc55866bvuv")
                .remoteUserId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                .build();

        sdk.lms().listAssignments()
                .request(req)
                .callAsStream()
                .forEach((LmsListAssignmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [LmsListAssignmentsRequest](../../models/operations/LmsListAssignmentsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[LmsListAssignmentsResponse](../../models/operations/LmsListAssignmentsResponse.md)**

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

## getAssignment

Get Assignment

### Example Usage

<!-- UsageSnippet language="java" operationID="lms_get_assignment" method="get" path="/unified/lms/assignments/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.LmsGetAssignmentRequest;
import com.stackone.stackone_client_java.models.operations.LmsGetAssignmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LmsGetAssignmentRequest req = LmsGetAssignmentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .build();

        LmsGetAssignmentResponse res = sdk.lms().getAssignment()
                .request(req)
                .call();

        if (res.assignmentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [LmsGetAssignmentRequest](../../models/operations/LmsGetAssignmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[LmsGetAssignmentResponse](../../models/operations/LmsGetAssignmentResponse.md)**

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