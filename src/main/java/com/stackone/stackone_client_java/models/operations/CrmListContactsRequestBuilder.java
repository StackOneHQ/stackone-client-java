/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;
import static com.stackone.stackone_client_java.utils.Exceptions.unchecked;
import static com.stackone.stackone_client_java.utils.Utils.transform;
import static com.stackone.stackone_client_java.utils.Utils.toStream;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.operations.CrmListContactsOperation;
import com.stackone.stackone_client_java.utils.Options;
import com.stackone.stackone_client_java.utils.RetryConfig;
import com.stackone.stackone_client_java.utils.Utils;
import com.stackone.stackone_client_java.utils.pagination.CursorTracker;
import com.stackone.stackone_client_java.utils.pagination.Paginator;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Iterable;
import java.lang.String;
import java.net.http.HttpResponse;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class CrmListContactsRequestBuilder {

    private CrmListContactsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public CrmListContactsRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public CrmListContactsRequestBuilder request(CrmListContactsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CrmListContactsRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CrmListContactsRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CrmListContactsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<CrmListContactsRequest, CrmListContactsResponse> operation
              = new CrmListContactsOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }

    /**
    * Returns an iterable that performs next page calls till no more pages
    * are returned.
    *
    * <p>The returned iterable can be used in a for-each loop:
    * <pre><code>
    * for (CrmListContactsResponse page : builder.callAsIterable()) {
    *     // Process each page
    * }
    * </code></pre>
    * 
    * @return An iterable that can be used to iterate through all pages
    */
    public Iterable<CrmListContactsResponse> callAsIterable() {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<CrmListContactsRequest, CrmListContactsResponse> operation
              = new CrmListContactsOperation(sdkConfiguration, options);
        Iterator<HttpResponse<InputStream>> iterator = new Paginator<>(
            request,
            new CursorTracker<>("$.next", String.class),
                CrmListContactsRequest::withNext,
            nextRequest -> unchecked(() -> operation.doRequest(request)).get());
        
        return () -> transform(iterator, operation::handleResponse);
    }

    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned.
     **/  
    public Stream<CrmListContactsResponse> callAsStream() {
        return toStream(callAsIterable());
    }

}
