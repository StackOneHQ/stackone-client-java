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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * HrisUpdateEmployeeRequestDtoAvatar - The employee avatar
 */

public class HrisUpdateEmployeeRequestDtoAvatar {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<String> url;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("base64")
    private JsonNullable<String> base64;

    @JsonCreator
    public HrisUpdateEmployeeRequestDtoAvatar(
            @JsonProperty("url") JsonNullable<String> url,
            @JsonProperty("base64") JsonNullable<String> base64) {
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(base64, "base64");
        this.url = url;
        this.base64 = base64;
    }
    
    public HrisUpdateEmployeeRequestDtoAvatar() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<String> url() {
        return url;
    }

    @JsonIgnore
    public JsonNullable<String> base64() {
        return base64;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HrisUpdateEmployeeRequestDtoAvatar withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoAvatar withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    public HrisUpdateEmployeeRequestDtoAvatar withBase64(String base64) {
        Utils.checkNotNull(base64, "base64");
        this.base64 = JsonNullable.of(base64);
        return this;
    }

    public HrisUpdateEmployeeRequestDtoAvatar withBase64(JsonNullable<String> base64) {
        Utils.checkNotNull(base64, "base64");
        this.base64 = base64;
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
        HrisUpdateEmployeeRequestDtoAvatar other = (HrisUpdateEmployeeRequestDtoAvatar) o;
        return 
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.base64, other.base64);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            url,
            base64);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisUpdateEmployeeRequestDtoAvatar.class,
                "url", url,
                "base64", base64);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> url = JsonNullable.undefined();
 
        private JsonNullable<String> base64 = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        public Builder url(JsonNullable<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        public Builder base64(String base64) {
            Utils.checkNotNull(base64, "base64");
            this.base64 = JsonNullable.of(base64);
            return this;
        }

        public Builder base64(JsonNullable<String> base64) {
            Utils.checkNotNull(base64, "base64");
            this.base64 = base64;
            return this;
        }
        
        public HrisUpdateEmployeeRequestDtoAvatar build() {
            return new HrisUpdateEmployeeRequestDtoAvatar(
                url,
                base64);
        }
    }
}

