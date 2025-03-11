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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * UpdateEmployeeApiModelWorkLocation - The employee work location
 */

public class UpdateEmployeeApiModelWorkLocation {

    /**
     * Unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * The name of the location
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The phone number of the location
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    private JsonNullable<String> phoneNumber;

    /**
     * The first line of the address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("street_1")
    private JsonNullable<String> street1;

    /**
     * The second line of the address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("street_2")
    private JsonNullable<String> street2;

    /**
     * The city where the location is situated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private JsonNullable<String> city;

    /**
     * The ZIP code/Postal code of the location
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("zip_code")
    private JsonNullable<String> zipCode;

    /**
     * The country code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private JsonNullable<? extends UpdateEmployeeApiModelWorkLocationCountry> country;

    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    /**
     * The ISO3166-2 sub division where the location is situated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private JsonNullable<? extends UpdateEmployeeApiModelWorkLocationState> state;

    @JsonCreator
    public UpdateEmployeeApiModelWorkLocation(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("phone_number") JsonNullable<String> phoneNumber,
            @JsonProperty("street_1") JsonNullable<String> street1,
            @JsonProperty("street_2") JsonNullable<String> street2,
            @JsonProperty("city") JsonNullable<String> city,
            @JsonProperty("zip_code") JsonNullable<String> zipCode,
            @JsonProperty("country") JsonNullable<? extends UpdateEmployeeApiModelWorkLocationCountry> country,
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough,
            @JsonProperty("state") JsonNullable<? extends UpdateEmployeeApiModelWorkLocationState> state) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(street1, "street1");
        Utils.checkNotNull(street2, "street2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(zipCode, "zipCode");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(passthrough, "passthrough");
        Utils.checkNotNull(state, "state");
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.passthrough = passthrough;
        this.state = state;
    }
    
    public UpdateEmployeeApiModelWorkLocation() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * The name of the location
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The phone number of the location
     */
    @JsonIgnore
    public JsonNullable<String> phoneNumber() {
        return phoneNumber;
    }

    /**
     * The first line of the address
     */
    @JsonIgnore
    public JsonNullable<String> street1() {
        return street1;
    }

    /**
     * The second line of the address
     */
    @JsonIgnore
    public JsonNullable<String> street2() {
        return street2;
    }

    /**
     * The city where the location is situated
     */
    @JsonIgnore
    public JsonNullable<String> city() {
        return city;
    }

    /**
     * The ZIP code/Postal code of the location
     */
    @JsonIgnore
    public JsonNullable<String> zipCode() {
        return zipCode;
    }

