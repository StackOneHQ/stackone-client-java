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
 * AtsUpdateNotesRequestDtoVisibility - Visibility of the note
 */

public class AtsUpdateNotesRequestDtoVisibility {

    /**
     * The visibility of the notes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends AtsUpdateNotesRequestDtoValue> value;

    /**
     * The source value of the notes visibility.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends AtsUpdateNotesRequestDtoSourceValue> sourceValue;

    @JsonCreator
    public AtsUpdateNotesRequestDtoVisibility(
            @JsonProperty("value") JsonNullable<? extends AtsUpdateNotesRequestDtoValue> value,
            @JsonProperty("source_value") JsonNullable<? extends AtsUpdateNotesRequestDtoSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public AtsUpdateNotesRequestDtoVisibility() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The visibility of the notes.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateNotesRequestDtoValue> value() {
        return (JsonNullable<AtsUpdateNotesRequestDtoValue>) value;
    }

    /**
     * The source value of the notes visibility.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateNotesRequestDtoSourceValue> sourceValue() {
        return (JsonNullable<AtsUpdateNotesRequestDtoSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The visibility of the notes.
     */
    public AtsUpdateNotesRequestDtoVisibility withValue(AtsUpdateNotesRequestDtoValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The visibility of the notes.
     */
    public AtsUpdateNotesRequestDtoVisibility withValue(JsonNullable<? extends AtsUpdateNotesRequestDtoValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The source value of the notes visibility.
     */
    public AtsUpdateNotesRequestDtoVisibility withSourceValue(AtsUpdateNotesRequestDtoSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The source value of the notes visibility.
     */
    public AtsUpdateNotesRequestDtoVisibility withSourceValue(JsonNullable<? extends AtsUpdateNotesRequestDtoSourceValue> sourceValue) {
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
        AtsUpdateNotesRequestDtoVisibility other = (AtsUpdateNotesRequestDtoVisibility) o;
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
        return Utils.toString(AtsUpdateNotesRequestDtoVisibility.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AtsUpdateNotesRequestDtoValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends AtsUpdateNotesRequestDtoSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The visibility of the notes.
         */
        public Builder value(AtsUpdateNotesRequestDtoValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The visibility of the notes.
         */
        public Builder value(JsonNullable<? extends AtsUpdateNotesRequestDtoValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        /**
         * The source value of the notes visibility.
         */
        public Builder sourceValue(AtsUpdateNotesRequestDtoSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The source value of the notes visibility.
         */
        public Builder sourceValue(JsonNullable<? extends AtsUpdateNotesRequestDtoSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public AtsUpdateNotesRequestDtoVisibility build() {
            return new AtsUpdateNotesRequestDtoVisibility(
                value,
                sourceValue);
        }
    }
}

