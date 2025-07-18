/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.AtsCreateCandidateRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class AtsCreateCandidateRequest {
    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private AtsCreateCandidateRequestDto atsCreateCandidateRequestDto;

    @JsonCreator
    public AtsCreateCandidateRequest(
            String xAccountId,
            AtsCreateCandidateRequestDto atsCreateCandidateRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(atsCreateCandidateRequestDto, "atsCreateCandidateRequestDto");
        this.xAccountId = xAccountId;
        this.atsCreateCandidateRequestDto = atsCreateCandidateRequestDto;
    }

    /**
     * The account identifier
     */
    @JsonIgnore
    public String xAccountId() {
        return xAccountId;
    }

    @JsonIgnore
    public AtsCreateCandidateRequestDto atsCreateCandidateRequestDto() {
        return atsCreateCandidateRequestDto;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The account identifier
     */
    public AtsCreateCandidateRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsCreateCandidateRequest withAtsCreateCandidateRequestDto(AtsCreateCandidateRequestDto atsCreateCandidateRequestDto) {
        Utils.checkNotNull(atsCreateCandidateRequestDto, "atsCreateCandidateRequestDto");
        this.atsCreateCandidateRequestDto = atsCreateCandidateRequestDto;
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
        AtsCreateCandidateRequest other = (AtsCreateCandidateRequest) o;
        return 
            Utils.enhancedDeepEquals(this.xAccountId, other.xAccountId) &&
            Utils.enhancedDeepEquals(this.atsCreateCandidateRequestDto, other.atsCreateCandidateRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            xAccountId, atsCreateCandidateRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsCreateCandidateRequest.class,
                "xAccountId", xAccountId,
                "atsCreateCandidateRequestDto", atsCreateCandidateRequestDto);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String xAccountId;

        private AtsCreateCandidateRequestDto atsCreateCandidateRequestDto;

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


        public Builder atsCreateCandidateRequestDto(AtsCreateCandidateRequestDto atsCreateCandidateRequestDto) {
            Utils.checkNotNull(atsCreateCandidateRequestDto, "atsCreateCandidateRequestDto");
            this.atsCreateCandidateRequestDto = atsCreateCandidateRequestDto;
            return this;
        }

        public AtsCreateCandidateRequest build() {

            return new AtsCreateCandidateRequest(
                xAccountId, atsCreateCandidateRequestDto);
        }

    }
}
