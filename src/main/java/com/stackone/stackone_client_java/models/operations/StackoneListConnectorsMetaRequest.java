/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackone.stackone_client_java.utils.SpeakeasyMetadata;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class StackoneListConnectorsMetaRequest {

    /**
     * The comma separated list of data that will be included in the response
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    private JsonNullable<String> include;

    @JsonCreator
    public StackoneListConnectorsMetaRequest(
            JsonNullable<String> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
    }
    
    public StackoneListConnectorsMetaRequest() {
        this(JsonNullable.undefined());
    }

    /**
     * The comma separated list of data that will be included in the response
     */
    @JsonIgnore
    public JsonNullable<String> include() {
        return include;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The comma separated list of data that will be included in the response
     */
    public StackoneListConnectorsMetaRequest withInclude(String include) {
        Utils.checkNotNull(include, "include");
        this.include = JsonNullable.of(include);
        return this;
    }

    /**
     * The comma separated list of data that will be included in the response
     */
    public StackoneListConnectorsMetaRequest withInclude(JsonNullable<String> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
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
        StackoneListConnectorsMetaRequest other = (StackoneListConnectorsMetaRequest) o;
        return 
            Objects.deepEquals(this.include, other.include);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            include);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StackoneListConnectorsMetaRequest.class,
                "include", include);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> include = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The comma separated list of data that will be included in the response
         */
        public Builder include(String include) {
            Utils.checkNotNull(include, "include");
            this.include = JsonNullable.of(include);
            return this;
        }

        /**
         * The comma separated list of data that will be included in the response
         */
        public Builder include(JsonNullable<String> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
            return this;
        }
        
        public StackoneListConnectorsMetaRequest build() {
            return new StackoneListConnectorsMetaRequest(
                include);
        }
    }
}

