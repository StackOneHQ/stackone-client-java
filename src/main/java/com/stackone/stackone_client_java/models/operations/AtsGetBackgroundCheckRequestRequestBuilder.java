/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.util.Optional;

public class AtsGetBackgroundCheckRequestRequestBuilder {

    private AtsGetBackgroundCheckRequestRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallAtsGetBackgroundCheckRequest sdk;

    public AtsGetBackgroundCheckRequestRequestBuilder(SDKMethodInterfaces.MethodCallAtsGetBackgroundCheckRequest sdk) {
        this.sdk = sdk;
    }

    public AtsGetBackgroundCheckRequestRequestBuilder request(AtsGetBackgroundCheckRequestRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public AtsGetBackgroundCheckRequestRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsGetBackgroundCheckRequestRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsGetBackgroundCheckRequestResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getBackgroundCheckRequest(
            request,
            options);
    }
}
