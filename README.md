# stackone-client-java

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<!-- Start Summary [summary] -->
## Summary

Accounting: The documentation for the StackOne API
The documentation for the StackOne Unified API - HRIS
The documentation for the StackOne Unified API - ATS
The documentation for the StackOne Unified API - CRM
The documentation for the StackOne Unified API - IAM
The documentation for the StackOne Unified API - MARKETING
The documentation for the StackOne Unified API - LMS
The documentation for the StackOne Unified API - TICKETING
The documentation for the StackOne Unified API - DOCUMENTS
The documentation for the StackOne Unified API - SCREENING
The documentation for the StackOne Unified API - MESSAGING
The documentation for the StackOne Unified API - ACCOUNTING
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [stackone-client-java](#stackone-client-java)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Pagination](#pagination)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Asynchronous Support](#asynchronous-support)
  * [Authentication](#authentication)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.stackone:stackone-client-java:0.19.3'
```

Maven:
```xml
<dependency>
    <groupId>com.stackone</groupId>
    <artifactId>stackone-client-java</artifactId>
    <version>0.19.3</version>
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
                .fields("id,remote_id,title,first_name,last_name,name,display_name,gender,ethnicity,date_of_birth,birthday,marital_status,avatar_url,avatar,personal_email,personal_phone_number,work_email,work_phone_number,job_id,remote_job_id,job_title,job_description,department_id,remote_department_id,department,cost_centers,company,manager_id,remote_manager_id,hire_date,start_date,tenure,work_anniversary,employment_type,employment_contract_type,employment_status,termination_date,company_name,company_id,remote_company_id,preferred_language,citizenships,home_location,work_location,employments,custom_fields,created_at,updated_at,benefits,employee_number,national_identity_number,national_identity_numbers,bank_details,skills,unified_custom_fields")
                .filter(HrisListEmployeesQueryParamFilter.builder()
                    .updatedAfter(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build())
                .expand("company,employments,work_location,home_location,groups,skills")
                .include("avatar_url,avatar,custom_fields,job_description,benefits,bank_details")
                .prefer("heartbeat")
                .build();


        sdk.hris().listEmployees()
                .callAsStream()
                .forEach((HrisListEmployeesResponse item) -> {
                   // handle page
                });

    }
}
```
#### Asynchronous Call
An asynchronous SDK client is also available that returns a [`CompletableFuture<T>`][comp-fut]. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import com.stackone.stackone_client_java.AsyncStackOne;
import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.operations.async.StackoneCreateConnectSessionResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) {

        AsyncStackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build()
            .async();

        ConnectSessionCreate req = ConnectSessionCreate.builder()
                .originOwnerId("<id>")
                .originOwnerName("<value>")
                .categories(List.of(
                    Categories.ATS,
                    Categories.HRIS,
                    Categories.DOCUMENTS,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.IAM,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING,
                    Categories.MESSAGING,
                    Categories.ACCOUNTING,
                    Categories.SCHEDULING))
                .type(Type.TEST)
                .build();

        CompletableFuture<StackoneCreateConnectSessionResponse> resFut = sdk.connectSessions().createConnectSession()
                .request(req)
                .call();

        resFut.thenAccept(res -> {
            if (res.connectSessionTokenAuthLink().isPresent()) {
            // handle response
            }
        });
    }
}
```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [Accounting](docs/sdks/accounting/README.md)

* [listCompanies](docs/sdks/accounting/README.md#listcompanies) - List Companies
* [getCompany](docs/sdks/accounting/README.md#getcompany) - Get Company
* [listCompanyAccounts](docs/sdks/accounting/README.md#listcompanyaccounts) - List Accounts
* [getCompanyAccount](docs/sdks/accounting/README.md#getcompanyaccount) - Get Account
* [listCompanyTaxRates](docs/sdks/accounting/README.md#listcompanytaxrates) - List Tax Rates
* [getCompanyTaxRate](docs/sdks/accounting/README.md#getcompanytaxrate) - Get Tax Rate
* [batchCreateCompanyJournals](docs/sdks/accounting/README.md#batchcreatecompanyjournals) - Batch Create Journals
* [listCompanyJournals](docs/sdks/accounting/README.md#listcompanyjournals) - List Journals
* [createCompanyJournal](docs/sdks/accounting/README.md#createcompanyjournal) - Create Journal
* [getCompanyJournal](docs/sdks/accounting/README.md#getcompanyjournal) - Get Journal

### [Accounts](docs/sdks/accounts/README.md)

* [listLinkedAccounts](docs/sdks/accounts/README.md#listlinkedaccounts) - List Accounts
* [getAccount](docs/sdks/accounts/README.md#getaccount) - Get Account
* [deleteAccount](docs/sdks/accounts/README.md#deleteaccount) - Delete Account
* [updateAccount](docs/sdks/accounts/README.md#updateaccount) - Update Account
* [getAccountMetaInfo](docs/sdks/accounts/README.md#getaccountmetainfo) - Get Account Meta Information

### [Actions](docs/sdks/actions/README.md)

* [listActionsMeta](docs/sdks/actions/README.md#listactionsmeta) - List all actions metadata
* [searchActions](docs/sdks/actions/README.md#searchactions) - Search connector actions by semantic similarity
* [buildActionEmbeddings](docs/sdks/actions/README.md#buildactionembeddings) - Rebuild action embeddings for semantic search
* [rpcAction](docs/sdks/actions/README.md#rpcaction) - Make an RPC call to an action

### [Ats](docs/sdks/ats/README.md)

* [listApplications](docs/sdks/ats/README.md#listapplications) - List Applications
* [createApplication](docs/sdks/ats/README.md#createapplication) - Create Application
* [getApplication](docs/sdks/ats/README.md#getapplication) - Get Application
* [updateApplication](docs/sdks/ats/README.md#updateapplication) - Update Application
* [listApplicationsOffers](docs/sdks/ats/README.md#listapplicationsoffers) - List Application Offers
* [moveApplication](docs/sdks/ats/README.md#moveapplication) - Move Application
* [rejectApplication](docs/sdks/ats/README.md#rejectapplication) - Reject Application
* [getApplicationOffer](docs/sdks/ats/README.md#getapplicationoffer) - Get Application Offer
* [listApplicationScorecards](docs/sdks/ats/README.md#listapplicationscorecards) - List Application Scorecards
* [getApplicationScorecard](docs/sdks/ats/README.md#getapplicationscorecard) - Get Application Scorecard
* [listApplicationChanges](docs/sdks/ats/README.md#listapplicationchanges) - List Application Changes
* [listApplicationNotes](docs/sdks/ats/README.md#listapplicationnotes) - List Application Notes
* [createApplicationNote](docs/sdks/ats/README.md#createapplicationnote) - Create Application Note
* [getApplicationNote](docs/sdks/ats/README.md#getapplicationnote) - Get Application Note
* [updateApplicationNote](docs/sdks/ats/README.md#updateapplicationnote) - Update Application Note
* [listApplicationsScheduledInterviews](docs/sdks/ats/README.md#listapplicationsscheduledinterviews) - List Applications scheduled interviews
* [getApplicationScheduledInterview](docs/sdks/ats/README.md#getapplicationscheduledinterview) - Get Applications scheduled interview
* [uploadApplicationDocument](docs/sdks/ats/README.md#uploadapplicationdocument) - Upload Application Document
* [downloadApplicationDocument](docs/sdks/ats/README.md#downloadapplicationdocument) - Download Application Document
* [listApplicationDocuments](docs/sdks/ats/README.md#listapplicationdocuments) - List Application Documents
* [getApplicationDocument](docs/sdks/ats/README.md#getapplicationdocument) - Get Application Document
* [listCandidates](docs/sdks/ats/README.md#listcandidates) - List Candidates
* [createCandidate](docs/sdks/ats/README.md#createcandidate) - Create Candidate
* [getCandidate](docs/sdks/ats/README.md#getcandidate) - Get Candidate
* [updateCandidate](docs/sdks/ats/README.md#updatecandidate) - Update Candidate
* [listCandidateNotes](docs/sdks/ats/README.md#listcandidatenotes) - List Candidate Notes
* [createCandidateNote](docs/sdks/ats/README.md#createcandidatenote) - Create Candidate Note
* [getCandidateNote](docs/sdks/ats/README.md#getcandidatenote) - Get Candidate Note
* [listApplicationCustomFieldDefinitions](docs/sdks/ats/README.md#listapplicationcustomfielddefinitions) - List Application Custom Field Definitions
* [getApplicationCustomFieldDefinition](docs/sdks/ats/README.md#getapplicationcustomfielddefinition) - Get Application Custom Field Definition
* [listCandidateCustomFieldDefinitions](docs/sdks/ats/README.md#listcandidatecustomfielddefinitions) - List Candidate Custom Field Definitions
* [getCandidateCustomFieldDefinition](docs/sdks/ats/README.md#getcandidatecustomfielddefinition) - Get Candidate Custom Field Definition
* [listJobCustomFieldDefinitions](docs/sdks/ats/README.md#listjobcustomfielddefinitions) - List Job Custom Field Definitions
* [getJobCustomFieldDefinition](docs/sdks/ats/README.md#getjobcustomfielddefinition) - Get Job Custom Field Definition
* [listDepartments](docs/sdks/ats/README.md#listdepartments) - List Departments
* [getDepartment](docs/sdks/ats/README.md#getdepartment) - Get Department
* [~~listInterviewStages~~](docs/sdks/ats/README.md#listinterviewstages) - List Interview Stages :warning: **Deprecated**
* [~~getInterviewStage~~](docs/sdks/ats/README.md#getinterviewstage) - Get Interview Stage :warning: **Deprecated**
* [listApplicationStages](docs/sdks/ats/README.md#listapplicationstages) - List Application Stages
* [getApplicationStage](docs/sdks/ats/README.md#getapplicationstage) - Get Application Stage
* [listInterviews](docs/sdks/ats/README.md#listinterviews) - List Interviews
* [getInterview](docs/sdks/ats/README.md#getinterview) - Get Interview
* [createInterviewNote](docs/sdks/ats/README.md#createinterviewnote) - Create Interview Note
* [updateInterviewNote](docs/sdks/ats/README.md#updateinterviewnote) - Update Interview Note
* [listJobs](docs/sdks/ats/README.md#listjobs) - List Jobs
* [createJob](docs/sdks/ats/README.md#createjob) - Create Job
* [listJobApplicationStages](docs/sdks/ats/README.md#listjobapplicationstages) - List Job Application Stages
* [getJob](docs/sdks/ats/README.md#getjob) - Get Job
* [updateJob](docs/sdks/ats/README.md#updatejob) - Update Job
* [getJobApplicationStage](docs/sdks/ats/README.md#getjobapplicationstage) - Get Job Application Stage
* [listLists](docs/sdks/ats/README.md#listlists) - Get all Lists
* [getList](docs/sdks/ats/README.md#getlist) - Get List
* [listLocations](docs/sdks/ats/README.md#listlocations) - List locations
* [getLocation](docs/sdks/ats/README.md#getlocation) - Get Location
* [listRejectedReasons](docs/sdks/ats/README.md#listrejectedreasons) - List Rejected Reasons
* [getRejectedReason](docs/sdks/ats/README.md#getrejectedreason) - Get Rejected Reason
* [listUsers](docs/sdks/ats/README.md#listusers) - List Users
* [getUser](docs/sdks/ats/README.md#getuser) - Get User
* [listJobPostings](docs/sdks/ats/README.md#listjobpostings) - List Job Postings
* [getJobPosting](docs/sdks/ats/README.md#getjobposting) - Get Job Posting
* [listOffers](docs/sdks/ats/README.md#listoffers) - List Offers
* [createOffer](docs/sdks/ats/README.md#createoffer) - Create Offer
* [getOffer](docs/sdks/ats/README.md#getoffer) - Get Offer
* [listAssessmentsPackages](docs/sdks/ats/README.md#listassessmentspackages) - List Assessments Packages
* [getAssessmentsPackage](docs/sdks/ats/README.md#getassessmentspackage) - Get Assessments Package
* [orderAssessmentsRequest](docs/sdks/ats/README.md#orderassessmentsrequest) - Order Assessments Request
* [updateAssessmentsResult](docs/sdks/ats/README.md#updateassessmentsresult) - Update Assessments Result
* [listBackgroundCheckPackages](docs/sdks/ats/README.md#listbackgroundcheckpackages) - List Background Check Packages
* [createBackgroundCheckPackage](docs/sdks/ats/README.md#createbackgroundcheckpackage) - Create Background Check Package
* [getBackgroundCheckPackage](docs/sdks/ats/README.md#getbackgroundcheckpackage) - Get Background Check Package
* [updateBackgroundCheckPackage](docs/sdks/ats/README.md#updatebackgroundcheckpackage) - Update Background Check Package
* [deleteBackgroundCheckPackage](docs/sdks/ats/README.md#deletebackgroundcheckpackage) - Delete Background Check Package
* [orderBackgroundCheckRequest](docs/sdks/ats/README.md#orderbackgroundcheckrequest) - Order Background Check Request
* [updateBackgroundCheckResult](docs/sdks/ats/README.md#updatebackgroundcheckresult) - Update Background Check Result
* [listApplicationDocumentCategories](docs/sdks/ats/README.md#listapplicationdocumentcategories) - List Application Document Categories
* [getApplicationDocumentCategory](docs/sdks/ats/README.md#getapplicationdocumentcategory) - Get Application Document Category

### [ConnectSessions](docs/sdks/connectsessions/README.md)

* [createConnectSession](docs/sdks/connectsessions/README.md#createconnectsession) - Create Connect Session
* [authenticateConnectSession](docs/sdks/connectsessions/README.md#authenticateconnectsession) - Authenticate Connect Session

### [Connectors](docs/sdks/connectors/README.md)

* [listConnectorsMeta](docs/sdks/connectors/README.md#listconnectorsmeta) - List Connector Meta Information
* [getConnectorMeta](docs/sdks/connectors/README.md#getconnectormeta) - Get Connector Meta Information

### [Crm](docs/sdks/crm/README.md)

* [listContacts](docs/sdks/crm/README.md#listcontacts) - List Contacts
* [createContact](docs/sdks/crm/README.md#createcontact) - Create Contact
* [getContact](docs/sdks/crm/README.md#getcontact) - Get Contact
* [updateContact](docs/sdks/crm/README.md#updatecontact) - Update Contact (early access)
* [listAccounts](docs/sdks/crm/README.md#listaccounts) - List Accounts
* [getAccount](docs/sdks/crm/README.md#getaccount) - Get Account
* [listLists](docs/sdks/crm/README.md#listlists) - Get all Lists
* [getList](docs/sdks/crm/README.md#getlist) - Get List
* [listContactCustomFieldDefinitions](docs/sdks/crm/README.md#listcontactcustomfielddefinitions) - List Contact Custom Field Definitions
* [getContactCustomFieldDefinition](docs/sdks/crm/README.md#getcontactcustomfielddefinition) - Get Contact Custom Field Definition

### [Documents](docs/sdks/documents/README.md)

* [downloadFile](docs/sdks/documents/README.md#downloadfile) - Download File
* [uploadFile](docs/sdks/documents/README.md#uploadfile) - Upload File
* [listFiles](docs/sdks/documents/README.md#listfiles) - List Files
* [getFile](docs/sdks/documents/README.md#getfile) - Get File
* [listFolders](docs/sdks/documents/README.md#listfolders) - List Folders
* [getFolder](docs/sdks/documents/README.md#getfolder) - Get Folder
* [listDrives](docs/sdks/documents/README.md#listdrives) - List Drives
* [getDrive](docs/sdks/documents/README.md#getdrive) - Get Drive

### [Hris](docs/sdks/hris/README.md)

* [listCompanies](docs/sdks/hris/README.md#listcompanies) - List Companies
* [getCompany](docs/sdks/hris/README.md#getcompany) - Get Company
* [listEmployeeCustomFieldDefinitions](docs/sdks/hris/README.md#listemployeecustomfielddefinitions) - List employee Custom Field Definitions
* [getEmployeeCustomFieldDefinition](docs/sdks/hris/README.md#getemployeecustomfielddefinition) - Get employee Custom Field Definition
* [listEmployees](docs/sdks/hris/README.md#listemployees) - List Employees
* [createEmployee](docs/sdks/hris/README.md#createemployee) - Create Employee
* [getEmployee](docs/sdks/hris/README.md#getemployee) - Get Employee
* [updateEmployee](docs/sdks/hris/README.md#updateemployee) - Update Employee
* [inviteEmployee](docs/sdks/hris/README.md#inviteemployee) - Invite Employee
* [listEmployeeShifts](docs/sdks/hris/README.md#listemployeeshifts) - List Employee Shifts
* [getEmployeeShift](docs/sdks/hris/README.md#getemployeeshift) - Get Employee Shift
* [listEmployeeTimeOffRequests](docs/sdks/hris/README.md#listemployeetimeoffrequests) - List Employee Time Off Requests
* [createEmployeeTimeOffRequest](docs/sdks/hris/README.md#createemployeetimeoffrequest) - Create Employee Time Off Request
* [getEmployeesTimeOffRequest](docs/sdks/hris/README.md#getemployeestimeoffrequest) - Get Employees Time Off Request
* [updateEmployeeTimeOffRequest](docs/sdks/hris/README.md#updateemployeetimeoffrequest) - Update Employee Time Off Request
* [cancelEmployeeTimeOffRequest](docs/sdks/hris/README.md#cancelemployeetimeoffrequest) - Cancel Employee Time Off Request
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
* [listGroups](docs/sdks/hris/README.md#listgroups) - List Groups
* [listDepartmentGroups](docs/sdks/hris/README.md#listdepartmentgroups) - List Department Groups
* [listCostCenterGroups](docs/sdks/hris/README.md#listcostcentergroups) - List Cost Center Groups
* [listTeamGroups](docs/sdks/hris/README.md#listteamgroups) - List Team Groups
* [listDivisionGroups](docs/sdks/hris/README.md#listdivisiongroups) - List Division Groups
* [listCompaniesGroups](docs/sdks/hris/README.md#listcompaniesgroups) - List Companies Groups
* [getGroup](docs/sdks/hris/README.md#getgroup) - Get Group
* [getDepartmentGroup](docs/sdks/hris/README.md#getdepartmentgroup) - Get Department Group
* [getCostCenterGroup](docs/sdks/hris/README.md#getcostcentergroup) - Get Cost Center Group
* [getTeamGroup](docs/sdks/hris/README.md#getteamgroup) - Get Team Group
* [getDivisionGroup](docs/sdks/hris/README.md#getdivisiongroup) - Get Division Group
* [getCompanyGroup](docs/sdks/hris/README.md#getcompanygroup) - Get Company Group
* [listJobs](docs/sdks/hris/README.md#listjobs) - List Jobs
* [getJob](docs/sdks/hris/README.md#getjob) - Get Job
* [listLocations](docs/sdks/hris/README.md#listlocations) - List Work Locations
* [getLocation](docs/sdks/hris/README.md#getlocation) - Get Work Location
* [listPositions](docs/sdks/hris/README.md#listpositions) - List Positions
* [getPosition](docs/sdks/hris/README.md#getposition) - Get Position
* [listTimeEntries](docs/sdks/hris/README.md#listtimeentries) - List Time Entries
* [getTimeEntries](docs/sdks/hris/README.md#gettimeentries) - Get Time Entry
* [listTimeOffRequests](docs/sdks/hris/README.md#listtimeoffrequests) - List time off requests
* [getTimeOffRequest](docs/sdks/hris/README.md#gettimeoffrequest) - Get time off request
* [listShifts](docs/sdks/hris/README.md#listshifts) - List Shifts
* [getShift](docs/sdks/hris/README.md#getshift) - Get Shift
* [~~listTimeOffTypes~~](docs/sdks/hris/README.md#listtimeofftypes) - List time off types :warning: **Deprecated**
* [~~getTimeOffType~~](docs/sdks/hris/README.md#gettimeofftype) - Get time off type :warning: **Deprecated**
* [listTimeOffPolicies](docs/sdks/hris/README.md#listtimeoffpolicies) - List Time Off Policies
* [getTimeOffPolicy](docs/sdks/hris/README.md#gettimeoffpolicy) - Get Time Off Policy
* [listEmployeeTimeOffPolicies](docs/sdks/hris/README.md#listemployeetimeoffpolicies) - List Assigned Time Off Policies
* [listBenefits](docs/sdks/hris/README.md#listbenefits) - List benefits
* [getBenefit](docs/sdks/hris/README.md#getbenefit) - Get Benefit
* [listEmployeeSkills](docs/sdks/hris/README.md#listemployeeskills) - List Employee Skills
* [createEmployeeSkill](docs/sdks/hris/README.md#createemployeeskill) - Create Employee Skill
* [getEmployeeSkill](docs/sdks/hris/README.md#getemployeeskill) - Get Employee Skill
* [listEmployeeTasks](docs/sdks/hris/README.md#listemployeetasks) - List Employee Tasks
* [getEmployeeTask](docs/sdks/hris/README.md#getemployeetask) - Get Employee Task
* [updateEmployeeTask](docs/sdks/hris/README.md#updateemployeetask) - Update Employee Task
* [listTasks](docs/sdks/hris/README.md#listtasks) - List Tasks
* [getTask](docs/sdks/hris/README.md#gettask) - Get Task

### [Iam](docs/sdks/iam/README.md)

* [listUsers](docs/sdks/iam/README.md#listusers) - List Users
* [getUser](docs/sdks/iam/README.md#getuser) - Get User
* [updateUser](docs/sdks/iam/README.md#updateuser) - Update User
* [deleteUser](docs/sdks/iam/README.md#deleteuser) - Delete User
* [listRoles](docs/sdks/iam/README.md#listroles) - List Roles
* [getRole](docs/sdks/iam/README.md#getrole) - Get Role
* [listGroups](docs/sdks/iam/README.md#listgroups) - List Groups
* [getGroup](docs/sdks/iam/README.md#getgroup) - Get Group
* [listPolicies](docs/sdks/iam/README.md#listpolicies) - List Policies
* [getPolicy](docs/sdks/iam/README.md#getpolicy) - Get Policy

### [Lms](docs/sdks/lms/README.md)

* [listCourses](docs/sdks/lms/README.md#listcourses) - List Courses
* [getCourse](docs/sdks/lms/README.md#getcourse) - Get Course
* [listUserAssignments](docs/sdks/lms/README.md#listuserassignments) - List User Assignments
* [createUserAssignment](docs/sdks/lms/README.md#createuserassignment) - Create User Assignment
* [getUserAssignment](docs/sdks/lms/README.md#getuserassignment) - Get User Assignment
* [batchUpsertContent](docs/sdks/lms/README.md#batchupsertcontent) - Batch Upsert External Linking Learning Objects
* [upsertContent](docs/sdks/lms/README.md#upsertcontent) - Upsert External Linking Learning Objects
* [listContent](docs/sdks/lms/README.md#listcontent) - List Content
* [getContent](docs/sdks/lms/README.md#getcontent) - Get Content
* [listUserCompletions](docs/sdks/lms/README.md#listusercompletions) - List User Completions
* [createUserCompletion](docs/sdks/lms/README.md#createusercompletion) - Create User Completion
* [getUserCompletion](docs/sdks/lms/README.md#getusercompletion) - Get User Completion
* [deleteUserCompletion](docs/sdks/lms/README.md#deleteusercompletion) - Delete User Completion
* [listCompletions](docs/sdks/lms/README.md#listcompletions) - List Completions
* [getCompletion](docs/sdks/lms/README.md#getcompletion) - Get Completion
* [getCategory](docs/sdks/lms/README.md#getcategory) - Get Category
* [listCategories](docs/sdks/lms/README.md#listcategories) - List Categories
* [listUsers](docs/sdks/lms/README.md#listusers) - List Users
* [getUser](docs/sdks/lms/README.md#getuser) - Get User
* [getSkill](docs/sdks/lms/README.md#getskill) - Get Skill
* [listSkills](docs/sdks/lms/README.md#listskills) - List Skills
* [listAssignments](docs/sdks/lms/README.md#listassignments) - List Assignments
* [getAssignment](docs/sdks/lms/README.md#getassignment) - Get Assignment

### [Marketing](docs/sdks/marketing/README.md)

* [listEmailTemplates](docs/sdks/marketing/README.md#listemailtemplates) - List Email Templates
* [createEmailTemplate](docs/sdks/marketing/README.md#createemailtemplate) - Create Email Templates
* [getEmailTemplate](docs/sdks/marketing/README.md#getemailtemplate) - Get Email Templates
* [updateEmailTemplate](docs/sdks/marketing/README.md#updateemailtemplate) - Update Email Templates
* [listInAppTemplates](docs/sdks/marketing/README.md#listinapptemplates) - List In-App Templates
* [createInAppTemplate](docs/sdks/marketing/README.md#createinapptemplate) - Create In-App Template
* [getInAppTemplate](docs/sdks/marketing/README.md#getinapptemplate) - Get In-App Template
* [updateInAppTemplate](docs/sdks/marketing/README.md#updateinapptemplate) - Update In-App Template
* [listSmsTemplates](docs/sdks/marketing/README.md#listsmstemplates) - List SMS Templates
* [createSmsTemplate](docs/sdks/marketing/README.md#createsmstemplate) - Create SMS Template
* [getSmsTemplate](docs/sdks/marketing/README.md#getsmstemplate) - Get SMS Template
* [updateSmsTemplate](docs/sdks/marketing/README.md#updatesmstemplate) - Update SMS Template
* [~~listOmniChannelTemplates~~](docs/sdks/marketing/README.md#listomnichanneltemplates) - List Omni-Channel Templates :warning: **Deprecated**
* [~~createOmniChannelTemplate~~](docs/sdks/marketing/README.md#createomnichanneltemplate) - Create Omni-Channel Template :warning: **Deprecated**
* [~~getOmniChannelTemplate~~](docs/sdks/marketing/README.md#getomnichanneltemplate) - Get Omni-Channel Template :warning: **Deprecated**
* [~~updateOmniChannelTemplate~~](docs/sdks/marketing/README.md#updateomnichanneltemplate) - Update Omni-Channel Template :warning: **Deprecated**
* [listPushTemplates](docs/sdks/marketing/README.md#listpushtemplates) - List Push Templates
* [createPushTemplate](docs/sdks/marketing/README.md#createpushtemplate) - Create Push Template
* [getPushTemplate](docs/sdks/marketing/README.md#getpushtemplate) - Get Push Template
* [updatePushTemplate](docs/sdks/marketing/README.md#updatepushtemplate) - Update Push Template
* [listCampaigns](docs/sdks/marketing/README.md#listcampaigns) - List campaigns
* [getCampaign](docs/sdks/marketing/README.md#getcampaign) - Get campaign
* [listContentBlocks](docs/sdks/marketing/README.md#listcontentblocks) - List Content Blocks
* [createContentBlock](docs/sdks/marketing/README.md#createcontentblock) - Create Content Block
* [getContentBlock](docs/sdks/marketing/README.md#getcontentblock) - Get Content Blocks
* [updateContentBlock](docs/sdks/marketing/README.md#updatecontentblock) - Update Content Block

### [Mcp](docs/sdks/mcp/README.md)

* [mcpGet](docs/sdks/mcp/README.md#mcpget) - Open MCP SSE stream
* [mcpPost](docs/sdks/mcp/README.md#mcppost) - Send MCP JSON-RPC message
* [mcpDelete](docs/sdks/mcp/README.md#mcpdelete) - Delete MCP session

### [Messaging](docs/sdks/messaging/README.md)

* [listConversations](docs/sdks/messaging/README.md#listconversations) - List Conversations
* [createConversation](docs/sdks/messaging/README.md#createconversation) - Create Conversation
* [getConversation](docs/sdks/messaging/README.md#getconversation) - Get Conversation
* [downloadMessagingAttachment](docs/sdks/messaging/README.md#downloadmessagingattachment) - Download Attachment
* [listAttachments](docs/sdks/messaging/README.md#listattachments) - List Attachments
* [getAttachment](docs/sdks/messaging/README.md#getattachment) - Get Attachment
* [listUsers](docs/sdks/messaging/README.md#listusers) - List Users
* [getUser](docs/sdks/messaging/README.md#getuser) - Get User
* [listConversationMessages](docs/sdks/messaging/README.md#listconversationmessages) - List Conversation Messages
* [getMessage](docs/sdks/messaging/README.md#getmessage) - Get Message
* [sendMessage](docs/sdks/messaging/README.md#sendmessage) - Send Message

### [Proxy](docs/sdks/proxy/README.md)

* [proxyRequest](docs/sdks/proxy/README.md#proxyrequest) - Proxy Request

### [RequestLogs](docs/sdks/requestlogs/README.md)

* [listStepLogs](docs/sdks/requestlogs/README.md#liststeplogs) - List Step Logs
* [getLog](docs/sdks/requestlogs/README.md#getlog) - Get Log
* [listLogs](docs/sdks/requestlogs/README.md#listlogs) - List Logs
* [listPlatformLogs](docs/sdks/requestlogs/README.md#listplatformlogs) - List Platform Logs

### [Screening](docs/sdks/screening/README.md)

* [listScreeningPackages](docs/sdks/screening/README.md#listscreeningpackages) - List Screening Packages
* [getScreeningPackage](docs/sdks/screening/README.md#getscreeningpackage) - Get Screening Package
* [webhookScreeningResult](docs/sdks/screening/README.md#webhookscreeningresult) - Webhook Screening Result
* [createScreeningOrder](docs/sdks/screening/README.md#createscreeningorder) - Create Screening Order

### [Ticketing](docs/sdks/ticketing/README.md)

* [listTickets](docs/sdks/ticketing/README.md#listtickets) - List Tickets
* [createTicket](docs/sdks/ticketing/README.md#createticket) - Create Ticket
* [getTicket](docs/sdks/ticketing/README.md#getticket) - Get Ticket
* [updateTicket](docs/sdks/ticketing/README.md#updateticket) - Update Ticket
* [listUsers](docs/sdks/ticketing/README.md#listusers) - List Users
* [getUser](docs/sdks/ticketing/README.md#getuser) - Get User
* [listComments](docs/sdks/ticketing/README.md#listcomments) - List Comments
* [getComment](docs/sdks/ticketing/README.md#getcomment) - Get Comment
* [downloadTicketingAttachment](docs/sdks/ticketing/README.md#downloadticketingattachment) - Download Attachment
* [listAttachments](docs/sdks/ticketing/README.md#listattachments) - List Attachments
* [getAttachment](docs/sdks/ticketing/README.md#getattachment) - Get Attachment
* [listTicketTypes](docs/sdks/ticketing/README.md#listtickettypes) - List Ticket Types
* [getTicketType](docs/sdks/ticketing/README.md#gettickettype) - Get Ticket Type
* [listProjects](docs/sdks/ticketing/README.md#listprojects) - List Projects
* [getProject](docs/sdks/ticketing/README.md#getproject) - Get Project
* [listProjectComponents](docs/sdks/ticketing/README.md#listprojectcomponents) - List Project Components
* [getProjectComponent](docs/sdks/ticketing/README.md#getprojectcomponent) - Get Project Component
* [listProjectTicketTypes](docs/sdks/ticketing/README.md#listprojecttickettypes) - List Project Ticket Types
* [listTicketStatuses](docs/sdks/ticketing/README.md#listticketstatuses) - List Ticket Statuses

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you can make your SDK calls using the `callAsIterable` or `callAsStream` methods.
For certain operations, you can also use the `callAsStreamUnwrapped` method that streams individual page items directly.

Here's an example depicting the different ways to use pagination:

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.*;
import java.lang.Exception;
import java.lang.Iterable;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        StackoneListActionsMetaRequest req = StackoneListActionsMetaRequest.builder()
                .groupBy("[\"connector\"]")
                .filter(StackoneListActionsMetaQueryParamFilter.builder()
                    .connectors("connector1,connector2")
                    .accountIds("account1,account2")
                    .actionKey("action1")
                    .build())
                .include(List.of(
                    StackoneListActionsMetaQueryParamInclude.ACTION_DETAILS))
                .search("employee")
                .exclude(List.of(
                    Exclude.ACTIONS))
                .build();


        var b = sdk.actions().listActionsMeta();

        // Iterate through all pages using a traditional for-each loop
        // Each iteration returns a complete page response
        Iterable<StackoneListActionsMetaResponse> iterable = b.callAsIterable();
        for (StackoneListActionsMetaResponse page : iterable) {
            // handle page
        }

        // Stream through all pages and process individual items
        // callAsStreamUnwrapped() flattens pages into individual items

        // Stream through pages without unwrapping (each item is a complete page)
        b.callAsStream()
            .forEach((StackoneListActionsMetaResponse page) -> {
                // handle page
            });

    }
}
```
#### Asynchronous Pagination
An asynchronous SDK client is also available for pagination that returns a [`Flow.Publisher<T>`][flow-pub]. For async pagination, you can use `callAsPublisher()` to get pages as a publisher, or `callAsPublisherUnwrapped()` to get individual items directly. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import com.stackone.stackone_client_java.AsyncStackOne;
import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Security;
import com.stackone.stackone_client_java.models.operations.*;
import com.stackone.stackone_client_java.models.operations.async.StackoneListActionsMetaResponse;
import java.util.List;
import reactor.core.publisher.Flux;

public class Application {

    public static void main(String[] args) {

        AsyncStackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build()
            .async();

        StackoneListActionsMetaRequest req = StackoneListActionsMetaRequest.builder()
                .groupBy("[\"connector\"]")
                .filter(StackoneListActionsMetaQueryParamFilter.builder()
                    .connectors("connector1,connector2")
                    .accountIds("account1,account2")
                    .actionKey("action1")
                    .build())
                .include(List.of(
                    StackoneListActionsMetaQueryParamInclude.ACTION_DETAILS))
                .search("employee")
                .exclude(List.of(
                    Exclude.ACTIONS))
                .build();


        var b = sdk.actions().listActionsMeta();

        // Example using Project Reactor (illustrative) - pages
        Flux<StackoneListActionsMetaResponse> pageFlux = Flux.from(b.callAsPublisher());
        pageFlux.subscribe(
            page -> System.out.println(page),
            error -> error.printStackTrace(),
            () -> System.out.println("Pagination completed")
        );

    }
}
```

[flow-pub]: https://docs.oracle.com/javase/9/docs/api/java/util/concurrent/Flow.Publisher.html
<!-- End Pagination [pagination] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneCreateConnectSessionResponse;
import com.stackone.stackone_client_java.utils.BackoffStrategy;
import com.stackone.stackone_client_java.utils.RetryConfig;
import java.lang.Exception;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ConnectSessionCreate req = ConnectSessionCreate.builder()
                .originOwnerId("<id>")
                .originOwnerName("<value>")
                .categories(List.of(
                    Categories.ATS,
                    Categories.HRIS,
                    Categories.DOCUMENTS,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.IAM,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING,
                    Categories.MESSAGING,
                    Categories.ACCOUNTING,
                    Categories.SCHEDULING))
                .type(Type.TEST)
                .build();

        StackoneCreateConnectSessionResponse res = sdk.connectSessions().createConnectSession()
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
                .call();

        if (res.connectSessionTokenAuthLink().isPresent()) {
            // handle response
        }
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneCreateConnectSessionResponse;
import com.stackone.stackone_client_java.utils.BackoffStrategy;
import com.stackone.stackone_client_java.utils.RetryConfig;
import java.lang.Exception;
import java.util.List;
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

        ConnectSessionCreate req = ConnectSessionCreate.builder()
                .originOwnerId("<id>")
                .originOwnerName("<value>")
                .categories(List.of(
                    Categories.ATS,
                    Categories.HRIS,
                    Categories.DOCUMENTS,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.IAM,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING,
                    Categories.MESSAGING,
                    Categories.ACCOUNTING,
                    Categories.SCHEDULING))
                .type(Type.TEST)
                .build();

        StackoneCreateConnectSessionResponse res = sdk.connectSessions().createConnectSession()
                .request(req)
                .call();

        if (res.connectSessionTokenAuthLink().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.


[`StackOneError`](./src/main/java/models/errors/StackOneError.java) is the base class for all HTTP error responses. It has the following properties:

| Method           | Type                        | Description                                                              |
| ---------------- | --------------------------- | ------------------------------------------------------------------------ |
| `message()`      | `String`                    | Error message                                                            |
| `code()`         | `int`                       | HTTP response status code eg `404`                                       |
| `headers`        | `Map<String, List<String>>` | HTTP response headers                                                    |
| `body()`         | `byte[]`                    | HTTP body as a byte array. Can be empty array if no body is returned.    |
| `bodyAsString()` | `String`                    | HTTP body as a UTF-8 string. Can be empty string if no body is returned. |
| `rawResponse()`  | `HttpResponse<?>`           | Raw HTTP response (body already read and not available for re-read)      |

### Example
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneCreateConnectSessionResponse;
import java.io.UncheckedIOException;
import java.lang.Exception;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();
        try {

            ConnectSessionCreate req = ConnectSessionCreate.builder()
                    .originOwnerId("<id>")
                    .originOwnerName("<value>")
                    .categories(List.of(
                        Categories.ATS,
                        Categories.HRIS,
                        Categories.DOCUMENTS,
                        Categories.CRM,
                        Categories.IAM,
                        Categories.MARKETING,
                        Categories.LMS,
                        Categories.IAM,
                        Categories.DOCUMENTS,
                        Categories.TICKETING,
                        Categories.SCREENING,
                        Categories.MESSAGING,
                        Categories.ACCOUNTING,
                        Categories.SCHEDULING))
                    .type(Type.TEST)
                    .build();

            StackoneCreateConnectSessionResponse res = sdk.connectSessions().createConnectSession()
                    .request(req)
                    .call();

            if (res.connectSessionTokenAuthLink().isPresent()) {
                // handle response
            }
        } catch (StackOneError ex) { // all SDK exceptions inherit from StackOneError

            // ex.ToString() provides a detailed error message including
            // HTTP status code, headers, and error payload (if any)
            System.out.println(ex);

            // Base exception fields
            var rawResponse = ex.rawResponse();
            var headers = ex.headers();
            var contentType = headers.first("Content-Type");
            int statusCode = ex.code();
            Optional<byte[]> responseBody = ex.body();

            // different error subclasses may be thrown 
            // depending on the service call
            if (ex instanceof BadRequestResponse) {
                var e = (BadRequestResponse) ex;
                // Check error data fields
                e.data().ifPresent(payload -> {
                      double statusCode = payload.statusCode();
                      String message = payload.message();
                      // ...
                });
            }

            // An underlying cause may be provided. If the error payload 
            // cannot be deserialized then the deserialization exception 
            // will be set as the cause.
            if (ex.getCause() != null) {
                var cause = ex.getCause();
            }
        } catch (UncheckedIOException ex) {
            // handle IO error (connection, timeout, etc)
        }    }
}
```

### Error Classes
**Primary errors:**
* [`StackOneError`](./src/main/java/models/errors/StackOneError.java): The base class for HTTP error responses.
  * [`com.stackone.stackone_client_java.models.errors.BadRequestResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.BadRequestResponse.java): Invalid request. Status code `400`.
  * [`com.stackone.stackone_client_java.models.errors.UnauthorizedResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.UnauthorizedResponse.java): Unauthorized access. Status code `401`.
  * [`com.stackone.stackone_client_java.models.errors.ForbiddenResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.ForbiddenResponse.java): Forbidden. Status code `403`.
  * [`com.stackone.stackone_client_java.models.errors.NotFoundResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.NotFoundResponse.java): Resource not found. Status code `404`.
  * [`com.stackone.stackone_client_java.models.errors.RequestTimedOutResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.RequestTimedOutResponse.java): The request has timed out. Status code `408`.
  * [`com.stackone.stackone_client_java.models.errors.ConflictResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.ConflictResponse.java): Conflict with current state. Status code `409`.
  * [`com.stackone.stackone_client_java.models.errors.UnprocessableEntityResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.UnprocessableEntityResponse.java): Validation error. Status code `422`.
  * [`com.stackone.stackone_client_java.models.errors.TooManyRequestsResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.TooManyRequestsResponse.java): Too many requests. Status code `429`.
  * [`com.stackone.stackone_client_java.models.errors.InternalServerErrorResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.InternalServerErrorResponse.java): Server error while executing the request. Status code `500`.
  * [`com.stackone.stackone_client_java.models.errors.NotImplementedResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.NotImplementedResponse.java): This functionality is not implemented. Status code `501`.
  * [`com.stackone.stackone_client_java.models.errors.BadGatewayResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.BadGatewayResponse.java): Bad gateway error. Status code `502`.
  * [`com.stackone.stackone_client_java.models.errors.PreconditionFailedResponse`](./src/main/java/models/errors/com.stackone.stackone_client_java.models.errors.PreconditionFailedResponse.java): Precondition failed: linked account belongs to a disabled integration. Status code `412`. *

<details><summary>Less common errors (6)</summary>

<br />

**Network errors:**
* `java.io.IOException` (always wrapped by `java.io.UncheckedIOException`). Commonly encountered subclasses of
`IOException` include `java.net.ConnectException`, `java.net.SocketTimeoutException`, `EOFException` (there are
many more subclasses in the JDK platform).

**Inherit from [`StackOneError`](./src/main/java/models/errors/StackOneError.java)**:


</details>

\* Check [the method documentation](#available-resources-and-operations) to see if the error is applicable.
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneCreateConnectSessionResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
                .serverURL("https://api.stackone.com")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ConnectSessionCreate req = ConnectSessionCreate.builder()
                .originOwnerId("<id>")
                .originOwnerName("<value>")
                .categories(List.of(
                    Categories.ATS,
                    Categories.HRIS,
                    Categories.DOCUMENTS,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.IAM,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING,
                    Categories.MESSAGING,
                    Categories.ACCOUNTING,
                    Categories.SCHEDULING))
                .type(Type.TEST)
                .build();

        StackoneCreateConnectSessionResponse res = sdk.connectSessions().createConnectSession()
                .request(req)
                .call();

        if (res.connectSessionTokenAuthLink().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                      | Type | Scheme     |
| ------------------------- | ---- | ---------- |
| `username`<br/>`password` | http | HTTP Basic |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.*;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneCreateConnectSessionResponse;
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

        ConnectSessionCreate req = ConnectSessionCreate.builder()
                .originOwnerId("<id>")
                .originOwnerName("<value>")
                .categories(List.of(
                    Categories.ATS,
                    Categories.HRIS,
                    Categories.DOCUMENTS,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.IAM,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING,
                    Categories.MESSAGING,
                    Categories.ACCOUNTING,
                    Categories.SCHEDULING))
                .type(Type.TEST)
                .build();

        StackoneCreateConnectSessionResponse res = sdk.connectSessions().createConnectSession()
                .request(req)
                .call();

        if (res.connectSessionTokenAuthLink().isPresent()) {
            // handle response
        }
    }
}
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.errors.*;
import com.stackone.stackone_client_java.models.operations.StackoneMcpGetResponse;
import com.stackone.stackone_client_java.models.operations.StackoneMcpGetSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        StackOne sdk = StackOne.builder()
            .build();

        StackoneMcpGetResponse res = sdk.mcp().mcpGet()
                .security(StackoneMcpGetSecurity.builder()

                    .build())
                .xAccountId("<id>")
                .mcpSessionId("<id>")
                .call();

        // handle response
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods and asynchronous (`sendAsync`) methods. The `sendAsync` method
is used to power the async SDK methods and returns a `CompletableFuture<HttpResponse<Blob>>` for non-blocking operations.

The following example shows how to add a custom header and handle errors:

```java
import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.utils.HTTPClient;
import com.stackone.stackone_client_java.utils.SpeakeasyHTTPClient;
import com.stackone.stackone_client_java.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        StackOne sdk = StackOne.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.utils.HTTPClient;
import com.stackone.stackone_client_java.utils.Blob;
import com.stackone.stackone_client_java.utils.ResponseWithBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }

            @Override
            public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
                // Convert response to HttpResponse<Blob> for async operations
                return client.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                    .thenApply(resp -> new ResponseWithBody<>(resp, Blob::from));
            }
        };

        StackOne sdk = StackOne.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        StackOne sdk = StackOne.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug

You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:

```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This logging should only be used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.


Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

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
