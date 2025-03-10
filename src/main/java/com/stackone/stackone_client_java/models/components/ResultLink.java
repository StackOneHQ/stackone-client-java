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

public class ResultLink {

    /**
     * The label of the result link.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private JsonNullable<String> label;

    /**
     * The URL of the result link.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<String> url;

    @JsonCreator
    public ResultLink(
            @JsonProperty("label") JsonNullable<String> label,
            @JsonProperty("url") JsonNullable<String> url) {
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(url, "url");
        this.label = label;
        this.url = url;
    }
    
    public ResultLink() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The label of the result link.
     */
    @JsonIgnore
    public JsonNullable<String> label() {
        return label;
    }

    /**
     * The URL of the result link.
     */
    @JsonIgnore
    public JsonNullable<String> url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The label of the result link.
     */
    public ResultLink withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = JsonNullable.of(label);
        return this;
    }

    /**
     * The label of the result link.
     */
    public ResultLink withLabel(JsonNullable<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    /**
     * The URL of the result link.
     */
    public ResultLink withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * The URL of the result link.
     */
    public ResultLink withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        ResultLink other = (ResultLink) o;
        return 
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            label,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResultLink.class,
                "label", label,
                "url", url);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> label = JsonNullable.undefined();
 
        private JsonNullable<String> url = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The label of the result link.
         */
        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = JsonNullable.of(label);
            return this;
        }

        /**
         * The label of the result link.
         */
        public Builder label(JsonNullable<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        /**
         * The URL of the result link.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        /**
         * The URL of the result link.
         */
        public Builder url(JsonNullable<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public ResultLink build() {
            return new ResultLink(
                label,
                url);
        }
    }
}

