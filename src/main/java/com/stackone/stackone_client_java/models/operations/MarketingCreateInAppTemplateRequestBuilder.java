/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.models.components.MarketingCreateInAppTemplateRequestDto;
import com.stackone.stackone_client_java.operations.MarketingCreateInAppTemplateOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class MarketingCreateInAppTemplateRequestBuilder {

    private String xAccountId;
    private MarketingCreateInAppTemplateRequestDto marketingCreateInAppTemplateRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public MarketingCreateInAppTemplateRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public MarketingCreateInAppTemplateRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public MarketingCreateInAppTemplateRequestBuilder marketingCreateInAppTemplateRequestDto(MarketingCreateInAppTemplateRequestDto marketingCreateInAppTemplateRequestDto) {
        Utils.checkNotNull(marketingCreateInAppTemplateRequestDto, "marketingCreateInAppTemplateRequestDto");
        this.marketingCreateInAppTemplateRequestDto = marketingCreateInAppTemplateRequestDto;
        return this;
    }
                
    public MarketingCreateInAppTemplateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public MarketingCreateInAppTemplateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private MarketingCreateInAppTemplateRequest buildRequest() {

        MarketingCreateInAppTemplateRequest request = new MarketingCreateInAppTemplateRequest(xAccountId,
            marketingCreateInAppTemplateRequestDto);

        return request;
    }

    public MarketingCreateInAppTemplateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<MarketingCreateInAppTemplateRequest, MarketingCreateInAppTemplateResponse> operation
              = new MarketingCreateInAppTemplateOperation(sdkConfiguration, options);
        MarketingCreateInAppTemplateRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
