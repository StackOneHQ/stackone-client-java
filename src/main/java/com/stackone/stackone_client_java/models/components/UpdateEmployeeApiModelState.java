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
 * UpdateEmployeeApiModelState - The ISO3166-2 sub division where the location is situated
 */

public class UpdateEmployeeApiModelState {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateSourceValue> sourceValue;

    @JsonCreator
    public UpdateEmployeeApiModelState(
            @JsonProperty("value") JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateValue> value,
            @JsonProperty("source_value") JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public UpdateEmployeeApiModelState() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<UpdateEmployeeApiModelHomeLocationStateValue> value() {
        return (JsonNullable<UpdateEmployeeApiModelHomeLocationStateValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<UpdateEmployeeApiModelHomeLocationStateSourceValue> sourceValue() {
        return (JsonNullable<UpdateEmployeeApiModelHomeLocationStateSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateEmployeeApiModelState withValue(UpdateEmployeeApiModelHomeLocationStateValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public UpdateEmployeeApiModelState withValue(JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public UpdateEmployeeApiModelState withSourceValue(UpdateEmployeeApiModelHomeLocationStateSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public UpdateEmployeeApiModelState withSourceValue(JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateSourceValue> sourceValue) {
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
        UpdateEmployeeApiModelState other = (UpdateEmployeeApiModelState) o;
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
        return Utils.toString(UpdateEmployeeApiModelState.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(UpdateEmployeeApiModelHomeLocationStateValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(UpdateEmployeeApiModelHomeLocationStateSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends UpdateEmployeeApiModelHomeLocationStateSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public UpdateEmployeeApiModelState build() {
            return new UpdateEmployeeApiModelState(
                value,
                sourceValue);
        }
    }
}

