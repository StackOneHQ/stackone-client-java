/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum HrisCreateEmployeeRequestDtoEthnicityValue {
    WHITE("white"),
    BLACK_OR_AFRICAN_AMERICAN("black_or_african_american"),
    ASIAN("asian"),
    HISPANIC_OR_LATINO("hispanic_or_latino"),
    AMERICAN_INDIAN_OR_ALASKA_NATIVE("american_indian_or_alaska_native"),
    NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER("native_hawaiian_or_pacific_islander"),
    TWO_OR_MORE_RACES("two_or_more_races"),
    NOT_DISCLOSED("not_disclosed"),
    OTHER("other"),
    UNMAPPED_VALUE("unmapped_value");

    @JsonValue
    private final String value;

    private HrisCreateEmployeeRequestDtoEthnicityValue(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
