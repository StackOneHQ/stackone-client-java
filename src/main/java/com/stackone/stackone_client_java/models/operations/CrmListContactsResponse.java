/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.ContactsPaginated;
import com.stackone.stackone_client_java.utils.Response;
import com.stackone.stackone_client_java.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;

public class CrmListContactsResponse implements Response {

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
     * The list of contacts was retrieved.
     */
    private Optional<? extends ContactsPaginated> contactsPaginated;

    private Map<String, List<String>> headers;

    private Callable<Optional<CrmListContactsResponse>> next = () -> Optional.empty();

    @JsonCreator
    public CrmListContactsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ContactsPaginated> contactsPaginated,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(contactsPaginated, "contactsPaginated");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.contactsPaginated = contactsPaginated;
        this.headers = headers;
    }
    
    public CrmListContactsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse, Optional.empty(), headers);
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
     * The list of contacts was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ContactsPaginated> contactsPaginated() {
        return (Optional<ContactsPaginated>) contactsPaginated;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public Optional<CrmListContactsResponse> next() throws Exception {
        return this.next.call();
    }
    
    // internal use only
    private CrmListContactsResponse withNext(Callable<Optional<CrmListContactsResponse>> next) {
        this.next = next;
        return this;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public CrmListContactsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CrmListContactsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CrmListContactsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The list of contacts was retrieved.
     */
    public CrmListContactsResponse withContactsPaginated(ContactsPaginated contactsPaginated) {
        Utils.checkNotNull(contactsPaginated, "contactsPaginated");
        this.contactsPaginated = Optional.ofNullable(contactsPaginated);
        return this;
    }

    /**
     * The list of contacts was retrieved.
     */
    public CrmListContactsResponse withContactsPaginated(Optional<? extends ContactsPaginated> contactsPaginated) {
        Utils.checkNotNull(contactsPaginated, "contactsPaginated");
        this.contactsPaginated = contactsPaginated;
        return this;
    }

    public CrmListContactsResponse withHeaders(Map<String, List<String>> headers) {
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
        CrmListContactsResponse other = (CrmListContactsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.contactsPaginated, other.contactsPaginated) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            contactsPaginated,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmListContactsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "contactsPaginated", contactsPaginated,
                "headers", headers);
    }
    
    public final static class Builder {
        private Callable<Optional<CrmListContactsResponse>> next;
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ContactsPaginated> contactsPaginated = Optional.empty();
 
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
         * The list of contacts was retrieved.
         */
        public Builder contactsPaginated(ContactsPaginated contactsPaginated) {
            Utils.checkNotNull(contactsPaginated, "contactsPaginated");
            this.contactsPaginated = Optional.ofNullable(contactsPaginated);
            return this;
        }

        /**
         * The list of contacts was retrieved.
         */
        public Builder contactsPaginated(Optional<? extends ContactsPaginated> contactsPaginated) {
            Utils.checkNotNull(contactsPaginated, "contactsPaginated");
            this.contactsPaginated = contactsPaginated;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        /**
         * Internal API. Not for public use. Sets the provider of the next page.
         *
         * @deprecated not part of the public API, may be removed without notice
         */
        @Deprecated
        public Builder next(Callable<Optional<CrmListContactsResponse>> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }
        
        public CrmListContactsResponse build() {
            return new CrmListContactsResponse(
                contentType,
                statusCode,
                rawResponse,
                contactsPaginated,
                headers)
                .withNext(next);
        }
    }
}
