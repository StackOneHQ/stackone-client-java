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
 * State - The ISO3166-2 sub division where the location is situated
 */

public class State {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue;

    @JsonCreator
    public State(
            @JsonProperty("value") JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public State() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoHomeLocationStateValue> value() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoHomeLocationStateValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public State withValue(HrisCreateEmployeeRequestDtoHomeLocationStateValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public State withValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public State withSourceValue(HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public State withSourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue) {
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
        State other = (State) o;
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
        return Utils.toString(State.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(HrisCreateEmployeeRequestDtoHomeLocationStateValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoHomeLocationStateSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public State build() {
            return new State(
                value,
                sourceValue);
        }
    }
}

