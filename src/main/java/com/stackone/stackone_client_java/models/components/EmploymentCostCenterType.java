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
 * EmploymentCostCenterType
 * 
 * <p>The type of the group
 */
public class EmploymentCostCenterType {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends EmploymentCostCenterValue> value;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends EmploymentCostCenterSourceValue> sourceValue;

    @JsonCreator
    public EmploymentCostCenterType(
            @JsonProperty("value") JsonNullable<? extends EmploymentCostCenterValue> value,
            @JsonProperty("source_value") JsonNullable<? extends EmploymentCostCenterSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public EmploymentCostCenterType() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentCostCenterValue> value() {
        return (JsonNullable<EmploymentCostCenterValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentCostCenterSourceValue> sourceValue() {
        return (JsonNullable<EmploymentCostCenterSourceValue>) sourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }


    public EmploymentCostCenterType withValue(EmploymentCostCenterValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public EmploymentCostCenterType withValue(JsonNullable<? extends EmploymentCostCenterValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public EmploymentCostCenterType withSourceValue(EmploymentCostCenterSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public EmploymentCostCenterType withSourceValue(JsonNullable<? extends EmploymentCostCenterSourceValue> sourceValue) {
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
        EmploymentCostCenterType other = (EmploymentCostCenterType) o;
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
        return Utils.toString(EmploymentCostCenterType.class,
                "value", value,
                "sourceValue", sourceValue);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends EmploymentCostCenterValue> value = JsonNullable.undefined();

        private JsonNullable<? extends EmploymentCostCenterSourceValue> sourceValue = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder value(EmploymentCostCenterValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends EmploymentCostCenterValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }


        public Builder sourceValue(EmploymentCostCenterSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends EmploymentCostCenterSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }

        public EmploymentCostCenterType build() {

            return new EmploymentCostCenterType(
                value, sourceValue);
        }

    }
}
