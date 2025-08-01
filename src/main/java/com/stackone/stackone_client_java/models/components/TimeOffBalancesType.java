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
 * TimeOffBalancesType
 * 
 * <p>The type of this policy
 */
public class TimeOffBalancesType {
    /**
     * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends TimeOffBalancesPolicyTypeValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends TimeOffBalancesPolicyTypeSourceValue> sourceValue;

    @JsonCreator
    public TimeOffBalancesType(
            @JsonProperty("value") JsonNullable<? extends TimeOffBalancesPolicyTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends TimeOffBalancesPolicyTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public TimeOffBalancesType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TimeOffBalancesPolicyTypeValue> value() {
        return (JsonNullable<TimeOffBalancesPolicyTypeValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TimeOffBalancesPolicyTypeSourceValue> sourceValue() {
        return (JsonNullable<TimeOffBalancesPolicyTypeSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
     */
    public TimeOffBalancesType withValue(TimeOffBalancesPolicyTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
     */
    public TimeOffBalancesType withValue(JsonNullable<? extends TimeOffBalancesPolicyTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public TimeOffBalancesType withSourceValue(TimeOffBalancesPolicyTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public TimeOffBalancesType withSourceValue(JsonNullable<? extends TimeOffBalancesPolicyTypeSourceValue> sourceValue) {
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
        TimeOffBalancesType other = (TimeOffBalancesType) o;
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
        return Utils.toString(TimeOffBalancesType.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends TimeOffBalancesPolicyTypeValue> value = JsonNullable.undefined();

        private JsonNullable<? extends TimeOffBalancesPolicyTypeSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
         */
        public Builder value(TimeOffBalancesPolicyTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
         */
        public Builder value(JsonNullable<? extends TimeOffBalancesPolicyTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(TimeOffBalancesPolicyTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends TimeOffBalancesPolicyTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public TimeOffBalancesType build() {

            return new TimeOffBalancesType(
                value, sourceValue);
        }

    }
}
