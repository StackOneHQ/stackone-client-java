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
import org.openapitools.jackson.nullable.JsonNullable;


public class AtsUpdateBackgroundCheckResultRequestDtoScore {
    /**
     * The label of the score
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private JsonNullable<String> label;

    /**
     * The value is the actual score
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<String> value;

    /**
     * The minimum value of the score
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("min")
    private JsonNullable<String> min;

    /**
     * The maximum value of the score
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max")
    private JsonNullable<String> max;

    @JsonCreator
    public AtsUpdateBackgroundCheckResultRequestDtoScore(
            @JsonProperty("label") JsonNullable<String> label,
            @JsonProperty("value") JsonNullable<String> value,
            @JsonProperty("min") JsonNullable<String> min,
            @JsonProperty("max") JsonNullable<String> max) {
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(min, "min");
        Utils.checkNotNull(max, "max");
        this.label = label;
        this.value = value;
        this.min = min;
        this.max = max;
    }
    
    public AtsUpdateBackgroundCheckResultRequestDtoScore() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined());
    }

    /**
     * The label of the score
     */
    @JsonIgnore
    public JsonNullable<String> label() {
        return label;
    }

    /**
     * The value is the actual score
     */
    @JsonIgnore
    public JsonNullable<String> value() {
        return value;
    }

    /**
     * The minimum value of the score
     */
    @JsonIgnore
    public JsonNullable<String> min() {
        return min;
    }

    /**
     * The maximum value of the score
     */
    @JsonIgnore
    public JsonNullable<String> max() {
        return max;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The label of the score
     */
    public AtsUpdateBackgroundCheckResultRequestDtoScore withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = JsonNullable.of(label);
        return this;
    }

    /**
     * The label of the score
     */
    public AtsUpdateBackgroundCheckResultRequestDtoScore withLabel(JsonNullable<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    /**
     * The value is the actual score
     */
    public AtsUpdateBackgroundCheckResultRequestDtoScore withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The value is the actual score
     */
    public AtsUpdateBackgroundCheckResultRequestDtoScore withValue(JsonNullable<String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The minimum value of the score
     */
    public AtsUpdateBackgroundCheckResultRequestDtoScore withMin(String min) {
        Utils.checkNotNull(min, "min");
        this.min = JsonNullable.of(min);
        return this;
    }

    /**
     * The minimum value of the score
     */
    public AtsUpdateBackgroundCheckResultRequestDtoScore withMin(JsonNullable<String> min) {
        Utils.checkNotNull(min, "min");
        this.min = min;
        return this;
    }

    /**
     * The maximum value of the score
     */
    public AtsUpdateBackgroundCheckResultRequestDtoScore withMax(String max) {
        Utils.checkNotNull(max, "max");
        this.max = JsonNullable.of(max);
        return this;
    }

    /**
     * The maximum value of the score
     */
    public AtsUpdateBackgroundCheckResultRequestDtoScore withMax(JsonNullable<String> max) {
        Utils.checkNotNull(max, "max");
        this.max = max;
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
        AtsUpdateBackgroundCheckResultRequestDtoScore other = (AtsUpdateBackgroundCheckResultRequestDtoScore) o;
        return 
            Utils.enhancedDeepEquals(this.label, other.label) &&
            Utils.enhancedDeepEquals(this.value, other.value) &&
            Utils.enhancedDeepEquals(this.min, other.min) &&
            Utils.enhancedDeepEquals(this.max, other.max);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            label, value, min,
            max);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsUpdateBackgroundCheckResultRequestDtoScore.class,
                "label", label,
                "value", value,
                "min", min,
                "max", max);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> label = JsonNullable.undefined();

        private JsonNullable<String> value = JsonNullable.undefined();

        private JsonNullable<String> min = JsonNullable.undefined();

        private JsonNullable<String> max = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The label of the score
         */
        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = JsonNullable.of(label);
            return this;
        }

        /**
         * The label of the score
         */
        public Builder label(JsonNullable<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }


        /**
         * The value is the actual score
         */
        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The value is the actual score
         */
        public Builder value(JsonNullable<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        /**
         * The minimum value of the score
         */
        public Builder min(String min) {
            Utils.checkNotNull(min, "min");
            this.min = JsonNullable.of(min);
            return this;
        }

        /**
         * The minimum value of the score
         */
        public Builder min(JsonNullable<String> min) {
            Utils.checkNotNull(min, "min");
            this.min = min;
            return this;
        }


        /**
         * The maximum value of the score
         */
        public Builder max(String max) {
            Utils.checkNotNull(max, "max");
            this.max = JsonNullable.of(max);
            return this;
        }

        /**
         * The maximum value of the score
         */
        public Builder max(JsonNullable<String> max) {
            Utils.checkNotNull(max, "max");
            this.max = max;
            return this;
        }

        public AtsUpdateBackgroundCheckResultRequestDtoScore build() {

            return new AtsUpdateBackgroundCheckResultRequestDtoScore(
                label, value, min,
                max);
        }

    }
}
