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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class EntitySkills {

    /**
     * The ID associated with this skill
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
     * The name associated with this skill
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Whether the skill is active and therefore available for use
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private JsonNullable<Boolean> active;

    /**
     * The language associated with this skill
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    private JsonNullable<? extends Language> language;

    /**
     * The proficiency level of the skill
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maximum_proficiency")
    private JsonNullable<? extends MaximumProficiency> maximumProficiency;

    /**
     * The proficiency level of the skill
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_proficiency")
    private JsonNullable<? extends MinimumProficiency> minimumProficiency;

    @JsonCreator
    public EntitySkills(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("active") JsonNullable<Boolean> active,
            @JsonProperty("language") JsonNullable<? extends Language> language,
            @JsonProperty("maximum_proficiency") JsonNullable<? extends MaximumProficiency> maximumProficiency,
            @JsonProperty("minimum_proficiency") JsonNullable<? extends MinimumProficiency> minimumProficiency) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(language, "language");
        Utils.checkNotNull(maximumProficiency, "maximumProficiency");
        Utils.checkNotNull(minimumProficiency, "minimumProficiency");
        this.id = id;
        this.remoteId = remoteId;
        this.name = name;
        this.active = active;
        this.language = language;
        this.maximumProficiency = maximumProficiency;
        this.minimumProficiency = minimumProficiency;
    }
    
    public EntitySkills() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID associated with this skill
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
     * The name associated with this skill
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Whether the skill is active and therefore available for use
     */
    @JsonIgnore
    public JsonNullable<Boolean> active() {
        return active;
    }

    /**
     * The language associated with this skill
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Language> language() {
        return (JsonNullable<Language>) language;
    }

    /**
     * The proficiency level of the skill
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<MaximumProficiency> maximumProficiency() {
        return (JsonNullable<MaximumProficiency>) maximumProficiency;
    }

    /**
     * The proficiency level of the skill
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<MinimumProficiency> minimumProficiency() {
        return (JsonNullable<MinimumProficiency>) minimumProficiency;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID associated with this skill
     */
    public EntitySkills withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * The ID associated with this skill
     */
    public EntitySkills withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public EntitySkills withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public EntitySkills withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * The name associated with this skill
     */
    public EntitySkills withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name associated with this skill
     */
    public EntitySkills withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Whether the skill is active and therefore available for use
     */
    public EntitySkills withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = JsonNullable.of(active);
        return this;
    }

    /**
     * Whether the skill is active and therefore available for use
     */
    public EntitySkills withActive(JsonNullable<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * The language associated with this skill
     */
    public EntitySkills withLanguage(Language language) {
        Utils.checkNotNull(language, "language");
        this.language = JsonNullable.of(language);
        return this;
    }

    /**
     * The language associated with this skill
     */
    public EntitySkills withLanguage(JsonNullable<? extends Language> language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
        return this;
    }

    /**
     * The proficiency level of the skill
     */
    public EntitySkills withMaximumProficiency(MaximumProficiency maximumProficiency) {
        Utils.checkNotNull(maximumProficiency, "maximumProficiency");
        this.maximumProficiency = JsonNullable.of(maximumProficiency);
        return this;
    }

    /**
     * The proficiency level of the skill
     */
    public EntitySkills withMaximumProficiency(JsonNullable<? extends MaximumProficiency> maximumProficiency) {
        Utils.checkNotNull(maximumProficiency, "maximumProficiency");
        this.maximumProficiency = maximumProficiency;
        return this;
    }

    /**
     * The proficiency level of the skill
     */
    public EntitySkills withMinimumProficiency(MinimumProficiency minimumProficiency) {
        Utils.checkNotNull(minimumProficiency, "minimumProficiency");
        this.minimumProficiency = JsonNullable.of(minimumProficiency);
        return this;
    }

    /**
     * The proficiency level of the skill
     */
    public EntitySkills withMinimumProficiency(JsonNullable<? extends MinimumProficiency> minimumProficiency) {
        Utils.checkNotNull(minimumProficiency, "minimumProficiency");
        this.minimumProficiency = minimumProficiency;
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
        EntitySkills other = (EntitySkills) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.language, other.language) &&
            Objects.deepEquals(this.maximumProficiency, other.maximumProficiency) &&
            Objects.deepEquals(this.minimumProficiency, other.minimumProficiency);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            name,
            active,
            language,
            maximumProficiency,
            minimumProficiency);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EntitySkills.class,
                "id", id,
                "remoteId", remoteId,
                "name", name,
                "active", active,
                "language", language,
                "maximumProficiency", maximumProficiency,
                "minimumProficiency", minimumProficiency);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<Boolean> active = JsonNullable.undefined();
 
        private JsonNullable<? extends Language> language = JsonNullable.undefined();
 
        private JsonNullable<? extends MaximumProficiency> maximumProficiency = JsonNullable.undefined();
 
        private JsonNullable<? extends MinimumProficiency> minimumProficiency = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID associated with this skill
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * The ID associated with this skill
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
         * The name associated with this skill
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name associated with this skill
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Whether the skill is active and therefore available for use
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = JsonNullable.of(active);
            return this;
        }

        /**
         * Whether the skill is active and therefore available for use
         */
        public Builder active(JsonNullable<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * The language associated with this skill
         */
        public Builder language(Language language) {
            Utils.checkNotNull(language, "language");
            this.language = JsonNullable.of(language);
            return this;
        }

        /**
         * The language associated with this skill
         */
        public Builder language(JsonNullable<? extends Language> language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }

        /**
         * The proficiency level of the skill
         */
        public Builder maximumProficiency(MaximumProficiency maximumProficiency) {
            Utils.checkNotNull(maximumProficiency, "maximumProficiency");
            this.maximumProficiency = JsonNullable.of(maximumProficiency);
            return this;
        }

        /**
         * The proficiency level of the skill
         */
        public Builder maximumProficiency(JsonNullable<? extends MaximumProficiency> maximumProficiency) {
            Utils.checkNotNull(maximumProficiency, "maximumProficiency");
            this.maximumProficiency = maximumProficiency;
            return this;
        }

        /**
         * The proficiency level of the skill
         */
        public Builder minimumProficiency(MinimumProficiency minimumProficiency) {
            Utils.checkNotNull(minimumProficiency, "minimumProficiency");
            this.minimumProficiency = JsonNullable.of(minimumProficiency);
            return this;
        }

        /**
         * The proficiency level of the skill
         */
        public Builder minimumProficiency(JsonNullable<? extends MinimumProficiency> minimumProficiency) {
            Utils.checkNotNull(minimumProficiency, "minimumProficiency");
            this.minimumProficiency = minimumProficiency;
            return this;
        }
        
        public EntitySkills build() {
            return new EntitySkills(
                id,
                remoteId,
                name,
                active,
                language,
                maximumProficiency,
                minimumProficiency);
        }
    }
}

