/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class HrisGetGroupRequestBuilder {

    private HrisGetGroupRequest request;
    private Optional<String> serverURL = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallHrisGetGroup sdk;

    public HrisGetGroupRequestBuilder(SDKMethodInterfaces.MethodCallHrisGetGroup sdk) {
        this.sdk = sdk;
    }

    public HrisGetGroupRequestBuilder request(HrisGetGroupRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public HrisGetGroupRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public HrisGetGroupRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }
                
    public HrisGetGroupRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisGetGroupRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public HrisGetGroupResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getGroup(
            request,
            serverURL,
            options);
    }
}
