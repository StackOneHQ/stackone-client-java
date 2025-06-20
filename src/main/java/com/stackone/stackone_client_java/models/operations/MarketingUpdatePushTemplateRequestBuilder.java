/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.MarketingCreatePushTemplateRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class MarketingUpdatePushTemplateRequestBuilder {

    private String xAccountId;
    private String id;
    private MarketingCreatePushTemplateRequestDto marketingCreatePushTemplateRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallMarketingUpdatePushTemplate sdk;

    public MarketingUpdatePushTemplateRequestBuilder(SDKMethodInterfaces.MethodCallMarketingUpdatePushTemplate sdk) {
        this.sdk = sdk;
    }

    public MarketingUpdatePushTemplateRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public MarketingUpdatePushTemplateRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MarketingUpdatePushTemplateRequestBuilder marketingCreatePushTemplateRequestDto(MarketingCreatePushTemplateRequestDto marketingCreatePushTemplateRequestDto) {
        Utils.checkNotNull(marketingCreatePushTemplateRequestDto, "marketingCreatePushTemplateRequestDto");
        this.marketingCreatePushTemplateRequestDto = marketingCreatePushTemplateRequestDto;
        return this;
    }
                
    public MarketingUpdatePushTemplateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public MarketingUpdatePushTemplateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public MarketingUpdatePushTemplateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updatePushTemplate(
            xAccountId,
            id,
            marketingCreatePushTemplateRequestDto,
            options);
    }
}
