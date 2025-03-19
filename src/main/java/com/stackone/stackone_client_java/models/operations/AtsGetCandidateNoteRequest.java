/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class AtsGetCandidateNoteRequest {

    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subResourceId")
    private String subResourceId;

    /**
     * Indicates that the raw request result should be returned in addition to the mapped result (default value is false)
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

    @JsonCreator
    public AtsGetCandidateNoteRequest(
            String xAccountId,
            String id,
            String subResourceId,
            JsonNullable<Boolean> raw,
            JsonNullable<? extends Map<String, Object>> proxy,
            JsonNullable<String> fields) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(subResourceId, "subResourceId");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(proxy, "proxy");
        Utils.checkNotNull(fields, "fields");
        this.xAccountId = xAccountId;
        this.id = id;
        this.subResourceId = subResourceId;
        this.raw = raw;
        this.proxy = proxy;
        this.fields = fields;
    }
    
    public AtsGetCandidateNoteRequest(
            String xAccountId,
            String id,
            String subResourceId) {
        this(xAccountId, id, subResourceId, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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

    @JsonIgnore
    public String subResourceId() {
        return subResourceId;
    }

    /**
     * Indicates that the raw request result should be returned in addition to the mapped result (default value is false)
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account identifier
     */
    public AtsGetCandidateNoteRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsGetCandidateNoteRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsGetCandidateNoteRequest withSubResourceId(String subResourceId) {
        Utils.checkNotNull(subResourceId, "subResourceId");
        this.subResourceId = subResourceId;
        return this;
    }

    /**
     * Indicates that the raw request result should be returned in addition to the mapped result (default value is false)
     */
    public AtsGetCandidateNoteRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    /**
     * Indicates that the raw request result should be returned in addition to the mapped result (default value is false)
     */
    public AtsGetCandidateNoteRequest withRaw(JsonNullable<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    public AtsGetCandidateNoteRequest withProxy(Map<String, Object> proxy) {
        Utils.checkNotNull(proxy, "proxy");
        this.proxy = JsonNullable.of(proxy);
        return this;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    public AtsGetCandidateNoteRequest withProxy(JsonNullable<? extends Map<String, Object>> proxy) {
        Utils.checkNotNull(proxy, "proxy");
        this.proxy = proxy;
        return this;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    public AtsGetCandidateNoteRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    public AtsGetCandidateNoteRequest withFields(JsonNullable<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
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
        AtsGetCandidateNoteRequest other = (AtsGetCandidateNoteRequest) o;
        return 
            Objects.deepEquals(this.xAccountId, other.xAccountId) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.subResourceId, other.subResourceId) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.proxy, other.proxy) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xAccountId,
            id,
            subResourceId,
            raw,
            proxy,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsGetCandidateNoteRequest.class,
                "xAccountId", xAccountId,
                "id", id,
                "subResourceId", subResourceId,
                "raw", raw,
                "proxy", proxy,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private String xAccountId;
 
        private String id;
 
        private String subResourceId;
 
        private JsonNullable<Boolean> raw = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> proxy = JsonNullable.undefined();
 
        private JsonNullable<String> fields = JsonNullable.undefined();  
        
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

        public Builder subResourceId(String subResourceId) {
            Utils.checkNotNull(subResourceId, "subResourceId");
            this.subResourceId = subResourceId;
            return this;
        }

        /**
         * Indicates that the raw request result should be returned in addition to the mapped result (default value is false)
         */
        public Builder raw(boolean raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = JsonNullable.of(raw);
            return this;
        }

        /**
         * Indicates that the raw request result should be returned in addition to the mapped result (default value is false)
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
        
        public AtsGetCandidateNoteRequest build() {
            return new AtsGetCandidateNoteRequest(
                xAccountId,
                id,
                subResourceId,
                raw,
                proxy,
                fields);
        }
    }
}

