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
 * UpdateEmployeeApiModelEthnicity - The employee ethnicity
 */

public class UpdateEmployeeApiModelEthnicity {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends UpdateEmployeeApiModelEthnicityValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends UpdateEmployeeApiModelEthnicitySourceValue> sourceValue;

    @JsonCreator
    public UpdateEmployeeApiModelEthnicity(
            @JsonProperty("value") JsonNullable<? extends UpdateEmployeeApiModelEthnicityValue> value,
            @JsonProperty("source_value") JsonNullable<? extends UpdateEmployeeApiModelEthnicitySourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public UpdateEmployeeApiModelEthnicity() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<UpdateEmployeeApiModelEthnicityValue> value() {
        return (JsonNullable<UpdateEmployeeApiModelEthnicityValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<UpdateEmployeeApiModelEthnicitySourceValue> sourceValue() {
        return (JsonNullable<UpdateEmployeeApiModelEthnicitySourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateEmployeeApiModelEthnicity withValue(UpdateEmployeeApiModelEthnicityValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public UpdateEmployeeApiModelEthnicity withValue(JsonNullable<? extends UpdateEmployeeApiModelEthnicityValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public UpdateEmployeeApiModelEthnicity withSourceValue(UpdateEmployeeApiModelEthnicitySourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public UpdateEmployeeApiModelEthnicity withSourceValue(JsonNullable<? extends UpdateEmployeeApiModelEthnicitySourceValue> sourceValue) {
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
        UpdateEmployeeApiModelEthnicity other = (UpdateEmployeeApiModelEthnicity) o;
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
        return Utils.toString(UpdateEmployeeApiModelEthnicity.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends UpdateEmployeeApiModelEthnicityValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends UpdateEmployeeApiModelEthnicitySourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(UpdateEmployeeApiModelEthnicityValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends UpdateEmployeeApiModelEthnicityValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(UpdateEmployeeApiModelEthnicitySourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends UpdateEmployeeApiModelEthnicitySourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public UpdateEmployeeApiModelEthnicity build() {
            return new UpdateEmployeeApiModelEthnicity(
                value,
                sourceValue);
        }
    }
}

