# Marketing
(*marketing()*)

## Overview

### Available Operations

* [listEmailTemplates](#listemailtemplates) - List Email Templates
* [createEmailTemplate](#createemailtemplate) - Create Email Templates
* [getEmailTemplate](#getemailtemplate) - Get Email Templates
* [updateEmailTemplate](#updateemailtemplate) - Update Email Templates
* [listInAppTemplates](#listinapptemplates) - List In-App Templates
* [createInAppTemplate](#createinapptemplate) - Create In-App Template
* [getInAppTemplate](#getinapptemplate) - Get In-App Template
* [updateInAppTemplate](#updateinapptemplate) - Update In-App Template
* [listSmsTemplates](#listsmstemplates) - List SMS Templates
* [createSmsTemplate](#createsmstemplate) - Create SMS Template
* [getSmsTemplate](#getsmstemplate) - Get SMS Template
* [updateSmsTemplate](#updatesmstemplate) - Update SMS Template
* [~~listOmniChannelTemplates~~](#listomnichanneltemplates) - List Omni-Channel Templates :warning: **Deprecated**
* [~~createOmniChannelTemplate~~](#createomnichanneltemplate) - Create Omni-Channel Template :warning: **Deprecated**
* [~~getOmniChannelTemplate~~](#getomnichanneltemplate) - Get Omni-Channel Template :warning: **Deprecated**
* [~~updateOmniChannelTemplate~~](#updateomnichanneltemplate) - Update Omni-Channel Template :warning: **Deprecated**
* [listPushTemplates](#listpushtemplates) - List Push Templates
* [createPushTemplate](#createpushtemplate) - Create Push Template
* [getPushTemplate](#getpushtemplate) - Get Push Template
* [updatePushTemplate](#updatepushtemplate) - Update Push Template
* [listCampaigns](#listcampaigns) - List campaigns
* [getCampaign](#getcampaign) - Get campaign
* [listContentBlocks](#listcontentblocks) - List Content Blocks
* [createContentBlock](#createcontentblock) - Create Content Block
* [getContentBlock](#getcontentblock) - Get Content Blocks
* [updateContentBlock](#updatecontentblock) - Update Content Block

## listEmailTemplates

List Email Templates

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_list_email_templates" method="get" path="/unified/marketing/templates/email" -->
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

        MarketingListEmailTemplatesRequest req = MarketingListEmailTemplatesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .filter(MarketingListEmailTemplatesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.marketing().listEmailTemplates()
                .callAsStream()
                .forEach((MarketingListEmailTemplatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [MarketingListEmailTemplatesRequest](../../models/operations/MarketingListEmailTemplatesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[MarketingListEmailTemplatesResponse](../../models/operations/MarketingListEmailTemplatesResponse.md)**

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

## createEmailTemplate

Create Email Templates

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_create_email_template" method="post" path="/unified/marketing/templates/email" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingCreateEmailTemplateResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        MarketingCreateEmailTemplateResponse res = sdk.marketing().createEmailTemplate()
                .xAccountId("<id>")
                .marketingCreateEmailTemplateRequestDto(MarketingCreateEmailTemplateRequestDto.builder()
                    .messages(List.of(
                        EmailMessages.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(JsonNullable.of(null))
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The account identifier                                                                                      |
| `marketingCreateEmailTemplateRequestDto`                                                                    | [MarketingCreateEmailTemplateRequestDto](../../models/components/MarketingCreateEmailTemplateRequestDto.md) | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[MarketingCreateEmailTemplateResponse](../../models/operations/MarketingCreateEmailTemplateResponse.md)**

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

## getEmailTemplate

Get Email Templates

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_get_email_template" method="get" path="/unified/marketing/templates/email/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingGetEmailTemplateRequest;
import com.stackone.stackone_client_java.models.operations.MarketingGetEmailTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        MarketingGetEmailTemplateRequest req = MarketingGetEmailTemplateRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .build();

        MarketingGetEmailTemplateResponse res = sdk.marketing().getEmailTemplate()
                .request(req)
                .call();

        if (res.emailTemplateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [MarketingGetEmailTemplateRequest](../../models/operations/MarketingGetEmailTemplateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[MarketingGetEmailTemplateResponse](../../models/operations/MarketingGetEmailTemplateResponse.md)**

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

## updateEmailTemplate

Update Email Templates

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_update_email_template" method="patch" path="/unified/marketing/templates/email/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingUpdateEmailTemplateResponse;
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

        MarketingUpdateEmailTemplateResponse res = sdk.marketing().updateEmailTemplate()
                .xAccountId("<id>")
                .id("<id>")
                .marketingCreateEmailTemplateRequestDto(MarketingCreateEmailTemplateRequestDto.builder()
                    .messages(List.of(
                        EmailMessages.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(MessageType.builder()
                                .value(EmailMessagesValue.EMAIL)
                                .sourceValue(EmailMessagesSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
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
| `marketingCreateEmailTemplateRequestDto`                                                                    | [MarketingCreateEmailTemplateRequestDto](../../models/components/MarketingCreateEmailTemplateRequestDto.md) | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[MarketingUpdateEmailTemplateResponse](../../models/operations/MarketingUpdateEmailTemplateResponse.md)**

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

## listInAppTemplates

List In-App Templates

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_list_in_app_templates" method="get" path="/unified/marketing/templates/in_app" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingListInAppTemplatesRequest;
import com.stackone.stackone_client_java.models.operations.MarketingListInAppTemplatesResponse;
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

        MarketingListInAppTemplatesRequest req = MarketingListInAppTemplatesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .filter(JsonNullable.of(null))
                .build();


        sdk.marketing().listInAppTemplates()
                .callAsStream()
                .forEach((MarketingListInAppTemplatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [MarketingListInAppTemplatesRequest](../../models/operations/MarketingListInAppTemplatesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[MarketingListInAppTemplatesResponse](../../models/operations/MarketingListInAppTemplatesResponse.md)**

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

## createInAppTemplate

Create In-App Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_create_in_app_template" method="post" path="/unified/marketing/templates/in_app" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingCreateInAppTemplateResponse;
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

        MarketingCreateInAppTemplateResponse res = sdk.marketing().createInAppTemplate()
                .xAccountId("<id>")
                .marketingCreateInAppTemplateRequestDto(MarketingCreateInAppTemplateRequestDto.builder()
                    .messages(List.of(
                        InAppMessages.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(InAppMessagesMessageType.builder()
                                .value(InAppMessagesValue.EMAIL)
                                .sourceValue(InAppMessagesSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The account identifier                                                                                      |
| `marketingCreateInAppTemplateRequestDto`                                                                    | [MarketingCreateInAppTemplateRequestDto](../../models/components/MarketingCreateInAppTemplateRequestDto.md) | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[MarketingCreateInAppTemplateResponse](../../models/operations/MarketingCreateInAppTemplateResponse.md)**

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

## getInAppTemplate

Get In-App Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_get_in_app_template" method="get" path="/unified/marketing/templates/in_app/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingGetInAppTemplateRequest;
import com.stackone.stackone_client_java.models.operations.MarketingGetInAppTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        MarketingGetInAppTemplateRequest req = MarketingGetInAppTemplateRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .build();

        MarketingGetInAppTemplateResponse res = sdk.marketing().getInAppTemplate()
                .request(req)
                .call();

        if (res.inAppTemplateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [MarketingGetInAppTemplateRequest](../../models/operations/MarketingGetInAppTemplateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[MarketingGetInAppTemplateResponse](../../models/operations/MarketingGetInAppTemplateResponse.md)**

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

## updateInAppTemplate

Update In-App Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_update_in_app_template" method="patch" path="/unified/marketing/templates/in_app/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingUpdateInAppTemplateResponse;
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

        MarketingUpdateInAppTemplateResponse res = sdk.marketing().updateInAppTemplate()
                .xAccountId("<id>")
                .id("<id>")
                .marketingCreateInAppTemplateRequestDto(MarketingCreateInAppTemplateRequestDto.builder()
                    .messages(List.of(
                        InAppMessages.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(InAppMessagesMessageType.builder()
                                .value(InAppMessagesValue.EMAIL)
                                .sourceValue(InAppMessagesSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
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
| `marketingCreateInAppTemplateRequestDto`                                                                    | [MarketingCreateInAppTemplateRequestDto](../../models/components/MarketingCreateInAppTemplateRequestDto.md) | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[MarketingUpdateInAppTemplateResponse](../../models/operations/MarketingUpdateInAppTemplateResponse.md)**

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

## listSmsTemplates

List SMS Templates

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_list_sms_templates" method="get" path="/unified/marketing/templates/sms" -->
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

        MarketingListSmsTemplatesRequest req = MarketingListSmsTemplatesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .filter(MarketingListSmsTemplatesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.marketing().listSmsTemplates()
                .callAsStream()
                .forEach((MarketingListSmsTemplatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [MarketingListSmsTemplatesRequest](../../models/operations/MarketingListSmsTemplatesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[MarketingListSmsTemplatesResponse](../../models/operations/MarketingListSmsTemplatesResponse.md)**

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

## createSmsTemplate

Create SMS Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_create_sms_template" method="post" path="/unified/marketing/templates/sms" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingCreateSmsTemplateResponse;
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

        MarketingCreateSmsTemplateResponse res = sdk.marketing().createSmsTemplate()
                .xAccountId("<id>")
                .marketingCreateSmsTemplateRequestDto(MarketingCreateSmsTemplateRequestDto.builder()
                    .messages(List.of(
                        SmsMessages.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(SmsMessagesMessageType.builder()
                                .value(SmsMessagesValue.EMAIL)
                                .sourceValue(SmsMessagesSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                            | *String*                                                                                                | :heavy_check_mark:                                                                                      | The account identifier                                                                                  |
| `marketingCreateSmsTemplateRequestDto`                                                                  | [MarketingCreateSmsTemplateRequestDto](../../models/components/MarketingCreateSmsTemplateRequestDto.md) | :heavy_check_mark:                                                                                      | N/A                                                                                                     |

### Response

**[MarketingCreateSmsTemplateResponse](../../models/operations/MarketingCreateSmsTemplateResponse.md)**

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

## getSmsTemplate

Get SMS Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_get_sms_template" method="get" path="/unified/marketing/templates/sms/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingGetSmsTemplateRequest;
import com.stackone.stackone_client_java.models.operations.MarketingGetSmsTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        MarketingGetSmsTemplateRequest req = MarketingGetSmsTemplateRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .build();

        MarketingGetSmsTemplateResponse res = sdk.marketing().getSmsTemplate()
                .request(req)
                .call();

        if (res.smsTemplateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [MarketingGetSmsTemplateRequest](../../models/operations/MarketingGetSmsTemplateRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[MarketingGetSmsTemplateResponse](../../models/operations/MarketingGetSmsTemplateResponse.md)**

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

## updateSmsTemplate

Update SMS Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_update_sms_template" method="patch" path="/unified/marketing/templates/sms/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingUpdateSmsTemplateResponse;
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

        MarketingUpdateSmsTemplateResponse res = sdk.marketing().updateSmsTemplate()
                .xAccountId("<id>")
                .id("<id>")
                .marketingCreateSmsTemplateRequestDto(MarketingCreateSmsTemplateRequestDto.builder()
                    .messages(List.of(
                        SmsMessages.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(SmsMessagesMessageType.builder()
                                .value(SmsMessagesValue.EMAIL)
                                .sourceValue(SmsMessagesSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                            | *String*                                                                                                | :heavy_check_mark:                                                                                      | The account identifier                                                                                  |
| `id`                                                                                                    | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |
| `marketingCreateSmsTemplateRequestDto`                                                                  | [MarketingCreateSmsTemplateRequestDto](../../models/components/MarketingCreateSmsTemplateRequestDto.md) | :heavy_check_mark:                                                                                      | N/A                                                                                                     |

### Response

**[MarketingUpdateSmsTemplateResponse](../../models/operations/MarketingUpdateSmsTemplateResponse.md)**

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

## ~~listOmniChannelTemplates~~

List Omni-Channel Templates

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_list_omni_channel_templates" method="get" path="/unified/marketing/templates/omni_channel" -->
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

        MarketingListOmniChannelTemplatesRequest req = MarketingListOmniChannelTemplatesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .filter(MarketingListOmniChannelTemplatesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.marketing().listOmniChannelTemplates()
                .callAsStream()
                .forEach((MarketingListOmniChannelTemplatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [MarketingListOmniChannelTemplatesRequest](../../models/operations/MarketingListOmniChannelTemplatesRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[MarketingListOmniChannelTemplatesResponse](../../models/operations/MarketingListOmniChannelTemplatesResponse.md)**

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

## ~~createOmniChannelTemplate~~

Create Omni-Channel Template

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_create_omni_channel_template" method="post" path="/unified/marketing/templates/omni_channel" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingCreateOmniChannelTemplateResponse;
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

        MarketingCreateOmniChannelTemplateResponse res = sdk.marketing().createOmniChannelTemplate()
                .xAccountId("<id>")
                .marketingCreateTemplateRequestDto(MarketingCreateTemplateRequestDto.builder()
                    .messages(List.of(
                        CreateMessage.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(CreateMessageMessageType.builder()
                                .value(CreateMessageValue.EMAIL)
                                .sourceValue(CreateMessageSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
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
| `marketingCreateTemplateRequestDto`                                                               | [MarketingCreateTemplateRequestDto](../../models/components/MarketingCreateTemplateRequestDto.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |

### Response

**[MarketingCreateOmniChannelTemplateResponse](../../models/operations/MarketingCreateOmniChannelTemplateResponse.md)**

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

## ~~getOmniChannelTemplate~~

Get Omni-Channel Template

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_get_omni_channel_template" method="get" path="/unified/marketing/templates/omni_channel/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingGetOmniChannelTemplateRequest;
import com.stackone.stackone_client_java.models.operations.MarketingGetOmniChannelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        MarketingGetOmniChannelTemplateRequest req = MarketingGetOmniChannelTemplateRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .build();

        MarketingGetOmniChannelTemplateResponse res = sdk.marketing().getOmniChannelTemplate()
                .request(req)
                .call();

        if (res.templateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [MarketingGetOmniChannelTemplateRequest](../../models/operations/MarketingGetOmniChannelTemplateRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[MarketingGetOmniChannelTemplateResponse](../../models/operations/MarketingGetOmniChannelTemplateResponse.md)**

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

## ~~updateOmniChannelTemplate~~

Update Omni-Channel Template

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_update_omni_channel_template" method="patch" path="/unified/marketing/templates/omni_channel/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingUpdateOmniChannelTemplateResponse;
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

        MarketingUpdateOmniChannelTemplateResponse res = sdk.marketing().updateOmniChannelTemplate()
                .xAccountId("<id>")
                .id("<id>")
                .marketingCreateTemplateRequestDto(MarketingCreateTemplateRequestDto.builder()
                    .messages(List.of(
                        CreateMessage.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(CreateMessageMessageType.builder()
                                .value(CreateMessageValue.EMAIL)
                                .sourceValue(CreateMessageSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
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
| `marketingCreateTemplateRequestDto`                                                               | [MarketingCreateTemplateRequestDto](../../models/components/MarketingCreateTemplateRequestDto.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |

### Response

**[MarketingUpdateOmniChannelTemplateResponse](../../models/operations/MarketingUpdateOmniChannelTemplateResponse.md)**

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

## listPushTemplates

List Push Templates

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_list_push_templates" method="get" path="/unified/marketing/templates/push" -->
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

        MarketingListPushTemplatesRequest req = MarketingListPushTemplatesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .filter(MarketingListPushTemplatesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.marketing().listPushTemplates()
                .callAsStream()
                .forEach((MarketingListPushTemplatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [MarketingListPushTemplatesRequest](../../models/operations/MarketingListPushTemplatesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[MarketingListPushTemplatesResponse](../../models/operations/MarketingListPushTemplatesResponse.md)**

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

## createPushTemplate

Create Push Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_create_push_template" method="post" path="/unified/marketing/templates/push" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingCreatePushTemplateResponse;
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

        MarketingCreatePushTemplateResponse res = sdk.marketing().createPushTemplate()
                .xAccountId("<id>")
                .marketingCreatePushTemplateRequestDto(MarketingCreatePushTemplateRequestDto.builder()
                    .messages(List.of(
                        PushMessages.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(PushMessagesMessageType.builder()
                                .value(PushMessagesValue.EMAIL)
                                .sourceValue(PushMessagesSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                              | *String*                                                                                                  | :heavy_check_mark:                                                                                        | The account identifier                                                                                    |
| `marketingCreatePushTemplateRequestDto`                                                                   | [MarketingCreatePushTemplateRequestDto](../../models/components/MarketingCreatePushTemplateRequestDto.md) | :heavy_check_mark:                                                                                        | N/A                                                                                                       |

### Response

**[MarketingCreatePushTemplateResponse](../../models/operations/MarketingCreatePushTemplateResponse.md)**

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

## getPushTemplate

Get Push Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_get_push_template" method="get" path="/unified/marketing/templates/push/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingGetPushTemplateRequest;
import com.stackone.stackone_client_java.models.operations.MarketingGetPushTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        MarketingGetPushTemplateRequest req = MarketingGetPushTemplateRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,messages,created_at,updated_at,tags")
                .build();

        MarketingGetPushTemplateResponse res = sdk.marketing().getPushTemplate()
                .request(req)
                .call();

        if (res.pushTemplateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [MarketingGetPushTemplateRequest](../../models/operations/MarketingGetPushTemplateRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[MarketingGetPushTemplateResponse](../../models/operations/MarketingGetPushTemplateResponse.md)**

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

## updatePushTemplate

Update Push Template

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_update_push_template" method="patch" path="/unified/marketing/templates/push/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingUpdatePushTemplateResponse;
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

        MarketingUpdatePushTemplateResponse res = sdk.marketing().updatePushTemplate()
                .xAccountId("<id>")
                .id("<id>")
                .marketingCreatePushTemplateRequestDto(MarketingCreatePushTemplateRequestDto.builder()
                    .messages(List.of(
                        PushMessages.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .messageType(PushMessagesMessageType.builder()
                                .value(PushMessagesValue.EMAIL)
                                .sourceValue(PushMessagesSourceValue.of("Email"))
                                .build())
                            .build()))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                              | *String*                                                                                                  | :heavy_check_mark:                                                                                        | The account identifier                                                                                    |
| `id`                                                                                                      | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |
| `marketingCreatePushTemplateRequestDto`                                                                   | [MarketingCreatePushTemplateRequestDto](../../models/components/MarketingCreatePushTemplateRequestDto.md) | :heavy_check_mark:                                                                                        | N/A                                                                                                       |

### Response

**[MarketingUpdatePushTemplateResponse](../../models/operations/MarketingUpdatePushTemplateResponse.md)**

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

## listCampaigns

List campaigns

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_list_campaigns" method="get" path="/unified/marketing/campaigns" -->
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

        MarketingListCampaignsRequest req = MarketingListCampaignsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,created_at,updated_at,description,schedule_type,status,channels,first_sent_at,last_sent_at,tags,messages")
                .filter(MarketingListCampaignsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.marketing().listCampaigns()
                .callAsStream()
                .forEach((MarketingListCampaignsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [MarketingListCampaignsRequest](../../models/operations/MarketingListCampaignsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[MarketingListCampaignsResponse](../../models/operations/MarketingListCampaignsResponse.md)**

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

## getCampaign

Get campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_get_campaign" method="get" path="/unified/marketing/campaigns/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingGetCampaignRequest;
import com.stackone.stackone_client_java.models.operations.MarketingGetCampaignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        MarketingGetCampaignRequest req = MarketingGetCampaignRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,created_at,updated_at,description,schedule_type,status,channels,first_sent_at,last_sent_at,tags,messages")
                .build();

        MarketingGetCampaignResponse res = sdk.marketing().getCampaign()
                .request(req)
                .call();

        if (res.campaignResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [MarketingGetCampaignRequest](../../models/operations/MarketingGetCampaignRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[MarketingGetCampaignResponse](../../models/operations/MarketingGetCampaignResponse.md)**

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

## listContentBlocks

List Content Blocks

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_list_content_blocks" method="get" path="/unified/marketing/content_blocks" -->
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

        MarketingListContentBlocksRequest req = MarketingListContentBlocksRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,type,content,status,tags,created_at,updated_at")
                .filter(MarketingListContentBlocksQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.marketing().listContentBlocks()
                .callAsStream()
                .forEach((MarketingListContentBlocksResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [MarketingListContentBlocksRequest](../../models/operations/MarketingListContentBlocksRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[MarketingListContentBlocksResponse](../../models/operations/MarketingListContentBlocksResponse.md)**

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

## createContentBlock

Create Content Block

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_create_content_block" method="post" path="/unified/marketing/content_blocks" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingCreateContentBlockResponse;
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

        MarketingCreateContentBlockResponse res = sdk.marketing().createContentBlock()
                .xAccountId("<id>")
                .marketingCreateContentBlocksRequestDto(MarketingCreateContentBlocksRequestDto.builder()
                    .type(MarketingCreateContentBlocksRequestDtoType.builder()
                        .value(MarketingCreateContentBlocksRequestDtoValue.HTML)
                        .sourceValue(MarketingCreateContentBlocksRequestDtoSourceValue.of("text"))
                        .build())
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The account identifier                                                                                      |
| `marketingCreateContentBlocksRequestDto`                                                                    | [MarketingCreateContentBlocksRequestDto](../../models/components/MarketingCreateContentBlocksRequestDto.md) | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[MarketingCreateContentBlockResponse](../../models/operations/MarketingCreateContentBlockResponse.md)**

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

## getContentBlock

Get Content Blocks

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_get_content_block" method="get" path="/unified/marketing/content_blocks/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingGetContentBlockRequest;
import com.stackone.stackone_client_java.models.operations.MarketingGetContentBlockResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        MarketingGetContentBlockRequest req = MarketingGetContentBlockRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,type,content,status,tags,created_at,updated_at")
                .build();

        MarketingGetContentBlockResponse res = sdk.marketing().getContentBlock()
                .request(req)
                .call();

        if (res.contentBlockResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [MarketingGetContentBlockRequest](../../models/operations/MarketingGetContentBlockRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[MarketingGetContentBlockResponse](../../models/operations/MarketingGetContentBlockResponse.md)**

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

## updateContentBlock

Update Content Block

### Example Usage

<!-- UsageSnippet language="java" operationID="marketing_update_content_block" method="patch" path="/unified/marketing/content_blocks/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.MarketingUpdateContentBlockResponse;
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

        MarketingUpdateContentBlockResponse res = sdk.marketing().updateContentBlock()
                .xAccountId("<id>")
                .id("<id>")
                .marketingCreateContentBlocksRequestDto(MarketingCreateContentBlocksRequestDto.builder()
                    .type(MarketingCreateContentBlocksRequestDtoType.builder()
                        .value(MarketingCreateContentBlocksRequestDtoValue.HTML)
                        .sourceValue(MarketingCreateContentBlocksRequestDtoSourceValue.of("text"))
                        .build())
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
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
| `marketingCreateContentBlocksRequestDto`                                                                    | [MarketingCreateContentBlocksRequestDto](../../models/components/MarketingCreateContentBlocksRequestDto.md) | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[MarketingUpdateContentBlockResponse](../../models/operations/MarketingUpdateContentBlockResponse.md)**

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