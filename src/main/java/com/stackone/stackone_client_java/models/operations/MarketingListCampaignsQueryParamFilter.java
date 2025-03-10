/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * MarketingListCampaignsQueryParamFilter - Filter parameters that allow greater customisation of the list response
 */

public class MarketingListCampaignsQueryParamFilter {

    /**
     * Use a string with a date to only select results updated after that given date
     */
    @SpeakeasyMetadata("queryParam:name=updated_after")
    private JsonNullable<String> updatedAfter;

    @JsonCreator
    public MarketingListCampaignsQueryParamFilter(
            JsonNullable<String> updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = updatedAfter;
    }
    
    public MarketingListCampaignsQueryParamFilter() {
        this(JsonNullable.undefined());
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    @JsonIgnore
    public JsonNullable<String> updatedAfter() {
        return updatedAfter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    public MarketingListCampaignsQueryParamFilter withUpdatedAfter(String updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = JsonNullable.of(updatedAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    public MarketingListCampaignsQueryParamFilter withUpdatedAfter(JsonNullable<String> updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = updatedAfter;
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
        MarketingListCampaignsQueryParamFilter other = (MarketingListCampaignsQueryParamFilter) o;
        return 
            Objects.deepEquals(this.updatedAfter, other.updatedAfter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            updatedAfter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingListCampaignsQueryParamFilter.class,
                "updatedAfter", updatedAfter);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> updatedAfter = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Use a string with a date to only select results updated after that given date
         */
        public Builder updatedAfter(String updatedAfter) {
            Utils.checkNotNull(updatedAfter, "updatedAfter");
            this.updatedAfter = JsonNullable.of(updatedAfter);
            return this;
        }

        /**
         * Use a string with a date to only select results updated after that given date
         */
        public Builder updatedAfter(JsonNullable<String> updatedAfter) {
            Utils.checkNotNull(updatedAfter, "updatedAfter");
            this.updatedAfter = updatedAfter;
            return this;
        }
        
        public MarketingListCampaignsQueryParamFilter build() {
            return new MarketingListCampaignsQueryParamFilter(
                updatedAfter);
        }
    }
}

