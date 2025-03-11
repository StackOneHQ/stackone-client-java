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
 * HrisCreateEmployeeRequestDtoEmploymentStatus - The employee employment status
 */

public class HrisCreateEmployeeRequestDtoEmploymentStatus {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue> sourceValue;

    @JsonCreator
    public HrisCreateEmployeeRequestDtoEmploymentStatus(
            @JsonProperty("value") JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisCreateEmployeeRequestDtoEmploymentStatus() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoEmploymentStatusValue> value() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoEmploymentStatusValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue> sourceValue() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HrisCreateEmployeeRequestDtoEmploymentStatus withValue(HrisCreateEmployeeRequestDtoEmploymentStatusValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public HrisCreateEmployeeRequestDtoEmploymentStatus withValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisCreateEmployeeRequestDtoEmploymentStatus withSourceValue(HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisCreateEmployeeRequestDtoEmploymentStatus withSourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue> sourceValue) {
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
        HrisCreateEmployeeRequestDtoEmploymentStatus other = (HrisCreateEmployeeRequestDtoEmploymentStatus) o;
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
        return Utils.toString(HrisCreateEmployeeRequestDtoEmploymentStatus.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(HrisCreateEmployeeRequestDtoEmploymentStatusValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoEmploymentStatusSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public HrisCreateEmployeeRequestDtoEmploymentStatus build() {
            return new HrisCreateEmployeeRequestDtoEmploymentStatus(
                value,
                sourceValue);
        }
    }
}

