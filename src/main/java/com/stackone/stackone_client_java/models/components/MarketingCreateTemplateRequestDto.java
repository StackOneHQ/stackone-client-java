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
import org.openapitools.jackson.nullable.JsonNullable;


public class MarketingCreateTemplateRequestDto {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("messages")
    private JsonNullable<? extends List<CreateMessage>> messages;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private JsonNullable<? extends List<String>> tags;

    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    @JsonCreator
    public MarketingCreateTemplateRequestDto(
            @JsonProperty("messages") JsonNullable<? extends List<CreateMessage>> messages,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("tags") JsonNullable<? extends List<String>> tags,
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(messages, "messages");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(passthrough, "passthrough");
        this.messages = messages;
        this.name = name;
        this.tags = tags;
        this.passthrough = passthrough;
    }
    
    public MarketingCreateTemplateRequestDto() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<CreateMessage>> messages() {
        return (JsonNullable<List<CreateMessage>>) messages;
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
     * Value to pass through to the provider
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> passthrough() {
        return (JsonNullable<Map<String, Object>>) passthrough;
    }

    public static Builder builder() {
        return new Builder();
    }


    public MarketingCreateTemplateRequestDto withMessages(List<CreateMessage> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = JsonNullable.of(messages);
        return this;
    }

    public MarketingCreateTemplateRequestDto withMessages(JsonNullable<? extends List<CreateMessage>> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = messages;
        return this;
    }

    public MarketingCreateTemplateRequestDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    public MarketingCreateTemplateRequestDto withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public MarketingCreateTemplateRequestDto withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = JsonNullable.of(tags);
        return this;
    }

    public MarketingCreateTemplateRequestDto withTags(JsonNullable<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public MarketingCreateTemplateRequestDto withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public MarketingCreateTemplateRequestDto withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
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
        MarketingCreateTemplateRequestDto other = (MarketingCreateTemplateRequestDto) o;
        return 
            Utils.enhancedDeepEquals(this.messages, other.messages) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.tags, other.tags) &&
            Utils.enhancedDeepEquals(this.passthrough, other.passthrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            messages, name, tags,
            passthrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingCreateTemplateRequestDto.class,
                "messages", messages,
                "name", name,
                "tags", tags,
                "passthrough", passthrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends List<CreateMessage>> messages = JsonNullable.undefined();

        private JsonNullable<String> name = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> tags = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> passthrough = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder messages(List<CreateMessage> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = JsonNullable.of(messages);
            return this;
        }

        public Builder messages(JsonNullable<? extends List<CreateMessage>> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = messages;
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

        public MarketingCreateTemplateRequestDto build() {

            return new MarketingCreateTemplateRequestDto(
                messages, name, tags,
                passthrough);
        }

    }
}
