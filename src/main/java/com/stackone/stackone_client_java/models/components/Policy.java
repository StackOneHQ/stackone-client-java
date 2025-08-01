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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Policy
 * 
 * <p>The time off policy associated with Time Off
 */
public class Policy {
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
     * The name of this policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The description of this policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The type of this policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends TimeOffPolicyType> type;

    /**
     * The duration unit of the current policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration_unit")
    private JsonNullable<? extends TimeOffDurationUnit> durationUnit;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reasons")
    private JsonNullable<? extends List<Reason>> reasons;

    /**
     * The created_at date of this policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private JsonNullable<OffsetDateTime> createdAt;

    /**
     * The updated_at date of this policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<OffsetDateTime> updatedAt;

    @JsonCreator
    public Policy(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("type") JsonNullable<? extends TimeOffPolicyType> type,
            @JsonProperty("duration_unit") JsonNullable<? extends TimeOffDurationUnit> durationUnit,
            @JsonProperty("reasons") JsonNullable<? extends List<Reason>> reasons,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(durationUnit, "durationUnit");
        Utils.checkNotNull(reasons, "reasons");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.id = id;
        this.remoteId = remoteId;
        this.name = name;
        this.description = description;
        this.type = type;
        this.durationUnit = durationUnit;
        this.reasons = reasons;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Policy() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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
     * The name of this policy
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The description of this policy
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The type of this policy
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TimeOffPolicyType> type() {
        return (JsonNullable<TimeOffPolicyType>) type;
    }

    /**
     * The duration unit of the current policy
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TimeOffDurationUnit> durationUnit() {
        return (JsonNullable<TimeOffDurationUnit>) durationUnit;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Reason>> reasons() {
        return (JsonNullable<List<Reason>>) reasons;
    }

    /**
     * The created_at date of this policy
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The updated_at date of this policy
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Unique identifier
     */
    public Policy withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public Policy withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public Policy withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public Policy withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * The name of this policy
     */
    public Policy withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of this policy
     */
    public Policy withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The description of this policy
     */
    public Policy withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The description of this policy
     */
    public Policy withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The type of this policy
     */
    public Policy withType(TimeOffPolicyType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of this policy
     */
    public Policy withType(JsonNullable<? extends TimeOffPolicyType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The duration unit of the current policy
     */
    public Policy withDurationUnit(TimeOffDurationUnit durationUnit) {
        Utils.checkNotNull(durationUnit, "durationUnit");
        this.durationUnit = JsonNullable.of(durationUnit);
        return this;
    }

    /**
     * The duration unit of the current policy
     */
    public Policy withDurationUnit(JsonNullable<? extends TimeOffDurationUnit> durationUnit) {
        Utils.checkNotNull(durationUnit, "durationUnit");
        this.durationUnit = durationUnit;
        return this;
    }

    public Policy withReasons(List<Reason> reasons) {
        Utils.checkNotNull(reasons, "reasons");
        this.reasons = JsonNullable.of(reasons);
        return this;
    }

    public Policy withReasons(JsonNullable<? extends List<Reason>> reasons) {
        Utils.checkNotNull(reasons, "reasons");
        this.reasons = reasons;
        return this;
    }

    /**
     * The created_at date of this policy
     */
    public Policy withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The created_at date of this policy
     */
    public Policy withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The updated_at date of this policy
     */
    public Policy withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The updated_at date of this policy
     */
    public Policy withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        Policy other = (Policy) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.remoteId, other.remoteId) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.type, other.type) &&
            Utils.enhancedDeepEquals(this.durationUnit, other.durationUnit) &&
            Utils.enhancedDeepEquals(this.reasons, other.reasons) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, remoteId, name,
            description, type, durationUnit,
            reasons, createdAt, updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Policy.class,
                "id", id,
                "remoteId", remoteId,
                "name", name,
                "description", description,
                "type", type,
                "durationUnit", durationUnit,
                "reasons", reasons,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

        private JsonNullable<String> remoteId = JsonNullable.undefined();

        private JsonNullable<String> name = JsonNullable.undefined();

        private JsonNullable<String> description = JsonNullable.undefined();

        private JsonNullable<? extends TimeOffPolicyType> type = JsonNullable.undefined();

        private JsonNullable<? extends TimeOffDurationUnit> durationUnit = JsonNullable.undefined();

        private JsonNullable<? extends List<Reason>> reasons = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();

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
         * The name of this policy
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of this policy
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        /**
         * The description of this policy
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * The description of this policy
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }


        /**
         * The type of this policy
         */
        public Builder type(TimeOffPolicyType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of this policy
         */
        public Builder type(JsonNullable<? extends TimeOffPolicyType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }


        /**
         * The duration unit of the current policy
         */
        public Builder durationUnit(TimeOffDurationUnit durationUnit) {
            Utils.checkNotNull(durationUnit, "durationUnit");
            this.durationUnit = JsonNullable.of(durationUnit);
            return this;
        }

        /**
         * The duration unit of the current policy
         */
        public Builder durationUnit(JsonNullable<? extends TimeOffDurationUnit> durationUnit) {
            Utils.checkNotNull(durationUnit, "durationUnit");
            this.durationUnit = durationUnit;
            return this;
        }


        public Builder reasons(List<Reason> reasons) {
            Utils.checkNotNull(reasons, "reasons");
            this.reasons = JsonNullable.of(reasons);
            return this;
        }

        public Builder reasons(JsonNullable<? extends List<Reason>> reasons) {
            Utils.checkNotNull(reasons, "reasons");
            this.reasons = reasons;
            return this;
        }


        /**
         * The created_at date of this policy
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = JsonNullable.of(createdAt);
            return this;
        }

        /**
         * The created_at date of this policy
         */
        public Builder createdAt(JsonNullable<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }


        /**
         * The updated_at date of this policy
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = JsonNullable.of(updatedAt);
            return this;
        }

        /**
         * The updated_at date of this policy
         */
        public Builder updatedAt(JsonNullable<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Policy build() {

            return new Policy(
                id, remoteId, name,
                description, type, durationUnit,
                reasons, createdAt, updatedAt);
        }

    }
}
