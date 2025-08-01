# Ats
(*ats()*)

## Overview

### Available Operations

* [listApplications](#listapplications) - List Applications
* [createApplication](#createapplication) - Create Application
* [getApplication](#getapplication) - Get Application
* [updateApplication](#updateapplication) - Update Application
* [listApplicationsOffers](#listapplicationsoffers) - List Application Offers
* [moveApplication](#moveapplication) - Move Application
* [rejectApplication](#rejectapplication) - Reject Application
* [getApplicationOffer](#getapplicationoffer) - Get Application Offer
* [listApplicationScorecards](#listapplicationscorecards) - List Application Scorecards
* [getApplicationScorecard](#getapplicationscorecard) - Get Application Scorecard
* [listApplicationChanges](#listapplicationchanges) - List Application Changes
* [listApplicationNotes](#listapplicationnotes) - List Application Notes
* [createApplicationNote](#createapplicationnote) - Create Application Note
* [getApplicationNote](#getapplicationnote) - Get Application Note
* [updateApplicationNote](#updateapplicationnote) - Update Application Note
* [listApplicationsScheduledInterviews](#listapplicationsscheduledinterviews) - List Applications scheduled interviews
* [getApplicationScheduledInterview](#getapplicationscheduledinterview) - Get Applications scheduled interview
* [uploadApplicationDocument](#uploadapplicationdocument) - Upload Application Document
* [downloadApplicationDocument](#downloadapplicationdocument) - Download Application Document
* [listApplicationDocuments](#listapplicationdocuments) - List Application Documents
* [getApplicationDocument](#getapplicationdocument) - Get Application Document
* [listCandidates](#listcandidates) - List Candidates
* [createCandidate](#createcandidate) - Create Candidate
* [getCandidate](#getcandidate) - Get Candidate
* [updateCandidate](#updatecandidate) - Update Candidate
* [listCandidateNotes](#listcandidatenotes) - List Candidate Notes
* [createCandidateNote](#createcandidatenote) - Create Candidate Note
* [getCandidateNote](#getcandidatenote) - Get Candidate Note
* [listApplicationCustomFieldDefinitions](#listapplicationcustomfielddefinitions) - List Application Custom Field Definitions
* [getApplicationCustomFieldDefinition](#getapplicationcustomfielddefinition) - Get Application Custom Field Definition
* [listCandidateCustomFieldDefinitions](#listcandidatecustomfielddefinitions) - List Candidate Custom Field Definitions
* [getCandidateCustomFieldDefinition](#getcandidatecustomfielddefinition) - Get Candidate Custom Field Definition
* [listJobCustomFieldDefinitions](#listjobcustomfielddefinitions) - List Job Custom Field Definitions
* [getJobCustomFieldDefinition](#getjobcustomfielddefinition) - Get Job Custom Field Definition
* [listDepartments](#listdepartments) - List Departments
* [getDepartment](#getdepartment) - Get Department
* [listInterviewStages](#listinterviewstages) - List Interview Stages
* [getInterviewStage](#getinterviewstage) - Get Interview Stage
* [listInterviews](#listinterviews) - List Interviews
* [getInterview](#getinterview) - Get Interview
* [listJobs](#listjobs) - List Jobs
* [createJob](#createjob) - Create Job
* [getJob](#getjob) - Get Job
* [updateJob](#updatejob) - Update Job
* [listLists](#listlists) - Get all Lists
* [getList](#getlist) - Get List
* [listLocations](#listlocations) - List locations
* [getLocation](#getlocation) - Get Location
* [listRejectedReasons](#listrejectedreasons) - List Rejected Reasons
* [getRejectedReason](#getrejectedreason) - Get Rejected Reason
* [listUsers](#listusers) - List Users
* [getUser](#getuser) - Get User
* [listJobPostings](#listjobpostings) - List Job Postings
* [getJobPosting](#getjobposting) - Get Job Posting
* [listOffers](#listoffers) - List Offers
* [createOffer](#createoffer) - Create Offer
* [getOffer](#getoffer) - Get Offer
* [listAssessmentsPackages](#listassessmentspackages) - List Assessments Packages
* [getAssessmentsPackage](#getassessmentspackage) - Get Assessments Package
* [orderAssessmentsRequest](#orderassessmentsrequest) - Order Assessments Request
* [updateAssessmentsResult](#updateassessmentsresult) - Update Assessments Result
* [getAssessmentsResult](#getassessmentsresult) - Get Assessments Results
* [listBackgroundCheckPackages](#listbackgroundcheckpackages) - List Background Check Packages
* [createBackgroundCheckPackage](#createbackgroundcheckpackage) - Create Background Check Package
* [getBackgroundCheckPackage](#getbackgroundcheckpackage) - Get Background Check Package
* [deleteBackgroundCheckPackage](#deletebackgroundcheckpackage) - Delete Background Check Package
* [updateBackgroundCheckPackage](#updatebackgroundcheckpackage) - Update Background Check Package
* [orderBackgroundCheckRequest](#orderbackgroundcheckrequest) - Order Background Check Request
* [updateBackgroundCheckResult](#updatebackgroundcheckresult) - Update Background Check Result
* [getBackgroundCheckResult](#getbackgroundcheckresult) - Get Background Check Results
* [listApplicationDocumentCategories](#listapplicationdocumentcategories) - List Application Document Categories
* [getApplicationDocumentCategory](#getapplicationdocumentcategory) - Get Application Document Category

## listApplications

List Applications

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_applications" method="get" path="/unified/ats/applications" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationsRequest req = AtsListApplicationsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,candidate_id,remote_candidate_id,job_id,remote_job_id,job_posting_id,remote_job_posting_id,interview_stage,interview_stage_id,remote_interview_stage_id,rejected_reason,rejected_reason_id,remote_rejected_reason_id,rejected_reason_ids,remote_rejected_reason_ids,rejected_reasons,rejected_at,location_id,remote_location_id,location_ids,remote_location_ids,status,application_status,questionnaires,attachments,result_links,source,created_at,updated_at,documents,custom_fields,candidate")
                .filter(AtsListApplicationsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .createdAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("documents")
                .include("attachments,custom_fields")
                .build();

        sdk.ats().listApplications()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [AtsListApplicationsRequest](../../models/operations/AtsListApplicationsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[AtsListApplicationsResponse](../../models/operations/AtsListApplicationsResponse.md)**

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

## createApplication

Create Application

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_create_application" method="post" path="/unified/ats/applications" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsCreateApplicationResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsCreateApplicationResponse res = sdk.ats().createApplication()
                .xAccountId("<id>")
                .atsCreateApplicationRequestDto(AtsCreateApplicationRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .jobId("4071538b-3cac-4fbf-ac76-f78ed250ffdd")
                    .jobPostingId("1c702a20-8de8-4d03-ac18-cbf4ac42eb51")
                    .locationId("dd8d41d1-5eb8-4408-9c87-9ba44604eae4")
                    .applicationStatus(JsonNullable.of(null))
                    .questionnaires(List.of(
                        CreateQuestionnaire.builder()
                            .id("right_to_work")
                            .answers(List.of(
                                CreateAnswer.builder()
                                    .id("answer1")
                                    .type(CreateAnswerType.builder()
                                        .value(CreateAnswerValue.SHORT_TEXT)
                                        .sourceValue(CreateAnswerSourceValue.of("Short Text"))
                                        .build())
                                    .values(List.of(
                                        "Yes"))
                                    .build()))
                            .build()))
                    .source(AtsCreateApplicationRequestDtoSource.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("LinkedIn")
                        .build())
                    .candidateId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                    .candidate(AtsCreateApplicationRequestDtoCandidate.builder()
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .unifiedCustomFields(Map.ofEntries(
                            Map.entry("my_project_custom_field_1", "REF-1236"),
                            Map.entry("my_project_custom_field_2", "some other value")))
                        .phoneNumbers(List.of(
                            PhoneNumber.builder()
                                .phone("+447700112233")
                                .build()))
                        .name("Romain Sestier")
                        .firstName("Romain")
                        .lastName("Sestier")
                        .email("sestier.romain123@gmail.com")
                        .socialLinks(List.of(
                            SocialLink.builder()
                                .type("linkedin")
                                .url("https://www.linkedin.com/in/romainsestier/")
                                .build()))
                        .company("Company Inc.")
                        .title("Software Engineer")
                        .hiredAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                        .country("United States")
                        .customFields(List.of(
                            CustomFields.builder()
                                .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                                .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                                .name("Training Completion Status")
                                .value(CustomFieldsValue.of("Completed"))
                                .valueId("value_456")
                                .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                                .build()))
                        .build())
                    .documents(JsonNullable.of(null))
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
| `atsCreateApplicationRequestDto`                                                            | [AtsCreateApplicationRequestDto](../../models/components/AtsCreateApplicationRequestDto.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |

### Response

**[AtsCreateApplicationResponse](../../models/operations/AtsCreateApplicationResponse.md)**

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

## getApplication

Get Application

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_application" method="get" path="/unified/ats/applications/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetApplicationRequest req = AtsGetApplicationRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,candidate_id,remote_candidate_id,job_id,remote_job_id,job_posting_id,remote_job_posting_id,interview_stage,interview_stage_id,remote_interview_stage_id,rejected_reason,rejected_reason_id,remote_rejected_reason_id,rejected_reason_ids,remote_rejected_reason_ids,rejected_reasons,rejected_at,location_id,remote_location_id,location_ids,remote_location_ids,status,application_status,questionnaires,attachments,result_links,source,created_at,updated_at,documents,custom_fields,candidate")
                .expand("documents")
                .include("attachments,custom_fields")
                .build();

        AtsGetApplicationResponse res = sdk.ats().getApplication()
                .request(req)
                .call();

        if (res.applicationResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [AtsGetApplicationRequest](../../models/operations/AtsGetApplicationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[AtsGetApplicationResponse](../../models/operations/AtsGetApplicationResponse.md)**

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

## updateApplication

Update Application

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_update_application" method="patch" path="/unified/ats/applications/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsUpdateApplicationResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsUpdateApplicationResponse res = sdk.ats().updateApplication()
                .xAccountId("<id>")
                .id("<id>")
                .atsUpdateApplicationRequestDto(AtsUpdateApplicationRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .customFields(List.of(
                        CustomFields.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Training Completion Status")
                            .value(CustomFieldsValue.of("Completed"))
                            .valueId("value_456")
                            .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .build()))
                    .applicationStatus(AtsUpdateApplicationRequestDtoApplicationStatus.builder()
                        .value(AtsUpdateApplicationRequestDtoValue.HIRED)
                        .sourceValue(AtsUpdateApplicationRequestDtoSourceValue.of("Hired"))
                        .build())
                    .source(AtsUpdateApplicationRequestDtoSource.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("LinkedIn")
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                | *String*                                                                                    | :heavy_check_mark:                                                                          | The account identifier                                                                      |
| `id`                                                                                        | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `atsUpdateApplicationRequestDto`                                                            | [AtsUpdateApplicationRequestDto](../../models/components/AtsUpdateApplicationRequestDto.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |

### Response

**[AtsUpdateApplicationResponse](../../models/operations/AtsUpdateApplicationResponse.md)**

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

## listApplicationsOffers

List Application Offers

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_applications_offers" method="get" path="/unified/ats/applications/{id}/offers" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationsOffersRequest req = AtsListApplicationsOffersRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,application_id,remote_application_id,start_date,status,offer_status,salary,currency,created_at,updated_at,offer_history")
                .filter(AtsListApplicationsOffersQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listApplicationsOffers()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationsOffersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AtsListApplicationsOffersRequest](../../models/operations/AtsListApplicationsOffersRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AtsListApplicationsOffersResponse](../../models/operations/AtsListApplicationsOffersResponse.md)**

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

## moveApplication

Move Application

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_move_application" method="post" path="/unified/ats/applications/{id}/move" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.AtsMoveApplicationRequestDto;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsMoveApplicationResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsMoveApplicationResponse res = sdk.ats().moveApplication()
                .xAccountId("<id>")
                .id("<id>")
                .atsMoveApplicationRequestDto(AtsMoveApplicationRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .interviewStageId("f223d7f6-908b-48f0-9237-b201c307f609")
                    .build())
                .call();

        if (res.moveApplicationResult().isPresent()) {
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
| `atsMoveApplicationRequestDto`                                                          | [AtsMoveApplicationRequestDto](../../models/components/AtsMoveApplicationRequestDto.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |

### Response

**[AtsMoveApplicationResponse](../../models/operations/AtsMoveApplicationResponse.md)**

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

## rejectApplication

Reject Application

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_reject_application" method="post" path="/unified/ats/applications/{id}/reject" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.AtsRejectApplicationRequestDto;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsRejectApplicationResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsRejectApplicationResponse res = sdk.ats().rejectApplication()
                .xAccountId("<id>")
                .id("<id>")
                .atsRejectApplicationRequestDto(AtsRejectApplicationRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .rejectedReasonId("f223d7f6-908b-48f0-9237-b201c307f609")
                    .build())
                .call();

        if (res.rejectApplicationResult().isPresent()) {
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
| `atsRejectApplicationRequestDto`                                                            | [AtsRejectApplicationRequestDto](../../models/components/AtsRejectApplicationRequestDto.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |

### Response

**[AtsRejectApplicationResponse](../../models/operations/AtsRejectApplicationResponse.md)**

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

## getApplicationOffer

Get Application Offer

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_application_offer" method="get" path="/unified/ats/applications/{id}/offers/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationOfferRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationOfferResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetApplicationOfferRequest req = AtsGetApplicationOfferRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,application_id,remote_application_id,start_date,status,offer_status,salary,currency,created_at,updated_at,offer_history")
                .build();

        AtsGetApplicationOfferResponse res = sdk.ats().getApplicationOffer()
                .request(req)
                .call();

        if (res.offersResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AtsGetApplicationOfferRequest](../../models/operations/AtsGetApplicationOfferRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AtsGetApplicationOfferResponse](../../models/operations/AtsGetApplicationOfferResponse.md)**

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

## listApplicationScorecards

List Application Scorecards

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_application_scorecards" method="get" path="/unified/ats/applications/{id}/scorecards" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationScorecardsRequest req = AtsListApplicationScorecardsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,sections,label,candidate_id,remote_candidate_id,application_id,remote_application_id,interview_id,remote_interview_id,author_id,remote_author_id,overall_recommendation,created_at,updated_at")
                .filter(AtsListApplicationScorecardsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listApplicationScorecards()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationScorecardsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AtsListApplicationScorecardsRequest](../../models/operations/AtsListApplicationScorecardsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AtsListApplicationScorecardsResponse](../../models/operations/AtsListApplicationScorecardsResponse.md)**

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

## getApplicationScorecard

Get Application Scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_application_scorecard" method="get" path="/unified/ats/applications/{id}/scorecards/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationScorecardRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationScorecardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetApplicationScorecardRequest req = AtsGetApplicationScorecardRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,sections,label,candidate_id,remote_candidate_id,application_id,remote_application_id,interview_id,remote_interview_id,author_id,remote_author_id,overall_recommendation,created_at,updated_at")
                .build();

        AtsGetApplicationScorecardResponse res = sdk.ats().getApplicationScorecard()
                .request(req)
                .call();

        if (res.scorecardsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AtsGetApplicationScorecardRequest](../../models/operations/AtsGetApplicationScorecardRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AtsGetApplicationScorecardResponse](../../models/operations/AtsGetApplicationScorecardResponse.md)**

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

## listApplicationChanges

List Application Changes

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_application_changes" method="get" path="/unified/ats/applications/{id}/changes" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationChangesRequest req = AtsListApplicationChangesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("event_id,remote_event_id,created_at,effective_at,change_type,actor,new_values")
                .filter(AtsListApplicationChangesQueryParamFilter.builder()
                    .createdAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listApplicationChanges()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationChangesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AtsListApplicationChangesRequest](../../models/operations/AtsListApplicationChangesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AtsListApplicationChangesResponse](../../models/operations/AtsListApplicationChangesResponse.md)**

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

## listApplicationNotes

List Application Notes

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_application_notes" method="get" path="/unified/ats/applications/{id}/notes" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationNotesRequest req = AtsListApplicationNotesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,content,author_id,remote_author_id,visibility,created_at,updated_at,deleted_at")
                .filter(AtsListApplicationNotesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listApplicationNotes()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationNotesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AtsListApplicationNotesRequest](../../models/operations/AtsListApplicationNotesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AtsListApplicationNotesResponse](../../models/operations/AtsListApplicationNotesResponse.md)**

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

## createApplicationNote

Create Application Note

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_create_application_note" method="post" path="/unified/ats/applications/{id}/notes" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsCreateApplicationNoteResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsCreateApplicationNoteResponse res = sdk.ats().createApplicationNote()
                .xAccountId("<id>")
                .id("<id>")
                .atsCreateNotesRequestDto(AtsCreateNotesRequestDto.builder()
                    .content(List.of(
                        NoteContentApiModel.builder()
                            .body("This candidate seems like a good fit for the role")
                            .build()))
                    .authorId("1234567890")
                    .visibility(AtsCreateNotesRequestDtoVisibility.builder()
                        .value(AtsCreateNotesRequestDtoValue.PUBLIC)
                        .sourceValue(AtsCreateNotesRequestDtoSourceValue.of("Public"))
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `xAccountId`                                                                    | *String*                                                                        | :heavy_check_mark:                                                              | The account identifier                                                          |
| `id`                                                                            | *String*                                                                        | :heavy_check_mark:                                                              | N/A                                                                             |
| `atsCreateNotesRequestDto`                                                      | [AtsCreateNotesRequestDto](../../models/components/AtsCreateNotesRequestDto.md) | :heavy_check_mark:                                                              | N/A                                                                             |

### Response

**[AtsCreateApplicationNoteResponse](../../models/operations/AtsCreateApplicationNoteResponse.md)**

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

## getApplicationNote

Get Application Note

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_application_note" method="get" path="/unified/ats/applications/{id}/notes/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationNoteRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationNoteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetApplicationNoteRequest req = AtsGetApplicationNoteRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,content,author_id,remote_author_id,visibility,created_at,updated_at,deleted_at")
                .build();

        AtsGetApplicationNoteResponse res = sdk.ats().getApplicationNote()
                .request(req)
                .call();

        if (res.noteResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AtsGetApplicationNoteRequest](../../models/operations/AtsGetApplicationNoteRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AtsGetApplicationNoteResponse](../../models/operations/AtsGetApplicationNoteResponse.md)**

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

## updateApplicationNote

Update Application Note

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_update_application_note" method="patch" path="/unified/ats/applications/{id}/notes/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsUpdateApplicationNoteResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsUpdateApplicationNoteResponse res = sdk.ats().updateApplicationNote()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .atsUpdateNotesRequestDto(AtsUpdateNotesRequestDto.builder()
                    .content(List.of(
                        NoteContentApiModel.builder()
                            .body("This candidate seems like a good fit for the role")
                            .build()))
                    .authorId("1234567890")
                    .visibility(AtsUpdateNotesRequestDtoVisibility.builder()
                        .value(AtsUpdateNotesRequestDtoValue.PUBLIC)
                        .sourceValue(AtsUpdateNotesRequestDtoSourceValue.of("Public"))
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `xAccountId`                                                                    | *String*                                                                        | :heavy_check_mark:                                                              | The account identifier                                                          |
| `id`                                                                            | *String*                                                                        | :heavy_check_mark:                                                              | N/A                                                                             |
| `subResourceId`                                                                 | *String*                                                                        | :heavy_check_mark:                                                              | N/A                                                                             |
| `atsUpdateNotesRequestDto`                                                      | [AtsUpdateNotesRequestDto](../../models/components/AtsUpdateNotesRequestDto.md) | :heavy_check_mark:                                                              | N/A                                                                             |

### Response

**[AtsUpdateApplicationNoteResponse](../../models/operations/AtsUpdateApplicationNoteResponse.md)**

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

## listApplicationsScheduledInterviews

List Applications scheduled interviews

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_applications_scheduled_interviews" method="get" path="/unified/ats/applications/{id}/scheduled_interviews" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationsScheduledInterviewsRequest req = AtsListApplicationsScheduledInterviewsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,application_id,remote_application_id,interview_stage_id,remote_interview_stage_id,interview_stage,status,interview_status,interviewer_ids,remote_interviewer_ids,interview_parts,interviewers,start_at,end_at,meeting_url,created_at,updated_at")
                .filter(AtsListApplicationsScheduledInterviewsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listApplicationsScheduledInterviews()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationsScheduledInterviewsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [AtsListApplicationsScheduledInterviewsRequest](../../models/operations/AtsListApplicationsScheduledInterviewsRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[AtsListApplicationsScheduledInterviewsResponse](../../models/operations/AtsListApplicationsScheduledInterviewsResponse.md)**

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

## getApplicationScheduledInterview

Get Applications scheduled interview

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_application_scheduled_interview" method="get" path="/unified/ats/applications/{id}/scheduled_interviews/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationScheduledInterviewRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationScheduledInterviewResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetApplicationScheduledInterviewRequest req = AtsGetApplicationScheduledInterviewRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,candidate_id,remote_candidate_id,job_id,remote_job_id,job_posting_id,remote_job_posting_id,interview_stage,interview_stage_id,remote_interview_stage_id,rejected_reason,rejected_reason_id,remote_rejected_reason_id,rejected_reason_ids,remote_rejected_reason_ids,rejected_reasons,rejected_at,location_id,remote_location_id,location_ids,remote_location_ids,status,application_status,questionnaires,attachments,result_links,source,created_at,updated_at,documents,custom_fields,candidate")
                .build();

        AtsGetApplicationScheduledInterviewResponse res = sdk.ats().getApplicationScheduledInterview()
                .request(req)
                .call();

        if (res.scheduledInterviewsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [AtsGetApplicationScheduledInterviewRequest](../../models/operations/AtsGetApplicationScheduledInterviewRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[AtsGetApplicationScheduledInterviewResponse](../../models/operations/AtsGetApplicationScheduledInterviewResponse.md)**

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

## uploadApplicationDocument

Upload Application Document

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_upload_application_document" method="post" path="/unified/ats/applications/{id}/documents/upload" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsUploadApplicationDocumentResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsUploadApplicationDocumentResponse res = sdk.ats().uploadApplicationDocument()
                .xAccountId("<id>")
                .id("<id>")
                .unifiedUploadRequestDto(UnifiedUploadRequestDto.builder()
                    .name("weather-forecast")
                    .fileFormat(JsonNullable.of(null))
                    .content("VGhpcyBpc24ndCByZWFsbHkgYSBzYW1wbGUgZmlsZSwgYnV0IG5vIG9uZSB3aWxsIGV2ZXIga25vdyE")
                    .categoryId("6530")
                    .path("/path/to/file")
                    .category(UnifiedUploadRequestDtoCategory.builder()
                        .value("reports, resumes")
                        .sourceValue("550e8400-e29b-41d4-a716-446655440000, CUSTOM_CATEGORY_NAME")
                        .build())
                    .confidential(UnifiedUploadRequestDtoConfidential.builder()
                        .value(UnifiedUploadRequestDtoConfidentialValue.TRUE)
                        .sourceValue(UnifiedUploadRequestDtoConfidentialSourceValue.of("public"))
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

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `xAccountId`                                                                  | *String*                                                                      | :heavy_check_mark:                                                            | The account identifier                                                        |
| `id`                                                                          | *String*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           |
| `unifiedUploadRequestDto`                                                     | [UnifiedUploadRequestDto](../../models/components/UnifiedUploadRequestDto.md) | :heavy_check_mark:                                                            | N/A                                                                           |

### Response

**[AtsUploadApplicationDocumentResponse](../../models/operations/AtsUploadApplicationDocumentResponse.md)**

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

## downloadApplicationDocument

Download Application Document

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_download_application_document" method="get" path="/unified/ats/applications/{id}/documents/{subResourceId}/download" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsDownloadApplicationDocumentRequest;
import com.stackone.stackone_client_java.models.operations.AtsDownloadApplicationDocumentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsDownloadApplicationDocumentRequest req = AtsDownloadApplicationDocumentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .format("base64")
                .exportFormat("text/plain")
                .build();

        AtsDownloadApplicationDocumentResponse res = sdk.ats().downloadApplicationDocument()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AtsDownloadApplicationDocumentRequest](../../models/operations/AtsDownloadApplicationDocumentRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AtsDownloadApplicationDocumentResponse](../../models/operations/AtsDownloadApplicationDocumentResponse.md)**

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

## listApplicationDocuments

List Application Documents

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_application_documents" method="get" path="/unified/ats/applications/{id}/documents" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationDocumentsRequest req = AtsListApplicationDocumentsRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,path,type,category,category_id,remote_category_id,contents,created_at,updated_at,remote_url,file_format")
                .filter(AtsListApplicationDocumentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listApplicationDocuments()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationDocumentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AtsListApplicationDocumentsRequest](../../models/operations/AtsListApplicationDocumentsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AtsListApplicationDocumentsResponse](../../models/operations/AtsListApplicationDocumentsResponse.md)**

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

## getApplicationDocument

Get Application Document

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_application_document" method="get" path="/unified/ats/applications/{id}/documents/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationDocumentRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationDocumentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetApplicationDocumentRequest req = AtsGetApplicationDocumentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,name,path,type,category,category_id,remote_category_id,contents,created_at,updated_at,remote_url,file_format")
                .build();

        AtsGetApplicationDocumentResponse res = sdk.ats().getApplicationDocument()
                .request(req)
                .call();

        if (res.atsDocumentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AtsGetApplicationDocumentRequest](../../models/operations/AtsGetApplicationDocumentRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AtsGetApplicationDocumentResponse](../../models/operations/AtsGetApplicationDocumentResponse.md)**

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

## listCandidates

List Candidates

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_candidates" method="get" path="/unified/ats/candidates" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListCandidatesRequest req = AtsListCandidatesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,first_name,last_name,email,emails,social_links,phone,phone_numbers,company,country,title,application_ids,remote_application_ids,hired_at,custom_fields,created_at,updated_at")
                .filter(AtsListCandidatesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .createdAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .include("custom_fields")
                .build();

        sdk.ats().listCandidates()
                .request(req)
                .callAsStream()
                .forEach((AtsListCandidatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [AtsListCandidatesRequest](../../models/operations/AtsListCandidatesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[AtsListCandidatesResponse](../../models/operations/AtsListCandidatesResponse.md)**

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

## createCandidate

Create Candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_create_candidate" method="post" path="/unified/ats/candidates" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsCreateCandidateResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsCreateCandidateResponse res = sdk.ats().createCandidate()
                .xAccountId("<id>")
                .atsCreateCandidateRequestDto(AtsCreateCandidateRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .phoneNumbers(List.of(
                        PhoneNumber.builder()
                            .phone("+447700112233")
                            .build()))
                    .name("Romain Sestier")
                    .firstName("Romain")
                    .lastName("Sestier")
                    .email("sestier.romain123@gmail.com")
                    .socialLinks(List.of(
                        SocialLink.builder()
                            .type("linkedin")
                            .url("https://www.linkedin.com/in/romainsestier/")
                            .build()))
                    .company("Company Inc.")
                    .title("Software Engineer")
                    .hiredAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .country("United States")
                    .customFields(List.of(
                        CustomFields.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Training Completion Status")
                            .value(CustomFieldsValue.of("Completed"))
                            .valueId("value_456")
                            .remoteValueId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
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

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `xAccountId`                                                                            | *String*                                                                                | :heavy_check_mark:                                                                      | The account identifier                                                                  |
| `atsCreateCandidateRequestDto`                                                          | [AtsCreateCandidateRequestDto](../../models/components/AtsCreateCandidateRequestDto.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |

### Response

**[AtsCreateCandidateResponse](../../models/operations/AtsCreateCandidateResponse.md)**

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

## getCandidate

Get Candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_candidate" method="get" path="/unified/ats/candidates/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetCandidateRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetCandidateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetCandidateRequest req = AtsGetCandidateRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,first_name,last_name,email,emails,social_links,phone,phone_numbers,company,country,title,application_ids,remote_application_ids,hired_at,custom_fields,created_at,updated_at")
                .include("custom_fields")
                .build();

        AtsGetCandidateResponse res = sdk.ats().getCandidate()
                .request(req)
                .call();

        if (res.candidateResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [AtsGetCandidateRequest](../../models/operations/AtsGetCandidateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[AtsGetCandidateResponse](../../models/operations/AtsGetCandidateResponse.md)**

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

## updateCandidate

Update Candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_update_candidate" method="patch" path="/unified/ats/candidates/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsUpdateCandidateResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsUpdateCandidateResponse res = sdk.ats().updateCandidate()
                .xAccountId("<id>")
                .id("<id>")
                .atsUpdateCandidateRequestDto(AtsUpdateCandidateRequestDto.builder()
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .name("Romain Sestier")
                    .firstName("Romain")
                    .lastName("Sestier")
                    .email("sestier.romain123@gmail.com")
                    .emails(List.of(
                        CandidateEmail.builder()
                            .type("personal")
                            .value("sestier.romain123@gmail.com")
                            .build()))
                    .socialLinks(List.of(
                        SocialLink.builder()
                            .type("linkedin")
                            .url("https://www.linkedin.com/in/romainsestier/")
                            .build()))
                    .phoneNumbers(List.of(
                        PhoneNumber.builder()
                            .phone("+447700112233")
                            .build()))
                    .company("Company Inc.")
                    .title("Software Engineer")
                    .applicationIds(List.of(
                        "123e4567-e89b-12d3-a456-426614174000",
                        "523e1234-e89b-fdd2-a456-762545121101"))
                    .hiredAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .country("United States")
                    .customFields(JsonNullable.of(null))
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
| `atsUpdateCandidateRequestDto`                                                          | [AtsUpdateCandidateRequestDto](../../models/components/AtsUpdateCandidateRequestDto.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |

### Response

**[AtsUpdateCandidateResponse](../../models/operations/AtsUpdateCandidateResponse.md)**

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

## listCandidateNotes

List Candidate Notes

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_candidate_notes" method="get" path="/unified/ats/candidates/{id}/notes" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListCandidateNotesRequest req = AtsListCandidateNotesRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,content,author_id,remote_author_id,visibility,created_at,updated_at,deleted_at")
                .filter(AtsListCandidateNotesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listCandidateNotes()
                .request(req)
                .callAsStream()
                .forEach((AtsListCandidateNotesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AtsListCandidateNotesRequest](../../models/operations/AtsListCandidateNotesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AtsListCandidateNotesResponse](../../models/operations/AtsListCandidateNotesResponse.md)**

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

## createCandidateNote

Create Candidate Note

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_create_candidate_note" method="post" path="/unified/ats/candidates/{id}/notes" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsCreateCandidateNoteResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsCreateCandidateNoteResponse res = sdk.ats().createCandidateNote()
                .xAccountId("<id>")
                .id("<id>")
                .atsCreateNotesRequestDto(AtsCreateNotesRequestDto.builder()
                    .content(List.of(
                        NoteContentApiModel.builder()
                            .body("This candidate seems like a good fit for the role")
                            .build()))
                    .authorId("1234567890")
                    .visibility(AtsCreateNotesRequestDtoVisibility.builder()
                        .value(AtsCreateNotesRequestDtoValue.PUBLIC)
                        .sourceValue(AtsCreateNotesRequestDtoSourceValue.of("Public"))
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `xAccountId`                                                                    | *String*                                                                        | :heavy_check_mark:                                                              | The account identifier                                                          |
| `id`                                                                            | *String*                                                                        | :heavy_check_mark:                                                              | N/A                                                                             |
| `atsCreateNotesRequestDto`                                                      | [AtsCreateNotesRequestDto](../../models/components/AtsCreateNotesRequestDto.md) | :heavy_check_mark:                                                              | N/A                                                                             |

### Response

**[AtsCreateCandidateNoteResponse](../../models/operations/AtsCreateCandidateNoteResponse.md)**

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

## getCandidateNote

Get Candidate Note

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_candidate_note" method="get" path="/unified/ats/candidates/{id}/notes/{subResourceId}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetCandidateNoteRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetCandidateNoteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetCandidateNoteRequest req = AtsGetCandidateNoteRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .subResourceId("<id>")
                .fields("id,remote_id,content,author_id,remote_author_id,visibility,created_at,updated_at,deleted_at")
                .build();

        AtsGetCandidateNoteResponse res = sdk.ats().getCandidateNote()
                .request(req)
                .call();

        if (res.noteResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [AtsGetCandidateNoteRequest](../../models/operations/AtsGetCandidateNoteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[AtsGetCandidateNoteResponse](../../models/operations/AtsGetCandidateNoteResponse.md)**

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

## listApplicationCustomFieldDefinitions

List Application Custom Field Definitions

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_application_custom_field_definitions" method="get" path="/unified/ats/custom_field_definitions/applications" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsListApplicationCustomFieldDefinitionsRequest;
import com.stackone.stackone_client_java.models.operations.AtsListApplicationCustomFieldDefinitionsResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationCustomFieldDefinitionsRequest req = AtsListApplicationCustomFieldDefinitionsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,type,options")
                .filter(JsonNullable.of(null))
                .build();

        sdk.ats().listApplicationCustomFieldDefinitions()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationCustomFieldDefinitionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [AtsListApplicationCustomFieldDefinitionsRequest](../../models/operations/AtsListApplicationCustomFieldDefinitionsRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |

### Response

**[AtsListApplicationCustomFieldDefinitionsResponse](../../models/operations/AtsListApplicationCustomFieldDefinitionsResponse.md)**

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

## getApplicationCustomFieldDefinition

Get Application Custom Field Definition

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_application_custom_field_definition" method="get" path="/unified/ats/custom_field_definitions/applications/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationCustomFieldDefinitionRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationCustomFieldDefinitionResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetApplicationCustomFieldDefinitionRequest req = AtsGetApplicationCustomFieldDefinitionRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,type,options")
                .filter(JsonNullable.of(null))
                .build();

        AtsGetApplicationCustomFieldDefinitionResponse res = sdk.ats().getApplicationCustomFieldDefinition()
                .request(req)
                .call();

        if (res.customFieldDefinitionResultApiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [AtsGetApplicationCustomFieldDefinitionRequest](../../models/operations/AtsGetApplicationCustomFieldDefinitionRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[AtsGetApplicationCustomFieldDefinitionResponse](../../models/operations/AtsGetApplicationCustomFieldDefinitionResponse.md)**

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

## listCandidateCustomFieldDefinitions

List Candidate Custom Field Definitions

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_candidate_custom_field_definitions" method="get" path="/unified/ats/custom_field_definitions/candidates" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListCandidateCustomFieldDefinitionsRequest req = AtsListCandidateCustomFieldDefinitionsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,type,options")
                .filter(AtsListCandidateCustomFieldDefinitionsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listCandidateCustomFieldDefinitions()
                .request(req)
                .callAsStream()
                .forEach((AtsListCandidateCustomFieldDefinitionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [AtsListCandidateCustomFieldDefinitionsRequest](../../models/operations/AtsListCandidateCustomFieldDefinitionsRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[AtsListCandidateCustomFieldDefinitionsResponse](../../models/operations/AtsListCandidateCustomFieldDefinitionsResponse.md)**

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

## getCandidateCustomFieldDefinition

Get Candidate Custom Field Definition

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_candidate_custom_field_definition" method="get" path="/unified/ats/custom_field_definitions/candidates/{id}" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetCandidateCustomFieldDefinitionRequest req = AtsGetCandidateCustomFieldDefinitionRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,type,options")
                .filter(AtsGetCandidateCustomFieldDefinitionQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        AtsGetCandidateCustomFieldDefinitionResponse res = sdk.ats().getCandidateCustomFieldDefinition()
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
| `request`                                                                                                             | [AtsGetCandidateCustomFieldDefinitionRequest](../../models/operations/AtsGetCandidateCustomFieldDefinitionRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[AtsGetCandidateCustomFieldDefinitionResponse](../../models/operations/AtsGetCandidateCustomFieldDefinitionResponse.md)**

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

## listJobCustomFieldDefinitions

List Job Custom Field Definitions

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_job_custom_field_definitions" method="get" path="/unified/ats/custom_field_definitions/jobs" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListJobCustomFieldDefinitionsRequest req = AtsListJobCustomFieldDefinitionsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,type,options")
                .filter(AtsListJobCustomFieldDefinitionsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listJobCustomFieldDefinitions()
                .request(req)
                .callAsStream()
                .forEach((AtsListJobCustomFieldDefinitionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [AtsListJobCustomFieldDefinitionsRequest](../../models/operations/AtsListJobCustomFieldDefinitionsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[AtsListJobCustomFieldDefinitionsResponse](../../models/operations/AtsListJobCustomFieldDefinitionsResponse.md)**

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

## getJobCustomFieldDefinition

Get Job Custom Field Definition

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_job_custom_field_definition" method="get" path="/unified/ats/custom_field_definitions/jobs/{id}" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetJobCustomFieldDefinitionRequest req = AtsGetJobCustomFieldDefinitionRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,type,options")
                .filter(AtsGetJobCustomFieldDefinitionQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        AtsGetJobCustomFieldDefinitionResponse res = sdk.ats().getJobCustomFieldDefinition()
                .request(req)
                .call();

        if (res.customFieldDefinitionResultApiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AtsGetJobCustomFieldDefinitionRequest](../../models/operations/AtsGetJobCustomFieldDefinitionRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AtsGetJobCustomFieldDefinitionResponse](../../models/operations/AtsGetJobCustomFieldDefinitionResponse.md)**

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

## listDepartments

List Departments

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_departments" method="get" path="/unified/ats/departments" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListDepartmentsRequest req = AtsListDepartmentsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name")
                .filter(AtsListDepartmentsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listDepartments()
                .request(req)
                .callAsStream()
                .forEach((AtsListDepartmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AtsListDepartmentsRequest](../../models/operations/AtsListDepartmentsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AtsListDepartmentsResponse](../../models/operations/AtsListDepartmentsResponse.md)**

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

## getDepartment

Get Department

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_department" method="get" path="/unified/ats/departments/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetDepartmentRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetDepartmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetDepartmentRequest req = AtsGetDepartmentRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name")
                .build();

        AtsGetDepartmentResponse res = sdk.ats().getDepartment()
                .request(req)
                .call();

        if (res.departmentResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [AtsGetDepartmentRequest](../../models/operations/AtsGetDepartmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[AtsGetDepartmentResponse](../../models/operations/AtsGetDepartmentResponse.md)**

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

## listInterviewStages

List Interview Stages

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_interview_stages" method="get" path="/unified/ats/interview_stages" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListInterviewStagesRequest req = AtsListInterviewStagesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,order,created_at,updated_at")
                .filter(AtsListInterviewStagesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listInterviewStages()
                .request(req)
                .callAsStream()
                .forEach((AtsListInterviewStagesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AtsListInterviewStagesRequest](../../models/operations/AtsListInterviewStagesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AtsListInterviewStagesResponse](../../models/operations/AtsListInterviewStagesResponse.md)**

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

## getInterviewStage

Get Interview Stage

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_interview_stage" method="get" path="/unified/ats/interview_stages/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetInterviewStageRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetInterviewStageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetInterviewStageRequest req = AtsGetInterviewStageRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,order,created_at,updated_at")
                .build();

        AtsGetInterviewStageResponse res = sdk.ats().getInterviewStage()
                .request(req)
                .call();

        if (res.interviewStageResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AtsGetInterviewStageRequest](../../models/operations/AtsGetInterviewStageRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AtsGetInterviewStageResponse](../../models/operations/AtsGetInterviewStageResponse.md)**

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

## listInterviews

List Interviews

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_interviews" method="get" path="/unified/ats/interviews" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListInterviewsRequest req = AtsListInterviewsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,application_id,remote_application_id,interview_stage_id,remote_interview_stage_id,interview_stage,status,interview_status,interviewer_ids,remote_interviewer_ids,interview_parts,interviewers,start_at,end_at,meeting_url,created_at,updated_at")
                .filter(AtsListInterviewsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .createdAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listInterviews()
                .request(req)
                .callAsStream()
                .forEach((AtsListInterviewsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [AtsListInterviewsRequest](../../models/operations/AtsListInterviewsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[AtsListInterviewsResponse](../../models/operations/AtsListInterviewsResponse.md)**

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

## getInterview

Get Interview

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_interview" method="get" path="/unified/ats/interviews/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetInterviewRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetInterviewResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetInterviewRequest req = AtsGetInterviewRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,application_id,remote_application_id,interview_stage_id,remote_interview_stage_id,interview_stage,status,interview_status,interviewer_ids,remote_interviewer_ids,interview_parts,interviewers,start_at,end_at,meeting_url,created_at,updated_at")
                .build();

        AtsGetInterviewResponse res = sdk.ats().getInterview()
                .request(req)
                .call();

        if (res.interviewsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [AtsGetInterviewRequest](../../models/operations/AtsGetInterviewRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[AtsGetInterviewResponse](../../models/operations/AtsGetInterviewResponse.md)**

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

<!-- UsageSnippet language="java" operationID="ats_list_jobs" method="get" path="/unified/ats/jobs" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListJobsRequest req = AtsListJobsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,code,title,description,status,job_status,department_ids,remote_department_ids,location_ids,remote_location_ids,hiring_team,interview_stages,confidential,custom_fields,created_at,updated_at")
                .filter(AtsListJobsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .createdAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("job_postings,interview_stages")
                .include("custom_fields")
                .build();

        sdk.ats().listJobs()
                .request(req)
                .callAsStream()
                .forEach((AtsListJobsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [AtsListJobsRequest](../../models/operations/AtsListJobsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[AtsListJobsResponse](../../models/operations/AtsListJobsResponse.md)**

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

## createJob

Create Job

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_create_job" method="post" path="/unified/ats/jobs" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsCreateJobResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsCreateJobResponse res = sdk.ats().createJob()
                .xAccountId("<id>")
                .atsCreateJobRequestDto(AtsCreateJobRequestDto.builder()
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .code("184919")
                    .title("Software Engineer")
                    .description("Responsible for identifying business requirements")
                    .jobStatus(AtsCreateJobRequestDtoJobStatus.builder()
                        .value(AtsCreateJobRequestDtoValue.PUBLISHED)
                        .sourceValue(AtsCreateJobRequestDtoSourceValue.of("Published"))
                        .build())
                    .departmentIds(List.of(
                        "308570",
                        "308571",
                        "308572"))
                    .locationIds(List.of(
                        "668570",
                        "678571",
                        "688572"))
                    .hiringTeam(List.of(
                        JobHiringTeam.builder()
                            .userId("123456")
                            .remoteUserId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .firstName("John")
                            .lastName("Doe")
                            .email("john.doe@gmail.com")
                            .role("Software Engineer")
                            .build()))
                    .interviewStages(List.of(
                        InterviewStage.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .unifiedCustomFields(Map.ofEntries(
                                Map.entry("my_project_custom_field_1", "REF-1236"),
                                Map.entry("my_project_custom_field_2", "some other value")))
                            .createdAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                            .updatedAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                            .build()))
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

        if (res.createResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `xAccountId`                                                                | *String*                                                                    | :heavy_check_mark:                                                          | The account identifier                                                      |
| `atsCreateJobRequestDto`                                                    | [AtsCreateJobRequestDto](../../models/components/AtsCreateJobRequestDto.md) | :heavy_check_mark:                                                          | N/A                                                                         |

### Response

**[AtsCreateJobResponse](../../models/operations/AtsCreateJobResponse.md)**

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

<!-- UsageSnippet language="java" operationID="ats_get_job" method="get" path="/unified/ats/jobs/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetJobRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetJobRequest req = AtsGetJobRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,code,title,description,status,job_status,department_ids,remote_department_ids,location_ids,remote_location_ids,hiring_team,interview_stages,confidential,custom_fields,created_at,updated_at")
                .expand("job_postings,interview_stages")
                .include("custom_fields")
                .build();

        AtsGetJobResponse res = sdk.ats().getJob()
                .request(req)
                .call();

        if (res.jobResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [AtsGetJobRequest](../../models/operations/AtsGetJobRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[AtsGetJobResponse](../../models/operations/AtsGetJobResponse.md)**

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

## updateJob

Update Job

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_update_job" method="patch" path="/unified/ats/jobs/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsUpdateJobResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsUpdateJobResponse res = sdk.ats().updateJob()
                .xAccountId("<id>")
                .id("<id>")
                .atsUpdateJobRequestDto(AtsUpdateJobRequestDto.builder()
                    .unifiedCustomFields(Map.ofEntries(
                        Map.entry("my_project_custom_field_1", "REF-1236"),
                        Map.entry("my_project_custom_field_2", "some other value")))
                    .code("184919")
                    .title("Software Engineer")
                    .description("Responsible for identifying business requirements")
                    .jobStatus(AtsUpdateJobRequestDtoJobStatus.builder()
                        .value(AtsUpdateJobRequestDtoValue.PUBLISHED)
                        .sourceValue(AtsUpdateJobRequestDtoSourceValue.of("Published"))
                        .build())
                    .departmentIds(List.of(
                        "308570",
                        "308571",
                        "308572"))
                    .locationIds(List.of(
                        "668570",
                        "678571",
                        "688572"))
                    .hiringTeam(List.of(
                        JobHiringTeam.builder()
                            .userId("123456")
                            .remoteUserId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                            .firstName("John")
                            .lastName("Doe")
                            .email("john.doe@gmail.com")
                            .role("Software Engineer")
                            .build()))
                    .interviewStages(JsonNullable.of(null))
                    .customFields(JsonNullable.of(null))
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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `xAccountId`                                                                | *String*                                                                    | :heavy_check_mark:                                                          | The account identifier                                                      |
| `id`                                                                        | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         |
| `atsUpdateJobRequestDto`                                                    | [AtsUpdateJobRequestDto](../../models/components/AtsUpdateJobRequestDto.md) | :heavy_check_mark:                                                          | N/A                                                                         |

### Response

**[AtsUpdateJobResponse](../../models/operations/AtsUpdateJobResponse.md)**

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

## listLists

Get all Lists

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_lists" method="get" path="/unified/ats/lists" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsListListsRequest;
import com.stackone.stackone_client_java.models.operations.AtsListListsResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListListsRequest req = AtsListListsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,created_at,updated_at,items,type")
                .filter(JsonNullable.of(null))
                .build();

        sdk.ats().listLists()
                .request(req)
                .callAsStream()
                .forEach((AtsListListsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AtsListListsRequest](../../models/operations/AtsListListsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[AtsListListsResponse](../../models/operations/AtsListListsResponse.md)**

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

## getList

Get List

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_list" method="get" path="/unified/ats/lists/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetListRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetListRequest req = AtsGetListRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,created_at,updated_at,items,type")
                .build();

        AtsGetListResponse res = sdk.ats().getList()
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
| `request`                                                         | [AtsGetListRequest](../../models/operations/AtsGetListRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[AtsGetListResponse](../../models/operations/AtsGetListResponse.md)**

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

List locations

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_locations" method="get" path="/unified/ats/locations" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListLocationsRequest req = AtsListLocationsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name")
                .filter(AtsListLocationsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listLocations()
                .request(req)
                .callAsStream()
                .forEach((AtsListLocationsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [AtsListLocationsRequest](../../models/operations/AtsListLocationsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[AtsListLocationsResponse](../../models/operations/AtsListLocationsResponse.md)**

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

Get Location

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_location" method="get" path="/unified/ats/locations/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetLocationRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetLocationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetLocationRequest req = AtsGetLocationRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name")
                .build();

        AtsGetLocationResponse res = sdk.ats().getLocation()
                .request(req)
                .call();

        if (res.atsLocationResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [AtsGetLocationRequest](../../models/operations/AtsGetLocationRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[AtsGetLocationResponse](../../models/operations/AtsGetLocationResponse.md)**

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

## listRejectedReasons

List Rejected Reasons

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_rejected_reasons" method="get" path="/unified/ats/rejected_reasons" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListRejectedReasonsRequest req = AtsListRejectedReasonsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,label,type,rejected_reason_type")
                .filter(AtsListRejectedReasonsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listRejectedReasons()
                .request(req)
                .callAsStream()
                .forEach((AtsListRejectedReasonsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AtsListRejectedReasonsRequest](../../models/operations/AtsListRejectedReasonsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AtsListRejectedReasonsResponse](../../models/operations/AtsListRejectedReasonsResponse.md)**

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

## getRejectedReason

Get Rejected Reason

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_rejected_reason" method="get" path="/unified/ats/rejected_reasons/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetRejectedReasonRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetRejectedReasonResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetRejectedReasonRequest req = AtsGetRejectedReasonRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,label,type,rejected_reason_type")
                .build();

        AtsGetRejectedReasonResponse res = sdk.ats().getRejectedReason()
                .request(req)
                .call();

        if (res.rejectedReasonResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AtsGetRejectedReasonRequest](../../models/operations/AtsGetRejectedReasonRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AtsGetRejectedReasonResponse](../../models/operations/AtsGetRejectedReasonResponse.md)**

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

List Users

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_users" method="get" path="/unified/ats/users" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsListUsersRequest;
import com.stackone.stackone_client_java.models.operations.AtsListUsersResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListUsersRequest req = AtsListUsersRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,first_name,last_name,name,email,phone")
                .filter(JsonNullable.of(null))
                .build();

        sdk.ats().listUsers()
                .request(req)
                .callAsStream()
                .forEach((AtsListUsersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AtsListUsersRequest](../../models/operations/AtsListUsersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[AtsListUsersResponse](../../models/operations/AtsListUsersResponse.md)**

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

<!-- UsageSnippet language="java" operationID="ats_get_user" method="get" path="/unified/ats/users/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetUserRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetUserRequest req = AtsGetUserRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,first_name,last_name,name,email,phone")
                .build();

        AtsGetUserResponse res = sdk.ats().getUser()
                .request(req)
                .call();

        if (res.userResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [AtsGetUserRequest](../../models/operations/AtsGetUserRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[AtsGetUserResponse](../../models/operations/AtsGetUserResponse.md)**

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

## listJobPostings

List Job Postings

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_job_postings" method="get" path="/unified/ats/job_postings" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListJobPostingsRequest req = AtsListJobPostingsRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,title,locations,internal,status,job_id,remote_job_id,content,compensation,employment_type,employment_contract_type,external_url,external_apply_url,questionnaires,start_date,updated_at,created_at")
                .filter(AtsListJobPostingsQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .createdAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .include("questionnaires")
                .build();

        sdk.ats().listJobPostings()
                .request(req)
                .callAsStream()
                .forEach((AtsListJobPostingsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AtsListJobPostingsRequest](../../models/operations/AtsListJobPostingsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AtsListJobPostingsResponse](../../models/operations/AtsListJobPostingsResponse.md)**

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

## getJobPosting

Get Job Posting

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_job_posting" method="get" path="/unified/ats/job_postings/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetJobPostingRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetJobPostingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetJobPostingRequest req = AtsGetJobPostingRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,title,locations,internal,status,job_id,remote_job_id,content,compensation,employment_type,employment_contract_type,external_url,external_apply_url,questionnaires,start_date,updated_at,created_at")
                .include("questionnaires")
                .build();

        AtsGetJobPostingResponse res = sdk.ats().getJobPosting()
                .request(req)
                .call();

        if (res.jobPostingResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [AtsGetJobPostingRequest](../../models/operations/AtsGetJobPostingRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[AtsGetJobPostingResponse](../../models/operations/AtsGetJobPostingResponse.md)**

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

## listOffers

List Offers

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_offers" method="get" path="/unified/ats/offers" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListOffersRequest req = AtsListOffersRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,application_id,remote_application_id,start_date,status,offer_status,salary,currency,created_at,updated_at,offer_history")
                .filter(AtsListOffersQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listOffers()
                .request(req)
                .callAsStream()
                .forEach((AtsListOffersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AtsListOffersRequest](../../models/operations/AtsListOffersRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[AtsListOffersResponse](../../models/operations/AtsListOffersResponse.md)**

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

## createOffer

Create Offer

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_create_offer" method="post" path="/unified/ats/offers" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsCreateOfferResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsCreateOfferResponse res = sdk.ats().createOffer()
                .xAccountId("<id>")
                .atsCreateOfferRequestDto(AtsCreateOfferRequestDto.builder()
                    .startDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .offerStatus(AtsCreateOfferRequestDtoOfferStatus.builder()
                        .value(AtsCreateOfferRequestDtoValue.PENDING)
                        .sourceValue(AtsCreateOfferRequestDtoSourceValue.of("Pending"))
                        .build())
                    .offerHistory(List.of(
                        OfferHistory.builder()
                            .startDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                            .createdAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                            .updatedAt(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `xAccountId`                                                                    | *String*                                                                        | :heavy_check_mark:                                                              | The account identifier                                                          |
| `atsCreateOfferRequestDto`                                                      | [AtsCreateOfferRequestDto](../../models/components/AtsCreateOfferRequestDto.md) | :heavy_check_mark:                                                              | N/A                                                                             |

### Response

**[AtsCreateOfferResponse](../../models/operations/AtsCreateOfferResponse.md)**

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

## getOffer

Get Offer

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_offer" method="get" path="/unified/ats/offers/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetOfferRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetOfferResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetOfferRequest req = AtsGetOfferRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,application_id,remote_application_id,start_date,status,offer_status,salary,currency,created_at,updated_at,offer_history")
                .build();

        AtsGetOfferResponse res = sdk.ats().getOffer()
                .request(req)
                .call();

        if (res.offersResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [AtsGetOfferRequest](../../models/operations/AtsGetOfferRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[AtsGetOfferResponse](../../models/operations/AtsGetOfferResponse.md)**

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

## listAssessmentsPackages

List Assessments Packages

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_assessments_packages" method="get" path="/unified/ats/assessments/packages" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListAssessmentsPackagesRequest req = AtsListAssessmentsPackagesRequest.builder()
                .xAccountId("<id>")
                .filter(AtsListAssessmentsPackagesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listAssessmentsPackages()
                .request(req)
                .callAsStream()
                .forEach((AtsListAssessmentsPackagesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AtsListAssessmentsPackagesRequest](../../models/operations/AtsListAssessmentsPackagesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AtsListAssessmentsPackagesResponse](../../models/operations/AtsListAssessmentsPackagesResponse.md)**

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

## getAssessmentsPackage

Get Assessments Package

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_assessments_package" method="get" path="/unified/ats/assessments/packages/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetAssessmentsPackageRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetAssessmentsPackageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetAssessmentsPackageRequest req = AtsGetAssessmentsPackageRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .build();

        AtsGetAssessmentsPackageResponse res = sdk.ats().getAssessmentsPackage()
                .request(req)
                .call();

        if (res.assessmentPackageResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AtsGetAssessmentsPackageRequest](../../models/operations/AtsGetAssessmentsPackageRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AtsGetAssessmentsPackageResponse](../../models/operations/AtsGetAssessmentsPackageResponse.md)**

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

## orderAssessmentsRequest

Order Assessments Request

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_order_assessments_request" method="post" path="/unified/ats/assessments/orders" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsOrderAssessmentsRequestResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsOrderAssessmentsRequestResponse res = sdk.ats().orderAssessmentsRequest()
                .xAccountId("<id>")
                .atsCreateCandidatesAssessmentsRequestDto(AtsCreateCandidatesAssessmentsRequestDto.builder()
                    .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                    .package_(AtsCreateCandidatesAssessmentsRequestDtoPackage.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("Test 1")
                        .description("Skills test to gauge a candidate's proficiency in job-specific skills")
                        .build())
                    .application(AtsCreateCandidatesAssessmentsRequestDtoApplication.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .applicationStatus(AtsCreateCandidatesAssessmentsRequestDtoApplicationStatus.builder()
                            .value(AtsCreateCandidatesAssessmentsRequestDtoValue.HIRED)
                            .sourceValue(AtsCreateCandidatesAssessmentsRequestDtoSourceValue.of("Hired"))
                            .build())
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .build())
                    .job(AtsCreateCandidatesAssessmentsRequestDtoJob.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .title("Software Engineer")
                        .hiringTeam(List.of(
                            JobHiringTeam.builder()
                                .userId("123456")
                                .remoteUserId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                                .firstName("John")
                                .lastName("Doe")
                                .email("john.doe@gmail.com")
                                .role("Software Engineer")
                                .build()))
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .build())
                    .candidate(AtsCreateCandidatesAssessmentsRequestDtoCandidate.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .firstName("Romain")
                        .lastName("Sestier")
                        .emails(List.of(
                            CandidateEmail.builder()
                                .type("personal")
                                .value("sestier.romain123@gmail.com")
                                .build()))
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .profileUrl("https://exmaple.com/candidate?id=xyz")
                        .build())
                    .requester(Requester.builder()
                        .userId("123456")
                        .remoteUserId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                        .firstName("John")
                        .lastName("Doe")
                        .email("john.doe@gmail.com")
                        .role("Software Engineer")
                        .build())
                    .resultsUpdateUrl("https://exmaple.com/integrations/results/update")
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createAssessmentOrderResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                    | *String*                                                                                                        | :heavy_check_mark:                                                                                              | The account identifier                                                                                          |
| `atsCreateCandidatesAssessmentsRequestDto`                                                                      | [AtsCreateCandidatesAssessmentsRequestDto](../../models/components/AtsCreateCandidatesAssessmentsRequestDto.md) | :heavy_check_mark:                                                                                              | N/A                                                                                                             |

### Response

**[AtsOrderAssessmentsRequestResponse](../../models/operations/AtsOrderAssessmentsRequestResponse.md)**

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

## updateAssessmentsResult

Update Assessments Result

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_update_assessments_result" method="patch" path="/unified/ats/assessments/orders/{id}/result" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsUpdateAssessmentsResultResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsUpdateAssessmentsResultResponse res = sdk.ats().updateAssessmentsResult()
                .xAccountId("<id>")
                .id("<id>")
                .atsUpdateCandidatesAssessmentsResultsRequestDto(AtsUpdateCandidatesAssessmentsResultsRequestDto.builder()
                    .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                    .score(JsonNullable.of(null))
                    .startDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .submissionDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .summary("Test is passed")
                    .result(Result.builder()
                        .value(AtsUpdateCandidatesAssessmentsResultsRequestDtoValue.PASSED)
                        .sourceValue(AtsUpdateCandidatesAssessmentsResultsRequestDtoSourceValue.of("Passed"))
                        .build())
                    .resultUrl("https://exmaple.com/result?id=xyz")
                    .attachments(List.of(
                        Attachment.builder()
                            .url("http://example.com/resume.pdf")
                            .contentType(AttachmentContentType.builder()
                                .value(AttachmentValue.TEXT)
                                .sourceValue(AttachmentSourceValue.of("Text"))
                                .build())
                            .build()))
                    .candidate(AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .profileUrl("https://exmaple.com/candidate?id=xyz")
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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                                  | *String*                                                                                                                      | :heavy_check_mark:                                                                                                            | The account identifier                                                                                                        |
| `id`                                                                                                                          | *String*                                                                                                                      | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |
| `atsUpdateCandidatesAssessmentsResultsRequestDto`                                                                             | [AtsUpdateCandidatesAssessmentsResultsRequestDto](../../models/components/AtsUpdateCandidatesAssessmentsResultsRequestDto.md) | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |

### Response

**[AtsUpdateAssessmentsResultResponse](../../models/operations/AtsUpdateAssessmentsResultResponse.md)**

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

## getAssessmentsResult

Get Assessments Results

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_assessments_result" method="get" path="/unified/ats/assessments/orders/{id}/results" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetAssessmentsResultRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetAssessmentsResultResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetAssessmentsResultRequest req = AtsGetAssessmentsResultRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,candidate,score,start_date,submission_date,summary,result,result_url,attachments")
                .build();

        AtsGetAssessmentsResultResponse res = sdk.ats().getAssessmentsResult()
                .request(req)
                .call();

        if (res.assessmentResultsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AtsGetAssessmentsResultRequest](../../models/operations/AtsGetAssessmentsResultRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AtsGetAssessmentsResultResponse](../../models/operations/AtsGetAssessmentsResultResponse.md)**

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

## listBackgroundCheckPackages

List Background Check Packages

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_background_check_packages" method="get" path="/unified/ats/background_checks/packages" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListBackgroundCheckPackagesRequest req = AtsListBackgroundCheckPackagesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,description,tests")
                .filter(AtsListBackgroundCheckPackagesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listBackgroundCheckPackages()
                .request(req)
                .callAsStream()
                .forEach((AtsListBackgroundCheckPackagesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AtsListBackgroundCheckPackagesRequest](../../models/operations/AtsListBackgroundCheckPackagesRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AtsListBackgroundCheckPackagesResponse](../../models/operations/AtsListBackgroundCheckPackagesResponse.md)**

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

## createBackgroundCheckPackage

Create Background Check Package

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_create_background_check_package" method="post" path="/unified/ats/background_checks/packages" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsCreateBackgroundCheckPackageResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsCreateBackgroundCheckPackageResponse res = sdk.ats().createBackgroundCheckPackage()
                .xAccountId("<id>")
                .atsCreateBackgroundCheckPackagesRequestDto(AtsCreateBackgroundCheckPackagesRequestDto.builder()
                    .name("Test 1")
                    .description("Skills test to gauge a candidate's proficiency in job-specific skills")
                    .tests(List.of(
                        CreatePackage.builder()
                            .name("Test 1")
                            .description("Skills test to gauge a candidate's proficiency in job-specific skills")
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                        | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | The account identifier                                                                                              |
| `atsCreateBackgroundCheckPackagesRequestDto`                                                                        | [AtsCreateBackgroundCheckPackagesRequestDto](../../models/components/AtsCreateBackgroundCheckPackagesRequestDto.md) | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |

### Response

**[AtsCreateBackgroundCheckPackageResponse](../../models/operations/AtsCreateBackgroundCheckPackageResponse.md)**

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

## getBackgroundCheckPackage

Get Background Check Package

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_background_check_package" method="get" path="/unified/ats/background_checks/packages/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetBackgroundCheckPackageRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetBackgroundCheckPackageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetBackgroundCheckPackageRequest req = AtsGetBackgroundCheckPackageRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,description,tests")
                .build();

        AtsGetBackgroundCheckPackageResponse res = sdk.ats().getBackgroundCheckPackage()
                .request(req)
                .call();

        if (res.backgroundCheckPackageResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AtsGetBackgroundCheckPackageRequest](../../models/operations/AtsGetBackgroundCheckPackageRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AtsGetBackgroundCheckPackageResponse](../../models/operations/AtsGetBackgroundCheckPackageResponse.md)**

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

## deleteBackgroundCheckPackage

Delete Background Check Package

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_delete_background_check_package" method="delete" path="/unified/ats/background_checks/packages/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsDeleteBackgroundCheckPackageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsDeleteBackgroundCheckPackageResponse res = sdk.ats().deleteBackgroundCheckPackage()
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

**[AtsDeleteBackgroundCheckPackageResponse](../../models/operations/AtsDeleteBackgroundCheckPackageResponse.md)**

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

## updateBackgroundCheckPackage

Update Background Check Package

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_update_background_check_package" method="patch" path="/unified/ats/background_checks/packages/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsUpdateBackgroundCheckPackageResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsUpdateBackgroundCheckPackageResponse res = sdk.ats().updateBackgroundCheckPackage()
                .xAccountId("<id>")
                .id("<id>")
                .atsUpdateBackgroundCheckPackagesRequestDto(AtsUpdateBackgroundCheckPackagesRequestDto.builder()
                    .name("Test 1")
                    .description("Skills test to gauge a candidate's proficiency in job-specific skills")
                    .tests(List.of(
                        UpdatePackage.builder()
                            .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                            .name("Test 1")
                            .description("Skills test to gauge a candidate's proficiency in job-specific skills")
                            .build()))
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                        | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | The account identifier                                                                                              |
| `id`                                                                                                                | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |
| `atsUpdateBackgroundCheckPackagesRequestDto`                                                                        | [AtsUpdateBackgroundCheckPackagesRequestDto](../../models/components/AtsUpdateBackgroundCheckPackagesRequestDto.md) | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |

### Response

**[AtsUpdateBackgroundCheckPackageResponse](../../models/operations/AtsUpdateBackgroundCheckPackageResponse.md)**

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

## orderBackgroundCheckRequest

Order Background Check Request

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_order_background_check_request" method="post" path="/unified/ats/background_checks/orders" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.components.Package;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsOrderBackgroundCheckRequestResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsOrderBackgroundCheckRequestResponse res = sdk.ats().orderBackgroundCheckRequest()
                .xAccountId("<id>")
                .atsCreateBackgroundCheckOrderRequestDto(AtsCreateBackgroundCheckOrderRequestDto.builder()
                    .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                    .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                    .application(AtsCreateBackgroundCheckOrderRequestDtoApplication.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .applicationStatus(AtsCreateBackgroundCheckOrderRequestDtoApplicationStatus.builder()
                            .value(AtsCreateBackgroundCheckOrderRequestDtoValue.HIRED)
                            .sourceValue(AtsCreateBackgroundCheckOrderRequestDtoSourceValue.of("Hired"))
                            .build())
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .build())
                    .job(JsonNullable.of(null))
                    .candidate(AtsCreateBackgroundCheckOrderRequestDtoCandidate.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .firstName("Romain")
                        .lastName("Sestier")
                        .emails(List.of(
                            CandidateEmail.builder()
                                .type("personal")
                                .value("sestier.romain123@gmail.com")
                                .build()))
                        .passthrough(Map.ofEntries(
                            Map.entry("other_known_names", "John Doe")))
                        .profileUrl("https://exmaple.com/candidate?id=xyz")
                        .build())
                    .requester(AtsCreateBackgroundCheckOrderRequestDtoRequester.builder()
                        .userId("123456")
                        .remoteUserId("e3cb75bf-aa84-466e-a6c1-b8322b257a48")
                        .firstName("John")
                        .lastName("Doe")
                        .email("john.doe@gmail.com")
                        .role("Software Engineer")
                        .build())
                    .resultsUpdateUrl("https://exmaple.com/integrations/results/update")
                    .package_(AtsCreateBackgroundCheckOrderRequestDtoPackage.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .name("Test 1")
                        .description("Skills test to gauge a candidate's proficiency in job-specific skills")
                        .tests(List.of(
                            Package.builder()
                                .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                                .remoteId("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                                .name("Test 1")
                                .description("Skills test to gauge a candidate's proficiency in job-specific skills")
                                .build()))
                        .build())
                    .passthrough(Map.ofEntries(
                        Map.entry("other_known_names", "John Doe")))
                    .build())
                .call();

        if (res.createBackgroundCheckOrderResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                  | *String*                                                                                                      | :heavy_check_mark:                                                                                            | The account identifier                                                                                        |
| `atsCreateBackgroundCheckOrderRequestDto`                                                                     | [AtsCreateBackgroundCheckOrderRequestDto](../../models/components/AtsCreateBackgroundCheckOrderRequestDto.md) | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[AtsOrderBackgroundCheckRequestResponse](../../models/operations/AtsOrderBackgroundCheckRequestResponse.md)**

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

## updateBackgroundCheckResult

Update Background Check Result

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_update_background_check_result" method="patch" path="/unified/ats/background_checks/orders/{id}/result" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsUpdateBackgroundCheckResultResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsUpdateBackgroundCheckResultResponse res = sdk.ats().updateBackgroundCheckResult()
                .xAccountId("<id>")
                .id("<id>")
                .atsUpdateBackgroundCheckResultRequestDto(AtsUpdateBackgroundCheckResultRequestDto.builder()
                    .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                    .score(AtsUpdateBackgroundCheckResultRequestDtoScore.builder()
                        .label("Percentage")
                        .value("80")
                        .min("0")
                        .max("100")
                        .build())
                    .startDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .submissionDate(OffsetDateTime.parse("2021-01-01T01:01:01.000Z"))
                    .summary("Test is passed")
                    .result(AtsUpdateBackgroundCheckResultRequestDtoResult.builder()
                        .value(AtsUpdateBackgroundCheckResultRequestDtoValue.PASSED)
                        .sourceValue(AtsUpdateBackgroundCheckResultRequestDtoSourceValue.of("Passed"))
                        .build())
                    .resultUrl("https://exmaple.com/result?id=xyz")
                    .attachments(List.of(
                        Attachment.builder()
                            .url("http://example.com/resume.pdf")
                            .contentType(AttachmentContentType.builder()
                                .value(AttachmentValue.TEXT)
                                .sourceValue(AttachmentSourceValue.of("Text"))
                                .build())
                            .build()))
                    .candidate(AtsUpdateBackgroundCheckResultRequestDtoCandidate.builder()
                        .id("8187e5da-dc77-475e-9949-af0f1fa4e4e3")
                        .profileUrl("https://exmaple.com/candidate?id=xyz")
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `xAccountId`                                                                                                    | *String*                                                                                                        | :heavy_check_mark:                                                                                              | The account identifier                                                                                          |
| `id`                                                                                                            | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |
| `atsUpdateBackgroundCheckResultRequestDto`                                                                      | [AtsUpdateBackgroundCheckResultRequestDto](../../models/components/AtsUpdateBackgroundCheckResultRequestDto.md) | :heavy_check_mark:                                                                                              | N/A                                                                                                             |

### Response

**[AtsUpdateBackgroundCheckResultResponse](../../models/operations/AtsUpdateBackgroundCheckResultResponse.md)**

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

## getBackgroundCheckResult

Get Background Check Results

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_background_check_result" method="get" path="/unified/ats/background_checks/orders/{id}/results" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetBackgroundCheckResultRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetBackgroundCheckResultResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetBackgroundCheckResultRequest req = AtsGetBackgroundCheckResultRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,candidate,score,start_date,submission_date,summary,result,result_url,attachments")
                .build();

        AtsGetBackgroundCheckResultResponse res = sdk.ats().getBackgroundCheckResult()
                .request(req)
                .call();

        if (res.backgroundCheckResultsResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AtsGetBackgroundCheckResultRequest](../../models/operations/AtsGetBackgroundCheckResultRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AtsGetBackgroundCheckResultResponse](../../models/operations/AtsGetBackgroundCheckResultResponse.md)**

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

## listApplicationDocumentCategories

List Application Document Categories

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_list_application_document_categories" method="get" path="/unified/ats/documents/application_categories" -->
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
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsListApplicationDocumentCategoriesRequest req = AtsListApplicationDocumentCategoriesRequest.builder()
                .xAccountId("<id>")
                .fields("id,remote_id,name,active")
                .filter(AtsListApplicationDocumentCategoriesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .build();

        sdk.ats().listApplicationDocumentCategories()
                .request(req)
                .callAsStream()
                .forEach((AtsListApplicationDocumentCategoriesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [AtsListApplicationDocumentCategoriesRequest](../../models/operations/AtsListApplicationDocumentCategoriesRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[AtsListApplicationDocumentCategoriesResponse](../../models/operations/AtsListApplicationDocumentCategoriesResponse.md)**

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

## getApplicationDocumentCategory

Get Application Document Category

### Example Usage

<!-- UsageSnippet language="java" operationID="ats_get_application_document_category" method="get" path="/unified/ats/documents/application_categories/{id}" -->
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationDocumentCategoryRequest;
import com.stackone.stackone_client_java.models.operations.AtsGetApplicationDocumentCategoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        AtsGetApplicationDocumentCategoryRequest req = AtsGetApplicationDocumentCategoryRequest.builder()
                .xAccountId("<id>")
                .id("<id>")
                .fields("id,remote_id,name,active")
                .build();

        AtsGetApplicationDocumentCategoryResponse res = sdk.ats().getApplicationDocumentCategory()
                .request(req)
                .call();

        if (res.referenceResult().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [AtsGetApplicationDocumentCategoryRequest](../../models/operations/AtsGetApplicationDocumentCategoryRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[AtsGetApplicationDocumentCategoryResponse](../../models/operations/AtsGetApplicationDocumentCategoryResponse.md)**

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