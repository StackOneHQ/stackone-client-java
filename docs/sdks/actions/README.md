# Actions
(*actions()*)

## Overview

Retrieve Actions metadata and definitions.

### Available Operations

* [listActionsMeta](#listactionsmeta) - List all actions metadata
* [rpcAction](#rpcaction) - Make an RPC call to an action

## listActionsMeta

Retrieves a list of all actions metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_list_actions_meta" method="get" path="/actions" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        StackoneListActionsMetaRequest req = StackoneListActionsMetaRequest.builder()
                .groupBy("[\"connector\"]")
                .filter(StackoneListActionsMetaQueryParamFilter.builder()
                    .connectors("connector1,connector2")
                    .accountIds("account1,account2")
                    .actionKey("action1")
                    .build())
                .include(List.of(
                    StackoneListActionsMetaQueryParamInclude.OPERATION_DETAILS))
                .build();


        sdk.actions().listActionsMeta()
                .callAsStream()
                .forEach((StackoneListActionsMetaResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [StackoneListActionsMetaRequest](../../models/operations/StackoneListActionsMetaRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[StackoneListActionsMetaResponse](../../models/operations/StackoneListActionsMetaResponse.md)**

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

## rpcAction

Makes a remote procedure call to the specified action

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_rpc_action" method="post" path="/actions/rpc" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneRpcActionResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ActionsRpcRequestDto req = ActionsRpcRequestDto.builder()
                .action("create_employee")
                .path(Map.ofEntries(
                    Map.entry("id", "123")))
                .query(Query.builder()
                    .debug(false)
                    .build())
                .headers(Map.ofEntries(
                    Map.entry("Content-Type", "application/json")))
                .body(Map.ofEntries(
                    Map.entry("data", "example")))
                .build();

        StackoneRpcActionResponse res = sdk.actions().rpcAction()
                .request(req)
                .call();

        if (res.actionsRpcResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ActionsRpcRequestDto](../../models/shared/ActionsRpcRequestDto.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[StackoneRpcActionResponse](../../models/operations/StackoneRpcActionResponse.md)**

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