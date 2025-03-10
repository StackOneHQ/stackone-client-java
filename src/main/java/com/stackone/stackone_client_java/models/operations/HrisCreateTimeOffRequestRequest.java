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
import java.util.Objects;

public class HrisCreateTimeOffRequestRequest {

    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto;

    @JsonCreator
    public HrisCreateTimeOffRequestRequest(
            String xAccountId,
            HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(hrisCreateTimeOffRequestDto, "hrisCreateTimeOffRequestDto");
        this.xAccountId = xAccountId;
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
    public HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto() {
        return hrisCreateTimeOffRequestDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account identifier
     */
    public HrisCreateTimeOffRequestRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisCreateTimeOffRequestRequest withHrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto) {
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
        HrisCreateTimeOffRequestRequest other = (HrisCreateTimeOffRequestRequest) o;
        return 
            Objects.deepEquals(this.xAccountId, other.xAccountId) &&
            Objects.deepEquals(this.hrisCreateTimeOffRequestDto, other.hrisCreateTimeOffRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xAccountId,
            hrisCreateTimeOffRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisCreateTimeOffRequestRequest.class,
                "xAccountId", xAccountId,
                "hrisCreateTimeOffRequestDto", hrisCreateTimeOffRequestDto);
    }
    
    public final static class Builder {
 
        private String xAccountId;
 
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

        public Builder hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto) {
            Utils.checkNotNull(hrisCreateTimeOffRequestDto, "hrisCreateTimeOffRequestDto");
            this.hrisCreateTimeOffRequestDto = hrisCreateTimeOffRequestDto;
            return this;
        }
        
        public HrisCreateTimeOffRequestRequest build() {
            return new HrisCreateTimeOffRequestRequest(
                xAccountId,
                hrisCreateTimeOffRequestDto);
        }
    }
}

