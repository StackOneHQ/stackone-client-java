/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.AtsCreateApplicationRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class AtsCreateApplicationRequestBuilder {

    private String xAccountId;
    private AtsCreateApplicationRequestDto atsCreateApplicationRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallAtsCreateApplication sdk;

    public AtsCreateApplicationRequestBuilder(SDKMethodInterfaces.MethodCallAtsCreateApplication sdk) {
        this.sdk = sdk;
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

    public AtsCreateApplicationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.createApplication(
            xAccountId,
            atsCreateApplicationRequestDto,
            options);
    }
}
