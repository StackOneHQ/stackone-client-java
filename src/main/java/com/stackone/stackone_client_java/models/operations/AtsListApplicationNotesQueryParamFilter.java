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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AtsListApplicationNotesQueryParamFilter
 * 
 * <p>Filter parameters that allow greater customisation of the list response
 */
public class AtsListApplicationNotesQueryParamFilter {
    /**
     * Use a string with a date to only select results updated after that given date
     */
    @SpeakeasyMetadata("queryParam:name=updated_after")
    private JsonNullable<OffsetDateTime> updatedAfter;

    @JsonCreator
    public AtsListApplicationNotesQueryParamFilter(
            JsonNullable<OffsetDateTime> updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = updatedAfter;
    }
    
    public AtsListApplicationNotesQueryParamFilter() {
        this(JsonNullable.undefined());
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAfter() {
        return updatedAfter;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Use a string with a date to only select results updated after that given date
     */
    public AtsListApplicationNotesQueryParamFilter withUpdatedAfter(OffsetDateTime updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = JsonNullable.of(updatedAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    public AtsListApplicationNotesQueryParamFilter withUpdatedAfter(JsonNullable<OffsetDateTime> updatedAfter) {
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
        AtsListApplicationNotesQueryParamFilter other = (AtsListApplicationNotesQueryParamFilter) o;
        return 
            Utils.enhancedDeepEquals(this.updatedAfter, other.updatedAfter);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            updatedAfter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsListApplicationNotesQueryParamFilter.class,
                "updatedAfter", updatedAfter);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<OffsetDateTime> updatedAfter = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Use a string with a date to only select results updated after that given date
         */
        public Builder updatedAfter(OffsetDateTime updatedAfter) {
            Utils.checkNotNull(updatedAfter, "updatedAfter");
            this.updatedAfter = JsonNullable.of(updatedAfter);
            return this;
        }

        /**
         * Use a string with a date to only select results updated after that given date
         */
        public Builder updatedAfter(JsonNullable<OffsetDateTime> updatedAfter) {
            Utils.checkNotNull(updatedAfter, "updatedAfter");
            this.updatedAfter = updatedAfter;
            return this;
        }

        public AtsListApplicationNotesQueryParamFilter build() {

            return new AtsListApplicationNotesQueryParamFilter(
                updatedAfter);
        }

    }
}
