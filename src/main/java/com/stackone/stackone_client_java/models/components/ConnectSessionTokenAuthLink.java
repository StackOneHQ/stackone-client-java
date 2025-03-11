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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class ConnectSessionTokenAuthLink {

    @JsonProperty("id")
    private double id;

    @JsonProperty("organization_id")
    private double organizationId;

    @JsonProperty("project_id")
    private String projectId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("categories")
    private JsonNullable<? extends List<ConnectSessionTokenAuthLinkCategories>> categories;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private JsonNullable<String> provider;

    @JsonProperty("origin_owner_id")
    private String originOwnerId;

    @JsonProperty("origin_owner_name")
    private String originOwnerName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("origin_username")
    private JsonNullable<String> originUsername;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private JsonNullable<String> accountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private JsonNullable<String> label;

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * Arbitrary set of key and values defined during the session token creation. This can be used to tag an account (eg. based on their pricing plan)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends ConnectSessionTokenAuthLinkMetadata> metadata;

    @JsonProperty("token")
    private String token;

    @JsonProperty("auth_link_url")
    private String authLinkUrl;

    @JsonCreator
    public ConnectSessionTokenAuthLink(
            @JsonProperty("id") double id,
            @JsonProperty("organization_id") double organizationId,
            @JsonProperty("project_id") String projectId,
            @JsonProperty("categories") JsonNullable<? extends List<ConnectSessionTokenAuthLinkCategories>> categories,
            @JsonProperty("provider") JsonNullable<String> provider,
            @JsonProperty("origin_owner_id") String originOwnerId,
            @JsonProperty("origin_owner_name") String originOwnerName,
            @JsonProperty("origin_username") JsonNullable<String> originUsername,
            @JsonProperty("account_id") JsonNullable<String> accountId,
            @JsonProperty("label") JsonNullable<String> label,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("metadata") JsonNullable<? extends ConnectSessionTokenAuthLinkMetadata> metadata,
            @JsonProperty("token") String token,
            @JsonProperty("auth_link_url") String authLinkUrl) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(projectId, "projectId");
        Utils.checkNotNull(categories, "categories");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(originOwnerId, "originOwnerId");
        Utils.checkNotNull(originOwnerName, "originOwnerName");
        Utils.checkNotNull(originUsername, "originUsername");
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(token, "token");
        Utils.checkNotNull(authLinkUrl, "authLinkUrl");
        this.id = id;
        this.organizationId = organizationId;
        this.projectId = projectId;
        this.categories = categories;
        this.provider = provider;
        this.originOwnerId = originOwnerId;
        this.originOwnerName = originOwnerName;
        this.originUsername = originUsername;
        this.accountId = accountId;
        this.label = label;
        this.createdAt = createdAt;
        this.metadata = metadata;
        this.token = token;
        this.authLinkUrl = authLinkUrl;
    }
    
    public ConnectSessionTokenAuthLink(
            double id,
            double organizationId,
            String projectId,
            String originOwnerId,
            String originOwnerName,
            OffsetDateTime createdAt,
            String token,
            String authLinkUrl) {
        this(id, organizationId, projectId, JsonNullable.undefined(), JsonNullable.undefined(), originOwnerId, originOwnerName, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), createdAt, JsonNullable.undefined(), token, authLinkUrl);
    }

    @JsonIgnore
    public double id() {
        return id;
    }

    @JsonIgnore
    public double organizationId() {
        return organizationId;
    }

    @JsonIgnore
    public String projectId() {
        return projectId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<ConnectSessionTokenAuthLinkCategories>> categories() {
        return (JsonNullable<List<ConnectSessionTokenAuthLinkCategories>>) categories;
    }

    @JsonIgnore
    public JsonNullable<String> provider() {
        return provider;
    }

    @JsonIgnore
    public String originOwnerId() {
        return originOwnerId;
    }

    @JsonIgnore
    public String originOwnerName() {
        return originOwnerName;
    }

    @JsonIgnore
    public JsonNullable<String> originUsername() {
        return originUsername;
    }

    @JsonIgnore
    public JsonNullable<String> accountId() {
        return accountId;
    }

    @JsonIgnore
    public JsonNullable<String> label() {
        return label;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * Arbitrary set of key and values defined during the session token creation. This can be used to tag an account (eg. based on their pricing plan)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ConnectSessionTokenAuthLinkMetadata> metadata() {
        return (JsonNullable<ConnectSessionTokenAuthLinkMetadata>) metadata;
    }

    @JsonIgnore
    public String token() {
        return token;
    }

    @JsonIgnore
    public String authLinkUrl() {
        return authLinkUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConnectSessionTokenAuthLink withId(double id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ConnectSessionTokenAuthLink withOrganizationId(double organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public ConnectSessionTokenAuthLink withProjectId(String projectId) {
        Utils.checkNotNull(projectId, "projectId");
        this.projectId = projectId;
        return this;
    }

    public ConnectSessionTokenAuthLink withCategories(List<ConnectSessionTokenAuthLinkCategories> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = JsonNullable.of(categories);
        return this;
    }

    public ConnectSessionTokenAuthLink withCategories(JsonNullable<? extends List<ConnectSessionTokenAuthLinkCategories>> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = categories;
        return this;
    }

    public ConnectSessionTokenAuthLink withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = JsonNullable.of(provider);
        return this;
    }

    public ConnectSessionTokenAuthLink withProvider(JsonNullable<String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    public ConnectSessionTokenAuthLink withOriginOwnerId(String originOwnerId) {
        Utils.checkNotNull(originOwnerId, "originOwnerId");
        this.originOwnerId = originOwnerId;
        return this;
    }

    public ConnectSessionTokenAuthLink withOriginOwnerName(String originOwnerName) {
        Utils.checkNotNull(originOwnerName, "originOwnerName");
        this.originOwnerName = originOwnerName;
        return this;
    }

    public ConnectSessionTokenAuthLink withOriginUsername(String originUsername) {
        Utils.checkNotNull(originUsername, "originUsername");
        this.originUsername = JsonNullable.of(originUsername);
        return this;
    }

    public ConnectSessionTokenAuthLink withOriginUsername(JsonNullable<String> originUsername) {
        Utils.checkNotNull(originUsername, "originUsername");
        this.originUsername = originUsername;
        return this;
    }

    public ConnectSessionTokenAuthLink withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = JsonNullable.of(accountId);
        return this;
    }

    public ConnectSessionTokenAuthLink withAccountId(JsonNullable<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public ConnectSessionTokenAuthLink withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = JsonNullable.of(label);
        return this;
    }

    public ConnectSessionTokenAuthLink withLabel(JsonNullable<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    public ConnectSessionTokenAuthLink withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Arbitrary set of key and values defined during the session token creation. This can be used to tag an account (eg. based on their pricing plan)
     */
    public ConnectSessionTokenAuthLink withMetadata(ConnectSessionTokenAuthLinkMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    /**
     * Arbitrary set of key and values defined during the session token creation. This can be used to tag an account (eg. based on their pricing plan)
     */
    public ConnectSessionTokenAuthLink withMetadata(JsonNullable<? extends ConnectSessionTokenAuthLinkMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public ConnectSessionTokenAuthLink withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }

    public ConnectSessionTokenAuthLink withAuthLinkUrl(String authLinkUrl) {
        Utils.checkNotNull(authLinkUrl, "authLinkUrl");
        this.authLinkUrl = authLinkUrl;
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
        ConnectSessionTokenAuthLink other = (ConnectSessionTokenAuthLink) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.organizationId, other.organizationId) &&
            Objects.deepEquals(this.projectId, other.projectId) &&
            Objects.deepEquals(this.categories, other.categories) &&
            Objects.deepEquals(this.provider, other.provider) &&
            Objects.deepEquals(this.originOwnerId, other.originOwnerId) &&
            Objects.deepEquals(this.originOwnerName, other.originOwnerName) &&
            Objects.deepEquals(this.originUsername, other.originUsername) &&
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.token, other.token) &&
            Objects.deepEquals(this.authLinkUrl, other.authLinkUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            organizationId,
            projectId,
            categories,
            provider,
            originOwnerId,
            originOwnerName,
            originUsername,
            accountId,
            label,
            createdAt,
            metadata,
            token,
            authLinkUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectSessionTokenAuthLink.class,
                "id", id,
                "organizationId", organizationId,
                "projectId", projectId,
                "categories", categories,
                "provider", provider,
                "originOwnerId", originOwnerId,
                "originOwnerName", originOwnerName,
                "originUsername", originUsername,
                "accountId", accountId,
                "label", label,
                "createdAt", createdAt,
                "metadata", metadata,
                "token", token,
                "authLinkUrl", authLinkUrl);
    }
    
    public final static class Builder {
 
        private Double id;
 
        private Double organizationId;
 
        private String projectId;
 
        private JsonNullable<? extends List<ConnectSessionTokenAuthLinkCategories>> categories = JsonNullable.undefined();
 
        private JsonNullable<String> provider = JsonNullable.undefined();
 
        private String originOwnerId;
 
        private String originOwnerName;
 
        private JsonNullable<String> originUsername = JsonNullable.undefined();
 
        private JsonNullable<String> accountId = JsonNullable.undefined();
 
        private JsonNullable<String> label = JsonNullable.undefined();
 
        private OffsetDateTime createdAt;
 
        private JsonNullable<? extends ConnectSessionTokenAuthLinkMetadata> metadata = JsonNullable.undefined();
 
        private String token;
 
        private String authLinkUrl;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(double id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder organizationId(double organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        public Builder projectId(String projectId) {
            Utils.checkNotNull(projectId, "projectId");
            this.projectId = projectId;
            return this;
        }

        public Builder categories(List<ConnectSessionTokenAuthLinkCategories> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = JsonNullable.of(categories);
            return this;
        }

        public Builder categories(JsonNullable<? extends List<ConnectSessionTokenAuthLinkCategories>> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = categories;
            return this;
        }

        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = JsonNullable.of(provider);
            return this;
        }

        public Builder provider(JsonNullable<String> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }

        public Builder originOwnerId(String originOwnerId) {
            Utils.checkNotNull(originOwnerId, "originOwnerId");
            this.originOwnerId = originOwnerId;
            return this;
        }

        public Builder originOwnerName(String originOwnerName) {
            Utils.checkNotNull(originOwnerName, "originOwnerName");
            this.originOwnerName = originOwnerName;
            return this;
        }

        public Builder originUsername(String originUsername) {
            Utils.checkNotNull(originUsername, "originUsername");
            this.originUsername = JsonNullable.of(originUsername);
            return this;
        }

        public Builder originUsername(JsonNullable<String> originUsername) {
            Utils.checkNotNull(originUsername, "originUsername");
            this.originUsername = originUsername;
            return this;
        }

        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = JsonNullable.of(accountId);
            return this;
        }

        public Builder accountId(JsonNullable<String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = JsonNullable.of(label);
            return this;
        }

        public Builder label(JsonNullable<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Arbitrary set of key and values defined during the session token creation. This can be used to tag an account (eg. based on their pricing plan)
         */
        public Builder metadata(ConnectSessionTokenAuthLinkMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        /**
         * Arbitrary set of key and values defined during the session token creation. This can be used to tag an account (eg. based on their pricing plan)
         */
        public Builder metadata(JsonNullable<? extends ConnectSessionTokenAuthLinkMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }

        public Builder authLinkUrl(String authLinkUrl) {
            Utils.checkNotNull(authLinkUrl, "authLinkUrl");
            this.authLinkUrl = authLinkUrl;
            return this;
        }
        
        public ConnectSessionTokenAuthLink build() {
            return new ConnectSessionTokenAuthLink(
                id,
                organizationId,
                projectId,
                categories,
                provider,
                originOwnerId,
                originOwnerName,
                originUsername,
                accountId,
                label,
                createdAt,
                metadata,
                token,
                authLinkUrl);
        }
    }
}

