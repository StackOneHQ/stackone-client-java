/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum IamUpdateUserRequestDtoIsBotUser2 {
    TRUE("true"),
    FALSE("false");

    @JsonValue
    private final String value;

    private IamUpdateUserRequestDtoIsBotUser2(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<IamUpdateUserRequestDtoIsBotUser2> fromValue(String value) {
        for (IamUpdateUserRequestDtoIsBotUser2 o: IamUpdateUserRequestDtoIsBotUser2.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
