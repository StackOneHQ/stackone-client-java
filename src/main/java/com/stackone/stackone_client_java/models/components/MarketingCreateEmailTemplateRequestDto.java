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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class MarketingCreateEmailTemplateRequestDto {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private JsonNullable<? extends List<String>> tags;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("messages")
    private JsonNullable<? extends List<EmailMessages>> messages;

    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    @JsonCreator
    public MarketingCreateEmailTemplateRequestDto(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("tags") JsonNullable<? extends List<String>> tags,
            @JsonProperty("messages") JsonNullable<? extends List<EmailMessages>> messages,
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(messages, "messages");
        Utils.checkNotNull(passthrough, "passthrough");
        this.name = name;
        this.tags = tags;
        this.messages = messages;
        this.passthrough = passthrough;
    }
    
    public MarketingCreateEmailTemplateRequestDto() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<EmailMessages>> messages() {
        return (JsonNullable<List<EmailMessages>>) messages;
    }

    /**
     * Value to pass through to the provider
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> passthrough() {
        return (JsonNullable<Map<String, Object>>) passthrough;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MarketingCreateEmailTemplateRequestDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    public MarketingCreateEmailTemplateRequestDto withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public MarketingCreateEmailTemplateRequestDto withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = JsonNullable.of(tags);
        return this;
    }

    public MarketingCreateEmailTemplateRequestDto withTags(JsonNullable<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public MarketingCreateEmailTemplateRequestDto withMessages(List<EmailMessages> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = JsonNullable.of(messages);
        return this;
    }

    public MarketingCreateEmailTemplateRequestDto withMessages(JsonNullable<? extends List<EmailMessages>> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = messages;
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public MarketingCreateEmailTemplateRequestDto withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public MarketingCreateEmailTemplateRequestDto withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = passthrough;
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
        MarketingCreateEmailTemplateRequestDto other = (MarketingCreateEmailTemplateRequestDto) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.messages, other.messages) &&
            Objects.deepEquals(this.passthrough, other.passthrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            tags,
            messages,
            passthrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingCreateEmailTemplateRequestDto.class,
                "name", name,
                "tags", tags,
                "messages", messages,
                "passthrough", passthrough);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> tags = JsonNullable.undefined();
 
        private JsonNullable<? extends List<EmailMessages>> messages = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> passthrough = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder messages(List<EmailMessages> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = JsonNullable.of(messages);
            return this;
        }

        public Builder messages(JsonNullable<? extends List<EmailMessages>> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = messages;
            return this;
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(Map<String, Object> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = JsonNullable.of(passthrough);
            return this;
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = passthrough;
            return this;
        }
        
        public MarketingCreateEmailTemplateRequestDto build() {
            return new MarketingCreateEmailTemplateRequestDto(
                name,
                tags,
                messages,
                passthrough);
        }
    }
}

