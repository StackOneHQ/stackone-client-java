/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.util.Optional;

public class HrisGetEmployeeCustomFieldDefinitionRequestBuilder {

    private HrisGetEmployeeCustomFieldDefinitionRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallHrisGetEmployeeCustomFieldDefinition sdk;

    public HrisGetEmployeeCustomFieldDefinitionRequestBuilder(SDKMethodInterfaces.MethodCallHrisGetEmployeeCustomFieldDefinition sdk) {
        this.sdk = sdk;
    }

    public HrisGetEmployeeCustomFieldDefinitionRequestBuilder request(HrisGetEmployeeCustomFieldDefinitionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public HrisGetEmployeeCustomFieldDefinitionRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisGetEmployeeCustomFieldDefinitionRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public HrisGetEmployeeCustomFieldDefinitionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getEmployeeCustomFieldDefinition(
            request,
            options);
    }
}
