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
 * HrisUpdateEmployeeRequestDtoEmploymentType - The employee employment type
 */

public class HrisUpdateEmployeeRequestDtoEmploymentType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue> sourceValue;

    @JsonCreator
    public HrisUpdateEmployeeRequestDtoEmploymentType(
            @JsonProperty("value") JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisUpdateEmployeeRequestDtoEmploymentType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmployeeRequestDtoEmploymentTypeValue> value() {
        return (JsonNullable<HrisUpdateEmployeeRequestDtoEmploymentTypeValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue> sourceValue() {
        return (JsonNullable<HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HrisUpdateEmployeeRequestDtoEmploymentType withValue(HrisUpdateEmployeeRequestDtoEmploymentTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoEmploymentType withValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisUpdateEmployeeRequestDtoEmploymentType withSourceValue(HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoEmploymentType withSourceValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue> sourceValue) {
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
        HrisUpdateEmployeeRequestDtoEmploymentType other = (HrisUpdateEmployeeRequestDtoEmploymentType) o;
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
        return Utils.toString(HrisUpdateEmployeeRequestDtoEmploymentType.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(HrisUpdateEmployeeRequestDtoEmploymentTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoEmploymentTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public HrisUpdateEmployeeRequestDtoEmploymentType build() {
            return new HrisUpdateEmployeeRequestDtoEmploymentType(
                value,
                sourceValue);
        }
    }
}

