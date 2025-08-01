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
import org.openapitools.jackson.nullable.JsonNullable;


public class IamUpdateUserRequestDto {
    /**
     * Primary email address of the user. This is generally a work email address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary_email_address")
    private JsonNullable<String> primaryEmailAddress;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<String> firstName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<String> lastName;

    /**
     * User's name which (can be a full name or display name)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private JsonNullable<String> username;

    /**
     * Indicates if the user is a bot or service user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_bot_user")
    private JsonNullable<? extends IamUpdateUserRequestDtoIsBotUser> isBotUser;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends IamUpdateUserRequestDtoStatus> status;

    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    @JsonCreator
    public IamUpdateUserRequestDto(
            @JsonProperty("primary_email_address") JsonNullable<String> primaryEmailAddress,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("username") JsonNullable<String> username,
            @JsonProperty("is_bot_user") JsonNullable<? extends IamUpdateUserRequestDtoIsBotUser> isBotUser,
            @JsonProperty("status") JsonNullable<? extends IamUpdateUserRequestDtoStatus> status,
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(primaryEmailAddress, "primaryEmailAddress");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(isBotUser, "isBotUser");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(passthrough, "passthrough");
        this.primaryEmailAddress = primaryEmailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = name;
        this.username = username;
        this.isBotUser = isBotUser;
        this.status = status;
        this.passthrough = passthrough;
    }
    
    public IamUpdateUserRequestDto() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Primary email address of the user. This is generally a work email address.
     */
    @JsonIgnore
    public JsonNullable<String> primaryEmailAddress() {
        return primaryEmailAddress;
    }

    @JsonIgnore
    public JsonNullable<String> firstName() {
        return firstName;
    }

    @JsonIgnore
    public JsonNullable<String> lastName() {
        return lastName;
    }

    /**
     * User's name which (can be a full name or display name)
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @JsonIgnore
    public JsonNullable<String> username() {
        return username;
    }

    /**
     * Indicates if the user is a bot or service user
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<IamUpdateUserRequestDtoIsBotUser> isBotUser() {
        return (JsonNullable<IamUpdateUserRequestDtoIsBotUser>) isBotUser;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<IamUpdateUserRequestDtoStatus> status() {
        return (JsonNullable<IamUpdateUserRequestDtoStatus>) status;
    }

    /**
     * Value to pass through to the provider
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> passthrough() {
        return (JsonNullable<Map<String, Object>>) passthrough;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Primary email address of the user. This is generally a work email address.
     */
    public IamUpdateUserRequestDto withPrimaryEmailAddress(String primaryEmailAddress) {
        Utils.checkNotNull(primaryEmailAddress, "primaryEmailAddress");
        this.primaryEmailAddress = JsonNullable.of(primaryEmailAddress);
        return this;
    }

    /**
     * Primary email address of the user. This is generally a work email address.
     */
    public IamUpdateUserRequestDto withPrimaryEmailAddress(JsonNullable<String> primaryEmailAddress) {
        Utils.checkNotNull(primaryEmailAddress, "primaryEmailAddress");
        this.primaryEmailAddress = primaryEmailAddress;
        return this;
    }

