# openapi

Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/stackone/stackone). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

HRIS: The documentation for the StackOne Unified API - HRIS
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Pagination](#pagination)
* [Retries](#retries)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
* [Authentication](#authentication)
<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.stackone:stackone-client-java:0.0.1'
```

Maven:
```xml
<dependency>
    <groupId>com.stackone</groupId>
    <artifactId>stackone-client-java</artifactId>
    <version>0.0.1</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### List Employees

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeesQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeesRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisListEmployeesRequest req = HrisListEmployeesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,first_name,last_name,name,display_name,gender,ethnicity,date_of_birth,birthday,marital_status,avatar_url,avatar,personal_email,personal_phone_number,work_email,work_phone_number,job_id,remote_job_id,job_title,job_description,department_id,remote_department_id,department,cost_centers,benefits,company,manager_id,remote_manager_id,hire_date,start_date,tenure,work_anniversary,employment_type,employment_contract_type,employment_status,termination_date,company_name,company_id,remote_company_id,preferred_language,citizenships,home_location,work_location,employments,custom_fields,documents,created_at,updated_at,employee_number,national_identity_number,national_identity_numbers,skills")
                .filter(HrisListEmployeesQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .expand("company,employments,work_location,home_location,groups,skills")
                .include("avatar_url,avatar,custom_fields,job_description,benefits")
                .build();

        sdk.hris().listEmployees()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [hris()](docs/sdks/hris/README.md)

* [listCompanies](docs/sdks/hris/README.md#listcompanies) - List Companies
* [getCompany](docs/sdks/hris/README.md#getcompany) - Get Company
* [listEmployeeCustomFieldDefinitions](docs/sdks/hris/README.md#listemployeecustomfielddefinitions) - List employee Custom Field Definitions
* [getEmployeeCustomFieldDefinition](docs/sdks/hris/README.md#getemployeecustomfielddefinition) - Get employee Custom Field Definition
* [listEmployees](docs/sdks/hris/README.md#listemployees) - List Employees
* [createEmployee](docs/sdks/hris/README.md#createemployee) - Creates an employee
* [getEmployee](docs/sdks/hris/README.md#getemployee) - Get Employee
* [updateEmployee](docs/sdks/hris/README.md#updateemployee) - Updates an employee
* [inviteEmployee](docs/sdks/hris/README.md#inviteemployee) - Invite Employee
* [listEmployeeTimeOffRequests](docs/sdks/hris/README.md#listemployeetimeoffrequests) - List Employee Time Off Requests
* [createEmployeeTimeOffRequest](docs/sdks/hris/README.md#createemployeetimeoffrequest) - Create Employee Time Off Request
* [getEmployeesTimeOffRequest](docs/sdks/hris/README.md#getemployeestimeoffrequest) - Get Employees Time Off Request
* [batchUploadEmployeeDocument](docs/sdks/hris/README.md#batchuploademployeedocument) - Batch Upload Employee Document
* [uploadEmployeeDocument](docs/sdks/hris/README.md#uploademployeedocument) - Upload Employee Document
* [downloadEmployeeDocument](docs/sdks/hris/README.md#downloademployeedocument) - Download Employee Document
* [listEmployeeDocuments](docs/sdks/hris/README.md#listemployeedocuments) - List Employee Documents
* [getEmployeeDocument](docs/sdks/hris/README.md#getemployeedocument) - Get Employee Document
* [listEmployeeCategories](docs/sdks/hris/README.md#listemployeecategories) - List Employee Document Categories
* [getEmployeeDocumentCategory](docs/sdks/hris/README.md#getemployeedocumentcategory) - Get Employee Document Category
* [listEmployeeWorkEligibility](docs/sdks/hris/README.md#listemployeeworkeligibility) - List Employee Work Eligibility
* [createEmployeeWorkEligibilityRequest](docs/sdks/hris/README.md#createemployeeworkeligibilityrequest) - Create Employee Work Eligibility Request
* [getEmployeesWorkEligibility](docs/sdks/hris/README.md#getemployeesworkeligibility) - Get Employees Work Eligibility
* [updateEmployeeWorkEligibilityRequest](docs/sdks/hris/README.md#updateemployeeworkeligibilityrequest) - Update Employee Work Eligibility Request
* [listEmployeeTimeOffBalances](docs/sdks/hris/README.md#listemployeetimeoffbalances) - List Employee Time Off Balances
* [getEmployeeTimeOffBalance](docs/sdks/hris/README.md#getemployeetimeoffbalance) - Get Employee Time Off Balance
* [listEmployments](docs/sdks/hris/README.md#listemployments) - List Employments
* [getEmployment](docs/sdks/hris/README.md#getemployment) - Get Employment
* [listEmployeeEmployments](docs/sdks/hris/README.md#listemployeeemployments) - List Employee Employments
* [createEmployeeEmployment](docs/sdks/hris/README.md#createemployeeemployment) - Create Employee Employment
* [getEmployeeEmployment](docs/sdks/hris/README.md#getemployeeemployment) - Get Employee Employment
* [updateEmployeeEmployment](docs/sdks/hris/README.md#updateemployeeemployment) - Update Employee Employment
* [listLocations](docs/sdks/hris/README.md#listlocations) - List locations
* [getLocation](docs/sdks/hris/README.md#getlocation) - Get Location
* [listTimeOffRequests](docs/sdks/hris/README.md#listtimeoffrequests) - List time off requests
* [createTimeOffRequest](docs/sdks/hris/README.md#createtimeoffrequest) - Creates a time off request
* [getTimeOffRequest](docs/sdks/hris/README.md#gettimeoffrequest) - Get time off request
* [updateTimeOffRequest](docs/sdks/hris/README.md#updatetimeoffrequest) - Update time off request
* [listTimeOffTypes](docs/sdks/hris/README.md#listtimeofftypes) - List time off types
* [getTimeOffType](docs/sdks/hris/README.md#gettimeofftype) - Get time off type
* [listTimeEntries](docs/sdks/hris/README.md#listtimeentries) - List Time Entries
* [getTimeEntries](docs/sdks/hris/README.md#gettimeentries) - Get Time Entry
* [listBenefits](docs/sdks/hris/README.md#listbenefits) - List benefits
* [getBenefit](docs/sdks/hris/README.md#getbenefit) - Get Benefit
* [listGroups](docs/sdks/hris/README.md#listgroups) - List Groups
* [listDepartmentGroups](docs/sdks/hris/README.md#listdepartmentgroups) - List Department Groups
* [listCostCenterGroups](docs/sdks/hris/README.md#listcostcentergroups) - List Cost Center Groups
* [listTeamGroups](docs/sdks/hris/README.md#listteamgroups) - List Team Groups
* [getGroup](docs/sdks/hris/README.md#getgroup) - Get Group
* [getDepartmentGroup](docs/sdks/hris/README.md#getdepartmentgroup) - Get Department Group
* [getCostCenterGroup](docs/sdks/hris/README.md#getcostcentergroup) - Get Cost Center Group
* [getTeamGroup](docs/sdks/hris/README.md#getteamgroup) - Get Team Group
* [listJobs](docs/sdks/hris/README.md#listjobs) - List Jobs
* [getJob](docs/sdks/hris/README.md#getjob) - Get Job
* [listEmployeeSkills](docs/sdks/hris/README.md#listemployeeskills) - List Employee Skills
* [createEmployeeSkill](docs/sdks/hris/README.md#createemployeeskill) - Create Employee Skill
* [getEmployeeSkill](docs/sdks/hris/README.md#getemployeeskill) - Get Employee Skill
* [listTimeOffPolicies](docs/sdks/hris/README.md#listtimeoffpolicies) - List Time Off Policies
* [getTimeOffPolicy](docs/sdks/hris/README.md#gettimeoffpolicy) - Get Time Off Policy


</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `next` method that can be called to pull down the next group of results. The `next`
function returns an `Optional` value, which `isPresent` until there are no more pages to be fetched.

Here's an example of one such pagination call:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.Filter;
import com.stackone.stackone_client_java.models.operations.HrisListCompaniesRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisListCompaniesRequest req = HrisListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at")
                .filter(Filter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .build();

        sdk.hris().listCompanies()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```
<!-- End Pagination [pagination] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.Filter;
import com.stackone.stackone_client_java.models.operations.HrisListCompaniesRequest;
import com.stackone.stackone_client_java.utils.BackoffStrategy;
import com.stackone.stackone_client_java.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisListCompaniesRequest req = HrisListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at")
                .filter(Filter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .build();

        sdk.hris().listCompanies()
                .request(req)
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.Filter;
import com.stackone.stackone_client_java.models.operations.HrisListCompaniesRequest;
import com.stackone.stackone_client_java.utils.BackoffStrategy;
import com.stackone.stackone_client_java.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisListCompaniesRequest req = HrisListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at")
                .filter(Filter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .build();

        sdk.hris().listCompanies()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `listCompanies` method throws the following exceptions:

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

### Example

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.Filter;
import com.stackone.stackone_client_java.models.operations.HrisListCompaniesRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisListCompaniesRequest req = HrisListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at")
                .filter(Filter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .build();

        sdk.hris().listCompanies()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.stackone.com` | None |

#### Example

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.Filter;
import com.stackone.stackone_client_java.models.operations.HrisListCompaniesRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .serverIndex(0)
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisListCompaniesRequest req = HrisListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at")
                .filter(Filter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .build();

        sdk.hris().listCompanies()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.Filter;
import com.stackone.stackone_client_java.models.operations.HrisListCompaniesRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .serverURL("https://api.stackone.com")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisListCompaniesRequest req = HrisListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at")
                .filter(Filter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .build();

        sdk.hris().listCompanies()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                  | Type                  | Scheme                |
| --------------------- | --------------------- | --------------------- |
| `username` `password` | http                  | HTTP Basic            |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.Filter;
import com.stackone.stackone_client_java.models.operations.HrisListCompaniesRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisListCompaniesRequest req = HrisListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at")
                .filter(Filter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .build();

        sdk.hris().listCompanies()
                .request(req)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
