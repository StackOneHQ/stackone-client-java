/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.UpdateResult;
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

public class AtsUpdateBackgroundCheckPackageResponse implements Response {

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
     * Record updated successfully.
     */
    private Optional<? extends UpdateResult> updateResult;

    private Map<String, List<String>> headers;

    @JsonCreator
    public AtsUpdateBackgroundCheckPackageResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UpdateResult> updateResult,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateResult, "updateResult");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateResult = updateResult;
        this.headers = headers;
    }
    
    public AtsUpdateBackgroundCheckPackageResponse(
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
     * Record updated successfully.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateResult> updateResult() {
        return (Optional<UpdateResult>) updateResult;
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
    public AtsUpdateBackgroundCheckPackageResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AtsUpdateBackgroundCheckPackageResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AtsUpdateBackgroundCheckPackageResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Record updated successfully.
     */
    public AtsUpdateBackgroundCheckPackageResponse withUpdateResult(UpdateResult updateResult) {
        Utils.checkNotNull(updateResult, "updateResult");
        this.updateResult = Optional.ofNullable(updateResult);
        return this;
    }

    /**
     * Record updated successfully.
     */
    public AtsUpdateBackgroundCheckPackageResponse withUpdateResult(Optional<? extends UpdateResult> updateResult) {
        Utils.checkNotNull(updateResult, "updateResult");
        this.updateResult = updateResult;
        return this;
    }

    public AtsUpdateBackgroundCheckPackageResponse withHeaders(Map<String, List<String>> headers) {
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
        AtsUpdateBackgroundCheckPackageResponse other = (AtsUpdateBackgroundCheckPackageResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.updateResult, other.updateResult) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            updateResult,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsUpdateBackgroundCheckPackageResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateResult", updateResult,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends UpdateResult> updateResult = Optional.empty();
 
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
         * Record updated successfully.
         */
        public Builder updateResult(UpdateResult updateResult) {
            Utils.checkNotNull(updateResult, "updateResult");
            this.updateResult = Optional.ofNullable(updateResult);
            return this;
        }

        /**
         * Record updated successfully.
         */
        public Builder updateResult(Optional<? extends UpdateResult> updateResult) {
            Utils.checkNotNull(updateResult, "updateResult");
            this.updateResult = updateResult;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public AtsUpdateBackgroundCheckPackageResponse build() {
            return new AtsUpdateBackgroundCheckPackageResponse(
                contentType,
                statusCode,
                rawResponse,
                updateResult,
                headers);
        }
    }
}

