# RequestLogs

## Overview

API requests and response logs.

### Available Operations

* [listStepLogs](#liststeplogs) - List Step Logs
* [getLog](#getlog) - Get Log
* [listLogs](#listlogs) - List Logs
* [listPlatformLogs](#listplatformlogs) - List Platform Logs

## listStepLogs

List Step Logs

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_list_step_logs" method="get" path="/requests/logs/steps" -->
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

        StackoneListStepLogsRequest req = StackoneListStepLogsRequest.builder()
                .orderBy(OrderBy.EVENT_DATETIME)
                .orderDirection(OrderDirection.ASC)
                .filter(Filter.builder()
                    .accountIds("45355976281015164504,45355976281015164505")
                    .startDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .endDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .requestIds("adbf752f-6457-4ddd-89b3-98ae2252b83b,adbf752f-6457-4ddd-89b3-98ae2252b83c")
                    .httpMethods("GET,POST")
                    .providers("ashby,greenhouse")
                    .services("hris,ats")
                    .resources("employees,users")
                    .childResources("documents,time-off")
                    .subResources("documents,employees")
                    .actions("download,upload")
                    .statusCodes("200,400")
                    .success(true)
                    .build())
                .build();

        StackoneListStepLogsResponse res = sdk.requestLogs().listStepLogs()
                .request(req)
                .call();

        if (res.stepLogsPaginated().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [StackoneListStepLogsRequest](../../models/operations/StackoneListStepLogsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[StackoneListStepLogsResponse](../../models/operations/StackoneListStepLogsResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## getLog

Get Log

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_get_log" method="get" path="/requests/logs/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.Include;
import com.stackone.stackone_client_java.models.operations.StackoneGetLogResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        StackoneGetLogResponse res = sdk.requestLogs().getLog()
                .id("<id>")
                .include(Include.STEP_LOGS)
                .call();

        if (res.unifiedLogResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *String*                                                                     | :heavy_check_mark:                                                           | N/A                                                                          |                                                                              |
| `include`                                                                    | [JsonNullable\<Include>](../../models/operations/Include.md)                 | :heavy_minus_sign:                                                           | The include parameter allows you to include additional data in the response. | step_logs                                                                    |

### Response

**[StackoneGetLogResponse](../../models/operations/StackoneGetLogResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## listLogs

List Logs

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_list_logs" method="get" path="/requests/logs" -->
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

        StackoneListLogsRequest req = StackoneListLogsRequest.builder()
                .orderBy(QueryParamOrderBy.DURATION)
                .orderDirection(QueryParamOrderDirection.ASC)
                .include(QueryParamInclude.STEP_LOGS)
                .filter(QueryParamFilter.builder()
                    .accountIds("45355976281015164504,45355976281015164505")
                    .startDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .endDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .requestIds("adbf752f-6457-4ddd-89b3-98ae2252b83b,adbf752f-6457-4ddd-89b3-98ae2252b83c")
                    .sourceTypes("DASHBOARD,SYNTHETIC_WEBHOOK")
                    .httpMethods("GET,POST")
                    .providers("ashby,greenhouse")
                    .services("hris,ats")
                    .resources("employees,users")
                    .childResources("documents,time-off")
                    .subResources("documents,employees")
                    .actions("download,upload")
                    .statusCodes("200,400")
                    .success(true)
                    .orderBy(StackoneListLogsQueryParamOrderBy.DURATION)
                    .orderDirection(StackoneListLogsQueryParamOrderDirection.ASC)
                    .build())
                .build();

        StackoneListLogsResponse res = sdk.requestLogs().listLogs()
                .request(req)
                .call();

        if (res.unifiedLogsPaginated().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [StackoneListLogsRequest](../../models/operations/StackoneListLogsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[StackoneListLogsResponse](../../models/operations/StackoneListLogsResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## listPlatformLogs

List Platform Logs

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_list_platform_logs" method="get" path="/requests/platform-logs" -->
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

        StackoneListPlatformLogsRequest req = StackoneListPlatformLogsRequest.builder()
                .orderBy(StackoneListPlatformLogsQueryParamOrderBy.DURATION)
                .orderDirection(StackoneListPlatformLogsQueryParamOrderDirection.ASC)
                .filter(StackoneListPlatformLogsQueryParamFilter.builder()
                    .accountIds("45355976281015164504,45355976281015164505")
                    .startDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .endDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .requestIds("adbf752f-6457-4ddd-89b3-98ae2252b83b,adbf752f-6457-4ddd-89b3-98ae2252b83c")
                    .sourceTypes("DASHBOARD,SYNTHETIC_WEBHOOK")
                    .httpMethods("GET,POST")
                    .categories("hris,ats")
                    .resources("employees,users")
                    .actions("download,upload")
                    .statusCodes("200,400")
                    .success(true)
                    .orderBy(StackoneListPlatformLogsQueryParamRequestLogsOrderBy.EVENT_DATETIME)
                    .orderDirection(StackoneListPlatformLogsQueryParamRequestLogsOrderDirection.ASC)
                    .build())
                .build();

        StackoneListPlatformLogsResponse res = sdk.requestLogs().listPlatformLogs()
                .request(req)
                .call();

        if (res.platformLogsPaginated().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [StackoneListPlatformLogsRequest](../../models/operations/StackoneListPlatformLogsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[StackoneListPlatformLogsResponse](../../models/operations/StackoneListPlatformLogsResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/BadRequestResponse          | 400                                       | application/json                          |
| models/errors/UnauthorizedResponse        | 401                                       | application/json                          |
| models/errors/ForbiddenResponse           | 403                                       | application/json                          |
| models/errors/NotFoundResponse            | 404                                       | application/json                          |
| models/errors/RequestTimedOutResponse     | 408                                       | application/json                          |
| models/errors/ConflictResponse            | 409                                       | application/json                          |
| models/errors/UnprocessableEntityResponse | 422                                       | application/json                          |
| models/errors/TooManyRequestsResponse     | 429                                       | application/json                          |
| models/errors/InternalServerErrorResponse | 500                                       | application/json                          |
| models/errors/NotImplementedResponse      | 501                                       | application/json                          |
| models/errors/BadGatewayResponse          | 502                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |