/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.LmsCreateAssignmentRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class LmsCreateUserAssignmentRequestBuilder {

    private String xAccountId;
    private String id;
    private LmsCreateAssignmentRequestDto lmsCreateAssignmentRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallLmsCreateUserAssignment sdk;

    public LmsCreateUserAssignmentRequestBuilder(SDKMethodInterfaces.MethodCallLmsCreateUserAssignment sdk) {
        this.sdk = sdk;
    }

    public LmsCreateUserAssignmentRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public LmsCreateUserAssignmentRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public LmsCreateUserAssignmentRequestBuilder lmsCreateAssignmentRequestDto(LmsCreateAssignmentRequestDto lmsCreateAssignmentRequestDto) {
        Utils.checkNotNull(lmsCreateAssignmentRequestDto, "lmsCreateAssignmentRequestDto");
        this.lmsCreateAssignmentRequestDto = lmsCreateAssignmentRequestDto;
        return this;
    }
                
    public LmsCreateUserAssignmentRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public LmsCreateUserAssignmentRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public LmsCreateUserAssignmentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.createUserAssignment(
            xAccountId,
            id,
            lmsCreateAssignmentRequestDto,
            options);
    }
}
