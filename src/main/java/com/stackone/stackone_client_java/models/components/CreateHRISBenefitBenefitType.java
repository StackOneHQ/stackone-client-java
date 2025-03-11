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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * CreateHRISBenefitBenefitType - The type of the benefit
 */

public class CreateHRISBenefitBenefitType {

    /**
     * The type of the benefit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends CreateHRISBenefitValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends CreateHRISBenefitSourceValue> sourceValue;

    @JsonCreator
    public CreateHRISBenefitBenefitType(
            @JsonProperty("value") JsonNullable<? extends CreateHRISBenefitValue> value,
            @JsonProperty("source_value") JsonNullable<? extends CreateHRISBenefitSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public CreateHRISBenefitBenefitType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The type of the benefit
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CreateHRISBenefitValue> value() {
        return (JsonNullable<CreateHRISBenefitValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CreateHRISBenefitSourceValue> sourceValue() {
        return (JsonNullable<CreateHRISBenefitSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of the benefit
     */
    public CreateHRISBenefitBenefitType withValue(CreateHRISBenefitValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The type of the benefit
     */
    public CreateHRISBenefitBenefitType withValue(JsonNullable<? extends CreateHRISBenefitValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public CreateHRISBenefitBenefitType withSourceValue(CreateHRISBenefitSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public CreateHRISBenefitBenefitType withSourceValue(JsonNullable<? extends CreateHRISBenefitSourceValue> sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = sourceValue;
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
        CreateHRISBenefitBenefitType other = (CreateHRISBenefitBenefitType) o;
        return 
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.sourceValue, other.sourceValue);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            value,
            sourceValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateHRISBenefitBenefitType.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends CreateHRISBenefitValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends CreateHRISBenefitSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of the benefit
         */
        public Builder value(CreateHRISBenefitValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The type of the benefit
         */
        public Builder value(JsonNullable<? extends CreateHRISBenefitValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(CreateHRISBenefitSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends CreateHRISBenefitSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public CreateHRISBenefitBenefitType build() {
            return new CreateHRISBenefitBenefitType(
                value,
                sourceValue);
        }
    }
}

