/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.UnifiedUploadRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class AtsUploadApplicationDocumentRequestBuilder {

    private String xAccountId;
    private String id;
    private UnifiedUploadRequestDto unifiedUploadRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallAtsUploadApplicationDocument sdk;

    public AtsUploadApplicationDocumentRequestBuilder(SDKMethodInterfaces.MethodCallAtsUploadApplicationDocument sdk) {
        this.sdk = sdk;
    }

    public AtsUploadApplicationDocumentRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsUploadApplicationDocumentRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsUploadApplicationDocumentRequestBuilder unifiedUploadRequestDto(UnifiedUploadRequestDto unifiedUploadRequestDto) {
        Utils.checkNotNull(unifiedUploadRequestDto, "unifiedUploadRequestDto");
        this.unifiedUploadRequestDto = unifiedUploadRequestDto;
        return this;
    }
                
    public AtsUploadApplicationDocumentRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsUploadApplicationDocumentRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsUploadApplicationDocumentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.uploadApplicationDocument(
            xAccountId,
            id,
            unifiedUploadRequestDto,
            options);
    }
}
