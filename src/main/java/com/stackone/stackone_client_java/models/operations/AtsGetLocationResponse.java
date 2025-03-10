/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.ATSLocationResult;
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

public class AtsGetLocationResponse implements Response {

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
     * The location with the given identifier was retrieved.
     */
    private Optional<? extends ATSLocationResult> atsLocationResult;

    private Map<String, List<String>> headers;

    @JsonCreator
    public AtsGetLocationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ATSLocationResult> atsLocationResult,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(atsLocationResult, "atsLocationResult");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.atsLocationResult = atsLocationResult;
        this.headers = headers;
    }
    
    public AtsGetLocationResponse(
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
     * The location with the given identifier was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ATSLocationResult> atsLocationResult() {
        return (Optional<ATSLocationResult>) atsLocationResult;
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
    public AtsGetLocationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AtsGetLocationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AtsGetLocationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The location with the given identifier was retrieved.
     */
    public AtsGetLocationResponse withATSLocationResult(ATSLocationResult atsLocationResult) {
        Utils.checkNotNull(atsLocationResult, "atsLocationResult");
        this.atsLocationResult = Optional.ofNullable(atsLocationResult);
        return this;
    }

    /**
     * The location with the given identifier was retrieved.
     */
    public AtsGetLocationResponse withATSLocationResult(Optional<? extends ATSLocationResult> atsLocationResult) {
        Utils.checkNotNull(atsLocationResult, "atsLocationResult");
        this.atsLocationResult = atsLocationResult;
        return this;
    }

    public AtsGetLocationResponse withHeaders(Map<String, List<String>> headers) {
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
        AtsGetLocationResponse other = (AtsGetLocationResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.atsLocationResult, other.atsLocationResult) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            atsLocationResult,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsGetLocationResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "atsLocationResult", atsLocationResult,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ATSLocationResult> atsLocationResult = Optional.empty();
 
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
         * The location with the given identifier was retrieved.
         */
        public Builder atsLocationResult(ATSLocationResult atsLocationResult) {
            Utils.checkNotNull(atsLocationResult, "atsLocationResult");
            this.atsLocationResult = Optional.ofNullable(atsLocationResult);
            return this;
        }

        /**
         * The location with the given identifier was retrieved.
         */
        public Builder atsLocationResult(Optional<? extends ATSLocationResult> atsLocationResult) {
            Utils.checkNotNull(atsLocationResult, "atsLocationResult");
            this.atsLocationResult = atsLocationResult;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public AtsGetLocationResponse build() {
            return new AtsGetLocationResponse(
                contentType,
                statusCode,
                rawResponse,
                atsLocationResult,
                headers);
        }
    }
}

