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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class HRISLocationResult {

    @JsonProperty("data")
    private HRISLocation data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private JsonNullable<? extends List<RawResponse>> raw;

    @JsonCreator
    public HRISLocationResult(
            @JsonProperty("data") HRISLocation data,
            @JsonProperty("raw") JsonNullable<? extends List<RawResponse>> raw) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(raw, "raw");
        this.data = data;
        this.raw = raw;
    }
    
    public HRISLocationResult(
            HRISLocation data) {
        this(data, JsonNullable.undefined());
    }

    @JsonIgnore
    public HRISLocation data() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<RawResponse>> raw() {
        return (JsonNullable<List<RawResponse>>) raw;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HRISLocationResult withData(HRISLocation data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public HRISLocationResult withRaw(List<RawResponse> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    public HRISLocationResult withRaw(JsonNullable<? extends List<RawResponse>> raw) {
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
        HRISLocationResult other = (HRISLocationResult) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HRISLocationResult.class,
                "data", data,
                "raw", raw);
    }
    
    public final static class Builder {
 
        private HRISLocation data;
 
        private JsonNullable<? extends List<RawResponse>> raw = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(HRISLocation data) {
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
        
        public HRISLocationResult build() {
            return new HRISLocationResult(
                data,
                raw);
        }
    }
}

