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
 * AtsCreateNotesRequestDtoVisibility
 * 
 * <p>Visibility of the note
 */
public class AtsCreateNotesRequestDtoVisibility {
    /**
     * The visibility of the notes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends AtsCreateNotesRequestDtoValue> value;

    /**
     * The source value of the notes visibility.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends AtsCreateNotesRequestDtoSourceValue> sourceValue;

    @JsonCreator
    public AtsCreateNotesRequestDtoVisibility(
            @JsonProperty("value") JsonNullable<? extends AtsCreateNotesRequestDtoValue> value,
            @JsonProperty("source_value") JsonNullable<? extends AtsCreateNotesRequestDtoSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public AtsCreateNotesRequestDtoVisibility() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The visibility of the notes.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsCreateNotesRequestDtoValue> value() {
        return (JsonNullable<AtsCreateNotesRequestDtoValue>) value;
    }

    /**
     * The source value of the notes visibility.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsCreateNotesRequestDtoSourceValue> sourceValue() {
        return (JsonNullable<AtsCreateNotesRequestDtoSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The visibility of the notes.
     */
    public AtsCreateNotesRequestDtoVisibility withValue(AtsCreateNotesRequestDtoValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The visibility of the notes.
     */
    public AtsCreateNotesRequestDtoVisibility withValue(JsonNullable<? extends AtsCreateNotesRequestDtoValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The source value of the notes visibility.
     */
    public AtsCreateNotesRequestDtoVisibility withSourceValue(AtsCreateNotesRequestDtoSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The source value of the notes visibility.
     */
    public AtsCreateNotesRequestDtoVisibility withSourceValue(JsonNullable<? extends AtsCreateNotesRequestDtoSourceValue> sourceValue) {
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
        AtsCreateNotesRequestDtoVisibility other = (AtsCreateNotesRequestDtoVisibility) o;
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
        return Utils.toString(AtsCreateNotesRequestDtoVisibility.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends AtsCreateNotesRequestDtoValue> value = JsonNullable.undefined();

        private JsonNullable<? extends AtsCreateNotesRequestDtoSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The visibility of the notes.
         */
        public Builder value(AtsCreateNotesRequestDtoValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The visibility of the notes.
         */
        public Builder value(JsonNullable<? extends AtsCreateNotesRequestDtoValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        /**
         * The source value of the notes visibility.
         */
        public Builder sourceValue(AtsCreateNotesRequestDtoSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The source value of the notes visibility.
         */
        public Builder sourceValue(JsonNullable<? extends AtsCreateNotesRequestDtoSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public AtsCreateNotesRequestDtoVisibility build() {

            return new AtsCreateNotesRequestDtoVisibility(
                value, sourceValue);
        }

    }
}
