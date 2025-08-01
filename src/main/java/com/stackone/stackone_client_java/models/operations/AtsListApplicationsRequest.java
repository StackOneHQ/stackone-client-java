/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class AtsListApplicationsRequest {
    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;

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

    /**
     * ATS Application Filter
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=filter")
    private JsonNullable<? extends AtsListApplicationsQueryParamFilter> filter;

    /**
     * The page number of the results to fetch
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    @Deprecated
    private JsonNullable<String> page;

    /**
     * The number of results per page (default value is 25)
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
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_after")
    @Deprecated
    private JsonNullable<String> updatedAfter;

    /**
     * The sync token to select the only updated results
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sync_token")
    @Deprecated
    private JsonNullable<String> syncToken;

    /**
     * The comma separated list of fields that will be expanded in the response
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=expand")
    private JsonNullable<String> expand;

    /**
     * The comma separated list of fields that will be included in the response
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    private JsonNullable<String> include;

    /**
     * Filter for job ID to retrieve a list of applications related to this job
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=job_id")
    @Deprecated
    private JsonNullable<String> jobId;

    @JsonCreator
    public AtsListApplicationsRequest(
            String xAccountId,
            JsonNullable<Boolean> raw,
            JsonNullable<? extends Map<String, Object>> proxy,
            JsonNullable<String> fields,
            JsonNullable<? extends AtsListApplicationsQueryParamFilter> filter,
            JsonNullable<String> page,
            JsonNullable<String> pageSize,
            JsonNullable<String> next,
            JsonNullable<String> updatedAfter,
            JsonNullable<String> syncToken,
            JsonNullable<String> expand,
            JsonNullable<String> include,
            JsonNullable<String> jobId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(proxy, "proxy");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        Utils.checkNotNull(syncToken, "syncToken");
        Utils.checkNotNull(expand, "expand");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(jobId, "jobId");
        this.xAccountId = xAccountId;
        this.raw = raw;
        this.proxy = proxy;
        this.fields = fields;
        this.filter = filter;
        this.page = page;
        this.pageSize = pageSize;
        this.next = next;
        this.updatedAfter = updatedAfter;
        this.syncToken = syncToken;
        this.expand = expand;
        this.include = include;
        this.jobId = jobId;
    }
    
    public AtsListApplicationsRequest(
            String xAccountId) {
        this(xAccountId, JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined());
    }

    /**
     * The account identifier
     */
    @JsonIgnore
    public String xAccountId() {
        return xAccountId;
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

    /**
     * ATS Application Filter
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsListApplicationsQueryParamFilter> filter() {
        return (JsonNullable<AtsListApplicationsQueryParamFilter>) filter;
    }

    /**
     * The page number of the results to fetch
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> page() {
        return page;
    }

    /**
     * The number of results per page (default value is 25)
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
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> updatedAfter() {
        return updatedAfter;
    }

    /**
     * The sync token to select the only updated results
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> syncToken() {
        return syncToken;
    }

    /**
     * The comma separated list of fields that will be expanded in the response
     */
    @JsonIgnore
    public JsonNullable<String> expand() {
        return expand;
    }

    /**
     * The comma separated list of fields that will be included in the response
     */
    @JsonIgnore
    public JsonNullable<String> include() {
        return include;
    }

    /**
     * Filter for job ID to retrieve a list of applications related to this job
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> jobId() {
        return jobId;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The account identifier
     */
    public AtsListApplicationsRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    /**
     * Indicates that the raw request result should be returned in addition to the mapped result (default value is false)
     */
    public AtsListApplicationsRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    /**
     * Indicates that the raw request result should be returned in addition to the mapped result (default value is false)
     */
    public AtsListApplicationsRequest withRaw(JsonNullable<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    public AtsListApplicationsRequest withProxy(Map<String, Object> proxy) {
        Utils.checkNotNull(proxy, "proxy");
        this.proxy = JsonNullable.of(proxy);
        return this;
    }

    /**
     * Query parameters that can be used to pass through parameters to the underlying provider request by surrounding them with 'proxy' key
     */
    public AtsListApplicationsRequest withProxy(JsonNullable<? extends Map<String, Object>> proxy) {
        Utils.checkNotNull(proxy, "proxy");
        this.proxy = proxy;
        return this;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    public AtsListApplicationsRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The comma separated list of fields that will be returned in the response (if empty, all fields are returned)
     */
    public AtsListApplicationsRequest withFields(JsonNullable<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ATS Application Filter
     */
    public AtsListApplicationsRequest withFilter(AtsListApplicationsQueryParamFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = JsonNullable.of(filter);
        return this;
    }

    /**
     * ATS Application Filter
     */
    public AtsListApplicationsRequest withFilter(JsonNullable<? extends AtsListApplicationsQueryParamFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * The page number of the results to fetch
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListApplicationsRequest withPage(String page) {
        Utils.checkNotNull(page, "page");
        this.page = JsonNullable.of(page);
        return this;
    }

    /**
     * The page number of the results to fetch
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListApplicationsRequest withPage(JsonNullable<String> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * The number of results per page (default value is 25)
     */
    public AtsListApplicationsRequest withPageSize(String pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = JsonNullable.of(pageSize);
        return this;
    }

    /**
     * The number of results per page (default value is 25)
     */
    public AtsListApplicationsRequest withPageSize(JsonNullable<String> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The unified cursor
     */
    public AtsListApplicationsRequest withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = JsonNullable.of(next);
        return this;
    }

    /**
     * The unified cursor
     */
    public AtsListApplicationsRequest withNext(JsonNullable<String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListApplicationsRequest withUpdatedAfter(String updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = JsonNullable.of(updatedAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListApplicationsRequest withUpdatedAfter(JsonNullable<String> updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = updatedAfter;
        return this;
    }

    /**
     * The sync token to select the only updated results
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListApplicationsRequest withSyncToken(String syncToken) {
        Utils.checkNotNull(syncToken, "syncToken");
        this.syncToken = JsonNullable.of(syncToken);
        return this;
    }

    /**
     * The sync token to select the only updated results
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListApplicationsRequest withSyncToken(JsonNullable<String> syncToken) {
        Utils.checkNotNull(syncToken, "syncToken");
        this.syncToken = syncToken;
        return this;
    }

    /**
     * The comma separated list of fields that will be expanded in the response
     */
    public AtsListApplicationsRequest withExpand(String expand) {
        Utils.checkNotNull(expand, "expand");
        this.expand = JsonNullable.of(expand);
        return this;
    }

    /**
     * The comma separated list of fields that will be expanded in the response
     */
    public AtsListApplicationsRequest withExpand(JsonNullable<String> expand) {
        Utils.checkNotNull(expand, "expand");
        this.expand = expand;
        return this;
    }

    /**
     * The comma separated list of fields that will be included in the response
     */
    public AtsListApplicationsRequest withInclude(String include) {
        Utils.checkNotNull(include, "include");
        this.include = JsonNullable.of(include);
        return this;
    }

    /**
     * The comma separated list of fields that will be included in the response
     */
    public AtsListApplicationsRequest withInclude(JsonNullable<String> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * Filter for job ID to retrieve a list of applications related to this job
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListApplicationsRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = JsonNullable.of(jobId);
        return this;
    }

    /**
     * Filter for job ID to retrieve a list of applications related to this job
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsListApplicationsRequest withJobId(JsonNullable<String> jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
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
        AtsListApplicationsRequest other = (AtsListApplicationsRequest) o;
        return 
            Utils.enhancedDeepEquals(this.xAccountId, other.xAccountId) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.proxy, other.proxy) &&
            Utils.enhancedDeepEquals(this.fields, other.fields) &&
            Utils.enhancedDeepEquals(this.filter, other.filter) &&
            Utils.enhancedDeepEquals(this.page, other.page) &&
            Utils.enhancedDeepEquals(this.pageSize, other.pageSize) &&
            Utils.enhancedDeepEquals(this.next, other.next) &&
            Utils.enhancedDeepEquals(this.updatedAfter, other.updatedAfter) &&
            Utils.enhancedDeepEquals(this.syncToken, other.syncToken) &&
            Utils.enhancedDeepEquals(this.expand, other.expand) &&
            Utils.enhancedDeepEquals(this.include, other.include) &&
            Utils.enhancedDeepEquals(this.jobId, other.jobId);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            xAccountId, raw, proxy,
            fields, filter, page,
            pageSize, next, updatedAfter,
            syncToken, expand, include,
            jobId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsListApplicationsRequest.class,
                "xAccountId", xAccountId,
                "raw", raw,
                "proxy", proxy,
                "fields", fields,
                "filter", filter,
                "page", page,
                "pageSize", pageSize,
                "next", next,
                "updatedAfter", updatedAfter,
                "syncToken", syncToken,
                "expand", expand,
                "include", include,
                "jobId", jobId);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String xAccountId;

        private JsonNullable<Boolean> raw = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> proxy = JsonNullable.undefined();

        private JsonNullable<String> fields = JsonNullable.undefined();

        private JsonNullable<? extends AtsListApplicationsQueryParamFilter> filter = JsonNullable.undefined();

        @Deprecated
        private JsonNullable<String> page = JsonNullable.undefined();

        private JsonNullable<String> pageSize = JsonNullable.undefined();

        private JsonNullable<String> next = JsonNullable.undefined();

        @Deprecated
        private JsonNullable<String> updatedAfter = JsonNullable.undefined();

        @Deprecated
        private JsonNullable<String> syncToken = JsonNullable.undefined();

        private JsonNullable<String> expand = JsonNullable.undefined();

        private JsonNullable<String> include = JsonNullable.undefined();

        @Deprecated
        private JsonNullable<String> jobId = JsonNullable.undefined();

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


        /**
         * ATS Application Filter
         */
        public Builder filter(AtsListApplicationsQueryParamFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = JsonNullable.of(filter);
            return this;
        }

        /**
         * ATS Application Filter
         */
        public Builder filter(JsonNullable<? extends AtsListApplicationsQueryParamFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }


        /**
         * The page number of the results to fetch
         * 
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
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder page(JsonNullable<String> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }


        /**
         * The number of results per page (default value is 25)
         */
        public Builder pageSize(String pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = JsonNullable.of(pageSize);
            return this;
        }

        /**
         * The number of results per page (default value is 25)
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
         * 
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
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder updatedAfter(JsonNullable<String> updatedAfter) {
            Utils.checkNotNull(updatedAfter, "updatedAfter");
            this.updatedAfter = updatedAfter;
            return this;
        }


        /**
         * The sync token to select the only updated results
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder syncToken(String syncToken) {
            Utils.checkNotNull(syncToken, "syncToken");
            this.syncToken = JsonNullable.of(syncToken);
            return this;
        }

        /**
         * The sync token to select the only updated results
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder syncToken(JsonNullable<String> syncToken) {
            Utils.checkNotNull(syncToken, "syncToken");
            this.syncToken = syncToken;
            return this;
        }


        /**
         * The comma separated list of fields that will be expanded in the response
         */
        public Builder expand(String expand) {
            Utils.checkNotNull(expand, "expand");
            this.expand = JsonNullable.of(expand);
            return this;
        }

        /**
         * The comma separated list of fields that will be expanded in the response
         */
        public Builder expand(JsonNullable<String> expand) {
            Utils.checkNotNull(expand, "expand");
            this.expand = expand;
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


        /**
         * Filter for job ID to retrieve a list of applications related to this job
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = JsonNullable.of(jobId);
            return this;
        }

        /**
         * Filter for job ID to retrieve a list of applications related to this job
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder jobId(JsonNullable<String> jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }

        public AtsListApplicationsRequest build() {

            return new AtsListApplicationsRequest(
                xAccountId, raw, proxy,
                fields, filter, page,
                pageSize, next, updatedAfter,
                syncToken, expand, include,
                jobId);
        }

    }
}
