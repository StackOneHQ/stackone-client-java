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

public class UpsertResultDataExternalReferenceModel {

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
     * The external identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_reference")
    private JsonNullable<String> externalReference;

    @JsonCreator
    public UpsertResultDataExternalReferenceModel(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("external_reference") JsonNullable<String> externalReference) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(externalReference, "externalReference");
        this.id = id;
        this.remoteId = remoteId;
        this.externalReference = externalReference;
    }
    
    public UpsertResultDataExternalReferenceModel() {
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
     * The external identifier
     */
    @JsonIgnore
    public JsonNullable<String> externalReference() {
        return externalReference;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public UpsertResultDataExternalReferenceModel withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public UpsertResultDataExternalReferenceModel withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public UpsertResultDataExternalReferenceModel withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public UpsertResultDataExternalReferenceModel withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * The external identifier
     */
    public UpsertResultDataExternalReferenceModel withExternalReference(String externalReference) {
        Utils.checkNotNull(externalReference, "externalReference");
        this.externalReference = JsonNullable.of(externalReference);
        return this;
    }

    /**
     * The external identifier
     */
    public UpsertResultDataExternalReferenceModel withExternalReference(JsonNullable<String> externalReference) {
        Utils.checkNotNull(externalReference, "externalReference");
        this.externalReference = externalReference;
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
        UpsertResultDataExternalReferenceModel other = (UpsertResultDataExternalReferenceModel) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.externalReference, other.externalReference);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            externalReference);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpsertResultDataExternalReferenceModel.class,
                "id", id,
                "remoteId", remoteId,
                "externalReference", externalReference);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<String> externalReference = JsonNullable.undefined();  
        
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
         * The external identifier
         */
        public Builder externalReference(String externalReference) {
            Utils.checkNotNull(externalReference, "externalReference");
            this.externalReference = JsonNullable.of(externalReference);
            return this;
        }

        /**
         * The external identifier
         */
        public Builder externalReference(JsonNullable<String> externalReference) {
            Utils.checkNotNull(externalReference, "externalReference");
            this.externalReference = externalReference;
            return this;
        }
        
        public UpsertResultDataExternalReferenceModel build() {
            return new UpsertResultDataExternalReferenceModel(
                id,
                remoteId,
                externalReference);
        }
    }
}

