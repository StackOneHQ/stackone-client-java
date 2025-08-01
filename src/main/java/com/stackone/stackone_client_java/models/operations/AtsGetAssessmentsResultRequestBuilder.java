/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.operations.AtsGetAssessmentsResultOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class AtsGetAssessmentsResultRequestBuilder {

    private AtsGetAssessmentsResultRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public AtsGetAssessmentsResultRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public AtsGetAssessmentsResultRequestBuilder request(AtsGetAssessmentsResultRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public AtsGetAssessmentsResultRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsGetAssessmentsResultRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsGetAssessmentsResultResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<AtsGetAssessmentsResultRequest, AtsGetAssessmentsResultResponse> operation
              = new AtsGetAssessmentsResultOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }
}
