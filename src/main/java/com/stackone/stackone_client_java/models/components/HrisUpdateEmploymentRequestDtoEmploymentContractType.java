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
 * HrisUpdateEmploymentRequestDtoEmploymentContractType
 * 
 * <p>The employment work schedule type (e.g., full-time, part-time)
 * 
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class HrisUpdateEmploymentRequestDtoEmploymentContractType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue> sourceValue;

    @JsonCreator
    public HrisUpdateEmploymentRequestDtoEmploymentContractType(
            @JsonProperty("value") JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisUpdateEmploymentRequestDtoEmploymentContractType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue> value() {
        return (JsonNullable<HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue> sourceValue() {
        return (JsonNullable<HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    public HrisUpdateEmploymentRequestDtoEmploymentContractType withValue(HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public HrisUpdateEmploymentRequestDtoEmploymentContractType withValue(JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisUpdateEmploymentRequestDtoEmploymentContractType withSourceValue(HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisUpdateEmploymentRequestDtoEmploymentContractType withSourceValue(JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue> sourceValue) {
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
        HrisUpdateEmploymentRequestDtoEmploymentContractType other = (HrisUpdateEmploymentRequestDtoEmploymentContractType) o;
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
        return Utils.toString(HrisUpdateEmploymentRequestDtoEmploymentContractType.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue> value = JsonNullable.undefined();

        private JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder value(HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisUpdateEmploymentRequestDtoEmploymentContractTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public HrisUpdateEmploymentRequestDtoEmploymentContractType build() {

            return new HrisUpdateEmploymentRequestDtoEmploymentContractType(
                value, sourceValue);
        }

    }
}
