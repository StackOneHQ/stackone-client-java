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
 * EmployeeHomeLocationLocationType - The location type
 */

public class EmployeeHomeLocationLocationType {

    /**
     * The type of the location.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EmployeeHomeLocationLocationTypeValue> value;

    /**
     * The source value of the location type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EmployeeHomeLocationLocationTypeSourceValue> sourceValue;

    @JsonCreator
    public EmployeeHomeLocationLocationType(
            @JsonProperty("value") JsonNullable<? extends EmployeeHomeLocationLocationTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EmployeeHomeLocationLocationTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public EmployeeHomeLocationLocationType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The type of the location.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeHomeLocationLocationTypeValue> value() {
        return (JsonNullable<EmployeeHomeLocationLocationTypeValue>) value;
    }

    /**
     * The source value of the location type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeHomeLocationLocationTypeSourceValue> sourceValue() {
        return (JsonNullable<EmployeeHomeLocationLocationTypeSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of the location.
     */
    public EmployeeHomeLocationLocationType withValue(EmployeeHomeLocationLocationTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The type of the location.
     */
    public EmployeeHomeLocationLocationType withValue(JsonNullable<? extends EmployeeHomeLocationLocationTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The source value of the location type.
     */
    public EmployeeHomeLocationLocationType withSourceValue(EmployeeHomeLocationLocationTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The source value of the location type.
     */
    public EmployeeHomeLocationLocationType withSourceValue(JsonNullable<? extends EmployeeHomeLocationLocationTypeSourceValue> sourceValue) {
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
        EmployeeHomeLocationLocationType other = (EmployeeHomeLocationLocationType) o;
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
        return Utils.toString(EmployeeHomeLocationLocationType.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends EmployeeHomeLocationLocationTypeValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends EmployeeHomeLocationLocationTypeSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of the location.
         */
        public Builder value(EmployeeHomeLocationLocationTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The type of the location.
         */
        public Builder value(JsonNullable<? extends EmployeeHomeLocationLocationTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        /**
         * The source value of the location type.
         */
        public Builder sourceValue(EmployeeHomeLocationLocationTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The source value of the location type.
         */
        public Builder sourceValue(JsonNullable<? extends EmployeeHomeLocationLocationTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public EmployeeHomeLocationLocationType build() {
            return new EmployeeHomeLocationLocationType(
                value,
                sourceValue);
        }
    }
}

