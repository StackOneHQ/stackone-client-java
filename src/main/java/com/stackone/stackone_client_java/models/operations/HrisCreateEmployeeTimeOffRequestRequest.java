/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;


public class HrisCreateEmployeeTimeOffRequestRequest {
    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;


    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto;

    @JsonCreator
    public HrisCreateEmployeeTimeOffRequestRequest(
            String xAccountId,
            String id,
            HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(hrisCreateTimeOffRequestDto, "hrisCreateTimeOffRequestDto");
        this.xAccountId = xAccountId;
        this.id = id;
        this.hrisCreateTimeOffRequestDto = hrisCreateTimeOffRequestDto;
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
    public HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto() {
        return hrisCreateTimeOffRequestDto;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The account identifier
     */
    public HrisCreateEmployeeTimeOffRequestRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisCreateEmployeeTimeOffRequestRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisCreateEmployeeTimeOffRequestRequest withHrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto) {
        Utils.checkNotNull(hrisCreateTimeOffRequestDto, "hrisCreateTimeOffRequestDto");
        this.hrisCreateTimeOffRequestDto = hrisCreateTimeOffRequestDto;
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
        HrisCreateEmployeeTimeOffRequestRequest other = (HrisCreateEmployeeTimeOffRequestRequest) o;
        return 
            Utils.enhancedDeepEquals(this.xAccountId, other.xAccountId) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.hrisCreateTimeOffRequestDto, other.hrisCreateTimeOffRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            xAccountId, id, hrisCreateTimeOffRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisCreateEmployeeTimeOffRequestRequest.class,
                "xAccountId", xAccountId,
                "id", id,
                "hrisCreateTimeOffRequestDto", hrisCreateTimeOffRequestDto);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String xAccountId;

        private String id;

        private HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto;

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


        public Builder hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto) {
            Utils.checkNotNull(hrisCreateTimeOffRequestDto, "hrisCreateTimeOffRequestDto");
            this.hrisCreateTimeOffRequestDto = hrisCreateTimeOffRequestDto;
            return this;
        }

        public HrisCreateEmployeeTimeOffRequestRequest build() {

            return new HrisCreateEmployeeTimeOffRequestRequest(
                xAccountId, id, hrisCreateTimeOffRequestDto);
        }

    }
}
