/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.AtsCreateCandidateRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class AtsCreateCandidateRequestBuilder {

    private String xAccountId;
    private AtsCreateCandidateRequestDto atsCreateCandidateRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallAtsCreateCandidate sdk;

    public AtsCreateCandidateRequestBuilder(SDKMethodInterfaces.MethodCallAtsCreateCandidate sdk) {
        this.sdk = sdk;
    }

    public AtsCreateCandidateRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsCreateCandidateRequestBuilder atsCreateCandidateRequestDto(AtsCreateCandidateRequestDto atsCreateCandidateRequestDto) {
        Utils.checkNotNull(atsCreateCandidateRequestDto, "atsCreateCandidateRequestDto");
        this.atsCreateCandidateRequestDto = atsCreateCandidateRequestDto;
        return this;
    }
                
    public AtsCreateCandidateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsCreateCandidateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsCreateCandidateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.createCandidate(
            xAccountId,
            atsCreateCandidateRequestDto,
            options);
    }
}
