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
 * AtsDocumentApiModelFileFormat
 * 
 * <p>The file format of the file
 */
public class AtsDocumentApiModelFileFormat {
    /**
     * The file format of the file, expressed as a file extension
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends AtsDocumentApiModelValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends AtsDocumentApiModelFileFormatSourceValue> sourceValue;

    @JsonCreator
    public AtsDocumentApiModelFileFormat(
            @JsonProperty("value") JsonNullable<? extends AtsDocumentApiModelValue> value,
            @JsonProperty("source_value") JsonNullable<? extends AtsDocumentApiModelFileFormatSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public AtsDocumentApiModelFileFormat() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The file format of the file, expressed as a file extension
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsDocumentApiModelValue> value() {
        return (JsonNullable<AtsDocumentApiModelValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsDocumentApiModelFileFormatSourceValue> sourceValue() {
        return (JsonNullable<AtsDocumentApiModelFileFormatSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The file format of the file, expressed as a file extension
     */
    public AtsDocumentApiModelFileFormat withValue(AtsDocumentApiModelValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The file format of the file, expressed as a file extension
     */
    public AtsDocumentApiModelFileFormat withValue(JsonNullable<? extends AtsDocumentApiModelValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public AtsDocumentApiModelFileFormat withSourceValue(AtsDocumentApiModelFileFormatSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public AtsDocumentApiModelFileFormat withSourceValue(JsonNullable<? extends AtsDocumentApiModelFileFormatSourceValue> sourceValue) {
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
        AtsDocumentApiModelFileFormat other = (AtsDocumentApiModelFileFormat) o;
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
        return Utils.toString(AtsDocumentApiModelFileFormat.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends AtsDocumentApiModelValue> value = JsonNullable.undefined();

        private JsonNullable<? extends AtsDocumentApiModelFileFormatSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The file format of the file, expressed as a file extension
         */
        public Builder value(AtsDocumentApiModelValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The file format of the file, expressed as a file extension
         */
        public Builder value(JsonNullable<? extends AtsDocumentApiModelValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(AtsDocumentApiModelFileFormatSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends AtsDocumentApiModelFileFormatSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public AtsDocumentApiModelFileFormat build() {

            return new AtsDocumentApiModelFileFormat(
                value, sourceValue);
        }

    }
}
