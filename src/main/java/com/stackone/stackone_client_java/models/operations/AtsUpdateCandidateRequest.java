/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.AtsUpdateCandidateRequestDto;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class AtsUpdateCandidateRequest {

    /**
     * The account identifier
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-account-id")
    private String xAccountId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private AtsUpdateCandidateRequestDto atsUpdateCandidateRequestDto;

    @JsonCreator
    public AtsUpdateCandidateRequest(
            String xAccountId,
            String id,
            AtsUpdateCandidateRequestDto atsUpdateCandidateRequestDto) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(atsUpdateCandidateRequestDto, "atsUpdateCandidateRequestDto");
        this.xAccountId = xAccountId;
        this.id = id;
        this.atsUpdateCandidateRequestDto = atsUpdateCandidateRequestDto;
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
    public AtsUpdateCandidateRequestDto atsUpdateCandidateRequestDto() {
        return atsUpdateCandidateRequestDto;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account identifier
     */
    public AtsUpdateCandidateRequest withXAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsUpdateCandidateRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsUpdateCandidateRequest withAtsUpdateCandidateRequestDto(AtsUpdateCandidateRequestDto atsUpdateCandidateRequestDto) {
        Utils.checkNotNull(atsUpdateCandidateRequestDto, "atsUpdateCandidateRequestDto");
        this.atsUpdateCandidateRequestDto = atsUpdateCandidateRequestDto;
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
        AtsUpdateCandidateRequest other = (AtsUpdateCandidateRequest) o;
        return 
            Objects.deepEquals(this.xAccountId, other.xAccountId) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.atsUpdateCandidateRequestDto, other.atsUpdateCandidateRequestDto);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xAccountId,
            id,
            atsUpdateCandidateRequestDto);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsUpdateCandidateRequest.class,
                "xAccountId", xAccountId,
                "id", id,
                "atsUpdateCandidateRequestDto", atsUpdateCandidateRequestDto);
    }
    
    public final static class Builder {
 
        private String xAccountId;
 
        private String id;
 
        private AtsUpdateCandidateRequestDto atsUpdateCandidateRequestDto;  
        
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

        public Builder atsUpdateCandidateRequestDto(AtsUpdateCandidateRequestDto atsUpdateCandidateRequestDto) {
            Utils.checkNotNull(atsUpdateCandidateRequestDto, "atsUpdateCandidateRequestDto");
            this.atsUpdateCandidateRequestDto = atsUpdateCandidateRequestDto;
            return this;
        }
        
        public AtsUpdateCandidateRequest build() {
            return new AtsUpdateCandidateRequest(
                xAccountId,
                id,
                atsUpdateCandidateRequestDto);
        }
    }
}

