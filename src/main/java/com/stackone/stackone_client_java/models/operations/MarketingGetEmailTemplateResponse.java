/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.EmailTemplateResult;
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


public class MarketingGetEmailTemplateResponse implements Response {
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
     * The email template with the given identifier was retrieved.
     */
    private Optional<? extends EmailTemplateResult> emailTemplateResult;


    private Map<String, List<String>> headers;

    @JsonCreator
    public MarketingGetEmailTemplateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends EmailTemplateResult> emailTemplateResult,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(emailTemplateResult, "emailTemplateResult");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.emailTemplateResult = emailTemplateResult;
        this.headers = headers;
    }
    
    public MarketingGetEmailTemplateResponse(
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
     * The email template with the given identifier was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EmailTemplateResult> emailTemplateResult() {
        return (Optional<EmailTemplateResult>) emailTemplateResult;
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
    public MarketingGetEmailTemplateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public MarketingGetEmailTemplateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public MarketingGetEmailTemplateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The email template with the given identifier was retrieved.
     */
    public MarketingGetEmailTemplateResponse withEmailTemplateResult(EmailTemplateResult emailTemplateResult) {
        Utils.checkNotNull(emailTemplateResult, "emailTemplateResult");
        this.emailTemplateResult = Optional.ofNullable(emailTemplateResult);
        return this;
    }


    /**
     * The email template with the given identifier was retrieved.
     */
    public MarketingGetEmailTemplateResponse withEmailTemplateResult(Optional<? extends EmailTemplateResult> emailTemplateResult) {
        Utils.checkNotNull(emailTemplateResult, "emailTemplateResult");
        this.emailTemplateResult = emailTemplateResult;
        return this;
    }

    public MarketingGetEmailTemplateResponse withHeaders(Map<String, List<String>> headers) {
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
        MarketingGetEmailTemplateResponse other = (MarketingGetEmailTemplateResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.emailTemplateResult, other.emailTemplateResult) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            emailTemplateResult, headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingGetEmailTemplateResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "emailTemplateResult", emailTemplateResult,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends EmailTemplateResult> emailTemplateResult = Optional.empty();

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
         * The email template with the given identifier was retrieved.
         */
        public Builder emailTemplateResult(EmailTemplateResult emailTemplateResult) {
            Utils.checkNotNull(emailTemplateResult, "emailTemplateResult");
            this.emailTemplateResult = Optional.ofNullable(emailTemplateResult);
            return this;
        }

        /**
         * The email template with the given identifier was retrieved.
         */
        public Builder emailTemplateResult(Optional<? extends EmailTemplateResult> emailTemplateResult) {
            Utils.checkNotNull(emailTemplateResult, "emailTemplateResult");
            this.emailTemplateResult = emailTemplateResult;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public MarketingGetEmailTemplateResponse build() {

            return new MarketingGetEmailTemplateResponse(
                contentType, statusCode, rawResponse,
                emailTemplateResult, headers);
        }

    }
}
