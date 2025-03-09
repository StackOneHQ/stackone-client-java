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
 * EmployeeLocationType - The location type
 */

public class EmployeeLocationType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EmployeeWorkLocationLocationTypeValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EmployeeWorkLocationLocationTypeSourceValue> sourceValue;

    @JsonCreator
    public EmployeeLocationType(
            @JsonProperty("value") JsonNullable<? extends EmployeeWorkLocationLocationTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EmployeeWorkLocationLocationTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public EmployeeLocationType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeWorkLocationLocationTypeValue> value() {
        return (JsonNullable<EmployeeWorkLocationLocationTypeValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeWorkLocationLocationTypeSourceValue> sourceValue() {
        return (JsonNullable<EmployeeWorkLocationLocationTypeSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EmployeeLocationType withValue(EmployeeWorkLocationLocationTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public EmployeeLocationType withValue(JsonNullable<? extends EmployeeWorkLocationLocationTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public EmployeeLocationType withSourceValue(EmployeeWorkLocationLocationTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public EmployeeLocationType withSourceValue(JsonNullable<? extends EmployeeWorkLocationLocationTypeSourceValue> sourceValue) {
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
        EmployeeLocationType other = (EmployeeLocationType) o;
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
        return Utils.toString(EmployeeLocationType.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends EmployeeWorkLocationLocationTypeValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends EmployeeWorkLocationLocationTypeSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(EmployeeWorkLocationLocationTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends EmployeeWorkLocationLocationTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(EmployeeWorkLocationLocationTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends EmployeeWorkLocationLocationTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public EmployeeLocationType build() {
            return new EmployeeLocationType(
                value,
                sourceValue);
        }
    }
}

