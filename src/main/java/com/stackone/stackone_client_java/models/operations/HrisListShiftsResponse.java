/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.HrisShiftsPaginated;
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


public class HrisListShiftsResponse implements Response {
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
     * The list of shifts was retrieved.
     */
    private Optional<? extends HrisShiftsPaginated> hrisShiftsPaginated;


    private Map<String, List<String>> headers;

    @JsonCreator
    public HrisListShiftsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends HrisShiftsPaginated> hrisShiftsPaginated,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(hrisShiftsPaginated, "hrisShiftsPaginated");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(headers, "headers");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.hrisShiftsPaginated = hrisShiftsPaginated;
        this.headers = headers;
    }
    
    public HrisListShiftsResponse(
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
     * The list of shifts was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HrisShiftsPaginated> hrisShiftsPaginated() {
        return (Optional<HrisShiftsPaginated>) hrisShiftsPaginated;
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
    public HrisListShiftsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HrisListShiftsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HrisListShiftsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The list of shifts was retrieved.
     */
    public HrisListShiftsResponse withHrisShiftsPaginated(HrisShiftsPaginated hrisShiftsPaginated) {
        Utils.checkNotNull(hrisShiftsPaginated, "hrisShiftsPaginated");
        this.hrisShiftsPaginated = Optional.ofNullable(hrisShiftsPaginated);
        return this;
    }


    /**
     * The list of shifts was retrieved.
     */
    public HrisListShiftsResponse withHrisShiftsPaginated(Optional<? extends HrisShiftsPaginated> hrisShiftsPaginated) {
        Utils.checkNotNull(hrisShiftsPaginated, "hrisShiftsPaginated");
        this.hrisShiftsPaginated = hrisShiftsPaginated;
        return this;
    }

    public HrisListShiftsResponse withHeaders(Map<String, List<String>> headers) {
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
        HrisListShiftsResponse other = (HrisListShiftsResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.hrisShiftsPaginated, other.hrisShiftsPaginated) &&
            Utils.enhancedDeepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            hrisShiftsPaginated, headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisListShiftsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "hrisShiftsPaginated", hrisShiftsPaginated,
                "headers", headers);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends HrisShiftsPaginated> hrisShiftsPaginated = Optional.empty();

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
         * The list of shifts was retrieved.
         */
        public Builder hrisShiftsPaginated(HrisShiftsPaginated hrisShiftsPaginated) {
            Utils.checkNotNull(hrisShiftsPaginated, "hrisShiftsPaginated");
            this.hrisShiftsPaginated = Optional.ofNullable(hrisShiftsPaginated);
            return this;
        }

        /**
         * The list of shifts was retrieved.
         */
        public Builder hrisShiftsPaginated(Optional<? extends HrisShiftsPaginated> hrisShiftsPaginated) {
            Utils.checkNotNull(hrisShiftsPaginated, "hrisShiftsPaginated");
            this.hrisShiftsPaginated = hrisShiftsPaginated;
            return this;
        }


        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public HrisListShiftsResponse build() {

            return new HrisListShiftsResponse(
                contentType, statusCode, rawResponse,
                hrisShiftsPaginated, headers);
        }

    }
}
