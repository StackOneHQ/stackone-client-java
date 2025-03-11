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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class CreateHRISBenefit {

    /**
     * Unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

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
    private JsonNullable<? extends CreateHRISBenefitBenefitType> benefitType;

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
    public CreateHRISBenefit(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("benefit_type") JsonNullable<? extends CreateHRISBenefitBenefitType> benefitType,
            @JsonProperty("provider") JsonNullable<String> provider,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(benefitType, "benefitType");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.id = id;
        this.name = name;
        this.benefitType = benefitType;
        this.provider = provider;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public CreateHRISBenefit() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
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
    public JsonNullable<CreateHRISBenefitBenefitType> benefitType() {
        return (JsonNullable<CreateHRISBenefitBenefitType>) benefitType;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public CreateHRISBenefit withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public CreateHRISBenefit withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the benefit
     */
    public CreateHRISBenefit withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the benefit
     */
    public CreateHRISBenefit withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The type of the benefit
     */
    public CreateHRISBenefit withBenefitType(CreateHRISBenefitBenefitType benefitType) {
        Utils.checkNotNull(benefitType, "benefitType");
        this.benefitType = JsonNullable.of(benefitType);
        return this;
    }

    /**
     * The type of the benefit
     */
    public CreateHRISBenefit withBenefitType(JsonNullable<? extends CreateHRISBenefitBenefitType> benefitType) {
        Utils.checkNotNull(benefitType, "benefitType");
        this.benefitType = benefitType;
        return this;
    }

    /**
     * The provider of the benefit
     */
    public CreateHRISBenefit withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = JsonNullable.of(provider);
        return this;
    }

    /**
     * The provider of the benefit
     */
    public CreateHRISBenefit withProvider(JsonNullable<String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    /**
     * The description of the benefit
     */
    public CreateHRISBenefit withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The description of the benefit
     */
    public CreateHRISBenefit withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The date and time the benefit was created
     */
    public CreateHRISBenefit withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time the benefit was created
     */
    public CreateHRISBenefit withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time the benefit was last updated
     */
    public CreateHRISBenefit withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time the benefit was last updated
     */
    public CreateHRISBenefit withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
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
        CreateHRISBenefit other = (CreateHRISBenefit) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.benefitType, other.benefitType) &&
            Objects.deepEquals(this.provider, other.provider) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            benefitType,
            provider,
            description,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateHRISBenefit.class,
                "id", id,
                "name", name,
                "benefitType", benefitType,
                "provider", provider,
                "description", description,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends CreateHRISBenefitBenefitType> benefitType = JsonNullable.undefined();
 
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
        public Builder benefitType(CreateHRISBenefitBenefitType benefitType) {
            Utils.checkNotNull(benefitType, "benefitType");
            this.benefitType = JsonNullable.of(benefitType);
            return this;
        }

        /**
         * The type of the benefit
         */
        public Builder benefitType(JsonNullable<? extends CreateHRISBenefitBenefitType> benefitType) {
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
        
        public CreateHRISBenefit build() {
            return new CreateHRISBenefit(
                id,
                name,
                benefitType,
                provider,
                description,
                createdAt,
                updatedAt);
        }
    }
}

