/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.operations.AtsGetCandidateOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class AtsGetCandidateRequestBuilder {

    private AtsGetCandidateRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public AtsGetCandidateRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public AtsGetCandidateRequestBuilder request(AtsGetCandidateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public AtsGetCandidateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsGetCandidateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsGetCandidateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<AtsGetCandidateRequest, AtsGetCandidateResponse> operation
              = new AtsGetCandidateOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }
}
