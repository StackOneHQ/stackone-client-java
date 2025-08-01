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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EmploymentDivisionType
 * 
 * <p>The type of the group
 */
public class EmploymentDivisionType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EmploymentDivisionValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EmploymentDivisionSourceValue> sourceValue;

    @JsonCreator
    public EmploymentDivisionType(
            @JsonProperty("value") JsonNullable<? extends EmploymentDivisionValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EmploymentDivisionSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public EmploymentDivisionType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentDivisionValue> value() {
        return (JsonNullable<EmploymentDivisionValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentDivisionSourceValue> sourceValue() {
        return (JsonNullable<EmploymentDivisionSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    public EmploymentDivisionType withValue(EmploymentDivisionValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public EmploymentDivisionType withValue(JsonNullable<? extends EmploymentDivisionValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public EmploymentDivisionType withSourceValue(EmploymentDivisionSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public EmploymentDivisionType withSourceValue(JsonNullable<? extends EmploymentDivisionSourceValue> sourceValue) {
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
        EmploymentDivisionType other = (EmploymentDivisionType) o;
        return 
            Utils.enhancedDeepEquals(this.value, other.value) &&
            Utils.enhancedDeepEquals(this.sourceValue, other.sourceValue);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            value, sourceValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmploymentDivisionType.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends EmploymentDivisionValue> value = JsonNullable.undefined();

        private JsonNullable<? extends EmploymentDivisionSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder value(EmploymentDivisionValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends EmploymentDivisionValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(EmploymentDivisionSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends EmploymentDivisionSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public EmploymentDivisionType build() {

            return new EmploymentDivisionType(
                value, sourceValue);
        }

    }
}
