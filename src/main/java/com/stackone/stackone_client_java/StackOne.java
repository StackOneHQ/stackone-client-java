/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java;

import com.stackone.stackone_client_java.utils.HTTPClient;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.SpeakeasyHTTPClient;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

/**
 * LMS: The documentation for the StackOne Unified API - LMS
 */
public class StackOne {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        "https://api.stackone.com",
    };

    private final ConnectSessions connectSessions;

    private final Accounts accounts;

    private final Connectors connectors;

    private final Proxy proxy;

    private final Hris hris;

    private final Ats ats;

    private final Crm crm;

    private final Iam iam;

    private final Marketing marketing;

    private final Lms lms;

    public ConnectSessions connectSessions() {
        return connectSessions;
    }

    public Accounts accounts() {
        return accounts;
    }

    public Connectors connectors() {
        return connectors;
    }

    public Proxy proxy() {
        return proxy;
    }

    public Hris hris() {
        return hris;
    }

    public Ats ats() {
        return ats;
    }

    public Crm crm() {
        return crm;
    }

    public Iam iam() {
        return iam;
    }

    public Marketing marketing() {
        return marketing;
    }

    public Lms lms() {
        return lms;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        
        /**
         * Configures the SDK to use the provided security details.
         *
         * @param security The security details to use for all requests.
         * @return The builder instance.
         */
        public Builder security(com.stackone.stackone_client_java.models.components.Security security) {
            this.sdkConfiguration.securitySource = SecuritySource.of(security);
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public StackOne build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new StackOne(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private StackOne(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.connectSessions = new ConnectSessions(sdkConfiguration);
        this.accounts = new Accounts(sdkConfiguration);
        this.connectors = new Connectors(sdkConfiguration);
        this.proxy = new Proxy(sdkConfiguration);
        this.hris = new Hris(sdkConfiguration);
        this.ats = new Ats(sdkConfiguration);
        this.crm = new Crm(sdkConfiguration);
        this.iam = new Iam(sdkConfiguration);
        this.marketing = new Marketing(sdkConfiguration);
        this.lms = new Lms(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}
