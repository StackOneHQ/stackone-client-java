/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.HRISTeamsPaginated;
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


public class HrisListTeamGroupsResponse implements Response {
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
     * The list of team groups was retrieved.
     */
    private Optional<? extends HRISTeamsPaginated> hrisTeamsPaginated;


    private Map<String, List<String>> headers;

    @JsonCreator
    public HrisListTeamGroupsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends HRISTeamsPaginated> hrisTeamsPaginated,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(hrisTeamsPaginated, "hrisTeamsPaginated");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.hrisTeamsPaginated = hrisTeamsPaginated;
        this.headers = headers;
    }
    
    public HrisListTeamGroupsResponse(
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
     * The list of team groups was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HRISTeamsPaginated> hrisTeamsPaginated() {
        return (Optional<HRISTeamsPaginated>) hrisTeamsPaginated;
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
    public HrisListTeamGroupsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HrisListTeamGroupsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HrisListTeamGroupsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The list of team groups was retrieved.
     */
    public HrisListTeamGroupsResponse withHRISTeamsPaginated(HRISTeamsPaginated hrisTeamsPaginated) {
        Utils.checkNotNull(hrisTeamsPaginated, "hrisTeamsPaginated");
        this.hrisTeamsPaginated = Optional.ofNullable(hrisTeamsPaginated);
        return this;
    }


    /**
     * The list of team groups was retrieved.
     */
    public HrisListTeamGroupsResponse withHRISTeamsPaginated(Optional<? extends HRISTeamsPaginated> hrisTeamsPaginated) {
        Utils.checkNotNull(hrisTeamsPaginated, "hrisTeamsPaginated");
        this.hrisTeamsPaginated = hrisTeamsPaginated;
        return this;
    }

    public HrisListTeamGroupsResponse withHeaders(Map<String, List<String>> headers) {
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
        HrisListTeamGroupsResponse other = (HrisListTeamGroupsResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.hrisTeamsPaginated, other.hrisTeamsPaginated) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            hrisTeamsPaginated, headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisListTeamGroupsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "hrisTeamsPaginated", hrisTeamsPaginated,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends HRISTeamsPaginated> hrisTeamsPaginated = Optional.empty();

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
         * The list of team groups was retrieved.
         */
        public Builder hrisTeamsPaginated(HRISTeamsPaginated hrisTeamsPaginated) {
            Utils.checkNotNull(hrisTeamsPaginated, "hrisTeamsPaginated");
            this.hrisTeamsPaginated = Optional.ofNullable(hrisTeamsPaginated);
            return this;
        }

        /**
         * The list of team groups was retrieved.
         */
        public Builder hrisTeamsPaginated(Optional<? extends HRISTeamsPaginated> hrisTeamsPaginated) {
            Utils.checkNotNull(hrisTeamsPaginated, "hrisTeamsPaginated");
            this.hrisTeamsPaginated = hrisTeamsPaginated;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public HrisListTeamGroupsResponse build() {

            return new HrisListTeamGroupsResponse(
                contentType, statusCode, rawResponse,
                hrisTeamsPaginated, headers);
        }

    }
}
