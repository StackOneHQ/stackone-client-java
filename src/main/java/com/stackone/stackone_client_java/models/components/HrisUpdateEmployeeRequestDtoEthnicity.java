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
 * HrisUpdateEmployeeRequestDtoEthnicity
 * 
 * <p>The employee ethnicity
 */
public class HrisUpdateEmployeeRequestDtoEthnicity {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicityValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicitySourceValue> sourceValue;

    @JsonCreator
    public HrisUpdateEmployeeRequestDtoEthnicity(
            @JsonProperty("value") JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicityValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicitySourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisUpdateEmployeeRequestDtoEthnicity() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmployeeRequestDtoEthnicityValue> value() {
        return (JsonNullable<HrisUpdateEmployeeRequestDtoEthnicityValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmployeeRequestDtoEthnicitySourceValue> sourceValue() {
        return (JsonNullable<HrisUpdateEmployeeRequestDtoEthnicitySourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    public HrisUpdateEmployeeRequestDtoEthnicity withValue(HrisUpdateEmployeeRequestDtoEthnicityValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoEthnicity withValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicityValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisUpdateEmployeeRequestDtoEthnicity withSourceValue(HrisUpdateEmployeeRequestDtoEthnicitySourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoEthnicity withSourceValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicitySourceValue> sourceValue) {
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
        HrisUpdateEmployeeRequestDtoEthnicity other = (HrisUpdateEmployeeRequestDtoEthnicity) o;
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
        return Utils.toString(HrisUpdateEmployeeRequestDtoEthnicity.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicityValue> value = JsonNullable.undefined();

        private JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicitySourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder value(HrisUpdateEmployeeRequestDtoEthnicityValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicityValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(HrisUpdateEmployeeRequestDtoEthnicitySourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoEthnicitySourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public HrisUpdateEmployeeRequestDtoEthnicity build() {

            return new HrisUpdateEmployeeRequestDtoEthnicity(
                value, sourceValue);
        }

    }
}
