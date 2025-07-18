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
import java.time.OffsetDateTime;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class HrisCreateEmploymentRequestDto {
    /**
     * Custom Unified Fields configured in your StackOne project
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unified_custom_fields")
    private JsonNullable<? extends Map<String, Object>> unifiedCustomFields;

    /**
     * The job title of the employee
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_title")
    private JsonNullable<String> jobTitle;

    /**
     * The pay rate for the employee
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pay_rate")
    private JsonNullable<String> payRate;

    /**
     * The pay period
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pay_period")
    private JsonNullable<? extends HrisCreateEmploymentRequestDtoPayPeriod> payPeriod;

    /**
     * The pay frequency
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pay_frequency")
    private JsonNullable<? extends HrisCreateEmploymentRequestDtoPayFrequency> payFrequency;

    /**
     * The currency used for pay
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pay_currency")
    private JsonNullable<String> payCurrency;

    /**
     * The effective date of the employment contract
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_date")
    private JsonNullable<OffsetDateTime> effectiveDate;

    /**
     * The end date of employment
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private JsonNullable<OffsetDateTime> endDate;

    /**
     * Represents the employee’s position within the organizational hierarchy.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grade")
    private JsonNullable<? extends HrisCreateEmploymentRequestDtoGrade> grade;

    /**
     * The type of employment (e.g., contractor, permanent)
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_type")
    @Deprecated
    private JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentType> employmentType;

    /**
     * The employment work schedule type (e.g., full-time, part-time)
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_contract_type")
    @Deprecated
    private JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentContractType> employmentContractType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("work_time")
    private JsonNullable<? extends HrisCreateEmploymentRequestDtoWorkTime> workTime;

    /**
     * The payroll code of the employee
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payroll_code")
    private JsonNullable<String> payrollCode;

    /**
     * The employee job id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_id")
    private JsonNullable<String> jobId;

    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    @JsonCreator
    public HrisCreateEmploymentRequestDto(
            @JsonProperty("unified_custom_fields") JsonNullable<? extends Map<String, Object>> unifiedCustomFields,
            @JsonProperty("job_title") JsonNullable<String> jobTitle,
            @JsonProperty("pay_rate") JsonNullable<String> payRate,
            @JsonProperty("pay_period") JsonNullable<? extends HrisCreateEmploymentRequestDtoPayPeriod> payPeriod,
            @JsonProperty("pay_frequency") JsonNullable<? extends HrisCreateEmploymentRequestDtoPayFrequency> payFrequency,
            @JsonProperty("pay_currency") JsonNullable<String> payCurrency,
            @JsonProperty("effective_date") JsonNullable<OffsetDateTime> effectiveDate,
            @JsonProperty("end_date") JsonNullable<OffsetDateTime> endDate,
            @JsonProperty("grade") JsonNullable<? extends HrisCreateEmploymentRequestDtoGrade> grade,
            @JsonProperty("employment_type") JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentType> employmentType,
            @JsonProperty("employment_contract_type") JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentContractType> employmentContractType,
            @JsonProperty("work_time") JsonNullable<? extends HrisCreateEmploymentRequestDtoWorkTime> workTime,
            @JsonProperty("payroll_code") JsonNullable<String> payrollCode,
            @JsonProperty("job_id") JsonNullable<String> jobId,
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        Utils.checkNotNull(jobTitle, "jobTitle");
        Utils.checkNotNull(payRate, "payRate");
        Utils.checkNotNull(payPeriod, "payPeriod");
        Utils.checkNotNull(payFrequency, "payFrequency");
        Utils.checkNotNull(payCurrency, "payCurrency");
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(grade, "grade");
        Utils.checkNotNull(employmentType, "employmentType");
        Utils.checkNotNull(employmentContractType, "employmentContractType");
        Utils.checkNotNull(workTime, "workTime");
        Utils.checkNotNull(payrollCode, "payrollCode");
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(passthrough, "passthrough");
        this.unifiedCustomFields = unifiedCustomFields;
        this.jobTitle = jobTitle;
        this.payRate = payRate;
        this.payPeriod = payPeriod;
        this.payFrequency = payFrequency;
        this.payCurrency = payCurrency;
        this.effectiveDate = effectiveDate;
        this.endDate = endDate;
        this.grade = grade;
        this.employmentType = employmentType;
        this.employmentContractType = employmentContractType;
        this.workTime = workTime;
        this.payrollCode = payrollCode;
        this.jobId = jobId;
        this.passthrough = passthrough;
    }
    
    public HrisCreateEmploymentRequestDto() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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
     * The job title of the employee
     */
    @JsonIgnore
    public JsonNullable<String> jobTitle() {
        return jobTitle;
    }

    /**
     * The pay rate for the employee
     */
    @JsonIgnore
    public JsonNullable<String> payRate() {
        return payRate;
    }

    /**
     * The pay period
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmploymentRequestDtoPayPeriod> payPeriod() {
        return (JsonNullable<HrisCreateEmploymentRequestDtoPayPeriod>) payPeriod;
    }

    /**
     * The pay frequency
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmploymentRequestDtoPayFrequency> payFrequency() {
        return (JsonNullable<HrisCreateEmploymentRequestDtoPayFrequency>) payFrequency;
    }

    /**
     * The currency used for pay
     */
    @JsonIgnore
    public JsonNullable<String> payCurrency() {
        return payCurrency;
    }

    /**
     * The effective date of the employment contract
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> effectiveDate() {
        return effectiveDate;
    }

    /**
     * The end date of employment
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> endDate() {
        return endDate;
    }

    /**
     * Represents the employee’s position within the organizational hierarchy.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmploymentRequestDtoGrade> grade() {
        return (JsonNullable<HrisCreateEmploymentRequestDtoGrade>) grade;
    }

    /**
     * The type of employment (e.g., contractor, permanent)
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmploymentRequestDtoEmploymentType> employmentType() {
        return (JsonNullable<HrisCreateEmploymentRequestDtoEmploymentType>) employmentType;
    }

    /**
     * The employment work schedule type (e.g., full-time, part-time)
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmploymentRequestDtoEmploymentContractType> employmentContractType() {
        return (JsonNullable<HrisCreateEmploymentRequestDtoEmploymentContractType>) employmentContractType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmploymentRequestDtoWorkTime> workTime() {
        return (JsonNullable<HrisCreateEmploymentRequestDtoWorkTime>) workTime;
    }

    /**
     * The payroll code of the employee
     */
    @JsonIgnore
    public JsonNullable<String> payrollCode() {
        return payrollCode;
    }

    /**
     * The employee job id
     */
    @JsonIgnore
    public JsonNullable<String> jobId() {
        return jobId;
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
    public HrisCreateEmploymentRequestDto withUnifiedCustomFields(Map<String, Object> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public HrisCreateEmploymentRequestDto withUnifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = unifiedCustomFields;
        return this;
    }

    /**
     * The job title of the employee
     */
    public HrisCreateEmploymentRequestDto withJobTitle(String jobTitle) {
        Utils.checkNotNull(jobTitle, "jobTitle");
        this.jobTitle = JsonNullable.of(jobTitle);
        return this;
    }

    /**
     * The job title of the employee
     */
    public HrisCreateEmploymentRequestDto withJobTitle(JsonNullable<String> jobTitle) {
        Utils.checkNotNull(jobTitle, "jobTitle");
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * The pay rate for the employee
     */
    public HrisCreateEmploymentRequestDto withPayRate(String payRate) {
        Utils.checkNotNull(payRate, "payRate");
        this.payRate = JsonNullable.of(payRate);
        return this;
    }

    /**
     * The pay rate for the employee
     */
    public HrisCreateEmploymentRequestDto withPayRate(JsonNullable<String> payRate) {
        Utils.checkNotNull(payRate, "payRate");
        this.payRate = payRate;
        return this;
    }

    /**
     * The pay period
     */
    public HrisCreateEmploymentRequestDto withPayPeriod(HrisCreateEmploymentRequestDtoPayPeriod payPeriod) {
        Utils.checkNotNull(payPeriod, "payPeriod");
        this.payPeriod = JsonNullable.of(payPeriod);
        return this;
    }

    /**
     * The pay period
     */
    public HrisCreateEmploymentRequestDto withPayPeriod(JsonNullable<? extends HrisCreateEmploymentRequestDtoPayPeriod> payPeriod) {
        Utils.checkNotNull(payPeriod, "payPeriod");
        this.payPeriod = payPeriod;
        return this;
    }

    /**
     * The pay frequency
     */
    public HrisCreateEmploymentRequestDto withPayFrequency(HrisCreateEmploymentRequestDtoPayFrequency payFrequency) {
        Utils.checkNotNull(payFrequency, "payFrequency");
        this.payFrequency = JsonNullable.of(payFrequency);
        return this;
    }

    /**
     * The pay frequency
     */
    public HrisCreateEmploymentRequestDto withPayFrequency(JsonNullable<? extends HrisCreateEmploymentRequestDtoPayFrequency> payFrequency) {
        Utils.checkNotNull(payFrequency, "payFrequency");
        this.payFrequency = payFrequency;
        return this;
    }

    /**
     * The currency used for pay
     */
    public HrisCreateEmploymentRequestDto withPayCurrency(String payCurrency) {
        Utils.checkNotNull(payCurrency, "payCurrency");
        this.payCurrency = JsonNullable.of(payCurrency);
        return this;
    }

    /**
     * The currency used for pay
     */
    public HrisCreateEmploymentRequestDto withPayCurrency(JsonNullable<String> payCurrency) {
        Utils.checkNotNull(payCurrency, "payCurrency");
        this.payCurrency = payCurrency;
        return this;
    }

    /**
     * The effective date of the employment contract
     */
    public HrisCreateEmploymentRequestDto withEffectiveDate(OffsetDateTime effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = JsonNullable.of(effectiveDate);
        return this;
    }

    /**
     * The effective date of the employment contract
     */
    public HrisCreateEmploymentRequestDto withEffectiveDate(JsonNullable<OffsetDateTime> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * The end date of employment
     */
    public HrisCreateEmploymentRequestDto withEndDate(OffsetDateTime endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = JsonNullable.of(endDate);
        return this;
    }

    /**
     * The end date of employment
     */
    public HrisCreateEmploymentRequestDto withEndDate(JsonNullable<OffsetDateTime> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Represents the employee’s position within the organizational hierarchy.
     */
    public HrisCreateEmploymentRequestDto withGrade(HrisCreateEmploymentRequestDtoGrade grade) {
        Utils.checkNotNull(grade, "grade");
        this.grade = JsonNullable.of(grade);
        return this;
    }

    /**
     * Represents the employee’s position within the organizational hierarchy.
     */
    public HrisCreateEmploymentRequestDto withGrade(JsonNullable<? extends HrisCreateEmploymentRequestDtoGrade> grade) {
        Utils.checkNotNull(grade, "grade");
        this.grade = grade;
        return this;
    }

    /**
     * The type of employment (e.g., contractor, permanent)
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public HrisCreateEmploymentRequestDto withEmploymentType(HrisCreateEmploymentRequestDtoEmploymentType employmentType) {
        Utils.checkNotNull(employmentType, "employmentType");
        this.employmentType = JsonNullable.of(employmentType);
        return this;
    }

    /**
     * The type of employment (e.g., contractor, permanent)
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public HrisCreateEmploymentRequestDto withEmploymentType(JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentType> employmentType) {
        Utils.checkNotNull(employmentType, "employmentType");
        this.employmentType = employmentType;
        return this;
    }

    /**
     * The employment work schedule type (e.g., full-time, part-time)
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public HrisCreateEmploymentRequestDto withEmploymentContractType(HrisCreateEmploymentRequestDtoEmploymentContractType employmentContractType) {
        Utils.checkNotNull(employmentContractType, "employmentContractType");
        this.employmentContractType = JsonNullable.of(employmentContractType);
        return this;
    }

    /**
     * The employment work schedule type (e.g., full-time, part-time)
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public HrisCreateEmploymentRequestDto withEmploymentContractType(JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentContractType> employmentContractType) {
        Utils.checkNotNull(employmentContractType, "employmentContractType");
        this.employmentContractType = employmentContractType;
        return this;
    }

    public HrisCreateEmploymentRequestDto withWorkTime(HrisCreateEmploymentRequestDtoWorkTime workTime) {
        Utils.checkNotNull(workTime, "workTime");
        this.workTime = JsonNullable.of(workTime);
        return this;
    }

    public HrisCreateEmploymentRequestDto withWorkTime(JsonNullable<? extends HrisCreateEmploymentRequestDtoWorkTime> workTime) {
        Utils.checkNotNull(workTime, "workTime");
        this.workTime = workTime;
        return this;
    }

    /**
     * The payroll code of the employee
     */
    public HrisCreateEmploymentRequestDto withPayrollCode(String payrollCode) {
        Utils.checkNotNull(payrollCode, "payrollCode");
        this.payrollCode = JsonNullable.of(payrollCode);
        return this;
    }

    /**
     * The payroll code of the employee
     */
    public HrisCreateEmploymentRequestDto withPayrollCode(JsonNullable<String> payrollCode) {
        Utils.checkNotNull(payrollCode, "payrollCode");
        this.payrollCode = payrollCode;
        return this;
    }

    /**
     * The employee job id
     */
    public HrisCreateEmploymentRequestDto withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = JsonNullable.of(jobId);
        return this;
    }

    /**
     * The employee job id
     */
    public HrisCreateEmploymentRequestDto withJobId(JsonNullable<String> jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public HrisCreateEmploymentRequestDto withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public HrisCreateEmploymentRequestDto withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
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
        HrisCreateEmploymentRequestDto other = (HrisCreateEmploymentRequestDto) o;
        return 
            Utils.enhancedDeepEquals(this.unifiedCustomFields, other.unifiedCustomFields) &&
            Utils.enhancedDeepEquals(this.jobTitle, other.jobTitle) &&
            Utils.enhancedDeepEquals(this.payRate, other.payRate) &&
            Utils.enhancedDeepEquals(this.payPeriod, other.payPeriod) &&
            Utils.enhancedDeepEquals(this.payFrequency, other.payFrequency) &&
            Utils.enhancedDeepEquals(this.payCurrency, other.payCurrency) &&
            Utils.enhancedDeepEquals(this.effectiveDate, other.effectiveDate) &&
            Utils.enhancedDeepEquals(this.endDate, other.endDate) &&
            Utils.enhancedDeepEquals(this.grade, other.grade) &&
            Utils.enhancedDeepEquals(this.employmentType, other.employmentType) &&
            Utils.enhancedDeepEquals(this.employmentContractType, other.employmentContractType) &&
            Utils.enhancedDeepEquals(this.workTime, other.workTime) &&
            Utils.enhancedDeepEquals(this.payrollCode, other.payrollCode) &&
            Utils.enhancedDeepEquals(this.jobId, other.jobId) &&
            Utils.enhancedDeepEquals(this.passthrough, other.passthrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            unifiedCustomFields, jobTitle, payRate,
            payPeriod, payFrequency, payCurrency,
            effectiveDate, endDate, grade,
            employmentType, employmentContractType, workTime,
            payrollCode, jobId, passthrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisCreateEmploymentRequestDto.class,
                "unifiedCustomFields", unifiedCustomFields,
                "jobTitle", jobTitle,
                "payRate", payRate,
                "payPeriod", payPeriod,
                "payFrequency", payFrequency,
                "payCurrency", payCurrency,
                "effectiveDate", effectiveDate,
                "endDate", endDate,
                "grade", grade,
                "employmentType", employmentType,
                "employmentContractType", employmentContractType,
                "workTime", workTime,
                "payrollCode", payrollCode,
                "jobId", jobId,
                "passthrough", passthrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends Map<String, Object>> unifiedCustomFields = JsonNullable.undefined();

        private JsonNullable<String> jobTitle = JsonNullable.undefined();

        private JsonNullable<String> payRate = JsonNullable.undefined();

        private JsonNullable<? extends HrisCreateEmploymentRequestDtoPayPeriod> payPeriod = JsonNullable.undefined();

        private JsonNullable<? extends HrisCreateEmploymentRequestDtoPayFrequency> payFrequency = JsonNullable.undefined();

        private JsonNullable<String> payCurrency = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> effectiveDate = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> endDate = JsonNullable.undefined();

        private JsonNullable<? extends HrisCreateEmploymentRequestDtoGrade> grade = JsonNullable.undefined();

        @Deprecated
        private JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentType> employmentType = JsonNullable.undefined();

        @Deprecated
        private JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentContractType> employmentContractType = JsonNullable.undefined();

        private JsonNullable<? extends HrisCreateEmploymentRequestDtoWorkTime> workTime = JsonNullable.undefined();

        private JsonNullable<String> payrollCode = JsonNullable.undefined();

        private JsonNullable<String> jobId = JsonNullable.undefined();

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
         * The job title of the employee
         */
        public Builder jobTitle(String jobTitle) {
            Utils.checkNotNull(jobTitle, "jobTitle");
            this.jobTitle = JsonNullable.of(jobTitle);
            return this;
        }

        /**
         * The job title of the employee
         */
        public Builder jobTitle(JsonNullable<String> jobTitle) {
            Utils.checkNotNull(jobTitle, "jobTitle");
            this.jobTitle = jobTitle;
            return this;
        }


        /**
         * The pay rate for the employee
         */
        public Builder payRate(String payRate) {
            Utils.checkNotNull(payRate, "payRate");
            this.payRate = JsonNullable.of(payRate);
            return this;
        }

        /**
         * The pay rate for the employee
         */
        public Builder payRate(JsonNullable<String> payRate) {
            Utils.checkNotNull(payRate, "payRate");
            this.payRate = payRate;
            return this;
        }


        /**
         * The pay period
         */
        public Builder payPeriod(HrisCreateEmploymentRequestDtoPayPeriod payPeriod) {
            Utils.checkNotNull(payPeriod, "payPeriod");
            this.payPeriod = JsonNullable.of(payPeriod);
            return this;
        }

        /**
         * The pay period
         */
        public Builder payPeriod(JsonNullable<? extends HrisCreateEmploymentRequestDtoPayPeriod> payPeriod) {
            Utils.checkNotNull(payPeriod, "payPeriod");
            this.payPeriod = payPeriod;
            return this;
        }


        /**
         * The pay frequency
         */
        public Builder payFrequency(HrisCreateEmploymentRequestDtoPayFrequency payFrequency) {
            Utils.checkNotNull(payFrequency, "payFrequency");
            this.payFrequency = JsonNullable.of(payFrequency);
            return this;
        }

        /**
         * The pay frequency
         */
        public Builder payFrequency(JsonNullable<? extends HrisCreateEmploymentRequestDtoPayFrequency> payFrequency) {
            Utils.checkNotNull(payFrequency, "payFrequency");
            this.payFrequency = payFrequency;
            return this;
        }


        /**
         * The currency used for pay
         */
        public Builder payCurrency(String payCurrency) {
            Utils.checkNotNull(payCurrency, "payCurrency");
            this.payCurrency = JsonNullable.of(payCurrency);
            return this;
        }

        /**
         * The currency used for pay
         */
        public Builder payCurrency(JsonNullable<String> payCurrency) {
            Utils.checkNotNull(payCurrency, "payCurrency");
            this.payCurrency = payCurrency;
            return this;
        }


        /**
         * The effective date of the employment contract
         */
        public Builder effectiveDate(OffsetDateTime effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = JsonNullable.of(effectiveDate);
            return this;
        }

        /**
         * The effective date of the employment contract
         */
        public Builder effectiveDate(JsonNullable<OffsetDateTime> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }


        /**
         * The end date of employment
         */
        public Builder endDate(OffsetDateTime endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = JsonNullable.of(endDate);
            return this;
        }

        /**
         * The end date of employment
         */
        public Builder endDate(JsonNullable<OffsetDateTime> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }


        /**
         * Represents the employee’s position within the organizational hierarchy.
         */
        public Builder grade(HrisCreateEmploymentRequestDtoGrade grade) {
            Utils.checkNotNull(grade, "grade");
            this.grade = JsonNullable.of(grade);
            return this;
        }

        /**
         * Represents the employee’s position within the organizational hierarchy.
         */
        public Builder grade(JsonNullable<? extends HrisCreateEmploymentRequestDtoGrade> grade) {
            Utils.checkNotNull(grade, "grade");
            this.grade = grade;
            return this;
        }


        /**
         * The type of employment (e.g., contractor, permanent)
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder employmentType(HrisCreateEmploymentRequestDtoEmploymentType employmentType) {
            Utils.checkNotNull(employmentType, "employmentType");
            this.employmentType = JsonNullable.of(employmentType);
            return this;
        }

        /**
         * The type of employment (e.g., contractor, permanent)
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder employmentType(JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentType> employmentType) {
            Utils.checkNotNull(employmentType, "employmentType");
            this.employmentType = employmentType;
            return this;
        }


        /**
         * The employment work schedule type (e.g., full-time, part-time)
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder employmentContractType(HrisCreateEmploymentRequestDtoEmploymentContractType employmentContractType) {
            Utils.checkNotNull(employmentContractType, "employmentContractType");
            this.employmentContractType = JsonNullable.of(employmentContractType);
            return this;
        }

        /**
         * The employment work schedule type (e.g., full-time, part-time)
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder employmentContractType(JsonNullable<? extends HrisCreateEmploymentRequestDtoEmploymentContractType> employmentContractType) {
            Utils.checkNotNull(employmentContractType, "employmentContractType");
            this.employmentContractType = employmentContractType;
            return this;
        }


        public Builder workTime(HrisCreateEmploymentRequestDtoWorkTime workTime) {
            Utils.checkNotNull(workTime, "workTime");
            this.workTime = JsonNullable.of(workTime);
            return this;
        }

        public Builder workTime(JsonNullable<? extends HrisCreateEmploymentRequestDtoWorkTime> workTime) {
            Utils.checkNotNull(workTime, "workTime");
            this.workTime = workTime;
            return this;
        }


        /**
         * The payroll code of the employee
         */
        public Builder payrollCode(String payrollCode) {
            Utils.checkNotNull(payrollCode, "payrollCode");
            this.payrollCode = JsonNullable.of(payrollCode);
            return this;
        }

        /**
         * The payroll code of the employee
         */
        public Builder payrollCode(JsonNullable<String> payrollCode) {
            Utils.checkNotNull(payrollCode, "payrollCode");
            this.payrollCode = payrollCode;
            return this;
        }


        /**
         * The employee job id
         */
        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = JsonNullable.of(jobId);
            return this;
        }

        /**
         * The employee job id
         */
        public Builder jobId(JsonNullable<String> jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
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

        public HrisCreateEmploymentRequestDto build() {

            return new HrisCreateEmploymentRequestDto(
                unifiedCustomFields, jobTitle, payRate,
                payPeriod, payFrequency, payCurrency,
                effectiveDate, endDate, grade,
                employmentType, employmentContractType, workTime,
                payrollCode, jobId, passthrough);
        }

    }
}
