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
import org.openapitools.jackson.nullable.JsonNullable;


public class AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate {
    /**
     * Unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * Candidate profile url
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile_url")
    private JsonNullable<String> profileUrl;

    @JsonCreator
    public AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("profile_url") JsonNullable<String> profileUrl) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(profileUrl, "profileUrl");
        this.id = id;
        this.profileUrl = profileUrl;
    }
    
    public AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * Candidate profile url
     */
    @JsonIgnore
    public JsonNullable<String> profileUrl() {
        return profileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Unique identifier
     */
    public AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Candidate profile url
     */
    public AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate withProfileUrl(String profileUrl) {
        Utils.checkNotNull(profileUrl, "profileUrl");
        this.profileUrl = JsonNullable.of(profileUrl);
        return this;
    }

    /**
     * Candidate profile url
     */
    public AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate withProfileUrl(JsonNullable<String> profileUrl) {
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
        AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate other = (AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.profileUrl, other.profileUrl);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, profileUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate.class,
                "id", id,
                "profileUrl", profileUrl);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

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

        public AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate build() {

            return new AtsUpdateCandidatesAssessmentsResultsRequestDtoCandidate(
                id, profileUrl);
        }

    }
}
