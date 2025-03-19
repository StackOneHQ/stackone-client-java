/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.AtsUpdateApplicationRequestDto;
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
    private final SDKMethodInterfaces.MethodCallAtsUpdateApplication sdk;

    public AtsUpdateApplicationRequestBuilder(SDKMethodInterfaces.MethodCallAtsUpdateApplication sdk) {
        this.sdk = sdk;
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

    public AtsUpdateApplicationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateApplication(
            xAccountId,
            id,
            atsUpdateApplicationRequestDto,
            options);
    }
}
