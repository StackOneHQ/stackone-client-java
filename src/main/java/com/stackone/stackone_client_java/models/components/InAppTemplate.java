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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class InAppTemplate {

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

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private JsonNullable<? extends List<String>> tags;

    /**
     * Date of creation
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private JsonNullable<OffsetDateTime> createdAt;

    /**
     * Date of last update
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("messages")
    private JsonNullable<? extends List<InAppMessages>> messages;

    @JsonCreator
    public InAppTemplate(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("tags") JsonNullable<? extends List<String>> tags,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("messages") JsonNullable<? extends List<InAppMessages>> messages) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(messages, "messages");
        this.id = id;
        this.remoteId = remoteId;
        this.name = name;
        this.tags = tags;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.messages = messages;
    }
    
    public InAppTemplate() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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

    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> tags() {
        return (JsonNullable<List<String>>) tags;
    }

    /**
     * Date of creation
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * Date of last update
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<InAppMessages>> messages() {
        return (JsonNullable<List<InAppMessages>>) messages;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public InAppTemplate withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public InAppTemplate withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public InAppTemplate withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public InAppTemplate withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    public InAppTemplate withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    public InAppTemplate withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public InAppTemplate withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = JsonNullable.of(tags);
        return this;
    }

    public InAppTemplate withTags(JsonNullable<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    /**
     * Date of creation
     */
    public InAppTemplate withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * Date of creation
     */
    public InAppTemplate withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Date of last update
     */
    public InAppTemplate withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Date of last update
     */
    public InAppTemplate withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public InAppTemplate withMessages(List<InAppMessages> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = JsonNullable.of(messages);
        return this;
    }

    public InAppTemplate withMessages(JsonNullable<? extends List<InAppMessages>> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = messages;
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
        InAppTemplate other = (InAppTemplate) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.messages, other.messages);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            name,
            tags,
            createdAt,
            updatedAt,
            messages);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InAppTemplate.class,
                "id", id,
                "remoteId", remoteId,
                "name", name,
                "tags", tags,
                "createdAt", createdAt,
                "updatedAt", updatedAt,
                "messages", messages);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> tags = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();
 
        private JsonNullable<? extends List<InAppMessages>> messages = JsonNullable.undefined();  
        
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

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder tags(List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = JsonNullable.of(tags);
            return this;
        }

        public Builder tags(JsonNullable<? extends List<String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }

        /**
         * Date of creation
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = JsonNullable.of(createdAt);
            return this;
        }

        /**
         * Date of creation
         */
        public Builder createdAt(JsonNullable<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Date of last update
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = JsonNullable.of(updatedAt);
            return this;
        }

        /**
         * Date of last update
         */
        public Builder updatedAt(JsonNullable<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder messages(List<InAppMessages> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = JsonNullable.of(messages);
            return this;
        }

        public Builder messages(JsonNullable<? extends List<InAppMessages>> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = messages;
            return this;
        }
        
        public InAppTemplate build() {
            return new InAppTemplate(
                id,
                remoteId,
                name,
                tags,
                createdAt,
                updatedAt,
                messages);
        }
    }
}

