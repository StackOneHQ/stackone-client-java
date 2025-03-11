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

public class WorkEligibility {

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

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends WorkEligibilityType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sub_type")
    private JsonNullable<String> subType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document")
    private JsonNullable<? extends Document> document;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("valid_from")
    private JsonNullable<OffsetDateTime> validFrom;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("valid_to")
    private JsonNullable<OffsetDateTime> validTo;

    /**
     * The country code of the issued by authority
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("issued_by")
    private JsonNullable<? extends IssuedBy> issuedBy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("number")
    private JsonNullable<String> number;

    @JsonCreator
    public WorkEligibility(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("type") JsonNullable<? extends WorkEligibilityType> type,
            @JsonProperty("sub_type") JsonNullable<String> subType,
            @JsonProperty("document") JsonNullable<? extends Document> document,
            @JsonProperty("valid_from") JsonNullable<OffsetDateTime> validFrom,
            @JsonProperty("valid_to") JsonNullable<OffsetDateTime> validTo,
            @JsonProperty("issued_by") JsonNullable<? extends IssuedBy> issuedBy,
            @JsonProperty("number") JsonNullable<String> number) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(subType, "subType");
        Utils.checkNotNull(document, "document");
        Utils.checkNotNull(validFrom, "validFrom");
        Utils.checkNotNull(validTo, "validTo");
        Utils.checkNotNull(issuedBy, "issuedBy");
        Utils.checkNotNull(number, "number");
        this.id = id;
        this.remoteId = remoteId;
        this.type = type;
        this.subType = subType;
        this.document = document;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.issuedBy = issuedBy;
        this.number = number;
    }
    
    public WorkEligibility() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<WorkEligibilityType> type() {
        return (JsonNullable<WorkEligibilityType>) type;
    }

    @JsonIgnore
    public JsonNullable<String> subType() {
        return subType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Document> document() {
        return (JsonNullable<Document>) document;
    }

    @JsonIgnore
    public JsonNullable<OffsetDateTime> validFrom() {
        return validFrom;
    }

    @JsonIgnore
    public JsonNullable<OffsetDateTime> validTo() {
        return validTo;
    }

    /**
     * The country code of the issued by authority
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<IssuedBy> issuedBy() {
        return (JsonNullable<IssuedBy>) issuedBy;
    }

    @JsonIgnore
    public JsonNullable<String> number() {
        return number;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public WorkEligibility withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public WorkEligibility withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public WorkEligibility withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public WorkEligibility withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    public WorkEligibility withType(WorkEligibilityType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    public WorkEligibility withType(JsonNullable<? extends WorkEligibilityType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public WorkEligibility withSubType(String subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = JsonNullable.of(subType);
        return this;
    }

    public WorkEligibility withSubType(JsonNullable<String> subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = subType;
        return this;
    }

    public WorkEligibility withDocument(Document document) {
        Utils.checkNotNull(document, "document");
        this.document = JsonNullable.of(document);
        return this;
    }

    public WorkEligibility withDocument(JsonNullable<? extends Document> document) {
        Utils.checkNotNull(document, "document");
        this.document = document;
        return this;
    }

    public WorkEligibility withValidFrom(OffsetDateTime validFrom) {
        Utils.checkNotNull(validFrom, "validFrom");
        this.validFrom = JsonNullable.of(validFrom);
        return this;
    }

    public WorkEligibility withValidFrom(JsonNullable<OffsetDateTime> validFrom) {
        Utils.checkNotNull(validFrom, "validFrom");
        this.validFrom = validFrom;
        return this;
    }

    public WorkEligibility withValidTo(OffsetDateTime validTo) {
        Utils.checkNotNull(validTo, "validTo");
        this.validTo = JsonNullable.of(validTo);
        return this;
    }

    public WorkEligibility withValidTo(JsonNullable<OffsetDateTime> validTo) {
        Utils.checkNotNull(validTo, "validTo");
        this.validTo = validTo;
        return this;
    }

    /**
     * The country code of the issued by authority
     */
    public WorkEligibility withIssuedBy(IssuedBy issuedBy) {
        Utils.checkNotNull(issuedBy, "issuedBy");
        this.issuedBy = JsonNullable.of(issuedBy);
        return this;
    }

