/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Status
 * 
 * <p>Filter positions by status
 */
public enum Status {
    OPEN("open"),
    CLOSED("closed"),
    PAUSED("paused"),
    UNMAPPED_VALUE("unmapped_value");

    @JsonValue
    private final String value;

    Status(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Status> fromValue(String value) {
        for (Status o: Status.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

