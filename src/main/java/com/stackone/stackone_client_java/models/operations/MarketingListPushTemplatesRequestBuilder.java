/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;
import static com.stackone.stackone_client_java.utils.Exceptions.unchecked;
import static com.stackone.stackone_client_java.utils.Utils.transform;
import static com.stackone.stackone_client_java.utils.Utils.toStream;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.operations.MarketingListPushTemplatesOperation;
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

public class MarketingListPushTemplatesRequestBuilder {

    private MarketingListPushTemplatesRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public MarketingListPushTemplatesRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public MarketingListPushTemplatesRequestBuilder request(MarketingListPushTemplatesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public MarketingListPushTemplatesRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public MarketingListPushTemplatesRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public MarketingListPushTemplatesResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<MarketingListPushTemplatesRequest, MarketingListPushTemplatesResponse> operation
              = new MarketingListPushTemplatesOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }

    /**
    * Returns an iterable that performs next page calls till no more pages
    * are returned.
    *
    * <p>The returned iterable can be used in a for-each loop:
    * <pre><code>
    * for (MarketingListPushTemplatesResponse page : builder.callAsIterable()) {
    *     // Process each page
    * }
    * </code></pre>
    * 
    * @return An iterable that can be used to iterate through all pages
    */
    public Iterable<MarketingListPushTemplatesResponse> callAsIterable() {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<MarketingListPushTemplatesRequest, MarketingListPushTemplatesResponse> operation
              = new MarketingListPushTemplatesOperation(sdkConfiguration, options);
        Iterator<HttpResponse<InputStream>> iterator = new Paginator<>(
            request,
            new CursorTracker<>("$.next", String.class),
                MarketingListPushTemplatesRequest::withNext,
            nextRequest -> unchecked(() -> operation.doRequest(request)).get());
        
        return () -> transform(iterator, operation::handleResponse);
    }

    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned.
     **/  
    public Stream<MarketingListPushTemplatesResponse> callAsStream() {
        return toStream(callAsIterable());
    }

}
