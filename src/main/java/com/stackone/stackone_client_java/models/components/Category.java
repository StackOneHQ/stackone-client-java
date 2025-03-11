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
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class Category {

    /**
     * The ID associated with this category
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
     * Custom Unified Fields configured in your StackOne project
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unified_custom_fields")
    private JsonNullable<? extends Map<String, Object>> unifiedCustomFields;

    /**
     * The name associated with this category
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Whether the category is active and therefore available for use
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private JsonNullable<Boolean> active;

    /**
     * The hierarchal level of the category
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hierarchy")
    private JsonNullable<? extends Hierarchy> hierarchy;

    /**
     * The hierarchal level of the category
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("level")
    @Deprecated
    private JsonNullable<? extends Level> level;

    /**
     * The language associated with this category
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    private JsonNullable<? extends CategoryLanguage> language;

    @JsonCreator
    public Category(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("unified_custom_fields") JsonNullable<? extends Map<String, Object>> unifiedCustomFields,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("active") JsonNullable<Boolean> active,
            @JsonProperty("hierarchy") JsonNullable<? extends Hierarchy> hierarchy,
            @JsonProperty("level") JsonNullable<? extends Level> level,
            @JsonProperty("language") JsonNullable<? extends CategoryLanguage> language) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(hierarchy, "hierarchy");
        Utils.checkNotNull(level, "level");
        Utils.checkNotNull(language, "language");
        this.id = id;
        this.remoteId = remoteId;
        this.unifiedCustomFields = unifiedCustomFields;
        this.name = name;
        this.active = active;
        this.hierarchy = hierarchy;
        this.level = level;
        this.language = language;
    }
    
    public Category() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID associated with this category
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
     * Custom Unified Fields configured in your StackOne project
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> unifiedCustomFields() {
        return (JsonNullable<Map<String, Object>>) unifiedCustomFields;
    }

    /**
     * The name associated with this category
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Whether the category is active and therefore available for use
     */
    @JsonIgnore
    public JsonNullable<Boolean> active() {
        return active;
    }

    /**
     * The hierarchal level of the category
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Hierarchy> hierarchy() {
        return (JsonNullable<Hierarchy>) hierarchy;
    }

    /**
     * The hierarchal level of the category
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Level> level() {
        return (JsonNullable<Level>) level;
    }

    /**
     * The language associated with this category
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CategoryLanguage> language() {
        return (JsonNullable<CategoryLanguage>) language;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID associated with this category
     */
    public Category withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * The ID associated with this category
     */
    public Category withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public Category withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public Category withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public Category withUnifiedCustomFields(Map<String, Object> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public Category withUnifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = unifiedCustomFields;
        return this;
    }

    /**
     * The name associated with this category
     */
    public Category withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name associated with this category
     */
    public Category withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Whether the category is active and therefore available for use
     */
    public Category withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = JsonNullable.of(active);
        return this;
    }

    /**
     * Whether the category is active and therefore available for use
     */
    public Category withActive(JsonNullable<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * The hierarchal level of the category
     */
    public Category withHierarchy(Hierarchy hierarchy) {
        Utils.checkNotNull(hierarchy, "hierarchy");
        this.hierarchy = JsonNullable.of(hierarchy);
        return this;
    }

    /**
     * The hierarchal level of the category
     */
    public Category withHierarchy(JsonNullable<? extends Hierarchy> hierarchy) {
        Utils.checkNotNull(hierarchy, "hierarchy");
        this.hierarchy = hierarchy;
        return this;
    }

    /**
     * The hierarchal level of the category
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Category withLevel(Level level) {
        Utils.checkNotNull(level, "level");
        this.level = JsonNullable.of(level);
        return this;
    }

    /**
     * The hierarchal level of the category
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Category withLevel(JsonNullable<? extends Level> level) {
        Utils.checkNotNull(level, "level");
        this.level = level;
        return this;
    }

    /**
     * The language associated with this category
     */
    public Category withLanguage(CategoryLanguage language) {
        Utils.checkNotNull(language, "language");
        this.language = JsonNullable.of(language);
        return this;
    }

    /**
     * The language associated with this category
     */
    public Category withLanguage(JsonNullable<? extends CategoryLanguage> language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
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
        Category other = (Category) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.unifiedCustomFields, other.unifiedCustomFields) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.hierarchy, other.hierarchy) &&
            Objects.deepEquals(this.level, other.level) &&
            Objects.deepEquals(this.language, other.language);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            unifiedCustomFields,
            name,
            active,
            hierarchy,
            level,
            language);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Category.class,
                "id", id,
                "remoteId", remoteId,
                "unifiedCustomFields", unifiedCustomFields,
                "name", name,
                "active", active,
                "hierarchy", hierarchy,
                "level", level,
                "language", language);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> unifiedCustomFields = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<Boolean> active = JsonNullable.undefined();
 
        private JsonNullable<? extends Hierarchy> hierarchy = JsonNullable.undefined();
 
        @Deprecated
        private JsonNullable<? extends Level> level = JsonNullable.undefined();
 
        private JsonNullable<? extends CategoryLanguage> language = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID associated with this category
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * The ID associated with this category
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
         * Custom Unified Fields configured in your StackOne project
         */
        public Builder unifiedCustomFields(Map<String, Object> unifiedCustomFields) {
            Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
            this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
            return this;
        }

        /**
         * Custom Unified Fields configured in your StackOne project
         */
        public Builder unifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
            Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
            this.unifiedCustomFields = unifiedCustomFields;
            return this;
        }

        /**
         * The name associated with this category
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name associated with this category
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Whether the category is active and therefore available for use
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = JsonNullable.of(active);
            return this;
        }

        /**
         * Whether the category is active and therefore available for use
         */
        public Builder active(JsonNullable<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * The hierarchal level of the category
         */
        public Builder hierarchy(Hierarchy hierarchy) {
            Utils.checkNotNull(hierarchy, "hierarchy");
            this.hierarchy = JsonNullable.of(hierarchy);
            return this;
        }

        /**
         * The hierarchal level of the category
         */
        public Builder hierarchy(JsonNullable<? extends Hierarchy> hierarchy) {
            Utils.checkNotNull(hierarchy, "hierarchy");
            this.hierarchy = hierarchy;
            return this;
        }

        /**
         * The hierarchal level of the category
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder level(Level level) {
            Utils.checkNotNull(level, "level");
            this.level = JsonNullable.of(level);
            return this;
        }

        /**
         * The hierarchal level of the category
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder level(JsonNullable<? extends Level> level) {
            Utils.checkNotNull(level, "level");
            this.level = level;
            return this;
        }

        /**
         * The language associated with this category
         */
        public Builder language(CategoryLanguage language) {
            Utils.checkNotNull(language, "language");
            this.language = JsonNullable.of(language);
            return this;
        }

        /**
         * The language associated with this category
         */
        public Builder language(JsonNullable<? extends CategoryLanguage> language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }
        
        public Category build() {
            return new Category(
                id,
                remoteId,
                unifiedCustomFields,
                name,
                active,
                hierarchy,
                level,
                language);
        }
    }
}

