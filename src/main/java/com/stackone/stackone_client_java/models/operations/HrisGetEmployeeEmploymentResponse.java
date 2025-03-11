/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.EmploymentResult;
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

public class HrisGetEmployeeEmploymentResponse implements Response {

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
     * The Employee Employment with the given identifier was retrieved.
     */
    private Optional<? extends EmploymentResult> employmentResult;

    private Map<String, List<String>> headers;

    @JsonCreator
    public HrisGetEmployeeEmploymentResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends EmploymentResult> employmentResult,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(employmentResult, "employmentResult");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.employmentResult = employmentResult;
        this.headers = headers;
    }
    
    public HrisGetEmployeeEmploymentResponse(
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
     * The Employee Employment with the given identifier was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EmploymentResult> employmentResult() {
        return (Optional<EmploymentResult>) employmentResult;
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
    public HrisGetEmployeeEmploymentResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HrisGetEmployeeEmploymentResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HrisGetEmployeeEmploymentResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The Employee Employment with the given identifier was retrieved.
     */
    public HrisGetEmployeeEmploymentResponse withEmploymentResult(EmploymentResult employmentResult) {
        Utils.checkNotNull(employmentResult, "employmentResult");
        this.employmentResult = Optional.ofNullable(employmentResult);
        return this;
    }

    /**
     * The Employee Employment with the given identifier was retrieved.
     */
    public HrisGetEmployeeEmploymentResponse withEmploymentResult(Optional<? extends EmploymentResult> employmentResult) {
        Utils.checkNotNull(employmentResult, "employmentResult");
        this.employmentResult = employmentResult;
        return this;
    }

    public HrisGetEmployeeEmploymentResponse withHeaders(Map<String, List<String>> headers) {
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
        HrisGetEmployeeEmploymentResponse other = (HrisGetEmployeeEmploymentResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.employmentResult, other.employmentResult) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            employmentResult,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisGetEmployeeEmploymentResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "employmentResult", employmentResult,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends EmploymentResult> employmentResult = Optional.empty();
 
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
         * The Employee Employment with the given identifier was retrieved.
         */
        public Builder employmentResult(EmploymentResult employmentResult) {
            Utils.checkNotNull(employmentResult, "employmentResult");
            this.employmentResult = Optional.ofNullable(employmentResult);
            return this;
        }

        /**
         * The Employee Employment with the given identifier was retrieved.
         */
        public Builder employmentResult(Optional<? extends EmploymentResult> employmentResult) {
            Utils.checkNotNull(employmentResult, "employmentResult");
            this.employmentResult = employmentResult;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public HrisGetEmployeeEmploymentResponse build() {
            return new HrisGetEmployeeEmploymentResponse(
                contentType,
                statusCode,
                rawResponse,
                employmentResult,
                headers);
        }
    }
}

