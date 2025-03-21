/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class AtsDownloadApplicationDocumentRequestBuilder {

    private String xAccountId;
    private String id;
    private String subResourceId;
    private JsonNullable<String> format = JsonNullable.undefined();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallAtsDownloadApplicationDocument sdk;

    public AtsDownloadApplicationDocumentRequestBuilder(SDKMethodInterfaces.MethodCallAtsDownloadApplicationDocument sdk) {
        this.sdk = sdk;
    }

    public AtsDownloadApplicationDocumentRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsDownloadApplicationDocumentRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsDownloadApplicationDocumentRequestBuilder subResourceId(String subResourceId) {
        Utils.checkNotNull(subResourceId, "subResourceId");
        this.subResourceId = subResourceId;
        return this;
    }

    public AtsDownloadApplicationDocumentRequestBuilder format(String format) {
        Utils.checkNotNull(format, "format");
        this.format = JsonNullable.of(format);
        return this;
    }

    public AtsDownloadApplicationDocumentRequestBuilder format(JsonNullable<String> format) {
        Utils.checkNotNull(format, "format");
        this.format = format;
        return this;
    }
                
    public AtsDownloadApplicationDocumentRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsDownloadApplicationDocumentRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsDownloadApplicationDocumentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.downloadApplicationDocument(
            xAccountId,
            id,
            subResourceId,
            format,
            options);
    }
}
