/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class ApplicationAttachment {

    /**
     * The file name of the attachment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name")
    private JsonNullable<String> fileName;

    /**
     * The content of the attachment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    private JsonNullable<String> content;

    /**
     * The URL of the attachment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<String> url;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content_type")
    private JsonNullable<? extends ApplicationAttachmentContentType> contentType;

    @JsonCreator
    public ApplicationAttachment(
            @JsonProperty("file_name") JsonNullable<String> fileName,
            @JsonProperty("content") JsonNullable<String> content,
            @JsonProperty("url") JsonNullable<String> url,
            @JsonProperty("content_type") JsonNullable<? extends ApplicationAttachmentContentType> contentType) {
        Utils.checkNotNull(fileName, "fileName");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(contentType, "contentType");
        this.fileName = fileName;
        this.content = content;
        this.url = url;
        this.contentType = contentType;
    }
    
    public ApplicationAttachment() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The file name of the attachment.
     */
    @JsonIgnore
    public JsonNullable<String> fileName() {
        return fileName;
    }

    /**
     * The content of the attachment.
     */
    @JsonIgnore
    public JsonNullable<String> content() {
        return content;
    }

    /**
     * The URL of the attachment.
     */
    @JsonIgnore
    public JsonNullable<String> url() {
        return url;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ApplicationAttachmentContentType> contentType() {
        return (JsonNullable<ApplicationAttachmentContentType>) contentType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The file name of the attachment.
     */
    public ApplicationAttachment withFileName(String fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = JsonNullable.of(fileName);
        return this;
    }

    /**
     * The file name of the attachment.
     */
    public ApplicationAttachment withFileName(JsonNullable<String> fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = fileName;
        return this;
    }

    /**
     * The content of the attachment.
     */
    public ApplicationAttachment withContent(String content) {
        Utils.checkNotNull(content, "content");
        this.content = JsonNullable.of(content);
        return this;
    }

    /**
     * The content of the attachment.
     */
    public ApplicationAttachment withContent(JsonNullable<String> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    /**
     * The URL of the attachment.
     */
    public ApplicationAttachment withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * The URL of the attachment.
     */
    public ApplicationAttachment withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    public ApplicationAttachment withContentType(ApplicationAttachmentContentType contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = JsonNullable.of(contentType);
        return this;
    }

    public ApplicationAttachment withContentType(JsonNullable<? extends ApplicationAttachmentContentType> contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
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
        ApplicationAttachment other = (ApplicationAttachment) o;
        return 
            Objects.deepEquals(this.fileName, other.fileName) &&
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.contentType, other.contentType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fileName,
            content,
            url,
            contentType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplicationAttachment.class,
                "fileName", fileName,
                "content", content,
                "url", url,
                "contentType", contentType);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> fileName = JsonNullable.undefined();
 
        private JsonNullable<String> content = JsonNullable.undefined();
 
        private JsonNullable<String> url = JsonNullable.undefined();
 
        private JsonNullable<? extends ApplicationAttachmentContentType> contentType = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The file name of the attachment.
         */
        public Builder fileName(String fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = JsonNullable.of(fileName);
            return this;
        }

        /**
         * The file name of the attachment.
         */
        public Builder fileName(JsonNullable<String> fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = fileName;
            return this;
        }

        /**
         * The content of the attachment.
         */
        public Builder content(String content) {
            Utils.checkNotNull(content, "content");
            this.content = JsonNullable.of(content);
            return this;
        }

        /**
         * The content of the attachment.
         */
        public Builder content(JsonNullable<String> content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        /**
         * The URL of the attachment.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        /**
         * The URL of the attachment.
         */
        public Builder url(JsonNullable<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        public Builder contentType(ApplicationAttachmentContentType contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = JsonNullable.of(contentType);
            return this;
        }

        public Builder contentType(JsonNullable<? extends ApplicationAttachmentContentType> contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }
        
        public ApplicationAttachment build() {
            return new ApplicationAttachment(
                fileName,
                content,
                url,
                contentType);
        }
    }
}

