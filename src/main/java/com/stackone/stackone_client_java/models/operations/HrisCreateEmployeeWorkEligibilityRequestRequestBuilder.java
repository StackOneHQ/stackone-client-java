/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.models.components.HrisCreateWorkEligibilityRequestDto;
import com.stackone.stackone_client_java.operations.HrisCreateEmployeeWorkEligibilityRequestOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class HrisCreateEmployeeWorkEligibilityRequestRequestBuilder {

    private String id;
    private String xAccountId;
    private HrisCreateWorkEligibilityRequestDto hrisCreateWorkEligibilityRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public HrisCreateEmployeeWorkEligibilityRequestRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public HrisCreateEmployeeWorkEligibilityRequestRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisCreateEmployeeWorkEligibilityRequestRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisCreateEmployeeWorkEligibilityRequestRequestBuilder hrisCreateWorkEligibilityRequestDto(HrisCreateWorkEligibilityRequestDto hrisCreateWorkEligibilityRequestDto) {
        Utils.checkNotNull(hrisCreateWorkEligibilityRequestDto, "hrisCreateWorkEligibilityRequestDto");
        this.hrisCreateWorkEligibilityRequestDto = hrisCreateWorkEligibilityRequestDto;
        return this;
    }
                
    public HrisCreateEmployeeWorkEligibilityRequestRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisCreateEmployeeWorkEligibilityRequestRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private HrisCreateEmployeeWorkEligibilityRequestRequest buildRequest() {

        HrisCreateEmployeeWorkEligibilityRequestRequest request = new HrisCreateEmployeeWorkEligibilityRequestRequest(id,
            xAccountId,
            hrisCreateWorkEligibilityRequestDto);

        return request;
    }

    public HrisCreateEmployeeWorkEligibilityRequestResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<HrisCreateEmployeeWorkEligibilityRequestRequest, HrisCreateEmployeeWorkEligibilityRequestResponse> operation
              = new HrisCreateEmployeeWorkEligibilityRequestOperation(sdkConfiguration, options);
        HrisCreateEmployeeWorkEligibilityRequestRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
