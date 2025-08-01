/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.models.components.AtsCreateOfferRequestDto;
import com.stackone.stackone_client_java.operations.AtsCreateOfferOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class AtsCreateOfferRequestBuilder {

    private String xAccountId;
    private AtsCreateOfferRequestDto atsCreateOfferRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public AtsCreateOfferRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public AtsCreateOfferRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsCreateOfferRequestBuilder atsCreateOfferRequestDto(AtsCreateOfferRequestDto atsCreateOfferRequestDto) {
        Utils.checkNotNull(atsCreateOfferRequestDto, "atsCreateOfferRequestDto");
        this.atsCreateOfferRequestDto = atsCreateOfferRequestDto;
        return this;
    }
                
    public AtsCreateOfferRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsCreateOfferRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private AtsCreateOfferRequest buildRequest() {

        AtsCreateOfferRequest request = new AtsCreateOfferRequest(xAccountId,
            atsCreateOfferRequestDto);

        return request;
    }

    public AtsCreateOfferResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<AtsCreateOfferRequest, AtsCreateOfferResponse> operation
              = new AtsCreateOfferOperation(sdkConfiguration, options);
        AtsCreateOfferRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
