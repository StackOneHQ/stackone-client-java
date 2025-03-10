/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class HrisUpdateTimeOffRequestRequestBuilder {

    private String xAccountId;
    private String id;
    private HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto;
    private Optional<String> serverURL = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallHrisUpdateTimeOffRequest sdk;

    public HrisUpdateTimeOffRequestRequestBuilder(SDKMethodInterfaces.MethodCallHrisUpdateTimeOffRequest sdk) {
        this.sdk = sdk;
    }

    public HrisUpdateTimeOffRequestRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisUpdateTimeOffRequestRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisUpdateTimeOffRequestRequestBuilder hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto) {
        Utils.checkNotNull(hrisCreateTimeOffRequestDto, "hrisCreateTimeOffRequestDto");
        this.hrisCreateTimeOffRequestDto = hrisCreateTimeOffRequestDto;
        return this;
    }
                
    public HrisUpdateTimeOffRequestRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public HrisUpdateTimeOffRequestRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }
                
    public HrisUpdateTimeOffRequestRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisUpdateTimeOffRequestRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public HrisUpdateTimeOffRequestResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateTimeOffRequest(
            xAccountId,
            id,
            hrisCreateTimeOffRequestDto,
            serverURL,
            options);
    }
}
