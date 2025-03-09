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
 * HrisCreateEmployeeRequestDtoEthnicity - The employee ethnicity
 */

public class HrisCreateEmployeeRequestDtoEthnicity {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicityValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicitySourceValue> sourceValue;

    @JsonCreator
    public HrisCreateEmployeeRequestDtoEthnicity(
            @JsonProperty("value") JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicityValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicitySourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisCreateEmployeeRequestDtoEthnicity() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoEthnicityValue> value() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoEthnicityValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoEthnicitySourceValue> sourceValue() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoEthnicitySourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HrisCreateEmployeeRequestDtoEthnicity withValue(HrisCreateEmployeeRequestDtoEthnicityValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public HrisCreateEmployeeRequestDtoEthnicity withValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicityValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisCreateEmployeeRequestDtoEthnicity withSourceValue(HrisCreateEmployeeRequestDtoEthnicitySourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisCreateEmployeeRequestDtoEthnicity withSourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicitySourceValue> sourceValue) {
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
        HrisCreateEmployeeRequestDtoEthnicity other = (HrisCreateEmployeeRequestDtoEthnicity) o;
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
        return Utils.toString(HrisCreateEmployeeRequestDtoEthnicity.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicityValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicitySourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(HrisCreateEmployeeRequestDtoEthnicityValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicityValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(HrisCreateEmployeeRequestDtoEthnicitySourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEthnicitySourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public HrisCreateEmployeeRequestDtoEthnicity build() {
            return new HrisCreateEmployeeRequestDtoEthnicity(
                value,
                sourceValue);
        }
    }
}

