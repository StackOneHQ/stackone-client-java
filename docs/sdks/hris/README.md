# Hris
(*hris()*)

## Overview

### Available Operations

* [listCompanies](#listcompanies) - List Companies
* [getCompany](#getcompany) - Get Company
* [listEmployeeCustomFieldDefinitions](#listemployeecustomfielddefinitions) - List employee Custom Field Definitions
* [getEmployeeCustomFieldDefinition](#getemployeecustomfielddefinition) - Get employee Custom Field Definition
* [listEmployees](#listemployees) - List Employees
* [createEmployee](#createemployee) - Creates an employee
* [getEmployee](#getemployee) - Get Employee
* [updateEmployee](#updateemployee) - Updates an employee
* [inviteEmployee](#inviteemployee) - Invite Employee
* [listEmployeeTimeOffRequests](#listemployeetimeoffrequests) - List Employee Time Off Requests
* [createEmployeeTimeOffRequest](#createemployeetimeoffrequest) - Create Employee Time Off Request
* [getEmployeesTimeOffRequest](#getemployeestimeoffrequest) - Get Employees Time Off Request
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
* [listLocations](#listlocations) - List locations
* [getLocation](#getlocation) - Get Location
* [listTimeOffRequests](#listtimeoffrequests) - List time off requests
* [createTimeOffRequest](#createtimeoffrequest) - Creates a time off request
* [getTimeOffRequest](#gettimeoffrequest) - Get time off request
* [updateTimeOffRequest](#updatetimeoffrequest) - Update time off request
* [listTimeOffTypes](#listtimeofftypes) - List time off types
* [getTimeOffType](#gettimeofftype) - Get time off type
* [listTimeEntries](#listtimeentries) - List Time Entries
* [getTimeEntries](#gettimeentries) - Get Time Entry
* [listBenefits](#listbenefits) - List benefits
* [getBenefit](#getbenefit) - Get Benefit
* [listGroups](#listgroups) - List Groups
* [listDepartmentGroups](#listdepartmentgroups) - List Department Groups
* [listCostCenterGroups](#listcostcentergroups) - List Cost Center Groups
* [listTeamGroups](#listteamgroups) - List Team Groups
* [getGroup](#getgroup) - Get Group
* [getDepartmentGroup](#getdepartmentgroup) - Get Department Group
* [getCostCenterGroup](#getcostcentergroup) - Get Cost Center Group
* [getTeamGroup](#getteamgroup) - Get Team Group
* [listJobs](#listjobs) - List Jobs
* [getJob](#getjob) - Get Job
* [listEmployeeSkills](#listemployeeskills) - List Employee Skills
* [createEmployeeSkill](#createemployeeskill) - Create Employee Skill
* [getEmployeeSkill](#getemployeeskill) - Get Employee Skill
* [listTimeOffPolicies](#listtimeoffpolicies) - List Time Off Policies
* [getTimeOffPolicy](#gettimeoffpolicy) - Get Time Off Policy

## listCompanies

List Companies

### Example Usage

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
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listCompanies()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [HrisListCompaniesRequest](../../models/operations/HrisListCompaniesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `serverURL`                                                                     | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |

### Response

**[HrisListCompaniesResponse](../../models/operations/HrisListCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCompany

Get Company

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,full_name,display_name,created_at,updated_at")
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
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |

### Response

**[HrisGetCompanyResponse](../../models/operations/HrisGetCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployeeCustomFieldDefinitions

List employee Custom Field Definitions

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeCustomFieldDefinitionsRequest;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeCustomFieldDefinitionsResponse;
import com.stackone.stackone_client_java.models.operations.QueryParamFilter;
import java.lang.Exception;

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
                .fields("id,remote_id,name,description,type,options")
                .filter(QueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        HrisListEmployeeCustomFieldDefinitionsResponse res = sdk.hris().listEmployeeCustomFieldDefinitions()
                .request(req)
                .call();

        if (res.customFieldDefinitionsPaginated().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [HrisListEmployeeCustomFieldDefinitionsRequest](../../models/operations/HrisListEmployeeCustomFieldDefinitionsRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `serverURL`                                                                                                               | *String*                                                                                                                  | :heavy_minus_sign:                                                                                                        | An optional server URL to use.                                                                                            |

### Response

**[HrisListEmployeeCustomFieldDefinitionsResponse](../../models/operations/HrisListEmployeeCustomFieldDefinitionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployeeCustomFieldDefinition

Get employee Custom Field Definition

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeCustomFieldDefinitionQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeCustomFieldDefinitionRequest;
import com.stackone.stackone_client_java.models.operations.HrisGetEmployeeCustomFieldDefinitionResponse;
import java.lang.Exception;

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
                .fields("id,remote_id,name,description,type,options")
                .filter(HrisGetEmployeeCustomFieldDefinitionQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
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
| `serverURL`                                                                                                           | *String*                                                                                                              | :heavy_minus_sign:                                                                                                    | An optional server URL to use.                                                                                        |

### Response

**[HrisGetEmployeeCustomFieldDefinitionResponse](../../models/operations/HrisGetEmployeeCustomFieldDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployees

List Employees

### Example Usage

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
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .expand("company,employments,work_location,home_location,groups,skills")
                .include("avatar_url,avatar,custom_fields,job_description,benefits")
                .build();

        sdk.hris().listEmployees()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [HrisListEmployeesRequest](../../models/operations/HrisListEmployeesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `serverURL`                                                                     | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |

### Response

**[HrisListEmployeesResponse](../../models/operations/HrisListEmployeesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createEmployee

Creates an employee

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Country;
import com.stackone.stackone_client_java.models.components.CountryCodeEnum;
import com.stackone.stackone_client_java.models.components.CreateCostCenterApiModel;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModel;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelEmploymentContractType;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelEmploymentType;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelEmploymentTypeSourceValue;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelEmploymentTypeValue;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelPayFrequency;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelPayFrequencySourceValue;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelPayFrequencyValue;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelPayPeriod;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelSourceValue;
import com.stackone.stackone_client_java.models.components.CreateEmploymentApiModelValue;
import com.stackone.stackone_client_java.models.components.CreateHRISBenefit;
import com.stackone.stackone_client_java.models.components.CustomFields;
import com.stackone.stackone_client_java.models.components.CustomFieldsValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDto;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoAvatar;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoEmploymentContractType;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoEmploymentStatus;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoEmploymentType;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoEmploymentTypeSourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoEmploymentTypeValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoEthnicity;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoGender;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoHomeLocation;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoHomeLocationCountry;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoHomeLocationValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoMaritalStatus;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoPreferredLanguage;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoPreferredLanguageValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoState;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoWorkLocation;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoWorkLocationCountry;
import com.stackone.stackone_client_java.models.components.HrisCreateEmployeeRequestDtoWorkLocationValue;
import com.stackone.stackone_client_java.models.components.NationalIdentityNumberApiModel;
import com.stackone.stackone_client_java.models.components.NationalIdentityNumberApiModelCountryValue;
import com.stackone.stackone_client_java.models.components.NationalIdentityNumberApiModelType;
import com.stackone.stackone_client_java.models.components.NationalIdentityNumberApiModelValue;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.components.State;
import com.stackone.stackone_client_java.models.components.Value;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
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

        HrisCreateEmployeeResponse res = sdk.hris().createEmployee()
                .xAccountId("<id>")
                .hrisCreateEmployeeRequestDto(HrisCreateEmployeeRequestDto.builder()
                    .firstName("Issac")
                    .lastName("Newton")
                    .name("Issac Newton")
                    .displayName("Sir Issac Newton")
                    .avatarUrl("https://example.com/avatar.png")
                    .personalEmail("isaac.newton@example.com")
                    .personalPhoneNumber("+1234567890")
                    .workEmail("newton@example.com")
                    .workPhoneNumber("+1234567890")
                    .jobId("R-6789")
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
                    .dateOfBirth(OffsetDateTime.parse("1990-01-01T00:00.000Z"))
                    .birthday(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .maritalStatus(HrisCreateEmployeeRequestDtoMaritalStatus.builder()
                        .build())
                    .avatar(HrisCreateEmployeeRequestDtoAvatar.builder()
                        .build())
                    .hireDate(OffsetDateTime.parse("2021-01-01T00:00.000Z"))
                    .startDate(OffsetDateTime.parse("2021-01-01T00:00.000Z"))
                    .tenure(2d)
                    .workAnniversary(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .employmentType(HrisCreateEmployeeRequestDtoEmploymentType.builder()
                        .value(HrisCreateEmployeeRequestDtoEmploymentTypeValue.PERMANENT)
                        .sourceValue(HrisCreateEmployeeRequestDtoEmploymentTypeSourceValue.of("Permanent"))
                        .build())
                    .employmentContractType(HrisCreateEmployeeRequestDtoEmploymentContractType.builder()
                        .build())
                    .employmentStatus(HrisCreateEmployeeRequestDtoEmploymentStatus.builder()
                        .build())
                    .terminationDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .companyId("1234567890")
                    .citizenships(List.of(
                        CountryCodeEnum.builder()
                            .value(Value.US)
                            .build(),
                        CountryCodeEnum.builder()
                            .value(Value.US)
                            .build()))
                    .employments(List.of(
                        CreateEmploymentApiModel.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .unifiedCustomFields(Map.ofEntries(
                                Map.entry("my_project_custom_field_1", "REF-1236"),
                                Map.entry("my_project_custom_field_2", "some other value")))
                            .employeeId("1687-3")
                            .jobTitle("Software Engineer")
                            .payRate("40.00")
                            .payPeriod(CreateEmploymentApiModelPayPeriod.builder()
                                .value(CreateEmploymentApiModelValue.HOUR)
                                .sourceValue(CreateEmploymentApiModelSourceValue.of("Hour"))
                                .build())
                            .payFrequency(CreateEmploymentApiModelPayFrequency.builder()
                                .value(CreateEmploymentApiModelPayFrequencyValue.HOURLY)
                                .sourceValue(CreateEmploymentApiModelPayFrequencySourceValue.of("Hourly"))
                                .build())
                            .payCurrency("USD")
                            .effectiveDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                            .employmentType(CreateEmploymentApiModelEmploymentType.builder()
                                .value(CreateEmploymentApiModelEmploymentTypeValue.PERMANENT)
                                .sourceValue(CreateEmploymentApiModelEmploymentTypeSourceValue.of("Permanent"))
                                .build())
                            .employmentContractType(CreateEmploymentApiModelEmploymentContractType.builder()
                                .build())
                            .timeWorked("P0Y0M0DT8H0M0S")
                            .build()))
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
                    .benefits(List.of(
                        CreateHRISBenefit.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Health Insurance")
                            .provider("Aetna")
                            .description("Health insurance for employees")
                            .createdAt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .updatedAt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .build(),
                        CreateHRISBenefit.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Health Insurance")
                            .provider("Aetna")
                            .description("Health insurance for employees")
                            .createdAt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .updatedAt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .build(),
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
                            .build(),
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
                    .workLocation(HrisCreateEmployeeRequestDtoWorkLocation.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("Woolsthorpe Manor")
                        .phoneNumber("+44 1476 860 364")
                        .street1("Water Lane")
                        .street2("Woolsthorpe by Colsterworth")
                        .city("Grantham")
                        .zipCode("NG33 5NR")
                        .country(HrisCreateEmployeeRequestDtoWorkLocationCountry.builder()
                            .value(HrisCreateEmployeeRequestDtoWorkLocationValue.US)
                            .build())
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .state(HrisCreateEmployeeRequestDtoState.builder()
                            .build())
                        .build())
                    .costCenters(List.of(
                        CreateCostCenterApiModel.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("R&D")
                            .distributionPercentage(100d)
                            .build(),
                        CreateCostCenterApiModel.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("R&D")
                            .distributionPercentage(100d)
                            .build(),
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
| `serverURL`                                                                             | *String*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |

### Response

**[HrisCreateEmployeeResponse](../../models/operations/HrisCreateEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployee

Get Employee

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,first_name,last_name,name,display_name,gender,ethnicity,date_of_birth,birthday,marital_status,avatar_url,avatar,personal_email,personal_phone_number,work_email,work_phone_number,job_id,remote_job_id,job_title,job_description,department_id,remote_department_id,department,cost_centers,benefits,company,manager_id,remote_manager_id,hire_date,start_date,tenure,work_anniversary,employment_type,employment_contract_type,employment_status,termination_date,company_name,company_id,remote_company_id,preferred_language,citizenships,home_location,work_location,employments,custom_fields,documents,created_at,updated_at,employee_number,national_identity_number,national_identity_numbers,skills")
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
| `serverURL`                                                                 | *String*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |

### Response

**[HrisGetEmployeeResponse](../../models/operations/HrisGetEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateEmployee

Updates an employee

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Country;
import com.stackone.stackone_client_java.models.components.CountryCodeEnum;
import com.stackone.stackone_client_java.models.components.CreateHRISBenefit;
import com.stackone.stackone_client_java.models.components.CustomFields;
import com.stackone.stackone_client_java.models.components.CustomFieldsValue;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDto;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoAvatar;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoEmploymentContractType;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoEmploymentStatus;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoEmploymentType;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoEmploymentTypeValue;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoEthnicity;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoGender;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoHomeLocation;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoHomeLocationCountry;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoHomeLocationValue;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoMaritalStatus;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoPreferredLanguage;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoPreferredLanguageValue;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoState;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoWorkLocation;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoWorkLocationCountry;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoWorkLocationState;
import com.stackone.stackone_client_java.models.components.HrisUpdateEmployeeRequestDtoWorkLocationValue;
import com.stackone.stackone_client_java.models.components.NationalIdentityNumberApiModel;
import com.stackone.stackone_client_java.models.components.NationalIdentityNumberApiModelCountryValue;
import com.stackone.stackone_client_java.models.components.NationalIdentityNumberApiModelType;
import com.stackone.stackone_client_java.models.components.NationalIdentityNumberApiModelValue;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.components.Value;
import com.stackone.stackone_client_java.models.operations.HrisUpdateEmployeeResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
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

        HrisUpdateEmployeeResponse res = sdk.hris().updateEmployee()
                .xAccountId("<id>")
                .id("<id>")
                .hrisUpdateEmployeeRequestDto(HrisUpdateEmployeeRequestDto.builder()
                    .firstName("Issac")
                    .lastName("Newton")
                    .name("Issac Newton")
                    .displayName("Sir Issac Newton")
                    .avatarUrl("https://example.com/avatar.png")
                    .personalEmail("isaac.newton@example.com")
                    .personalPhoneNumber("+1234567890")
                    .workEmail("newton@example.com")
                    .workPhoneNumber("+1234567890")
                    .jobId("R-6789")
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
                    .dateOfBirth(OffsetDateTime.parse("1990-01-01T00:00.000Z"))
                    .birthday(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .maritalStatus(HrisUpdateEmployeeRequestDtoMaritalStatus.builder()
                        .build())
                    .avatar(HrisUpdateEmployeeRequestDtoAvatar.builder()
                        .build())
                    .hireDate(OffsetDateTime.parse("2021-01-01T00:00.000Z"))
                    .startDate(OffsetDateTime.parse("2021-01-01T00:00.000Z"))
                    .tenure(2d)
                    .workAnniversary(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .employmentType(HrisUpdateEmployeeRequestDtoEmploymentType.builder()
                        .value(HrisUpdateEmployeeRequestDtoEmploymentTypeValue.PERMANENT)
                        .sourceValue(HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue.of("Permanent"))
                        .build())
                    .employmentContractType(HrisUpdateEmployeeRequestDtoEmploymentContractType.builder()
                        .build())
                    .employmentStatus(HrisUpdateEmployeeRequestDtoEmploymentStatus.builder()
                        .build())
                    .terminationDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .companyId("1234567890")
                    .citizenships(List.of(
                        CountryCodeEnum.builder()
                            .value(Value.US)
                            .build()))
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

        if (res.updateEmployeeApiModel().isPresent()) {
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
| `serverURL`                                                                             | *String*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |

### Response

**[HrisUpdateEmployeeResponse](../../models/operations/HrisUpdateEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## inviteEmployee

Invite Employee

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisInviteEmployeeRequestDto;
import com.stackone.stackone_client_java.models.components.Security;
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
| `serverURL`                                                                             | *String*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |

### Response

**[HrisInviteEmployeeResponse](../../models/operations/HrisInviteEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployeeTimeOffRequests

List Employee Time Off Requests

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeTimeOffRequestsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeTimeOffRequestsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,employee_id,remote_employee_id,approver_id,remote_approver_id,status,type,start_date,end_date,start_half_day,end_half_day,duration,time_off_policy_id,remote_time_off_policy_id,reason,created_at,updated_at")
                .filter(HrisListEmployeeTimeOffRequestsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listEmployeeTimeOffRequests()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisListEmployeeTimeOffRequestsRequest](../../models/operations/HrisListEmployeeTimeOffRequestsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `serverURL`                                                                                                 | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |

### Response

**[HrisListEmployeeTimeOffRequestsResponse](../../models/operations/HrisListEmployeeTimeOffRequestsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createEmployeeTimeOffRequest

Create Employee Time Off Request

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDto;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoEndHalfDay;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoReason;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoStartHalfDay;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeTimeOffRequestResponse;
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

        HrisCreateEmployeeTimeOffRequestResponse res = sdk.hris().createEmployeeTimeOffRequest()
                .xAccountId("<id>")
                .id("<id>")
                .hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto.builder()
                    .employeeId("1687-3")
                    .approverId("1687-4")
                    .startDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .endDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .startHalfDay(HrisCreateTimeOffRequestDtoStartHalfDay.of(true))
                    .endHalfDay(HrisCreateTimeOffRequestDtoEndHalfDay.of(true))
                    .timeOffPolicyId("cx280928933")
                    .reason(HrisCreateTimeOffRequestDtoReason.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `xAccountId`                                                                          | *String*                                                                              | :heavy_check_mark:                                                                    | The account identifier                                                                |
| `id`                                                                                  | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `hrisCreateTimeOffRequestDto`                                                         | [HrisCreateTimeOffRequestDto](../../models/components/HrisCreateTimeOffRequestDto.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[HrisCreateEmployeeTimeOffRequestResponse](../../models/operations/HrisCreateEmployeeTimeOffRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployeesTimeOffRequest

Get Employees Time Off Request

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,employee_id,remote_employee_id,approver_id,remote_approver_id,status,type,start_date,end_date,start_half_day,end_half_day,duration,time_off_policy_id,remote_time_off_policy_id,reason,created_at,updated_at")
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
| `serverURL`                                                                                               | *String*                                                                                                  | :heavy_minus_sign:                                                                                        | An optional server URL to use.                                                                            |

### Response

**[HrisGetEmployeesTimeOffRequestResponse](../../models/operations/HrisGetEmployeesTimeOffRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## batchUploadEmployeeDocument

Batch Upload Employee Document

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisBatchDocumentUploadRequestDto;
import com.stackone.stackone_client_java.models.components.Security;
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
                    ))
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
| `serverURL`                                                                                       | *String*                                                                                          | :heavy_minus_sign:                                                                                | An optional server URL to use.                                                                    |

### Response

**[HrisBatchUploadEmployeeDocumentResponse](../../models/operations/HrisBatchUploadEmployeeDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## uploadEmployeeDocument

Upload Employee Document

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Confidential;
import com.stackone.stackone_client_java.models.components.FileFormat;
import com.stackone.stackone_client_java.models.components.HrisDocumentsUploadRequestDto;
import com.stackone.stackone_client_java.models.components.HrisDocumentsUploadRequestDtoCategory;
import com.stackone.stackone_client_java.models.components.HrisDocumentsUploadRequestDtoCategoryValue;
import com.stackone.stackone_client_java.models.components.HrisDocumentsUploadRequestDtoConfidentialSourceValue;
import com.stackone.stackone_client_java.models.components.HrisDocumentsUploadRequestDtoConfidentialValue;
import com.stackone.stackone_client_java.models.components.HrisDocumentsUploadRequestDtoSourceValue;
import com.stackone.stackone_client_java.models.components.HrisDocumentsUploadRequestDtoValue;
import com.stackone.stackone_client_java.models.components.Security;
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
                        .sourceValue(HrisDocumentsUploadRequestDtoSourceValue.of("abc"))
                        .build())
                    .content("VGhpcyBpc24ndCByZWFsbHkgYSBzYW1wbGUgZmlsZSwgYnV0IG5vIG9uZSB3aWxsIGV2ZXIga25vdyE")
                    .categoryId("6530")
                    .path("/path/to/file")
                    .category(HrisDocumentsUploadRequestDtoCategory.builder()
                        .value(HrisDocumentsUploadRequestDtoCategoryValue.UNMAPPED_VALUE)
                        .sourceValue("550e8400-e29b-41d4-a716-446655440000")
                        .build())
                    .confidential(Confidential.builder()
                        .value(HrisDocumentsUploadRequestDtoConfidentialValue.TRUE)
                        .sourceValue(HrisDocumentsUploadRequestDtoConfidentialSourceValue.of("public"))
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
| `serverURL`                                                                               | *String*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |

### Response

**[HrisUploadEmployeeDocumentResponse](../../models/operations/HrisUploadEmployeeDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## downloadEmployeeDocument

Download Employee Document

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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

        HrisDownloadEmployeeDocumentResponse res = sdk.hris().downloadEmployeeDocument()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .format("base64")
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                          | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `xAccountId`                       | *String*                           | :heavy_check_mark:                 | The account identifier             |                                    |
| `id`                               | *String*                           | :heavy_check_mark:                 | N/A                                |                                    |
| `subResourceId`                    | *String*                           | :heavy_check_mark:                 | N/A                                |                                    |
| `format`                           | *JsonNullable\<String>*            | :heavy_minus_sign:                 | The format to download the file in | base64                             |
| `serverURL`                        | *String*                           | :heavy_minus_sign:                 | An optional server URL to use.     | http://localhost:8080              |

### Response

**[HrisDownloadEmployeeDocumentResponse](../../models/operations/HrisDownloadEmployeeDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployeeDocuments

List Employee Documents

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeDocumentsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeDocumentsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,path,type,category,category_id,remote_category_id,contents,created_at,updated_at,remote_url,file_format")
                .filter(HrisListEmployeeDocumentsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listEmployeeDocuments()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [HrisListEmployeeDocumentsRequest](../../models/operations/HrisListEmployeeDocumentsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `serverURL`                                                                                     | *String*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |

### Response

**[HrisListEmployeeDocumentsResponse](../../models/operations/HrisListEmployeeDocumentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployeeDocument

Get Employee Document

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,path,type,category,category_id,remote_category_id,contents,created_at,updated_at,remote_url,file_format")
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
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |

### Response

**[HrisGetEmployeeDocumentResponse](../../models/operations/HrisGetEmployeeDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployeeCategories

List Employee Document Categories

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeCategoriesQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeCategoriesRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,active")
                .filter(HrisListEmployeeCategoriesQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listEmployeeCategories()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [HrisListEmployeeCategoriesRequest](../../models/operations/HrisListEmployeeCategoriesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `serverURL`                                                                                       | *String*                                                                                          | :heavy_minus_sign:                                                                                | An optional server URL to use.                                                                    |

### Response

**[HrisListEmployeeCategoriesResponse](../../models/operations/HrisListEmployeeCategoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployeeDocumentCategory

Get Employee Document Category

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,active")
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
| `serverURL`                                                                                                 | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |

### Response

**[HrisGetEmployeeDocumentCategoryResponse](../../models/operations/HrisGetEmployeeDocumentCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployeeWorkEligibility

List Employee Work Eligibility

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeWorkEligibilityQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeWorkEligibilityRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,type,sub_type,document,valid_from,valid_to,issued_by,number")
                .filter(HrisListEmployeeWorkEligibilityQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listEmployeeWorkEligibility()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisListEmployeeWorkEligibilityRequest](../../models/operations/HrisListEmployeeWorkEligibilityRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `serverURL`                                                                                                 | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |

### Response

**[HrisListEmployeeWorkEligibilityResponse](../../models/operations/HrisListEmployeeWorkEligibilityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createEmployeeWorkEligibilityRequest

Create Employee Work Eligibility Request

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDto;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoCategory;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoDocument;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoDocumentSourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoDocumentValue;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoFileFormat;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoIssuedBy;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoType;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoValue;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeWorkEligibilityRequestResponse;
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

        HrisCreateEmployeeWorkEligibilityRequestResponse res = sdk.hris().createEmployeeWorkEligibilityRequest()
                .id("<id>")
                .xAccountId("<id>")
                .hrisCreateWorkEligibilityRequestDto(HrisCreateWorkEligibilityRequestDto.builder()
                    .document(HrisCreateWorkEligibilityRequestDtoDocument.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("My Document")
                        .path("/path/to/file")
                        .category(HrisCreateWorkEligibilityRequestDtoCategory.builder()
                            .build())
                        .categoryId("6530")
                        .createdAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                        .updatedAt(OffsetDateTime.parse("2021-01-02T01:01:01.000Z"))
                        .remoteUrl("https://example.com/file.pdf")
                        .fileFormat(HrisCreateWorkEligibilityRequestDtoFileFormat.builder()
                            .value(HrisCreateWorkEligibilityRequestDtoDocumentValue.PDF)
                            .sourceValue(HrisCreateWorkEligibilityRequestDtoDocumentSourceValue.of("abc"))
                            .build())
                        .build())
                    .issuedBy(HrisCreateWorkEligibilityRequestDtoIssuedBy.builder()
                        .value(HrisCreateWorkEligibilityRequestDtoValue.US)
                        .build())
                    .number("1234567890")
                    .subType("H1B")
                    .type(HrisCreateWorkEligibilityRequestDtoType.builder()
                        .build())
                    .validFrom(OffsetDateTime.parse("2021-01-01T00:00.000Z"))
                    .validTo(OffsetDateTime.parse("2021-01-01T00:00.000Z"))
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
| `serverURL`                                                                                           | *String*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |

### Response

**[HrisCreateEmployeeWorkEligibilityRequestResponse](../../models/operations/HrisCreateEmployeeWorkEligibilityRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployeesWorkEligibility

Get Employees Work Eligibility

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,type,sub_type,document,valid_from,valid_to,issued_by,number")
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
| `serverURL`                                                                                                 | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |

### Response

**[HrisGetEmployeesWorkEligibilityResponse](../../models/operations/HrisGetEmployeesWorkEligibilityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateEmployeeWorkEligibilityRequest

Update Employee Work Eligibility Request

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDto;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoCategory;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoDocument;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoDocumentSourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoDocumentValue;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoFileFormat;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoIssuedBy;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoType;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDtoValue;
import com.stackone.stackone_client_java.models.components.Security;
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
                        .path("/path/to/file")
                        .category(HrisCreateWorkEligibilityRequestDtoCategory.builder()
                            .build())
                        .categoryId("6530")
                        .createdAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                        .updatedAt(OffsetDateTime.parse("2021-01-02T01:01:01.000Z"))
                        .remoteUrl("https://example.com/file.pdf")
                        .fileFormat(HrisCreateWorkEligibilityRequestDtoFileFormat.builder()
                            .value(HrisCreateWorkEligibilityRequestDtoDocumentValue.PDF)
                            .sourceValue(HrisCreateWorkEligibilityRequestDtoDocumentSourceValue.of("abc"))
                            .build())
                        .build())
                    .issuedBy(HrisCreateWorkEligibilityRequestDtoIssuedBy.builder()
                        .value(HrisCreateWorkEligibilityRequestDtoValue.US)
                        .build())
                    .number("1234567890")
                    .subType("H1B")
                    .type(HrisCreateWorkEligibilityRequestDtoType.builder()
                        .build())
                    .validFrom(OffsetDateTime.parse("2021-01-01T00:00.000Z"))
                    .validTo(OffsetDateTime.parse("2021-01-01T00:00.000Z"))
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
| `serverURL`                                                                                           | *String*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |

### Response

**[HrisUpdateEmployeeWorkEligibilityRequestResponse](../../models/operations/HrisUpdateEmployeeWorkEligibilityRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployeeTimeOffBalances

List Employee Time Off Balances

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeTimeOffBalancesQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeTimeOffBalancesRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,employee_id,remote_employee_id,policy_id,remote_policy_id,policy,current_balance,initial_balance,balance_unit,balance_start_date,balance_expiry_date,updated_at")
                .filter(HrisListEmployeeTimeOffBalancesQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .expand("policy")
                .build();

        sdk.hris().listEmployeeTimeOffBalances()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [HrisListEmployeeTimeOffBalancesRequest](../../models/operations/HrisListEmployeeTimeOffBalancesRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `serverURL`                                                                                                 | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |

### Response

**[HrisListEmployeeTimeOffBalancesResponse](../../models/operations/HrisListEmployeeTimeOffBalancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployeeTimeOffBalance

Get Employee Time Off Balance

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,employee_id,remote_employee_id,policy_id,remote_policy_id,policy,current_balance,initial_balance,balance_unit,balance_start_date,balance_expiry_date,updated_at")
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
| `serverURL`                                                                                             | *String*                                                                                                | :heavy_minus_sign:                                                                                      | An optional server URL to use.                                                                          |

### Response

**[HrisGetEmployeeTimeOffBalanceResponse](../../models/operations/HrisGetEmployeeTimeOffBalanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployments

List Employments

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmploymentsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmploymentsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,employee_id,remote_employee_id,job_title,pay_rate,pay_period,pay_frequency,pay_currency,effective_date,employment_type,employment_contract_type,time_worked,created_at,updated_at,start_date,end_date,active,department,team,cost_center,cost_centers,division,job,type,contract_type,manager")
                .filter(HrisListEmploymentsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .expand("groups")
                .build();

        sdk.hris().listEmployments()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [HrisListEmploymentsRequest](../../models/operations/HrisListEmploymentsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |
| `serverURL`                                                                         | *String*                                                                            | :heavy_minus_sign:                                                                  | An optional server URL to use.                                                      |

### Response

**[HrisListEmploymentsResponse](../../models/operations/HrisListEmploymentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployment

Get Employment

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,employee_id,remote_employee_id,job_title,pay_rate,pay_period,pay_frequency,pay_currency,effective_date,employment_type,employment_contract_type,time_worked,created_at,updated_at,start_date,end_date,active,department,team,cost_center,cost_centers,division,job,type,contract_type,manager")
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
| `serverURL`                                                                     | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |

### Response

**[HrisGetEmploymentResponse](../../models/operations/HrisGetEmploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployeeEmployments

List Employee Employments

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeEmploymentsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeEmploymentsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,employee_id,remote_employee_id,job_title,pay_rate,pay_period,pay_frequency,pay_currency,effective_date,employment_type,employment_contract_type,time_worked,created_at,updated_at,start_date,end_date,active,department,team,cost_center,cost_centers,division,job,type,contract_type,manager")
                .filter(HrisListEmployeeEmploymentsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .expand("groups")
                .build();

        sdk.hris().listEmployeeEmployments()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [HrisListEmployeeEmploymentsRequest](../../models/operations/HrisListEmployeeEmploymentsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |
| `serverURL`                                                                                         | *String*                                                                                            | :heavy_minus_sign:                                                                                  | An optional server URL to use.                                                                      |

### Response

**[HrisListEmployeeEmploymentsResponse](../../models/operations/HrisListEmployeeEmploymentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createEmployeeEmployment

Create Employee Employment

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDto;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoEmploymentContractType;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoEmploymentType;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoEmploymentTypeSourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoEmploymentTypeValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoPayFrequency;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoPayFrequencySourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoPayFrequencyValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoPayPeriod;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoSourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoValue;
import com.stackone.stackone_client_java.models.components.Security;
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
                    .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .employeeId("1687-3")
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
                    .employmentType(HrisCreateEmploymentRequestDtoEmploymentType.builder()
                        .value(HrisCreateEmploymentRequestDtoEmploymentTypeValue.PERMANENT)
                        .sourceValue(HrisCreateEmploymentRequestDtoEmploymentTypeSourceValue.of("Permanent"))
                        .build())
                    .employmentContractType(HrisCreateEmploymentRequestDtoEmploymentContractType.builder()
                        .build())
                    .timeWorked("P0Y0M0DT8H0M0S")
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.employmentResult().isPresent()) {
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
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |

### Response

**[HrisCreateEmployeeEmploymentResponse](../../models/operations/HrisCreateEmployeeEmploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployeeEmployment

Get Employee Employment

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,employee_id,remote_employee_id,job_title,pay_rate,pay_period,pay_frequency,pay_currency,effective_date,employment_type,employment_contract_type,time_worked,created_at,updated_at,start_date,end_date,active,department,team,cost_center,cost_centers,division,job,type,contract_type,manager")
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
| `serverURL`                                                                                     | *String*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |

### Response

**[HrisGetEmployeeEmploymentResponse](../../models/operations/HrisGetEmployeeEmploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateEmployeeEmployment

Update Employee Employment

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDto;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoEmploymentContractType;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoEmploymentType;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoEmploymentTypeSourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoEmploymentTypeValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoPayFrequency;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoPayFrequencySourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoPayFrequencyValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoPayPeriod;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoSourceValue;
import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDtoValue;
import com.stackone.stackone_client_java.models.components.Security;
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
                .hrisCreateEmploymentRequestDto(HrisCreateEmploymentRequestDto.builder()
                    .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .employeeId("1687-3")
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
                    .employmentType(HrisCreateEmploymentRequestDtoEmploymentType.builder()
                        .value(HrisCreateEmploymentRequestDtoEmploymentTypeValue.PERMANENT)
                        .sourceValue(HrisCreateEmploymentRequestDtoEmploymentTypeSourceValue.of("Permanent"))
                        .build())
                    .employmentContractType(HrisCreateEmploymentRequestDtoEmploymentContractType.builder()
                        .build())
                    .timeWorked("P0Y0M0DT8H0M0S")
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.employmentResult().isPresent()) {
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
| `hrisCreateEmploymentRequestDto`                                                            | [HrisCreateEmploymentRequestDto](../../models/components/HrisCreateEmploymentRequestDto.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |

### Response

**[HrisUpdateEmployeeEmploymentResponse](../../models/operations/HrisUpdateEmployeeEmploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLocations

List locations

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListLocationsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListLocationsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,employee_id,remote_employee_id,name,phone_number,street_1,street_2,city,state,zip_code,country,location_type,created_at,updated_at")
                .filter(HrisListLocationsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listLocations()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [HrisListLocationsRequest](../../models/operations/HrisListLocationsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `serverURL`                                                                     | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |

### Response

**[HrisListLocationsResponse](../../models/operations/HrisListLocationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLocation

Get Location

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,employee_id,remote_employee_id,name,phone_number,street_1,street_2,city,state,zip_code,country,location_type,created_at,updated_at")
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
| `serverURL`                                                                 | *String*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |

### Response

**[HrisGetLocationResponse](../../models/operations/HrisGetLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTimeOffRequests

List time off requests

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListTimeOffRequestsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListTimeOffRequestsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,employee_id,remote_employee_id,approver_id,remote_approver_id,status,type,start_date,end_date,start_half_day,end_half_day,duration,time_off_policy_id,remote_time_off_policy_id,reason,created_at,updated_at")
                .filter(HrisListTimeOffRequestsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listTimeOffRequests()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [HrisListTimeOffRequestsRequest](../../models/operations/HrisListTimeOffRequestsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |

### Response

**[HrisListTimeOffRequestsResponse](../../models/operations/HrisListTimeOffRequestsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTimeOffRequest

Creates a time off request

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDto;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoEndHalfDay;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoReason;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoStartHalfDay;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisCreateTimeOffRequestResponse;
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

        HrisCreateTimeOffRequestResponse res = sdk.hris().createTimeOffRequest()
                .xAccountId("<id>")
                .hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto.builder()
                    .employeeId("1687-3")
                    .approverId("1687-4")
                    .startDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .endDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .startHalfDay(HrisCreateTimeOffRequestDtoStartHalfDay.of(true))
                    .endHalfDay(HrisCreateTimeOffRequestDtoEndHalfDay.of(true))
                    .timeOffPolicyId("cx280928933")
                    .reason(HrisCreateTimeOffRequestDtoReason.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `xAccountId`                                                                          | *String*                                                                              | :heavy_check_mark:                                                                    | The account identifier                                                                |
| `hrisCreateTimeOffRequestDto`                                                         | [HrisCreateTimeOffRequestDto](../../models/components/HrisCreateTimeOffRequestDto.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[HrisCreateTimeOffRequestResponse](../../models/operations/HrisCreateTimeOffRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTimeOffRequest

Get time off request

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,employee_id,remote_employee_id,approver_id,remote_approver_id,status,type,start_date,end_date,start_half_day,end_half_day,duration,time_off_policy_id,remote_time_off_policy_id,reason,created_at,updated_at")
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
| `serverURL`                                                                             | *String*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |

### Response

**[HrisGetTimeOffRequestResponse](../../models/operations/HrisGetTimeOffRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTimeOffRequest

Update time off request

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDto;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoEndHalfDay;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoReason;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDtoStartHalfDay;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisUpdateTimeOffRequestResponse;
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

        HrisUpdateTimeOffRequestResponse res = sdk.hris().updateTimeOffRequest()
                .xAccountId("<id>")
                .id("<id>")
                .hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto.builder()
                    .employeeId("1687-3")
                    .approverId("1687-4")
                    .startDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .endDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .startHalfDay(HrisCreateTimeOffRequestDtoStartHalfDay.of(true))
                    .endHalfDay(HrisCreateTimeOffRequestDtoEndHalfDay.of(true))
                    .timeOffPolicyId("cx280928933")
                    .reason(HrisCreateTimeOffRequestDtoReason.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `xAccountId`                                                                          | *String*                                                                              | :heavy_check_mark:                                                                    | The account identifier                                                                |
| `id`                                                                                  | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `hrisCreateTimeOffRequestDto`                                                         | [HrisCreateTimeOffRequestDto](../../models/components/HrisCreateTimeOffRequestDto.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[HrisUpdateTimeOffRequestResponse](../../models/operations/HrisUpdateTimeOffRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTimeOffTypes

List time off types

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListTimeOffTypesQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListTimeOffTypesRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,active")
                .filter(HrisListTimeOffTypesQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listTimeOffTypes()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [HrisListTimeOffTypesRequest](../../models/operations/HrisListTimeOffTypesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[HrisListTimeOffTypesResponse](../../models/operations/HrisListTimeOffTypesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTimeOffType

Get time off type

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,active")
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
| `serverURL`                                                                       | *String*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |

### Response

**[HrisGetTimeOffTypeResponse](../../models/operations/HrisGetTimeOffTypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTimeEntries

List Time Entries

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListTimeEntriesQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListTimeEntriesRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,employee_id,remote_employee_id,start_time,end_time,hours_worked,break_duration,labor_type,location,status,created_at,updated_at")
                .filter(HrisListTimeEntriesQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .startTime("2020-01-01T00:00:00.000Z")
                    .endTime("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listTimeEntries()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [HrisListTimeEntriesRequest](../../models/operations/HrisListTimeEntriesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |
| `serverURL`                                                                         | *String*                                                                            | :heavy_minus_sign:                                                                  | An optional server URL to use.                                                      |

### Response

**[HrisListTimeEntriesResponse](../../models/operations/HrisListTimeEntriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTimeEntries

Get Time Entry

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,employee_id,remote_employee_id,start_time,end_time,hours_worked,break_duration,labor_type,location,status,created_at,updated_at")
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
| `serverURL`                                                                       | *String*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |

### Response

**[HrisGetTimeEntriesResponse](../../models/operations/HrisGetTimeEntriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listBenefits

List benefits

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListBenefitsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListBenefitsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,benefit_type,provider,description,created_at,updated_at")
                .filter(HrisListBenefitsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listBenefits()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [HrisListBenefitsRequest](../../models/operations/HrisListBenefitsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `serverURL`                                                                   | *String*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |

### Response

**[HrisListBenefitsResponse](../../models/operations/HrisListBenefitsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getBenefit

Get Benefit

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,benefit_type,provider,description,created_at,updated_at")
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
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |

### Response

**[HrisGetBenefitResponse](../../models/operations/HrisGetBenefitResponse.md)**

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
import com.stackone.stackone_client_java.models.operations.HrisListGroupsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListGroupsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids")
                .filter(HrisListGroupsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listGroups()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [HrisListGroupsRequest](../../models/operations/HrisListGroupsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |

### Response

**[HrisListGroupsResponse](../../models/operations/HrisListGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDepartmentGroups

List Department Groups

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListDepartmentGroupsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListDepartmentGroupsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name")
                .filter(HrisListDepartmentGroupsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listDepartmentGroups()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [HrisListDepartmentGroupsRequest](../../models/operations/HrisListDepartmentGroupsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `serverURL`                                                                                   | *String*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |

### Response

**[HrisListDepartmentGroupsResponse](../../models/operations/HrisListDepartmentGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCostCenterGroups

List Cost Center Groups

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListCostCenterGroupsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListCostCenterGroupsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,type,distribution_percentage,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids")
                .filter(HrisListCostCenterGroupsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listCostCenterGroups()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [HrisListCostCenterGroupsRequest](../../models/operations/HrisListCostCenterGroupsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `serverURL`                                                                                   | *String*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |

### Response

**[HrisListCostCenterGroupsResponse](../../models/operations/HrisListCostCenterGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTeamGroups

List Team Groups

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListTeamGroupsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListTeamGroupsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids")
                .filter(HrisListTeamGroupsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listTeamGroups()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [HrisListTeamGroupsRequest](../../models/operations/HrisListTeamGroupsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *String*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |

### Response

**[HrisListTeamGroupsResponse](../../models/operations/HrisListTeamGroupsResponse.md)**

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
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids")
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
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[HrisGetGroupResponse](../../models/operations/HrisGetGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDepartmentGroup

Get Department Group

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name")
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
| `serverURL`                                                                               | *String*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |

### Response

**[HrisGetDepartmentGroupResponse](../../models/operations/HrisGetDepartmentGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCostCenterGroup

Get Cost Center Group

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,type,distribution_percentage,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids")
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
| `serverURL`                                                                               | *String*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |

### Response

**[HrisGetCostCenterGroupResponse](../../models/operations/HrisGetCostCenterGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTeamGroup

Get Team Group

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids")
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
| `serverURL`                                                                   | *String*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |

### Response

**[HrisGetTeamGroupResponse](../../models/operations/HrisGetTeamGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listJobs

List Jobs

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListJobsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListJobsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids")
                .filter(HrisListJobsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listJobs()
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
| `request`                                                             | [HrisListJobsRequest](../../models/operations/HrisListJobsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[HrisListJobsResponse](../../models/operations/HrisListJobsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getJob

Get Job

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,type,parent_ids,remote_parent_ids,owner_ids,remote_owner_ids")
                .build();

        HrisGetJobResponse res = sdk.hris().getJob()
                .request(req)
                .call();

        if (res.jobResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [HrisGetJobRequest](../../models/operations/HrisGetJobRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `serverURL`                                                       | *String*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |

### Response

**[HrisGetJobResponse](../../models/operations/HrisGetJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEmployeeSkills

List Employee Skills

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeSkillsQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListEmployeeSkillsRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,active,language,maximum_proficiency,minimum_proficiency")
                .filter(HrisListEmployeeSkillsQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listEmployeeSkills()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisListEmployeeSkillsRequest](../../models/operations/HrisListEmployeeSkillsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |
| `serverURL`                                                                               | *String*                                                                                  | :heavy_minus_sign:                                                                        | An optional server URL to use.                                                            |

### Response

**[HrisListEmployeeSkillsResponse](../../models/operations/HrisListEmployeeSkillsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createEmployeeSkill

Create Employee Skill

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.EntitySkillsCreateRequestDto;
import com.stackone.stackone_client_java.models.components.EntitySkillsCreateRequestDtoMaximumProficiency;
import com.stackone.stackone_client_java.models.components.EntitySkillsCreateRequestDtoMinimumProficiency;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisCreateEmployeeSkillResponse;
import java.lang.Exception;

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
                    .minimumProficiency(EntitySkillsCreateRequestDtoMinimumProficiency.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("Expert")
                        .build())
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
| `serverURL`                                                                             | *String*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |

### Response

**[HrisCreateEmployeeSkillResponse](../../models/operations/HrisCreateEmployeeSkillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEmployeeSkill

Get Employee Skill

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,active,language,maximum_proficiency,minimum_proficiency")
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
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[HrisGetEmployeeSkillResponse](../../models/operations/HrisGetEmployeeSkillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTimeOffPolicies

List Time Off Policies

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.HrisListTimeOffPoliciesQueryParamFilter;
import com.stackone.stackone_client_java.models.operations.HrisListTimeOffPoliciesRequest;
import java.lang.Exception;

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
                .fields("id,remote_id,name,description,type,duration_unit,reasons,updated_at,created_at")
                .filter(HrisListTimeOffPoliciesQueryParamFilter.builder()
                    .updatedAfter("2020-01-01T00:00:00.000Z")
                    .build())
                .updatedAfter("2020-01-01T00:00:00.000Z")
                .build();

        sdk.hris().listTimeOffPolicies()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [HrisListTimeOffPoliciesRequest](../../models/operations/HrisListTimeOffPoliciesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |

### Response

**[HrisListTimeOffPoliciesResponse](../../models/operations/HrisListTimeOffPoliciesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTimeOffPolicy

Get Time Off Policy

### Example Usage

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
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
                .fields("id,remote_id,name,description,type,duration_unit,reasons,updated_at,created_at")
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
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[HrisGetTimeOffPolicyResponse](../../models/operations/HrisGetTimeOffPolicyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |