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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateEmploymentApiModelEmploymentType
 * 
 * <p>The type of employment (e.g., contractor, permanent)
 * 
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class CreateEmploymentApiModelEmploymentType {
    /**
     * The type of the employment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeValue> value;

    /**
     * The source value of the employment type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeSourceValue> sourceValue;

    @JsonCreator
    public CreateEmploymentApiModelEmploymentType(
            @JsonProperty("value") JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public CreateEmploymentApiModelEmploymentType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The type of the employment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CreateEmploymentApiModelEmploymentTypeValue> value() {
        return (JsonNullable<CreateEmploymentApiModelEmploymentTypeValue>) value;
    }

    /**
     * The source value of the employment type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CreateEmploymentApiModelEmploymentTypeSourceValue> sourceValue() {
        return (JsonNullable<CreateEmploymentApiModelEmploymentTypeSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The type of the employment.
     */
    public CreateEmploymentApiModelEmploymentType withValue(CreateEmploymentApiModelEmploymentTypeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The type of the employment.
     */
    public CreateEmploymentApiModelEmploymentType withValue(JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The source value of the employment type.
     */
    public CreateEmploymentApiModelEmploymentType withSourceValue(CreateEmploymentApiModelEmploymentTypeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The source value of the employment type.
     */
    public CreateEmploymentApiModelEmploymentType withSourceValue(JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeSourceValue> sourceValue) {
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
        CreateEmploymentApiModelEmploymentType other = (CreateEmploymentApiModelEmploymentType) o;
        return 
            Utils.enhancedDeepEquals(this.value, other.value) &&
            Utils.enhancedDeepEquals(this.sourceValue, other.sourceValue);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            value, sourceValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateEmploymentApiModelEmploymentType.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeValue> value = JsonNullable.undefined();

        private JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The type of the employment.
         */
        public Builder value(CreateEmploymentApiModelEmploymentTypeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The type of the employment.
         */
        public Builder value(JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        /**
         * The source value of the employment type.
         */
        public Builder sourceValue(CreateEmploymentApiModelEmploymentTypeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The source value of the employment type.
         */
        public Builder sourceValue(JsonNullable<? extends CreateEmploymentApiModelEmploymentTypeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public CreateEmploymentApiModelEmploymentType build() {

            return new CreateEmploymentApiModelEmploymentType(
                value, sourceValue);
        }

    }
}
