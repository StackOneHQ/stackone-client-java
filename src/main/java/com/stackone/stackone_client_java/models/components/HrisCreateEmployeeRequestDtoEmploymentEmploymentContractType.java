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
 * HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType - The employment work schedule type (e.g., full-time, part-time)
 */

public class HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue> sourceValue;

    @JsonCreator
    public HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType(
            @JsonProperty("value") JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue> value() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue> sourceValue() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType withValue(HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType withValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType withSourceValue(HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType withSourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue> sourceValue) {
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
        HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType other = (HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType) o;
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
        return Utils.toString(HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentEmploymentContractTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType build() {
            return new HrisCreateEmployeeRequestDtoEmploymentEmploymentContractType(
                value,
                sourceValue);
        }
    }
}

