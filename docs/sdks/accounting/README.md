# Accounting
(*accounting()*)

## Overview

### Available Operations

* [listCompanies](#listcompanies) - List Companies
* [getCompany](#getcompany) - Get Company
* [listCompanyAccounts](#listcompanyaccounts) - List Accounts
* [getCompanyAccount](#getcompanyaccount) - Get Account
* [listCompanyTaxRates](#listcompanytaxrates) - List Tax Rates
* [getCompanyTaxRate](#getcompanytaxrate) - Get Tax Rate
* [batchCreateCompanyJournals](#batchcreatecompanyjournals) - Batch Create Journals
* [listCompanyJournals](#listcompanyjournals) - List Journals
* [createCompanyJournal](#createcompanyjournal) - Create Journal
* [getCompanyJournal](#getcompanyjournal) - Get Journal

## listCompanies

List Companies

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_list_companies" method="get" path="/unified/accounting/companies" -->
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

        AccountingListCompaniesRequest req = AccountingListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,base_currency,fiscal_year_start_month,fiscal_year_start_day")
                .filter(AccountingListCompaniesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.accounting().listCompanies()
                .request(req)
                .callAsStream()
                .forEach((AccountingListCompaniesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AccountingListCompaniesRequest](../../models/operations/AccountingListCompaniesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AccountingListCompaniesResponse](../../models/operations/AccountingListCompaniesResponse.md)**

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

## getCompany

Get Company

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_get_company" method="get" path="/unified/accounting/companies/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AccountingGetCompanyRequest;
import com.stackone.stackone_client_java.models.operations.AccountingGetCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AccountingGetCompanyRequest req = AccountingGetCompanyRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,base_currency,fiscal_year_start_month,fiscal_year_start_day")
                .build();

        AccountingGetCompanyResponse res = sdk.accounting().getCompany()
                .request(req)
                .call();

        if (res.accountingCompanyResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AccountingGetCompanyRequest](../../models/operations/AccountingGetCompanyRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AccountingGetCompanyResponse](../../models/operations/AccountingGetCompanyResponse.md)**

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

## listCompanyAccounts

List Accounts

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_list_company_accounts" method="get" path="/unified/accounting/companies/{id}/accounts" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AccountingListCompanyAccountsRequest;
import com.stackone.stackone_client_java.models.operations.AccountingListCompanyAccountsResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AccountingListCompanyAccountsRequest req = AccountingListCompanyAccountsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,company_id,remote_company_id,code,name,type,active")
                .filter(JsonNullable.of(null))
                .build();

        sdk.accounting().listCompanyAccounts()
                .request(req)
                .callAsStream()
                .forEach((AccountingListCompanyAccountsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingListCompanyAccountsRequest](../../models/operations/AccountingListCompanyAccountsRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingListCompanyAccountsResponse](../../models/operations/AccountingListCompanyAccountsResponse.md)**

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

## getCompanyAccount

Get Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_get_company_account" method="get" path="/unified/accounting/companies/{id}/accounts/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AccountingGetCompanyAccountRequest;
import com.stackone.stackone_client_java.models.operations.AccountingGetCompanyAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AccountingGetCompanyAccountRequest req = AccountingGetCompanyAccountRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,company_id,remote_company_id,code,name,type,active")
                .build();

        AccountingGetCompanyAccountResponse res = sdk.accounting().getCompanyAccount()
                .request(req)
                .call();

        if (res.accountingAccountResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingGetCompanyAccountRequest](../../models/operations/AccountingGetCompanyAccountRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingGetCompanyAccountResponse](../../models/operations/AccountingGetCompanyAccountResponse.md)**

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

## listCompanyTaxRates

List Tax Rates

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_list_company_tax_rates" method="get" path="/unified/accounting/companies/{id}/tax_rates" -->
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

        AccountingListCompanyTaxRatesRequest req = AccountingListCompanyTaxRatesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,company_id,remote_company_id,name,code,rate,active")
                .filter(AccountingListCompanyTaxRatesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.accounting().listCompanyTaxRates()
                .request(req)
                .callAsStream()
                .forEach((AccountingListCompanyTaxRatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingListCompanyTaxRatesRequest](../../models/operations/AccountingListCompanyTaxRatesRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingListCompanyTaxRatesResponse](../../models/operations/AccountingListCompanyTaxRatesResponse.md)**

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

## getCompanyTaxRate

Get Tax Rate

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_get_company_tax_rate" method="get" path="/unified/accounting/companies/{id}/tax_rates/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AccountingGetCompanyTaxRateRequest;
import com.stackone.stackone_client_java.models.operations.AccountingGetCompanyTaxRateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AccountingGetCompanyTaxRateRequest req = AccountingGetCompanyTaxRateRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,company_id,remote_company_id,name,code,rate,active")
                .build();

        AccountingGetCompanyTaxRateResponse res = sdk.accounting().getCompanyTaxRate()
                .request(req)
                .call();

        if (res.accountingTaxRateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingGetCompanyTaxRateRequest](../../models/operations/AccountingGetCompanyTaxRateRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingGetCompanyTaxRateResponse](../../models/operations/AccountingGetCompanyTaxRateResponse.md)**

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

## batchCreateCompanyJournals

Batch Create Journals

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_batch_create_company_journals" method="post" path="/unified/accounting/companies/{id}/journals/batch" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.AccountingJournalBatchCreateRequestDto;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AccountingBatchCreateCompanyJournalsResponse;
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

        AccountingBatchCreateCompanyJournalsResponse res = sdk.accounting().batchCreateCompanyJournals()
                .xAccountId("<id>")
                .id("<id>")
                .accountingJournalBatchCreateRequestDto(AccountingJournalBatchCreateRequestDto.builder()
                    .items(List.of())
                    .build())
                .call();

        if (res.batchResultApiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The account identifier                                                                                      |
| `id`                                                                                                        | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |
| `accountingJournalBatchCreateRequestDto`                                                                    | [AccountingJournalBatchCreateRequestDto](../../models/components/AccountingJournalBatchCreateRequestDto.md) | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[AccountingBatchCreateCompanyJournalsResponse](../../models/operations/AccountingBatchCreateCompanyJournalsResponse.md)**

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

## listCompanyJournals

List Journals

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_list_company_journals" method="get" path="/unified/accounting/companies/{id}/journals" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AccountingListCompanyJournalsRequest;
import com.stackone.stackone_client_java.models.operations.AccountingListCompanyJournalsResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AccountingListCompanyJournalsRequest req = AccountingListCompanyJournalsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,company_id,remote_company_id,reference,memo,transaction_date,status,lines,created_at,updated_at,posted_at")
                .filter(JsonNullable.of(null))
                .build();

        sdk.accounting().listCompanyJournals()
                .request(req)
                .callAsStream()
                .forEach((AccountingListCompanyJournalsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingListCompanyJournalsRequest](../../models/operations/AccountingListCompanyJournalsRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingListCompanyJournalsResponse](../../models/operations/AccountingListCompanyJournalsResponse.md)**

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

## createCompanyJournal

Create Journal

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_create_company_journal" method="post" path="/unified/accounting/companies/{id}/journals" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AccountingCreateCompanyJournalResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AccountingCreateCompanyJournalResponse res = sdk.accounting().createCompanyJournal()
                .xAccountId("<id>")
                .id("<id>")
                .accountingJournalCreateRequestDto(AccountingJournalCreateRequestDto.builder()
                    .reference("JRN-2024-001")
                    .memo("Monthly closing entries")
                    .currencyCode(CurrencyCode.builder()
                        .value(AccountingJournalCreateRequestDtoValue.USD)
                        .sourceValue(AccountingJournalCreateRequestDtoSourceValue.of("USD"))
                        .build())
                    .exchangeRate(1d)
                    .transactionDate(OffsetDateTime.parse("2024-03-20T10:00:00Z"))
                    .lines(List.of(
                        CreateJournalLine.builder()
                            .accountId("acc_123456789")
                            .description("Payment for office supplies")
                            .amount(10010d)
                            .taxRateId("tax_123456789")
                            .taxAmount(10010d)
                            .build()))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                      | *String*                                                                                          | :heavy_check_mark:                                                                                | The account identifier                                                                            |
| `id`                                                                                              | *String*                                                                                          | :heavy_check_mark:                                                                                | N/A                                                                                               |
| `accountingJournalCreateRequestDto`                                                               | [AccountingJournalCreateRequestDto](../../models/components/AccountingJournalCreateRequestDto.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |

### Response

**[AccountingCreateCompanyJournalResponse](../../models/operations/AccountingCreateCompanyJournalResponse.md)**

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

## getCompanyJournal

Get Journal

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting_get_company_journal" method="get" path="/unified/accounting/companies/{id}/journals/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AccountingGetCompanyJournalRequest;
import com.stackone.stackone_client_java.models.operations.AccountingGetCompanyJournalResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AccountingGetCompanyJournalRequest req = AccountingGetCompanyJournalRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,company_id,remote_company_id,reference,memo,transaction_date,status,lines,created_at,updated_at,posted_at")
                .build();

        AccountingGetCompanyJournalResponse res = sdk.accounting().getCompanyJournal()
                .request(req)
                .call();

        if (res.accountingJournalResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingGetCompanyJournalRequest](../../models/operations/AccountingGetCompanyJournalRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingGetCompanyJournalResponse](../../models/operations/AccountingGetCompanyJournalResponse.md)**

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