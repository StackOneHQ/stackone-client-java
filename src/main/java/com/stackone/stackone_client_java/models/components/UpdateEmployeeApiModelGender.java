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
 * UpdateEmployeeApiModelGender - The employee gender
 */

public class UpdateEmployeeApiModelGender {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends UpdateEmployeeApiModelValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends UpdateEmployeeApiModelSourceValue> sourceValue;

    @JsonCreator
    public UpdateEmployeeApiModelGender(
            @JsonProperty("value") JsonNullable<? extends UpdateEmployeeApiModelValue> value,
            @JsonProperty("source_value") JsonNullable<? extends UpdateEmployeeApiModelSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public UpdateEmployeeApiModelGender() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<UpdateEmployeeApiModelValue> value() {
        return (JsonNullable<UpdateEmployeeApiModelValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<UpdateEmployeeApiModelSourceValue> sourceValue() {
        return (JsonNullable<UpdateEmployeeApiModelSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateEmployeeApiModelGender withValue(UpdateEmployeeApiModelValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public UpdateEmployeeApiModelGender withValue(JsonNullable<? extends UpdateEmployeeApiModelValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public UpdateEmployeeApiModelGender withSourceValue(UpdateEmployeeApiModelSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public UpdateEmployeeApiModelGender withSourceValue(JsonNullable<? extends UpdateEmployeeApiModelSourceValue> sourceValue) {
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
        UpdateEmployeeApiModelGender other = (UpdateEmployeeApiModelGender) o;
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
        return Utils.toString(UpdateEmployeeApiModelGender.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends UpdateEmployeeApiModelValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends UpdateEmployeeApiModelSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(UpdateEmployeeApiModelValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends UpdateEmployeeApiModelValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(UpdateEmployeeApiModelSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends UpdateEmployeeApiModelSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public UpdateEmployeeApiModelGender build() {
            return new UpdateEmployeeApiModelGender(
                value,
                sourceValue);
        }
    }
}

