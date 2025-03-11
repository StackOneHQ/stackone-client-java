/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum ConnectSessionCategories {
    ATS("ats"),
    HRIS("hris"),
    HRIS_LEGACY("hris-legacy"),
    CRM("crm"),
    IAM("iam"),
    MARKETING("marketing"),
    LMS("lms"),
    STACKONE("stackone"),
    DOCUMENTS("documents"),
    TICKETING("ticketing"),
    SCREENING("screening");

    @JsonValue
    private final String value;

    private ConnectSessionCategories(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ConnectSessionCategories> fromValue(String value) {
        for (ConnectSessionCategories o: ConnectSessionCategories.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
