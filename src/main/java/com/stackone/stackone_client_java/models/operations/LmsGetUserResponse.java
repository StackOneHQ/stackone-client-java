/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.UserResult;
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


public class LmsGetUserResponse implements Response {
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
     * The user with the given identifier was retrieved.
     */
    private Optional<? extends UserResult> userResult;


    private Map<String, List<String>> headers;

    @JsonCreator
    public LmsGetUserResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UserResult> userResult,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(userResult, "userResult");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.userResult = userResult;
        this.headers = headers;
    }
    
    public LmsGetUserResponse(
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
     * The user with the given identifier was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UserResult> userResult() {
        return (Optional<UserResult>) userResult;
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
    public LmsGetUserResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public LmsGetUserResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public LmsGetUserResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The user with the given identifier was retrieved.
     */
    public LmsGetUserResponse withUserResult(UserResult userResult) {
        Utils.checkNotNull(userResult, "userResult");
        this.userResult = Optional.ofNullable(userResult);
        return this;
    }


    /**
     * The user with the given identifier was retrieved.
     */
    public LmsGetUserResponse withUserResult(Optional<? extends UserResult> userResult) {
        Utils.checkNotNull(userResult, "userResult");
        this.userResult = userResult;
        return this;
    }

    public LmsGetUserResponse withHeaders(Map<String, List<String>> headers) {
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
        LmsGetUserResponse other = (LmsGetUserResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.userResult, other.userResult) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            userResult, headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LmsGetUserResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "userResult", userResult,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends UserResult> userResult = Optional.empty();

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
         * The user with the given identifier was retrieved.
         */
        public Builder userResult(UserResult userResult) {
            Utils.checkNotNull(userResult, "userResult");
            this.userResult = Optional.ofNullable(userResult);
            return this;
        }

        /**
         * The user with the given identifier was retrieved.
         */
        public Builder userResult(Optional<? extends UserResult> userResult) {
            Utils.checkNotNull(userResult, "userResult");
            this.userResult = userResult;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public LmsGetUserResponse build() {

            return new LmsGetUserResponse(
                contentType, statusCode, rawResponse,
                userResult, headers);
        }

    }
}
