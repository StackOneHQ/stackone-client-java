/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.CrmCreateContactRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class CrmCreateContactRequest {

    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CrmCreateContactRequestDto crmCreateContactRequestDto;

    @JsonCreator
    public CrmCreateContactRequest(
            String xAccountId,
            CrmCreateContactRequestDto crmCreateContactRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(crmCreateContactRequestDto, "crmCreateContactRequestDto");
        this.xAccountId = xAccountId;
        this.crmCreateContactRequestDto = crmCreateContactRequestDto;
    }

    /**
     * The account identifier
     */
    @JsonIgnore
    public String xAccountId() {
        return xAccountId;
    }

    @JsonIgnore
    public CrmCreateContactRequestDto crmCreateContactRequestDto() {
        return crmCreateContactRequestDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account identifier
     */
    public CrmCreateContactRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public CrmCreateContactRequest withCrmCreateContactRequestDto(CrmCreateContactRequestDto crmCreateContactRequestDto) {
        Utils.checkNotNull(crmCreateContactRequestDto, "crmCreateContactRequestDto");
        this.crmCreateContactRequestDto = crmCreateContactRequestDto;
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
        CrmCreateContactRequest other = (CrmCreateContactRequest) o;
        return 
            Objects.deepEquals(this.xAccountId, other.xAccountId) &&
            Objects.deepEquals(this.crmCreateContactRequestDto, other.crmCreateContactRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xAccountId,
            crmCreateContactRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmCreateContactRequest.class,
                "xAccountId", xAccountId,
                "crmCreateContactRequestDto", crmCreateContactRequestDto);
    }
    
    public final static class Builder {
 
        private String xAccountId;
 
        private CrmCreateContactRequestDto crmCreateContactRequestDto;  
        
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

        public Builder crmCreateContactRequestDto(CrmCreateContactRequestDto crmCreateContactRequestDto) {
            Utils.checkNotNull(crmCreateContactRequestDto, "crmCreateContactRequestDto");
            this.crmCreateContactRequestDto = crmCreateContactRequestDto;
            return this;
        }
        
        public CrmCreateContactRequest build() {
            return new CrmCreateContactRequest(
                xAccountId,
                crmCreateContactRequestDto);
        }
    }
}

