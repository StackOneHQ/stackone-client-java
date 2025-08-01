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
 * AtsListApplicationChangesQueryParamFilter
 * 
 * <p>Filter parameters for application changes (supports created_after and change_type)
 */
public class AtsListApplicationChangesQueryParamFilter {
    /**
     * Use a string with a date to only select results created after that given date
     */
    @SpeakeasyMetadata("queryParam:name=created_after")
    private JsonNullable<OffsetDateTime> createdAfter;

    /**
     * Filter by the type of change that occurred to the application
     */
    @SpeakeasyMetadata("queryParam:name=change_type")
    private JsonNullable<? extends ChangeType> changeType;

    @JsonCreator
    public AtsListApplicationChangesQueryParamFilter(
            JsonNullable<OffsetDateTime> createdAfter,
            JsonNullable<? extends ChangeType> changeType) {
        Utils.checkNotNull(createdAfter, "createdAfter");
        Utils.checkNotNull(changeType, "changeType");
        this.createdAfter = createdAfter;
        this.changeType = changeType;
    }
    
    public AtsListApplicationChangesQueryParamFilter() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Use a string with a date to only select results created after that given date
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAfter() {
        return createdAfter;
    }

    /**
     * Filter by the type of change that occurred to the application
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ChangeType> changeType() {
        return (JsonNullable<ChangeType>) changeType;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Use a string with a date to only select results created after that given date
     */
    public AtsListApplicationChangesQueryParamFilter withCreatedAfter(OffsetDateTime createdAfter) {
        Utils.checkNotNull(createdAfter, "createdAfter");
        this.createdAfter = JsonNullable.of(createdAfter);
        return this;
    }

    /**
     * Use a string with a date to only select results created after that given date
     */
    public AtsListApplicationChangesQueryParamFilter withCreatedAfter(JsonNullable<OffsetDateTime> createdAfter) {
        Utils.checkNotNull(createdAfter, "createdAfter");
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * Filter by the type of change that occurred to the application
     */
    public AtsListApplicationChangesQueryParamFilter withChangeType(ChangeType changeType) {
        Utils.checkNotNull(changeType, "changeType");
        this.changeType = JsonNullable.of(changeType);
        return this;
    }

    /**
     * Filter by the type of change that occurred to the application
     */
    public AtsListApplicationChangesQueryParamFilter withChangeType(JsonNullable<? extends ChangeType> changeType) {
        Utils.checkNotNull(changeType, "changeType");
        this.changeType = changeType;
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
        AtsListApplicationChangesQueryParamFilter other = (AtsListApplicationChangesQueryParamFilter) o;
        return 
            Utils.enhancedDeepEquals(this.createdAfter, other.createdAfter) &&
            Utils.enhancedDeepEquals(this.changeType, other.changeType);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            createdAfter, changeType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsListApplicationChangesQueryParamFilter.class,
                "createdAfter", createdAfter,
                "changeType", changeType);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<OffsetDateTime> createdAfter = JsonNullable.undefined();

        private JsonNullable<? extends ChangeType> changeType = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Use a string with a date to only select results created after that given date
         */
        public Builder createdAfter(OffsetDateTime createdAfter) {
            Utils.checkNotNull(createdAfter, "createdAfter");
            this.createdAfter = JsonNullable.of(createdAfter);
            return this;
        }

        /**
         * Use a string with a date to only select results created after that given date
         */
        public Builder createdAfter(JsonNullable<OffsetDateTime> createdAfter) {
            Utils.checkNotNull(createdAfter, "createdAfter");
            this.createdAfter = createdAfter;
            return this;
        }


        /**
         * Filter by the type of change that occurred to the application
         */
        public Builder changeType(ChangeType changeType) {
            Utils.checkNotNull(changeType, "changeType");
            this.changeType = JsonNullable.of(changeType);
            return this;
        }

        /**
         * Filter by the type of change that occurred to the application
         */
        public Builder changeType(JsonNullable<? extends ChangeType> changeType) {
            Utils.checkNotNull(changeType, "changeType");
            this.changeType = changeType;
            return this;
        }

        public AtsListApplicationChangesQueryParamFilter build() {

            return new AtsListApplicationChangesQueryParamFilter(
                createdAfter, changeType);
        }

    }
}
