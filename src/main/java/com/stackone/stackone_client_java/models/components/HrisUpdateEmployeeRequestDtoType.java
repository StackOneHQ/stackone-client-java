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


public class HrisUpdateEmployeeRequestDtoType {
    /**
     * The type of the national identity number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue> sourceValue;

    @JsonCreator
    public HrisUpdateEmployeeRequestDtoType(
            @JsonProperty("value") JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisUpdateEmployeeRequestDtoType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The type of the national identity number
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue> value() {
        return (JsonNullable<HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue> sourceValue() {
        return (JsonNullable<HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The type of the national identity number
     */
    public HrisUpdateEmployeeRequestDtoType withValue(HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The type of the national identity number
     */
    public HrisUpdateEmployeeRequestDtoType withValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisUpdateEmployeeRequestDtoType withSourceValue(HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoType withSourceValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue> sourceValue) {
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
        HrisUpdateEmployeeRequestDtoType other = (HrisUpdateEmployeeRequestDtoType) o;
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
        return Utils.toString(HrisUpdateEmployeeRequestDtoType.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue> value = JsonNullable.undefined();

        private JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The type of the national identity number
         */
        public Builder value(HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The type of the national identity number
         */
        public Builder value(JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisUpdateEmployeeRequestDtoNationalIdentityNumberSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public HrisUpdateEmployeeRequestDtoType build() {

            return new HrisUpdateEmployeeRequestDtoType(
                value, sourceValue);
        }

    }
}
