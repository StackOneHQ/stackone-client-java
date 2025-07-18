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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateEmploymentApiModelDurationUnit
 * 
 * <p>The duration unit of the work time
 */
public class CreateEmploymentApiModelDurationUnit {
    /**
     * The unified value for the period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends CreateEmploymentApiModelWorkTimeValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends CreateEmploymentApiModelWorkTimeSourceValue> sourceValue;

    @JsonCreator
    public CreateEmploymentApiModelDurationUnit(
            @JsonProperty("value") JsonNullable<? extends CreateEmploymentApiModelWorkTimeValue> value,
            @JsonProperty("source_value") JsonNullable<? extends CreateEmploymentApiModelWorkTimeSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public CreateEmploymentApiModelDurationUnit() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The unified value for the period.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CreateEmploymentApiModelWorkTimeValue> value() {
        return (JsonNullable<CreateEmploymentApiModelWorkTimeValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CreateEmploymentApiModelWorkTimeSourceValue> sourceValue() {
        return (JsonNullable<CreateEmploymentApiModelWorkTimeSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The unified value for the period.
     */
    public CreateEmploymentApiModelDurationUnit withValue(CreateEmploymentApiModelWorkTimeValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The unified value for the period.
     */
    public CreateEmploymentApiModelDurationUnit withValue(JsonNullable<? extends CreateEmploymentApiModelWorkTimeValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public CreateEmploymentApiModelDurationUnit withSourceValue(CreateEmploymentApiModelWorkTimeSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public CreateEmploymentApiModelDurationUnit withSourceValue(JsonNullable<? extends CreateEmploymentApiModelWorkTimeSourceValue> sourceValue) {
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
        CreateEmploymentApiModelDurationUnit other = (CreateEmploymentApiModelDurationUnit) o;
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
        return Utils.toString(CreateEmploymentApiModelDurationUnit.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends CreateEmploymentApiModelWorkTimeValue> value = JsonNullable.undefined();

        private JsonNullable<? extends CreateEmploymentApiModelWorkTimeSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The unified value for the period.
         */
        public Builder value(CreateEmploymentApiModelWorkTimeValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The unified value for the period.
         */
        public Builder value(JsonNullable<? extends CreateEmploymentApiModelWorkTimeValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(CreateEmploymentApiModelWorkTimeSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends CreateEmploymentApiModelWorkTimeSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public CreateEmploymentApiModelDurationUnit build() {

            return new CreateEmploymentApiModelDurationUnit(
                value, sourceValue);
        }

    }
}
