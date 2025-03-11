/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.CampaignResult;
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

public class MarketingGetCampaignResponse implements Response {

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
     * The campaign with the given identifier was retrieved.
     */
    private Optional<? extends CampaignResult> campaignResult;

    private Map<String, List<String>> headers;

    @JsonCreator
    public MarketingGetCampaignResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CampaignResult> campaignResult,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(campaignResult, "campaignResult");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.campaignResult = campaignResult;
        this.headers = headers;
    }
    
    public MarketingGetCampaignResponse(
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
     * The campaign with the given identifier was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CampaignResult> campaignResult() {
        return (Optional<CampaignResult>) campaignResult;
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
    public MarketingGetCampaignResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public MarketingGetCampaignResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public MarketingGetCampaignResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The campaign with the given identifier was retrieved.
     */
    public MarketingGetCampaignResponse withCampaignResult(CampaignResult campaignResult) {
        Utils.checkNotNull(campaignResult, "campaignResult");
        this.campaignResult = Optional.ofNullable(campaignResult);
        return this;
    }

    /**
     * The campaign with the given identifier was retrieved.
     */
    public MarketingGetCampaignResponse withCampaignResult(Optional<? extends CampaignResult> campaignResult) {
        Utils.checkNotNull(campaignResult, "campaignResult");
        this.campaignResult = campaignResult;
        return this;
    }

    public MarketingGetCampaignResponse withHeaders(Map<String, List<String>> headers) {
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
        MarketingGetCampaignResponse other = (MarketingGetCampaignResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.campaignResult, other.campaignResult) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            campaignResult,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingGetCampaignResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "campaignResult", campaignResult,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends CampaignResult> campaignResult = Optional.empty();
 
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
         * The campaign with the given identifier was retrieved.
         */
        public Builder campaignResult(CampaignResult campaignResult) {
            Utils.checkNotNull(campaignResult, "campaignResult");
            this.campaignResult = Optional.ofNullable(campaignResult);
            return this;
        }

        /**
         * The campaign with the given identifier was retrieved.
         */
        public Builder campaignResult(Optional<? extends CampaignResult> campaignResult) {
            Utils.checkNotNull(campaignResult, "campaignResult");
            this.campaignResult = campaignResult;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public MarketingGetCampaignResponse build() {
            return new MarketingGetCampaignResponse(
                contentType,
                statusCode,
                rawResponse,
                campaignResult,
                headers);
        }
    }
}

