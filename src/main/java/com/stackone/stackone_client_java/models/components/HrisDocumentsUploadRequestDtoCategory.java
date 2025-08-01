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
 * HrisDocumentsUploadRequestDtoCategory
 * 
 * <p>The category to be associated with the file to be uploaded. Id will take precedence over name.
 */
public class HrisDocumentsUploadRequestDtoCategory {
    /**
     * The category name to associate with the file
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends HrisDocumentsUploadRequestDtoCategoryValue> value;

    /**
     * The provider specific category for associating uploaded files, if provided, the value will be ignored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<String> sourceValue;

    @JsonCreator
    public HrisDocumentsUploadRequestDtoCategory(
            @JsonProperty("value") JsonNullable<? extends HrisDocumentsUploadRequestDtoCategoryValue> value,
            @JsonProperty("source_value") JsonNullable<String> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public HrisDocumentsUploadRequestDtoCategory() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The category name to associate with the file
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HrisDocumentsUploadRequestDtoCategoryValue> value() {
        return (JsonNullable<HrisDocumentsUploadRequestDtoCategoryValue>) value;
    }

    /**
     * The provider specific category for associating uploaded files, if provided, the value will be ignored.
     */
    @JsonIgnore
    public JsonNullable<String> sourceValue() {
        return sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The category name to associate with the file
     */
    public HrisDocumentsUploadRequestDtoCategory withValue(HrisDocumentsUploadRequestDtoCategoryValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The category name to associate with the file
     */
    public HrisDocumentsUploadRequestDtoCategory withValue(JsonNullable<? extends HrisDocumentsUploadRequestDtoCategoryValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The provider specific category for associating uploaded files, if provided, the value will be ignored.
     */
    public HrisDocumentsUploadRequestDtoCategory withSourceValue(String sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The provider specific category for associating uploaded files, if provided, the value will be ignored.
     */
    public HrisDocumentsUploadRequestDtoCategory withSourceValue(JsonNullable<String> sourceValue) {
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
        HrisDocumentsUploadRequestDtoCategory other = (HrisDocumentsUploadRequestDtoCategory) o;
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
        return Utils.toString(HrisDocumentsUploadRequestDtoCategory.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends HrisDocumentsUploadRequestDtoCategoryValue> value = JsonNullable.undefined();

        private JsonNullable<String> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The category name to associate with the file
         */
        public Builder value(HrisDocumentsUploadRequestDtoCategoryValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The category name to associate with the file
         */
        public Builder value(JsonNullable<? extends HrisDocumentsUploadRequestDtoCategoryValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        /**
         * The provider specific category for associating uploaded files, if provided, the value will be ignored.
         */
        public Builder sourceValue(String sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The provider specific category for associating uploaded files, if provided, the value will be ignored.
         */
        public Builder sourceValue(JsonNullable<String> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public HrisDocumentsUploadRequestDtoCategory build() {

            return new HrisDocumentsUploadRequestDtoCategory(
                value, sourceValue);
        }

    }
}
