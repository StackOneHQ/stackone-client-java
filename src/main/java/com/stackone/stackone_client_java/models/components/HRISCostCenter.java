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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class HRISCostCenter {

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

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unified_custom_fields")
    private JsonNullable<? extends Map<String, Object>> unifiedCustomFields;

    /**
     * The name of the group
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The list of parent group ids of the given group
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_ids")
    private JsonNullable<? extends List<String>> parentIds;

    /**
     * Provider's list of parent group remote ids of the given group
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_parent_ids")
    private JsonNullable<? extends List<String>> remoteParentIds;

    /**
     * The list of group owner ids of the given group
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner_ids")
    private JsonNullable<? extends List<String>> ownerIds;

    /**
     * The list of remote group owner ids of the given group
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote_owner_ids")
    private JsonNullable<? extends List<String>> remoteOwnerIds;

    /**
     * The distribution percentage for cost_center
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("distribution_percentage")
    private JsonNullable<Double> distributionPercentage;

    /**
     * The type of the group
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends HRISCostCenterType> type;

    @JsonCreator
    public HRISCostCenter(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("remote_id") JsonNullable<String> remoteId,
            @JsonProperty("unified_custom_fields") JsonNullable<? extends Map<String, Object>> unifiedCustomFields,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("parent_ids") JsonNullable<? extends List<String>> parentIds,
            @JsonProperty("remote_parent_ids") JsonNullable<? extends List<String>> remoteParentIds,
            @JsonProperty("owner_ids") JsonNullable<? extends List<String>> ownerIds,
            @JsonProperty("remote_owner_ids") JsonNullable<? extends List<String>> remoteOwnerIds,
            @JsonProperty("distribution_percentage") JsonNullable<Double> distributionPercentage,
            @JsonProperty("type") JsonNullable<? extends HRISCostCenterType> type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(remoteId, "remoteId");
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(parentIds, "parentIds");
        Utils.checkNotNull(remoteParentIds, "remoteParentIds");
        Utils.checkNotNull(ownerIds, "ownerIds");
        Utils.checkNotNull(remoteOwnerIds, "remoteOwnerIds");
        Utils.checkNotNull(distributionPercentage, "distributionPercentage");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.remoteId = remoteId;
        this.unifiedCustomFields = unifiedCustomFields;
        this.name = name;
        this.parentIds = parentIds;
        this.remoteParentIds = remoteParentIds;
        this.ownerIds = ownerIds;
        this.remoteOwnerIds = remoteOwnerIds;
        this.distributionPercentage = distributionPercentage;
        this.type = type;
    }
    
    public HRISCostCenter() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> unifiedCustomFields() {
        return (JsonNullable<Map<String, Object>>) unifiedCustomFields;
    }

    /**
     * The name of the group
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The list of parent group ids of the given group
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> parentIds() {
        return (JsonNullable<List<String>>) parentIds;
    }

    /**
     * Provider's list of parent group remote ids of the given group
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> remoteParentIds() {
        return (JsonNullable<List<String>>) remoteParentIds;
    }

    /**
     * The list of group owner ids of the given group
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> ownerIds() {
        return (JsonNullable<List<String>>) ownerIds;
    }

    /**
     * The list of remote group owner ids of the given group
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> remoteOwnerIds() {
        return (JsonNullable<List<String>>) remoteOwnerIds;
    }

    /**
     * The distribution percentage for cost_center
     */
    @JsonIgnore
    public JsonNullable<Double> distributionPercentage() {
        return distributionPercentage;
    }

    /**
     * The type of the group
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<HRISCostCenterType> type() {
        return (JsonNullable<HRISCostCenterType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier
     */
    public HRISCostCenter withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public HRISCostCenter withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public HRISCostCenter withRemoteId(String remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = JsonNullable.of(remoteId);
        return this;
    }

    /**
     * Provider's unique identifier
     */
    public HRISCostCenter withRemoteId(JsonNullable<String> remoteId) {
        Utils.checkNotNull(remoteId, "remoteId");
        this.remoteId = remoteId;
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public HRISCostCenter withUnifiedCustomFields(Map<String, Object> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
        return this;
    }

    /**
     * Custom Unified Fields configured in your StackOne project
     */
    public HRISCostCenter withUnifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
        Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
        this.unifiedCustomFields = unifiedCustomFields;
        return this;
    }

    /**
     * The name of the group
     */
    public HRISCostCenter withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the group
     */
    public HRISCostCenter withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The list of parent group ids of the given group
     */
    public HRISCostCenter withParentIds(List<String> parentIds) {
        Utils.checkNotNull(parentIds, "parentIds");
        this.parentIds = JsonNullable.of(parentIds);
        return this;
    }

    /**
     * The list of parent group ids of the given group
     */
    public HRISCostCenter withParentIds(JsonNullable<? extends List<String>> parentIds) {
        Utils.checkNotNull(parentIds, "parentIds");
        this.parentIds = parentIds;
        return this;
    }

    /**
     * Provider's list of parent group remote ids of the given group
     */
    public HRISCostCenter withRemoteParentIds(List<String> remoteParentIds) {
        Utils.checkNotNull(remoteParentIds, "remoteParentIds");
        this.remoteParentIds = JsonNullable.of(remoteParentIds);
        return this;
    }

    /**
     * Provider's list of parent group remote ids of the given group
     */
    public HRISCostCenter withRemoteParentIds(JsonNullable<? extends List<String>> remoteParentIds) {
        Utils.checkNotNull(remoteParentIds, "remoteParentIds");
        this.remoteParentIds = remoteParentIds;
        return this;
    }

    /**
     * The list of group owner ids of the given group
     */
    public HRISCostCenter withOwnerIds(List<String> ownerIds) {
        Utils.checkNotNull(ownerIds, "ownerIds");
        this.ownerIds = JsonNullable.of(ownerIds);
        return this;
    }

    /**
     * The list of group owner ids of the given group
     */
    public HRISCostCenter withOwnerIds(JsonNullable<? extends List<String>> ownerIds) {
        Utils.checkNotNull(ownerIds, "ownerIds");
        this.ownerIds = ownerIds;
        return this;
    }

    /**
     * The list of remote group owner ids of the given group
     */
    public HRISCostCenter withRemoteOwnerIds(List<String> remoteOwnerIds) {
        Utils.checkNotNull(remoteOwnerIds, "remoteOwnerIds");
        this.remoteOwnerIds = JsonNullable.of(remoteOwnerIds);
        return this;
    }

    /**
     * The list of remote group owner ids of the given group
     */
    public HRISCostCenter withRemoteOwnerIds(JsonNullable<? extends List<String>> remoteOwnerIds) {
        Utils.checkNotNull(remoteOwnerIds, "remoteOwnerIds");
        this.remoteOwnerIds = remoteOwnerIds;
        return this;
    }

    /**
     * The distribution percentage for cost_center
     */
    public HRISCostCenter withDistributionPercentage(double distributionPercentage) {
        Utils.checkNotNull(distributionPercentage, "distributionPercentage");
        this.distributionPercentage = JsonNullable.of(distributionPercentage);
        return this;
    }

    /**
     * The distribution percentage for cost_center
     */
    public HRISCostCenter withDistributionPercentage(JsonNullable<Double> distributionPercentage) {
        Utils.checkNotNull(distributionPercentage, "distributionPercentage");
        this.distributionPercentage = distributionPercentage;
        return this;
    }

    /**
     * The type of the group
     */
    public HRISCostCenter withType(HRISCostCenterType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of the group
     */
    public HRISCostCenter withType(JsonNullable<? extends HRISCostCenterType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        HRISCostCenter other = (HRISCostCenter) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.remoteId, other.remoteId) &&
            Objects.deepEquals(this.unifiedCustomFields, other.unifiedCustomFields) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.parentIds, other.parentIds) &&
            Objects.deepEquals(this.remoteParentIds, other.remoteParentIds) &&
            Objects.deepEquals(this.ownerIds, other.ownerIds) &&
            Objects.deepEquals(this.remoteOwnerIds, other.remoteOwnerIds) &&
            Objects.deepEquals(this.distributionPercentage, other.distributionPercentage) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            remoteId,
            unifiedCustomFields,
            name,
            parentIds,
            remoteParentIds,
            ownerIds,
            remoteOwnerIds,
            distributionPercentage,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HRISCostCenter.class,
                "id", id,
                "remoteId", remoteId,
                "unifiedCustomFields", unifiedCustomFields,
                "name", name,
                "parentIds", parentIds,
                "remoteParentIds", remoteParentIds,
                "ownerIds", ownerIds,
                "remoteOwnerIds", remoteOwnerIds,
                "distributionPercentage", distributionPercentage,
                "type", type);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> remoteId = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> unifiedCustomFields = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> parentIds = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> remoteParentIds = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> ownerIds = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> remoteOwnerIds = JsonNullable.undefined();
 
        private JsonNullable<Double> distributionPercentage = JsonNullable.undefined();
 
        private JsonNullable<? extends HRISCostCenterType> type = JsonNullable.undefined();  
        
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

        /**
         * Custom Unified Fields configured in your StackOne project
         */
        public Builder unifiedCustomFields(Map<String, Object> unifiedCustomFields) {
            Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
            this.unifiedCustomFields = JsonNullable.of(unifiedCustomFields);
            return this;
        }

        /**
         * Custom Unified Fields configured in your StackOne project
         */
        public Builder unifiedCustomFields(JsonNullable<? extends Map<String, Object>> unifiedCustomFields) {
            Utils.checkNotNull(unifiedCustomFields, "unifiedCustomFields");
            this.unifiedCustomFields = unifiedCustomFields;
            return this;
        }

        /**
         * The name of the group
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the group
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The list of parent group ids of the given group
         */
        public Builder parentIds(List<String> parentIds) {
            Utils.checkNotNull(parentIds, "parentIds");
            this.parentIds = JsonNullable.of(parentIds);
            return this;
        }

        /**
         * The list of parent group ids of the given group
         */
        public Builder parentIds(JsonNullable<? extends List<String>> parentIds) {
            Utils.checkNotNull(parentIds, "parentIds");
            this.parentIds = parentIds;
            return this;
        }

        /**
         * Provider's list of parent group remote ids of the given group
         */
        public Builder remoteParentIds(List<String> remoteParentIds) {
            Utils.checkNotNull(remoteParentIds, "remoteParentIds");
            this.remoteParentIds = JsonNullable.of(remoteParentIds);
            return this;
        }

        /**
         * Provider's list of parent group remote ids of the given group
         */
        public Builder remoteParentIds(JsonNullable<? extends List<String>> remoteParentIds) {
            Utils.checkNotNull(remoteParentIds, "remoteParentIds");
            this.remoteParentIds = remoteParentIds;
            return this;
        }

        /**
         * The list of group owner ids of the given group
         */
        public Builder ownerIds(List<String> ownerIds) {
            Utils.checkNotNull(ownerIds, "ownerIds");
            this.ownerIds = JsonNullable.of(ownerIds);
            return this;
        }

        /**
         * The list of group owner ids of the given group
         */
        public Builder ownerIds(JsonNullable<? extends List<String>> ownerIds) {
            Utils.checkNotNull(ownerIds, "ownerIds");
            this.ownerIds = ownerIds;
            return this;
        }

        /**
         * The list of remote group owner ids of the given group
         */
        public Builder remoteOwnerIds(List<String> remoteOwnerIds) {
            Utils.checkNotNull(remoteOwnerIds, "remoteOwnerIds");
            this.remoteOwnerIds = JsonNullable.of(remoteOwnerIds);
            return this;
        }

        /**
         * The list of remote group owner ids of the given group
         */
        public Builder remoteOwnerIds(JsonNullable<? extends List<String>> remoteOwnerIds) {
            Utils.checkNotNull(remoteOwnerIds, "remoteOwnerIds");
            this.remoteOwnerIds = remoteOwnerIds;
            return this;
        }

        /**
         * The distribution percentage for cost_center
         */
        public Builder distributionPercentage(double distributionPercentage) {
            Utils.checkNotNull(distributionPercentage, "distributionPercentage");
            this.distributionPercentage = JsonNullable.of(distributionPercentage);
            return this;
        }

        /**
         * The distribution percentage for cost_center
         */
        public Builder distributionPercentage(JsonNullable<Double> distributionPercentage) {
            Utils.checkNotNull(distributionPercentage, "distributionPercentage");
            this.distributionPercentage = distributionPercentage;
            return this;
        }

        /**
         * The type of the group
         */
        public Builder type(HRISCostCenterType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of the group
         */
        public Builder type(JsonNullable<? extends HRISCostCenterType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public HRISCostCenter build() {
            return new HRISCostCenter(
                id,
                remoteId,
                unifiedCustomFields,
                name,
                parentIds,
                remoteParentIds,
                ownerIds,
                remoteOwnerIds,
                distributionPercentage,
                type);
        }
    }
}

