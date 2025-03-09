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


public class NationalIdentityNumberApiModel {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<String> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends NationalIdentityNumberApiModelType> type;

    /**
     * The country code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private JsonNullable<? extends Country> country;

    @JsonCreator
    public NationalIdentityNumberApiModel(
            @JsonProperty("value") JsonNullable<String> value,
            @JsonProperty("type") JsonNullable<? extends NationalIdentityNumberApiModelType> type,
            @JsonProperty("country") JsonNullable<? extends Country> country) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(country, "country");
        this.value = value;
        this.type = type;
        this.country = country;
    }
    
    public NationalIdentityNumberApiModel() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<String> value() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<NationalIdentityNumberApiModelType> type() {
        return (JsonNullable<NationalIdentityNumberApiModelType>) type;
    }

    /**
     * The country code
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Country> country() {
        return (JsonNullable<Country>) country;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NationalIdentityNumberApiModel withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public NationalIdentityNumberApiModel withValue(JsonNullable<String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public NationalIdentityNumberApiModel withType(NationalIdentityNumberApiModelType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    public NationalIdentityNumberApiModel withType(JsonNullable<? extends NationalIdentityNumberApiModelType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The country code
     */
    public NationalIdentityNumberApiModel withCountry(Country country) {
        Utils.checkNotNull(country, "country");
        this.country = JsonNullable.of(country);
        return this;
    }

    /**
     * The country code
     */
    public NationalIdentityNumberApiModel withCountry(JsonNullable<? extends Country> country) {
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
        NationalIdentityNumberApiModel other = (NationalIdentityNumberApiModel) o;
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
        return Utils.toString(NationalIdentityNumberApiModel.class,
                "value", value,
                "type", type,
                "country", country);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> value = JsonNullable.undefined();
 
        private JsonNullable<? extends NationalIdentityNumberApiModelType> type = JsonNullable.undefined();
 
        private JsonNullable<? extends Country> country = JsonNullable.undefined();  
        
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

        public Builder type(NationalIdentityNumberApiModelType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        public Builder type(JsonNullable<? extends NationalIdentityNumberApiModelType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The country code
         */
        public Builder country(Country country) {
            Utils.checkNotNull(country, "country");
            this.country = JsonNullable.of(country);
            return this;
        }

        /**
         * The country code
         */
        public Builder country(JsonNullable<? extends Country> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }
        
        public NationalIdentityNumberApiModel build() {
            return new NationalIdentityNumberApiModel(
                value,
                type,
                country);
        }
    }
}