    public IamUpdateUserRequestDto withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    public IamUpdateUserRequestDto withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public IamUpdateUserRequestDto withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    public IamUpdateUserRequestDto withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * User's name which (can be a full name or display name)
     */
    public IamUpdateUserRequestDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * User's name which (can be a full name or display name)
     */
    public IamUpdateUserRequestDto withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public IamUpdateUserRequestDto withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = JsonNullable.of(username);
        return this;
    }

    public IamUpdateUserRequestDto withUsername(JsonNullable<String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    /**
     * Indicates if the user is a bot or service user
     */
    public IamUpdateUserRequestDto withIsBotUser(IamUpdateUserRequestDtoIsBotUser isBotUser) {
        Utils.checkNotNull(isBotUser, "isBotUser");
        this.isBotUser = JsonNullable.of(isBotUser);
        return this;
    }

    /**
     * Indicates if the user is a bot or service user
     */
    public IamUpdateUserRequestDto withIsBotUser(JsonNullable<? extends IamUpdateUserRequestDtoIsBotUser> isBotUser) {
        Utils.checkNotNull(isBotUser, "isBotUser");
        this.isBotUser = isBotUser;
        return this;
    }

    public IamUpdateUserRequestDto withStatus(IamUpdateUserRequestDtoStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    public IamUpdateUserRequestDto withStatus(JsonNullable<? extends IamUpdateUserRequestDtoStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public IamUpdateUserRequestDto withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public IamUpdateUserRequestDto withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = passthrough;
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
        IamUpdateUserRequestDto other = (IamUpdateUserRequestDto) o;
        return 
            Utils.enhancedDeepEquals(this.primaryEmailAddress, other.primaryEmailAddress) &&
            Utils.enhancedDeepEquals(this.firstName, other.firstName) &&
            Utils.enhancedDeepEquals(this.lastName, other.lastName) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.username, other.username) &&
            Utils.enhancedDeepEquals(this.isBotUser, other.isBotUser) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.passthrough, other.passthrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            primaryEmailAddress, firstName, lastName,
            name, username, isBotUser,
            status, passthrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IamUpdateUserRequestDto.class,
                "primaryEmailAddress", primaryEmailAddress,
                "firstName", firstName,
                "lastName", lastName,
                "name", name,
                "username", username,
                "isBotUser", isBotUser,
                "status", status,
                "passthrough", passthrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> primaryEmailAddress = JsonNullable.undefined();

        private JsonNullable<String> firstName = JsonNullable.undefined();

        private JsonNullable<String> lastName = JsonNullable.undefined();

        private JsonNullable<String> name = JsonNullable.undefined();

        private JsonNullable<String> username = JsonNullable.undefined();

        private JsonNullable<? extends IamUpdateUserRequestDtoIsBotUser> isBotUser = JsonNullable.undefined();

        private JsonNullable<? extends IamUpdateUserRequestDtoStatus> status = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> passthrough = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Primary email address of the user. This is generally a work email address.
         */
        public Builder primaryEmailAddress(String primaryEmailAddress) {
            Utils.checkNotNull(primaryEmailAddress, "primaryEmailAddress");
            this.primaryEmailAddress = JsonNullable.of(primaryEmailAddress);
            return this;
        }

        /**
         * Primary email address of the user. This is generally a work email address.
         */
        public Builder primaryEmailAddress(JsonNullable<String> primaryEmailAddress) {
            Utils.checkNotNull(primaryEmailAddress, "primaryEmailAddress");
            this.primaryEmailAddress = primaryEmailAddress;
            return this;
        }


        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        public Builder firstName(JsonNullable<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }


        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        public Builder lastName(JsonNullable<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }


        /**
         * User's name which (can be a full name or display name)
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * User's name which (can be a full name or display name)
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = JsonNullable.of(username);
            return this;
        }

        public Builder username(JsonNullable<String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }


        /**
         * Indicates if the user is a bot or service user
         */
        public Builder isBotUser(IamUpdateUserRequestDtoIsBotUser isBotUser) {
            Utils.checkNotNull(isBotUser, "isBotUser");
            this.isBotUser = JsonNullable.of(isBotUser);
            return this;
        }

        /**
         * Indicates if the user is a bot or service user
         */
        public Builder isBotUser(JsonNullable<? extends IamUpdateUserRequestDtoIsBotUser> isBotUser) {
            Utils.checkNotNull(isBotUser, "isBotUser");
            this.isBotUser = isBotUser;
            return this;
        }


        public Builder status(IamUpdateUserRequestDtoStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        public Builder status(JsonNullable<? extends IamUpdateUserRequestDtoStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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

        public IamUpdateUserRequestDto build() {

            return new IamUpdateUserRequestDto(
                primaryEmailAddress, firstName, lastName,
                name, username, isBotUser,
                status, passthrough);
        }

    }
}
