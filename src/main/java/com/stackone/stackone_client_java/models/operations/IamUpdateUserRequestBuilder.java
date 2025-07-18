/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.models.components.IamUpdateUserRequestDto;
import com.stackone.stackone_client_java.operations.IamUpdateUserOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class IamUpdateUserRequestBuilder {

    private String xAccountId;
    private String id;
    private IamUpdateUserRequestDto iamUpdateUserRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public IamUpdateUserRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public IamUpdateUserRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public IamUpdateUserRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public IamUpdateUserRequestBuilder iamUpdateUserRequestDto(IamUpdateUserRequestDto iamUpdateUserRequestDto) {
        Utils.checkNotNull(iamUpdateUserRequestDto, "iamUpdateUserRequestDto");
        this.iamUpdateUserRequestDto = iamUpdateUserRequestDto;
        return this;
    }
                
    public IamUpdateUserRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public IamUpdateUserRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private IamUpdateUserRequest buildRequest() {

        IamUpdateUserRequest request = new IamUpdateUserRequest(xAccountId,
            id,
            iamUpdateUserRequestDto);

        return request;
    }

    public IamUpdateUserResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<IamUpdateUserRequest, IamUpdateUserResponse> operation
              = new IamUpdateUserOperation(sdkConfiguration, options);
        IamUpdateUserRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
