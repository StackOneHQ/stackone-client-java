# Ticketing

## Overview

### Available Operations

* [listTickets](#listtickets) - List Tickets
* [createTicket](#createticket) - Create Ticket
* [getTicket](#getticket) - Get Ticket
* [updateTicket](#updateticket) - Update Ticket
* [listUsers](#listusers) - List Users
* [getUser](#getuser) - Get User
* [listComments](#listcomments) - List Comments
* [getComment](#getcomment) - Get Comment
* [downloadTicketingAttachment](#downloadticketingattachment) - Download Attachment
* [listAttachments](#listattachments) - List Attachments
* [getAttachment](#getattachment) - Get Attachment
* [listTicketTypes](#listtickettypes) - List Ticket Types
* [getTicketType](#gettickettype) - Get Ticket Type
* [listProjects](#listprojects) - List Projects
* [getProject](#getproject) - Get Project
* [listProjectComponents](#listprojectcomponents) - List Project Components
* [getProjectComponent](#getprojectcomponent) - Get Project Component
* [listProjectTicketTypes](#listprojecttickettypes) - List Project Ticket Types
* [listTicketStatuses](#listticketstatuses) - List Ticket Statuses

## listTickets

Retrieve a paginated list of tickets.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_tickets" method="get" path="/unified/ticketing/tickets" -->
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

        TicketingListTicketsRequest req = TicketingListTicketsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,type,ticket_number,title,creator_id,remote_creator_id,reporters,assignees,content,parent_id,remote_parent_id,closed_at,ticket_url,status,priority,tags,projects,components,organization,created_at,updated_at,unified_custom_fields")
                .filter(TicketingListTicketsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listTickets()
                .callAsStream()
                .forEach((TicketingListTicketsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [TicketingListTicketsRequest](../../models/operations/TicketingListTicketsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[TicketingListTicketsResponse](../../models/operations/TicketingListTicketsResponse.md)**

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

## createTicket

Create a new ticket record.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_create_ticket" method="post" path="/unified/ticketing/tickets" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingCreateTicketResponse;
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

        TicketingCreateTicketResponse res = sdk.ticketing().createTicket()
                .xAccountId("<id>")
                .prefer("heartbeat")
                .ticketingTicketCreateRequestDto(TicketingTicketCreateRequestDto.builder()
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .title("System outage in production environment")
                    .creatorId("user-001")
                    .reporters(List.of(
                        "user-001",
                        "user-002"))
                    .assignees(List.of(
                        "user-001",
                        "user-002"))
                    .content(List.of(
                        TicketingContent.builder()
                            .plain("This is some content")
                            .html("<p>This is some content</p>")
                            .build()))
                    .parentId("ticket-002")
                    .priority(TicketingTicketCreateRequestDtoPriority.builder()
                        .id("001")
                        .value(TicketingTicketCreateRequestDtoValue.MEDIUM)
                        .sourceValue(TicketingTicketCreateRequestDtoSourceValue.of("Normal"))
                        .build())
                    .tags(List.of(
                        "tag-001",
                        "tag-002"))
                    .organizationId("organization-001")
                    .projectId("project-001")
                    .componentIds("[\"component-001\",\"component-002\"]")
                    .type("ticket-type-001")
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              | Example                                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `xAccountId`                                                                                                                                                             | *String*                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                       | The account identifier                                                                                                                                                   |                                                                                                                                                                          |
| `prefer`                                                                                                                                                                 | *Optional\<String>*                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                       | Set to "heartbeat" to enable keep-alive newline heartbeats during long-running requests. Response includes Preference-Applied: heartbeat header when honored. (RFC 7240) | heartbeat                                                                                                                                                                |
| `ticketingTicketCreateRequestDto`                                                                                                                                        | [TicketingTicketCreateRequestDto](../../models/components/TicketingTicketCreateRequestDto.md)                                                                            | :heavy_check_mark:                                                                                                                                                       | N/A                                                                                                                                                                      |                                                                                                                                                                          |

### Response

**[TicketingCreateTicketResponse](../../models/operations/TicketingCreateTicketResponse.md)**

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

## getTicket

Retrieve a single ticket by its identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_get_ticket" method="get" path="/unified/ticketing/tickets/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingGetTicketRequest;
import com.stackone.stackone_client_java.models.operations.TicketingGetTicketResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        TicketingGetTicketRequest req = TicketingGetTicketRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,type,ticket_number,title,creator_id,remote_creator_id,reporters,assignees,content,parent_id,remote_parent_id,closed_at,ticket_url,status,priority,tags,projects,components,organization,created_at,updated_at,unified_custom_fields")
                .prefer("heartbeat")
                .build();

        TicketingGetTicketResponse res = sdk.ticketing().getTicket()
                .request(req)
                .call();

        if (res.ticketingTicketResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [TicketingGetTicketRequest](../../models/operations/TicketingGetTicketRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[TicketingGetTicketResponse](../../models/operations/TicketingGetTicketResponse.md)**

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

## updateTicket

Update an existing ticket record by its identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_update_ticket" method="patch" path="/unified/ticketing/tickets/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingUpdateTicketResponse;
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

        TicketingUpdateTicketResponse res = sdk.ticketing().updateTicket()
                .xAccountId("<id>")
                .id("<id>")
                .prefer("heartbeat")
                .ticketingTicketUpdateRequestDto(TicketingTicketUpdateRequestDto.builder()
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .title("System outage in production environment")
                    .reporters(List.of(
                        "user-001",
                        "user-002"))
                    .assignees(List.of(
                        "user-001",
                        "user-002"))
                    .content(List.of(
                        TicketingContent.builder()
                            .plain("This is some content")
                            .html("<p>This is some content</p>")
                            .build()))
                    .parentId("ticket-002")
                    .priority(TicketingTicketUpdateRequestDtoPriority.builder()
                        .id("001")
                        .value(TicketingTicketUpdateRequestDtoValue.MEDIUM)
                        .sourceValue(TicketingTicketUpdateRequestDtoSourceValue.of("Normal"))
                        .build())
                    .tags(List.of(
                        "tag-001",
                        "tag-002"))
                    .projectId("project-001")
                    .componentIds("[\"component-001\",\"component-002\"]")
                    .status(TicketingTicketUpdateRequestDtoStatus.builder()
                        .id("001")
                        .type(TicketingTicketUpdateRequestDtoType.builder()
                            .value(TicketingTicketUpdateRequestDtoStatusValue.TO_DO)
                            .sourceValue(TicketingTicketUpdateRequestDtoStatusSourceValue.of("New"))
                            .build())
                        .name("Backlog")
                        .build())
                    .build())
                .call();

        if (res.updateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              | Example                                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `xAccountId`                                                                                                                                                             | *String*                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                       | The account identifier                                                                                                                                                   |                                                                                                                                                                          |
| `id`                                                                                                                                                                     | *String*                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                       | N/A                                                                                                                                                                      |                                                                                                                                                                          |
| `prefer`                                                                                                                                                                 | *Optional\<String>*                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                       | Set to "heartbeat" to enable keep-alive newline heartbeats during long-running requests. Response includes Preference-Applied: heartbeat header when honored. (RFC 7240) | heartbeat                                                                                                                                                                |
| `ticketingTicketUpdateRequestDto`                                                                                                                                        | [TicketingTicketUpdateRequestDto](../../models/components/TicketingTicketUpdateRequestDto.md)                                                                            | :heavy_check_mark:                                                                                                                                                       | N/A                                                                                                                                                                      |                                                                                                                                                                          |

### Response

**[TicketingUpdateTicketResponse](../../models/operations/TicketingUpdateTicketResponse.md)**

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

## listUsers

Retrieve a paginated list of users.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_users" method="get" path="/unified/ticketing/users" -->
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

        TicketingListUsersRequest req = TicketingListUsersRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,type,name,primary_email,primary_phone,username,active,first_name,last_name,customer_account_reference,created_at,updated_at,unified_custom_fields")
                .filter(TicketingListUsersQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listUsers()
                .callAsStream()
                .forEach((TicketingListUsersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [TicketingListUsersRequest](../../models/operations/TicketingListUsersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[TicketingListUsersResponse](../../models/operations/TicketingListUsersResponse.md)**

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

## getUser

Retrieve a single user by their identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_get_user" method="get" path="/unified/ticketing/users/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingGetUserRequest;
import com.stackone.stackone_client_java.models.operations.TicketingGetUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        TicketingGetUserRequest req = TicketingGetUserRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,type,name,primary_email,primary_phone,username,active,first_name,last_name,customer_account_reference,created_at,updated_at,unified_custom_fields")
                .prefer("heartbeat")
                .build();

        TicketingGetUserResponse res = sdk.ticketing().getUser()
                .request(req)
                .call();

        if (res.ticketingUserResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [TicketingGetUserRequest](../../models/operations/TicketingGetUserRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[TicketingGetUserResponse](../../models/operations/TicketingGetUserResponse.md)**

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

## listComments

Retrieve a paginated list of comments for a ticket.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_comments" method="get" path="/unified/ticketing/tickets/{id}/comments" -->
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

        TicketingListCommentsRequest req = TicketingListCommentsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,ticket_id,remote_ticket_id,content,user_id,remote_user_id,internal,created_at,updated_at,unified_custom_fields")
                .filter(TicketingListCommentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listComments()
                .callAsStream()
                .forEach((TicketingListCommentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [TicketingListCommentsRequest](../../models/operations/TicketingListCommentsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[TicketingListCommentsResponse](../../models/operations/TicketingListCommentsResponse.md)**

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

## getComment

Retrieve a single comment by its identifier for a ticket.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_get_comment" method="get" path="/unified/ticketing/tickets/{id}/comments/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingGetCommentRequest;
import com.stackone.stackone_client_java.models.operations.TicketingGetCommentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        TicketingGetCommentRequest req = TicketingGetCommentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,ticket_id,remote_ticket_id,content,user_id,remote_user_id,internal,created_at,updated_at,unified_custom_fields")
                .prefer("heartbeat")
                .build();

        TicketingGetCommentResponse res = sdk.ticketing().getComment()
                .request(req)
                .call();

        if (res.ticketingCommentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [TicketingGetCommentRequest](../../models/operations/TicketingGetCommentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[TicketingGetCommentResponse](../../models/operations/TicketingGetCommentResponse.md)**

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

## downloadTicketingAttachment

Download the attachment file from a ticket.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_download_ticketing_attachment" method="get" path="/unified/ticketing/tickets/{id}/attachments/{subResourceId}/download" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingDownloadTicketingAttachmentRequest;
import com.stackone.stackone_client_java.models.operations.TicketingDownloadTicketingAttachmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        TicketingDownloadTicketingAttachmentRequest req = TicketingDownloadTicketingAttachmentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .format("base64")
                .exportFormat("text/plain")
                .prefer("heartbeat")
                .build();

        TicketingDownloadTicketingAttachmentResponse res = sdk.ticketing().downloadTicketingAttachment()
                .request(req)
                .call();

        if (res.body().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [TicketingDownloadTicketingAttachmentRequest](../../models/operations/TicketingDownloadTicketingAttachmentRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[TicketingDownloadTicketingAttachmentResponse](../../models/operations/TicketingDownloadTicketingAttachmentResponse.md)**

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

## listAttachments

Retrieve a paginated list of attachment details for a ticket.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_attachments" method="get" path="/unified/ticketing/tickets/{id}/attachments" -->
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

        TicketingListAttachmentsRequest req = TicketingListAttachmentsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,ticket_id,remote_ticket_id,user_id,remote_user_id,file_name,file_format,file_url,size,created_at,updated_at,unified_custom_fields")
                .filter(TicketingListAttachmentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listAttachments()
                .callAsStream()
                .forEach((TicketingListAttachmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [TicketingListAttachmentsRequest](../../models/operations/TicketingListAttachmentsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[TicketingListAttachmentsResponse](../../models/operations/TicketingListAttachmentsResponse.md)**

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

## getAttachment

Retrieve the details of a single attachment for a ticket.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_get_attachment" method="get" path="/unified/ticketing/tickets/{id}/attachments/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingGetAttachmentRequest;
import com.stackone.stackone_client_java.models.operations.TicketingGetAttachmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        TicketingGetAttachmentRequest req = TicketingGetAttachmentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,ticket_id,remote_ticket_id,user_id,remote_user_id,file_name,file_format,file_url,size,created_at,updated_at,unified_custom_fields")
                .prefer("heartbeat")
                .build();

        TicketingGetAttachmentResponse res = sdk.ticketing().getAttachment()
                .request(req)
                .call();

        if (res.ticketingAttachmentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [TicketingGetAttachmentRequest](../../models/operations/TicketingGetAttachmentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[TicketingGetAttachmentResponse](../../models/operations/TicketingGetAttachmentResponse.md)**

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

## listTicketTypes

Retrieve a paginated list of all ticket types.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_ticket_types" method="get" path="/unified/ticketing/ticket_types" -->
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

        TicketingListTicketTypesRequest req = TicketingListTicketTypesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,project_id,remote_project_id,unified_custom_fields")
                .filter(TicketingListTicketTypesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listTicketTypes()
                .callAsStream()
                .forEach((TicketingListTicketTypesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [TicketingListTicketTypesRequest](../../models/operations/TicketingListTicketTypesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[TicketingListTicketTypesResponse](../../models/operations/TicketingListTicketTypesResponse.md)**

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

## getTicketType

Retrieve a single ticket type by its identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_get_ticket_type" method="get" path="/unified/ticketing/ticket_types/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingGetTicketTypeRequest;
import com.stackone.stackone_client_java.models.operations.TicketingGetTicketTypeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        TicketingGetTicketTypeRequest req = TicketingGetTicketTypeRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,project_id,remote_project_id,unified_custom_fields")
                .prefer("heartbeat")
                .build();

        TicketingGetTicketTypeResponse res = sdk.ticketing().getTicketType()
                .request(req)
                .call();

        if (res.ticketingTicketTypeResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [TicketingGetTicketTypeRequest](../../models/operations/TicketingGetTicketTypeRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[TicketingGetTicketTypeResponse](../../models/operations/TicketingGetTicketTypeResponse.md)**

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

## listProjects

Retrieve a paginated list of projects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_projects" method="get" path="/unified/ticketing/projects" -->
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

        TicketingListProjectsRequest req = TicketingListProjectsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,organization_id,remote_organization_id,name,description,created_at,updated_at,unified_custom_fields")
                .filter(TicketingListProjectsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listProjects()
                .callAsStream()
                .forEach((TicketingListProjectsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [TicketingListProjectsRequest](../../models/operations/TicketingListProjectsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[TicketingListProjectsResponse](../../models/operations/TicketingListProjectsResponse.md)**

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

## getProject

Retrieve a single project by its identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_get_project" method="get" path="/unified/ticketing/projects/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingGetProjectRequest;
import com.stackone.stackone_client_java.models.operations.TicketingGetProjectResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        TicketingGetProjectRequest req = TicketingGetProjectRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,organization_id,remote_organization_id,name,description,created_at,updated_at,unified_custom_fields")
                .prefer("heartbeat")
                .build();

        TicketingGetProjectResponse res = sdk.ticketing().getProject()
                .request(req)
                .call();

        if (res.ticketingProjectResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [TicketingGetProjectRequest](../../models/operations/TicketingGetProjectRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[TicketingGetProjectResponse](../../models/operations/TicketingGetProjectResponse.md)**

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

## listProjectComponents

Retrieve a paginated list of project components.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_project_components" method="get" path="/unified/ticketing/projects/{id}/components" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingListProjectComponentsRequest;
import com.stackone.stackone_client_java.models.operations.TicketingListProjectComponentsResponse;
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

        TicketingListProjectComponentsRequest req = TicketingListProjectComponentsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,organization_id,remote_organization_id,project_id,remote_project_id,name,description,created_at,updated_at,unified_custom_fields")
                .filter(JsonNullable.of(null))
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listProjectComponents()
                .callAsStream()
                .forEach((TicketingListProjectComponentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [TicketingListProjectComponentsRequest](../../models/operations/TicketingListProjectComponentsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[TicketingListProjectComponentsResponse](../../models/operations/TicketingListProjectComponentsResponse.md)**

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

## getProjectComponent

Retrieve a single project component by its identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_get_project_component" method="get" path="/unified/ticketing/projects/{id}/components/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.TicketingGetProjectComponentRequest;
import com.stackone.stackone_client_java.models.operations.TicketingGetProjectComponentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        TicketingGetProjectComponentRequest req = TicketingGetProjectComponentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,organization_id,remote_organization_id,project_id,remote_project_id,name,description,created_at,updated_at,unified_custom_fields")
                .prefer("heartbeat")
                .build();

        TicketingGetProjectComponentResponse res = sdk.ticketing().getProjectComponent()
                .request(req)
                .call();

        if (res.ticketingComponentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [TicketingGetProjectComponentRequest](../../models/operations/TicketingGetProjectComponentRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[TicketingGetProjectComponentResponse](../../models/operations/TicketingGetProjectComponentResponse.md)**

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

## listProjectTicketTypes

Retrieve a paginated list of ticket types for a project.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_project_ticket_types" method="get" path="/unified/ticketing/projects/{id}/ticket_types" -->
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

        TicketingListProjectTicketTypesRequest req = TicketingListProjectTicketTypesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,project_id,remote_project_id,unified_custom_fields")
                .filter(TicketingListProjectTicketTypesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listProjectTicketTypes()
                .callAsStream()
                .forEach((TicketingListProjectTicketTypesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [TicketingListProjectTicketTypesRequest](../../models/operations/TicketingListProjectTicketTypesRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[TicketingListProjectTicketTypesResponse](../../models/operations/TicketingListProjectTicketTypesResponse.md)**

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

## listTicketStatuses

Retrieve a paginated list of statuses for a ticket.

### Example Usage

<!-- UsageSnippet language="java" operationID="ticketing_list_ticket_statuses" method="get" path="/unified/ticketing/tickets/{id}/statuses" -->
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

        TicketingListTicketStatusesRequest req = TicketingListTicketStatusesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .filter(TicketingListTicketStatusesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .prefer("heartbeat")
                .build();


        sdk.ticketing().listTicketStatuses()
                .callAsStream()
                .forEach((TicketingListTicketStatusesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [TicketingListTicketStatusesRequest](../../models/operations/TicketingListTicketStatusesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[TicketingListTicketStatusesResponse](../../models/operations/TicketingListTicketStatusesResponse.md)**

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