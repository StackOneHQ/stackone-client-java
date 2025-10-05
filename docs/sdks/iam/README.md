# Iam
(*iam()*)

## Overview

### Available Operations

* [listUsers](#listusers) - List Users
* [getUser](#getuser) - Get User
* [deleteUser](#deleteuser) - Delete User
* [updateUser](#updateuser) - Update User
* [listRoles](#listroles) - List Roles
* [getRole](#getrole) - Get Role
* [listGroups](#listgroups) - List Groups
* [getGroup](#getgroup) - Get Group
* [listPolicies](#listpolicies) - List Policies
* [getPolicy](#getpolicy) - Get Policy

## listUsers

List Users

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_list_users" method="get" path="/unified/iam/users" -->
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

        IamListUsersRequest req = IamListUsersRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,first_name,last_name,name,primary_email_address,username,roles,groups,status,avatar,is_bot_user,last_active_at,last_login_at,created_at,updated_at,multi_factor_enabled,unified_custom_fields")
                .filter(IamListUsersQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("roles,groups")
                .build();


        sdk.iam().listUsers()
                .callAsStream()
                .forEach((IamListUsersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [IamListUsersRequest](../../models/operations/IamListUsersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[IamListUsersResponse](../../models/operations/IamListUsersResponse.md)**

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

Get User

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_get_user" method="get" path="/unified/iam/users/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.IamGetUserRequest;
import com.stackone.stackone_client_java.models.operations.IamGetUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        IamGetUserRequest req = IamGetUserRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,first_name,last_name,name,primary_email_address,username,roles,groups,status,avatar,is_bot_user,last_active_at,last_login_at,created_at,updated_at,multi_factor_enabled,unified_custom_fields")
                .expand("roles,groups")
                .build();

        IamGetUserResponse res = sdk.iam().getUser()
                .request(req)
                .call();

        if (res.iamUserResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [IamGetUserRequest](../../models/operations/IamGetUserRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[IamGetUserResponse](../../models/operations/IamGetUserResponse.md)**

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

## deleteUser

Delete User

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_delete_user" method="delete" path="/unified/iam/users/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.IamDeleteUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        IamDeleteUserResponse res = sdk.iam().deleteUser()
                .xAccountId("<id>")
                .id("<id>")
                .call();

        if (res.deleteResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `xAccountId`           | *String*               | :heavy_check_mark:     | The account identifier |
| `id`                   | *String*               | :heavy_check_mark:     | N/A                    |

### Response

**[IamDeleteUserResponse](../../models/operations/IamDeleteUserResponse.md)**

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

## updateUser

Update User

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_update_user" method="patch" path="/unified/iam/users/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.IamUpdateUserResponse;
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

        IamUpdateUserResponse res = sdk.iam().updateUser()
                .xAccountId("<id>")
                .id("<id>")
                .iamUpdateUserRequestDto(IamUpdateUserRequestDto.builder()
                    .primaryEmailAddress("han@stackone.com")
                    .firstName("Han")
                    .lastName("Solo")
                    .name("Han Solo")
                    .username("hansolo1977")
                    .isBotUser(IamUpdateUserRequestDtoIsBotUser.of(true))
                    .status(IamUpdateUserRequestDtoStatus.builder()
                        .value(IamUpdateUserRequestDtoValue.ENABLED)
                        .build())
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.updateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `xAccountId`                                                                  | *String*                                                                      | :heavy_check_mark:                                                            | The account identifier                                                        |
| `id`                                                                          | *String*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           |
| `iamUpdateUserRequestDto`                                                     | [IamUpdateUserRequestDto](../../models/components/IamUpdateUserRequestDto.md) | :heavy_check_mark:                                                            | N/A                                                                           |

### Response

**[IamUpdateUserResponse](../../models/operations/IamUpdateUserResponse.md)**

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

## listRoles

List Roles

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_list_roles" method="get" path="/unified/iam/roles" -->
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

        IamListRolesRequest req = IamListRolesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,type,policies,description,created_at,updated_at,unified_custom_fields")
                .filter(IamListRolesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("policies")
                .build();


        sdk.iam().listRoles()
                .callAsStream()
                .forEach((IamListRolesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [IamListRolesRequest](../../models/operations/IamListRolesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[IamListRolesResponse](../../models/operations/IamListRolesResponse.md)**

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

## getRole

Get Role

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_get_role" method="get" path="/unified/iam/roles/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.IamGetRoleRequest;
import com.stackone.stackone_client_java.models.operations.IamGetRoleResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        IamGetRoleRequest req = IamGetRoleRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,type,policies,description,created_at,updated_at,unified_custom_fields")
                .expand("policies")
                .build();

        IamGetRoleResponse res = sdk.iam().getRole()
                .request(req)
                .call();

        if (res.iamRoleResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [IamGetRoleRequest](../../models/operations/IamGetRoleRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[IamGetRoleResponse](../../models/operations/IamGetRoleResponse.md)**

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

## listGroups

List Groups

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_list_groups" method="get" path="/unified/iam/groups" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.IamListGroupsRequest;
import com.stackone.stackone_client_java.models.operations.IamListGroupsResponse;
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

        IamListGroupsRequest req = IamListGroupsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,parent_id,remote_parent_id,name,description,roles,type,created_at,updated_at,unified_custom_fields")
                .filter(JsonNullable.of(null))
                .expand("roles")
                .build();


        sdk.iam().listGroups()
                .callAsStream()
                .forEach((IamListGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [IamListGroupsRequest](../../models/operations/IamListGroupsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[IamListGroupsResponse](../../models/operations/IamListGroupsResponse.md)**

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

## getGroup

Get Group

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_get_group" method="get" path="/unified/iam/groups/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.IamGetGroupRequest;
import com.stackone.stackone_client_java.models.operations.IamGetGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        IamGetGroupRequest req = IamGetGroupRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,parent_id,remote_parent_id,name,description,roles,type,created_at,updated_at,unified_custom_fields")
                .expand("roles")
                .build();

        IamGetGroupResponse res = sdk.iam().getGroup()
                .request(req)
                .call();

        if (res.iamGroupResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [IamGetGroupRequest](../../models/operations/IamGetGroupRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[IamGetGroupResponse](../../models/operations/IamGetGroupResponse.md)**

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

## listPolicies

List Policies

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_list_policies" method="get" path="/unified/iam/policies" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.IamListPoliciesRequest;
import com.stackone.stackone_client_java.models.operations.IamListPoliciesResponse;
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

        IamListPoliciesRequest req = IamListPoliciesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,permissions,description,created_at,updated_at,unified_custom_fields")
                .filter(JsonNullable.of(null))
                .expand("permissions")
                .build();


        sdk.iam().listPolicies()
                .callAsStream()
                .forEach((IamListPoliciesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [IamListPoliciesRequest](../../models/operations/IamListPoliciesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[IamListPoliciesResponse](../../models/operations/IamListPoliciesResponse.md)**

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

## getPolicy

Get Policy

### Example Usage

<!-- UsageSnippet language="java" operationID="iam_get_policy" method="get" path="/unified/iam/policies/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.IamGetPolicyRequest;
import com.stackone.stackone_client_java.models.operations.IamGetPolicyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        IamGetPolicyRequest req = IamGetPolicyRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,permissions,description,created_at,updated_at,unified_custom_fields")
                .expand("permissions")
                .build();

        IamGetPolicyResponse res = sdk.iam().getPolicy()
                .request(req)
                .call();

        if (res.iamPolicyResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [IamGetPolicyRequest](../../models/operations/IamGetPolicyRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[IamGetPolicyResponse](../../models/operations/IamGetPolicyResponse.md)**

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