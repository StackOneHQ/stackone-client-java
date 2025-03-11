/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.util.Optional;

public class LmsGetSkillRequestBuilder {

    private LmsGetSkillRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallLmsGetSkill sdk;

    public LmsGetSkillRequestBuilder(SDKMethodInterfaces.MethodCallLmsGetSkill sdk) {
        this.sdk = sdk;
    }

    public LmsGetSkillRequestBuilder request(LmsGetSkillRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public LmsGetSkillRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public LmsGetSkillRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public LmsGetSkillResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getSkill(
            request,
            options);
    }
}
