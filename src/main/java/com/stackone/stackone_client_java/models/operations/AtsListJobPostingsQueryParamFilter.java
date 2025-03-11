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
 * AtsListJobPostingsQueryParamFilter - ATS Job Postings Filter
 */

public class AtsListJobPostingsQueryParamFilter {

    /**
     * Use a string with a date to only select results updated after that given date
     */
    @SpeakeasyMetadata("queryParam:name=updated_after")
    private JsonNullable<String> updatedAfter;

    /**
     * Use a string with a date to only select results created after that given date
     */
    @SpeakeasyMetadata("queryParam:name=created_after")
    private JsonNullable<String> createdAfter;

    @JsonCreator
    public AtsListJobPostingsQueryParamFilter(
            JsonNullable<String> updatedAfter,
            JsonNullable<String> createdAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        Utils.checkNotNull(createdAfter, "createdAfter");
        this.updatedAfter = updatedAfter;
        this.createdAfter = createdAfter;
    }
    
    public AtsListJobPostingsQueryParamFilter() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    @JsonIgnore
    public JsonNullable<String> updatedAfter() {
        return updatedAfter;
    }

    /**
     * Use a string with a date to only select results created after that given date
     */
    @JsonIgnore
    public JsonNullable<String> createdAfter() {
        return createdAfter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    public AtsListJobPostingsQueryParamFilter withUpdatedAfter(String updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = JsonNullable.of(updatedAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    public AtsListJobPostingsQueryParamFilter withUpdatedAfter(JsonNullable<String> updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = updatedAfter;
        return this;
    }

    /**
     * Use a string with a date to only select results created after that given date
     */
    public AtsListJobPostingsQueryParamFilter withCreatedAfter(String createdAfter) {
        Utils.checkNotNull(createdAfter, "createdAfter");
        this.createdAfter = JsonNullable.of(createdAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results created after that given date
     */
    public AtsListJobPostingsQueryParamFilter withCreatedAfter(JsonNullable<String> createdAfter) {
        Utils.checkNotNull(createdAfter, "createdAfter");
        this.createdAfter = createdAfter;
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
        AtsListJobPostingsQueryParamFilter other = (AtsListJobPostingsQueryParamFilter) o;
        return 
            Objects.deepEquals(this.updatedAfter, other.updatedAfter) &&
            Objects.deepEquals(this.createdAfter, other.createdAfter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            updatedAfter,
            createdAfter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsListJobPostingsQueryParamFilter.class,
                "updatedAfter", updatedAfter,
                "createdAfter", createdAfter);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> updatedAfter = JsonNullable.undefined();
 
        private JsonNullable<String> createdAfter = JsonNullable.undefined();  
        
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

        /**
         * Use a string with a date to only select results created after that given date
         */
        public Builder createdAfter(String createdAfter) {
            Utils.checkNotNull(createdAfter, "createdAfter");
            this.createdAfter = JsonNullable.of(createdAfter);
            return this;
        }

        /**
         * Use a string with a date to only select results created after that given date
         */
        public Builder createdAfter(JsonNullable<String> createdAfter) {
            Utils.checkNotNull(createdAfter, "createdAfter");
            this.createdAfter = createdAfter;
            return this;
        }
        
        public AtsListJobPostingsQueryParamFilter build() {
            return new AtsListJobPostingsQueryParamFilter(
                updatedAfter,
                createdAfter);
        }
    }
}