    /**
     * The country code of the issued by authority
     */
    public WorkEligibility withIssuedBy(JsonNullable<? extends IssuedBy> issuedBy) {
        Utils.checkNotNull(issuedBy, "issuedBy");
        this.issuedBy = issuedBy;
        return this;
    }

    public WorkEligibility withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = JsonNullable.of(number);
        return this;
    }

    public WorkEligibility withNumber(JsonNullable<String> number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
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
        WorkEligibility other = (WorkEligibility) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.subType, other.subType) &&
            Objects.deepEquals(this.document, other.document) &&
            Objects.deepEquals(this.validFrom, other.validFrom) &&
            Objects.deepEquals(this.validTo, other.validTo) &&
            Objects.deepEquals(this.issuedBy, other.issuedBy) &&
            Objects.deepEquals(this.number, other.number);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            type,
            subType,
            document,
            validFrom,
            validTo,
            issuedBy,
            number);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkEligibility.class,
                "id", id,
                "remoteId", remoteId,
                "type", type,
                "subType", subType,
                "document", document,
                "validFrom", validFrom,
                "validTo", validTo,
                "issuedBy", issuedBy,
                "number", number);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<? extends WorkEligibilityType> type = JsonNullable.undefined();
 
        private JsonNullable<String> subType = JsonNullable.undefined();
 
        private JsonNullable<? extends Document> document = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> validFrom = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> validTo = JsonNullable.undefined();
 
        private JsonNullable<? extends IssuedBy> issuedBy = JsonNullable.undefined();
 
        private JsonNullable<String> number = JsonNullable.undefined();  
        
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

        public Builder type(WorkEligibilityType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        public Builder type(JsonNullable<? extends WorkEligibilityType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder subType(String subType) {
            Utils.checkNotNull(subType, "subType");
            this.subType = JsonNullable.of(subType);
            return this;
        }

        public Builder subType(JsonNullable<String> subType) {
            Utils.checkNotNull(subType, "subType");
            this.subType = subType;
            return this;
        }

        public Builder document(Document document) {
            Utils.checkNotNull(document, "document");
            this.document = JsonNullable.of(document);
            return this;
        }

        public Builder document(JsonNullable<? extends Document> document) {
            Utils.checkNotNull(document, "document");
            this.document = document;
            return this;
        }

        public Builder validFrom(OffsetDateTime validFrom) {
            Utils.checkNotNull(validFrom, "validFrom");
            this.validFrom = JsonNullable.of(validFrom);
            return this;
        }

        public Builder validFrom(JsonNullable<OffsetDateTime> validFrom) {
            Utils.checkNotNull(validFrom, "validFrom");
            this.validFrom = validFrom;
            return this;
        }

        public Builder validTo(OffsetDateTime validTo) {
            Utils.checkNotNull(validTo, "validTo");
            this.validTo = JsonNullable.of(validTo);
            return this;
        }

        public Builder validTo(JsonNullable<OffsetDateTime> validTo) {
            Utils.checkNotNull(validTo, "validTo");
            this.validTo = validTo;
            return this;
        }

        /**
         * The country code of the issued by authority
         */
        public Builder issuedBy(IssuedBy issuedBy) {
            Utils.checkNotNull(issuedBy, "issuedBy");
            this.issuedBy = JsonNullable.of(issuedBy);
            return this;
        }

        /**
         * The country code of the issued by authority
         */
        public Builder issuedBy(JsonNullable<? extends IssuedBy> issuedBy) {
            Utils.checkNotNull(issuedBy, "issuedBy");
            this.issuedBy = issuedBy;
            return this;
        }

        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = JsonNullable.of(number);
            return this;
        }

        public Builder number(JsonNullable<String> number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }
        
        public WorkEligibility build() {
            return new WorkEligibility(
                id,
                remoteId,
                type,
                subType,
                document,
                validFrom,
                validTo,
                issuedBy,
                number);
        }
    }
}

