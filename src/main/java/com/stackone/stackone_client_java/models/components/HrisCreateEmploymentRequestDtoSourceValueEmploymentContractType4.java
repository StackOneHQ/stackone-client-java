/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class HrisCreateEmploymentRequestDtoSourceValueEmploymentContractType4 {

    @JsonCreator
    public HrisCreateEmploymentRequestDtoSourceValueEmploymentContractType4() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisCreateEmploymentRequestDtoSourceValueEmploymentContractType4.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public HrisCreateEmploymentRequestDtoSourceValueEmploymentContractType4 build() {
            return new HrisCreateEmploymentRequestDtoSourceValueEmploymentContractType4(
                );
        }
    }
}

