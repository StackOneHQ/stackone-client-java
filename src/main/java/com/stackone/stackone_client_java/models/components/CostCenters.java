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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class CostCenters {

    /**
     * Unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * Provider's unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_id")
    private JsonNullable<String> remoteId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("distribution_percentage")
    private JsonNullable<Double> distributionPercentage;

    @JsonCreator
    public CostCenters(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("distribution_percentage") JsonNullable<Double> distributionPercentage) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(distributionPercentage, "distributionPercentage");
        this.id = id;
        this.remoteId = remoteId;
        this.name = name;
        this.distributionPercentage = distributionPercentage;
    }
    
    public CostCenters() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * Provider's unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> remoteId() {
        return remoteId;
    }

    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @JsonIgnore
    public JsonNullable<Double> distributionPercentage() {
        return distributionPercentage;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public CostCenters withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public CostCenters withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public CostCenters withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public CostCenters withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    public CostCenters withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    public CostCenters withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CostCenters withDistributionPercentage(double distributionPercentage) {
        Utils.checkNotNull(distributionPercentage, "distributionPercentage");
        this.distributionPercentage = JsonNullable.of(distributionPercentage);
        return this;
    }

    public CostCenters withDistributionPercentage(JsonNullable<Double> distributionPercentage) {
        Utils.checkNotNull(distributionPercentage, "distributionPercentage");
        this.distributionPercentage = distributionPercentage;
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
        CostCenters other = (CostCenters) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.distributionPercentage, other.distributionPercentage);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            name,
            distributionPercentage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CostCenters.class,
                "id", id,
                "remoteId", remoteId,
                "name", name,
                "distributionPercentage", distributionPercentage);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<Double> distributionPercentage = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Provider's unique identifier
         */
        public Builder remoteId(String remoteId) {
            Utils.checkNotNull(remoteId, "remoteId");
            this.remoteId = JsonNullable.of(remoteId);
            return this;
        }

        /**
         * Provider's unique identifier
         */
        public Builder remoteId(JsonNullable<String> remoteId) {
            Utils.checkNotNull(remoteId, "remoteId");
            this.remoteId = remoteId;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder distributionPercentage(double distributionPercentage) {
            Utils.checkNotNull(distributionPercentage, "distributionPercentage");
            this.distributionPercentage = JsonNullable.of(distributionPercentage);
            return this;
        }

        public Builder distributionPercentage(JsonNullable<Double> distributionPercentage) {
            Utils.checkNotNull(distributionPercentage, "distributionPercentage");
            this.distributionPercentage = distributionPercentage;
            return this;
        }
        
        public CostCenters build() {
            return new CostCenters(
                id,
                remoteId,
                name,
                distributionPercentage);
        }
    }
}

