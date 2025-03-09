/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.models.components.CustomFieldDefinitionResultApiModel;
import com.stackone.stackone_client_java.utils.Response;
import com.stackone.stackone_client_java.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class HrisGetEmployeeCustomFieldDefinitionResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * The employee custom field definition was retrieved.
     */
    private Optional<? extends CustomFieldDefinitionResultApiModel> customFieldDefinitionResultApiModel;

    private Map<String, List<String>> headers;

    @JsonCreator
    public HrisGetEmployeeCustomFieldDefinitionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CustomFieldDefinitionResultApiModel> customFieldDefinitionResultApiModel,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(customFieldDefinitionResultApiModel, "customFieldDefinitionResultApiModel");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.customFieldDefinitionResultApiModel = customFieldDefinitionResultApiModel;
        this.headers = headers;
    }
    
    public HrisGetEmployeeCustomFieldDefinitionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse, Optional.empty(), headers);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * The employee custom field definition was retrieved.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CustomFieldDefinitionResultApiModel> customFieldDefinitionResultApiModel() {
        return (Optional<CustomFieldDefinitionResultApiModel>) customFieldDefinitionResultApiModel;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public HrisGetEmployeeCustomFieldDefinitionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HrisGetEmployeeCustomFieldDefinitionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HrisGetEmployeeCustomFieldDefinitionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The employee custom field definition was retrieved.
     */
    public HrisGetEmployeeCustomFieldDefinitionResponse withCustomFieldDefinitionResultApiModel(CustomFieldDefinitionResultApiModel customFieldDefinitionResultApiModel) {
        Utils.checkNotNull(customFieldDefinitionResultApiModel, "customFieldDefinitionResultApiModel");
        this.customFieldDefinitionResultApiModel = Optional.ofNullable(customFieldDefinitionResultApiModel);
        return this;
    }

    /**
     * The employee custom field definition was retrieved.
     */
    public HrisGetEmployeeCustomFieldDefinitionResponse withCustomFieldDefinitionResultApiModel(Optional<? extends CustomFieldDefinitionResultApiModel> customFieldDefinitionResultApiModel) {
        Utils.checkNotNull(customFieldDefinitionResultApiModel, "customFieldDefinitionResultApiModel");
        this.customFieldDefinitionResultApiModel = customFieldDefinitionResultApiModel;
        return this;
    }

    public HrisGetEmployeeCustomFieldDefinitionResponse withHeaders(Map<String, List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HrisGetEmployeeCustomFieldDefinitionResponse other = (HrisGetEmployeeCustomFieldDefinitionResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.customFieldDefinitionResultApiModel, other.customFieldDefinitionResultApiModel) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            customFieldDefinitionResultApiModel,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisGetEmployeeCustomFieldDefinitionResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "customFieldDefinitionResultApiModel", customFieldDefinitionResultApiModel,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends CustomFieldDefinitionResultApiModel> customFieldDefinitionResultApiModel = Optional.empty();
 
        private Map<String, List<String>> headers;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * The employee custom field definition was retrieved.
         */
        public Builder customFieldDefinitionResultApiModel(CustomFieldDefinitionResultApiModel customFieldDefinitionResultApiModel) {
            Utils.checkNotNull(customFieldDefinitionResultApiModel, "customFieldDefinitionResultApiModel");
            this.customFieldDefinitionResultApiModel = Optional.ofNullable(customFieldDefinitionResultApiModel);
            return this;
        }

        /**
         * The employee custom field definition was retrieved.
         */
        public Builder customFieldDefinitionResultApiModel(Optional<? extends CustomFieldDefinitionResultApiModel> customFieldDefinitionResultApiModel) {
            Utils.checkNotNull(customFieldDefinitionResultApiModel, "customFieldDefinitionResultApiModel");
            this.customFieldDefinitionResultApiModel = customFieldDefinitionResultApiModel;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public HrisGetEmployeeCustomFieldDefinitionResponse build() {
            return new HrisGetEmployeeCustomFieldDefinitionResponse(
                contentType,
                statusCode,
                rawResponse,
                customFieldDefinitionResultApiModel,
                headers);
        }
    }
}

