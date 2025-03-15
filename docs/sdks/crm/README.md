# Crm
(*crm()*)

## Overview

### Available Operations

* [listContacts](#listcontacts) - List Contacts
* [createContact](#createcontact) - Creates a new Contact
* [getContact](#getcontact) - Get Contact
* [updateContact](#updatecontact) - Update Contact (early access)
* [listAccounts](#listaccounts) - List Accounts
* [getAccount](#getaccount) - Get Account
* [listLists](#listlists) - Get all Lists
* [getList](#getlist) - Get List
* [listContactCustomFieldDefinitions](#listcontactcustomfielddefinitions) - List Contact Custom Field Definitions
* [getContactCustomFieldDefinition](#getcontactcustomfielddefinition) - Get Contact Custom Field Definition

## listContacts

List Contacts

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmListContactsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.CrmListContactsRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmListContactsRequest req = CrmListContactsRequest.builder()
                .xAccountId("<id>")
                .raw(false)
                .fields("id,remote_id,first_name,last_name,company_name,emails,phone_numbers,deal_ids,remote_deal_ids,account_ids,remote_account_ids,custom_fields,created_at,updated_at")
                .filter(CrmListContactsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .pageSize("25")
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .include("custom_fields")
                .build();

        sdk.crm().listContacts()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CrmListContactsRequest](../../models/operations/CrmListContactsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CrmListContactsResponse](../../models/operations/CrmListContactsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createContact

Creates a new Contact

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.CrmCreateContactRequestDto;
import com.stackone.stackone_client_java.models.components.CustomFields;
import com.stackone.stackone_client_java.models.components.CustomFieldsValue;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmCreateContactResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmCreateContactResponse res = sdk.crm().createContact()
                .xAccountId("<id>")
                .crmCreateContactRequestDto(CrmCreateContactRequestDto.builder()
                    .firstName("Steve")
                    .lastName("Wozniak")
                    .companyName("Apple Inc.")
                    .emails(List.of(
                        "steve@apple.com"))
                    .phoneNumbers(List.of(
                        "123-456-7890"))
                    .dealIds(List.of(
                        "deal-001",
                        "deal-002"))
                    .accountIds(List.of(
                        "account-123",
                        "account-456"))
                    .customFields(List.of(
                        CustomFields.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Training Completion Status")
                            .value(CustomFieldsValue.of("Completed"))
                            .valueId("value_456")
                            .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .build(),
                        CustomFields.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Training Completion Status")
                            .value(CustomFieldsValue.of("Completed"))
                            .valueId("value_456")
                            .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .build(),
                        CustomFields.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Training Completion Status")
                            .value(CustomFieldsValue.of("Completed"))
                            .valueId("value_456")
                            .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.contactResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `xAccountId`                                                                        | *String*                                                                            | :heavy_check_mark:                                                                  | The account identifier                                                              |
| `crmCreateContactRequestDto`                                                        | [CrmCreateContactRequestDto](../../models/components/CrmCreateContactRequestDto.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |

### Response

**[CrmCreateContactResponse](../../models/operations/CrmCreateContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getContact

Get Contact

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmGetContactRequest;
import com.stackone.stackone_client_java.models.operations.CrmGetContactResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmGetContactRequest req = CrmGetContactRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .raw(false)
                .fields("id,remote_id,first_name,last_name,company_name,emails,phone_numbers,deal_ids,remote_deal_ids,account_ids,remote_account_ids,custom_fields,created_at,updated_at")
                .include("custom_fields")
                .build();

        CrmGetContactResponse res = sdk.crm().getContact()
                .request(req)
                .call();

        if (res.contactResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CrmGetContactRequest](../../models/operations/CrmGetContactRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CrmGetContactResponse](../../models/operations/CrmGetContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateContact

Update Contact (early access)

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.CrmCreateContactRequestDto;
import com.stackone.stackone_client_java.models.components.CustomFields;
import com.stackone.stackone_client_java.models.components.CustomFieldsValue;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmUpdateContactResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmUpdateContactResponse res = sdk.crm().updateContact()
                .xAccountId("<id>")
                .id("<id>")
                .crmCreateContactRequestDto(CrmCreateContactRequestDto.builder()
                    .firstName("Steve")
                    .lastName("Wozniak")
                    .companyName("Apple Inc.")
                    .emails(List.of(
                        "steve@apple.com"))
                    .phoneNumbers(List.of(
                        "123-456-7890"))
                    .dealIds(List.of(
                        "deal-001",
                        "deal-002"))
                    .accountIds(List.of(
                        "account-123",
                        "account-456"))
                    .customFields(List.of(
                        CustomFields.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Training Completion Status")
                            .value(CustomFieldsValue.of("Completed"))
                            .valueId("value_456")
                            .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.contactResult().isPresent()) {
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
| `crmCreateContactRequestDto`                                                        | [CrmCreateContactRequestDto](../../models/components/CrmCreateContactRequestDto.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |

### Response

**[CrmUpdateContactResponse](../../models/operations/CrmUpdateContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccounts

List Accounts

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmListAccountsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.CrmListAccountsRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmListAccountsRequest req = CrmListAccountsRequest.builder()
                .xAccountId("<id>")
                .raw(false)
                .fields("id,remote_id,owner_id,remote_owner_id,name,description,industries,annual_revenue,website,addresses,phone_numbers,created_at,updated_at")
                .filter(CrmListAccountsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .pageSize("25")
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.crm().listAccounts()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CrmListAccountsRequest](../../models/operations/CrmListAccountsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CrmListAccountsResponse](../../models/operations/CrmListAccountsResponse.md)**

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
import com.stackone.stackone_client_java.models.operations.CrmGetAccountRequest;
import com.stackone.stackone_client_java.models.operations.CrmGetAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmGetAccountRequest req = CrmGetAccountRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .raw(false)
                .fields("id,remote_id,owner_id,remote_owner_id,name,description,industries,annual_revenue,website,addresses,phone_numbers,created_at,updated_at")
                .build();

        CrmGetAccountResponse res = sdk.crm().getAccount()
                .request(req)
                .call();

        if (res.accountResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CrmGetAccountRequest](../../models/operations/CrmGetAccountRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CrmGetAccountResponse](../../models/operations/CrmGetAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLists

Get all Lists

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmListListsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.CrmListListsRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmListListsRequest req = CrmListListsRequest.builder()
                .xAccountId("<id>")
                .raw(false)
                .fields("id,remote_id,name,created_at,updated_at,items,type")
                .filter(CrmListListsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .pageSize("25")
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.crm().listLists()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CrmListListsRequest](../../models/operations/CrmListListsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CrmListListsResponse](../../models/operations/CrmListListsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getList

Get List

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmGetListRequest;
import com.stackone.stackone_client_java.models.operations.CrmGetListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmGetListRequest req = CrmGetListRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .raw(false)
                .fields("id,remote_id,name,created_at,updated_at,items,type")
                .build();

        CrmGetListResponse res = sdk.crm().getList()
                .request(req)
                .call();

        if (res.listResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [CrmGetListRequest](../../models/operations/CrmGetListRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[CrmGetListResponse](../../models/operations/CrmGetListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listContactCustomFieldDefinitions

List Contact Custom Field Definitions

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmListContactCustomFieldDefinitionsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.CrmListContactCustomFieldDefinitionsRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmListContactCustomFieldDefinitionsRequest req = CrmListContactCustomFieldDefinitionsRequest.builder()
                .xAccountId("<id>")
                .raw(false)
                .fields("id,remote_id,name,description,type,options")
                .filter(CrmListContactCustomFieldDefinitionsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .pageSize("25")
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.crm().listContactCustomFieldDefinitions()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [CrmListContactCustomFieldDefinitionsRequest](../../models/operations/CrmListContactCustomFieldDefinitionsRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[CrmListContactCustomFieldDefinitionsResponse](../../models/operations/CrmListContactCustomFieldDefinitionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getContactCustomFieldDefinition

Get Contact Custom Field Definition

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.CrmGetContactCustomFieldDefinitionQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.CrmGetContactCustomFieldDefinitionRequest;
import com.stackone.stackone_client_java.models.operations.CrmGetContactCustomFieldDefinitionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CrmGetContactCustomFieldDefinitionRequest req = CrmGetContactCustomFieldDefinitionRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .raw(false)
                .fields("id,remote_id,name,description,type,options")
                .filter(CrmGetContactCustomFieldDefinitionQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .pageSize("25")
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        CrmGetContactCustomFieldDefinitionResponse res = sdk.crm().getContactCustomFieldDefinition()
                .request(req)
                .call();

        if (res.customFieldDefinitionResultApiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [CrmGetContactCustomFieldDefinitionRequest](../../models/operations/CrmGetContactCustomFieldDefinitionRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[CrmGetContactCustomFieldDefinitionResponse](../../models/operations/CrmGetContactCustomFieldDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |