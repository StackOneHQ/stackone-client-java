# stackone-client-java

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<!-- Start Summary [summary] -->
## Summary

LMS: The documentation for the StackOne Unified API - LMS
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [openapi](#openapi)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Pagination](#pagination)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Authentication](#authentication)
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
implementation 'com.stackone:stackone-client-java:0.1.2'
```

Maven:
```xml
<dependency>
    <groupId>com.stackone</groupId>
    <artifactId>stackone-client-java</artifactId>
    <version>0.1.2</version>
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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [accounts()](docs/sdks/accounts/README.md)

* [listLinkedAccounts](docs/sdks/accounts/README.md#listlinkedaccounts) - List Accounts
* [getAccount](docs/sdks/accounts/README.md#getaccount) - Get Account
* [deleteAccount](docs/sdks/accounts/README.md#deleteaccount) - Delete Account
* [updateAccount](docs/sdks/accounts/README.md#updateaccount) - Update Account
* [getAccountMetaInfo](docs/sdks/accounts/README.md#getaccountmetainfo) - Get meta information of the account

### [ats()](docs/sdks/ats/README.md)

* [listApplications](docs/sdks/ats/README.md#listapplications) - List Applications
* [createApplication](docs/sdks/ats/README.md#createapplication) - Create Application
* [getApplication](docs/sdks/ats/README.md#getapplication) - Get Application
* [updateApplication](docs/sdks/ats/README.md#updateapplication) - Update an Application
* [listApplicationsOffers](docs/sdks/ats/README.md#listapplicationsoffers) - List Application Offers
* [moveApplication](docs/sdks/ats/README.md#moveapplication) - Move Application
* [rejectApplication](docs/sdks/ats/README.md#rejectapplication) - Reject Application
* [getApplicationOffer](docs/sdks/ats/README.md#getapplicationoffer) - Get Application Offer
* [listApplicationScorecards](docs/sdks/ats/README.md#listapplicationscorecards) - List Application Scorecards
* [getApplicationScorecard](docs/sdks/ats/README.md#getapplicationscorecard) - Get Application Scorecard
* [listApplicationNotes](docs/sdks/ats/README.md#listapplicationnotes) - List Application Notes
* [createApplicationNote](docs/sdks/ats/README.md#createapplicationnote) - Create Application Note
* [getApplicationNote](docs/sdks/ats/README.md#getapplicationnote) - Get Application Note
* [updateApplicationNote](docs/sdks/ats/README.md#updateapplicationnote) - Update an Application Note
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
* [listInterviewStages](docs/sdks/ats/README.md#listinterviewstages) - List Interview Stages
* [getInterviewStage](docs/sdks/ats/README.md#getinterviewstage) - Get Interview Stage
* [listInterviews](docs/sdks/ats/README.md#listinterviews) - List Interviews
* [getInterview](docs/sdks/ats/README.md#getinterview) - Get Interview
* [listJobs](docs/sdks/ats/README.md#listjobs) - List Jobs
* [createJob](docs/sdks/ats/README.md#createjob) - Create Job
* [getJob](docs/sdks/ats/README.md#getjob) - Get Job
* [updateJob](docs/sdks/ats/README.md#updatejob) - Update Job
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
* [createOffer](docs/sdks/ats/README.md#createoffer) - Creates an offer
* [getOffer](docs/sdks/ats/README.md#getoffer) - Get Offer
* [listAssessmentsPackages](docs/sdks/ats/README.md#listassessmentspackages) - List Assessments Packages
* [getAssessmentsPackage](docs/sdks/ats/README.md#getassessmentspackage) - Get Assessments Package
* [orderAssessmentsRequest](docs/sdks/ats/README.md#orderassessmentsrequest) - Order Assessments Request
* [getAssessmentsRequest](docs/sdks/ats/README.md#getassessmentsrequest) - Get Assessments Requests
* [updateAssessmentsResult](docs/sdks/ats/README.md#updateassessmentsresult) - Update Assessments Result
* [getAssessmentsResult](docs/sdks/ats/README.md#getassessmentsresult) - Get Assessments Results
* [listBackgroundCheckPackages](docs/sdks/ats/README.md#listbackgroundcheckpackages) - List Background Check Packages
* [createBackgroundCheckPackage](docs/sdks/ats/README.md#createbackgroundcheckpackage) - Create Background Check Package
* [getBackgroundCheckPackage](docs/sdks/ats/README.md#getbackgroundcheckpackage) - Get Background Check Package
* [deleteBackgroundCheckPackage](docs/sdks/ats/README.md#deletebackgroundcheckpackage) - Delete Background Check Package
* [updateBackgroundCheckPackage](docs/sdks/ats/README.md#updatebackgroundcheckpackage) - Update Background Check Package
* [listBackgroundCheckRequest](docs/sdks/ats/README.md#listbackgroundcheckrequest) - List Background Check Request
* [orderBackgroundCheckRequest](docs/sdks/ats/README.md#orderbackgroundcheckrequest) - Order Background Check Request
* [getBackgroundCheckRequest](docs/sdks/ats/README.md#getbackgroundcheckrequest) - Get Background Check Request
* [updateBackgroundCheckResult](docs/sdks/ats/README.md#updatebackgroundcheckresult) - Update Background Check Result
* [getBackgroundCheckResult](docs/sdks/ats/README.md#getbackgroundcheckresult) - Get Background Check Results

### [connectors()](docs/sdks/connectors/README.md)

* [listConnectorsMeta](docs/sdks/connectors/README.md#listconnectorsmeta) - List Connectors Meta Information for all providers
* [getConnectorMeta](docs/sdks/connectors/README.md#getconnectormeta) - Get Connector Meta information for the given provider key

### [connectSessions()](docs/sdks/connectsessions/README.md)

* [createConnectSession](docs/sdks/connectsessions/README.md#createconnectsession) - Create Connect Session
* [authenticateConnectSession](docs/sdks/connectsessions/README.md#authenticateconnectsession) - Authenticate Connect Session

### [crm()](docs/sdks/crm/README.md)

* [listContacts](docs/sdks/crm/README.md#listcontacts) - List Contacts
* [createContact](docs/sdks/crm/README.md#createcontact) - Creates a new Contact
* [getContact](docs/sdks/crm/README.md#getcontact) - Get Contact
* [updateContact](docs/sdks/crm/README.md#updatecontact) - Update Contact (early access)
* [listAccounts](docs/sdks/crm/README.md#listaccounts) - List Accounts
* [getAccount](docs/sdks/crm/README.md#getaccount) - Get Account
* [listLists](docs/sdks/crm/README.md#listlists) - Get all Lists
* [getList](docs/sdks/crm/README.md#getlist) - Get List
* [listContactCustomFieldDefinitions](docs/sdks/crm/README.md#listcontactcustomfielddefinitions) - List Contact Custom Field Definitions
* [getContactCustomFieldDefinition](docs/sdks/crm/README.md#getcontactcustomfielddefinition) - Get Contact Custom Field Definition

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

### [iam()](docs/sdks/iam/README.md)

* [listUsers](docs/sdks/iam/README.md#listusers) - List Users
* [getUser](docs/sdks/iam/README.md#getuser) - Get User
* [listRoles](docs/sdks/iam/README.md#listroles) - List Roles
* [getRole](docs/sdks/iam/README.md#getrole) - Get Role
* [listGroups](docs/sdks/iam/README.md#listgroups) - List Groups
* [getGroup](docs/sdks/iam/README.md#getgroup) - Get Group
* [listPolicies](docs/sdks/iam/README.md#listpolicies) - List Policies
* [getPolicy](docs/sdks/iam/README.md#getpolicy) - Get Policy

### [lms()](docs/sdks/lms/README.md)

* [batchUpsertCourse](docs/sdks/lms/README.md#batchupsertcourse) - Batch Upsert Course
* [listCourses](docs/sdks/lms/README.md#listcourses) - List Courses
* [upsertCourse](docs/sdks/lms/README.md#upsertcourse) - Upsert Course
* [getCourse](docs/sdks/lms/README.md#getcourse) - Get Course
* [listUserAssignments](docs/sdks/lms/README.md#listuserassignments) - List User Assignments
* [createUserAssignment](docs/sdks/lms/README.md#createuserassignment) - Create User Assignment
* [getUserAssignment](docs/sdks/lms/README.md#getuserassignment) - Get User Assignment
* [batchUpsertContent](docs/sdks/lms/README.md#batchupsertcontent) - Batch Upsert Content
* [listContent](docs/sdks/lms/README.md#listcontent) - List Content
* [upsertContent](docs/sdks/lms/README.md#upsertcontent) - Upsert Content
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
* [createCollection](docs/sdks/lms/README.md#createcollection) - Create Collection
* [updateCollection](docs/sdks/lms/README.md#updatecollection) - Update Collection

### [marketing()](docs/sdks/marketing/README.md)

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

### [proxy()](docs/sdks/proxy/README.md)

* [proxyRequest](docs/sdks/proxy/README.md#proxyrequest) - Proxy Request


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
<!-- End Pagination [pagination] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Categories;
import com.stackone.stackone_client_java.models.components.ConnectSessionCreate;
import com.stackone.stackone_client_java.models.components.Security;
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
                    Categories.IAM,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.ATS,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING))
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
import com.stackone.stackone_client_java.models.components.Categories;
import com.stackone.stackone_client_java.models.components.ConnectSessionCreate;
import com.stackone.stackone_client_java.models.components.Security;
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
                    Categories.IAM,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.ATS,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING))
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

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `createConnectSession` method throws the following exceptions:

| Error Type             | Status Code | Content Type |
| ---------------------- | ----------- | ------------ |
| models/errors/SDKError | 4XX, 5XX    | \*/\*        |

### Example

```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Categories;
import com.stackone.stackone_client_java.models.components.ConnectSessionCreate;
import com.stackone.stackone_client_java.models.components.Security;
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
                    Categories.IAM,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.ATS,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING))
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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.stackone.stackone_client_java.StackOne;
import com.stackone.stackone_client_java.models.components.Categories;
import com.stackone.stackone_client_java.models.components.ConnectSessionCreate;
import com.stackone.stackone_client_java.models.components.Security;
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
                    Categories.IAM,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.ATS,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING))
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
import com.stackone.stackone_client_java.models.components.Categories;
import com.stackone.stackone_client_java.models.components.ConnectSessionCreate;
import com.stackone.stackone_client_java.models.components.Security;
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
                    Categories.IAM,
                    Categories.CRM,
                    Categories.IAM,
                    Categories.MARKETING,
                    Categories.LMS,
                    Categories.ATS,
                    Categories.DOCUMENTS,
                    Categories.TICKETING,
                    Categories.SCREENING))
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
