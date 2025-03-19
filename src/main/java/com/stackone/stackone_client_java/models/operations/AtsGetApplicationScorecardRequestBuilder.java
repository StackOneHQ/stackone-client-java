/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class AtsGetApplicationScorecardRequestBuilder {

    private AtsGetApplicationScorecardRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallAtsGetApplicationScorecard sdk;

    public AtsGetApplicationScorecardRequestBuilder(SDKMethodInterfaces.MethodCallAtsGetApplicationScorecard sdk) {
        this.sdk = sdk;
    }

    public AtsGetApplicationScorecardRequestBuilder request(AtsGetApplicationScorecardRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public AtsGetApplicationScorecardRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsGetApplicationScorecardRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsGetApplicationScorecardResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getApplicationScorecard(
            request,
            options);
    }
}
