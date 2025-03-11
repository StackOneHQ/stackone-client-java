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
 * AtsUpdateJobRequestDtoJobStatus - Status of the job
 */

public class AtsUpdateJobRequestDtoJobStatus {

    /**
     * The status of the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends AtsUpdateJobRequestDtoValue> value;

    /**
     * The source value of the job status.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_value")
    private JsonNullable<? extends AtsUpdateJobRequestDtoSourceValue> sourceValue;

    @JsonCreator
    public AtsUpdateJobRequestDtoJobStatus(
            @JsonProperty("value") JsonNullable<? extends AtsUpdateJobRequestDtoValue> value,
            @JsonProperty("source_value") JsonNullable<? extends AtsUpdateJobRequestDtoSourceValue> sourceValue) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.value = value;
        this.sourceValue = sourceValue;
    }
    
    public AtsUpdateJobRequestDtoJobStatus() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The status of the job.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateJobRequestDtoValue> value() {
        return (JsonNullable<AtsUpdateJobRequestDtoValue>) value;
    }

    /**
     * The source value of the job status.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateJobRequestDtoSourceValue> sourceValue() {
        return (JsonNullable<AtsUpdateJobRequestDtoSourceValue>) sourceValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The status of the job.
     */
    public AtsUpdateJobRequestDtoJobStatus withValue(AtsUpdateJobRequestDtoValue value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * The status of the job.
     */
    public AtsUpdateJobRequestDtoJobStatus withValue(JsonNullable<? extends AtsUpdateJobRequestDtoValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * The source value of the job status.
     */
    public AtsUpdateJobRequestDtoJobStatus withSourceValue(AtsUpdateJobRequestDtoSourceValue sourceValue) {
        Utils.checkNotNull(sourceValue, "sourceValue");
        this.sourceValue = JsonNullable.of(sourceValue);
        return this;
    }

    /**
     * The source value of the job status.
     */
    public AtsUpdateJobRequestDtoJobStatus withSourceValue(JsonNullable<? extends AtsUpdateJobRequestDtoSourceValue> sourceValue) {
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
        AtsUpdateJobRequestDtoJobStatus other = (AtsUpdateJobRequestDtoJobStatus) o;
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
        return Utils.toString(AtsUpdateJobRequestDtoJobStatus.class,
                "value", value,
                "sourceValue", sourceValue);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AtsUpdateJobRequestDtoValue> value = JsonNullable.undefined();
 
        private JsonNullable<? extends AtsUpdateJobRequestDtoSourceValue> sourceValue = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The status of the job.
         */
        public Builder value(AtsUpdateJobRequestDtoValue value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        /**
         * The status of the job.
         */
        public Builder value(JsonNullable<? extends AtsUpdateJobRequestDtoValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        /**
         * The source value of the job status.
         */
        public Builder sourceValue(AtsUpdateJobRequestDtoSourceValue sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = JsonNullable.of(sourceValue);
            return this;
        }

        /**
         * The source value of the job status.
         */
        public Builder sourceValue(JsonNullable<? extends AtsUpdateJobRequestDtoSourceValue> sourceValue) {
            Utils.checkNotNull(sourceValue, "sourceValue");
            this.sourceValue = sourceValue;
            return this;
        }
        
        public AtsUpdateJobRequestDtoJobStatus build() {
            return new AtsUpdateJobRequestDtoJobStatus(
                value,
                sourceValue);
        }
    }
}

