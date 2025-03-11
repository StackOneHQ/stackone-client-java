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
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class ScorecardSection {

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
     * The label of the section
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private JsonNullable<String> label;

    /**
     * The fields within the section
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    private JsonNullable<? extends List<Field>> fields;

    @JsonCreator
    public ScorecardSection(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("label") JsonNullable<String> label,
            @JsonProperty("fields") JsonNullable<? extends List<Field>> fields) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(fields, "fields");
        this.id = id;
        this.remoteId = remoteId;
        this.label = label;
        this.fields = fields;
    }
    
    public ScorecardSection() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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
     * The label of the section
     */
    @JsonIgnore
    public JsonNullable<String> label() {
        return label;
    }

    /**
     * The fields within the section
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Field>> fields() {
        return (JsonNullable<List<Field>>) fields;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public ScorecardSection withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public ScorecardSection withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public ScorecardSection withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public ScorecardSection withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * The label of the section
     */
    public ScorecardSection withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = JsonNullable.of(label);
        return this;
    }

    /**
     * The label of the section
     */
    public ScorecardSection withLabel(JsonNullable<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    /**
     * The fields within the section
     */
    public ScorecardSection withFields(List<Field> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The fields within the section
     */
    public ScorecardSection withFields(JsonNullable<? extends List<Field>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
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
        ScorecardSection other = (ScorecardSection) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            label,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScorecardSection.class,
                "id", id,
                "remoteId", remoteId,
                "label", label,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<String> label = JsonNullable.undefined();
 
        private JsonNullable<? extends List<Field>> fields = JsonNullable.undefined();  
        
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
         * The label of the section
         */
        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = JsonNullable.of(label);
            return this;
        }

        /**
         * The label of the section
         */
        public Builder label(JsonNullable<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        /**
         * The fields within the section
         */
        public Builder fields(List<Field> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = JsonNullable.of(fields);
            return this;
        }

        /**
         * The fields within the section
         */
        public Builder fields(JsonNullable<? extends List<Field>> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }
        
        public ScorecardSection build() {
            return new ScorecardSection(
                id,
                remoteId,
                label,
                fields);
        }
    }
}

