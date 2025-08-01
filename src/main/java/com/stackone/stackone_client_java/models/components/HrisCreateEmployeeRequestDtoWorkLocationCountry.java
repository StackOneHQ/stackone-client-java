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
 * HrisCreateEmployeeRequestDtoWorkLocationCountry
 * 
 * <p>The country code
 */
public class HrisCreateEmployeeRequestDtoWorkLocationCountry {
    /**
     * The ISO3166-1 Alpha2 Code of the Country
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationSourceValue> sourceValue;

    @JsonCreator
    public HrisCreateEmployeeRequestDtoWorkLocationCountry(
            @JsonProperty("value") JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationValue> value,
            @JsonProperty("source_value") JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisCreateEmployeeRequestDtoWorkLocationCountry() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ISO3166-1 Alpha2 Code of the Country
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoWorkLocationValue> value() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoWorkLocationValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisCreateEmployeeRequestDtoWorkLocationSourceValue> sourceValue() {
        return (JsonNullable<HrisCreateEmployeeRequestDtoWorkLocationSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The ISO3166-1 Alpha2 Code of the Country
     */
    public HrisCreateEmployeeRequestDtoWorkLocationCountry withValue(HrisCreateEmployeeRequestDtoWorkLocationValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The ISO3166-1 Alpha2 Code of the Country
     */
    public HrisCreateEmployeeRequestDtoWorkLocationCountry withValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public HrisCreateEmployeeRequestDtoWorkLocationCountry withSourceValue(HrisCreateEmployeeRequestDtoWorkLocationSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public HrisCreateEmployeeRequestDtoWorkLocationCountry withSourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationSourceValue> sourceValue) {
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
        HrisCreateEmployeeRequestDtoWorkLocationCountry other = (HrisCreateEmployeeRequestDtoWorkLocationCountry) o;
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
        return Utils.toString(HrisCreateEmployeeRequestDtoWorkLocationCountry.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationValue> value = JsonNullable.undefined();

        private JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The ISO3166-1 Alpha2 Code of the Country
         */
        public Builder value(HrisCreateEmployeeRequestDtoWorkLocationValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The ISO3166-1 Alpha2 Code of the Country
         */
        public Builder value(JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(HrisCreateEmployeeRequestDtoWorkLocationSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends HrisCreateEmployeeRequestDtoWorkLocationSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public HrisCreateEmployeeRequestDtoWorkLocationCountry build() {

            return new HrisCreateEmployeeRequestDtoWorkLocationCountry(
                value, sourceValue);
        }

    }
}
