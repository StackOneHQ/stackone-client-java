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
 * EmployeeHomeLocationCountry
 * 
 * <p>The country code
 */
public class EmployeeHomeLocationCountry {
    /**
     * The ISO3166-1 Alpha2 Code of the Country
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EmployeeHomeLocationValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EmployeeHomeLocationSourceValue> sourceValue;

    @JsonCreator
    public EmployeeHomeLocationCountry(
            @JsonProperty("value") JsonNullable<? extends EmployeeHomeLocationValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EmployeeHomeLocationSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public EmployeeHomeLocationCountry() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ISO3166-1 Alpha2 Code of the Country
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeHomeLocationValue> value() {
        return (JsonNullable<EmployeeHomeLocationValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeHomeLocationSourceValue> sourceValue() {
        return (JsonNullable<EmployeeHomeLocationSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The ISO3166-1 Alpha2 Code of the Country
     */
    public EmployeeHomeLocationCountry withValue(EmployeeHomeLocationValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The ISO3166-1 Alpha2 Code of the Country
     */
    public EmployeeHomeLocationCountry withValue(JsonNullable<? extends EmployeeHomeLocationValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public EmployeeHomeLocationCountry withSourceValue(EmployeeHomeLocationSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public EmployeeHomeLocationCountry withSourceValue(JsonNullable<? extends EmployeeHomeLocationSourceValue> sourceValue) {
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
        EmployeeHomeLocationCountry other = (EmployeeHomeLocationCountry) o;
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
        return Utils.toString(EmployeeHomeLocationCountry.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends EmployeeHomeLocationValue> value = JsonNullable.undefined();

        private JsonNullable<? extends EmployeeHomeLocationSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The ISO3166-1 Alpha2 Code of the Country
         */
        public Builder value(EmployeeHomeLocationValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The ISO3166-1 Alpha2 Code of the Country
         */
        public Builder value(JsonNullable<? extends EmployeeHomeLocationValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(EmployeeHomeLocationSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends EmployeeHomeLocationSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public EmployeeHomeLocationCountry build() {

            return new EmployeeHomeLocationCountry(
                value, sourceValue);
        }

    }
}
