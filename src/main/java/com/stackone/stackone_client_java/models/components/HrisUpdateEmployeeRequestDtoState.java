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
 * HrisUpdateEmployeeRequestDtoState - The ISO3166-2 sub division where the location is situated
 */

public class HrisUpdateEmployeeRequestDtoState {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue;

    @JsonCreator
    public HrisUpdateEmployeeRequestDtoState(
            @JsonProperty("value") JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisUpdateEmployeeRequestDtoState() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmployeeRequestDtoHomeLocationStateValue> value() {
        return (JsonNullable<HrisUpdateEmployeeRequestDtoHomeLocationStateValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue() {
        return (JsonNullable<HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HrisUpdateEmployeeRequestDtoState withValue(HrisUpdateEmployeeRequestDtoHomeLocationStateValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoState withValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisUpdateEmployeeRequestDtoState withSourceValue(HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoState withSourceValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue) {
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
        HrisUpdateEmployeeRequestDtoState other = (HrisUpdateEmployeeRequestDtoState) o;
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
        return Utils.toString(HrisUpdateEmployeeRequestDtoState.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(HrisUpdateEmployeeRequestDtoHomeLocationStateValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public HrisUpdateEmployeeRequestDtoState build() {
            return new HrisUpdateEmployeeRequestDtoState(
                value,
                sourceValue);
        }
    }
}

