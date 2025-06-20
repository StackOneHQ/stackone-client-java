/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.stackone.stackone_client_java.models.components.AtsUpdateBackgroundCheckPackagesRequestDto;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class AtsUpdateBackgroundCheckPackageRequestBuilder {

    private String xAccountId;
    private String id;
    private AtsUpdateBackgroundCheckPackagesRequestDto atsUpdateBackgroundCheckPackagesRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallAtsUpdateBackgroundCheckPackage sdk;

    public AtsUpdateBackgroundCheckPackageRequestBuilder(SDKMethodInterfaces.MethodCallAtsUpdateBackgroundCheckPackage sdk) {
        this.sdk = sdk;
    }

    public AtsUpdateBackgroundCheckPackageRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public AtsUpdateBackgroundCheckPackageRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsUpdateBackgroundCheckPackageRequestBuilder atsUpdateBackgroundCheckPackagesRequestDto(AtsUpdateBackgroundCheckPackagesRequestDto atsUpdateBackgroundCheckPackagesRequestDto) {
        Utils.checkNotNull(atsUpdateBackgroundCheckPackagesRequestDto, "atsUpdateBackgroundCheckPackagesRequestDto");
        this.atsUpdateBackgroundCheckPackagesRequestDto = atsUpdateBackgroundCheckPackagesRequestDto;
        return this;
    }
                
    public AtsUpdateBackgroundCheckPackageRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsUpdateBackgroundCheckPackageRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsUpdateBackgroundCheckPackageResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateBackgroundCheckPackage(
            xAccountId,
            id,
            atsUpdateBackgroundCheckPackagesRequestDto,
            options);
    }
}
