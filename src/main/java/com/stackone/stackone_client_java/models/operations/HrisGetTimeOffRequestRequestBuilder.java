/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.operations.HrisGetTimeOffRequestOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class HrisGetTimeOffRequestRequestBuilder {

    private HrisGetTimeOffRequestRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public HrisGetTimeOffRequestRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public HrisGetTimeOffRequestRequestBuilder request(HrisGetTimeOffRequestRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public HrisGetTimeOffRequestRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisGetTimeOffRequestRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public HrisGetTimeOffRequestResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<HrisGetTimeOffRequestRequest, HrisGetTimeOffRequestResponse> operation
              = new HrisGetTimeOffRequestOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }
}
