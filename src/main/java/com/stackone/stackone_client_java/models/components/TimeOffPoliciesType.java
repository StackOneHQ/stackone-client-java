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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * TimeOffPoliciesType - The type of this policy
 */

public class TimeOffPoliciesType {

    /**
     * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends TimeOffPoliciesValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends TimeOffPoliciesSourceValue> sourceValue;

    @JsonCreator
    public TimeOffPoliciesType(
            @JsonProperty("value") JsonNullable<? extends TimeOffPoliciesValue> value,
            @JsonProperty("source_value") JsonNullable<? extends TimeOffPoliciesSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public TimeOffPoliciesType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TimeOffPoliciesValue> value() {
        return (JsonNullable<TimeOffPoliciesValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TimeOffPoliciesSourceValue> sourceValue() {
        return (JsonNullable<TimeOffPoliciesSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
     */
    public TimeOffPoliciesType withValue(TimeOffPoliciesValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
     */
    public TimeOffPoliciesType withValue(JsonNullable<? extends TimeOffPoliciesValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public TimeOffPoliciesType withSourceValue(TimeOffPoliciesSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public TimeOffPoliciesType withSourceValue(JsonNullable<? extends TimeOffPoliciesSourceValue> sourceValue) {
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
        TimeOffPoliciesType other = (TimeOffPoliciesType) o;
        return 
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.sourceValue, other.sourceValue);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            value,
            sourceValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TimeOffPoliciesType.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends TimeOffPoliciesValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends TimeOffPoliciesSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
         */
        public Builder value(TimeOffPoliciesValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The unified value for the type of the time off policy. If the provider does not specify this unit, the value will be set to unmapped_value
         */
        public Builder value(JsonNullable<? extends TimeOffPoliciesValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(TimeOffPoliciesSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends TimeOffPoliciesSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public TimeOffPoliciesType build() {
            return new TimeOffPoliciesType(
                value,
                sourceValue);
        }
    }
}

