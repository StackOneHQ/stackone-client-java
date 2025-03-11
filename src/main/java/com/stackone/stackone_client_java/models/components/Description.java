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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Description - The employee job description
 */

public class Description {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    private JsonNullable<String> text;

    @JsonCreator
    public Description(
            @JsonProperty("text") JsonNullable<String> text) {
        Utils.checkNotNull(text, "text");
        this.text = text;
    }
    
    public Description() {
        this(JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<String> text() {
        return text;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Description withText(String text) {
        Utils.checkNotNull(text, "text");
        this.text = JsonNullable.of(text);
        return this;
    }

    public Description withText(JsonNullable<String> text) {
        Utils.checkNotNull(text, "text");
        this.text = text;
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
        Description other = (Description) o;
        return 
            Objects.deepEquals(this.text, other.text);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            text);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Description.class,
                "text", text);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> text = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder text(String text) {
            Utils.checkNotNull(text, "text");
            this.text = JsonNullable.of(text);
            return this;
        }

        public Builder text(JsonNullable<String> text) {
            Utils.checkNotNull(text, "text");
            this.text = text;
            return this;
        }
        
        public Description build() {
            return new Description(
                text);
        }
    }
}

