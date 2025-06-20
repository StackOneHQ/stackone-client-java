/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.HrisCreateTimeOffRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class HrisCreateEmployeeTimeOffRequestRequestBuilder {

    private String xAccountId;
    private String id;
    private HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallHrisCreateEmployeeTimeOffRequest sdk;

    public HrisCreateEmployeeTimeOffRequestRequestBuilder(SDKMethodInterfaces.MethodCallHrisCreateEmployeeTimeOffRequest sdk) {
        this.sdk = sdk;
    }

    public HrisCreateEmployeeTimeOffRequestRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisCreateEmployeeTimeOffRequestRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisCreateEmployeeTimeOffRequestRequestBuilder hrisCreateTimeOffRequestDto(HrisCreateTimeOffRequestDto hrisCreateTimeOffRequestDto) {
        Utils.checkNotNull(hrisCreateTimeOffRequestDto, "hrisCreateTimeOffRequestDto");
        this.hrisCreateTimeOffRequestDto = hrisCreateTimeOffRequestDto;
        return this;
    }
                
    public HrisCreateEmployeeTimeOffRequestRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisCreateEmployeeTimeOffRequestRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public HrisCreateEmployeeTimeOffRequestResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.createEmployeeTimeOffRequest(
            xAccountId,
            id,
            hrisCreateTimeOffRequestDto,
            options);
    }
}
