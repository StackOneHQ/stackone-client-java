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
 * Language
 * 
 * <p>The language associated with this skill
 */
public class Language {
    /**
     * The Locale Code of the language
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EntitySkillsValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EntitySkillsSourceValue> sourceValue;

    @JsonCreator
    public Language(
            @JsonProperty("value") JsonNullable<? extends EntitySkillsValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EntitySkillsSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public Language() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The Locale Code of the language
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EntitySkillsValue> value() {
        return (JsonNullable<EntitySkillsValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EntitySkillsSourceValue> sourceValue() {
        return (JsonNullable<EntitySkillsSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The Locale Code of the language
     */
    public Language withValue(EntitySkillsValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The Locale Code of the language
     */
    public Language withValue(JsonNullable<? extends EntitySkillsValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public Language withSourceValue(EntitySkillsSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public Language withSourceValue(JsonNullable<? extends EntitySkillsSourceValue> sourceValue) {
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
        Language other = (Language) o;
        return 
            Utils.enhancedDeepEquals(this.value, other.value) &&
            Utils.enhancedDeepEquals(this.sourceValue, other.sourceValue);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            value, sourceValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Language.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends EntitySkillsValue> value = JsonNullable.undefined();

        private JsonNullable<? extends EntitySkillsSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The Locale Code of the language
         */
        public Builder value(EntitySkillsValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The Locale Code of the language
         */
        public Builder value(JsonNullable<? extends EntitySkillsValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(EntitySkillsSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends EntitySkillsSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public Language build() {

            return new Language(
                value, sourceValue);
        }

    }
}
