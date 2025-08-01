/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class AtsUpdateJobRequestDto {
    /**
     * Custom Unified Fields configured in your StackOne project
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unified_custom_fields")
    private JsonNullable<? extends Map<String, Object>> unifiedCustomFields;

    /**
     * Code of the job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<String> code;

    /**
     * Title of the job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * Description of the job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * Status of the job
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    @Deprecated
    private JsonNullable<String> status;

    /**
     * Status of the job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_status")
    private JsonNullable<? extends AtsUpdateJobRequestDtoJobStatus> jobStatus;

    /**
     * Department ids of the job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("department_ids")
    private JsonNullable<? extends List<String>> departmentIds;

    /**
     * Location ids of the job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_ids")
    private JsonNullable<? extends List<String>> locationIds;

    /**
     * Hiring team for the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hiring_team")
    private JsonNullable<? extends List<JobHiringTeam>> hiringTeam;

    /**
     * Interview stages for the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interview_stages")
    private JsonNullable<? extends List<InterviewStage>> interviewStages;

    /**
     * Confidential status of the job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("confidential")
    private JsonNullable<? extends AtsUpdateJobRequestDtoConfidential> confidential;

    /**
     * The job custom fields
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_fields")
    private JsonNullable<? extends List<CustomFields>> customFields;

    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    @JsonCreator
    public AtsUpdateJobRequestDto(
            @JsonProperty("unified_custom_fields") JsonNullable<? extends Map<String, Object>> unifiedCustomFields,
            @JsonProperty("code") JsonNullable<String> code,
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("status") JsonNullable<String> status,
            @JsonProperty("job_status") JsonNullable<? extends AtsUpdateJobRequestDtoJobStatus> jobStatus,
            @JsonProperty("department_ids") JsonNullable<? extends List<String>> departmentIds,
            @JsonProperty("location_ids") JsonNullable<? extends List<String>> locationIds,
            @JsonProperty("hiring_team") JsonNullable<? extends List<JobHiringTeam>> hiringTeam,
            @JsonProperty("interview_stages") JsonNullable<? extends List<InterviewStage>> interviewStages,
            @JsonProperty("confidential") JsonNullable<? extends AtsUpdateJobRequestDtoConfidential> confidential,
            @JsonProperty("custom_fields") JsonNullable<? extends List<CustomFields>> customFields,
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(jobStatus, "jobStatus");
        Utils.checkNotNull(departmentIds, "departmentIds");
        Utils.checkNotNull(locationIds, "locationIds");
        Utils.checkNotNull(hiringTeam, "hiringTeam");
        Utils.checkNotNull(interviewStages, "interviewStages");
        Utils.checkNotNull(confidential, "confidential");
        Utils.checkNotNull(customFields, "customFields");
        Utils.checkNotNull(passthrough, "passthrough");
        this.unifiedCustomFields = unifiedCustomFields;
        this.code = code;
        this.title = title;
        this.description = description;
        this.status = status;
        this.jobStatus = jobStatus;
        this.departmentIds = departmentIds;
        this.locationIds = locationIds;
        this.hiringTeam = hiringTeam;
        this.interviewStages = interviewStages;
        this.confidential = confidential;
        this.customFields = customFields;
        this.passthrough = passthrough;
    }
    
    public AtsUpdateJobRequestDto() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined());
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> unifiedCustomFields() {
        return (JsonNullable<Map<String, Object>>) unifiedCustomFields;
    }

    /**
     * Code of the job
     */
    @JsonIgnore
    public JsonNullable<String> code() {
        return code;
    }

    /**
     * Title of the job
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * Description of the job
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Status of the job
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> status() {
        return status;
    }

    /**
     * Status of the job
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateJobRequestDtoJobStatus> jobStatus() {
        return (JsonNullable<AtsUpdateJobRequestDtoJobStatus>) jobStatus;
    }

    /**
     * Department ids of the job
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> departmentIds() {
        return (JsonNullable<List<String>>) departmentIds;
    }

    /**
     * Location ids of the job
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> locationIds() {
        return (JsonNullable<List<String>>) locationIds;
    }

    /**
     * Hiring team for the job.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<JobHiringTeam>> hiringTeam() {
        return (JsonNullable<List<JobHiringTeam>>) hiringTeam;
    }

    /**
     * Interview stages for the job.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<InterviewStage>> interviewStages() {
        return (JsonNullable<List<InterviewStage>>) interviewStages;
    }

    /**
     * Confidential status of the job
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateJobRequestDtoConfidential> confidential() {
        return (JsonNullable<AtsUpdateJobRequestDtoConfidential>) confidential;
    }

    /**
     * The job custom fields
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<CustomFields>> customFields() {
        return (JsonNullable<List<CustomFields>>) customFields;
    }

    /**
     * Value to pass through to the provider
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> passthrough() {
        return (JsonNullable<Map<String, Object>>) passthrough;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public AtsUpdateJobRequestDto withUnifiedCustomFields(Map<String, Object> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public AtsUpdateJobRequestDto withUnifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = unifiedCustomFields;
        return this;
    }

    /**
     * Code of the job
     */
    public AtsUpdateJobRequestDto withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    /**
     * Code of the job
     */
    public AtsUpdateJobRequestDto withCode(JsonNullable<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Title of the job
     */
    public AtsUpdateJobRequestDto withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * Title of the job
     */
    public AtsUpdateJobRequestDto withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * Description of the job
     */
    public AtsUpdateJobRequestDto withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the job
     */
    public AtsUpdateJobRequestDto withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Status of the job
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsUpdateJobRequestDto withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * Status of the job
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsUpdateJobRequestDto withStatus(JsonNullable<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Status of the job
     */
    public AtsUpdateJobRequestDto withJobStatus(AtsUpdateJobRequestDtoJobStatus jobStatus) {
        Utils.checkNotNull(jobStatus, "jobStatus");
        this.jobStatus = JsonNullable.of(jobStatus);
        return this;
    }

    /**
     * Status of the job
     */
    public AtsUpdateJobRequestDto withJobStatus(JsonNullable<? extends AtsUpdateJobRequestDtoJobStatus> jobStatus) {
        Utils.checkNotNull(jobStatus, "jobStatus");
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * Department ids of the job
     */
    public AtsUpdateJobRequestDto withDepartmentIds(List<String> departmentIds) {
        Utils.checkNotNull(departmentIds, "departmentIds");
        this.departmentIds = JsonNullable.of(departmentIds);
        return this;
    }

    /**
     * Department ids of the job
     */
    public AtsUpdateJobRequestDto withDepartmentIds(JsonNullable<? extends List<String>> departmentIds) {
        Utils.checkNotNull(departmentIds, "departmentIds");
        this.departmentIds = departmentIds;
        return this;
    }

    /**
     * Location ids of the job
     */
    public AtsUpdateJobRequestDto withLocationIds(List<String> locationIds) {
        Utils.checkNotNull(locationIds, "locationIds");
        this.locationIds = JsonNullable.of(locationIds);
        return this;
    }

    /**
     * Location ids of the job
     */
    public AtsUpdateJobRequestDto withLocationIds(JsonNullable<? extends List<String>> locationIds) {
        Utils.checkNotNull(locationIds, "locationIds");
        this.locationIds = locationIds;
        return this;
    }

    /**
     * Hiring team for the job.
     */
    public AtsUpdateJobRequestDto withHiringTeam(List<JobHiringTeam> hiringTeam) {
        Utils.checkNotNull(hiringTeam, "hiringTeam");
        this.hiringTeam = JsonNullable.of(hiringTeam);
        return this;
    }

    /**
     * Hiring team for the job.
     */
    public AtsUpdateJobRequestDto withHiringTeam(JsonNullable<? extends List<JobHiringTeam>> hiringTeam) {
        Utils.checkNotNull(hiringTeam, "hiringTeam");
        this.hiringTeam = hiringTeam;
        return this;
    }

    /**
     * Interview stages for the job.
     */
    public AtsUpdateJobRequestDto withInterviewStages(List<InterviewStage> interviewStages) {
        Utils.checkNotNull(interviewStages, "interviewStages");
        this.interviewStages = JsonNullable.of(interviewStages);
        return this;
    }

    /**
     * Interview stages for the job.
     */
    public AtsUpdateJobRequestDto withInterviewStages(JsonNullable<? extends List<InterviewStage>> interviewStages) {
        Utils.checkNotNull(interviewStages, "interviewStages");
        this.interviewStages = interviewStages;
        return this;
    }

    /**
     * Confidential status of the job
     */
    public AtsUpdateJobRequestDto withConfidential(AtsUpdateJobRequestDtoConfidential confidential) {
        Utils.checkNotNull(confidential, "confidential");
        this.confidential = JsonNullable.of(confidential);
        return this;
    }

    /**
     * Confidential status of the job
     */
    public AtsUpdateJobRequestDto withConfidential(JsonNullable<? extends AtsUpdateJobRequestDtoConfidential> confidential) {
        Utils.checkNotNull(confidential, "confidential");
        this.confidential = confidential;
        return this;
    }

    /**
     * The job custom fields
     */
    public AtsUpdateJobRequestDto withCustomFields(List<CustomFields> customFields) {
        Utils.checkNotNull(customFields, "customFields");
        this.customFields = JsonNullable.of(customFields);
        return this;
    }

    /**
     * The job custom fields
     */
    public AtsUpdateJobRequestDto withCustomFields(JsonNullable<? extends List<CustomFields>> customFields) {
        Utils.checkNotNull(customFields, "customFields");
        this.customFields = customFields;
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public AtsUpdateJobRequestDto withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public AtsUpdateJobRequestDto withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = passthrough;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtsUpdateJobRequestDto other = (AtsUpdateJobRequestDto) o;
        return 
            Utils.enhancedDeepEquals(this.unifiedCustomFields, other.unifiedCustomFields) &&
            Utils.enhancedDeepEquals(this.code, other.code) &&
            Utils.enhancedDeepEquals(this.title, other.title) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.jobStatus, other.jobStatus) &&
            Utils.enhancedDeepEquals(this.departmentIds, other.departmentIds) &&
            Utils.enhancedDeepEquals(this.locationIds, other.locationIds) &&
            Utils.enhancedDeepEquals(this.hiringTeam, other.hiringTeam) &&
            Utils.enhancedDeepEquals(this.interviewStages, other.interviewStages) &&
            Utils.enhancedDeepEquals(this.confidential, other.confidential) &&
            Utils.enhancedDeepEquals(this.customFields, other.customFields) &&
            Utils.enhancedDeepEquals(this.passthrough, other.passthrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            unifiedCustomFields, code, title,
            description, status, jobStatus,
            departmentIds, locationIds, hiringTeam,
            interviewStages, confidential, customFields,
            passthrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsUpdateJobRequestDto.class,
                "unifiedCustomFields", unifiedCustomFields,
                "code", code,
                "title", title,
                "description", description,
                "status", status,
                "jobStatus", jobStatus,
                "departmentIds", departmentIds,
                "locationIds", locationIds,
                "hiringTeam", hiringTeam,
                "interviewStages", interviewStages,
                "confidential", confidential,
                "customFields", customFields,
                "passthrough", passthrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends Map<String, Object>> unifiedCustomFields = JsonNullable.undefined();

        private JsonNullable<String> code = JsonNullable.undefined();

        private JsonNullable<String> title = JsonNullable.undefined();

        private JsonNullable<String> description = JsonNullable.undefined();

        @Deprecated
        private JsonNullable<String> status = JsonNullable.undefined();

        private JsonNullable<? extends AtsUpdateJobRequestDtoJobStatus> jobStatus = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> departmentIds = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> locationIds = JsonNullable.undefined();

        private JsonNullable<? extends List<JobHiringTeam>> hiringTeam = JsonNullable.undefined();

        private JsonNullable<? extends List<InterviewStage>> interviewStages = JsonNullable.undefined();

        private JsonNullable<? extends AtsUpdateJobRequestDtoConfidential> confidential = JsonNullable.undefined();

        private JsonNullable<? extends List<CustomFields>> customFields = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> passthrough = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Custom Unified Fields configured in your StackOne project
         */
        public Builder unifiedCustomFields(Map<String, Object> unifiedCustomFields) {
            Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
            this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
            return this;
        }

        /**
         * Custom Unified Fields configured in your StackOne project
         */
        public Builder unifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
            Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
            this.unifiedCustomFields = unifiedCustomFields;
            return this;
        }


        /**
         * Code of the job
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        /**
         * Code of the job
         */
        public Builder code(JsonNullable<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }


        /**
         * Title of the job
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * Title of the job
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }


        /**
         * Description of the job
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description of the job
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }


        /**
         * Status of the job
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * Status of the job
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder status(JsonNullable<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        /**
         * Status of the job
         */
        public Builder jobStatus(AtsUpdateJobRequestDtoJobStatus jobStatus) {
            Utils.checkNotNull(jobStatus, "jobStatus");
            this.jobStatus = JsonNullable.of(jobStatus);
            return this;
        }

        /**
         * Status of the job
         */
        public Builder jobStatus(JsonNullable<? extends AtsUpdateJobRequestDtoJobStatus> jobStatus) {
            Utils.checkNotNull(jobStatus, "jobStatus");
            this.jobStatus = jobStatus;
            return this;
        }


        /**
         * Department ids of the job
         */
        public Builder departmentIds(List<String> departmentIds) {
            Utils.checkNotNull(departmentIds, "departmentIds");
            this.departmentIds = JsonNullable.of(departmentIds);
            return this;
        }

        /**
         * Department ids of the job
         */
        public Builder departmentIds(JsonNullable<? extends List<String>> departmentIds) {
            Utils.checkNotNull(departmentIds, "departmentIds");
            this.departmentIds = departmentIds;
            return this;
        }


        /**
         * Location ids of the job
         */
        public Builder locationIds(List<String> locationIds) {
            Utils.checkNotNull(locationIds, "locationIds");
            this.locationIds = JsonNullable.of(locationIds);
            return this;
        }

        /**
         * Location ids of the job
         */
        public Builder locationIds(JsonNullable<? extends List<String>> locationIds) {
            Utils.checkNotNull(locationIds, "locationIds");
            this.locationIds = locationIds;
            return this;
        }


        /**
         * Hiring team for the job.
         */
        public Builder hiringTeam(List<JobHiringTeam> hiringTeam) {
            Utils.checkNotNull(hiringTeam, "hiringTeam");
            this.hiringTeam = JsonNullable.of(hiringTeam);
            return this;
        }

        /**
         * Hiring team for the job.
         */
        public Builder hiringTeam(JsonNullable<? extends List<JobHiringTeam>> hiringTeam) {
            Utils.checkNotNull(hiringTeam, "hiringTeam");
            this.hiringTeam = hiringTeam;
            return this;
        }


        /**
         * Interview stages for the job.
         */
        public Builder interviewStages(List<InterviewStage> interviewStages) {
            Utils.checkNotNull(interviewStages, "interviewStages");
            this.interviewStages = JsonNullable.of(interviewStages);
            return this;
        }

        /**
         * Interview stages for the job.
         */
        public Builder interviewStages(JsonNullable<? extends List<InterviewStage>> interviewStages) {
            Utils.checkNotNull(interviewStages, "interviewStages");
            this.interviewStages = interviewStages;
            return this;
        }


        /**
         * Confidential status of the job
         */
        public Builder confidential(AtsUpdateJobRequestDtoConfidential confidential) {
            Utils.checkNotNull(confidential, "confidential");
            this.confidential = JsonNullable.of(confidential);
            return this;
        }

        /**
         * Confidential status of the job
         */
        public Builder confidential(JsonNullable<? extends AtsUpdateJobRequestDtoConfidential> confidential) {
            Utils.checkNotNull(confidential, "confidential");
            this.confidential = confidential;
            return this;
        }


        /**
         * The job custom fields
         */
        public Builder customFields(List<CustomFields> customFields) {
            Utils.checkNotNull(customFields, "customFields");
            this.customFields = JsonNullable.of(customFields);
            return this;
        }

        /**
         * The job custom fields
         */
        public Builder customFields(JsonNullable<? extends List<CustomFields>> customFields) {
            Utils.checkNotNull(customFields, "customFields");
            this.customFields = customFields;
            return this;
        }


        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(Map<String, Object> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = JsonNullable.of(passthrough);
            return this;
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = passthrough;
            return this;
        }

        public AtsUpdateJobRequestDto build() {

            return new AtsUpdateJobRequestDto(
                unifiedCustomFields, code, title,
                description, status, jobStatus,
                departmentIds, locationIds, hiringTeam,
                interviewStages, confidential, customFields,
                passthrough);
        }

    }
}
