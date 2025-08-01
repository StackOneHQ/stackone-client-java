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
import org.openapitools.jackson.nullable.JsonNullable;


public class InAppMessagesMessageContent {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("body")
    private JsonNullable<String> body;

    @JsonCreator
    public InAppMessagesMessageContent(
            @JsonProperty("body") JsonNullable<String> body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
    }
    
    public InAppMessagesMessageContent() {
        this(JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<String> body() {
        return body;
    }

    public static Builder builder() {
        return new Builder();
    }


    public InAppMessagesMessageContent withBody(String body) {
        Utils.checkNotNull(body, "body");
        this.body = JsonNullable.of(body);
        return this;
    }

    public InAppMessagesMessageContent withBody(JsonNullable<String> body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
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
        InAppMessagesMessageContent other = (InAppMessagesMessageContent) o;
        return 
            Utils.enhancedDeepEquals(this.body, other.body);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            body);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InAppMessagesMessageContent.class,
                "body", body);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> body = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder body(String body) {
            Utils.checkNotNull(body, "body");
            this.body = JsonNullable.of(body);
            return this;
        }

        public Builder body(JsonNullable<String> body) {
            Utils.checkNotNull(body, "body");
            this.body = body;
            return this;
        }

        public InAppMessagesMessageContent build() {

            return new InAppMessagesMessageContent(
                body);
        }

    }
}
