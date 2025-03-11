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
/**
 * AccountAddressLocationType - The location type
 */

public class AccountAddressLocationType {

    /**
     * The type of the location.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends AccountAddressLocationTypeValue> value;

    /**
     * The source value of the location type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends AccountAddressLocationTypeSourceValue> sourceValue;

    @JsonCreator
    public AccountAddressLocationType(
            @JsonProperty("value") JsonNullable<? extends AccountAddressLocationTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends AccountAddressLocationTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public AccountAddressLocationType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The type of the location.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AccountAddressLocationTypeValue> value() {
        return (JsonNullable<AccountAddressLocationTypeValue>) value;
    }

    /**
     * The source value of the location type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AccountAddressLocationTypeSourceValue> sourceValue() {
        return (JsonNullable<AccountAddressLocationTypeSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of the location.
     */
    public AccountAddressLocationType withValue(AccountAddressLocationTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The type of the location.
     */
    public AccountAddressLocationType withValue(JsonNullable<? extends AccountAddressLocationTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The source value of the location type.
     */
    public AccountAddressLocationType withSourceValue(AccountAddressLocationTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The source value of the location type.
     */
    public AccountAddressLocationType withSourceValue(JsonNullable<? extends AccountAddressLocationTypeSourceValue> sourceValue) {
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
        AccountAddressLocationType other = (AccountAddressLocationType) o;
        return 
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.sourceValue, other.sourceValue);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            value,
            sourceValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountAddressLocationType.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountAddressLocationTypeValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends AccountAddressLocationTypeSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of the location.
         */
        public Builder value(AccountAddressLocationTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The type of the location.
         */
        public Builder value(JsonNullable<? extends AccountAddressLocationTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        /**
         * The source value of the location type.
         */
        public Builder sourceValue(AccountAddressLocationTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The source value of the location type.
         */
        public Builder sourceValue(JsonNullable<? extends AccountAddressLocationTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public AccountAddressLocationType build() {
            return new AccountAddressLocationType(
                value,
                sourceValue);
        }
    }
}

