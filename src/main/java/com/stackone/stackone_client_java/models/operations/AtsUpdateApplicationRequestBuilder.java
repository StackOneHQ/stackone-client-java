/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.models.components.AtsUpdateApplicationRequestDto;
import com.stackone.stackone_client_java.operations.AtsUpdateApplicationOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class AtsUpdateApplicationRequestBuilder {

    private String xAccountId;
    private String id;
    private AtsUpdateApplicationRequestDto atsUpdateApplicationRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public AtsUpdateApplicationRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public AtsUpdateApplicationRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsUpdateApplicationRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsUpdateApplicationRequestBuilder atsUpdateApplicationRequestDto(AtsUpdateApplicationRequestDto atsUpdateApplicationRequestDto) {
        Utils.checkNotNull(atsUpdateApplicationRequestDto, "atsUpdateApplicationRequestDto");
        this.atsUpdateApplicationRequestDto = atsUpdateApplicationRequestDto;
        return this;
    }
                
    public AtsUpdateApplicationRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsUpdateApplicationRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private AtsUpdateApplicationRequest buildRequest() {

        AtsUpdateApplicationRequest request = new AtsUpdateApplicationRequest(xAccountId,
            id,
            atsUpdateApplicationRequestDto);

        return request;
    }

    public AtsUpdateApplicationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<AtsUpdateApplicationRequest, AtsUpdateApplicationResponse> operation
              = new AtsUpdateApplicationOperation(sdkConfiguration, options);
        AtsUpdateApplicationRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
