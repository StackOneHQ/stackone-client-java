/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import static com.stackone.stackone_client_java.operations.Operations.RequestOperation;
import static com.stackone.stackone_client_java.utils.Exceptions.unchecked;
import static com.stackone.stackone_client_java.utils.Utils.transform;
import static com.stackone.stackone_client_java.utils.Utils.toStream;

import com.stackone.stackone_client_java.SDKConfiguration;
import com.stackone.stackone_client_java.operations.AtsListApplicationCustomFieldDefinitionsOperation;
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

public class AtsListApplicationCustomFieldDefinitionsRequestBuilder {

    private AtsListApplicationCustomFieldDefinitionsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public AtsListApplicationCustomFieldDefinitionsRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public AtsListApplicationCustomFieldDefinitionsRequestBuilder request(AtsListApplicationCustomFieldDefinitionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public AtsListApplicationCustomFieldDefinitionsRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AtsListApplicationCustomFieldDefinitionsRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AtsListApplicationCustomFieldDefinitionsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<AtsListApplicationCustomFieldDefinitionsRequest, AtsListApplicationCustomFieldDefinitionsResponse> operation
              = new AtsListApplicationCustomFieldDefinitionsOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }

    /**
    * Returns an iterable that performs next page calls till no more pages
    * are returned.
    *
    * <p>The returned iterable can be used in a for-each loop:
    * <pre><code>
    * for (AtsListApplicationCustomFieldDefinitionsResponse page : builder.callAsIterable()) {
    *     // Process each page
    * }
    * </code></pre>
    * 
    * @return An iterable that can be used to iterate through all pages
    */
    public Iterable<AtsListApplicationCustomFieldDefinitionsResponse> callAsIterable() {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<AtsListApplicationCustomFieldDefinitionsRequest, AtsListApplicationCustomFieldDefinitionsResponse> operation
              = new AtsListApplicationCustomFieldDefinitionsOperation(sdkConfiguration, options);
        Iterator<HttpResponse<InputStream>> iterator = new Paginator<>(
            request,
            new CursorTracker<>("$.next", String.class),
                AtsListApplicationCustomFieldDefinitionsRequest::withNext,
            nextRequest -> unchecked(() -> operation.doRequest(request)).get());
        
        return () -> transform(iterator, operation::handleResponse);
    }

    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned.
     **/  
    public Stream<AtsListApplicationCustomFieldDefinitionsResponse> callAsStream() {
        return toStream(callAsIterable());
    }

}
