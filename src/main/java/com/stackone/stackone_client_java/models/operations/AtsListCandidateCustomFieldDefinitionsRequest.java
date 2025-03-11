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
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class AtsListCandidateCustomFieldDefinitionsRequest {

    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;

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
     * Filter parameters that allow greater customisation of the list response
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=filter")
    private JsonNullable<? extends AtsListCandidateCustomFieldDefinitionsQueryParamFilter> filter;

    /**
     * The page number of the results to fetch
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    @Deprecated
    private JsonNullable<String> page;

    /**
     * The number of results per page
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_size")
    private JsonNullable<String> pageSize;

    /**
     * The unified cursor
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=next")
    private JsonNullable<String> next;

    /**
     * Use a string with a date to only select results updated after that given date
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_after")
    @Deprecated
    private JsonNullable<String> updatedAfter;

    @JsonCreator
    public AtsListCandidateCustomFieldDefinitionsRequest(
            String xAccountId,
            JsonNullable<Boolean> raw,
            JsonNullable<? extends Map<String, Object>> proxy,
            JsonNullable<String> fields,
            JsonNullable<? extends AtsListCandidateCustomFieldDefinitionsQueryParamFilter> filter,
            JsonNullable<String> page,
            JsonNullable<String> pageSize,
            JsonNullable<String> next,
            JsonNullable<String> updatedAfter) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(proxy, "proxy");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.xAccountId = xAccountId;
        this.raw = raw;
        this.proxy = proxy;
        this.fields = fields;
        this.filter = filter;
        this.page = page;
        this.pageSize = pageSize;
        this.next = next;
        this.updatedAfter = updatedAfter;
    }
    
    public AtsListCandidateCustomFieldDefinitionsRequest(
            String xAccountId) {
        this(xAccountId, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The account identifier
     */
    @JsonIgnore
    public String xAccountId() {
        return xAccountId;
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
     * Filter parameters that allow greater customisation of the list response
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsListCandidateCustomFieldDefinitionsQueryParamFilter> filter() {
        return (JsonNullable<AtsListCandidateCustomFieldDefinitionsQueryParamFilter>) filter;
    }

    /**
     * The page number of the results to fetch
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> page() {
        return page;
    }

    /**
     * The number of results per page
     */
    @JsonIgnore
    public JsonNullable<String> pageSize() {
        return pageSize;
    }

    /**
     * The unified cursor
     */
    @JsonIgnore
    public JsonNullable<String> next() {
        return next;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> updatedAfter() {
        return updatedAfter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account identifier
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    /**
     * Indicates that the raw request result is returned
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    /**
     * Indicates that the raw request result is returned
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withRaw(JsonNullable<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withProxy(Map<String, Object> proxy) {
        Utils.checkNotNull(proxy, "proxy");
        this.proxy = JsonNullable.of(proxy);
        return this;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withProxy(JsonNullable<? extends Map<String, Object>> proxy) {
        Utils.checkNotNull(proxy, "proxy");
        this.proxy = proxy;
        return this;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withFields(JsonNullable<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Filter parameters that allow greater customisation of the list response
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withFilter(AtsListCandidateCustomFieldDefinitionsQueryParamFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = JsonNullable.of(filter);
        return this;
    }

    /**
     * Filter parameters that allow greater customisation of the list response
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withFilter(JsonNullable<? extends AtsListCandidateCustomFieldDefinitionsQueryParamFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * The page number of the results to fetch
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListCandidateCustomFieldDefinitionsRequest withPage(String page) {
        Utils.checkNotNull(page, "page");
        this.page = JsonNullable.of(page);
        return this;
    }

    /**
     * The page number of the results to fetch
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListCandidateCustomFieldDefinitionsRequest withPage(JsonNullable<String> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * The number of results per page
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withPageSize(String pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = JsonNullable.of(pageSize);
        return this;
    }

    /**
     * The number of results per page
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withPageSize(JsonNullable<String> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The unified cursor
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = JsonNullable.of(next);
        return this;
    }

    /**
     * The unified cursor
     */
    public AtsListCandidateCustomFieldDefinitionsRequest withNext(JsonNullable<String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListCandidateCustomFieldDefinitionsRequest withUpdatedAfter(String updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = JsonNullable.of(updatedAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListCandidateCustomFieldDefinitionsRequest withUpdatedAfter(JsonNullable<String> updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = updatedAfter;
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
        AtsListCandidateCustomFieldDefinitionsRequest other = (AtsListCandidateCustomFieldDefinitionsRequest) o;
        return 
            Objects.deepEquals(this.xAccountId, other.xAccountId) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.proxy, other.proxy) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.next, other.next) &&
            Objects.deepEquals(this.updatedAfter, other.updatedAfter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xAccountId,
            raw,
            proxy,
            fields,
            filter,
            page,
            pageSize,
            next,
            updatedAfter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsListCandidateCustomFieldDefinitionsRequest.class,
                "xAccountId", xAccountId,
                "raw", raw,
                "proxy", proxy,
                "fields", fields,
                "filter", filter,
                "page", page,
                "pageSize", pageSize,
                "next", next,
                "updatedAfter", updatedAfter);
    }
    
    public final static class Builder {
 
        private String xAccountId;
 
        private JsonNullable<Boolean> raw;
 
        private JsonNullable<? extends Map<String, Object>> proxy = JsonNullable.undefined();
 
        private JsonNullable<String> fields = JsonNullable.undefined();
 
        private JsonNullable<? extends AtsListCandidateCustomFieldDefinitionsQueryParamFilter> filter = JsonNullable.undefined();
 
        @Deprecated
        private JsonNullable<String> page = JsonNullable.undefined();
 
        private JsonNullable<String> pageSize;
 
        private JsonNullable<String> next = JsonNullable.undefined();
 
        @Deprecated
        private JsonNullable<String> updatedAfter = JsonNullable.undefined();  
        
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
         * Filter parameters that allow greater customisation of the list response
         */
        public Builder filter(AtsListCandidateCustomFieldDefinitionsQueryParamFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = JsonNullable.of(filter);
            return this;
        }

        /**
         * Filter parameters that allow greater customisation of the list response
         */
        public Builder filter(JsonNullable<? extends AtsListCandidateCustomFieldDefinitionsQueryParamFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * The page number of the results to fetch
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder page(String page) {
            Utils.checkNotNull(page, "page");
            this.page = JsonNullable.of(page);
            return this;
        }

        /**
         * The page number of the results to fetch
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder page(JsonNullable<String> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * The number of results per page
         */
        public Builder pageSize(String pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = JsonNullable.of(pageSize);
            return this;
        }

        /**
         * The number of results per page
         */
        public Builder pageSize(JsonNullable<String> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The unified cursor
         */
        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = JsonNullable.of(next);
            return this;
        }

        /**
         * The unified cursor
         */
        public Builder next(JsonNullable<String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        /**
         * Use a string with a date to only select results updated after that given date
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder updatedAfter(String updatedAfter) {
            Utils.checkNotNull(updatedAfter, "updatedAfter");
            this.updatedAfter = JsonNullable.of(updatedAfter);
            return this;
        }

        /**
         * Use a string with a date to only select results updated after that given date
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder updatedAfter(JsonNullable<String> updatedAfter) {
            Utils.checkNotNull(updatedAfter, "updatedAfter");
            this.updatedAfter = updatedAfter;
            return this;
        }
        
        public AtsListCandidateCustomFieldDefinitionsRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }            return new AtsListCandidateCustomFieldDefinitionsRequest(
                xAccountId,
                raw,
                proxy,
                fields,
                filter,
                page,
                pageSize,
                next,
                updatedAfter);
        }

        private static final LazySingletonValue<JsonNullable<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<JsonNullable<Boolean>>() {});

        private static final LazySingletonValue<JsonNullable<String>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "page_size",
                        "\"25\"",
                        new TypeReference<JsonNullable<String>>() {});
    }
}

