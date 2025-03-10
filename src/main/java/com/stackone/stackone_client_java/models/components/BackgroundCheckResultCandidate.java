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

public class BackgroundCheckResultCandidate {

    /**
     * Unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * Provider's unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_id")
    private JsonNullable<String> remoteId;

    /**
     * Candidate profile url
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile_url")
    private JsonNullable<String> profileUrl;

    @JsonCreator
    public BackgroundCheckResultCandidate(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("profile_url") JsonNullable<String> profileUrl) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(profileUrl, "profileUrl");
        this.id = id;
        this.remoteId = remoteId;
        this.profileUrl = profileUrl;
    }
    
    public BackgroundCheckResultCandidate() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * Provider's unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> remoteId() {
        return remoteId;
    }

    /**
     * Candidate profile url
     */
    @JsonIgnore
    public JsonNullable<String> profileUrl() {
        return profileUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public BackgroundCheckResultCandidate withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public BackgroundCheckResultCandidate withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public BackgroundCheckResultCandidate withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public BackgroundCheckResultCandidate withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * Candidate profile url
     */
    public BackgroundCheckResultCandidate withProfileUrl(String profileUrl) {
        Utils.checkNotNull(profileUrl, "profileUrl");
        this.profileUrl = JsonNullable.of(profileUrl);
        return this;
    }

    /**
     * Candidate profile url
     */
    public BackgroundCheckResultCandidate withProfileUrl(JsonNullable<String> profileUrl) {
        Utils.checkNotNull(profileUrl, "profileUrl");
        this.profileUrl = profileUrl;
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
        BackgroundCheckResultCandidate other = (BackgroundCheckResultCandidate) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.profileUrl, other.profileUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            profileUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BackgroundCheckResultCandidate.class,
                "id", id,
                "remoteId", remoteId,
                "profileUrl", profileUrl);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<String> profileUrl = JsonNullable.undefined();  
        
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
         * Provider's unique identifier
         */
        public Builder remoteId(String remoteId) {
            Utils.checkNotNull(remoteId, "remoteId");
            this.remoteId = JsonNullable.of(remoteId);
            return this;
        }

        /**
         * Provider's unique identifier
         */
        public Builder remoteId(JsonNullable<String> remoteId) {
            Utils.checkNotNull(remoteId, "remoteId");
            this.remoteId = remoteId;
            return this;
        }

        /**
         * Candidate profile url
         */
        public Builder profileUrl(String profileUrl) {
            Utils.checkNotNull(profileUrl, "profileUrl");
            this.profileUrl = JsonNullable.of(profileUrl);
            return this;
        }

        /**
         * Candidate profile url
         */
        public Builder profileUrl(JsonNullable<String> profileUrl) {
            Utils.checkNotNull(profileUrl, "profileUrl");
            this.profileUrl = profileUrl;
            return this;
        }
        
        public BackgroundCheckResultCandidate build() {
            return new BackgroundCheckResultCandidate(
                id,
                remoteId,
                profileUrl);
        }
    }
}

