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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;


public class HRISBenefit {
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
     * The name of the benefit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The type of the benefit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("benefit_type")
    private JsonNullable<? extends BenefitType> benefitType;

    /**
     * The provider of the benefit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private JsonNullable<String> provider;

    /**
     * The description of the benefit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The date and time the benefit was created
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private JsonNullable<OffsetDateTime> createdAt;

    /**
     * The date and time the benefit was last updated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<OffsetDateTime> updatedAt;

    @JsonCreator
    public HRISBenefit(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("benefit_type") JsonNullable<? extends BenefitType> benefitType,
            @JsonProperty("provider") JsonNullable<String> provider,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(benefitType, "benefitType");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.id = id;
        this.remoteId = remoteId;
        this.name = name;
        this.benefitType = benefitType;
        this.provider = provider;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public HRISBenefit() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined());
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
     * The name of the benefit
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The type of the benefit
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BenefitType> benefitType() {
        return (JsonNullable<BenefitType>) benefitType;
    }

    /**
     * The provider of the benefit
     */
    @JsonIgnore
    public JsonNullable<String> provider() {
        return provider;
    }

    /**
     * The description of the benefit
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The date and time the benefit was created
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The date and time the benefit was last updated
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
    public HRISBenefit withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public HRISBenefit withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public HRISBenefit withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public HRISBenefit withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * The name of the benefit
     */
    public HRISBenefit withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the benefit
     */
    public HRISBenefit withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The type of the benefit
     */
    public HRISBenefit withBenefitType(BenefitType benefitType) {
        Utils.checkNotNull(benefitType, "benefitType");
        this.benefitType = JsonNullable.of(benefitType);
        return this;
    }

    /**
     * The type of the benefit
     */
    public HRISBenefit withBenefitType(JsonNullable<? extends BenefitType> benefitType) {
        Utils.checkNotNull(benefitType, "benefitType");
        this.benefitType = benefitType;
        return this;
    }

    /**
     * The provider of the benefit
     */
    public HRISBenefit withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = JsonNullable.of(provider);
        return this;
    }

    /**
     * The provider of the benefit
     */
    public HRISBenefit withProvider(JsonNullable<String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    /**
     * The description of the benefit
     */
    public HRISBenefit withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The description of the benefit
     */
    public HRISBenefit withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The date and time the benefit was created
     */
    public HRISBenefit withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time the benefit was created
     */
    public HRISBenefit withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time the benefit was last updated
     */
    public HRISBenefit withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time the benefit was last updated
     */
    public HRISBenefit withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
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
        HRISBenefit other = (HRISBenefit) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.remoteId, other.remoteId) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.benefitType, other.benefitType) &&
            Utils.enhancedDeepEquals(this.provider, other.provider) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, remoteId, name,
            benefitType, provider, description,
            createdAt, updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HRISBenefit.class,
                "id", id,
                "remoteId", remoteId,
                "name", name,
                "benefitType", benefitType,
                "provider", provider,
                "description", description,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

        private JsonNullable<String> remoteId = JsonNullable.undefined();

        private JsonNullable<String> name = JsonNullable.undefined();

        private JsonNullable<? extends BenefitType> benefitType = JsonNullable.undefined();

        private JsonNullable<String> provider = JsonNullable.undefined();

        private JsonNullable<String> description = JsonNullable.undefined();

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
         * The name of the benefit
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the benefit
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        /**
         * The type of the benefit
         */
        public Builder benefitType(BenefitType benefitType) {
            Utils.checkNotNull(benefitType, "benefitType");
            this.benefitType = JsonNullable.of(benefitType);
            return this;
        }

        /**
         * The type of the benefit
         */
        public Builder benefitType(JsonNullable<? extends BenefitType> benefitType) {
            Utils.checkNotNull(benefitType, "benefitType");
            this.benefitType = benefitType;
            return this;
        }


        /**
         * The provider of the benefit
         */
        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = JsonNullable.of(provider);
            return this;
        }

        /**
         * The provider of the benefit
         */
        public Builder provider(JsonNullable<String> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }


        /**
         * The description of the benefit
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * The description of the benefit
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }


        /**
         * The date and time the benefit was created
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = JsonNullable.of(createdAt);
            return this;
        }

        /**
         * The date and time the benefit was created
         */
        public Builder createdAt(JsonNullable<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }


        /**
         * The date and time the benefit was last updated
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = JsonNullable.of(updatedAt);
            return this;
        }

        /**
         * The date and time the benefit was last updated
         */
        public Builder updatedAt(JsonNullable<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public HRISBenefit build() {

            return new HRISBenefit(
                id, remoteId, name,
                benefitType, provider, description,
                createdAt, updatedAt);
        }

    }
}
