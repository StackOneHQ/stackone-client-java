/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.HrisDocumentsUploadRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class HrisUploadEmployeeDocumentRequestBuilder {

    private String xAccountId;
    private String id;
    private HrisDocumentsUploadRequestDto hrisDocumentsUploadRequestDto;
    private Optional<String> serverURL = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallHrisUploadEmployeeDocument sdk;

    public HrisUploadEmployeeDocumentRequestBuilder(SDKMethodInterfaces.MethodCallHrisUploadEmployeeDocument sdk) {
        this.sdk = sdk;
    }

    public HrisUploadEmployeeDocumentRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisUploadEmployeeDocumentRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisUploadEmployeeDocumentRequestBuilder hrisDocumentsUploadRequestDto(HrisDocumentsUploadRequestDto hrisDocumentsUploadRequestDto) {
        Utils.checkNotNull(hrisDocumentsUploadRequestDto, "hrisDocumentsUploadRequestDto");
        this.hrisDocumentsUploadRequestDto = hrisDocumentsUploadRequestDto;
        return this;
    }
                
    public HrisUploadEmployeeDocumentRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public HrisUploadEmployeeDocumentRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }
                
    public HrisUploadEmployeeDocumentRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisUploadEmployeeDocumentRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public HrisUploadEmployeeDocumentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.uploadEmployeeDocument(
            xAccountId,
            id,
            hrisDocumentsUploadRequestDto,
            serverURL,
            options);
    }
}
