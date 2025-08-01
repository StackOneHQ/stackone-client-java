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
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;


public class UsersPaginated {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private JsonNullable<String> next;


    @JsonProperty("data")
    private List<LmsUser> data;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private JsonNullable<? extends List<RawResponse>> raw;

    @JsonCreator
    public UsersPaginated(
            @JsonProperty("next") JsonNullable<String> next,
            @JsonProperty("data") List<LmsUser> data,
            @JsonProperty("raw") JsonNullable<? extends List<RawResponse>> raw) {
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(raw, "raw");
        this.next = next;
        this.data = data;
        this.raw = raw;
    }
    
    public UsersPaginated(
            List<LmsUser> data) {
        this(JsonNullable.undefined(), data, JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<String> next() {
        return next;
    }

    @JsonIgnore
    public List<LmsUser> data() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<RawResponse>> raw() {
        return (JsonNullable<List<RawResponse>>) raw;
    }

    public static Builder builder() {
        return new Builder();
    }


    public UsersPaginated withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = JsonNullable.of(next);
        return this;
    }

    public UsersPaginated withNext(JsonNullable<String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public UsersPaginated withData(List<LmsUser> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public UsersPaginated withRaw(List<RawResponse> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    public UsersPaginated withRaw(JsonNullable<? extends List<RawResponse>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
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
        UsersPaginated other = (UsersPaginated) o;
        return 
            Utils.enhancedDeepEquals(this.next, other.next) &&
            Utils.enhancedDeepEquals(this.data, other.data) &&
            Utils.enhancedDeepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            next, data, raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsersPaginated.class,
                "next", next,
                "data", data,
                "raw", raw);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> next = JsonNullable.undefined();

        private List<LmsUser> data;

        private JsonNullable<? extends List<RawResponse>> raw = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = JsonNullable.of(next);
            return this;
        }

        public Builder next(JsonNullable<String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }


        public Builder data(List<LmsUser> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }


        public Builder raw(List<RawResponse> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = JsonNullable.of(raw);
            return this;
        }

        public Builder raw(JsonNullable<? extends List<RawResponse>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public UsersPaginated build() {

            return new UsersPaginated(
                next, data, raw);
        }

    }
}
