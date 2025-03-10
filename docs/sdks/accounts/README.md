# Accounts
(*accounts()*)

## Overview

### Available Operations

* [listLinkedAccounts](#listlinkedaccounts) - List Accounts
* [getAccount](#getaccount) - Get Account
* [deleteAccount](#deleteaccount) - Delete Account
* [updateAccount](#updateaccount) - Update Account
* [getAccountMetaInfo](#getaccountmetainfo) - Get meta information of the account

## listLinkedAccounts

List Accounts

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.StackoneListLinkedAccountsRequest;
import com.stackone.stackone_client_java.models.operations.StackoneListLinkedAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        StackoneListLinkedAccountsRequest req = StackoneListLinkedAccountsRequest.builder()
                .build();

        StackoneListLinkedAccountsResponse res = sdk.accounts().listLinkedAccounts()
                .request(req)
                .call();

        if (res.linkedAccounts().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [StackoneListLinkedAccountsRequest](../../models/operations/StackoneListLinkedAccountsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `serverURL`                                                                                       | *String*                                                                                          | :heavy_minus_sign:                                                                                | An optional server URL to use.                                                                    |

### Response

**[StackoneListLinkedAccountsResponse](../../models/operations/StackoneListLinkedAccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccount

Get Account

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.StackoneGetAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        StackoneGetAccountResponse res = sdk.accounts().getAccount()
                .id("<id>")
                .call();

        if (res.linkedAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `id`                           | *String*                       | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[StackoneGetAccountResponse](../../models/operations/StackoneGetAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteAccount

Delete Account

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.StackoneDeleteAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        StackoneDeleteAccountResponse res = sdk.accounts().deleteAccount()
                .id("<id>")
                .call();

        if (res.linkedAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `id`                           | *String*                       | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[StackoneDeleteAccountResponse](../../models/operations/StackoneDeleteAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccount

Update Account

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.PatchAccountExternalDto;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.StackoneUpdateAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        StackoneUpdateAccountResponse res = sdk.accounts().updateAccount()
                .id("<id>")
                .patchAccountExternalDto(PatchAccountExternalDto.builder()
                    .build())
                .call();

        if (res.linkedAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `id`                                                                          | *String*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           |
| `patchAccountExternalDto`                                                     | [PatchAccountExternalDto](../../models/components/PatchAccountExternalDto.md) | :heavy_check_mark:                                                            | N/A                                                                           |
| `serverURL`                                                                   | *String*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |

### Response

**[StackoneUpdateAccountResponse](../../models/operations/StackoneUpdateAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountMetaInfo

Get meta information of the account

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.StackoneGetAccountMetaInfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        StackoneGetAccountMetaInfoResponse res = sdk.accounts().getAccountMetaInfo()
                .id("<id>")
                .call();

        if (res.linkedAccountMeta().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `id`                           | *String*                       | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[StackoneGetAccountMetaInfoResponse](../../models/operations/StackoneGetAccountMetaInfoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |