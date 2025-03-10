/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.PushTemplatesPaginated;
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

public class MarketingListPushTemplatesResponse implements Response {

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
     * The list of push templates was retrieved.
     */
    private Optional<? extends PushTemplatesPaginated> pushTemplatesPaginated;

    private Map<String, List<String>> headers;

    private Callable<Optional<MarketingListPushTemplatesResponse>> next = () -> Optional.empty();

    @JsonCreator
    public MarketingListPushTemplatesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends PushTemplatesPaginated> pushTemplatesPaginated,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(pushTemplatesPaginated, "pushTemplatesPaginated");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.pushTemplatesPaginated = pushTemplatesPaginated;
        this.headers = headers;
    }
    
    public MarketingListPushTemplatesResponse(
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
     * The list of push templates was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PushTemplatesPaginated> pushTemplatesPaginated() {
        return (Optional<PushTemplatesPaginated>) pushTemplatesPaginated;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public Optional<MarketingListPushTemplatesResponse> next() throws Exception {
        return this.next.call();
    }
    
    // internal use only
    private MarketingListPushTemplatesResponse withNext(Callable<Optional<MarketingListPushTemplatesResponse>> next) {
        this.next = next;
        return this;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public MarketingListPushTemplatesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public MarketingListPushTemplatesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public MarketingListPushTemplatesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The list of push templates was retrieved.
     */
    public MarketingListPushTemplatesResponse withPushTemplatesPaginated(PushTemplatesPaginated pushTemplatesPaginated) {
        Utils.checkNotNull(pushTemplatesPaginated, "pushTemplatesPaginated");
        this.pushTemplatesPaginated = Optional.ofNullable(pushTemplatesPaginated);
        return this;
    }

    /**
     * The list of push templates was retrieved.
     */
    public MarketingListPushTemplatesResponse withPushTemplatesPaginated(Optional<? extends PushTemplatesPaginated> pushTemplatesPaginated) {
        Utils.checkNotNull(pushTemplatesPaginated, "pushTemplatesPaginated");
        this.pushTemplatesPaginated = pushTemplatesPaginated;
        return this;
    }

    public MarketingListPushTemplatesResponse withHeaders(Map<String, List<String>> headers) {
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
        MarketingListPushTemplatesResponse other = (MarketingListPushTemplatesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.pushTemplatesPaginated, other.pushTemplatesPaginated) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            pushTemplatesPaginated,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingListPushTemplatesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "pushTemplatesPaginated", pushTemplatesPaginated,
                "headers", headers);
    }
    
    public final static class Builder {
        private Callable<Optional<MarketingListPushTemplatesResponse>> next;
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends PushTemplatesPaginated> pushTemplatesPaginated = Optional.empty();
 
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
         * The list of push templates was retrieved.
         */
        public Builder pushTemplatesPaginated(PushTemplatesPaginated pushTemplatesPaginated) {
            Utils.checkNotNull(pushTemplatesPaginated, "pushTemplatesPaginated");
            this.pushTemplatesPaginated = Optional.ofNullable(pushTemplatesPaginated);
            return this;
        }

        /**
         * The list of push templates was retrieved.
         */
        public Builder pushTemplatesPaginated(Optional<? extends PushTemplatesPaginated> pushTemplatesPaginated) {
            Utils.checkNotNull(pushTemplatesPaginated, "pushTemplatesPaginated");
            this.pushTemplatesPaginated = pushTemplatesPaginated;
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
         * @Deprecated not part of the public API, may be removed without notice
         */
        @Deprecated
        public Builder next(Callable<Optional<MarketingListPushTemplatesResponse>> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }
        
        public MarketingListPushTemplatesResponse build() {
            return new MarketingListPushTemplatesResponse(
                contentType,
                statusCode,
                rawResponse,
                pushTemplatesPaginated,
                headers)
                .withNext(next);
        }
    }
}

