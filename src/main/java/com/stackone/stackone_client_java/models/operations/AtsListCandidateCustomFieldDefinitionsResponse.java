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

public class AtsListCandidateCustomFieldDefinitionsResponse implements Response {

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
     * The list of candidate custom field definitions was retrieved.
     */
    private Optional<? extends CustomFieldDefinitionsPaginated> customFieldDefinitionsPaginated;

    private Map<String, List<String>> headers;

    private Callable<Optional<AtsListCandidateCustomFieldDefinitionsResponse>> next = () -> Optional.empty();

    @JsonCreator
    public AtsListCandidateCustomFieldDefinitionsResponse(
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
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.customFieldDefinitionsPaginated = customFieldDefinitionsPaginated;
        this.headers = headers;
    }
    
    public AtsListCandidateCustomFieldDefinitionsResponse(
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
     * The list of candidate custom field definitions was retrieved.
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

    public Optional<AtsListCandidateCustomFieldDefinitionsResponse> next() throws Exception {
        return this.next.call();
    }
    
    // internal use only
    private AtsListCandidateCustomFieldDefinitionsResponse withNext(Callable<Optional<AtsListCandidateCustomFieldDefinitionsResponse>> next) {
        this.next = next;
        return this;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public AtsListCandidateCustomFieldDefinitionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AtsListCandidateCustomFieldDefinitionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AtsListCandidateCustomFieldDefinitionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The list of candidate custom field definitions was retrieved.
     */
    public AtsListCandidateCustomFieldDefinitionsResponse withCustomFieldDefinitionsPaginated(CustomFieldDefinitionsPaginated customFieldDefinitionsPaginated) {
        Utils.checkNotNull(customFieldDefinitionsPaginated, "customFieldDefinitionsPaginated");
        this.customFieldDefinitionsPaginated = Optional.ofNullable(customFieldDefinitionsPaginated);
        return this;
    }

    /**
     * The list of candidate custom field definitions was retrieved.
     */
    public AtsListCandidateCustomFieldDefinitionsResponse withCustomFieldDefinitionsPaginated(Optional<? extends CustomFieldDefinitionsPaginated> customFieldDefinitionsPaginated) {
        Utils.checkNotNull(customFieldDefinitionsPaginated, "customFieldDefinitionsPaginated");
        this.customFieldDefinitionsPaginated = customFieldDefinitionsPaginated;
        return this;
    }

    public AtsListCandidateCustomFieldDefinitionsResponse withHeaders(Map<String, List<String>> headers) {
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
        AtsListCandidateCustomFieldDefinitionsResponse other = (AtsListCandidateCustomFieldDefinitionsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.customFieldDefinitionsPaginated, other.customFieldDefinitionsPaginated) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            customFieldDefinitionsPaginated,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsListCandidateCustomFieldDefinitionsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "customFieldDefinitionsPaginated", customFieldDefinitionsPaginated,
                "headers", headers);
    }
    
    public final static class Builder {
        private Callable<Optional<AtsListCandidateCustomFieldDefinitionsResponse>> next;
 
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
         * The list of candidate custom field definitions was retrieved.
         */
        public Builder customFieldDefinitionsPaginated(CustomFieldDefinitionsPaginated customFieldDefinitionsPaginated) {
            Utils.checkNotNull(customFieldDefinitionsPaginated, "customFieldDefinitionsPaginated");
            this.customFieldDefinitionsPaginated = Optional.ofNullable(customFieldDefinitionsPaginated);
            return this;
        }

        /**
         * The list of candidate custom field definitions was retrieved.
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

        /**
         * Internal API. Not for public use. Sets the provider of the next page.
         *
         * @Deprecated not part of the public API, may be removed without notice
         */
        @Deprecated
        public Builder next(Callable<Optional<AtsListCandidateCustomFieldDefinitionsResponse>> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }
        
        public AtsListCandidateCustomFieldDefinitionsResponse build() {
            return new AtsListCandidateCustomFieldDefinitionsResponse(
                contentType,
                statusCode,
                rawResponse,
                customFieldDefinitionsPaginated,
                headers)
                .withNext(next);
        }
    }
}

