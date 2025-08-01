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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EntitySkillsCreateRequestDtoMaximumProficiency
 * 
 * <p>The proficiency level of the skill
 */
public class EntitySkillsCreateRequestDtoMaximumProficiency {
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
     * The name associated with this proficiency
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EntitySkillsCreateRequestDtoValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EntitySkillsCreateRequestDtoSourceValue> sourceValue;

    @JsonCreator
    public EntitySkillsCreateRequestDtoMaximumProficiency(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("value") JsonNullable<? extends EntitySkillsCreateRequestDtoValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EntitySkillsCreateRequestDtoSourceValue> sourceValue) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.id = id;
        this.remoteId = remoteId;
        this.name = name;
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public EntitySkillsCreateRequestDtoMaximumProficiency() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined());
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
     * The name associated with this proficiency
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EntitySkillsCreateRequestDtoValue> value() {
        return (JsonNullable<EntitySkillsCreateRequestDtoValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EntitySkillsCreateRequestDtoSourceValue> sourceValue() {
        return (JsonNullable<EntitySkillsCreateRequestDtoSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Unique identifier
     */
    public EntitySkillsCreateRequestDtoMaximumProficiency withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public EntitySkillsCreateRequestDtoMaximumProficiency withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public EntitySkillsCreateRequestDtoMaximumProficiency withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public EntitySkillsCreateRequestDtoMaximumProficiency withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * The name associated with this proficiency
     */
    public EntitySkillsCreateRequestDtoMaximumProficiency withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name associated with this proficiency
     */
    public EntitySkillsCreateRequestDtoMaximumProficiency withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public EntitySkillsCreateRequestDtoMaximumProficiency withValue(EntitySkillsCreateRequestDtoValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public EntitySkillsCreateRequestDtoMaximumProficiency withValue(JsonNullable<? extends EntitySkillsCreateRequestDtoValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public EntitySkillsCreateRequestDtoMaximumProficiency withSourceValue(EntitySkillsCreateRequestDtoSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public EntitySkillsCreateRequestDtoMaximumProficiency withSourceValue(JsonNullable<? extends EntitySkillsCreateRequestDtoSourceValue> sourceValue) {
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
        EntitySkillsCreateRequestDtoMaximumProficiency other = (EntitySkillsCreateRequestDtoMaximumProficiency) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.remoteId, other.remoteId) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.value, other.value) &&
            Utils.enhancedDeepEquals(this.sourceValue, other.sourceValue);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, remoteId, name,
            value, sourceValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EntitySkillsCreateRequestDtoMaximumProficiency.class,
                "id", id,
                "remoteId", remoteId,
                "name", name,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

        private JsonNullable<String> remoteId = JsonNullable.undefined();

        private JsonNullable<String> name = JsonNullable.undefined();

        private JsonNullable<? extends EntitySkillsCreateRequestDtoValue> value = JsonNullable.undefined();

        private JsonNullable<? extends EntitySkillsCreateRequestDtoSourceValue> sourceValue = JsonNullable.undefined();

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
         * The name associated with this proficiency
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name associated with this proficiency
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder value(EntitySkillsCreateRequestDtoValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends EntitySkillsCreateRequestDtoValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(EntitySkillsCreateRequestDtoSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends EntitySkillsCreateRequestDtoSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public EntitySkillsCreateRequestDtoMaximumProficiency build() {

            return new EntitySkillsCreateRequestDtoMaximumProficiency(
                id, remoteId, name,
                value, sourceValue);
        }

    }
}