    /**
     * The country code
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<UpdateEmployeeApiModelWorkLocationCountry> country() {
        return (JsonNullable<UpdateEmployeeApiModelWorkLocationCountry>) country;
    }

    /**
     * Value to pass through to the provider
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> passthrough() {
        return (JsonNullable<Map<String, Object>>) passthrough;
    }

    /**
     * The ISO3166-2 sub division where the location is situated
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<UpdateEmployeeApiModelWorkLocationState> state() {
        return (JsonNullable<UpdateEmployeeApiModelWorkLocationState>) state;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public UpdateEmployeeApiModelWorkLocation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public UpdateEmployeeApiModelWorkLocation withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the location
     */
    public UpdateEmployeeApiModelWorkLocation withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the location
     */
    public UpdateEmployeeApiModelWorkLocation withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The phone number of the location
     */
    public UpdateEmployeeApiModelWorkLocation withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = JsonNullable.of(phoneNumber);
        return this;
    }

    /**
     * The phone number of the location
     */
    public UpdateEmployeeApiModelWorkLocation withPhoneNumber(JsonNullable<String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The first line of the address
     */
    public UpdateEmployeeApiModelWorkLocation withStreet1(String street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = JsonNullable.of(street1);
        return this;
    }

    /**
     * The first line of the address
     */
    public UpdateEmployeeApiModelWorkLocation withStreet1(JsonNullable<String> street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = street1;
        return this;
    }

    /**
     * The second line of the address
     */
    public UpdateEmployeeApiModelWorkLocation withStreet2(String street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = JsonNullable.of(street2);
        return this;
    }

    /**
     * The second line of the address
     */
    public UpdateEmployeeApiModelWorkLocation withStreet2(JsonNullable<String> street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = street2;
        return this;
    }

    /**
     * The city where the location is situated
     */
    public UpdateEmployeeApiModelWorkLocation withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = JsonNullable.of(city);
        return this;
    }

    /**
     * The city where the location is situated
     */
    public UpdateEmployeeApiModelWorkLocation withCity(JsonNullable<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * The ZIP code/Postal code of the location
     */
    public UpdateEmployeeApiModelWorkLocation withZipCode(String zipCode) {
        Utils.checkNotNull(zipCode, "zipCode");
        this.zipCode = JsonNullable.of(zipCode);
        return this;
    }

    /**
     * The ZIP code/Postal code of the location
     */
    public UpdateEmployeeApiModelWorkLocation withZipCode(JsonNullable<String> zipCode) {
        Utils.checkNotNull(zipCode, "zipCode");
        this.zipCode = zipCode;
        return this;
    }

    /**
     * The country code
     */
    public UpdateEmployeeApiModelWorkLocation withCountry(UpdateEmployeeApiModelWorkLocationCountry country) {
        Utils.checkNotNull(country, "country");
        this.country = JsonNullable.of(country);
        return this;
    }

    /**
     * The country code
     */
    public UpdateEmployeeApiModelWorkLocation withCountry(JsonNullable<? extends UpdateEmployeeApiModelWorkLocationCountry> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public UpdateEmployeeApiModelWorkLocation withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public UpdateEmployeeApiModelWorkLocation withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = passthrough;
        return this;
    }

    /**
     * The ISO3166-2 sub division where the location is situated
     */
    public UpdateEmployeeApiModelWorkLocation withState(UpdateEmployeeApiModelWorkLocationState state) {
        Utils.checkNotNull(state, "state");
        this.state = JsonNullable.of(state);
        return this;
    }

    /**
     * The ISO3166-2 sub division where the location is situated
     */
    public UpdateEmployeeApiModelWorkLocation withState(JsonNullable<? extends UpdateEmployeeApiModelWorkLocationState> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
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
        UpdateEmployeeApiModelWorkLocation other = (UpdateEmployeeApiModelWorkLocation) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.street1, other.street1) &&
            Objects.deepEquals(this.street2, other.street2) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.zipCode, other.zipCode) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.passthrough, other.passthrough) &&
            Objects.deepEquals(this.state, other.state);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            phoneNumber,
            street1,
            street2,
            city,
            zipCode,
            country,
            passthrough,
            state);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateEmployeeApiModelWorkLocation.class,
                "id", id,
                "name", name,
                "phoneNumber", phoneNumber,
                "street1", street1,
                "street2", street2,
                "city", city,
                "zipCode", zipCode,
                "country", country,
                "passthrough", passthrough,
                "state", state);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> phoneNumber = JsonNullable.undefined();
 
        private JsonNullable<String> street1 = JsonNullable.undefined();
 
        private JsonNullable<String> street2 = JsonNullable.undefined();
 
        private JsonNullable<String> city = JsonNullable.undefined();
 
        private JsonNullable<String> zipCode = JsonNullable.undefined();
 
        private JsonNullable<? extends UpdateEmployeeApiModelWorkLocationCountry> country = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> passthrough = JsonNullable.undefined();
 
        private JsonNullable<? extends UpdateEmployeeApiModelWorkLocationState> state = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The name of the location
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the location
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The phone number of the location
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = JsonNullable.of(phoneNumber);
            return this;
        }

        /**
         * The phone number of the location
         */
        public Builder phoneNumber(JsonNullable<String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The first line of the address
         */
        public Builder street1(String street1) {
            Utils.checkNotNull(street1, "street1");
            this.street1 = JsonNullable.of(street1);
            return this;
        }

        /**
         * The first line of the address
         */
        public Builder street1(JsonNullable<String> street1) {
            Utils.checkNotNull(street1, "street1");
            this.street1 = street1;
            return this;
        }

        /**
         * The second line of the address
         */
        public Builder street2(String street2) {
            Utils.checkNotNull(street2, "street2");
            this.street2 = JsonNullable.of(street2);
            return this;
        }

        /**
         * The second line of the address
         */
        public Builder street2(JsonNullable<String> street2) {
            Utils.checkNotNull(street2, "street2");
            this.street2 = street2;
            return this;
        }

        /**
         * The city where the location is situated
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = JsonNullable.of(city);
            return this;
        }

        /**
         * The city where the location is situated
         */
        public Builder city(JsonNullable<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * The ZIP code/Postal code of the location
         */
        public Builder zipCode(String zipCode) {
            Utils.checkNotNull(zipCode, "zipCode");
            this.zipCode = JsonNullable.of(zipCode);
            return this;
        }

        /**
         * The ZIP code/Postal code of the location
         */
        public Builder zipCode(JsonNullable<String> zipCode) {
            Utils.checkNotNull(zipCode, "zipCode");
            this.zipCode = zipCode;
            return this;
        }

        /**
         * The country code
         */
        public Builder country(UpdateEmployeeApiModelWorkLocationCountry country) {
            Utils.checkNotNull(country, "country");
            this.country = JsonNullable.of(country);
            return this;
        }

        /**
         * The country code
         */
        public Builder country(JsonNullable<? extends UpdateEmployeeApiModelWorkLocationCountry> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(Map<String, Object> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = JsonNullable.of(passthrough);
            return this;
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = passthrough;
            return this;
        }

        /**
         * The ISO3166-2 sub division where the location is situated
         */
        public Builder state(UpdateEmployeeApiModelWorkLocationState state) {
            Utils.checkNotNull(state, "state");
            this.state = JsonNullable.of(state);
            return this;
        }

        /**
         * The ISO3166-2 sub division where the location is situated
         */
        public Builder state(JsonNullable<? extends UpdateEmployeeApiModelWorkLocationState> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }
        
        public UpdateEmployeeApiModelWorkLocation build() {
            return new UpdateEmployeeApiModelWorkLocation(
                id,
                name,
                phoneNumber,
                street1,
                street2,
                city,
                zipCode,
                country,
                passthrough,
                state);
        }
    }
}

