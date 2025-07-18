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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class HrisInviteEmployeeRequestDto {
    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    @JsonCreator
    public HrisInviteEmployeeRequestDto(
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = passthrough;
    }
    
    public HrisInviteEmployeeRequestDto() {
        this(JsonNullable.undefined());
    }

    /**
     * Value to pass through to the provider
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> passthrough() {
        return (JsonNullable<Map<String, Object>>) passthrough;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Value to pass through to the provider
     */
    public HrisInviteEmployeeRequestDto withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public HrisInviteEmployeeRequestDto withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = passthrough;
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
        HrisInviteEmployeeRequestDto other = (HrisInviteEmployeeRequestDto) o;
        return 
            Utils.enhancedDeepEquals(this.passthrough, other.passthrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            passthrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisInviteEmployeeRequestDto.class,
                "passthrough", passthrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<? extends Map<String, Object>> passthrough = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(Map<String, Object> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = JsonNullable.of(passthrough);
            return this;
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = passthrough;
            return this;
        }

        public HrisInviteEmployeeRequestDto build() {

            return new HrisInviteEmployeeRequestDto(
                passthrough);
        }

    }
}
