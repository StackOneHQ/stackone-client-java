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

public class LocalizationModel {

    /**
     * The title of the content
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * The description of the content
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The language associated with the localization details
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    private JsonNullable<? extends LocalizationModelLanguage> language;

    @JsonCreator
    public LocalizationModel(
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("language") JsonNullable<? extends LocalizationModelLanguage> language) {
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(language, "language");
        this.title = title;
        this.description = description;
        this.language = language;
    }
    
    public LocalizationModel() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The title of the content
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * The description of the content
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The language associated with the localization details
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<LocalizationModelLanguage> language() {
        return (JsonNullable<LocalizationModelLanguage>) language;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The title of the content
     */
    public LocalizationModel withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * The title of the content
     */
    public LocalizationModel withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * The description of the content
     */
    public LocalizationModel withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The description of the content
     */
    public LocalizationModel withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The language associated with the localization details
     */
    public LocalizationModel withLanguage(LocalizationModelLanguage language) {
        Utils.checkNotNull(language, "language");
        this.language = JsonNullable.of(language);
        return this;
    }

    /**
     * The language associated with the localization details
     */
    public LocalizationModel withLanguage(JsonNullable<? extends LocalizationModelLanguage> language) {
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
        LocalizationModel other = (LocalizationModel) o;
        return 
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.language, other.language);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            title,
            description,
            language);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LocalizationModel.class,
                "title", title,
                "description", description,
                "language", language);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> title = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<? extends LocalizationModelLanguage> language = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The title of the content
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * The title of the content
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * The description of the content
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * The description of the content
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The language associated with the localization details
         */
        public Builder language(LocalizationModelLanguage language) {
            Utils.checkNotNull(language, "language");
            this.language = JsonNullable.of(language);
            return this;
        }

        /**
         * The language associated with the localization details
         */
        public Builder language(JsonNullable<? extends LocalizationModelLanguage> language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }
        
        public LocalizationModel build() {
            return new LocalizationModel(
                title,
                description,
                language);
        }
    }
}

