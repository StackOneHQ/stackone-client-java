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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * HrisCreateEmployeeRequestDtoPayPeriod
 * 
 * <p>The pay period
 */
public class HrisCreateEmployeeRequestDtoPayPeriod {
    /**
     * The pay period of the job postings.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentValue> value;

    /**
     * The source value of the pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentSourceValue> sourceValue;

    @JsonCreator
    public HrisCreateEmployeeRequestDtoPayPeriod(
            @JsonProperty("value") JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisCreateEmployeeRequestDtoPayPeriod() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The pay period of the job postings.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoEmploymentValue> value() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoEmploymentValue>) value;
    }

    /**
     * The source value of the pay period.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoEmploymentSourceValue> sourceValue() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoEmploymentSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The pay period of the job postings.
     */
    public HrisCreateEmployeeRequestDtoPayPeriod withValue(HrisCreateEmployeeRequestDtoEmploymentValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The pay period of the job postings.
     */
    public HrisCreateEmployeeRequestDtoPayPeriod withValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The source value of the pay period.
     */
    public HrisCreateEmployeeRequestDtoPayPeriod withSourceValue(HrisCreateEmployeeRequestDtoEmploymentSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The source value of the pay period.
     */
    public HrisCreateEmployeeRequestDtoPayPeriod withSourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentSourceValue> sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = sourceValue;
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
        HrisCreateEmployeeRequestDtoPayPeriod other = (HrisCreateEmployeeRequestDtoPayPeriod) o;
        return 
            Utils.enhancedDeepEquals(this.value, other.value) &&
            Utils.enhancedDeepEquals(this.sourceValue, other.sourceValue);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            value, sourceValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisCreateEmployeeRequestDtoPayPeriod.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentValue> value = JsonNullable.undefined();

        private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The pay period of the job postings.
         */
        public Builder value(HrisCreateEmployeeRequestDtoEmploymentValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The pay period of the job postings.
         */
        public Builder value(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        /**
         * The source value of the pay period.
         */
        public Builder sourceValue(HrisCreateEmployeeRequestDtoEmploymentSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The source value of the pay period.
         */
        public Builder sourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public HrisCreateEmployeeRequestDtoPayPeriod build() {

            return new HrisCreateEmployeeRequestDtoPayPeriod(
                value, sourceValue);
        }

    }
}
