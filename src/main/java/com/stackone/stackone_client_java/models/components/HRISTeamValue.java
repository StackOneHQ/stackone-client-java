/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum HRISTeamValue {
    TEAM("team");

    @JsonValue
    private final String value;

    private HRISTeamValue(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
