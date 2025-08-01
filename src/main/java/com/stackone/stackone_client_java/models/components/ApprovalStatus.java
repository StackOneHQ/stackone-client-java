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
 * ApprovalStatus
 * 
 * <p>The approval status of the shift
 */
public class ApprovalStatus {
    /**
     * The approval status of the shift
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisShiftApprovalStatusValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisShiftApprovalStatusSourceValue> sourceValue;

    @JsonCreator
    public ApprovalStatus(
            @JsonProperty("value") JsonNullable<? extends HrisShiftApprovalStatusValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisShiftApprovalStatusSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public ApprovalStatus() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The approval status of the shift
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisShiftApprovalStatusValue> value() {
        return (JsonNullable<HrisShiftApprovalStatusValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisShiftApprovalStatusSourceValue> sourceValue() {
        return (JsonNullable<HrisShiftApprovalStatusSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The approval status of the shift
     */
    public ApprovalStatus withValue(HrisShiftApprovalStatusValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The approval status of the shift
     */
    public ApprovalStatus withValue(JsonNullable<? extends HrisShiftApprovalStatusValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public ApprovalStatus withSourceValue(HrisShiftApprovalStatusSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public ApprovalStatus withSourceValue(JsonNullable<? extends HrisShiftApprovalStatusSourceValue> sourceValue) {
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
        ApprovalStatus other = (ApprovalStatus) o;
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
        return Utils.toString(ApprovalStatus.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends HrisShiftApprovalStatusValue> value = JsonNullable.undefined();

        private JsonNullable<? extends HrisShiftApprovalStatusSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The approval status of the shift
         */
        public Builder value(HrisShiftApprovalStatusValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The approval status of the shift
         */
        public Builder value(JsonNullable<? extends HrisShiftApprovalStatusValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(HrisShiftApprovalStatusSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisShiftApprovalStatusSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public ApprovalStatus build() {

            return new ApprovalStatus(
                value, sourceValue);
        }

    }
}
