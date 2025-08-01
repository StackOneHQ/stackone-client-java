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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EmploymentEmploymentContractType
 * 
 * <p>The employment work schedule type (e.g., full-time, part-time)
 * 
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class EmploymentEmploymentContractType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EmploymentEmploymentContractTypeValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EmploymentEmploymentContractTypeSourceValue> sourceValue;

    @JsonCreator
    public EmploymentEmploymentContractType(
            @JsonProperty("value") JsonNullable<? extends EmploymentEmploymentContractTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EmploymentEmploymentContractTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public EmploymentEmploymentContractType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentEmploymentContractTypeValue> value() {
        return (JsonNullable<EmploymentEmploymentContractTypeValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentEmploymentContractTypeSourceValue> sourceValue() {
        return (JsonNullable<EmploymentEmploymentContractTypeSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    public EmploymentEmploymentContractType withValue(EmploymentEmploymentContractTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public EmploymentEmploymentContractType withValue(JsonNullable<? extends EmploymentEmploymentContractTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public EmploymentEmploymentContractType withSourceValue(EmploymentEmploymentContractTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public EmploymentEmploymentContractType withSourceValue(JsonNullable<? extends EmploymentEmploymentContractTypeSourceValue> sourceValue) {
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
        EmploymentEmploymentContractType other = (EmploymentEmploymentContractType) o;
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
        return Utils.toString(EmploymentEmploymentContractType.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends EmploymentEmploymentContractTypeValue> value = JsonNullable.undefined();

        private JsonNullable<? extends EmploymentEmploymentContractTypeSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder value(EmploymentEmploymentContractTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends EmploymentEmploymentContractTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(EmploymentEmploymentContractTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends EmploymentEmploymentContractTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public EmploymentEmploymentContractType build() {

            return new EmploymentEmploymentContractType(
                value, sourceValue);
        }

    }
}
