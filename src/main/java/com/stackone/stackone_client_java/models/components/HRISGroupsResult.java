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


public class HRISGroupsResult {

    @JsonProperty("data")
    private HRISGroup data;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private JsonNullable<? extends List<RawResponse>> raw;

    @JsonCreator
    public HRISGroupsResult(
            @JsonProperty("data") HRISGroup data,
            @JsonProperty("raw") JsonNullable<? extends List<RawResponse>> raw) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(raw, "raw");
        this.data = data;
        this.raw = raw;
    }
    
    public HRISGroupsResult(
            HRISGroup data) {
        this(data, JsonNullable.undefined());
    }

    @JsonIgnore
    public HRISGroup data() {
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


    public HRISGroupsResult withData(HRISGroup data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public HRISGroupsResult withRaw(List<RawResponse> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    public HRISGroupsResult withRaw(JsonNullable<? extends List<RawResponse>> raw) {
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
        HRISGroupsResult other = (HRISGroupsResult) o;
        return 
            Utils.enhancedDeepEquals(this.data, other.data) &&
            Utils.enhancedDeepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            data, raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HRISGroupsResult.class,
                "data", data,
                "raw", raw);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private HRISGroup data;

        private JsonNullable<? extends List<RawResponse>> raw = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder data(HRISGroup data) {
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

        public HRISGroupsResult build() {

            return new HRISGroupsResult(
                data, raw);
        }

    }
}
