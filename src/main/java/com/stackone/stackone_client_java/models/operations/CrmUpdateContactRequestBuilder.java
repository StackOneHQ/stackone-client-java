/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.CrmCreateContactRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CrmUpdateContactRequestBuilder {

    private String xAccountId;
    private String id;
    private CrmCreateContactRequestDto crmCreateContactRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCrmUpdateContact sdk;

    public CrmUpdateContactRequestBuilder(SDKMethodInterfaces.MethodCallCrmUpdateContact sdk) {
        this.sdk = sdk;
    }

    public CrmUpdateContactRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public CrmUpdateContactRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CrmUpdateContactRequestBuilder crmCreateContactRequestDto(CrmCreateContactRequestDto crmCreateContactRequestDto) {
        Utils.checkNotNull(crmCreateContactRequestDto, "crmCreateContactRequestDto");
        this.crmCreateContactRequestDto = crmCreateContactRequestDto;
        return this;
    }
                
    public CrmUpdateContactRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CrmUpdateContactRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CrmUpdateContactResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateContact(
            xAccountId,
            id,
            crmCreateContactRequestDto,
            options);
    }
}
