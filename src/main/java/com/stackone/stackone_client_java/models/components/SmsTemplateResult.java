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

public class SmsTemplateResult {

    @JsonProperty("data")
    private SmsTemplate data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private JsonNullable<? extends List<RawResponse>> raw;

    @JsonCreator
    public SmsTemplateResult(
            @JsonProperty("data") SmsTemplate data,
            @JsonProperty("raw") JsonNullable<? extends List<RawResponse>> raw) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(raw, "raw");
        this.data = data;
        this.raw = raw;
    }
    
    public SmsTemplateResult(
            SmsTemplate data) {
        this(data, JsonNullable.undefined());
    }

    @JsonIgnore
    public SmsTemplate data() {
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

    public SmsTemplateResult withData(SmsTemplate data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public SmsTemplateResult withRaw(List<RawResponse> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    public SmsTemplateResult withRaw(JsonNullable<? extends List<RawResponse>> raw) {
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
        SmsTemplateResult other = (SmsTemplateResult) o;
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
        return Utils.toString(SmsTemplateResult.class,
                "data", data,
                "raw", raw);
    }
    
    public final static class Builder {
 
        private SmsTemplate data;
 
        private JsonNullable<? extends List<RawResponse>> raw = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(SmsTemplate data) {
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
        
        public SmsTemplateResult build() {
            return new SmsTemplateResult(
                data,
                raw);
        }
    }
}

