/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.MarketingCreateTemplateRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class MarketingUpdateOmniChannelTemplateRequest {
    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;


    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private MarketingCreateTemplateRequestDto marketingCreateTemplateRequestDto;

    @JsonCreator
    public MarketingUpdateOmniChannelTemplateRequest(
            String xAccountId,
            String id,
            MarketingCreateTemplateRequestDto marketingCreateTemplateRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(marketingCreateTemplateRequestDto, "marketingCreateTemplateRequestDto");
        this.xAccountId = xAccountId;
        this.id = id;
        this.marketingCreateTemplateRequestDto = marketingCreateTemplateRequestDto;
    }

    /**
     * The account identifier
     */
    @JsonIgnore
    public String xAccountId() {
        return xAccountId;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public MarketingCreateTemplateRequestDto marketingCreateTemplateRequestDto() {
        return marketingCreateTemplateRequestDto;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The account identifier
     */
    public MarketingUpdateOmniChannelTemplateRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public MarketingUpdateOmniChannelTemplateRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MarketingUpdateOmniChannelTemplateRequest withMarketingCreateTemplateRequestDto(MarketingCreateTemplateRequestDto marketingCreateTemplateRequestDto) {
        Utils.checkNotNull(marketingCreateTemplateRequestDto, "marketingCreateTemplateRequestDto");
        this.marketingCreateTemplateRequestDto = marketingCreateTemplateRequestDto;
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
        MarketingUpdateOmniChannelTemplateRequest other = (MarketingUpdateOmniChannelTemplateRequest) o;
        return 
            Utils.enhancedDeepEquals(this.xAccountId, other.xAccountId) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.marketingCreateTemplateRequestDto, other.marketingCreateTemplateRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            xAccountId, id, marketingCreateTemplateRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingUpdateOmniChannelTemplateRequest.class,
                "xAccountId", xAccountId,
                "id", id,
                "marketingCreateTemplateRequestDto", marketingCreateTemplateRequestDto);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String xAccountId;

        private String id;

        private MarketingCreateTemplateRequestDto marketingCreateTemplateRequestDto;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The account identifier
         */
        public Builder xAccountId(String xAccountId) {
            Utils.checkNotNull(xAccountId, "xAccountId");
            this.xAccountId = xAccountId;
            return this;
        }


        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        public Builder marketingCreateTemplateRequestDto(MarketingCreateTemplateRequestDto marketingCreateTemplateRequestDto) {
            Utils.checkNotNull(marketingCreateTemplateRequestDto, "marketingCreateTemplateRequestDto");
            this.marketingCreateTemplateRequestDto = marketingCreateTemplateRequestDto;
            return this;
        }

        public MarketingUpdateOmniChannelTemplateRequest build() {

            return new MarketingUpdateOmniChannelTemplateRequest(
                xAccountId, id, marketingCreateTemplateRequestDto);
        }

    }
}
