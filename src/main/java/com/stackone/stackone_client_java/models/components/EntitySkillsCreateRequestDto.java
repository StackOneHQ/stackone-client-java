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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class EntitySkillsCreateRequestDto {

    /**
     * The ID associated with this skill
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * The name associated with this skill
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The proficiency level of the skill
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maximum_proficiency")
    private JsonNullable<? extends EntitySkillsCreateRequestDtoMaximumProficiency> maximumProficiency;

    /**
     * The proficiency level of the skill
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_proficiency")
    private JsonNullable<? extends EntitySkillsCreateRequestDtoMinimumProficiency> minimumProficiency;

    @JsonCreator
    public EntitySkillsCreateRequestDto(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("maximum_proficiency") JsonNullable<? extends EntitySkillsCreateRequestDtoMaximumProficiency> maximumProficiency,
            @JsonProperty("minimum_proficiency") JsonNullable<? extends EntitySkillsCreateRequestDtoMinimumProficiency> minimumProficiency) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(maximumProficiency, "maximumProficiency");
        Utils.checkNotNull(minimumProficiency, "minimumProficiency");
        this.id = id;
        this.name = name;
        this.maximumProficiency = maximumProficiency;
        this.minimumProficiency = minimumProficiency;
    }
    
    public EntitySkillsCreateRequestDto() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID associated with this skill
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * The name associated with this skill
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The proficiency level of the skill
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EntitySkillsCreateRequestDtoMaximumProficiency> maximumProficiency() {
        return (JsonNullable<EntitySkillsCreateRequestDtoMaximumProficiency>) maximumProficiency;
    }

    /**
     * The proficiency level of the skill
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EntitySkillsCreateRequestDtoMinimumProficiency> minimumProficiency() {
        return (JsonNullable<EntitySkillsCreateRequestDtoMinimumProficiency>) minimumProficiency;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID associated with this skill
     */
    public EntitySkillsCreateRequestDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * The ID associated with this skill
     */
    public EntitySkillsCreateRequestDto withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name associated with this skill
     */
    public EntitySkillsCreateRequestDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name associated with this skill
     */
    public EntitySkillsCreateRequestDto withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The proficiency level of the skill
     */
    public EntitySkillsCreateRequestDto withMaximumProficiency(EntitySkillsCreateRequestDtoMaximumProficiency maximumProficiency) {
        Utils.checkNotNull(maximumProficiency, "maximumProficiency");
        this.maximumProficiency = JsonNullable.of(maximumProficiency);
        return this;
    }

    /**
     * The proficiency level of the skill
     */
    public EntitySkillsCreateRequestDto withMaximumProficiency(JsonNullable<? extends EntitySkillsCreateRequestDtoMaximumProficiency> maximumProficiency) {
        Utils.checkNotNull(maximumProficiency, "maximumProficiency");
        this.maximumProficiency = maximumProficiency;
        return this;
    }

    /**
     * The proficiency level of the skill
     */
    public EntitySkillsCreateRequestDto withMinimumProficiency(EntitySkillsCreateRequestDtoMinimumProficiency minimumProficiency) {
        Utils.checkNotNull(minimumProficiency, "minimumProficiency");
        this.minimumProficiency = JsonNullable.of(minimumProficiency);
        return this;
    }

    /**
     * The proficiency level of the skill
     */
    public EntitySkillsCreateRequestDto withMinimumProficiency(JsonNullable<? extends EntitySkillsCreateRequestDtoMinimumProficiency> minimumProficiency) {
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
        EntitySkillsCreateRequestDto other = (EntitySkillsCreateRequestDto) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.maximumProficiency, other.maximumProficiency) &&
            Objects.deepEquals(this.minimumProficiency, other.minimumProficiency);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            maximumProficiency,
            minimumProficiency);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EntitySkillsCreateRequestDto.class,
                "id", id,
                "name", name,
                "maximumProficiency", maximumProficiency,
                "minimumProficiency", minimumProficiency);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends EntitySkillsCreateRequestDtoMaximumProficiency> maximumProficiency = JsonNullable.undefined();
 
        private JsonNullable<? extends EntitySkillsCreateRequestDtoMinimumProficiency> minimumProficiency = JsonNullable.undefined();  
        
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
         * The proficiency level of the skill
         */
        public Builder maximumProficiency(EntitySkillsCreateRequestDtoMaximumProficiency maximumProficiency) {
            Utils.checkNotNull(maximumProficiency, "maximumProficiency");
            this.maximumProficiency = JsonNullable.of(maximumProficiency);
            return this;
        }

        /**
         * The proficiency level of the skill
         */
        public Builder maximumProficiency(JsonNullable<? extends EntitySkillsCreateRequestDtoMaximumProficiency> maximumProficiency) {
            Utils.checkNotNull(maximumProficiency, "maximumProficiency");
            this.maximumProficiency = maximumProficiency;
            return this;
        }

        /**
         * The proficiency level of the skill
         */
        public Builder minimumProficiency(EntitySkillsCreateRequestDtoMinimumProficiency minimumProficiency) {
            Utils.checkNotNull(minimumProficiency, "minimumProficiency");
            this.minimumProficiency = JsonNullable.of(minimumProficiency);
            return this;
        }

        /**
         * The proficiency level of the skill
         */
        public Builder minimumProficiency(JsonNullable<? extends EntitySkillsCreateRequestDtoMinimumProficiency> minimumProficiency) {
            Utils.checkNotNull(minimumProficiency, "minimumProficiency");
            this.minimumProficiency = minimumProficiency;
            return this;
        }
        
        public EntitySkillsCreateRequestDto build() {
            return new EntitySkillsCreateRequestDto(
                id,
                name,
                maximumProficiency,
                minimumProficiency);
        }
    }
}

