/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.HrisCreateEmploymentRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class HrisUpdateEmployeeEmploymentRequestBuilder {

    private String xAccountId;
    private String id;
    private String subResourceId;
    private HrisCreateEmploymentRequestDto hrisCreateEmploymentRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallHrisUpdateEmployeeEmployment sdk;

    public HrisUpdateEmployeeEmploymentRequestBuilder(SDKMethodInterfaces.MethodCallHrisUpdateEmployeeEmployment sdk) {
        this.sdk = sdk;
    }

    public HrisUpdateEmployeeEmploymentRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisUpdateEmployeeEmploymentRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisUpdateEmployeeEmploymentRequestBuilder subResourceId(String subResourceId) {
        Utils.checkNotNull(subResourceId, "subResourceId");
        this.subResourceId = subResourceId;
        return this;
    }

    public HrisUpdateEmployeeEmploymentRequestBuilder hrisCreateEmploymentRequestDto(HrisCreateEmploymentRequestDto hrisCreateEmploymentRequestDto) {
        Utils.checkNotNull(hrisCreateEmploymentRequestDto, "hrisCreateEmploymentRequestDto");
        this.hrisCreateEmploymentRequestDto = hrisCreateEmploymentRequestDto;
        return this;
    }
                
    public HrisUpdateEmployeeEmploymentRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisUpdateEmployeeEmploymentRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public HrisUpdateEmployeeEmploymentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateEmployeeEmployment(
            xAccountId,
            id,
            subResourceId,
            hrisCreateEmploymentRequestDto,
            options);
    }
}
