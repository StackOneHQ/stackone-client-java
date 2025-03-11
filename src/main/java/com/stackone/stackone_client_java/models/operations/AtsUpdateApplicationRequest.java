/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.AtsUpdateApplicationRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class AtsUpdateApplicationRequest {

    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private AtsUpdateApplicationRequestDto atsUpdateApplicationRequestDto;

    @JsonCreator
    public AtsUpdateApplicationRequest(
            String xAccountId,
            String id,
            AtsUpdateApplicationRequestDto atsUpdateApplicationRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(atsUpdateApplicationRequestDto, "atsUpdateApplicationRequestDto");
        this.xAccountId = xAccountId;
        this.id = id;
        this.atsUpdateApplicationRequestDto = atsUpdateApplicationRequestDto;
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
    public AtsUpdateApplicationRequestDto atsUpdateApplicationRequestDto() {
        return atsUpdateApplicationRequestDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account identifier
     */
    public AtsUpdateApplicationRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsUpdateApplicationRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsUpdateApplicationRequest withAtsUpdateApplicationRequestDto(AtsUpdateApplicationRequestDto atsUpdateApplicationRequestDto) {
        Utils.checkNotNull(atsUpdateApplicationRequestDto, "atsUpdateApplicationRequestDto");
        this.atsUpdateApplicationRequestDto = atsUpdateApplicationRequestDto;
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
        AtsUpdateApplicationRequest other = (AtsUpdateApplicationRequest) o;
        return 
            Objects.deepEquals(this.xAccountId, other.xAccountId) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.atsUpdateApplicationRequestDto, other.atsUpdateApplicationRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xAccountId,
            id,
            atsUpdateApplicationRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsUpdateApplicationRequest.class,
                "xAccountId", xAccountId,
                "id", id,
                "atsUpdateApplicationRequestDto", atsUpdateApplicationRequestDto);
    }
    
    public final static class Builder {
 
        private String xAccountId;
 
        private String id;
 
        private AtsUpdateApplicationRequestDto atsUpdateApplicationRequestDto;  
        
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

        public Builder atsUpdateApplicationRequestDto(AtsUpdateApplicationRequestDto atsUpdateApplicationRequestDto) {
            Utils.checkNotNull(atsUpdateApplicationRequestDto, "atsUpdateApplicationRequestDto");
            this.atsUpdateApplicationRequestDto = atsUpdateApplicationRequestDto;
            return this;
        }
        
        public AtsUpdateApplicationRequest build() {
            return new AtsUpdateApplicationRequest(
                xAccountId,
                id,
                atsUpdateApplicationRequestDto);
        }
    }
}

