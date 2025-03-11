/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
import java.util.Objects;
import java.util.Optional;

public class AtsDownloadApplicationDocumentResponse implements Response {

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
     * The document related to the application with the given identifiers was retrieved.
     */
    private Optional<? extends InputStream> responseStream;

    private Map<String, List<String>> headers;

    @JsonCreator
    public AtsDownloadApplicationDocumentResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends InputStream> responseStream,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(responseStream, "responseStream");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.responseStream = responseStream;
        this.headers = headers;
    }
    
    public AtsDownloadApplicationDocumentResponse(
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
     * The document related to the application with the given identifiers was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputStream> responseStream() {
        return (Optional<InputStream>) responseStream;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public AtsDownloadApplicationDocumentResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AtsDownloadApplicationDocumentResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AtsDownloadApplicationDocumentResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The document related to the application with the given identifiers was retrieved.
     */
    public AtsDownloadApplicationDocumentResponse withResponseStream(InputStream responseStream) {
        Utils.checkNotNull(responseStream, "responseStream");
        this.responseStream = Optional.ofNullable(responseStream);
        return this;
    }

    /**
     * The document related to the application with the given identifiers was retrieved.
     */
    public AtsDownloadApplicationDocumentResponse withResponseStream(Optional<? extends InputStream> responseStream) {
        Utils.checkNotNull(responseStream, "responseStream");
        this.responseStream = responseStream;
        return this;
    }

    public AtsDownloadApplicationDocumentResponse withHeaders(Map<String, List<String>> headers) {
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
        AtsDownloadApplicationDocumentResponse other = (AtsDownloadApplicationDocumentResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.responseStream, other.responseStream) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            responseStream,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsDownloadApplicationDocumentResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "responseStream", responseStream,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends InputStream> responseStream = Optional.empty();
 
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
         * The document related to the application with the given identifiers was retrieved.
         */
        public Builder responseStream(InputStream responseStream) {
            Utils.checkNotNull(responseStream, "responseStream");
            this.responseStream = Optional.ofNullable(responseStream);
            return this;
        }

        /**
         * The document related to the application with the given identifiers was retrieved.
         */
        public Builder responseStream(Optional<? extends InputStream> responseStream) {
            Utils.checkNotNull(responseStream, "responseStream");
            this.responseStream = responseStream;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public AtsDownloadApplicationDocumentResponse build() {
            return new AtsDownloadApplicationDocumentResponse(
                contentType,
                statusCode,
                rawResponse,
                responseStream,
                headers);
        }
    }
}

