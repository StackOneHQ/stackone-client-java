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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LmsListAssignmentsQueryParamFilter
 * 
 * <p>LMS Assignment Filter
 */
public class LmsListAssignmentsQueryParamFilter {
    /**
     * Use a string with a date to only select results updated after that given date
     */
    @SpeakeasyMetadata("queryParam:name=updated_after")
    private JsonNullable<OffsetDateTime> updatedAfter;

    /**
     * Filter to select assignment by status
     */
    @SpeakeasyMetadata("queryParam:name=status")
    private JsonNullable<? extends LmsListAssignmentsQueryParamStatus> status;

    @JsonCreator
    public LmsListAssignmentsQueryParamFilter(
            JsonNullable<OffsetDateTime> updatedAfter,
            JsonNullable<? extends LmsListAssignmentsQueryParamStatus> status) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        Utils.checkNotNull(status, "status");
        this.updatedAfter = updatedAfter;
        this.status = status;
    }
    
    public LmsListAssignmentsQueryParamFilter() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAfter() {
        return updatedAfter;
    }

    /**
     * Filter to select assignment by status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<LmsListAssignmentsQueryParamStatus> status() {
        return (JsonNullable<LmsListAssignmentsQueryParamStatus>) status;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Use a string with a date to only select results updated after that given date
     */
    public LmsListAssignmentsQueryParamFilter withUpdatedAfter(OffsetDateTime updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = JsonNullable.of(updatedAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    public LmsListAssignmentsQueryParamFilter withUpdatedAfter(JsonNullable<OffsetDateTime> updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = updatedAfter;
        return this;
    }

    /**
     * Filter to select assignment by status
     */
    public LmsListAssignmentsQueryParamFilter withStatus(LmsListAssignmentsQueryParamStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * Filter to select assignment by status
     */
    public LmsListAssignmentsQueryParamFilter withStatus(JsonNullable<? extends LmsListAssignmentsQueryParamStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        LmsListAssignmentsQueryParamFilter other = (LmsListAssignmentsQueryParamFilter) o;
        return 
            Utils.enhancedDeepEquals(this.updatedAfter, other.updatedAfter) &&
            Utils.enhancedDeepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            updatedAfter, status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LmsListAssignmentsQueryParamFilter.class,
                "updatedAfter", updatedAfter,
                "status", status);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<OffsetDateTime> updatedAfter = JsonNullable.undefined();

        private JsonNullable<? extends LmsListAssignmentsQueryParamStatus> status = JsonNullable.undefined();

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


        /**
         * Filter to select assignment by status
         */
        public Builder status(LmsListAssignmentsQueryParamStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * Filter to select assignment by status
         */
        public Builder status(JsonNullable<? extends LmsListAssignmentsQueryParamStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public LmsListAssignmentsQueryParamFilter build() {

            return new LmsListAssignmentsQueryParamFilter(
                updatedAfter, status);
        }

    }
}
