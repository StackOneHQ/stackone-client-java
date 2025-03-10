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

public class ChannelsEnum {

    /**
     * The Channels of the campaign.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends ChannelsEnumValue> value;

    /**
     * The source value of the Channels.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends ChannelsEnumSourceValue> sourceValue;

    @JsonCreator
    public ChannelsEnum(
            @JsonProperty("value") JsonNullable<? extends ChannelsEnumValue> value,
            @JsonProperty("source_value") JsonNullable<? extends ChannelsEnumSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public ChannelsEnum() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The Channels of the campaign.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ChannelsEnumValue> value() {
        return (JsonNullable<ChannelsEnumValue>) value;
    }

    /**
     * The source value of the Channels.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ChannelsEnumSourceValue> sourceValue() {
        return (JsonNullable<ChannelsEnumSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Channels of the campaign.
     */
    public ChannelsEnum withValue(ChannelsEnumValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The Channels of the campaign.
     */
    public ChannelsEnum withValue(JsonNullable<? extends ChannelsEnumValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The source value of the Channels.
     */
    public ChannelsEnum withSourceValue(ChannelsEnumSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The source value of the Channels.
     */
    public ChannelsEnum withSourceValue(JsonNullable<? extends ChannelsEnumSourceValue> sourceValue) {
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
        ChannelsEnum other = (ChannelsEnum) o;
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
        return Utils.toString(ChannelsEnum.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends ChannelsEnumValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends ChannelsEnumSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Channels of the campaign.
         */
        public Builder value(ChannelsEnumValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The Channels of the campaign.
         */
        public Builder value(JsonNullable<? extends ChannelsEnumValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        /**
         * The source value of the Channels.
         */
        public Builder sourceValue(ChannelsEnumSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The source value of the Channels.
         */
        public Builder sourceValue(JsonNullable<? extends ChannelsEnumSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public ChannelsEnum build() {
            return new ChannelsEnum(
                value,
                sourceValue);
        }
    }
}

