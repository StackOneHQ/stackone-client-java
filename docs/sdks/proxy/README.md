# Proxy
(*proxy()*)

## Overview

### Available Operations

* [proxyRequest](#proxyrequest) - Proxy Request

## proxyRequest

Proxy Request

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.ProxyRequestBody;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneProxyRequestResponse;
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

        StackoneProxyRequestResponse res = sdk.proxy().proxyRequest()
                .xAccountId("<id>")
                .proxyRequestBody(ProxyRequestBody.builder()
                    .url("https://api.sample-integration.com/v1")
                    .path("/employees/directory")
                    .headers(Map.ofEntries(
                        Map.entry("Content-Type", "application/json")))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `xAccountId`                                                    | *String*                                                        | :heavy_check_mark:                                              | The account identifier                                          |
| `proxyRequestBody`                                              | [ProxyRequestBody](../../models/components/ProxyRequestBody.md) | :heavy_check_mark:                                              | The request body                                                |

### Response

**[StackoneProxyRequestResponse](../../models/operations/StackoneProxyRequestResponse.md)**

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