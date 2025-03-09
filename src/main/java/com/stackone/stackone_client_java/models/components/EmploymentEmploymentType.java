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
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EmploymentEmploymentType - The type of employment (e.g., contractor, permanent)
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class EmploymentEmploymentType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EmploymentEmploymentTypeValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EmploymentEmploymentTypeSourceValue> sourceValue;

    @JsonCreator
    public EmploymentEmploymentType(
            @JsonProperty("value") JsonNullable<? extends EmploymentEmploymentTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EmploymentEmploymentTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public EmploymentEmploymentType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentEmploymentTypeValue> value() {
        return (JsonNullable<EmploymentEmploymentTypeValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentEmploymentTypeSourceValue> sourceValue() {
        return (JsonNullable<EmploymentEmploymentTypeSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EmploymentEmploymentType withValue(EmploymentEmploymentTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public EmploymentEmploymentType withValue(JsonNullable<? extends EmploymentEmploymentTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public EmploymentEmploymentType withSourceValue(EmploymentEmploymentTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public EmploymentEmploymentType withSourceValue(JsonNullable<? extends EmploymentEmploymentTypeSourceValue> sourceValue) {
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
        EmploymentEmploymentType other = (EmploymentEmploymentType) o;
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
        return Utils.toString(EmploymentEmploymentType.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends EmploymentEmploymentTypeValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends EmploymentEmploymentTypeSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(EmploymentEmploymentTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends EmploymentEmploymentTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(EmploymentEmploymentTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends EmploymentEmploymentTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public EmploymentEmploymentType build() {
            return new EmploymentEmploymentType(
                value,
                sourceValue);
        }
    }
}

