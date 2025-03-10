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
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class DepartmentsPaginated {

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_page")
    @Deprecated
    private JsonNullable<String> nextPage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private JsonNullable<String> next;

    @JsonProperty("data")
    private List<Department> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private JsonNullable<? extends List<RawResponse>> raw;

    @JsonCreator
    public DepartmentsPaginated(
            @JsonProperty("next_page") JsonNullable<String> nextPage,
            @JsonProperty("next") JsonNullable<String> next,
            @JsonProperty("data") List<Department> data,
            @JsonProperty("raw") JsonNullable<? extends List<RawResponse>> raw) {
        Utils.checkNotNull(nextPage, "nextPage");
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(raw, "raw");
        this.nextPage = nextPage;
        this.next = next;
        this.data = data;
        this.raw = raw;
    }
    
    public DepartmentsPaginated(
            List<Department> data) {
        this(JsonNullable.undefined(), JsonNullable.undefined(), data, JsonNullable.undefined());
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> nextPage() {
        return nextPage;
    }

    @JsonIgnore
    public JsonNullable<String> next() {
        return next;
    }

    @JsonIgnore
    public List<Department> data() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<RawResponse>> raw() {
        return (JsonNullable<List<RawResponse>>) raw;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public DepartmentsPaginated withNextPage(String nextPage) {
        Utils.checkNotNull(nextPage, "nextPage");
        this.nextPage = JsonNullable.of(nextPage);
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public DepartmentsPaginated withNextPage(JsonNullable<String> nextPage) {
        Utils.checkNotNull(nextPage, "nextPage");
        this.nextPage = nextPage;
        return this;
    }

    public DepartmentsPaginated withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = JsonNullable.of(next);
        return this;
    }

    public DepartmentsPaginated withNext(JsonNullable<String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public DepartmentsPaginated withData(List<Department> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public DepartmentsPaginated withRaw(List<RawResponse> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    public DepartmentsPaginated withRaw(JsonNullable<? extends List<RawResponse>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
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
        DepartmentsPaginated other = (DepartmentsPaginated) o;
        return 
            Objects.deepEquals(this.nextPage, other.nextPage) &&
            Objects.deepEquals(this.next, other.next) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            nextPage,
            next,
            data,
            raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DepartmentsPaginated.class,
                "nextPage", nextPage,
                "next", next,
                "data", data,
                "raw", raw);
    }
    
    public final static class Builder {
 
        @Deprecated
        private JsonNullable<String> nextPage = JsonNullable.undefined();
 
        private JsonNullable<String> next = JsonNullable.undefined();
 
        private List<Department> data;
 
        private JsonNullable<? extends List<RawResponse>> raw = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder nextPage(String nextPage) {
            Utils.checkNotNull(nextPage, "nextPage");
            this.nextPage = JsonNullable.of(nextPage);
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder nextPage(JsonNullable<String> nextPage) {
            Utils.checkNotNull(nextPage, "nextPage");
            this.nextPage = nextPage;
            return this;
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = JsonNullable.of(next);
            return this;
        }

        public Builder next(JsonNullable<String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        public Builder data(List<Department> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder raw(List<RawResponse> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = JsonNullable.of(raw);
            return this;
        }

        public Builder raw(JsonNullable<? extends List<RawResponse>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }
        
        public DepartmentsPaginated build() {
            return new DepartmentsPaginated(
                nextPage,
                next,
                data,
                raw);
        }
    }
}

