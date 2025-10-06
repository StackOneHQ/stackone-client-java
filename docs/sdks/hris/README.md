# Hris
(*hris()*)

## Overview

### Available Operations

* [listCompanies](#listcompanies) - List Companies
* [getCompany](#getcompany) - Get Company
* [listEmployeeCustomFieldDefinitions](#listemployeecustomfielddefinitions) - List employee Custom Field Definitions
* [getEmployeeCustomFieldDefinition](#getemployeecustomfielddefinition) - Get employee Custom Field Definition
* [listEmployees](#listemployees) - List Employees
* [createEmployee](#createemployee) - Create Employee
* [getEmployee](#getemployee) - Get Employee
* [updateEmployee](#updateemployee) - Update Employee
* [inviteEmployee](#inviteemployee) - Invite Employee
* [listEmployeeShifts](#listemployeeshifts) - List Employee Shifts
* [getEmployeeShift](#getemployeeshift) - Get Employee Shift
* [listEmployeeTimeOffRequests](#listemployeetimeoffrequests) - List Employee Time Off Requests
* [createEmployeeTimeOffRequest](#createemployeetimeoffrequest) - Create Employee Time Off Request
* [getEmployeesTimeOffRequest](#getemployeestimeoffrequest) - Get Employees Time Off Request
* [cancelEmployeeTimeOffRequest](#cancelemployeetimeoffrequest) - Cancel Employee Time Off Request
* [updateEmployeeTimeOffRequest](#updateemployeetimeoffrequest) - Update Employee Time Off Request
* [batchUploadEmployeeDocument](#batchuploademployeedocument) - Batch Upload Employee Document
* [uploadEmployeeDocument](#uploademployeedocument) - Upload Employee Document
* [downloadEmployeeDocument](#downloademployeedocument) - Download Employee Document
* [listEmployeeDocuments](#listemployeedocuments) - List Employee Documents
* [getEmployeeDocument](#getemployeedocument) - Get Employee Document
* [listEmployeeCategories](#listemployeecategories) - List Employee Document Categories
* [getEmployeeDocumentCategory](#getemployeedocumentcategory) - Get Employee Document Category
* [listEmployeeWorkEligibility](#listemployeeworkeligibility) - List Employee Work Eligibility
* [createEmployeeWorkEligibilityRequest](#createemployeeworkeligibilityrequest) - Create Employee Work Eligibility Request
* [getEmployeesWorkEligibility](#getemployeesworkeligibility) - Get Employees Work Eligibility
* [updateEmployeeWorkEligibilityRequest](#updateemployeeworkeligibilityrequest) - Update Employee Work Eligibility Request
* [listEmployeeTimeOffBalances](#listemployeetimeoffbalances) - List Employee Time Off Balances
* [getEmployeeTimeOffBalance](#getemployeetimeoffbalance) - Get Employee Time Off Balance
* [listEmployments](#listemployments) - List Employments
* [getEmployment](#getemployment) - Get Employment
* [listEmployeeEmployments](#listemployeeemployments) - List Employee Employments
* [createEmployeeEmployment](#createemployeeemployment) - Create Employee Employment
* [getEmployeeEmployment](#getemployeeemployment) - Get Employee Employment
* [updateEmployeeEmployment](#updateemployeeemployment) - Update Employee Employment
* [listGroups](#listgroups) - List Groups
* [listDepartmentGroups](#listdepartmentgroups) - List Department Groups
* [listCostCenterGroups](#listcostcentergroups) - List Cost Center Groups
* [listTeamGroups](#listteamgroups) - List Team Groups
* [listDivisionGroups](#listdivisiongroups) - List Division Groups
* [listCompaniesGroups](#listcompaniesgroups) - List Companies Groups
* [getGroup](#getgroup) - Get Group
* [getDepartmentGroup](#getdepartmentgroup) - Get Department Group
* [getCostCenterGroup](#getcostcentergroup) - Get Cost Center Group
* [getTeamGroup](#getteamgroup) - Get Team Group
* [getDivisionGroup](#getdivisiongroup) - Get Division Group
* [getCompanyGroup](#getcompanygroup) - Get Company Group
* [listJobs](#listjobs) - List Jobs
* [getJob](#getjob) - Get Job
* [listLocations](#listlocations) - List Work Locations
* [getLocation](#getlocation) - Get Work Location
* [listPositions](#listpositions) - List Positions
* [getPosition](#getposition) - Get Position
* [listTimeEntries](#listtimeentries) - List Time Entries
* [getTimeEntries](#gettimeentries) - Get Time Entry
* [listTimeOffRequests](#listtimeoffrequests) - List time off requests
* [getTimeOffRequest](#gettimeoffrequest) - Get time off request
* [listShifts](#listshifts) - List Shifts
* [getShift](#getshift) - Get Shift
* [~~listTimeOffTypes~~](#listtimeofftypes) - List time off types :warning: **Deprecated**
* [~~getTimeOffType~~](#gettimeofftype) - Get time off type :warning: **Deprecated**
* [listTimeOffPolicies](#listtimeoffpolicies) - List Time Off Policies
* [getTimeOffPolicy](#gettimeoffpolicy) - Get Time Off Policy
* [listEmployeeTimeOffPolicies](#listemployeetimeoffpolicies) - List Assigned Time Off Policies
* [listBenefits](#listbenefits) - List benefits
* [getBenefit](#getbenefit) - Get Benefit
* [listEmployeeSkills](#listemployeeskills) - List Employee Skills
* [createEmployeeSkill](#createemployeeskill) - Create Employee Skill
* [getEmployeeSkill](#getemployeeskill) - Get Employee Skill
* [listEmployeeTasks](#listemployeetasks) - List Employee Tasks
* [getEmployeeTask](#getemployeetask) - Get Employee Task
* [updateEmployeeTask](#updateemployeetask) - Update Employee Task
* [listTasks](#listtasks) - List Tasks
* [getTask](#gettask) - Get Task

## listCompanies

List Companies

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_companies" method="get" path="/unified/hris/companies" -->
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

        HrisListCompaniesRequest req = HrisListCompaniesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at,unified_custom_fields")
                .filter(HrisListCompaniesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listCompanies()
                .callAsStream()
                .forEach((HrisListCompaniesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [HrisListCompaniesRequest](../../models/operations/HrisListCompaniesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[HrisListCompaniesResponse](../../models/operations/HrisListCompaniesResponse.md)**

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

<!-- UsageSnippet language="java" operationID="hris_get_company" method="get" path="/unified/hris/companies/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetCompanyRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetCompanyRequest req = HrisGetCompanyRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at,unified_custom_fields")
                .build();

        HrisGetCompanyResponse res = sdk.hris().getCompany()
                .request(req)
                .call();

        if (res.companyResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [HrisGetCompanyRequest](../../models/operations/HrisGetCompanyRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[HrisGetCompanyResponse](../../models/operations/HrisGetCompanyResponse.md)**

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

## listEmployeeCustomFieldDefinitions

List employee Custom Field Definitions

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_custom_field_definitions" method="get" path="/unified/hris/custom_field_definitions/employees" -->
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

        HrisListEmployeeCustomFieldDefinitionsRequest req = HrisListEmployeeCustomFieldDefinitionsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,type,options,unified_custom_fields")
                .filter(HrisListEmployeeCustomFieldDefinitionsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listEmployeeCustomFieldDefinitions()
                .callAsStream()
                .forEach((HrisListEmployeeCustomFieldDefinitionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [HrisListEmployeeCustomFieldDefinitionsRequest](../../models/operations/HrisListEmployeeCustomFieldDefinitionsRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[HrisListEmployeeCustomFieldDefinitionsResponse](../../models/operations/HrisListEmployeeCustomFieldDefinitionsResponse.md)**

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

## getEmployeeCustomFieldDefinition

Get employee Custom Field Definition

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee_custom_field_definition" method="get" path="/unified/hris/custom_field_definitions/employees/{id}" -->
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

        HrisGetEmployeeCustomFieldDefinitionRequest req = HrisGetEmployeeCustomFieldDefinitionRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,type,options,unified_custom_fields")
                .filter(HrisGetEmployeeCustomFieldDefinitionQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        HrisGetEmployeeCustomFieldDefinitionResponse res = sdk.hris().getEmployeeCustomFieldDefinition()
                .request(req)
                .call();

        if (res.customFieldDefinitionResultApiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [HrisGetEmployeeCustomFieldDefinitionRequest](../../models/operations/HrisGetEmployeeCustomFieldDefinitionRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[HrisGetEmployeeCustomFieldDefinitionResponse](../../models/operations/HrisGetEmployeeCustomFieldDefinitionResponse.md)**

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

## listEmployees

List Employees

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employees" method="get" path="/unified/hris/employees" -->
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

        HrisListEmployeesRequest req = HrisListEmployeesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,first_name,last_name,name,display_name,gender,ethnicity,date_of_birth,birthday,marital_status,avatar_url,avatar,personal_email,personal_phone_number,work_email,work_phone_number,job_id,remote_job_id,job_title,job_description,department_id,remote_department_id,department,cost_centers,company,manager_id,remote_manager_id,hire_date,start_date,tenure,work_anniversary,employment_type,employment_contract_type,employment_status,termination_date,company_name,company_id,remote_company_id,preferred_language,citizenships,home_location,work_location,employments,custom_fields,created_at,updated_at,benefits,employee_number,national_identity_number,national_identity_numbers,skills,unified_custom_fields")
                .filter(HrisListEmployeesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("company,employments,work_location,home_location,groups,skills")
                .include("avatar_url,avatar,custom_fields,job_description,benefits")
                .build();


        sdk.hris().listEmployees()
                .callAsStream()
                .forEach((HrisListEmployeesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [HrisListEmployeesRequest](../../models/operations/HrisListEmployeesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[HrisListEmployeesResponse](../../models/operations/HrisListEmployeesResponse.md)**

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

## createEmployee

Create Employee

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_create_employee" method="post" path="/unified/hris/employees" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
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

        HrisCreateEmployeeResponse res = sdk.hris().createEmployee()
                .xAccountId("<id>")
                .hrisCreateEmployeeRequestDto(HrisCreateEmployeeRequestDto.builder()
                    .firstName("Isaac")
                    .lastName("Newton")
                    .name("Isaac Newton")
                    .displayName("Sir Isaac Newton")
                    .avatarUrl("https://example.com/avatar.png")
                    .personalEmail("isaac.newton@example.com")
                    .personalPhoneNumber("+1234567890")
                    .workEmail("newton@example.com")
                    .workPhoneNumber("+1234567890")
                    .jobTitle("Physicist")
                    .departmentId("3093")
                    .teamId("2913")
                    .department("Physics")
                    .managerId("67890")
                    .gender(HrisCreateEmployeeRequestDtoGender.builder()
                        .build())
                    .preferredLanguage(HrisCreateEmployeeRequestDtoPreferredLanguage.builder()
                        .value(HrisCreateEmployeeRequestDtoPreferredLanguageValue.ENG)
                        .build())
                    .ethnicity(HrisCreateEmployeeRequestDtoEthnicity.builder()
                        .build())
                    .dateOfBirth(OffsetDateTime.parse("1990-01-01T00:00:00.000Z"))
                    .birthday(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .maritalStatus(HrisCreateEmployeeRequestDtoMaritalStatus.builder()
                        .build())
                    .avatar(HrisCreateEmployeeRequestDtoAvatar.builder()
                        .build())
                    .hireDate(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .startDate(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .employmentStatus(HrisCreateEmployeeRequestDtoEmploymentStatus.builder()
                        .build())
                    .terminationDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .companyId("1234567890")
                    .citizenships(List.of(
                        CountryCodeEnum.builder()
                            .value(CountryCodeEnumValue.US)
                            .build()))
                    .employment(JsonNullable.of(null))
                    .customFields(List.of(
                        CustomFields.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Training Completion Status")
                            .value(CustomFieldsValue.of("Completed"))
                            .valueId("value_456")
                            .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .build()))
                    .benefits(List.of(
                        CreateHRISBenefit.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Health Insurance")
                            .provider("Aetna")
                            .description("Health insurance for employees")
                            .createdAt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .updatedAt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .build()))
                    .employeeNumber("125")
                    .nationalIdentityNumbers(List.of(
                        NationalIdentityNumberApiModel.builder()
                            .value("123456789")
                            .type(NationalIdentityNumberApiModelType.builder()
                                .value(NationalIdentityNumberApiModelValue.SSN)
                                .build())
                            .country(Country.builder()
                                .value(NationalIdentityNumberApiModelCountryValue.US)
                                .build())
                            .build()))
                    .homeLocation(HrisCreateEmployeeRequestDtoHomeLocation.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("Woolsthorpe Manor")
                        .phoneNumber("+44 1476 860 364")
                        .street1("Water Lane")
                        .street2("Woolsthorpe by Colsterworth")
                        .city("Grantham")
                        .zipCode("NG33 5NR")
                        .country(HrisCreateEmployeeRequestDtoHomeLocationCountry.builder()
                            .value(HrisCreateEmployeeRequestDtoHomeLocationValue.US)
                            .build())
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .state(State.builder()
                            .build())
                        .build())
                    .workLocation(JsonNullable.of(null))
                    .costCenters(List.of(
                        CreateCostCenterApiModel.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("R&D")
                            .distributionPercentage(100d)
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

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `xAccountId`                                                                            | *String*                                                                                | :heavy_check_mark:                                                                      | The account identifier                                                                  |
| `hrisCreateEmployeeRequestDto`                                                          | [HrisCreateEmployeeRequestDto](../../models/components/HrisCreateEmployeeRequestDto.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |

### Response

**[HrisCreateEmployeeResponse](../../models/operations/HrisCreateEmployeeResponse.md)**

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

## getEmployee

Get Employee

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee" method="get" path="/unified/hris/employees/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeeRequest req = HrisGetEmployeeRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,first_name,last_name,name,display_name,gender,ethnicity,date_of_birth,birthday,marital_status,avatar_url,avatar,personal_email,personal_phone_number,work_email,work_phone_number,job_id,remote_job_id,job_title,job_description,department_id,remote_department_id,department,cost_centers,company,manager_id,remote_manager_id,hire_date,start_date,tenure,work_anniversary,employment_type,employment_contract_type,employment_status,termination_date,company_name,company_id,remote_company_id,preferred_language,citizenships,home_location,work_location,employments,custom_fields,created_at,updated_at,benefits,employee_number,national_identity_number,national_identity_numbers,skills,unified_custom_fields")
                .expand("company,employments,work_location,home_location,groups,skills")
                .include("avatar_url,avatar,custom_fields,job_description,benefits")
                .build();

        HrisGetEmployeeResponse res = sdk.hris().getEmployee()
                .request(req)
                .call();

        if (res.employeeResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [HrisGetEmployeeRequest](../../models/operations/HrisGetEmployeeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[HrisGetEmployeeResponse](../../models/operations/HrisGetEmployeeResponse.md)**

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

## updateEmployee

Update Employee

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_update_employee" method="patch" path="/unified/hris/employees/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisUpdateEmployeeResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
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

        HrisUpdateEmployeeResponse res = sdk.hris().updateEmployee()
                .xAccountId("<id>")
                .id("<id>")
                .hrisUpdateEmployeeRequestDto(HrisUpdateEmployeeRequestDto.builder()
                    .firstName("Isaac")
                    .lastName("Newton")
                    .name("Isaac Newton")
                    .displayName("Sir Isaac Newton")
                    .avatarUrl("https://example.com/avatar.png")
                    .personalEmail("isaac.newton@example.com")
                    .personalPhoneNumber("+1234567890")
                    .workEmail("newton@example.com")
                    .workPhoneNumber("+1234567890")
                    .jobTitle("Physicist")
                    .departmentId("3093")
                    .teamId("2913")
                    .department("Physics")
                    .managerId("67890")
                    .gender(HrisUpdateEmployeeRequestDtoGender.builder()
                        .build())
                    .preferredLanguage(HrisUpdateEmployeeRequestDtoPreferredLanguage.builder()
                        .value(HrisUpdateEmployeeRequestDtoPreferredLanguageValue.ENG)
                        .build())
                    .ethnicity(HrisUpdateEmployeeRequestDtoEthnicity.builder()
                        .build())
                    .dateOfBirth(OffsetDateTime.parse("1990-01-01T00:00:00.000Z"))
                    .birthday(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .maritalStatus(HrisUpdateEmployeeRequestDtoMaritalStatus.builder()
                        .build())
                    .avatar(HrisUpdateEmployeeRequestDtoAvatar.builder()
                        .build())
                    .hireDate(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .startDate(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .employmentStatus(HrisUpdateEmployeeRequestDtoEmploymentStatus.builder()
                        .build())
                    .terminationDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .companyId("1234567890")
                    .citizenships(List.of(
                        CountryCodeEnum.builder()
                            .value(CountryCodeEnumValue.US)
                            .build()))
                    .employment(JsonNullable.of(null))
                    .customFields(List.of(
                        CustomFields.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Training Completion Status")
                            .value(CustomFieldsValue.of("Completed"))
                            .valueId("value_456")
                            .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .build()))
                    .benefits(JsonNullable.of(null))
                    .employeeNumber("125")
                    .nationalIdentityNumbers(List.of(
                        NationalIdentityNumberApiModel.builder()
                            .value("123456789")
                            .type(NationalIdentityNumberApiModelType.builder()
                                .value(NationalIdentityNumberApiModelValue.SSN)
                                .build())
                            .country(Country.builder()
                                .value(NationalIdentityNumberApiModelCountryValue.US)
                                .build())
                            .build()))
                    .homeLocation(HrisUpdateEmployeeRequestDtoHomeLocation.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("Woolsthorpe Manor")
                        .phoneNumber("+44 1476 860 364")
                        .street1("Water Lane")
                        .street2("Woolsthorpe by Colsterworth")
                        .city("Grantham")
                        .zipCode("NG33 5NR")
                        .country(HrisUpdateEmployeeRequestDtoHomeLocationCountry.builder()
                            .value(HrisUpdateEmployeeRequestDtoHomeLocationValue.US)
                            .build())
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .state(HrisUpdateEmployeeRequestDtoState.builder()
                            .build())
                        .build())
                    .workLocation(HrisUpdateEmployeeRequestDtoWorkLocation.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("Woolsthorpe Manor")
                        .phoneNumber("+44 1476 860 364")
                        .street1("Water Lane")
                        .street2("Woolsthorpe by Colsterworth")
                        .city("Grantham")
                        .zipCode("NG33 5NR")
                        .country(HrisUpdateEmployeeRequestDtoWorkLocationCountry.builder()
                            .value(HrisUpdateEmployeeRequestDtoWorkLocationValue.US)
                            .build())
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .state(HrisUpdateEmployeeRequestDtoWorkLocationState.builder()
                            .build())
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

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `xAccountId`                                                                            | *String*                                                                                | :heavy_check_mark:                                                                      | The account identifier                                                                  |
| `id`                                                                                    | *String*                                                                                | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `hrisUpdateEmployeeRequestDto`                                                          | [HrisUpdateEmployeeRequestDto](../../models/components/HrisUpdateEmployeeRequestDto.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |

### Response

**[HrisUpdateEmployeeResponse](../../models/operations/HrisUpdateEmployeeResponse.md)**

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

## inviteEmployee

Invite Employee

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_invite_employee" method="post" path="/unified/hris/employees/{id}/invite" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisInviteEmployeeRequestDto;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisInviteEmployeeResponse;
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

        HrisInviteEmployeeResponse res = sdk.hris().inviteEmployee()
                .xAccountId("<id>")
                .id("<id>")
                .hrisInviteEmployeeRequestDto(HrisInviteEmployeeRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.inviteEmployeeResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `xAccountId`                                                                            | *String*                                                                                | :heavy_check_mark:                                                                      | The account identifier                                                                  |
| `id`                                                                                    | *String*                                                                                | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `hrisInviteEmployeeRequestDto`                                                          | [HrisInviteEmployeeRequestDto](../../models/components/HrisInviteEmployeeRequestDto.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |

### Response

**[HrisInviteEmployeeResponse](../../models/operations/HrisInviteEmployeeResponse.md)**

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

## listEmployeeShifts

List Employee Shifts

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_shifts" method="get" path="/unified/hris/employees/{id}/shifts" -->
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

        HrisListEmployeeShiftsRequest req = HrisListEmployeeShiftsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .filter(HrisListEmployeeShiftsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .startsAfter("2024-01-15T09:00")
                    .endsBefore("2024-01-15T17:00")
                    .build())
                .build();


        sdk.hris().listEmployeeShifts()
                .callAsStream()
                .forEach((HrisListEmployeeShiftsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisListEmployeeShiftsRequest](../../models/operations/HrisListEmployeeShiftsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[HrisListEmployeeShiftsResponse](../../models/operations/HrisListEmployeeShiftsResponse.md)**

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

## getEmployeeShift

Get Employee Shift

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee_shift" method="get" path="/unified/hris/employees/{id}/shifts/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeShiftRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeShiftResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeeShiftRequest req = HrisGetEmployeeShiftRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .build();

        HrisGetEmployeeShiftResponse res = sdk.hris().getEmployeeShift()
                .request(req)
                .call();

        if (res.hrisShiftResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [HrisGetEmployeeShiftRequest](../../models/operations/HrisGetEmployeeShiftRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[HrisGetEmployeeShiftResponse](../../models/operations/HrisGetEmployeeShiftResponse.md)**

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

## listEmployeeTimeOffRequests

List Employee Time Off Requests

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_time_off_requests" method="get" path="/unified/hris/employees/{id}/time_off" -->
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

        HrisListEmployeeTimeOffRequestsRequest req = HrisListEmployeeTimeOffRequestsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,approver_id,remote_approver_id,status,type,start_date,end_date,start_half_day,end_half_day,time_off_policy_id,remote_time_off_policy_id,reason,comment,duration,created_at,updated_at,policy,unified_custom_fields")
                .filter(HrisListEmployeeTimeOffRequestsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .startDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .endDate(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("policy")
                .build();


        sdk.hris().listEmployeeTimeOffRequests()
                .callAsStream()
                .forEach((HrisListEmployeeTimeOffRequestsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisListEmployeeTimeOffRequestsRequest](../../models/operations/HrisListEmployeeTimeOffRequestsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[HrisListEmployeeTimeOffRequestsResponse](../../models/operations/HrisListEmployeeTimeOffRequestsResponse.md)**

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

## createEmployeeTimeOffRequest

Create Employee Time Off Request

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_create_employee_time_off_request" method="post" path="/unified/hris/employees/{id}/time_off" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeTimeOffRequestResponse;
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

        HrisCreateEmployeeTimeOffRequestResponse res = sdk.hris().createEmployeeTimeOffRequest()
                .xAccountId("<id>")
                .id("<id>")
                .hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto.builder()
                    .approverId("1687-4")
                    .startDate("2021-01-01T01:01:01.000")
                    .endDate("2021-01-01T01:01:01.000")
                    .startHalfDay(HrisCreateTimeOffRequestDtoStartHalfDay.of(true))
                    .endHalfDay(HrisCreateTimeOffRequestDtoEndHalfDay.of(true))
                    .timeOffPolicyId("cx280928933")
                    .reason(HrisCreateTimeOffRequestDtoReason.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .build())
                    .comment("Taking a day off for personal reasons")
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `xAccountId`                                                                          | *String*                                                                              | :heavy_check_mark:                                                                    | The account identifier                                                                |
| `id`                                                                                  | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `hrisCreateTimeOffRequestDto`                                                         | [HrisCreateTimeOffRequestDto](../../models/components/HrisCreateTimeOffRequestDto.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |

### Response

**[HrisCreateEmployeeTimeOffRequestResponse](../../models/operations/HrisCreateEmployeeTimeOffRequestResponse.md)**

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

## getEmployeesTimeOffRequest

Get Employees Time Off Request

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employees_time_off_request" method="get" path="/unified/hris/employees/{id}/time_off/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeesTimeOffRequestRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeesTimeOffRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeesTimeOffRequestRequest req = HrisGetEmployeesTimeOffRequestRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,approver_id,remote_approver_id,status,type,start_date,end_date,start_half_day,end_half_day,time_off_policy_id,remote_time_off_policy_id,reason,comment,duration,created_at,updated_at,policy,unified_custom_fields")
                .expand("policy")
                .build();

        HrisGetEmployeesTimeOffRequestResponse res = sdk.hris().getEmployeesTimeOffRequest()
                .request(req)
                .call();

        if (res.timeOffResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [HrisGetEmployeesTimeOffRequestRequest](../../models/operations/HrisGetEmployeesTimeOffRequestRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[HrisGetEmployeesTimeOffRequestResponse](../../models/operations/HrisGetEmployeesTimeOffRequestResponse.md)**

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

## cancelEmployeeTimeOffRequest

Cancel Employee Time Off Request

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_cancel_employee_time_off_request" method="delete" path="/unified/hris/employees/{id}/time_off/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisCancelEmployeeTimeOffRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisCancelEmployeeTimeOffRequestResponse res = sdk.hris().cancelEmployeeTimeOffRequest()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
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
| `subResourceId`        | *String*               | :heavy_check_mark:     | N/A                    |

### Response

**[HrisCancelEmployeeTimeOffRequestResponse](../../models/operations/HrisCancelEmployeeTimeOffRequestResponse.md)**

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

## updateEmployeeTimeOffRequest

Update Employee Time Off Request

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_update_employee_time_off_request" method="patch" path="/unified/hris/employees/{id}/time_off/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisUpdateEmployeeTimeOffRequestResponse;
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

        HrisUpdateEmployeeTimeOffRequestResponse res = sdk.hris().updateEmployeeTimeOffRequest()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto.builder()
                    .approverId("1687-4")
                    .startDate("2021-01-01T01:01:01.000")
                    .endDate("2021-01-01T01:01:01.000")
                    .startHalfDay(HrisCreateTimeOffRequestDtoStartHalfDay.of(true))
                    .endHalfDay(HrisCreateTimeOffRequestDtoEndHalfDay.of(true))
                    .timeOffPolicyId("cx280928933")
                    .reason(HrisCreateTimeOffRequestDtoReason.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .build())
                    .comment("Taking a day off for personal reasons")
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `xAccountId`                                                                          | *String*                                                                              | :heavy_check_mark:                                                                    | The account identifier                                                                |
| `id`                                                                                  | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `subResourceId`                                                                       | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `hrisCreateTimeOffRequestDto`                                                         | [HrisCreateTimeOffRequestDto](../../models/components/HrisCreateTimeOffRequestDto.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |

### Response

**[HrisUpdateEmployeeTimeOffRequestResponse](../../models/operations/HrisUpdateEmployeeTimeOffRequestResponse.md)**

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

## batchUploadEmployeeDocument

Batch Upload Employee Document

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_batch_upload_employee_document" method="post" path="/unified/hris/employees/{id}/documents/upload/batch" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisBatchUploadEmployeeDocumentResponse;
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

        HrisBatchUploadEmployeeDocumentResponse res = sdk.hris().batchUploadEmployeeDocument()
                .xAccountId("<id>")
                .id("<id>")
                .hrisBatchDocumentUploadRequestDto(HrisBatchDocumentUploadRequestDto.builder()
                    .items(List.of(
                        HrisDocumentsUploadRequestDto.builder()
                            .name("weather-forecast")
                            .fileFormat(FileFormat.builder()
                                .value(HrisDocumentsUploadRequestDtoValue.PDF)
                                .sourceValue(HrisDocumentsUploadRequestDtoSourceValue.of("application/pdf"))
                                .build())
                            .content("VGhpcyBpc24ndCByZWFsbHkgYSBzYW1wbGUgZmlsZSwgYnV0IG5vIG9uZSB3aWxsIGV2ZXIga25vdyE")
                            .categoryId("6530")
                            .path("/path/to/file")
                            .confidential(Confidential.builder()
                                .value(HrisDocumentsUploadRequestDtoConfidentialValue.TRUE)
                                .sourceValue(HrisDocumentsUploadRequestDtoConfidentialSourceValue.of("public"))
                                .build())
                            .category(HrisDocumentsUploadRequestDtoCategory.builder()
                                .build())
                            .build()))
                    .build())
                .call();

        if (res.batchResultApiModel().isPresent()) {
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
| `hrisBatchDocumentUploadRequestDto`                                                               | [HrisBatchDocumentUploadRequestDto](../../models/components/HrisBatchDocumentUploadRequestDto.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |

### Response

**[HrisBatchUploadEmployeeDocumentResponse](../../models/operations/HrisBatchUploadEmployeeDocumentResponse.md)**

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

## uploadEmployeeDocument

Upload Employee Document

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_upload_employee_document" method="post" path="/unified/hris/employees/{id}/documents/upload" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisUploadEmployeeDocumentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisUploadEmployeeDocumentResponse res = sdk.hris().uploadEmployeeDocument()
                .xAccountId("<id>")
                .id("<id>")
                .hrisDocumentsUploadRequestDto(HrisDocumentsUploadRequestDto.builder()
                    .name("weather-forecast")
                    .fileFormat(FileFormat.builder()
                        .value(HrisDocumentsUploadRequestDtoValue.PDF)
                        .sourceValue(HrisDocumentsUploadRequestDtoSourceValue.of("application/pdf"))
                        .build())
                    .content("VGhpcyBpc24ndCByZWFsbHkgYSBzYW1wbGUgZmlsZSwgYnV0IG5vIG9uZSB3aWxsIGV2ZXIga25vdyE")
                    .categoryId("6530")
                    .path("/path/to/file")
                    .confidential(Confidential.builder()
                        .value(HrisDocumentsUploadRequestDtoConfidentialValue.TRUE)
                        .sourceValue(HrisDocumentsUploadRequestDtoConfidentialSourceValue.of("public"))
                        .build())
                    .category(HrisDocumentsUploadRequestDtoCategory.builder()
                        .build())
                    .build())
                .call();

        if (res.writeResultApiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `xAccountId`                                                                              | *String*                                                                                  | :heavy_check_mark:                                                                        | The account identifier                                                                    |
| `id`                                                                                      | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `hrisDocumentsUploadRequestDto`                                                           | [HrisDocumentsUploadRequestDto](../../models/components/HrisDocumentsUploadRequestDto.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |

### Response

**[HrisUploadEmployeeDocumentResponse](../../models/operations/HrisUploadEmployeeDocumentResponse.md)**

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

## downloadEmployeeDocument

Download Employee Document

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_download_employee_document" method="get" path="/unified/hris/employees/{id}/documents/{subResourceId}/download" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisDownloadEmployeeDocumentRequest;
import com.stackone.stackone_client_java.models.operations.HrisDownloadEmployeeDocumentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisDownloadEmployeeDocumentRequest req = HrisDownloadEmployeeDocumentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .format("base64")
                .exportFormat("text/plain")
                .build();

        HrisDownloadEmployeeDocumentResponse res = sdk.hris().downloadEmployeeDocument()
                .request(req)
                .call();

        if (res.body().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [HrisDownloadEmployeeDocumentRequest](../../models/operations/HrisDownloadEmployeeDocumentRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[HrisDownloadEmployeeDocumentResponse](../../models/operations/HrisDownloadEmployeeDocumentResponse.md)**

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

## listEmployeeDocuments

List Employee Documents

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_documents" method="get" path="/unified/hris/employees/{id}/documents" -->
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

        HrisListEmployeeDocumentsRequest req = HrisListEmployeeDocumentsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,type,category,category_id,remote_category_id,contents,created_at,updated_at,remote_url,file_format,unified_custom_fields")
                .filter(HrisListEmployeeDocumentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listEmployeeDocuments()
                .callAsStream()
                .forEach((HrisListEmployeeDocumentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [HrisListEmployeeDocumentsRequest](../../models/operations/HrisListEmployeeDocumentsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[HrisListEmployeeDocumentsResponse](../../models/operations/HrisListEmployeeDocumentsResponse.md)**

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

## getEmployeeDocument

Get Employee Document

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee_document" method="get" path="/unified/hris/employees/{id}/documents/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeDocumentRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeDocumentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeeDocumentRequest req = HrisGetEmployeeDocumentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,name,type,category,category_id,remote_category_id,contents,created_at,updated_at,remote_url,file_format,unified_custom_fields")
                .build();

        HrisGetEmployeeDocumentResponse res = sdk.hris().getEmployeeDocument()
                .request(req)
                .call();

        if (res.hrisDocumentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [HrisGetEmployeeDocumentRequest](../../models/operations/HrisGetEmployeeDocumentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[HrisGetEmployeeDocumentResponse](../../models/operations/HrisGetEmployeeDocumentResponse.md)**

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

## listEmployeeCategories

List Employee Document Categories

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_categories" method="get" path="/unified/hris/documents/employee_categories" -->
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

        HrisListEmployeeCategoriesRequest req = HrisListEmployeeCategoriesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,active,unified_custom_fields")
                .filter(HrisListEmployeeCategoriesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listEmployeeCategories()
                .callAsStream()
                .forEach((HrisListEmployeeCategoriesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [HrisListEmployeeCategoriesRequest](../../models/operations/HrisListEmployeeCategoriesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[HrisListEmployeeCategoriesResponse](../../models/operations/HrisListEmployeeCategoriesResponse.md)**

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

## getEmployeeDocumentCategory

Get Employee Document Category

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee_document_category" method="get" path="/unified/hris/documents/employee_categories/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeDocumentCategoryRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeDocumentCategoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeeDocumentCategoryRequest req = HrisGetEmployeeDocumentCategoryRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,active,unified_custom_fields")
                .build();

        HrisGetEmployeeDocumentCategoryResponse res = sdk.hris().getEmployeeDocumentCategory()
                .request(req)
                .call();

        if (res.referenceResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisGetEmployeeDocumentCategoryRequest](../../models/operations/HrisGetEmployeeDocumentCategoryRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[HrisGetEmployeeDocumentCategoryResponse](../../models/operations/HrisGetEmployeeDocumentCategoryResponse.md)**

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

## listEmployeeWorkEligibility

List Employee Work Eligibility

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_work_eligibility" method="get" path="/unified/hris/employees/{id}/work_eligibility" -->
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

        HrisListEmployeeWorkEligibilityRequest req = HrisListEmployeeWorkEligibilityRequest.builder()
                .id("<id>")
                .xAccountId("<id>")
                .fields("id,remote_id,type,sub_type,document,valid_from,valid_to,issued_by,number,unified_custom_fields")
                .filter(HrisListEmployeeWorkEligibilityQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listEmployeeWorkEligibility()
                .callAsStream()
                .forEach((HrisListEmployeeWorkEligibilityResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisListEmployeeWorkEligibilityRequest](../../models/operations/HrisListEmployeeWorkEligibilityRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[HrisListEmployeeWorkEligibilityResponse](../../models/operations/HrisListEmployeeWorkEligibilityResponse.md)**

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

## createEmployeeWorkEligibilityRequest

Create Employee Work Eligibility Request

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_create_employee_work_eligibility_request" method="post" path="/unified/hris/employees/{id}/work_eligibility" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeWorkEligibilityRequestResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
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

        HrisCreateEmployeeWorkEligibilityRequestResponse res = sdk.hris().createEmployeeWorkEligibilityRequest()
                .id("<id>")
                .xAccountId("<id>")
                .hrisCreateWorkEligibilityRequestDto(HrisCreateWorkEligibilityRequestDto.builder()
                    .document(HrisCreateWorkEligibilityRequestDtoDocument.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("My Document")
                        .category(HrisCreateWorkEligibilityRequestDtoCategory.builder()
                            .build())
                        .categoryId("6530")
                        .createdAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                        .updatedAt(OffsetDateTime.parse("2021-01-02T01:01:01.000Z"))
                        .remoteUrl("https://example.com/file.pdf")
                        .fileFormat(JsonNullable.of(null))
                        .build())
                    .issuedBy(HrisCreateWorkEligibilityRequestDtoIssuedBy.builder()
                        .value(HrisCreateWorkEligibilityRequestDtoValue.US)
                        .build())
                    .number("1234567890")
                    .subType("H1B")
                    .type(HrisCreateWorkEligibilityRequestDtoType.builder()
                        .build())
                    .validFrom(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .validTo(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
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

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `id`                                                                                                  | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `xAccountId`                                                                                          | *String*                                                                                              | :heavy_check_mark:                                                                                    | The account identifier                                                                                |
| `hrisCreateWorkEligibilityRequestDto`                                                                 | [HrisCreateWorkEligibilityRequestDto](../../models/components/HrisCreateWorkEligibilityRequestDto.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |

### Response

**[HrisCreateEmployeeWorkEligibilityRequestResponse](../../models/operations/HrisCreateEmployeeWorkEligibilityRequestResponse.md)**

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

## getEmployeesWorkEligibility

Get Employees Work Eligibility

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employees_work_eligibility" method="get" path="/unified/hris/employees/{id}/work_eligibility/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeesWorkEligibilityRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeesWorkEligibilityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeesWorkEligibilityRequest req = HrisGetEmployeesWorkEligibilityRequest.builder()
                .id("<id>")
                .subResourceId("<id>")
                .xAccountId("<id>")
                .fields("id,remote_id,type,sub_type,document,valid_from,valid_to,issued_by,number,unified_custom_fields")
                .build();

        HrisGetEmployeesWorkEligibilityResponse res = sdk.hris().getEmployeesWorkEligibility()
                .request(req)
                .call();

        if (res.workEligibilityResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisGetEmployeesWorkEligibilityRequest](../../models/operations/HrisGetEmployeesWorkEligibilityRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[HrisGetEmployeesWorkEligibilityResponse](../../models/operations/HrisGetEmployeesWorkEligibilityResponse.md)**

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

## updateEmployeeWorkEligibilityRequest

Update Employee Work Eligibility Request

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_update_employee_work_eligibility_request" method="patch" path="/unified/hris/employees/{id}/work_eligibility/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisUpdateEmployeeWorkEligibilityRequestResponse;
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

        HrisUpdateEmployeeWorkEligibilityRequestResponse res = sdk.hris().updateEmployeeWorkEligibilityRequest()
                .id("<id>")
                .subResourceId("<id>")
                .xAccountId("<id>")
                .hrisCreateWorkEligibilityRequestDto(HrisCreateWorkEligibilityRequestDto.builder()
                    .document(HrisCreateWorkEligibilityRequestDtoDocument.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("My Document")
                        .category(HrisCreateWorkEligibilityRequestDtoCategory.builder()
                            .build())
                        .categoryId("6530")
                        .createdAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                        .updatedAt(OffsetDateTime.parse("2021-01-02T01:01:01.000Z"))
                        .remoteUrl("https://example.com/file.pdf")
                        .fileFormat(HrisCreateWorkEligibilityRequestDtoFileFormat.builder()
                            .value(HrisCreateWorkEligibilityRequestDtoDocumentValue.PDF)
                            .sourceValue(HrisCreateWorkEligibilityRequestDtoDocumentSourceValue.of("application/pdf"))
                            .build())
                        .build())
                    .issuedBy(HrisCreateWorkEligibilityRequestDtoIssuedBy.builder()
                        .value(HrisCreateWorkEligibilityRequestDtoValue.US)
                        .build())
                    .number("1234567890")
                    .subType("H1B")
                    .type(HrisCreateWorkEligibilityRequestDtoType.builder()
                        .build())
                    .validFrom(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .validTo(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `id`                                                                                                  | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `subResourceId`                                                                                       | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `xAccountId`                                                                                          | *String*                                                                                              | :heavy_check_mark:                                                                                    | The account identifier                                                                                |
| `hrisCreateWorkEligibilityRequestDto`                                                                 | [HrisCreateWorkEligibilityRequestDto](../../models/components/HrisCreateWorkEligibilityRequestDto.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |

### Response

**[HrisUpdateEmployeeWorkEligibilityRequestResponse](../../models/operations/HrisUpdateEmployeeWorkEligibilityRequestResponse.md)**

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

## listEmployeeTimeOffBalances

List Employee Time Off Balances

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_time_off_balances" method="get" path="/unified/hris/employees/{id}/time_off_balances" -->
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

        HrisListEmployeeTimeOffBalancesRequest req = HrisListEmployeeTimeOffBalancesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,policy_id,remote_policy_id,policy,current_balance,initial_balance,balance_unit,balance_start_date,balance_expiry_date,updated_at,unified_custom_fields")
                .filter(HrisListEmployeeTimeOffBalancesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("policy")
                .build();


        sdk.hris().listEmployeeTimeOffBalances()
                .callAsStream()
                .forEach((HrisListEmployeeTimeOffBalancesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisListEmployeeTimeOffBalancesRequest](../../models/operations/HrisListEmployeeTimeOffBalancesRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[HrisListEmployeeTimeOffBalancesResponse](../../models/operations/HrisListEmployeeTimeOffBalancesResponse.md)**

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

## getEmployeeTimeOffBalance

Get Employee Time Off Balance

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee_time_off_balance" method="get" path="/unified/hris/employees/{id}/time_off_balances/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeTimeOffBalanceRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeTimeOffBalanceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeeTimeOffBalanceRequest req = HrisGetEmployeeTimeOffBalanceRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,policy_id,remote_policy_id,policy,current_balance,initial_balance,balance_unit,balance_start_date,balance_expiry_date,updated_at,unified_custom_fields")
                .expand("policy")
                .build();

        HrisGetEmployeeTimeOffBalanceResponse res = sdk.hris().getEmployeeTimeOffBalance()
                .request(req)
                .call();

        if (res.timeOffBalanceResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [HrisGetEmployeeTimeOffBalanceRequest](../../models/operations/HrisGetEmployeeTimeOffBalanceRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[HrisGetEmployeeTimeOffBalanceResponse](../../models/operations/HrisGetEmployeeTimeOffBalanceResponse.md)**

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

## listEmployments

List Employments

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employments" method="get" path="/unified/hris/employments" -->
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

        HrisListEmploymentsRequest req = HrisListEmploymentsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,job_title,pay_rate,pay_period,pay_frequency,pay_currency,effective_date,end_date,employment_type,employment_contract_type,type,contract_type,change_reason,grade,work_time,payroll_code,fte,created_at,updated_at,start_date,active,department,team,cost_center,cost_centers,division,job,manager,groups,unified_custom_fields")
                .filter(HrisListEmploymentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("groups")
                .build();


        sdk.hris().listEmployments()
                .callAsStream()
                .forEach((HrisListEmploymentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [HrisListEmploymentsRequest](../../models/operations/HrisListEmploymentsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[HrisListEmploymentsResponse](../../models/operations/HrisListEmploymentsResponse.md)**

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

## getEmployment

Get Employment

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employment" method="get" path="/unified/hris/employments/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmploymentRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmploymentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmploymentRequest req = HrisGetEmploymentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,job_title,pay_rate,pay_period,pay_frequency,pay_currency,effective_date,end_date,employment_type,employment_contract_type,type,contract_type,change_reason,grade,work_time,payroll_code,fte,created_at,updated_at,start_date,active,department,team,cost_center,cost_centers,division,job,manager,groups,unified_custom_fields")
                .expand("groups")
                .build();

        HrisGetEmploymentResponse res = sdk.hris().getEmployment()
                .request(req)
                .call();

        if (res.employmentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [HrisGetEmploymentRequest](../../models/operations/HrisGetEmploymentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[HrisGetEmploymentResponse](../../models/operations/HrisGetEmploymentResponse.md)**

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

## listEmployeeEmployments

List Employee Employments

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_employments" method="get" path="/unified/hris/employees/{id}/employments" -->
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

        HrisListEmployeeEmploymentsRequest req = HrisListEmployeeEmploymentsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,job_title,pay_rate,pay_period,pay_frequency,pay_currency,effective_date,end_date,employment_type,employment_contract_type,type,contract_type,change_reason,grade,work_time,payroll_code,fte,created_at,updated_at,start_date,active,department,team,cost_center,cost_centers,division,job,manager,groups,unified_custom_fields")
                .filter(HrisListEmployeeEmploymentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("groups")
                .build();


        sdk.hris().listEmployeeEmployments()
                .callAsStream()
                .forEach((HrisListEmployeeEmploymentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [HrisListEmployeeEmploymentsRequest](../../models/operations/HrisListEmployeeEmploymentsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[HrisListEmployeeEmploymentsResponse](../../models/operations/HrisListEmployeeEmploymentsResponse.md)**

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

## createEmployeeEmployment

Create Employee Employment

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_create_employee_employment" method="post" path="/unified/hris/employees/{id}/employments" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeEmploymentResponse;
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

        HrisCreateEmployeeEmploymentResponse res = sdk.hris().createEmployeeEmployment()
                .xAccountId("<id>")
                .id("<id>")
                .hrisCreateEmploymentRequestDto(HrisCreateEmploymentRequestDto.builder()
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .jobTitle("Software Engineer")
                    .payRate("40.00")
                    .payPeriod(HrisCreateEmploymentRequestDtoPayPeriod.builder()
                        .value(HrisCreateEmploymentRequestDtoValue.HOUR)
                        .sourceValue(HrisCreateEmploymentRequestDtoSourceValue.of("Hour"))
                        .build())
                    .payFrequency(HrisCreateEmploymentRequestDtoPayFrequency.builder()
                        .value(HrisCreateEmploymentRequestDtoPayFrequencyValue.HOURLY)
                        .sourceValue(HrisCreateEmploymentRequestDtoPayFrequencySourceValue.of("Hourly"))
                        .build())
                    .payCurrency("USD")
                    .effectiveDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .endDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .grade(HrisCreateEmploymentRequestDtoGrade.builder()
                        .id("1687-3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("1687-4")
                        .description("Mid-level employee demonstrating proficiency and autonomy.")
                        .build())
                    .type(HrisCreateEmploymentRequestDtoType.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .label("Permanent")
                        .type(HrisCreateEmploymentRequestDtoTypeType.builder()
                            .build())
                        .build())
                    .contractType(HrisCreateEmploymentRequestDtoContractType.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .label("Full-Time")
                        .contractType(HrisCreateEmploymentRequestDtoContractTypeContractType.builder()
                            .build())
                        .build())
                    .workTime(HrisCreateEmploymentRequestDtoWorkTime.builder()
                        .duration("P0Y0M0DT8H0M0S")
                        .durationUnit(HrisCreateEmploymentRequestDtoDurationUnit.builder()
                            .value(HrisCreateEmploymentRequestDtoWorkTimeValue.MONTH)
                            .build())
                        .build())
                    .payrollCode("PC1")
                    .jobId("5290")
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                | *String*                                                                                    | :heavy_check_mark:                                                                          | The account identifier                                                                      |
| `id`                                                                                        | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `hrisCreateEmploymentRequestDto`                                                            | [HrisCreateEmploymentRequestDto](../../models/components/HrisCreateEmploymentRequestDto.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |

### Response

**[HrisCreateEmployeeEmploymentResponse](../../models/operations/HrisCreateEmployeeEmploymentResponse.md)**

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

## getEmployeeEmployment

Get Employee Employment

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee_employment" method="get" path="/unified/hris/employees/{id}/employments/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeEmploymentRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeEmploymentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeeEmploymentRequest req = HrisGetEmployeeEmploymentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,job_title,pay_rate,pay_period,pay_frequency,pay_currency,effective_date,end_date,employment_type,employment_contract_type,type,contract_type,change_reason,grade,work_time,payroll_code,fte,created_at,updated_at,start_date,active,department,team,cost_center,cost_centers,division,job,manager,groups,unified_custom_fields")
                .expand("groups")
                .build();

        HrisGetEmployeeEmploymentResponse res = sdk.hris().getEmployeeEmployment()
                .request(req)
                .call();

        if (res.employmentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [HrisGetEmployeeEmploymentRequest](../../models/operations/HrisGetEmployeeEmploymentRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[HrisGetEmployeeEmploymentResponse](../../models/operations/HrisGetEmployeeEmploymentResponse.md)**

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

## updateEmployeeEmployment

Update Employee Employment

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_update_employee_employment" method="patch" path="/unified/hris/employees/{id}/employments/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisUpdateEmployeeEmploymentResponse;
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

        HrisUpdateEmployeeEmploymentResponse res = sdk.hris().updateEmployeeEmployment()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .hrisUpdateEmploymentRequestDto(HrisUpdateEmploymentRequestDto.builder()
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .jobTitle("Software Engineer")
                    .payRate("40.00")
                    .payPeriod(HrisUpdateEmploymentRequestDtoPayPeriod.builder()
                        .value(HrisUpdateEmploymentRequestDtoValue.HOUR)
                        .sourceValue(HrisUpdateEmploymentRequestDtoSourceValue.of("Hour"))
                        .build())
                    .payFrequency(HrisUpdateEmploymentRequestDtoPayFrequency.builder()
                        .value(HrisUpdateEmploymentRequestDtoPayFrequencyValue.HOURLY)
                        .sourceValue(HrisUpdateEmploymentRequestDtoPayFrequencySourceValue.of("Hourly"))
                        .build())
                    .payCurrency("USD")
                    .effectiveDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .endDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .grade(HrisUpdateEmploymentRequestDtoGrade.builder()
                        .id("1687-3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("1687-4")
                        .description("Mid-level employee demonstrating proficiency and autonomy.")
                        .build())
                    .type(HrisUpdateEmploymentRequestDtoType.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .label("Permanent")
                        .type(HrisUpdateEmploymentRequestDtoTypeType.builder()
                            .build())
                        .build())
                    .contractType(HrisUpdateEmploymentRequestDtoContractType.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .label("Full-Time")
                        .contractType(HrisUpdateEmploymentRequestDtoContractTypeContractType.builder()
                            .build())
                        .build())
                    .workTime(HrisUpdateEmploymentRequestDtoWorkTime.builder()
                        .duration("P0Y0M0DT8H0M0S")
                        .durationUnit(HrisUpdateEmploymentRequestDtoDurationUnit.builder()
                            .value(HrisUpdateEmploymentRequestDtoWorkTimeValue.MONTH)
                            .build())
                        .build())
                    .payrollCode("PC1")
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                | *String*                                                                                    | :heavy_check_mark:                                                                          | The account identifier                                                                      |
| `id`                                                                                        | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `subResourceId`                                                                             | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `hrisUpdateEmploymentRequestDto`                                                            | [HrisUpdateEmploymentRequestDto](../../models/components/HrisUpdateEmploymentRequestDto.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |

### Response

**[HrisUpdateEmployeeEmploymentResponse](../../models/operations/HrisUpdateEmployeeEmploymentResponse.md)**

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

<!-- UsageSnippet language="java" operationID="hris_list_groups" method="get" path="/unified/hris/groups" -->
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

        HrisListGroupsRequest req = HrisListGroupsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,company_id,remote_company_id,unified_custom_fields")
                .filter(HrisListGroupsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listGroups()
                .callAsStream()
                .forEach((HrisListGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [HrisListGroupsRequest](../../models/operations/HrisListGroupsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[HrisListGroupsResponse](../../models/operations/HrisListGroupsResponse.md)**

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

## listDepartmentGroups

List Department Groups

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_department_groups" method="get" path="/unified/hris/groups/departments" -->
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

        HrisListDepartmentGroupsRequest req = HrisListDepartmentGroupsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,company_id,remote_company_id,unified_custom_fields")
                .filter(HrisListDepartmentGroupsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listDepartmentGroups()
                .callAsStream()
                .forEach((HrisListDepartmentGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [HrisListDepartmentGroupsRequest](../../models/operations/HrisListDepartmentGroupsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[HrisListDepartmentGroupsResponse](../../models/operations/HrisListDepartmentGroupsResponse.md)**

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

## listCostCenterGroups

List Cost Center Groups

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_cost_center_groups" method="get" path="/unified/hris/groups/cost_centers" -->
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

        HrisListCostCenterGroupsRequest req = HrisListCostCenterGroupsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,type,distribution_percentage,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,company_id,remote_company_id,unified_custom_fields")
                .filter(HrisListCostCenterGroupsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listCostCenterGroups()
                .callAsStream()
                .forEach((HrisListCostCenterGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [HrisListCostCenterGroupsRequest](../../models/operations/HrisListCostCenterGroupsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[HrisListCostCenterGroupsResponse](../../models/operations/HrisListCostCenterGroupsResponse.md)**

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

## listTeamGroups

List Team Groups

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_team_groups" method="get" path="/unified/hris/groups/teams" -->
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

        HrisListTeamGroupsRequest req = HrisListTeamGroupsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,unified_custom_fields")
                .filter(HrisListTeamGroupsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listTeamGroups()
                .callAsStream()
                .forEach((HrisListTeamGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [HrisListTeamGroupsRequest](../../models/operations/HrisListTeamGroupsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[HrisListTeamGroupsResponse](../../models/operations/HrisListTeamGroupsResponse.md)**

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

## listDivisionGroups

List Division Groups

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_division_groups" method="get" path="/unified/hris/groups/divisions" -->
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

        HrisListDivisionGroupsRequest req = HrisListDivisionGroupsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,company_id,remote_company_id,unified_custom_fields")
                .filter(HrisListDivisionGroupsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listDivisionGroups()
                .callAsStream()
                .forEach((HrisListDivisionGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisListDivisionGroupsRequest](../../models/operations/HrisListDivisionGroupsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[HrisListDivisionGroupsResponse](../../models/operations/HrisListDivisionGroupsResponse.md)**

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

## listCompaniesGroups

List Companies Groups

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_companies_groups" method="get" path="/unified/hris/groups/companies" -->
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

        HrisListCompaniesGroupsRequest req = HrisListCompaniesGroupsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at,unified_custom_fields")
                .filter(HrisListCompaniesGroupsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listCompaniesGroups()
                .callAsStream()
                .forEach((HrisListCompaniesGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [HrisListCompaniesGroupsRequest](../../models/operations/HrisListCompaniesGroupsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[HrisListCompaniesGroupsResponse](../../models/operations/HrisListCompaniesGroupsResponse.md)**

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

<!-- UsageSnippet language="java" operationID="hris_get_group" method="get" path="/unified/hris/groups/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetGroupRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetGroupRequest req = HrisGetGroupRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,company_id,remote_company_id,unified_custom_fields")
                .build();

        HrisGetGroupResponse res = sdk.hris().getGroup()
                .request(req)
                .call();

        if (res.hrisGroupsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [HrisGetGroupRequest](../../models/operations/HrisGetGroupRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[HrisGetGroupResponse](../../models/operations/HrisGetGroupResponse.md)**

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

## getDepartmentGroup

Get Department Group

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_department_group" method="get" path="/unified/hris/groups/departments/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetDepartmentGroupRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetDepartmentGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetDepartmentGroupRequest req = HrisGetDepartmentGroupRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,company_id,remote_company_id,unified_custom_fields")
                .build();

        HrisGetDepartmentGroupResponse res = sdk.hris().getDepartmentGroup()
                .request(req)
                .call();

        if (res.hrisDepartmentsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisGetDepartmentGroupRequest](../../models/operations/HrisGetDepartmentGroupRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[HrisGetDepartmentGroupResponse](../../models/operations/HrisGetDepartmentGroupResponse.md)**

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

## getCostCenterGroup

Get Cost Center Group

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_cost_center_group" method="get" path="/unified/hris/groups/cost_centers/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetCostCenterGroupRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetCostCenterGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetCostCenterGroupRequest req = HrisGetCostCenterGroupRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,type,distribution_percentage,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,company_id,remote_company_id,unified_custom_fields")
                .build();

        HrisGetCostCenterGroupResponse res = sdk.hris().getCostCenterGroup()
                .request(req)
                .call();

        if (res.hrisCostCenterResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisGetCostCenterGroupRequest](../../models/operations/HrisGetCostCenterGroupRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[HrisGetCostCenterGroupResponse](../../models/operations/HrisGetCostCenterGroupResponse.md)**

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

## getTeamGroup

Get Team Group

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_team_group" method="get" path="/unified/hris/groups/teams/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetTeamGroupRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetTeamGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetTeamGroupRequest req = HrisGetTeamGroupRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,unified_custom_fields")
                .build();

        HrisGetTeamGroupResponse res = sdk.hris().getTeamGroup()
                .request(req)
                .call();

        if (res.hrisTeamsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [HrisGetTeamGroupRequest](../../models/operations/HrisGetTeamGroupRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[HrisGetTeamGroupResponse](../../models/operations/HrisGetTeamGroupResponse.md)**

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

## getDivisionGroup

Get Division Group

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_division_group" method="get" path="/unified/hris/groups/divisions/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetDivisionGroupRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetDivisionGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetDivisionGroupRequest req = HrisGetDivisionGroupRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids,company_id,remote_company_id,unified_custom_fields")
                .build();

        HrisGetDivisionGroupResponse res = sdk.hris().getDivisionGroup()
                .request(req)
                .call();

        if (res.hrisDivisionsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [HrisGetDivisionGroupRequest](../../models/operations/HrisGetDivisionGroupRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[HrisGetDivisionGroupResponse](../../models/operations/HrisGetDivisionGroupResponse.md)**

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

## getCompanyGroup

Get Company Group

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_company_group" method="get" path="/unified/hris/groups/companies/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetCompanyGroupRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetCompanyGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetCompanyGroupRequest req = HrisGetCompanyGroupRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at,unified_custom_fields")
                .build();

        HrisGetCompanyGroupResponse res = sdk.hris().getCompanyGroup()
                .request(req)
                .call();

        if (res.companyResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [HrisGetCompanyGroupRequest](../../models/operations/HrisGetCompanyGroupRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[HrisGetCompanyGroupResponse](../../models/operations/HrisGetCompanyGroupResponse.md)**

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

## listJobs

List Jobs

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_jobs" method="get" path="/unified/hris/jobs" -->
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

        HrisListJobsRequest req = HrisListJobsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,code,title,description,status,created_at,updated_at,unified_custom_fields")
                .filter(HrisListJobsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listJobs()
                .callAsStream()
                .forEach((HrisListJobsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [HrisListJobsRequest](../../models/operations/HrisListJobsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[HrisListJobsResponse](../../models/operations/HrisListJobsResponse.md)**

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

## getJob

Get Job

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_job" method="get" path="/unified/hris/jobs/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetJobRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetJobRequest req = HrisGetJobRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,code,title,description,status,created_at,updated_at,unified_custom_fields")
                .build();

        HrisGetJobResponse res = sdk.hris().getJob()
                .request(req)
                .call();

        if (res.hrisJobResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [HrisGetJobRequest](../../models/operations/HrisGetJobRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[HrisGetJobResponse](../../models/operations/HrisGetJobResponse.md)**

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

## listLocations

List Work Locations

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_locations" method="get" path="/unified/hris/locations" -->
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

        HrisListLocationsRequest req = HrisListLocationsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,name,phone_number,street_1,street_2,city,state,zip_code,country,location_type,created_at,updated_at,unified_custom_fields")
                .filter(HrisListLocationsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listLocations()
                .callAsStream()
                .forEach((HrisListLocationsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [HrisListLocationsRequest](../../models/operations/HrisListLocationsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[HrisListLocationsResponse](../../models/operations/HrisListLocationsResponse.md)**

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

## getLocation

Get Work Location

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_location" method="get" path="/unified/hris/locations/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetLocationRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetLocationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetLocationRequest req = HrisGetLocationRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,name,phone_number,street_1,street_2,city,state,zip_code,country,location_type,created_at,updated_at,unified_custom_fields")
                .build();

        HrisGetLocationResponse res = sdk.hris().getLocation()
                .request(req)
                .call();

        if (res.hrisLocationResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [HrisGetLocationRequest](../../models/operations/HrisGetLocationRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[HrisGetLocationResponse](../../models/operations/HrisGetLocationResponse.md)**

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

## listPositions

List Positions

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_positions" method="get" path="/unified/hris/positions" -->
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

        HrisListPositionsRequest req = HrisListPositionsRequest.builder()
                .xAccountId("<id>")
                .filter(HrisListPositionsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .status(QueryParamStatus.OPEN)
                .build();


        sdk.hris().listPositions()
                .callAsStream()
                .forEach((HrisListPositionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [HrisListPositionsRequest](../../models/operations/HrisListPositionsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[HrisListPositionsResponse](../../models/operations/HrisListPositionsResponse.md)**

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

## getPosition

Get Position

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_position" method="get" path="/unified/hris/positions/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetPositionRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetPositionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetPositionRequest req = HrisGetPositionRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .build();

        HrisGetPositionResponse res = sdk.hris().getPosition()
                .request(req)
                .call();

        if (res.positionResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [HrisGetPositionRequest](../../models/operations/HrisGetPositionRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[HrisGetPositionResponse](../../models/operations/HrisGetPositionResponse.md)**

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

## listTimeEntries

List Time Entries

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_time_entries" method="get" path="/unified/hris/time_entries" -->
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

        HrisListTimeEntriesRequest req = HrisListTimeEntriesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,start_time,end_time,hours_worked,break_duration,labor_type,location,status,created_at,updated_at,unified_custom_fields")
                .filter(HrisListTimeEntriesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .startTime("2020-01-01T00:00:00.000Z")
                    .endTime("2020-01-01T00:00:00.000Z")
                    .build())
                .build();


        sdk.hris().listTimeEntries()
                .callAsStream()
                .forEach((HrisListTimeEntriesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [HrisListTimeEntriesRequest](../../models/operations/HrisListTimeEntriesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[HrisListTimeEntriesResponse](../../models/operations/HrisListTimeEntriesResponse.md)**

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

## getTimeEntries

Get Time Entry

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_time_entries" method="get" path="/unified/hris/time_entries/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetTimeEntriesRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetTimeEntriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetTimeEntriesRequest req = HrisGetTimeEntriesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,start_time,end_time,hours_worked,break_duration,labor_type,location,status,created_at,updated_at,unified_custom_fields")
                .build();

        HrisGetTimeEntriesResponse res = sdk.hris().getTimeEntries()
                .request(req)
                .call();

        if (res.timeEntriesResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [HrisGetTimeEntriesRequest](../../models/operations/HrisGetTimeEntriesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[HrisGetTimeEntriesResponse](../../models/operations/HrisGetTimeEntriesResponse.md)**

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

## listTimeOffRequests

List time off requests

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_time_off_requests" method="get" path="/unified/hris/time_off" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisListTimeOffRequestsRequest;
import com.stackone.stackone_client_java.models.operations.HrisListTimeOffRequestsResponse;
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

        HrisListTimeOffRequestsRequest req = HrisListTimeOffRequestsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,approver_id,remote_approver_id,status,type,start_date,end_date,start_half_day,end_half_day,time_off_policy_id,remote_time_off_policy_id,reason,comment,duration,created_at,updated_at,policy,unified_custom_fields")
                .filter(JsonNullable.of(null))
                .expand("policy")
                .build();


        sdk.hris().listTimeOffRequests()
                .callAsStream()
                .forEach((HrisListTimeOffRequestsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [HrisListTimeOffRequestsRequest](../../models/operations/HrisListTimeOffRequestsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[HrisListTimeOffRequestsResponse](../../models/operations/HrisListTimeOffRequestsResponse.md)**

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

## getTimeOffRequest

Get time off request

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_time_off_request" method="get" path="/unified/hris/time_off/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetTimeOffRequestRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetTimeOffRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetTimeOffRequestRequest req = HrisGetTimeOffRequestRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,approver_id,remote_approver_id,status,type,start_date,end_date,start_half_day,end_half_day,time_off_policy_id,remote_time_off_policy_id,reason,comment,duration,created_at,updated_at,policy,unified_custom_fields")
                .expand("policy")
                .build();

        HrisGetTimeOffRequestResponse res = sdk.hris().getTimeOffRequest()
                .request(req)
                .call();

        if (res.timeOffResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [HrisGetTimeOffRequestRequest](../../models/operations/HrisGetTimeOffRequestRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[HrisGetTimeOffRequestResponse](../../models/operations/HrisGetTimeOffRequestResponse.md)**

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

## listShifts

List Shifts

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_shifts" method="get" path="/unified/hris/shifts" -->
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

        HrisListShiftsRequest req = HrisListShiftsRequest.builder()
                .xAccountId("<id>")
                .filter(HrisListShiftsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .startsAfter("2024-01-15T09:00")
                    .endsBefore("2024-01-15T17:00")
                    .build())
                .build();


        sdk.hris().listShifts()
                .callAsStream()
                .forEach((HrisListShiftsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [HrisListShiftsRequest](../../models/operations/HrisListShiftsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[HrisListShiftsResponse](../../models/operations/HrisListShiftsResponse.md)**

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

## getShift

Get Shift

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_shift" method="get" path="/unified/hris/shifts/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetShiftRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetShiftResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetShiftRequest req = HrisGetShiftRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .build();

        HrisGetShiftResponse res = sdk.hris().getShift()
                .request(req)
                .call();

        if (res.hrisShiftResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [HrisGetShiftRequest](../../models/operations/HrisGetShiftRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[HrisGetShiftResponse](../../models/operations/HrisGetShiftResponse.md)**

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

## ~~listTimeOffTypes~~

List time off types

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_time_off_types" method="get" path="/unified/hris/time_off_types" -->
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

        HrisListTimeOffTypesRequest req = HrisListTimeOffTypesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,active,unified_custom_fields")
                .filter(HrisListTimeOffTypesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listTimeOffTypes()
                .callAsStream()
                .forEach((HrisListTimeOffTypesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [HrisListTimeOffTypesRequest](../../models/operations/HrisListTimeOffTypesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[HrisListTimeOffTypesResponse](../../models/operations/HrisListTimeOffTypesResponse.md)**

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

## ~~getTimeOffType~~

Get time off type

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_time_off_type" method="get" path="/unified/hris/time_off_types/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetTimeOffTypeRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetTimeOffTypeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetTimeOffTypeRequest req = HrisGetTimeOffTypeRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,active,unified_custom_fields")
                .build();

        HrisGetTimeOffTypeResponse res = sdk.hris().getTimeOffType()
                .request(req)
                .call();

        if (res.referenceResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [HrisGetTimeOffTypeRequest](../../models/operations/HrisGetTimeOffTypeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[HrisGetTimeOffTypeResponse](../../models/operations/HrisGetTimeOffTypeResponse.md)**

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

## listTimeOffPolicies

List Time Off Policies

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_time_off_policies" method="get" path="/unified/hris/time_off_policies" -->
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

        HrisListTimeOffPoliciesRequest req = HrisListTimeOffPoliciesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,type,duration_unit,reasons,updated_at,created_at,unified_custom_fields")
                .filter(HrisListTimeOffPoliciesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listTimeOffPolicies()
                .callAsStream()
                .forEach((HrisListTimeOffPoliciesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [HrisListTimeOffPoliciesRequest](../../models/operations/HrisListTimeOffPoliciesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[HrisListTimeOffPoliciesResponse](../../models/operations/HrisListTimeOffPoliciesResponse.md)**

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

## getTimeOffPolicy

Get Time Off Policy

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_time_off_policy" method="get" path="/unified/hris/time_off_policies/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetTimeOffPolicyRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetTimeOffPolicyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetTimeOffPolicyRequest req = HrisGetTimeOffPolicyRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,type,duration_unit,reasons,updated_at,created_at,unified_custom_fields")
                .build();

        HrisGetTimeOffPolicyResponse res = sdk.hris().getTimeOffPolicy()
                .request(req)
                .call();

        if (res.timeOffPolicyResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [HrisGetTimeOffPolicyRequest](../../models/operations/HrisGetTimeOffPolicyRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[HrisGetTimeOffPolicyResponse](../../models/operations/HrisGetTimeOffPolicyResponse.md)**

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

## listEmployeeTimeOffPolicies

List Assigned Time Off Policies

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_time_off_policies" method="get" path="/unified/hris/employees/{id}/time_off_policies" -->
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

        HrisListEmployeeTimeOffPoliciesRequest req = HrisListEmployeeTimeOffPoliciesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,type,duration_unit,reasons,updated_at,created_at,unified_custom_fields")
                .filter(HrisListEmployeeTimeOffPoliciesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listEmployeeTimeOffPolicies()
                .callAsStream()
                .forEach((HrisListEmployeeTimeOffPoliciesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisListEmployeeTimeOffPoliciesRequest](../../models/operations/HrisListEmployeeTimeOffPoliciesRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[HrisListEmployeeTimeOffPoliciesResponse](../../models/operations/HrisListEmployeeTimeOffPoliciesResponse.md)**

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

## listBenefits

List benefits

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_benefits" method="get" path="/unified/hris/benefits" -->
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

        HrisListBenefitsRequest req = HrisListBenefitsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,benefit_type,provider,description,created_at,updated_at,unified_custom_fields")
                .filter(HrisListBenefitsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listBenefits()
                .callAsStream()
                .forEach((HrisListBenefitsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [HrisListBenefitsRequest](../../models/operations/HrisListBenefitsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[HrisListBenefitsResponse](../../models/operations/HrisListBenefitsResponse.md)**

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

## getBenefit

Get Benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_benefit" method="get" path="/unified/hris/benefits/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetBenefitRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetBenefitResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetBenefitRequest req = HrisGetBenefitRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,benefit_type,provider,description,created_at,updated_at,unified_custom_fields")
                .build();

        HrisGetBenefitResponse res = sdk.hris().getBenefit()
                .request(req)
                .call();

        if (res.hrisBenefitResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [HrisGetBenefitRequest](../../models/operations/HrisGetBenefitRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[HrisGetBenefitResponse](../../models/operations/HrisGetBenefitResponse.md)**

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

## listEmployeeSkills

List Employee Skills

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_skills" method="get" path="/unified/hris/employees/{id}/skills" -->
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

        HrisListEmployeeSkillsRequest req = HrisListEmployeeSkillsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,active,language,maximum_proficiency,minimum_proficiency,unified_custom_fields")
                .filter(HrisListEmployeeSkillsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();


        sdk.hris().listEmployeeSkills()
                .callAsStream()
                .forEach((HrisListEmployeeSkillsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisListEmployeeSkillsRequest](../../models/operations/HrisListEmployeeSkillsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[HrisListEmployeeSkillsResponse](../../models/operations/HrisListEmployeeSkillsResponse.md)**

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

## createEmployeeSkill

Create Employee Skill

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_create_employee_skill" method="post" path="/unified/hris/employees/{id}/skills" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeSkillResponse;
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

        HrisCreateEmployeeSkillResponse res = sdk.hris().createEmployeeSkill()
                .xAccountId("<id>")
                .id("<id>")
                .entitySkillsCreateRequestDto(EntitySkillsCreateRequestDto.builder()
                    .id("16873-IT345")
                    .name("Information-Technology")
                    .maximumProficiency(EntitySkillsCreateRequestDtoMaximumProficiency.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("Expert")
                        .build())
                    .minimumProficiency(JsonNullable.of(null))
                    .build())
                .call();

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `xAccountId`                                                                            | *String*                                                                                | :heavy_check_mark:                                                                      | The account identifier                                                                  |
| `id`                                                                                    | *String*                                                                                | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `entitySkillsCreateRequestDto`                                                          | [EntitySkillsCreateRequestDto](../../models/components/EntitySkillsCreateRequestDto.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |

### Response

**[HrisCreateEmployeeSkillResponse](../../models/operations/HrisCreateEmployeeSkillResponse.md)**

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

## getEmployeeSkill

Get Employee Skill

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee_skill" method="get" path="/unified/hris/employees/{id}/skills/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeSkillRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeSkillResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeeSkillRequest req = HrisGetEmployeeSkillRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,name,active,language,maximum_proficiency,minimum_proficiency,unified_custom_fields")
                .build();

        HrisGetEmployeeSkillResponse res = sdk.hris().getEmployeeSkill()
                .request(req)
                .call();

        if (res.entitySkillResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [HrisGetEmployeeSkillRequest](../../models/operations/HrisGetEmployeeSkillRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[HrisGetEmployeeSkillResponse](../../models/operations/HrisGetEmployeeSkillResponse.md)**

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

## listEmployeeTasks

List Employee Tasks

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_employee_tasks" method="get" path="/unified/hris/employees/{id}/tasks" -->
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

        HrisListEmployeeTasksRequest req = HrisListEmployeeTasksRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,name,description,type,status,due_date,completion_date,assigned_by_employee_id,remote_assigned_by_employee_id,assigned_by_employee_name,link_to_task,extracted_links,next_task_id,remote_next_task_id,parent_process_name,comments,attachments,created_at,updated_at,unified_custom_fields")
                .filter(HrisListEmployeeTasksQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("attachments")
                .build();


        sdk.hris().listEmployeeTasks()
                .callAsStream()
                .forEach((HrisListEmployeeTasksResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [HrisListEmployeeTasksRequest](../../models/operations/HrisListEmployeeTasksRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[HrisListEmployeeTasksResponse](../../models/operations/HrisListEmployeeTasksResponse.md)**

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

## getEmployeeTask

Get Employee Task

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_employee_task" method="get" path="/unified/hris/employees/{id}/tasks/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeTaskRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeTaskResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetEmployeeTaskRequest req = HrisGetEmployeeTaskRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,name,description,type,status,due_date,completion_date,assigned_by_employee_id,remote_assigned_by_employee_id,assigned_by_employee_name,link_to_task,extracted_links,next_task_id,remote_next_task_id,parent_process_name,comments,attachments,created_at,updated_at,unified_custom_fields")
                .expand("attachments")
                .build();

        HrisGetEmployeeTaskResponse res = sdk.hris().getEmployeeTask()
                .request(req)
                .call();

        if (res.taskResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [HrisGetEmployeeTaskRequest](../../models/operations/HrisGetEmployeeTaskRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[HrisGetEmployeeTaskResponse](../../models/operations/HrisGetEmployeeTaskResponse.md)**

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

## updateEmployeeTask

Update Employee Task

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_update_employee_task" method="patch" path="/unified/hris/employees/{id}/tasks/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisUpdateEmployeeTaskResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisUpdateEmployeeTaskResponse res = sdk.hris().updateEmployeeTask()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .updateTaskRequestDto(UpdateTaskRequestDto.builder()
                    .comment("All required documents have been submitted")
                    .status(UpdateTaskRequestDtoStatus.builder()
                        .value(UpdateTaskRequestDtoValue.OPEN)
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `xAccountId`                                                            | *String*                                                                | :heavy_check_mark:                                                      | The account identifier                                                  |
| `id`                                                                    | *String*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `subResourceId`                                                         | *String*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `updateTaskRequestDto`                                                  | [UpdateTaskRequestDto](../../models/components/UpdateTaskRequestDto.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[HrisUpdateEmployeeTaskResponse](../../models/operations/HrisUpdateEmployeeTaskResponse.md)**

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

## listTasks

List Tasks

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_list_tasks" method="get" path="/unified/hris/tasks" -->
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

        HrisListTasksRequest req = HrisListTasksRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,name,description,type,status,due_date,completion_date,assigned_by_employee_id,remote_assigned_by_employee_id,assigned_by_employee_name,link_to_task,extracted_links,next_task_id,remote_next_task_id,parent_process_name,comments,attachments,created_at,updated_at,unified_custom_fields")
                .filter(HrisListTasksQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("attachments")
                .build();


        sdk.hris().listTasks()
                .callAsStream()
                .forEach((HrisListTasksResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [HrisListTasksRequest](../../models/operations/HrisListTasksRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[HrisListTasksResponse](../../models/operations/HrisListTasksResponse.md)**

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

## getTask

Get Task

### Example Usage

<!-- UsageSnippet language="java" operationID="hris_get_task" method="get" path="/unified/hris/tasks/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.HrisGetTaskRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetTaskResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        HrisGetTaskRequest req = HrisGetTaskRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,employee_id,remote_employee_id,name,description,type,status,due_date,completion_date,assigned_by_employee_id,remote_assigned_by_employee_id,assigned_by_employee_name,link_to_task,extracted_links,next_task_id,remote_next_task_id,parent_process_name,comments,attachments,created_at,updated_at,unified_custom_fields")
                .expand("attachments")
                .build();

        HrisGetTaskResponse res = sdk.hris().getTask()
                .request(req)
                .call();

        if (res.taskResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [HrisGetTaskRequest](../../models/operations/HrisGetTaskRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[HrisGetTaskResponse](../../models/operations/HrisGetTaskResponse.md)**

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