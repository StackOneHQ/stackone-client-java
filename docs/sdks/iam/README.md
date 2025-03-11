# Iam
(*iam()*)

## Overview

### Available Operations

* [listUsers](#listusers) - List Users
* [getUser](#getuser) - Get User
* [listRoles](#listroles) - List Roles
* [getRole](#getrole) - Get Role
* [listGroups](#listgroups) - List Groups
* [getGroup](#getgroup) - Get Group
* [listPolicies](#listpolicies) - List Policies
* [getPolicy](#getpolicy) - Get Policy

## listUsers

List Users

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.IamListUsersQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.IamListUsersRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,first_name,last_name,name,primary_email_address,username,roles,groups,status,avatar,is_bot_user,last_active_at,last_login_at,created_at,updated_at,multi_factor_enabled")
                .filter(IamListUsersQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .expand("roles,groups")
                .build();

        sdk.iam().listUsers()
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
| `request`                                                             | [IamListUsersRequest](../../models/operations/IamListUsersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[IamListUsersResponse](../../models/operations/IamListUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUser

Get User

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,first_name,last_name,name,primary_email_address,username,roles,groups,status,avatar,is_bot_user,last_active_at,last_login_at,created_at,updated_at,multi_factor_enabled")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRoles

List Roles

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.IamListRolesQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.IamListRolesRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,type,policies,description,created_at,updated_at")
                .filter(IamListRolesQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .expand("policies")
                .build();

        sdk.iam().listRoles()
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
| `request`                                                             | [IamListRolesRequest](../../models/operations/IamListRolesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[IamListRolesResponse](../../models/operations/IamListRolesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRole

Get Role

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,type,policies,description,created_at,updated_at")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGroups

List Groups

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.IamListGroupsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.IamListGroupsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,parent_id,remote_parent_id,name,description,roles,type,created_at,updated_at")
                .filter(IamListGroupsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .expand("roles")
                .build();

        sdk.iam().listGroups()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGroup

Get Group

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,parent_id,remote_parent_id,name,description,roles,type,created_at,updated_at")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPolicies

List Policies

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.IamListPoliciesQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.IamListPoliciesRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,permissions,description,created_at,updated_at")
                .filter(IamListPoliciesQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .expand("permissions")
                .build();

        sdk.iam().listPolicies()
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
| `request`                                                                   | [IamListPoliciesRequest](../../models/operations/IamListPoliciesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[IamListPoliciesResponse](../../models/operations/IamListPoliciesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPolicy

Get Policy

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,permissions,description,created_at,updated_at")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |