/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.CustomFieldDefinitionsPaginated;
import com.stackone.stackone_client_java.utils.Response;
import com.stackone.stackone_client_java.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class CrmListContactCustomFieldDefinitionsResponse implements Response {
    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * The list of contacts custom field definitions was retrieved.
     */
    private Optional<? extends CustomFieldDefinitionsPaginated> customFieldDefinitionsPaginated;


    private Map<String, List<String>> headers;

    @JsonCreator
    public CrmListContactCustomFieldDefinitionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CustomFieldDefinitionsPaginated> customFieldDefinitionsPaginated,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(customFieldDefinitionsPaginated, "customFieldDefinitionsPaginated");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.customFieldDefinitionsPaginated = customFieldDefinitionsPaginated;
        this.headers = headers;
    }
    
    public CrmListContactCustomFieldDefinitionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse,
            Optional.empty(), headers);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * The list of contacts custom field definitions was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CustomFieldDefinitionsPaginated> customFieldDefinitionsPaginated() {
        return (Optional<CustomFieldDefinitionsPaginated>) customFieldDefinitionsPaginated;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * HTTP response content type for this operation
     */
    public CrmListContactCustomFieldDefinitionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CrmListContactCustomFieldDefinitionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CrmListContactCustomFieldDefinitionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The list of contacts custom field definitions was retrieved.
     */
    public CrmListContactCustomFieldDefinitionsResponse withCustomFieldDefinitionsPaginated(CustomFieldDefinitionsPaginated customFieldDefinitionsPaginated) {
        Utils.checkNotNull(customFieldDefinitionsPaginated, "customFieldDefinitionsPaginated");
        this.customFieldDefinitionsPaginated = Optional.ofNullable(customFieldDefinitionsPaginated);
        return this;
    }


    /**
     * The list of contacts custom field definitions was retrieved.
     */
    public CrmListContactCustomFieldDefinitionsResponse withCustomFieldDefinitionsPaginated(Optional<? extends CustomFieldDefinitionsPaginated> customFieldDefinitionsPaginated) {
        Utils.checkNotNull(customFieldDefinitionsPaginated, "customFieldDefinitionsPaginated");
        this.customFieldDefinitionsPaginated = customFieldDefinitionsPaginated;
        return this;
    }

    public CrmListContactCustomFieldDefinitionsResponse withHeaders(Map<String, List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
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
        CrmListContactCustomFieldDefinitionsResponse other = (CrmListContactCustomFieldDefinitionsResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.customFieldDefinitionsPaginated, other.customFieldDefinitionsPaginated) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            customFieldDefinitionsPaginated, headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmListContactCustomFieldDefinitionsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "customFieldDefinitionsPaginated", customFieldDefinitionsPaginated,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends CustomFieldDefinitionsPaginated> customFieldDefinitionsPaginated = Optional.empty();

        private Map<String, List<String>> headers;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }


        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }


        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }


        /**
         * The list of contacts custom field definitions was retrieved.
         */
        public Builder customFieldDefinitionsPaginated(CustomFieldDefinitionsPaginated customFieldDefinitionsPaginated) {
            Utils.checkNotNull(customFieldDefinitionsPaginated, "customFieldDefinitionsPaginated");
            this.customFieldDefinitionsPaginated = Optional.ofNullable(customFieldDefinitionsPaginated);
            return this;
        }

        /**
         * The list of contacts custom field definitions was retrieved.
         */
        public Builder customFieldDefinitionsPaginated(Optional<? extends CustomFieldDefinitionsPaginated> customFieldDefinitionsPaginated) {
            Utils.checkNotNull(customFieldDefinitionsPaginated, "customFieldDefinitionsPaginated");
            this.customFieldDefinitionsPaginated = customFieldDefinitionsPaginated;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public CrmListContactCustomFieldDefinitionsResponse build() {

            return new CrmListContactCustomFieldDefinitionsResponse(
                contentType, statusCode, rawResponse,
                customFieldDefinitionsPaginated, headers);
        }

    }
}
