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
 * NationalIdentityNumber - The national identity number
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class NationalIdentityNumber {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<String> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends EmployeeType> type;

    /**
     * The country code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private JsonNullable<? extends EmployeeNationalIdentityNumberCountry> country;

    @JsonCreator
    public NationalIdentityNumber(
            @JsonProperty("value") JsonNullable<String> value,
            @JsonProperty("type") JsonNullable<? extends EmployeeType> type,
            @JsonProperty("country") JsonNullable<? extends EmployeeNationalIdentityNumberCountry> country) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(country, "country");
        this.value = value;
        this.type = type;
        this.country = country;
    }
    
    public NationalIdentityNumber() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<String> value() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeType> type() {
        return (JsonNullable<EmployeeType>) type;
    }

    /**
     * The country code
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeNationalIdentityNumberCountry> country() {
        return (JsonNullable<EmployeeNationalIdentityNumberCountry>) country;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NationalIdentityNumber withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public NationalIdentityNumber withValue(JsonNullable<String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public NationalIdentityNumber withType(EmployeeType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    public NationalIdentityNumber withType(JsonNullable<? extends EmployeeType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The country code
     */
    public NationalIdentityNumber withCountry(EmployeeNationalIdentityNumberCountry country) {
        Utils.checkNotNull(country, "country");
        this.country = JsonNullable.of(country);
        return this;
    }

    /**
     * The country code
     */
    public NationalIdentityNumber withCountry(JsonNullable<? extends EmployeeNationalIdentityNumberCountry> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
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
        NationalIdentityNumber other = (NationalIdentityNumber) o;
        return 
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.country, other.country);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            value,
            type,
            country);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NationalIdentityNumber.class,
                "value", value,
                "type", type,
                "country", country);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> value = JsonNullable.undefined();
 
        private JsonNullable<? extends EmployeeType> type = JsonNullable.undefined();
 
        private JsonNullable<? extends EmployeeNationalIdentityNumberCountry> country = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder type(EmployeeType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        public Builder type(JsonNullable<? extends EmployeeType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The country code
         */
        public Builder country(EmployeeNationalIdentityNumberCountry country) {
            Utils.checkNotNull(country, "country");
            this.country = JsonNullable.of(country);
            return this;
        }

        /**
         * The country code
         */
        public Builder country(JsonNullable<? extends EmployeeNationalIdentityNumberCountry> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }
        
        public NationalIdentityNumber build() {
            return new NationalIdentityNumber(
                value,
                type,
                country);
        }
    }
}

