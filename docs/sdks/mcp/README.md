# Mcp
(*mcp()*)

## Overview

Model Context Protocol endpoint.

### Available Operations

* [mcpGet](#mcpget) - Open MCP SSE stream
* [mcpPost](#mcppost) - Send MCP JSON-RPC message
* [mcpDelete](#mcpdelete) - Delete MCP session

## mcpGet

Open a dedicated Server-Sent Events stream for MCP notifications

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_mcp_get" method="get" path="/mcp" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.SchemeBasic;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneMcpGetResponse;
import com.stackone.stackone_client_java.models.operations.StackoneMcpGetSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
            .build();

        StackoneMcpGetResponse res = sdk.mcp().mcpGet()
                .security(StackoneMcpGetSecurity.builder()
                    .basic(SchemeBasic.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xAccountId("<id>")
                .mcpSessionId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                      | [com.stackone.stackone_client_java.models.operations.StackoneMcpGetSecurity](../../models/operations/StackoneMcpGetSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |
| `xAccountId`                                                                                                                    | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | Account secure id for the target provider account                                                                               |
| `mcpSessionId`                                                                                                                  | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | Session id                                                                                                                      |

### Response

**[StackoneMcpGetResponse](../../models/operations/StackoneMcpGetResponse.md)**

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

## mcpPost

Send JSON-RPC request to the MCP server over HTTP streaming transport

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_mcp_post" method="post" path="/mcp" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneMcpPostResponse;
import com.stackone.stackone_client_java.models.operations.StackoneMcpPostSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
            .build();

        StackoneMcpPostResponse res = sdk.mcp().mcpPost()
                .security(StackoneMcpPostSecurity.builder()
                    .basic(SchemeBasic.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xAccountId("<id>")
                .jsonRpcMessageDto(JsonRpcMessageDto.builder()
                    .jsonrpc("2.0")
                    .method("initialize")
                    .params(Params.builder()
                        .build())
                    .id(Id.builder()
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [com.stackone.stackone_client_java.models.operations.StackoneMcpPostSecurity](../../models/operations/StackoneMcpPostSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |
| `xAccountId`                                                                                                                      | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | Account secure id for the target provider account                                                                                 |
| `mcpSessionId`                                                                                                                    | *Optional\<String>*                                                                                                               | :heavy_minus_sign:                                                                                                                | Session id; omit for initialize, include for subsequent calls                                                                     |
| `jsonRpcMessageDto`                                                                                                               | [JsonRpcMessageDto](../../models/components/JsonRpcMessageDto.md)                                                                 | :heavy_check_mark:                                                                                                                | JSON-RPC 2.0 message                                                                                                              |

### Response

**[StackoneMcpPostResponse](../../models/operations/StackoneMcpPostResponse.md)**

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

## mcpDelete

Close an existing MCP session for the provided session id

### Example Usage

<!-- UsageSnippet language="java" operationID="stackone_mcp_delete" method="delete" path="/mcp" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.SchemeBasic;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneMcpDeleteResponse;
import com.stackone.stackone_client_java.models.operations.StackoneMcpDeleteSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
            .build();

        StackoneMcpDeleteResponse res = sdk.mcp().mcpDelete()
                .security(StackoneMcpDeleteSecurity.builder()
                    .basic(SchemeBasic.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xAccountId("<id>")
                .mcpSessionId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                            | [com.stackone.stackone_client_java.models.operations.StackoneMcpDeleteSecurity](../../models/operations/StackoneMcpDeleteSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |
| `xAccountId`                                                                                                                          | *String*                                                                                                                              | :heavy_check_mark:                                                                                                                    | Account secure id for the target provider account                                                                                     |
| `mcpSessionId`                                                                                                                        | *String*                                                                                                                              | :heavy_check_mark:                                                                                                                    | Session id                                                                                                                            |

### Response

**[StackoneMcpDeleteResponse](../../models/operations/StackoneMcpDeleteResponse.md)**

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