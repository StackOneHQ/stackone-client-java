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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class Contact {
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

    /**
     * The contact first name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<String> firstName;

    /**
     * The contact last name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<String> lastName;

    /**
     * The contact company name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    private JsonNullable<String> companyName;

    /**
     * List of contact email addresses
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    private JsonNullable<? extends List<String>> emails;

    /**
     * List of contact phone numbers
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_numbers")
    private JsonNullable<? extends List<String>> phoneNumbers;

    /**
     * List of associated deal IDs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deal_ids")
    private JsonNullable<? extends List<String>> dealIds;

    /**
     * Provider's list of associated deal IDs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_deal_ids")
    private JsonNullable<? extends List<String>> remoteDealIds;

    /**
     * List of associated account IDs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_ids")
    private JsonNullable<? extends List<String>> accountIds;

    /**
     * Provider's list of associated account IDs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_account_ids")
    private JsonNullable<? extends List<String>> remoteAccountIds;

    /**
     * Contact custom fields
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_fields")
    private JsonNullable<? extends List<CustomFields>> customFields;

    /**
     * Timestamp when the contact was created
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private JsonNullable<OffsetDateTime> createdAt;

    /**
     * Timestamp when the contact was last updated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<OffsetDateTime> updatedAt;

    @JsonCreator
    public Contact(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("unified_custom_fields") JsonNullable<? extends Map<String, Object>> unifiedCustomFields,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("company_name") JsonNullable<String> companyName,
            @JsonProperty("emails") JsonNullable<? extends List<String>> emails,
            @JsonProperty("phone_numbers") JsonNullable<? extends List<String>> phoneNumbers,
            @JsonProperty("deal_ids") JsonNullable<? extends List<String>> dealIds,
            @JsonProperty("remote_deal_ids") JsonNullable<? extends List<String>> remoteDealIds,
            @JsonProperty("account_ids") JsonNullable<? extends List<String>> accountIds,
            @JsonProperty("remote_account_ids") JsonNullable<? extends List<String>> remoteAccountIds,
            @JsonProperty("custom_fields") JsonNullable<? extends List<CustomFields>> customFields,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(emails, "emails");
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        Utils.checkNotNull(dealIds, "dealIds");
        Utils.checkNotNull(remoteDealIds, "remoteDealIds");
        Utils.checkNotNull(accountIds, "accountIds");
        Utils.checkNotNull(remoteAccountIds, "remoteAccountIds");
        Utils.checkNotNull(customFields, "customFields");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.id = id;
        this.remoteId = remoteId;
        this.unifiedCustomFields = unifiedCustomFields;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
        this.dealIds = dealIds;
        this.remoteDealIds = remoteDealIds;
        this.accountIds = accountIds;
        this.remoteAccountIds = remoteAccountIds;
        this.customFields = customFields;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Contact() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
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

    /**
     * The contact first name
     */
    @JsonIgnore
    public JsonNullable<String> firstName() {
        return firstName;
    }

    /**
     * The contact last name
     */
    @JsonIgnore
    public JsonNullable<String> lastName() {
        return lastName;
    }

    /**
     * The contact company name
     */
    @JsonIgnore
    public JsonNullable<String> companyName() {
        return companyName;
    }

    /**
     * List of contact email addresses
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> emails() {
        return (JsonNullable<List<String>>) emails;
    }

    /**
     * List of contact phone numbers
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> phoneNumbers() {
        return (JsonNullable<List<String>>) phoneNumbers;
    }

    /**
     * List of associated deal IDs
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> dealIds() {
        return (JsonNullable<List<String>>) dealIds;
    }

    /**
     * Provider's list of associated deal IDs
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> remoteDealIds() {
        return (JsonNullable<List<String>>) remoteDealIds;
    }

    /**
     * List of associated account IDs
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> accountIds() {
        return (JsonNullable<List<String>>) accountIds;
    }

    /**
     * Provider's list of associated account IDs
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> remoteAccountIds() {
        return (JsonNullable<List<String>>) remoteAccountIds;
    }

    /**
     * Contact custom fields
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<CustomFields>> customFields() {
        return (JsonNullable<List<CustomFields>>) customFields;
    }

    /**
     * Timestamp when the contact was created
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * Timestamp when the contact was last updated
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Unique identifier
     */
    public Contact withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public Contact withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public Contact withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public Contact withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public Contact withUnifiedCustomFields(Map<String, Object> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public Contact withUnifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = unifiedCustomFields;
        return this;
    }

    /**
     * The contact first name
     */
    public Contact withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * The contact first name
     */
    public Contact withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * The contact last name
     */
    public Contact withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * The contact last name
     */
    public Contact withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * The contact company name
     */
    public Contact withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = JsonNullable.of(companyName);
        return this;
    }

    /**
     * The contact company name
     */
    public Contact withCompanyName(JsonNullable<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    /**
     * List of contact email addresses
     */
    public Contact withEmails(List<String> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = JsonNullable.of(emails);
        return this;
    }

    /**
     * List of contact email addresses
     */
    public Contact withEmails(JsonNullable<? extends List<String>> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
        return this;
    }

    /**
     * List of contact phone numbers
     */
    public Contact withPhoneNumbers(List<String> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = JsonNullable.of(phoneNumbers);
        return this;
    }

    /**
     * List of contact phone numbers
     */
    public Contact withPhoneNumbers(JsonNullable<? extends List<String>> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * List of associated deal IDs
     */
    public Contact withDealIds(List<String> dealIds) {
        Utils.checkNotNull(dealIds, "dealIds");
        this.dealIds = JsonNullable.of(dealIds);
        return this;
    }

    /**
     * List of associated deal IDs
     */
    public Contact withDealIds(JsonNullable<? extends List<String>> dealIds) {
        Utils.checkNotNull(dealIds, "dealIds");
        this.dealIds = dealIds;
        return this;
    }

    /**
     * Provider's list of associated deal IDs
     */
    public Contact withRemoteDealIds(List<String> remoteDealIds) {
        Utils.checkNotNull(remoteDealIds, "remoteDealIds");
        this.remoteDealIds = JsonNullable.of(remoteDealIds);
        return this;
    }

    /**
     * Provider's list of associated deal IDs
     */
    public Contact withRemoteDealIds(JsonNullable<? extends List<String>> remoteDealIds) {
        Utils.checkNotNull(remoteDealIds, "remoteDealIds");
        this.remoteDealIds = remoteDealIds;
        return this;
    }

    /**
     * List of associated account IDs
     */
    public Contact withAccountIds(List<String> accountIds) {
        Utils.checkNotNull(accountIds, "accountIds");
        this.accountIds = JsonNullable.of(accountIds);
        return this;
    }

    /**
     * List of associated account IDs
     */
    public Contact withAccountIds(JsonNullable<? extends List<String>> accountIds) {
        Utils.checkNotNull(accountIds, "accountIds");
        this.accountIds = accountIds;
        return this;
    }

    /**
     * Provider's list of associated account IDs
     */
    public Contact withRemoteAccountIds(List<String> remoteAccountIds) {
        Utils.checkNotNull(remoteAccountIds, "remoteAccountIds");
        this.remoteAccountIds = JsonNullable.of(remoteAccountIds);
        return this;
    }

    /**
     * Provider's list of associated account IDs
     */
    public Contact withRemoteAccountIds(JsonNullable<? extends List<String>> remoteAccountIds) {
        Utils.checkNotNull(remoteAccountIds, "remoteAccountIds");
        this.remoteAccountIds = remoteAccountIds;
        return this;
    }

    /**
     * Contact custom fields
     */
    public Contact withCustomFields(List<CustomFields> customFields) {
        Utils.checkNotNull(customFields, "customFields");
        this.customFields = JsonNullable.of(customFields);
        return this;
    }

    /**
     * Contact custom fields
     */
    public Contact withCustomFields(JsonNullable<? extends List<CustomFields>> customFields) {
        Utils.checkNotNull(customFields, "customFields");
        this.customFields = customFields;
        return this;
    }

    /**
     * Timestamp when the contact was created
     */
    public Contact withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * Timestamp when the contact was created
     */
    public Contact withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Timestamp when the contact was last updated
     */
    public Contact withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Timestamp when the contact was last updated
     */
    public Contact withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        Contact other = (Contact) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.remoteId, other.remoteId) &&
            Utils.enhancedDeepEquals(this.unifiedCustomFields, other.unifiedCustomFields) &&
            Utils.enhancedDeepEquals(this.firstName, other.firstName) &&
            Utils.enhancedDeepEquals(this.lastName, other.lastName) &&
            Utils.enhancedDeepEquals(this.companyName, other.companyName) &&
            Utils.enhancedDeepEquals(this.emails, other.emails) &&
            Utils.enhancedDeepEquals(this.phoneNumbers, other.phoneNumbers) &&
            Utils.enhancedDeepEquals(this.dealIds, other.dealIds) &&
            Utils.enhancedDeepEquals(this.remoteDealIds, other.remoteDealIds) &&
            Utils.enhancedDeepEquals(this.accountIds, other.accountIds) &&
            Utils.enhancedDeepEquals(this.remoteAccountIds, other.remoteAccountIds) &&
            Utils.enhancedDeepEquals(this.customFields, other.customFields) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, remoteId, unifiedCustomFields,
            firstName, lastName, companyName,
            emails, phoneNumbers, dealIds,
            remoteDealIds, accountIds, remoteAccountIds,
            customFields, createdAt, updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Contact.class,
                "id", id,
                "remoteId", remoteId,
                "unifiedCustomFields", unifiedCustomFields,
                "firstName", firstName,
                "lastName", lastName,
                "companyName", companyName,
                "emails", emails,
                "phoneNumbers", phoneNumbers,
                "dealIds", dealIds,
                "remoteDealIds", remoteDealIds,
                "accountIds", accountIds,
                "remoteAccountIds", remoteAccountIds,
                "customFields", customFields,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

        private JsonNullable<String> remoteId = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> unifiedCustomFields = JsonNullable.undefined();

        private JsonNullable<String> firstName = JsonNullable.undefined();

        private JsonNullable<String> lastName = JsonNullable.undefined();

        private JsonNullable<String> companyName = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> emails = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> phoneNumbers = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> dealIds = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> remoteDealIds = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> accountIds = JsonNullable.undefined();

        private JsonNullable<? extends List<String>> remoteAccountIds = JsonNullable.undefined();

        private JsonNullable<? extends List<CustomFields>> customFields = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();

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


        /**
         * The contact first name
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        /**
         * The contact first name
         */
        public Builder firstName(JsonNullable<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }


        /**
         * The contact last name
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        /**
         * The contact last name
         */
        public Builder lastName(JsonNullable<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }


        /**
         * The contact company name
         */
        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = JsonNullable.of(companyName);
            return this;
        }

        /**
         * The contact company name
         */
        public Builder companyName(JsonNullable<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }


        /**
         * List of contact email addresses
         */
        public Builder emails(List<String> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = JsonNullable.of(emails);
            return this;
        }

        /**
         * List of contact email addresses
         */
        public Builder emails(JsonNullable<? extends List<String>> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
            return this;
        }


        /**
         * List of contact phone numbers
         */
        public Builder phoneNumbers(List<String> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = JsonNullable.of(phoneNumbers);
            return this;
        }

        /**
         * List of contact phone numbers
         */
        public Builder phoneNumbers(JsonNullable<? extends List<String>> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = phoneNumbers;
            return this;
        }


        /**
         * List of associated deal IDs
         */
        public Builder dealIds(List<String> dealIds) {
            Utils.checkNotNull(dealIds, "dealIds");
            this.dealIds = JsonNullable.of(dealIds);
            return this;
        }

        /**
         * List of associated deal IDs
         */
        public Builder dealIds(JsonNullable<? extends List<String>> dealIds) {
            Utils.checkNotNull(dealIds, "dealIds");
            this.dealIds = dealIds;
            return this;
        }


        /**
         * Provider's list of associated deal IDs
         */
        public Builder remoteDealIds(List<String> remoteDealIds) {
            Utils.checkNotNull(remoteDealIds, "remoteDealIds");
            this.remoteDealIds = JsonNullable.of(remoteDealIds);
            return this;
        }

        /**
         * Provider's list of associated deal IDs
         */
        public Builder remoteDealIds(JsonNullable<? extends List<String>> remoteDealIds) {
            Utils.checkNotNull(remoteDealIds, "remoteDealIds");
            this.remoteDealIds = remoteDealIds;
            return this;
        }


        /**
         * List of associated account IDs
         */
        public Builder accountIds(List<String> accountIds) {
            Utils.checkNotNull(accountIds, "accountIds");
            this.accountIds = JsonNullable.of(accountIds);
            return this;
        }

        /**
         * List of associated account IDs
         */
        public Builder accountIds(JsonNullable<? extends List<String>> accountIds) {
            Utils.checkNotNull(accountIds, "accountIds");
            this.accountIds = accountIds;
            return this;
        }


        /**
         * Provider's list of associated account IDs
         */
        public Builder remoteAccountIds(List<String> remoteAccountIds) {
            Utils.checkNotNull(remoteAccountIds, "remoteAccountIds");
            this.remoteAccountIds = JsonNullable.of(remoteAccountIds);
            return this;
        }

        /**
         * Provider's list of associated account IDs
         */
        public Builder remoteAccountIds(JsonNullable<? extends List<String>> remoteAccountIds) {
            Utils.checkNotNull(remoteAccountIds, "remoteAccountIds");
            this.remoteAccountIds = remoteAccountIds;
            return this;
        }


        /**
         * Contact custom fields
         */
        public Builder customFields(List<CustomFields> customFields) {
            Utils.checkNotNull(customFields, "customFields");
            this.customFields = JsonNullable.of(customFields);
            return this;
        }

        /**
         * Contact custom fields
         */
        public Builder customFields(JsonNullable<? extends List<CustomFields>> customFields) {
            Utils.checkNotNull(customFields, "customFields");
            this.customFields = customFields;
            return this;
        }


        /**
         * Timestamp when the contact was created
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = JsonNullable.of(createdAt);
            return this;
        }

        /**
         * Timestamp when the contact was created
         */
        public Builder createdAt(JsonNullable<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }


        /**
         * Timestamp when the contact was last updated
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = JsonNullable.of(updatedAt);
            return this;
        }

        /**
         * Timestamp when the contact was last updated
         */
        public Builder updatedAt(JsonNullable<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Contact build() {

            return new Contact(
                id, remoteId, unifiedCustomFields,
                firstName, lastName, companyName,
                emails, phoneNumbers, dealIds,
                remoteDealIds, accountIds, remoteAccountIds,
                customFields, createdAt, updatedAt);
        }

    }
}
