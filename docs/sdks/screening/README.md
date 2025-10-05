# Screening
(*screening()*)

## Overview

### Available Operations

* [listScreeningPackages](#listscreeningpackages) - List Screening Packages
* [getScreeningPackage](#getscreeningpackage) - Get Screening Package
* [webhookScreeningResult](#webhookscreeningresult) - Webhook Screening Result
* [createScreeningOrder](#createscreeningorder) - Create Screening Order

## listScreeningPackages

List Screening Packages

### Example Usage

<!-- UsageSnippet language="java" operationID="screening_list_screening_packages" method="get" path="/unified/screening/packages" -->
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

        ScreeningListScreeningPackagesRequest req = ScreeningListScreeningPackagesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,unified_custom_fields")
                .filter(ScreeningListScreeningPackagesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.screening().listScreeningPackages()
                .callAsStream()
                .forEach((ScreeningListScreeningPackagesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ScreeningListScreeningPackagesRequest](../../models/operations/ScreeningListScreeningPackagesRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[ScreeningListScreeningPackagesResponse](../../models/operations/ScreeningListScreeningPackagesResponse.md)**

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

## getScreeningPackage

Get Screening Package

### Example Usage

<!-- UsageSnippet language="java" operationID="screening_get_screening_package" method="get" path="/unified/screening/packages/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.ScreeningGetScreeningPackageRequest;
import com.stackone.stackone_client_java.models.operations.ScreeningGetScreeningPackageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ScreeningGetScreeningPackageRequest req = ScreeningGetScreeningPackageRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,unified_custom_fields")
                .build();

        ScreeningGetScreeningPackageResponse res = sdk.screening().getScreeningPackage()
                .request(req)
                .call();

        if (res.screeningPackageResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ScreeningGetScreeningPackageRequest](../../models/operations/ScreeningGetScreeningPackageRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ScreeningGetScreeningPackageResponse](../../models/operations/ScreeningGetScreeningPackageResponse.md)**

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

## webhookScreeningResult

Webhook Screening Result

### Example Usage

<!-- UsageSnippet language="java" operationID="screening_webhook_screening_result" method="post" path="/unified/screening/results/webhook" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.ScreeningWebhookScreeningResultResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ScreeningWebhookScreeningResultResponse res = sdk.screening().webhookScreeningResult()
                .xAccountId("<id>")
                .screeningResultWebhook(ScreeningResultWebhook.builder()
                    .event(Event.SCREENING_RESULTS_COMPLETED)
                    .data(ScreeningResult.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .unifiedCustomFields(Map.ofEntries(
                            Map.entry("my_project_custom_field_1", "REF-1236"),
                            Map.entry("my_project_custom_field_2", "some other value")))
                        .orderId("12345")
                        .score(ScreeningResultScore.builder()
                            .label("Overall Risk")
                            .value("75")
                            .min("0")
                            .max("100")
                            .build())
                        .startDate(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                        .submissionDate(OffsetDateTime.parse("2023-01-02T00:00:00Z"))
                        .summary("Background check completed successfully")
                        .status(ScreeningResultStatus.COMPLETED)
                        .resultUrl("https://example.com/results/12345")
                        .build())
                    .build())
                .call();

        if (res.screeningResultWebhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `xAccountId`                                                                | *String*                                                                    | :heavy_check_mark:                                                          | The account identifier                                                      |
| `screeningResultWebhook`                                                    | [ScreeningResultWebhook](../../models/components/ScreeningResultWebhook.md) | :heavy_check_mark:                                                          | N/A                                                                         |

### Response

**[ScreeningWebhookScreeningResultResponse](../../models/operations/ScreeningWebhookScreeningResultResponse.md)**

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

## createScreeningOrder

Create Screening Order

### Example Usage

<!-- UsageSnippet language="java" operationID="screening_create_screening_order" method="post" path="/unified/screening/orders" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.ScreeningCreateScreeningOrderResponse;
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

        ScreeningCreateScreeningOrderResponse res = sdk.screening().createScreeningOrder()
                .xAccountId("<id>")
                .screeningCreateOrderRequestDto(ScreeningCreateOrderRequestDto.builder()
                    .packageId("54321")
                    .candidate(ScreeningOrderCandidate.builder()
                        .firstName("John")
                        .lastName("Doe")
                        .email("john.doe@example.com")
                        .build())
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                | *String*                                                                                    | :heavy_check_mark:                                                                          | The account identifier                                                                      |
| `screeningCreateOrderRequestDto`                                                            | [ScreeningCreateOrderRequestDto](../../models/components/ScreeningCreateOrderRequestDto.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |

### Response

**[ScreeningCreateScreeningOrderResponse](../../models/operations/ScreeningCreateScreeningOrderResponse.md)**

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