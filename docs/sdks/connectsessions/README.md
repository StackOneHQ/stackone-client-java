# ConnectSessions
(*connectSessions()*)

## Overview

### Available Operations

* [createConnectSession](#createconnectsession) - Create Connect Session
* [authenticateConnectSession](#authenticateconnectsession) - Authenticate Connect Session

## createConnectSession

Create Connect Session

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Categories;
import com.stackone.stackone_client_java.models.components.ConnectSessionCreate;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.StackoneCreateConnectSessionResponse;
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

        ConnectSessionCreate req = ConnectSessionCreate.builder()
                .originOwnerId("<id>")
                .originOwnerName("<value>")
                .categories(List.of(
                    Categories.ATS,
                    Categories.HRIS,
                    Categories.CRM,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.ATS,
                    Categories.DOCUMENTS,
                    Categories.TICKETING))
                .build();

        StackoneCreateConnectSessionResponse res = sdk.connectSessions().createConnectSession()
                .request(req)
                .call();

        if (res.connectSessionTokenAuthLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ConnectSessionCreate](../../models/shared/ConnectSessionCreate.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *String*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Response

**[StackoneCreateConnectSessionResponse](../../models/operations/StackoneCreateConnectSessionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## authenticateConnectSession

Authenticate Connect Session

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.ConnectSessionAuthenticate;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.StackoneAuthenticateConnectSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ConnectSessionAuthenticate req = ConnectSessionAuthenticate.builder()
                .token("<value>")
                .build();

        StackoneAuthenticateConnectSessionResponse res = sdk.connectSessions().authenticateConnectSession()
                .request(req)
                .call();

        if (res.connectSession().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ConnectSessionAuthenticate](../../models/shared/ConnectSessionAuthenticate.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `serverURL`                                                                     | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |

### Response

**[StackoneAuthenticateConnectSessionResponse](../../models/operations/StackoneAuthenticateConnectSessionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |