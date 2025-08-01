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
 * HrisListTimeOffPoliciesQueryParamFilter
 * 
 * <p>HRIS Time-Off Policies filters
 */
public class HrisListTimeOffPoliciesQueryParamFilter {
    /**
     * Use a string with a date to only select results updated after that given date
     */
    @SpeakeasyMetadata("queryParam:name=updated_after")
    private JsonNullable<OffsetDateTime> updatedAfter;

    /**
     * Filter to select time-off policies by type
     */
    @SpeakeasyMetadata("queryParam:name=type")
    private JsonNullable<? extends Type> type;

    @JsonCreator
    public HrisListTimeOffPoliciesQueryParamFilter(
            JsonNullable<OffsetDateTime> updatedAfter,
            JsonNullable<? extends Type> type) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        Utils.checkNotNull(type, "type");
        this.updatedAfter = updatedAfter;
        this.type = type;
    }
    
    public HrisListTimeOffPoliciesQueryParamFilter() {
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
     * Filter to select time-off policies by type
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Type> type() {
        return (JsonNullable<Type>) type;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Use a string with a date to only select results updated after that given date
     */
    public HrisListTimeOffPoliciesQueryParamFilter withUpdatedAfter(OffsetDateTime updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = JsonNullable.of(updatedAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results updated after that given date
     */
    public HrisListTimeOffPoliciesQueryParamFilter withUpdatedAfter(JsonNullable<OffsetDateTime> updatedAfter) {
        Utils.checkNotNull(updatedAfter, "updatedAfter");
        this.updatedAfter = updatedAfter;
        return this;
    }

    /**
     * Filter to select time-off policies by type
     */
    public HrisListTimeOffPoliciesQueryParamFilter withType(Type type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * Filter to select time-off policies by type
     */
    public HrisListTimeOffPoliciesQueryParamFilter withType(JsonNullable<? extends Type> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        HrisListTimeOffPoliciesQueryParamFilter other = (HrisListTimeOffPoliciesQueryParamFilter) o;
        return 
            Utils.enhancedDeepEquals(this.updatedAfter, other.updatedAfter) &&
            Utils.enhancedDeepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            updatedAfter, type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisListTimeOffPoliciesQueryParamFilter.class,
                "updatedAfter", updatedAfter,
                "type", type);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<OffsetDateTime> updatedAfter = JsonNullable.undefined();

        private JsonNullable<? extends Type> type = JsonNullable.undefined();

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
         * Filter to select time-off policies by type
         */
        public Builder type(Type type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * Filter to select time-off policies by type
         */
        public Builder type(JsonNullable<? extends Type> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public HrisListTimeOffPoliciesQueryParamFilter build() {

            return new HrisListTimeOffPoliciesQueryParamFilter(
                updatedAfter, type);
        }

    }
}
