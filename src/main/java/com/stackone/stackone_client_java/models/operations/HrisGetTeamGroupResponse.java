/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.HRISTeamsResult;
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


public class HrisGetTeamGroupResponse implements Response {
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
     * The team group with the given identifier was retrieved.
     */
    private Optional<? extends HRISTeamsResult> hrisTeamsResult;


    private Map<String, List<String>> headers;

    @JsonCreator
    public HrisGetTeamGroupResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends HRISTeamsResult> hrisTeamsResult,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(hrisTeamsResult, "hrisTeamsResult");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.hrisTeamsResult = hrisTeamsResult;
        this.headers = headers;
    }
    
    public HrisGetTeamGroupResponse(
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
     * The team group with the given identifier was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HRISTeamsResult> hrisTeamsResult() {
        return (Optional<HRISTeamsResult>) hrisTeamsResult;
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
    public HrisGetTeamGroupResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HrisGetTeamGroupResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HrisGetTeamGroupResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The team group with the given identifier was retrieved.
     */
    public HrisGetTeamGroupResponse withHRISTeamsResult(HRISTeamsResult hrisTeamsResult) {
        Utils.checkNotNull(hrisTeamsResult, "hrisTeamsResult");
        this.hrisTeamsResult = Optional.ofNullable(hrisTeamsResult);
        return this;
    }


    /**
     * The team group with the given identifier was retrieved.
     */
    public HrisGetTeamGroupResponse withHRISTeamsResult(Optional<? extends HRISTeamsResult> hrisTeamsResult) {
        Utils.checkNotNull(hrisTeamsResult, "hrisTeamsResult");
        this.hrisTeamsResult = hrisTeamsResult;
        return this;
    }

    public HrisGetTeamGroupResponse withHeaders(Map<String, List<String>> headers) {
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
        HrisGetTeamGroupResponse other = (HrisGetTeamGroupResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.hrisTeamsResult, other.hrisTeamsResult) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            hrisTeamsResult, headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisGetTeamGroupResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "hrisTeamsResult", hrisTeamsResult,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends HRISTeamsResult> hrisTeamsResult = Optional.empty();

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
         * The team group with the given identifier was retrieved.
         */
        public Builder hrisTeamsResult(HRISTeamsResult hrisTeamsResult) {
            Utils.checkNotNull(hrisTeamsResult, "hrisTeamsResult");
            this.hrisTeamsResult = Optional.ofNullable(hrisTeamsResult);
            return this;
        }

        /**
         * The team group with the given identifier was retrieved.
         */
        public Builder hrisTeamsResult(Optional<? extends HRISTeamsResult> hrisTeamsResult) {
            Utils.checkNotNull(hrisTeamsResult, "hrisTeamsResult");
            this.hrisTeamsResult = hrisTeamsResult;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public HrisGetTeamGroupResponse build() {

            return new HrisGetTeamGroupResponse(
                contentType, statusCode, rawResponse,
                hrisTeamsResult, headers);
        }

    }
}
