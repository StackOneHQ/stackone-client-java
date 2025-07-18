/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class Offer {
    /**
     * Unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * Provider's unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_id")
    private JsonNullable<String> remoteId;

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unified_custom_fields")
    private JsonNullable<? extends Map<String, Object>> unifiedCustomFields;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("application_id")
    private JsonNullable<String> applicationId;

    /**
     * Provider's unique identifier of the application
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_application_id")
    private JsonNullable<String> remoteApplicationId;

    /**
     * Date of creation
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private JsonNullable<OffsetDateTime> startDate;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offer_status")
    private JsonNullable<? extends OfferStatus> offerStatus;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("salary")
    private JsonNullable<Double> salary;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<String> currency;

    /**
     * Date of creation
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private JsonNullable<OffsetDateTime> createdAt;

    /**
     * Date of last update
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<OffsetDateTime> updatedAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offer_history")
    private JsonNullable<? extends List<OfferHistory>> offerHistory;

    @JsonCreator
    public Offer(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("unified_custom_fields") JsonNullable<? extends Map<String, Object>> unifiedCustomFields,
            @JsonProperty("application_id") JsonNullable<String> applicationId,
            @JsonProperty("remote_application_id") JsonNullable<String> remoteApplicationId,
            @JsonProperty("start_date") JsonNullable<OffsetDateTime> startDate,
            @JsonProperty("offer_status") JsonNullable<? extends OfferStatus> offerStatus,
            @JsonProperty("salary") JsonNullable<Double> salary,
            @JsonProperty("currency") JsonNullable<String> currency,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("offer_history") JsonNullable<? extends List<OfferHistory>> offerHistory) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        Utils.checkNotNull(applicationId, "applicationId");
        Utils.checkNotNull(remoteApplicationId, "remoteApplicationId");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(offerStatus, "offerStatus");
        Utils.checkNotNull(salary, "salary");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(offerHistory, "offerHistory");
        this.id = id;
        this.remoteId = remoteId;
        this.unifiedCustomFields = unifiedCustomFields;
        this.applicationId = applicationId;
        this.remoteApplicationId = remoteApplicationId;
        this.startDate = startDate;
        this.offerStatus = offerStatus;
        this.salary = salary;
        this.currency = currency;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.offerHistory = offerHistory;
    }
    
    public Offer() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * Provider's unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> remoteId() {
        return remoteId;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> unifiedCustomFields() {
        return (JsonNullable<Map<String, Object>>) unifiedCustomFields;
    }

    @JsonIgnore
    public JsonNullable<String> applicationId() {
        return applicationId;
    }

    /**
     * Provider's unique identifier of the application
     */
    @JsonIgnore
    public JsonNullable<String> remoteApplicationId() {
        return remoteApplicationId;
    }

    /**
     * Date of creation
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> startDate() {
        return startDate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<OfferStatus> offerStatus() {
        return (JsonNullable<OfferStatus>) offerStatus;
    }

    @JsonIgnore
    public JsonNullable<Double> salary() {
        return salary;
    }

    @JsonIgnore
    public JsonNullable<String> currency() {
        return currency;
    }

    /**
     * Date of creation
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * Date of last update
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<OfferHistory>> offerHistory() {
        return (JsonNullable<List<OfferHistory>>) offerHistory;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Unique identifier
     */
    public Offer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public Offer withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public Offer withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public Offer withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public Offer withUnifiedCustomFields(Map<String, Object> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public Offer withUnifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = unifiedCustomFields;
        return this;
    }

    public Offer withApplicationId(String applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = JsonNullable.of(applicationId);
        return this;
    }

    public Offer withApplicationId(JsonNullable<String> applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Provider's unique identifier of the application
     */
    public Offer withRemoteApplicationId(String remoteApplicationId) {
        Utils.checkNotNull(remoteApplicationId, "remoteApplicationId");
        this.remoteApplicationId = JsonNullable.of(remoteApplicationId);
        return this;
    }

    /**
     * Provider's unique identifier of the application
     */
    public Offer withRemoteApplicationId(JsonNullable<String> remoteApplicationId) {
        Utils.checkNotNull(remoteApplicationId, "remoteApplicationId");
        this.remoteApplicationId = remoteApplicationId;
        return this;
    }

    /**
     * Date of creation
     */
    public Offer withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = JsonNullable.of(startDate);
        return this;
    }

    /**
     * Date of creation
     */
    public Offer withStartDate(JsonNullable<OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    public Offer withOfferStatus(OfferStatus offerStatus) {
        Utils.checkNotNull(offerStatus, "offerStatus");
        this.offerStatus = JsonNullable.of(offerStatus);
        return this;
    }

    public Offer withOfferStatus(JsonNullable<? extends OfferStatus> offerStatus) {
        Utils.checkNotNull(offerStatus, "offerStatus");
        this.offerStatus = offerStatus;
        return this;
    }

    public Offer withSalary(double salary) {
        Utils.checkNotNull(salary, "salary");
        this.salary = JsonNullable.of(salary);
        return this;
    }

    public Offer withSalary(JsonNullable<Double> salary) {
        Utils.checkNotNull(salary, "salary");
        this.salary = salary;
        return this;
    }

    public Offer withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    public Offer withCurrency(JsonNullable<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Date of creation
     */
    public Offer withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * Date of creation
     */
    public Offer withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Date of last update
     */
    public Offer withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Date of last update
     */
    public Offer withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public Offer withOfferHistory(List<OfferHistory> offerHistory) {
        Utils.checkNotNull(offerHistory, "offerHistory");
        this.offerHistory = JsonNullable.of(offerHistory);
        return this;
    }

    public Offer withOfferHistory(JsonNullable<? extends List<OfferHistory>> offerHistory) {
        Utils.checkNotNull(offerHistory, "offerHistory");
        this.offerHistory = offerHistory;
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
        Offer other = (Offer) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.remoteId, other.remoteId) &&
            Utils.enhancedDeepEquals(this.unifiedCustomFields, other.unifiedCustomFields) &&
            Utils.enhancedDeepEquals(this.applicationId, other.applicationId) &&
            Utils.enhancedDeepEquals(this.remoteApplicationId, other.remoteApplicationId) &&
            Utils.enhancedDeepEquals(this.startDate, other.startDate) &&
            Utils.enhancedDeepEquals(this.offerStatus, other.offerStatus) &&
            Utils.enhancedDeepEquals(this.salary, other.salary) &&
            Utils.enhancedDeepEquals(this.currency, other.currency) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt) &&
            Utils.enhancedDeepEquals(this.offerHistory, other.offerHistory);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, remoteId, unifiedCustomFields,
            applicationId, remoteApplicationId, startDate,
            offerStatus, salary, currency,
            createdAt, updatedAt, offerHistory);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Offer.class,
                "id", id,
                "remoteId", remoteId,
                "unifiedCustomFields", unifiedCustomFields,
                "applicationId", applicationId,
                "remoteApplicationId", remoteApplicationId,
                "startDate", startDate,
                "offerStatus", offerStatus,
                "salary", salary,
                "currency", currency,
                "createdAt", createdAt,
                "updatedAt", updatedAt,
                "offerHistory", offerHistory);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

        private JsonNullable<String> remoteId = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> unifiedCustomFields = JsonNullable.undefined();

        private JsonNullable<String> applicationId = JsonNullable.undefined();

        private JsonNullable<String> remoteApplicationId = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> startDate = JsonNullable.undefined();

        private JsonNullable<? extends OfferStatus> offerStatus = JsonNullable.undefined();

        private JsonNullable<Double> salary = JsonNullable.undefined();

        private JsonNullable<String> currency = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();

        private JsonNullable<? extends List<OfferHistory>> offerHistory = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Unique identifier
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * Provider's unique identifier
         */
        public Builder remoteId(String remoteId) {
            Utils.checkNotNull(remoteId, "remoteId");
            this.remoteId = JsonNullable.of(remoteId);
            return this;
        }

        /**
         * Provider's unique identifier
         */
        public Builder remoteId(JsonNullable<String> remoteId) {
            Utils.checkNotNull(remoteId, "remoteId");
            this.remoteId = remoteId;
            return this;
        }


        /**
         * Custom Unified Fields configured in your StackOne project
         */
        public Builder unifiedCustomFields(Map<String, Object> unifiedCustomFields) {
            Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
            this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
            return this;
        }

        /**
         * Custom Unified Fields configured in your StackOne project
         */
        public Builder unifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
            Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
            this.unifiedCustomFields = unifiedCustomFields;
            return this;
        }


        public Builder applicationId(String applicationId) {
            Utils.checkNotNull(applicationId, "applicationId");
            this.applicationId = JsonNullable.of(applicationId);
            return this;
        }

        public Builder applicationId(JsonNullable<String> applicationId) {
            Utils.checkNotNull(applicationId, "applicationId");
            this.applicationId = applicationId;
            return this;
        }


        /**
         * Provider's unique identifier of the application
         */
        public Builder remoteApplicationId(String remoteApplicationId) {
            Utils.checkNotNull(remoteApplicationId, "remoteApplicationId");
            this.remoteApplicationId = JsonNullable.of(remoteApplicationId);
            return this;
        }

        /**
         * Provider's unique identifier of the application
         */
        public Builder remoteApplicationId(JsonNullable<String> remoteApplicationId) {
            Utils.checkNotNull(remoteApplicationId, "remoteApplicationId");
            this.remoteApplicationId = remoteApplicationId;
            return this;
        }


        /**
         * Date of creation
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = JsonNullable.of(startDate);
            return this;
        }

        /**
         * Date of creation
         */
        public Builder startDate(JsonNullable<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }


        public Builder offerStatus(OfferStatus offerStatus) {
            Utils.checkNotNull(offerStatus, "offerStatus");
            this.offerStatus = JsonNullable.of(offerStatus);
            return this;
        }

        public Builder offerStatus(JsonNullable<? extends OfferStatus> offerStatus) {
            Utils.checkNotNull(offerStatus, "offerStatus");
            this.offerStatus = offerStatus;
            return this;
        }


        public Builder salary(double salary) {
            Utils.checkNotNull(salary, "salary");
            this.salary = JsonNullable.of(salary);
            return this;
        }

        public Builder salary(JsonNullable<Double> salary) {
            Utils.checkNotNull(salary, "salary");
            this.salary = salary;
            return this;
        }


        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = JsonNullable.of(currency);
            return this;
        }

        public Builder currency(JsonNullable<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }


        /**
         * Date of creation
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = JsonNullable.of(createdAt);
            return this;
        }

        /**
         * Date of creation
         */
        public Builder createdAt(JsonNullable<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }


        /**
         * Date of last update
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = JsonNullable.of(updatedAt);
            return this;
        }

        /**
         * Date of last update
         */
        public Builder updatedAt(JsonNullable<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }


        public Builder offerHistory(List<OfferHistory> offerHistory) {
            Utils.checkNotNull(offerHistory, "offerHistory");
            this.offerHistory = JsonNullable.of(offerHistory);
            return this;
        }

        public Builder offerHistory(JsonNullable<? extends List<OfferHistory>> offerHistory) {
            Utils.checkNotNull(offerHistory, "offerHistory");
            this.offerHistory = offerHistory;
            return this;
        }

        public Offer build() {

            return new Offer(
                id, remoteId, unifiedCustomFields,
                applicationId, remoteApplicationId, startDate,
                offerStatus, salary, currency,
                createdAt, updatedAt, offerHistory);
        }

    }
}
