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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class JobHiringTeam {

    /**
     * User ID of the hiring team member.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private JsonNullable<String> userId;

    /**
     * Provider's unique identifier of the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_user_id")
    private JsonNullable<String> remoteUserId;

    /**
     * First name of the hiring team member.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<String> firstName;

    /**
     * Last name of the hiring team member.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<String> lastName;

    /**
     * Email of the hiring team member.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private JsonNullable<String> email;

    /**
     * Role of the hiring team member.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    private JsonNullable<String> role;

    @JsonCreator
    public JobHiringTeam(
            @JsonProperty("user_id") JsonNullable<String> userId,
            @JsonProperty("remote_user_id") JsonNullable<String> remoteUserId,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("email") JsonNullable<String> email,
            @JsonProperty("role") JsonNullable<String> role) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(remoteUserId, "remoteUserId");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(role, "role");
        this.userId = userId;
        this.remoteUserId = remoteUserId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }
    
    public JobHiringTeam() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * User ID of the hiring team member.
     */
    @JsonIgnore
    public JsonNullable<String> userId() {
        return userId;
    }

    /**
     * Provider's unique identifier of the user
     */
    @JsonIgnore
    public JsonNullable<String> remoteUserId() {
        return remoteUserId;
    }

    /**
     * First name of the hiring team member.
     */
    @JsonIgnore
    public JsonNullable<String> firstName() {
        return firstName;
    }

    /**
     * Last name of the hiring team member.
     */
    @JsonIgnore
    public JsonNullable<String> lastName() {
        return lastName;
    }

    /**
     * Email of the hiring team member.
     */
    @JsonIgnore
    public JsonNullable<String> email() {
        return email;
    }

    /**
     * Role of the hiring team member.
     */
    @JsonIgnore
    public JsonNullable<String> role() {
        return role;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * User ID of the hiring team member.
     */
    public JobHiringTeam withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = JsonNullable.of(userId);
        return this;
    }

    /**
     * User ID of the hiring team member.
     */
    public JobHiringTeam withUserId(JsonNullable<String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * Provider's unique identifier of the user
     */
    public JobHiringTeam withRemoteUserId(String remoteUserId) {
        Utils.checkNotNull(remoteUserId, "remoteUserId");
        this.remoteUserId = JsonNullable.of(remoteUserId);
        return this;
    }

    /**
     * Provider's unique identifier of the user
     */
    public JobHiringTeam withRemoteUserId(JsonNullable<String> remoteUserId) {
        Utils.checkNotNull(remoteUserId, "remoteUserId");
        this.remoteUserId = remoteUserId;
        return this;
    }

    /**
     * First name of the hiring team member.
     */
    public JobHiringTeam withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * First name of the hiring team member.
     */
    public JobHiringTeam withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of the hiring team member.
     */
    public JobHiringTeam withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * Last name of the hiring team member.
     */
    public JobHiringTeam withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Email of the hiring team member.
     */
    public JobHiringTeam withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Email of the hiring team member.
     */
    public JobHiringTeam withEmail(JsonNullable<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * Role of the hiring team member.
     */
    public JobHiringTeam withRole(String role) {
        Utils.checkNotNull(role, "role");
        this.role = JsonNullable.of(role);
        return this;
    }

    /**
     * Role of the hiring team member.
     */
    public JobHiringTeam withRole(JsonNullable<String> role) {
        Utils.checkNotNull(role, "role");
        this.role = role;
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
        JobHiringTeam other = (JobHiringTeam) o;
        return 
            Objects.deepEquals(this.userId, other.userId) &&
            Objects.deepEquals(this.remoteUserId, other.remoteUserId) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.role, other.role);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userId,
            remoteUserId,
            firstName,
            lastName,
            email,
            role);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JobHiringTeam.class,
                "userId", userId,
                "remoteUserId", remoteUserId,
                "firstName", firstName,
                "lastName", lastName,
                "email", email,
                "role", role);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> userId = JsonNullable.undefined();
 
        private JsonNullable<String> remoteUserId = JsonNullable.undefined();
 
        private JsonNullable<String> firstName = JsonNullable.undefined();
 
        private JsonNullable<String> lastName = JsonNullable.undefined();
 
        private JsonNullable<String> email = JsonNullable.undefined();
 
        private JsonNullable<String> role = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * User ID of the hiring team member.
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = JsonNullable.of(userId);
            return this;
        }

        /**
         * User ID of the hiring team member.
         */
        public Builder userId(JsonNullable<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * Provider's unique identifier of the user
         */
        public Builder remoteUserId(String remoteUserId) {
            Utils.checkNotNull(remoteUserId, "remoteUserId");
            this.remoteUserId = JsonNullable.of(remoteUserId);
            return this;
        }

        /**
         * Provider's unique identifier of the user
         */
        public Builder remoteUserId(JsonNullable<String> remoteUserId) {
            Utils.checkNotNull(remoteUserId, "remoteUserId");
            this.remoteUserId = remoteUserId;
            return this;
        }

        /**
         * First name of the hiring team member.
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        /**
         * First name of the hiring team member.
         */
        public Builder firstName(JsonNullable<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * Last name of the hiring team member.
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        /**
         * Last name of the hiring team member.
         */
        public Builder lastName(JsonNullable<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * Email of the hiring team member.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = JsonNullable.of(email);
            return this;
        }

        /**
         * Email of the hiring team member.
         */
        public Builder email(JsonNullable<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * Role of the hiring team member.
         */
        public Builder role(String role) {
            Utils.checkNotNull(role, "role");
            this.role = JsonNullable.of(role);
            return this;
        }

        /**
         * Role of the hiring team member.
         */
        public Builder role(JsonNullable<String> role) {
            Utils.checkNotNull(role, "role");
            this.role = role;
            return this;
        }
        
        public JobHiringTeam build() {
            return new JobHiringTeam(
                userId,
                remoteUserId,
                firstName,
                lastName,
                email,
                role);
        }
    }
}

