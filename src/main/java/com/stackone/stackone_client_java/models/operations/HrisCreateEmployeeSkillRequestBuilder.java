/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.models.components.EntitySkillsCreateRequestDto;
import com.stackone.stackone_client_java.operations.HrisCreateEmployeeSkillOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class HrisCreateEmployeeSkillRequestBuilder {

    private String xAccountId;
    private String id;
    private EntitySkillsCreateRequestDto entitySkillsCreateRequestDto;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public HrisCreateEmployeeSkillRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public HrisCreateEmployeeSkillRequestBuilder xAccountId(String xAccountId) {
        Utils.checkNotNull(xAccountId, "xAccountId");
        this.xAccountId = xAccountId;
        return this;
    }

    public HrisCreateEmployeeSkillRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisCreateEmployeeSkillRequestBuilder entitySkillsCreateRequestDto(EntitySkillsCreateRequestDto entitySkillsCreateRequestDto) {
        Utils.checkNotNull(entitySkillsCreateRequestDto, "entitySkillsCreateRequestDto");
        this.entitySkillsCreateRequestDto = entitySkillsCreateRequestDto;
        return this;
    }
                
    public HrisCreateEmployeeSkillRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public HrisCreateEmployeeSkillRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private HrisCreateEmployeeSkillRequest buildRequest() {

        HrisCreateEmployeeSkillRequest request = new HrisCreateEmployeeSkillRequest(xAccountId,
            id,
            entitySkillsCreateRequestDto);

        return request;
    }

    public HrisCreateEmployeeSkillResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<HrisCreateEmployeeSkillRequest, HrisCreateEmployeeSkillResponse> operation
              = new HrisCreateEmployeeSkillOperation(sdkConfiguration, options);
        HrisCreateEmployeeSkillRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
