/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.CreateAssessmentOrderResult;
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


public class AtsOrderAssessmentsRequestResponse implements Response {
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
     * The order request of the assessment for candidate.
     */
    private Optional<? extends CreateAssessmentOrderResult> createAssessmentOrderResult;


    private Map<String, List<String>> headers;

    @JsonCreator
    public AtsOrderAssessmentsRequestResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CreateAssessmentOrderResult> createAssessmentOrderResult,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(createAssessmentOrderResult, "createAssessmentOrderResult");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.createAssessmentOrderResult = createAssessmentOrderResult;
        this.headers = headers;
    }
    
    public AtsOrderAssessmentsRequestResponse(
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
     * The order request of the assessment for candidate.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateAssessmentOrderResult> createAssessmentOrderResult() {
        return (Optional<CreateAssessmentOrderResult>) createAssessmentOrderResult;
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
    public AtsOrderAssessmentsRequestResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AtsOrderAssessmentsRequestResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AtsOrderAssessmentsRequestResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The order request of the assessment for candidate.
     */
    public AtsOrderAssessmentsRequestResponse withCreateAssessmentOrderResult(CreateAssessmentOrderResult createAssessmentOrderResult) {
        Utils.checkNotNull(createAssessmentOrderResult, "createAssessmentOrderResult");
        this.createAssessmentOrderResult = Optional.ofNullable(createAssessmentOrderResult);
        return this;
    }


    /**
     * The order request of the assessment for candidate.
     */
    public AtsOrderAssessmentsRequestResponse withCreateAssessmentOrderResult(Optional<? extends CreateAssessmentOrderResult> createAssessmentOrderResult) {
        Utils.checkNotNull(createAssessmentOrderResult, "createAssessmentOrderResult");
        this.createAssessmentOrderResult = createAssessmentOrderResult;
        return this;
    }

    public AtsOrderAssessmentsRequestResponse withHeaders(Map<String, List<String>> headers) {
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
        AtsOrderAssessmentsRequestResponse other = (AtsOrderAssessmentsRequestResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.createAssessmentOrderResult, other.createAssessmentOrderResult) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            createAssessmentOrderResult, headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsOrderAssessmentsRequestResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "createAssessmentOrderResult", createAssessmentOrderResult,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends CreateAssessmentOrderResult> createAssessmentOrderResult = Optional.empty();

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
         * The order request of the assessment for candidate.
         */
        public Builder createAssessmentOrderResult(CreateAssessmentOrderResult createAssessmentOrderResult) {
            Utils.checkNotNull(createAssessmentOrderResult, "createAssessmentOrderResult");
            this.createAssessmentOrderResult = Optional.ofNullable(createAssessmentOrderResult);
            return this;
        }

        /**
         * The order request of the assessment for candidate.
         */
        public Builder createAssessmentOrderResult(Optional<? extends CreateAssessmentOrderResult> createAssessmentOrderResult) {
            Utils.checkNotNull(createAssessmentOrderResult, "createAssessmentOrderResult");
            this.createAssessmentOrderResult = createAssessmentOrderResult;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public AtsOrderAssessmentsRequestResponse build() {

            return new AtsOrderAssessmentsRequestResponse(
                contentType, statusCode, rawResponse,
                createAssessmentOrderResult, headers);
        }

    }
}
