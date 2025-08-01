/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.models.components.AtsCreateApplicationRequestDto;
import com.stackone.stackone_client_java.operations.AtsCreateApplicationOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class AtsCreateApplicationRequestBuilder {

    private String xAccountId;
    private AtsCreateApplicationRequestDto atsCreateApplicationRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public AtsCreateApplicationRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public AtsCreateApplicationRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsCreateApplicationRequestBuilder atsCreateApplicationRequestDto(AtsCreateApplicationRequestDto atsCreateApplicationRequestDto) {
        Utils.checkNotNull(atsCreateApplicationRequestDto, "atsCreateApplicationRequestDto");
        this.atsCreateApplicationRequestDto = atsCreateApplicationRequestDto;
        return this;
    }
                
    public AtsCreateApplicationRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsCreateApplicationRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private AtsCreateApplicationRequest buildRequest() {

        AtsCreateApplicationRequest request = new AtsCreateApplicationRequest(xAccountId,
            atsCreateApplicationRequestDto);

        return request;
    }

    public AtsCreateApplicationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<AtsCreateApplicationRequest, AtsCreateApplicationResponse> operation
              = new AtsCreateApplicationOperation(sdkConfiguration, options);
        AtsCreateApplicationRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
