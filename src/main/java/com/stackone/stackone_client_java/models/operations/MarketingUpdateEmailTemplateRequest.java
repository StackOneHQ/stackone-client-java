/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.MarketingCreateEmailTemplateRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class MarketingUpdateEmailTemplateRequest {
    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;


    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private MarketingCreateEmailTemplateRequestDto marketingCreateEmailTemplateRequestDto;

    @JsonCreator
    public MarketingUpdateEmailTemplateRequest(
            String xAccountId,
            String id,
            MarketingCreateEmailTemplateRequestDto marketingCreateEmailTemplateRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(marketingCreateEmailTemplateRequestDto, "marketingCreateEmailTemplateRequestDto");
        this.xAccountId = xAccountId;
        this.id = id;
        this.marketingCreateEmailTemplateRequestDto = marketingCreateEmailTemplateRequestDto;
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
    public MarketingCreateEmailTemplateRequestDto marketingCreateEmailTemplateRequestDto() {
        return marketingCreateEmailTemplateRequestDto;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The account identifier
     */
    public MarketingUpdateEmailTemplateRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public MarketingUpdateEmailTemplateRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MarketingUpdateEmailTemplateRequest withMarketingCreateEmailTemplateRequestDto(MarketingCreateEmailTemplateRequestDto marketingCreateEmailTemplateRequestDto) {
        Utils.checkNotNull(marketingCreateEmailTemplateRequestDto, "marketingCreateEmailTemplateRequestDto");
        this.marketingCreateEmailTemplateRequestDto = marketingCreateEmailTemplateRequestDto;
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
        MarketingUpdateEmailTemplateRequest other = (MarketingUpdateEmailTemplateRequest) o;
        return 
            Utils.enhancedDeepEquals(this.xAccountId, other.xAccountId) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.marketingCreateEmailTemplateRequestDto, other.marketingCreateEmailTemplateRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            xAccountId, id, marketingCreateEmailTemplateRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingUpdateEmailTemplateRequest.class,
                "xAccountId", xAccountId,
                "id", id,
                "marketingCreateEmailTemplateRequestDto", marketingCreateEmailTemplateRequestDto);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String xAccountId;

        private String id;

        private MarketingCreateEmailTemplateRequestDto marketingCreateEmailTemplateRequestDto;

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


        public Builder marketingCreateEmailTemplateRequestDto(MarketingCreateEmailTemplateRequestDto marketingCreateEmailTemplateRequestDto) {
            Utils.checkNotNull(marketingCreateEmailTemplateRequestDto, "marketingCreateEmailTemplateRequestDto");
            this.marketingCreateEmailTemplateRequestDto = marketingCreateEmailTemplateRequestDto;
            return this;
        }

        public MarketingUpdateEmailTemplateRequest build() {

            return new MarketingUpdateEmailTemplateRequest(
                xAccountId, id, marketingCreateEmailTemplateRequestDto);
        }

    }
}
