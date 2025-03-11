/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class HrisBatchDocumentUploadRequestDto {

    /**
     * The batch of items to create
     */
    @JsonProperty("items")
    private List<HrisDocumentsUploadRequestDto> items;

    @JsonCreator
    public HrisBatchDocumentUploadRequestDto(
            @JsonProperty("items") List<HrisDocumentsUploadRequestDto> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
    }

    /**
     * The batch of items to create
     */
    @JsonIgnore
    public List<HrisDocumentsUploadRequestDto> items() {
        return items;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The batch of items to create
     */
    public HrisBatchDocumentUploadRequestDto withItems(List<HrisDocumentsUploadRequestDto> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
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
        HrisBatchDocumentUploadRequestDto other = (HrisBatchDocumentUploadRequestDto) o;
        return 
            Objects.deepEquals(this.items, other.items);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            items);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisBatchDocumentUploadRequestDto.class,
                "items", items);
    }
    
    public final static class Builder {
 
        private List<HrisDocumentsUploadRequestDto> items;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The batch of items to create
         */
        public Builder items(List<HrisDocumentsUploadRequestDto> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public HrisBatchDocumentUploadRequestDto build() {
            return new HrisBatchDocumentUploadRequestDto(
                items);
        }
    }
}

