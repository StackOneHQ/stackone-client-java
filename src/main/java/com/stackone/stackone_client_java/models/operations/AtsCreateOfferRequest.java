/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.AtsCreateOfferRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class AtsCreateOfferRequest {
    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private AtsCreateOfferRequestDto atsCreateOfferRequestDto;

    @JsonCreator
    public AtsCreateOfferRequest(
            String xAccountId,
            AtsCreateOfferRequestDto atsCreateOfferRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(atsCreateOfferRequestDto, "atsCreateOfferRequestDto");
        this.xAccountId = xAccountId;
        this.atsCreateOfferRequestDto = atsCreateOfferRequestDto;
    }

    /**
     * The account identifier
     */
    @JsonIgnore
    public String xAccountId() {
        return xAccountId;
    }

    @JsonIgnore
    public AtsCreateOfferRequestDto atsCreateOfferRequestDto() {
        return atsCreateOfferRequestDto;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The account identifier
     */
    public AtsCreateOfferRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsCreateOfferRequest withAtsCreateOfferRequestDto(AtsCreateOfferRequestDto atsCreateOfferRequestDto) {
        Utils.checkNotNull(atsCreateOfferRequestDto, "atsCreateOfferRequestDto");
        this.atsCreateOfferRequestDto = atsCreateOfferRequestDto;
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
        AtsCreateOfferRequest other = (AtsCreateOfferRequest) o;
        return 
            Utils.enhancedDeepEquals(this.xAccountId, other.xAccountId) &&
            Utils.enhancedDeepEquals(this.atsCreateOfferRequestDto, other.atsCreateOfferRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            xAccountId, atsCreateOfferRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsCreateOfferRequest.class,
                "xAccountId", xAccountId,
                "atsCreateOfferRequestDto", atsCreateOfferRequestDto);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String xAccountId;

        private AtsCreateOfferRequestDto atsCreateOfferRequestDto;

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


        public Builder atsCreateOfferRequestDto(AtsCreateOfferRequestDto atsCreateOfferRequestDto) {
            Utils.checkNotNull(atsCreateOfferRequestDto, "atsCreateOfferRequestDto");
            this.atsCreateOfferRequestDto = atsCreateOfferRequestDto;
            return this;
        }

        public AtsCreateOfferRequest build() {

            return new AtsCreateOfferRequest(
                xAccountId, atsCreateOfferRequestDto);
        }

    }
}
