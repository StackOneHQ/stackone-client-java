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
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class AtsCreateCandidateRequestDto {

    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unified_custom_fields")
    private JsonNullable<? extends Map<String, Object>> unifiedCustomFields;

    /**
     * The candidate personal phone number
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    @Deprecated
    private JsonNullable<String> phoneNumber;

    /**
     * List of candidate phone numbers including the type of the number when available
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_numbers")
    private JsonNullable<? extends List<PhoneNumber>> phoneNumbers;

    /**
     * Candidate name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Candidate first name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<String> firstName;

    /**
     * Candidate last name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<String> lastName;

    /**
     * Candidate email
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private JsonNullable<String> email;

    /**
     * List of candidate social links
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("social_links")
    private JsonNullable<? extends List<SocialLink>> socialLinks;

    /**
     * Candidate company
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company")
    private JsonNullable<String> company;

    /**
     * Candidate title
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * Candidate hired date
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hired_at")
    private JsonNullable<OffsetDateTime> hiredAt;

    /**
     * Candidate country
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private JsonNullable<String> country;

    /**
     * The candidate custom fields
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_fields")
    private JsonNullable<? extends List<CustomFields>> customFields;

    @JsonCreator
    public AtsCreateCandidateRequestDto(
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough,
            @JsonProperty("unified_custom_fields") JsonNullable<? extends Map<String, Object>> unifiedCustomFields,
            @JsonProperty("phone_number") JsonNullable<String> phoneNumber,
            @JsonProperty("phone_numbers") JsonNullable<? extends List<PhoneNumber>> phoneNumbers,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("email") JsonNullable<String> email,
            @JsonProperty("social_links") JsonNullable<? extends List<SocialLink>> socialLinks,
            @JsonProperty("company") JsonNullable<String> company,
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("hired_at") JsonNullable<OffsetDateTime> hiredAt,
            @JsonProperty("country") JsonNullable<String> country,
            @JsonProperty("custom_fields") JsonNullable<? extends List<CustomFields>> customFields) {
        Utils.checkNotNull(passthrough, "passthrough");
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(socialLinks, "socialLinks");
        Utils.checkNotNull(company, "company");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(hiredAt, "hiredAt");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(customFields, "customFields");
        this.passthrough = passthrough;
        this.unifiedCustomFields = unifiedCustomFields;
        this.phoneNumber = phoneNumber;
        this.phoneNumbers = phoneNumbers;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.socialLinks = socialLinks;
        this.company = company;
        this.title = title;
        this.hiredAt = hiredAt;
        this.country = country;
        this.customFields = customFields;
    }
    
    public AtsCreateCandidateRequestDto() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Value to pass through to the provider
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> passthrough() {
        return (JsonNullable<Map<String, Object>>) passthrough;
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
     * The candidate personal phone number
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> phoneNumber() {
        return phoneNumber;
    }

    /**
     * List of candidate phone numbers including the type of the number when available
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<PhoneNumber>> phoneNumbers() {
        return (JsonNullable<List<PhoneNumber>>) phoneNumbers;
    }

    /**
     * Candidate name
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Candidate first name
     */
    @JsonIgnore
    public JsonNullable<String> firstName() {
        return firstName;
    }

    /**
     * Candidate last name
     */
    @JsonIgnore
    public JsonNullable<String> lastName() {
        return lastName;
    }

    /**
     * Candidate email
     */
    @JsonIgnore
    public JsonNullable<String> email() {
        return email;
    }

    /**
     * List of candidate social links
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<SocialLink>> socialLinks() {
        return (JsonNullable<List<SocialLink>>) socialLinks;
    }

    /**
     * Candidate company
     */
    @JsonIgnore
    public JsonNullable<String> company() {
        return company;
    }

    /**
     * Candidate title
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * Candidate hired date
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> hiredAt() {
        return hiredAt;
    }

    /**
     * Candidate country
     */
    @JsonIgnore
    public JsonNullable<String> country() {
        return country;
    }

    /**
     * The candidate custom fields
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<CustomFields>> customFields() {
        return (JsonNullable<List<CustomFields>>) customFields;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Value to pass through to the provider
     */
    public AtsCreateCandidateRequestDto withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public AtsCreateCandidateRequestDto withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = passthrough;
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public AtsCreateCandidateRequestDto withUnifiedCustomFields(Map<String, Object> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public AtsCreateCandidateRequestDto withUnifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = unifiedCustomFields;
        return this;
    }

    /**
     * The candidate personal phone number
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsCreateCandidateRequestDto withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = JsonNullable.of(phoneNumber);
        return this;
    }

    /**
     * The candidate personal phone number
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public AtsCreateCandidateRequestDto withPhoneNumber(JsonNullable<String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * List of candidate phone numbers including the type of the number when available
     */
    public AtsCreateCandidateRequestDto withPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = JsonNullable.of(phoneNumbers);
        return this;
    }

    /**
     * List of candidate phone numbers including the type of the number when available
     */
    public AtsCreateCandidateRequestDto withPhoneNumbers(JsonNullable<? extends List<PhoneNumber>> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Candidate name
     */
    public AtsCreateCandidateRequestDto withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Candidate name
     */
    public AtsCreateCandidateRequestDto withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Candidate first name
     */
    public AtsCreateCandidateRequestDto withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * Candidate first name
     */
    public AtsCreateCandidateRequestDto withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Candidate last name
     */
    public AtsCreateCandidateRequestDto withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * Candidate last name
     */
    public AtsCreateCandidateRequestDto withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Candidate email
     */
    public AtsCreateCandidateRequestDto withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Candidate email
     */
    public AtsCreateCandidateRequestDto withEmail(JsonNullable<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * List of candidate social links
     */
    public AtsCreateCandidateRequestDto withSocialLinks(List<SocialLink> socialLinks) {
        Utils.checkNotNull(socialLinks, "socialLinks");
        this.socialLinks = JsonNullable.of(socialLinks);
        return this;
    }

    /**
     * List of candidate social links
     */
    public AtsCreateCandidateRequestDto withSocialLinks(JsonNullable<? extends List<SocialLink>> socialLinks) {
        Utils.checkNotNull(socialLinks, "socialLinks");
        this.socialLinks = socialLinks;
        return this;
    }

    /**
     * Candidate company
     */
    public AtsCreateCandidateRequestDto withCompany(String company) {
        Utils.checkNotNull(company, "company");
        this.company = JsonNullable.of(company);
        return this;
    }

    /**
     * Candidate company
     */
    public AtsCreateCandidateRequestDto withCompany(JsonNullable<String> company) {
        Utils.checkNotNull(company, "company");
        this.company = company;
        return this;
    }

    /**
     * Candidate title
     */
    public AtsCreateCandidateRequestDto withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * Candidate title
     */
    public AtsCreateCandidateRequestDto withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * Candidate hired date
     */
    public AtsCreateCandidateRequestDto withHiredAt(OffsetDateTime hiredAt) {
        Utils.checkNotNull(hiredAt, "hiredAt");
        this.hiredAt = JsonNullable.of(hiredAt);
        return this;
    }

    /**
     * Candidate hired date
     */
    public AtsCreateCandidateRequestDto withHiredAt(JsonNullable<OffsetDateTime> hiredAt) {
        Utils.checkNotNull(hiredAt, "hiredAt");
        this.hiredAt = hiredAt;
        return this;
    }

    /**
     * Candidate country
     */
    public AtsCreateCandidateRequestDto withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = JsonNullable.of(country);
        return this;
    }

    /**
     * Candidate country
     */
    public AtsCreateCandidateRequestDto withCountry(JsonNullable<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * The candidate custom fields
     */
    public AtsCreateCandidateRequestDto withCustomFields(List<CustomFields> customFields) {
        Utils.checkNotNull(customFields, "customFields");
        this.customFields = JsonNullable.of(customFields);
        return this;
    }

    /**
     * The candidate custom fields
     */
    public AtsCreateCandidateRequestDto withCustomFields(JsonNullable<? extends List<CustomFields>> customFields) {
        Utils.checkNotNull(customFields, "customFields");
        this.customFields = customFields;
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
        AtsCreateCandidateRequestDto other = (AtsCreateCandidateRequestDto) o;
        return 
            Objects.deepEquals(this.passthrough, other.passthrough) &&
            Objects.deepEquals(this.unifiedCustomFields, other.unifiedCustomFields) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.phoneNumbers, other.phoneNumbers) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.socialLinks, other.socialLinks) &&
            Objects.deepEquals(this.company, other.company) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.hiredAt, other.hiredAt) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.customFields, other.customFields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            passthrough,
            unifiedCustomFields,
            phoneNumber,
            phoneNumbers,
            name,
            firstName,
            lastName,
            email,
            socialLinks,
            company,
            title,
            hiredAt,
            country,
            customFields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsCreateCandidateRequestDto.class,
                "passthrough", passthrough,
                "unifiedCustomFields", unifiedCustomFields,
                "phoneNumber", phoneNumber,
                "phoneNumbers", phoneNumbers,
                "name", name,
                "firstName", firstName,
                "lastName", lastName,
                "email", email,
                "socialLinks", socialLinks,
                "company", company,
                "title", title,
                "hiredAt", hiredAt,
                "country", country,
                "customFields", customFields);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends Map<String, Object>> passthrough = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> unifiedCustomFields = JsonNullable.undefined();
 
        @Deprecated
        private JsonNullable<String> phoneNumber = JsonNullable.undefined();
 
        private JsonNullable<? extends List<PhoneNumber>> phoneNumbers = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> firstName = JsonNullable.undefined();
 
        private JsonNullable<String> lastName = JsonNullable.undefined();
 
        private JsonNullable<String> email = JsonNullable.undefined();
 
        private JsonNullable<? extends List<SocialLink>> socialLinks = JsonNullable.undefined();
 
        private JsonNullable<String> company = JsonNullable.undefined();
 
        private JsonNullable<String> title = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> hiredAt = JsonNullable.undefined();
 
        private JsonNullable<String> country = JsonNullable.undefined();
 
        private JsonNullable<? extends List<CustomFields>> customFields = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(Map<String, Object> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = JsonNullable.of(passthrough);
            return this;
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = passthrough;
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
         * The candidate personal phone number
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = JsonNullable.of(phoneNumber);
            return this;
        }

        /**
         * The candidate personal phone number
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder phoneNumber(JsonNullable<String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * List of candidate phone numbers including the type of the number when available
         */
        public Builder phoneNumbers(List<PhoneNumber> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = JsonNullable.of(phoneNumbers);
            return this;
        }

        /**
         * List of candidate phone numbers including the type of the number when available
         */
        public Builder phoneNumbers(JsonNullable<? extends List<PhoneNumber>> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * Candidate name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Candidate name
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Candidate first name
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        /**
         * Candidate first name
         */
        public Builder firstName(JsonNullable<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * Candidate last name
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        /**
         * Candidate last name
         */
        public Builder lastName(JsonNullable<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * Candidate email
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = JsonNullable.of(email);
            return this;
        }

        /**
         * Candidate email
         */
        public Builder email(JsonNullable<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * List of candidate social links
         */
        public Builder socialLinks(List<SocialLink> socialLinks) {
            Utils.checkNotNull(socialLinks, "socialLinks");
            this.socialLinks = JsonNullable.of(socialLinks);
            return this;
        }

        /**
         * List of candidate social links
         */
        public Builder socialLinks(JsonNullable<? extends List<SocialLink>> socialLinks) {
            Utils.checkNotNull(socialLinks, "socialLinks");
            this.socialLinks = socialLinks;
            return this;
        }

        /**
         * Candidate company
         */
        public Builder company(String company) {
            Utils.checkNotNull(company, "company");
            this.company = JsonNullable.of(company);
            return this;
        }

        /**
         * Candidate company
         */
        public Builder company(JsonNullable<String> company) {
            Utils.checkNotNull(company, "company");
            this.company = company;
            return this;
        }

        /**
         * Candidate title
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * Candidate title
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * Candidate hired date
         */
        public Builder hiredAt(OffsetDateTime hiredAt) {
            Utils.checkNotNull(hiredAt, "hiredAt");
            this.hiredAt = JsonNullable.of(hiredAt);
            return this;
        }

        /**
         * Candidate hired date
         */
        public Builder hiredAt(JsonNullable<OffsetDateTime> hiredAt) {
            Utils.checkNotNull(hiredAt, "hiredAt");
            this.hiredAt = hiredAt;
            return this;
        }

        /**
         * Candidate country
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = JsonNullable.of(country);
            return this;
        }

        /**
         * Candidate country
         */
        public Builder country(JsonNullable<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * The candidate custom fields
         */
        public Builder customFields(List<CustomFields> customFields) {
            Utils.checkNotNull(customFields, "customFields");
            this.customFields = JsonNullable.of(customFields);
            return this;
        }

        /**
         * The candidate custom fields
         */
        public Builder customFields(JsonNullable<? extends List<CustomFields>> customFields) {
            Utils.checkNotNull(customFields, "customFields");
            this.customFields = customFields;
            return this;
        }
        
        public AtsCreateCandidateRequestDto build() {
            return new AtsCreateCandidateRequestDto(
                passthrough,
                unifiedCustomFields,
                phoneNumber,
                phoneNumbers,
                name,
                firstName,
                lastName,
                email,
                socialLinks,
                company,
                title,
                hiredAt,
                country,
                customFields);
        }
    }
}

