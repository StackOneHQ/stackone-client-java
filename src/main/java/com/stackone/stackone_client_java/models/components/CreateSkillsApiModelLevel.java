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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * CreateSkillsApiModelLevel - The hierarchal level of the skill
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class CreateSkillsApiModelLevel {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends CreateSkillsApiModelLevelValue> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends CreateSkillsApiModelLevelSourceValue> sourceValue;

    @JsonCreator
    public CreateSkillsApiModelLevel(
            @JsonProperty("value") JsonNullable<? extends CreateSkillsApiModelLevelValue> value,
            @JsonProperty("source_value") JsonNullable<? extends CreateSkillsApiModelLevelSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public CreateSkillsApiModelLevel() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CreateSkillsApiModelLevelValue> value() {
        return (JsonNullable<CreateSkillsApiModelLevelValue>) value;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CreateSkillsApiModelLevelSourceValue> sourceValue() {
        return (JsonNullable<CreateSkillsApiModelLevelSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateSkillsApiModelLevel withValue(CreateSkillsApiModelLevelValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public CreateSkillsApiModelLevel withValue(JsonNullable<? extends CreateSkillsApiModelLevelValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public CreateSkillsApiModelLevel withSourceValue(CreateSkillsApiModelLevelSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    public CreateSkillsApiModelLevel withSourceValue(JsonNullable<? extends CreateSkillsApiModelLevelSourceValue> sourceValue) {
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
        CreateSkillsApiModelLevel other = (CreateSkillsApiModelLevel) o;
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
        return Utils.toString(CreateSkillsApiModelLevel.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends CreateSkillsApiModelLevelValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends CreateSkillsApiModelLevelSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(CreateSkillsApiModelLevelValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends CreateSkillsApiModelLevelValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder sourceValue(CreateSkillsApiModelLevelSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        public Builder sourceValue(JsonNullable<? extends CreateSkillsApiModelLevelSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public CreateSkillsApiModelLevel build() {
            return new CreateSkillsApiModelLevel(
                value,
                sourceValue);
        }
    }
}

