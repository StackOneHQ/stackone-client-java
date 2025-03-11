/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.stackone.stackone_client_java.utils.LazySingletonValue;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class AtsGetJobPostingRequest {

    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * Indicates that the raw request result is returned
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private JsonNullable<Boolean> raw;

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=proxy")
    private JsonNullable<? extends Map<String, Object>> proxy;

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private JsonNullable<String> fields;

    /**
     * The comma separated list of fields that will be included in the response
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    private JsonNullable<String> include;

    @JsonCreator
    public AtsGetJobPostingRequest(
            String xAccountId,
            String id,
            JsonNullable<Boolean> raw,
            JsonNullable<? extends Map<String, Object>> proxy,
            JsonNullable<String> fields,
            JsonNullable<String> include) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(proxy, "proxy");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(include, "include");
        this.xAccountId = xAccountId;
        this.id = id;
        this.raw = raw;
        this.proxy = proxy;
        this.fields = fields;
        this.include = include;
    }
    
    public AtsGetJobPostingRequest(
            String xAccountId,
            String id) {
        this(xAccountId, id, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The account identifier
     */
    @JsonIgnore
    public String xAccountId() {
        return xAccountId;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * Indicates that the raw request result is returned
     */
    @JsonIgnore
    public JsonNullable<Boolean> raw() {
        return raw;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> proxy() {
        return (JsonNullable<Map<String, Object>>) proxy;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    @JsonIgnore
    public JsonNullable<String> fields() {
        return fields;
    }

    /**
     * The comma separated list of fields that will be included in the response
     */
    @JsonIgnore
    public JsonNullable<String> include() {
        return include;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account identifier
     */
    public AtsGetJobPostingRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsGetJobPostingRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Indicates that the raw request result is returned
     */
    public AtsGetJobPostingRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    /**
     * Indicates that the raw request result is returned
     */
    public AtsGetJobPostingRequest withRaw(JsonNullable<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    public AtsGetJobPostingRequest withProxy(Map<String, Object> proxy) {
        Utils.checkNotNull(proxy, "proxy");
        this.proxy = JsonNullable.of(proxy);
        return this;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    public AtsGetJobPostingRequest withProxy(JsonNullable<? extends Map<String, Object>> proxy) {
        Utils.checkNotNull(proxy, "proxy");
        this.proxy = proxy;
        return this;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    public AtsGetJobPostingRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    public AtsGetJobPostingRequest withFields(JsonNullable<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * The comma separated list of fields that will be included in the response
     */
    public AtsGetJobPostingRequest withInclude(String include) {
        Utils.checkNotNull(include, "include");
        this.include = JsonNullable.of(include);
        return this;
    }

    /**
     * The comma separated list of fields that will be included in the response
     */
    public AtsGetJobPostingRequest withInclude(JsonNullable<String> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
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
        AtsGetJobPostingRequest other = (AtsGetJobPostingRequest) o;
        return 
            Objects.deepEquals(this.xAccountId, other.xAccountId) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.proxy, other.proxy) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.include, other.include);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xAccountId,
            id,
            raw,
            proxy,
            fields,
            include);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsGetJobPostingRequest.class,
                "xAccountId", xAccountId,
                "id", id,
                "raw", raw,
                "proxy", proxy,
                "fields", fields,
                "include", include);
    }
    
    public final static class Builder {
 
        private String xAccountId;
 
        private String id;
 
        private JsonNullable<Boolean> raw;
 
        private JsonNullable<? extends Map<String, Object>> proxy = JsonNullable.undefined();
 
        private JsonNullable<String> fields = JsonNullable.undefined();
 
        private JsonNullable<String> include = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The account identifier
         */
        public Builder xAccountId(String xAccountId) {
            Utils.checkNotNull(xAccountId, "xAccountId");
            this.xAccountId = xAccountId;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Indicates that the raw request result is returned
         */
        public Builder raw(boolean raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = JsonNullable.of(raw);
            return this;
        }

        /**
         * Indicates that the raw request result is returned
         */
        public Builder raw(JsonNullable<Boolean> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        /**
         * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
         */
        public Builder proxy(Map<String, Object> proxy) {
            Utils.checkNotNull(proxy, "proxy");
            this.proxy = JsonNullable.of(proxy);
            return this;
        }

        /**
         * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
         */
        public Builder proxy(JsonNullable<? extends Map<String, Object>> proxy) {
            Utils.checkNotNull(proxy, "proxy");
            this.proxy = proxy;
            return this;
        }

        /**
         * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
         */
        public Builder fields(String fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = JsonNullable.of(fields);
            return this;
        }

        /**
         * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
         */
        public Builder fields(JsonNullable<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }

        /**
         * The comma separated list of fields that will be included in the response
         */
        public Builder include(String include) {
            Utils.checkNotNull(include, "include");
            this.include = JsonNullable.of(include);
            return this;
        }

        /**
         * The comma separated list of fields that will be included in the response
         */
        public Builder include(JsonNullable<String> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
            return this;
        }
        
        public AtsGetJobPostingRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }            return new AtsGetJobPostingRequest(
                xAccountId,
                id,
                raw,
                proxy,
                fields,
                include);
        }

        private static final LazySingletonValue<JsonNullable<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<JsonNullable<Boolean>>() {});
    }
}

