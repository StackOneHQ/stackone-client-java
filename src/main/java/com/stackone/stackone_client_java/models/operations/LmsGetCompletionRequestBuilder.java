/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.util.Optional;

public class LmsGetCompletionRequestBuilder {

    private LmsGetCompletionRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallLmsGetCompletion sdk;

    public LmsGetCompletionRequestBuilder(SDKMethodInterfaces.MethodCallLmsGetCompletion sdk) {
        this.sdk = sdk;
    }

    public LmsGetCompletionRequestBuilder request(LmsGetCompletionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public LmsGetCompletionRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public LmsGetCompletionRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public LmsGetCompletionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getCompletion(
            request,
            options);
    }
}
