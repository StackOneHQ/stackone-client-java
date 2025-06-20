/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class HrisGetLocationRequestBuilder {

    private HrisGetLocationRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallHrisGetLocation sdk;

    public HrisGetLocationRequestBuilder(SDKMethodInterfaces.MethodCallHrisGetLocation sdk) {
        this.sdk = sdk;
    }

    public HrisGetLocationRequestBuilder request(HrisGetLocationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public HrisGetLocationRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisGetLocationRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public HrisGetLocationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getLocation(
            request,
            options);
    }
}
