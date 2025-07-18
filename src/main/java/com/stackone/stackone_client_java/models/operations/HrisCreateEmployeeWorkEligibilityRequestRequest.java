/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class HrisCreateEmployeeWorkEligibilityRequestRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private HrisCreateWorkEligibilityRequestDto hrisCreateWorkEligibilityRequestDto;

    @JsonCreator
    public HrisCreateEmployeeWorkEligibilityRequestRequest(
            String id,
            String xAccountId,
            HrisCreateWorkEligibilityRequestDto hrisCreateWorkEligibilityRequestDto) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(hrisCreateWorkEligibilityRequestDto, "hrisCreateWorkEligibilityRequestDto");
        this.id = id;
        this.xAccountId = xAccountId;
        this.hrisCreateWorkEligibilityRequestDto = hrisCreateWorkEligibilityRequestDto;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * The account identifier
     */
    @JsonIgnore
    public String xAccountId() {
        return xAccountId;
    }

    @JsonIgnore
    public HrisCreateWorkEligibilityRequestDto hrisCreateWorkEligibilityRequestDto() {
        return hrisCreateWorkEligibilityRequestDto;
    }

    public static Builder builder() {
        return new Builder();
    }


    public HrisCreateEmployeeWorkEligibilityRequestRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The account identifier
     */
    public HrisCreateEmployeeWorkEligibilityRequestRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisCreateEmployeeWorkEligibilityRequestRequest withHrisCreateWorkEligibilityRequestDto(HrisCreateWorkEligibilityRequestDto hrisCreateWorkEligibilityRequestDto) {
        Utils.checkNotNull(hrisCreateWorkEligibilityRequestDto, "hrisCreateWorkEligibilityRequestDto");
        this.hrisCreateWorkEligibilityRequestDto = hrisCreateWorkEligibilityRequestDto;
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
        HrisCreateEmployeeWorkEligibilityRequestRequest other = (HrisCreateEmployeeWorkEligibilityRequestRequest) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.xAccountId, other.xAccountId) &&
            Utils.enhancedDeepEquals(this.hrisCreateWorkEligibilityRequestDto, other.hrisCreateWorkEligibilityRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, xAccountId, hrisCreateWorkEligibilityRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisCreateEmployeeWorkEligibilityRequestRequest.class,
                "id", id,
                "xAccountId", xAccountId,
                "hrisCreateWorkEligibilityRequestDto", hrisCreateWorkEligibilityRequestDto);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String id;

        private String xAccountId;

        private HrisCreateWorkEligibilityRequestDto hrisCreateWorkEligibilityRequestDto;

        private Builder() {
          // force use of static builder() method
        }


        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * The account identifier
         */
        public Builder xAccountId(String xAccountId) {
            Utils.checkNotNull(xAccountId, "xAccountId");
            this.xAccountId = xAccountId;
            return this;
        }


        public Builder hrisCreateWorkEligibilityRequestDto(HrisCreateWorkEligibilityRequestDto hrisCreateWorkEligibilityRequestDto) {
            Utils.checkNotNull(hrisCreateWorkEligibilityRequestDto, "hrisCreateWorkEligibilityRequestDto");
            this.hrisCreateWorkEligibilityRequestDto = hrisCreateWorkEligibilityRequestDto;
            return this;
        }

        public HrisCreateEmployeeWorkEligibilityRequestRequest build() {

            return new HrisCreateEmployeeWorkEligibilityRequestRequest(
                id, xAccountId, hrisCreateWorkEligibilityRequestDto);
        }

    }
}
