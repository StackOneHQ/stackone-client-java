/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class CustomFieldOption {
    /**
     * The unique identifier for the option to be used when updating the custom field
     */
    @JsonProperty("id")
    private String id;

    /**
     * The human readable value of the option
     */
    @JsonProperty("value")
    private String value;

    @JsonCreator
    public CustomFieldOption(
            @JsonProperty("id") String id,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(value, "value");
        this.id = id;
        this.value = value;
    }

    /**
     * The unique identifier for the option to be used when updating the custom field
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * The human readable value of the option
     */
    @JsonIgnore
    public String value() {
        return value;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The unique identifier for the option to be used when updating the custom field
     */
    public CustomFieldOption withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The human readable value of the option
     */
    public CustomFieldOption withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        CustomFieldOption other = (CustomFieldOption) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomFieldOption.class,
                "id", id,
                "value", value);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String id;

        private String value;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The unique identifier for the option to be used when updating the custom field
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * The human readable value of the option
         */
        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public CustomFieldOption build() {

            return new CustomFieldOption(
                id, value);
        }

    }
}
