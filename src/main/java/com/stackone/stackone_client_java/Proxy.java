/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stackone.stackone_client_java.models.components.ProxyRequestBody;
import com.stackone.stackone_client_java.models.errors.SDKError;
import com.stackone.stackone_client_java.models.operations.SDKMethodInterfaces.*;
import com.stackone.stackone_client_java.models.operations.StackoneProxyRequestRequest;
import com.stackone.stackone_client_java.models.operations.StackoneProxyRequestRequestBuilder;
import com.stackone.stackone_client_java.models.operations.StackoneProxyRequestResponse;
import com.stackone.stackone_client_java.utils.BackoffStrategy;
import com.stackone.stackone_client_java.utils.HTTPClient;
import com.stackone.stackone_client_java.utils.HTTPRequest;
import com.stackone.stackone_client_java.utils.Hook.AfterErrorContextImpl;
import com.stackone.stackone_client_java.utils.Hook.AfterSuccessContextImpl;
import com.stackone.stackone_client_java.utils.Hook.BeforeRequestContextImpl;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.Retries.NonRetryableException;
import com.stackone.stackone_client_java.utils.Retries;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.SerializedBody;
import com.stackone.stackone_client_java.utils.Utils.JsonShape;
import com.stackone.stackone_client_java.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit; 

public class Proxy implements
            MethodCallStackoneProxyRequest {

    private final SDKConfiguration sdkConfiguration;

    Proxy(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Proxy Request
     * @return The call builder
     */
    public StackoneProxyRequestRequestBuilder proxyRequest() {
        return new StackoneProxyRequestRequestBuilder(this);
    }

    /**
     * Proxy Request
     * @param xAccountId The account identifier
     * @param proxyRequestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public StackoneProxyRequestResponse proxyRequest(
            String xAccountId,
            ProxyRequestBody proxyRequestBody) throws Exception {
        return proxyRequest(xAccountId, proxyRequestBody, Optional.empty());
    }
    
    /**
     * Proxy Request
     * @param xAccountId The account identifier
     * @param proxyRequestBody
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public StackoneProxyRequestResponse proxyRequest(
            String xAccountId,
            ProxyRequestBody proxyRequestBody,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        StackoneProxyRequestRequest request =
            StackoneProxyRequestRequest
                .builder()
                .xAccountId(xAccountId)
                .proxyRequestBody(proxyRequestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/unified/proxy");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "proxyRequestBody",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HTTPRequest _finalReq = _req;
        RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            _retryConfig = RetryConfig.builder()
                .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new ArrayList<>();
        _statusCodes.add("429");
        _statusCodes.add("408");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                "stackone_proxy_request", 
                                Optional.of(List.of()), 
                                _hookSecuritySource),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl(
                                "stackone_proxy_request",
                                 Optional.of(List.of()),
                                 _hookSecuritySource), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl(
                         "stackone_proxy_request", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        StackoneProxyRequestResponse.Builder _resBuilder = 
            StackoneProxyRequestResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        StackoneProxyRequestResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "408")) {
            _res.withHeaders(_httpRes.headers().map());
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "412", "429", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500", "501", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
