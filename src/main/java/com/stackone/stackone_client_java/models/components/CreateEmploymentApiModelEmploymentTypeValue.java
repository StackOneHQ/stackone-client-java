/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum CreateEmploymentApiModelEmploymentTypeValue {
    CONTRACTOR("contractor"),
    INTERN("intern"),
    PERMANENT("permanent"),
    APPRENTICE("apprentice"),
    FREELANCE("freelance"),
    TERMINATED("terminated"),
    TEMPORARY("temporary"),
    SEASONAL("seasonal"),
    VOLUNTEER("volunteer"),
    PROBATION("probation"),
    INTERNAL("internal"),
    EXTERNAL("external"),
    EXPATRIATE("expatriate"),
    EMPLOYER_OF_RECORD("employer_of_record"),
    CASUAL("casual"),
    PROGRAMME("Programme"),
    UNMAPPED_VALUE("unmapped_value");

    @JsonValue
    private final String value;

    private CreateEmploymentApiModelEmploymentTypeValue(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
