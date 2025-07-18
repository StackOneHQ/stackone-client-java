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
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;


public class ApplicationCandidate {
    /**
     * Candidate name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * First name of the candidate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<String> firstName;

    /**
     * Last name of the candidate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<String> lastName;

    /**
     * Email of the candidate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private JsonNullable<String> email;

    /**
     * List of candidate emails
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    private JsonNullable<? extends List<CandidateEmail>> emails;

    /**
     * List of candidate phone numbers including the type of the number when available
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_numbers")
    private JsonNullable<? extends List<PhoneNumber>> phoneNumbers;

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

    @JsonCreator
    public ApplicationCandidate(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("email") JsonNullable<String> email,
            @JsonProperty("emails") JsonNullable<? extends List<CandidateEmail>> emails,
            @JsonProperty("phone_numbers") JsonNullable<? extends List<PhoneNumber>> phoneNumbers,
            @JsonProperty("social_links") JsonNullable<? extends List<SocialLink>> socialLinks,
            @JsonProperty("company") JsonNullable<String> company,
            @JsonProperty("title") JsonNullable<String> title) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(emails, "emails");
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        Utils.checkNotNull(socialLinks, "socialLinks");
        Utils.checkNotNull(company, "company");
        Utils.checkNotNull(title, "title");
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
        this.socialLinks = socialLinks;
        this.company = company;
        this.title = title;
    }
    
    public ApplicationCandidate() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Candidate name
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * First name of the candidate
     */
    @JsonIgnore
    public JsonNullable<String> firstName() {
        return firstName;
    }

    /**
     * Last name of the candidate
     */
    @JsonIgnore
    public JsonNullable<String> lastName() {
        return lastName;
    }

    /**
     * Email of the candidate
     */
    @JsonIgnore
    public JsonNullable<String> email() {
        return email;
    }

    /**
     * List of candidate emails
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<CandidateEmail>> emails() {
        return (JsonNullable<List<CandidateEmail>>) emails;
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

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Candidate name
     */
    public ApplicationCandidate withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Candidate name
     */
    public ApplicationCandidate withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * First name of the candidate
     */
    public ApplicationCandidate withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * First name of the candidate
     */
    public ApplicationCandidate withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of the candidate
     */
    public ApplicationCandidate withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * Last name of the candidate
     */
    public ApplicationCandidate withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Email of the candidate
     */
    public ApplicationCandidate withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Email of the candidate
     */
    public ApplicationCandidate withEmail(JsonNullable<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * List of candidate emails
     */
    public ApplicationCandidate withEmails(List<CandidateEmail> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = JsonNullable.of(emails);
        return this;
    }

    /**
     * List of candidate emails
     */
    public ApplicationCandidate withEmails(JsonNullable<? extends List<CandidateEmail>> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
        return this;
    }

    /**
     * List of candidate phone numbers including the type of the number when available
     */
    public ApplicationCandidate withPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = JsonNullable.of(phoneNumbers);
        return this;
    }

    /**
     * List of candidate phone numbers including the type of the number when available
     */
    public ApplicationCandidate withPhoneNumbers(JsonNullable<? extends List<PhoneNumber>> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * List of candidate social links
     */
    public ApplicationCandidate withSocialLinks(List<SocialLink> socialLinks) {
        Utils.checkNotNull(socialLinks, "socialLinks");
        this.socialLinks = JsonNullable.of(socialLinks);
        return this;
    }

    /**
     * List of candidate social links
     */
    public ApplicationCandidate withSocialLinks(JsonNullable<? extends List<SocialLink>> socialLinks) {
        Utils.checkNotNull(socialLinks, "socialLinks");
        this.socialLinks = socialLinks;
        return this;
    }

    /**
     * Candidate company
     */
    public ApplicationCandidate withCompany(String company) {
        Utils.checkNotNull(company, "company");
        this.company = JsonNullable.of(company);
        return this;
    }

    /**
     * Candidate company
     */
    public ApplicationCandidate withCompany(JsonNullable<String> company) {
        Utils.checkNotNull(company, "company");
        this.company = company;
        return this;
    }

    /**
     * Candidate title
     */
    public ApplicationCandidate withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * Candidate title
     */
    public ApplicationCandidate withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
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
        ApplicationCandidate other = (ApplicationCandidate) o;
        return 
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.firstName, other.firstName) &&
            Utils.enhancedDeepEquals(this.lastName, other.lastName) &&
            Utils.enhancedDeepEquals(this.email, other.email) &&
            Utils.enhancedDeepEquals(this.emails, other.emails) &&
            Utils.enhancedDeepEquals(this.phoneNumbers, other.phoneNumbers) &&
            Utils.enhancedDeepEquals(this.socialLinks, other.socialLinks) &&
            Utils.enhancedDeepEquals(this.company, other.company) &&
            Utils.enhancedDeepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            name, firstName, lastName,
            email, emails, phoneNumbers,
            socialLinks, company, title);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplicationCandidate.class,
                "name", name,
                "firstName", firstName,
                "lastName", lastName,
                "email", email,
                "emails", emails,
                "phoneNumbers", phoneNumbers,
                "socialLinks", socialLinks,
                "company", company,
                "title", title);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> name = JsonNullable.undefined();

        private JsonNullable<String> firstName = JsonNullable.undefined();

        private JsonNullable<String> lastName = JsonNullable.undefined();

        private JsonNullable<String> email = JsonNullable.undefined();

        private JsonNullable<? extends List<CandidateEmail>> emails = JsonNullable.undefined();

        private JsonNullable<? extends List<PhoneNumber>> phoneNumbers = JsonNullable.undefined();

        private JsonNullable<? extends List<SocialLink>> socialLinks = JsonNullable.undefined();

        private JsonNullable<String> company = JsonNullable.undefined();

        private JsonNullable<String> title = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
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
         * First name of the candidate
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        /**
         * First name of the candidate
         */
        public Builder firstName(JsonNullable<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }


        /**
         * Last name of the candidate
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        /**
         * Last name of the candidate
         */
        public Builder lastName(JsonNullable<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }


        /**
         * Email of the candidate
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = JsonNullable.of(email);
            return this;
        }

        /**
         * Email of the candidate
         */
        public Builder email(JsonNullable<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }


        /**
         * List of candidate emails
         */
        public Builder emails(List<CandidateEmail> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = JsonNullable.of(emails);
            return this;
        }

        /**
         * List of candidate emails
         */
        public Builder emails(JsonNullable<? extends List<CandidateEmail>> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
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

        public ApplicationCandidate build() {

            return new ApplicationCandidate(
                name, firstName, lastName,
                email, emails, phoneNumbers,
                socialLinks, company, title);
        }

    }
}
