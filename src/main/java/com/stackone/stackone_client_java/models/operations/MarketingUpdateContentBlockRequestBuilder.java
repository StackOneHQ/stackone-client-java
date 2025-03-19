/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.MarketingCreateContentBlocksRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class MarketingUpdateContentBlockRequestBuilder {

    private String xAccountId;
    private String id;
    private MarketingCreateContentBlocksRequestDto marketingCreateContentBlocksRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallMarketingUpdateContentBlock sdk;

    public MarketingUpdateContentBlockRequestBuilder(SDKMethodInterfaces.MethodCallMarketingUpdateContentBlock sdk) {
        this.sdk = sdk;
    }

    public MarketingUpdateContentBlockRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public MarketingUpdateContentBlockRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MarketingUpdateContentBlockRequestBuilder marketingCreateContentBlocksRequestDto(MarketingCreateContentBlocksRequestDto marketingCreateContentBlocksRequestDto) {
        Utils.checkNotNull(marketingCreateContentBlocksRequestDto, "marketingCreateContentBlocksRequestDto");
        this.marketingCreateContentBlocksRequestDto = marketingCreateContentBlocksRequestDto;
        return this;
    }
                
    public MarketingUpdateContentBlockRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public MarketingUpdateContentBlockRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public MarketingUpdateContentBlockResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateContentBlock(
            xAccountId,
            id,
            marketingCreateContentBlocksRequestDto,
            options);
    }
}
