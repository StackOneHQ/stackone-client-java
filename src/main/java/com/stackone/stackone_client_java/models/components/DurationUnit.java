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
 * DurationUnit
 * 
 * <p>The duration unit of the current policy
 */
public class DurationUnit {
    /**
     * The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends TimeOffPoliciesDurationUnitValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends TimeOffPoliciesDurationUnitSourceValue> sourceValue;

    @JsonCreator
    public DurationUnit(
            @JsonProperty("value") JsonNullable<? extends TimeOffPoliciesDurationUnitValue> value,
            @JsonProperty("source_value") JsonNullable<? extends TimeOffPoliciesDurationUnitSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public DurationUnit() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TimeOffPoliciesDurationUnitValue> value() {
        return (JsonNullable<TimeOffPoliciesDurationUnitValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TimeOffPoliciesDurationUnitSourceValue> sourceValue() {
        return (JsonNullable<TimeOffPoliciesDurationUnitSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown
     */
    public DurationUnit withValue(TimeOffPoliciesDurationUnitValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown
     */
    public DurationUnit withValue(JsonNullable<? extends TimeOffPoliciesDurationUnitValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public DurationUnit withSourceValue(TimeOffPoliciesDurationUnitSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public DurationUnit withSourceValue(JsonNullable<? extends TimeOffPoliciesDurationUnitSourceValue> sourceValue) {
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
        DurationUnit other = (DurationUnit) o;
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
        return Utils.toString(DurationUnit.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends TimeOffPoliciesDurationUnitValue> value = JsonNullable.undefined();

        private JsonNullable<? extends TimeOffPoliciesDurationUnitSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown
         */
        public Builder value(TimeOffPoliciesDurationUnitValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown
         */
        public Builder value(JsonNullable<? extends TimeOffPoliciesDurationUnitValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(TimeOffPoliciesDurationUnitSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends TimeOffPoliciesDurationUnitSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public DurationUnit build() {

            return new DurationUnit(
                value, sourceValue);
        }

    }
}
