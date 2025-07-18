/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.stackone.stackone_client_java.utils.OneOfDeserializer;
import com.stackone.stackone_client_java.utils.TypedObject;
import com.stackone.stackone_client_java.utils.Utils.JsonShape;
import com.stackone.stackone_client_java.utils.Utils.TypeReferenceWithShape;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * IamUpdateUserRequestDtoIsBotUser
 * 
 * <p>Indicates if the user is a bot or service user
 */
@JsonDeserialize(using = IamUpdateUserRequestDtoIsBotUser._Deserializer.class)
public class IamUpdateUserRequestDtoIsBotUser {

    @JsonValue
    private TypedObject value;
    
    private IamUpdateUserRequestDtoIsBotUser(TypedObject value) {
        this.value = value;
    }

    public static IamUpdateUserRequestDtoIsBotUser of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new IamUpdateUserRequestDtoIsBotUser(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }

    public static IamUpdateUserRequestDtoIsBotUser of(IamUpdateUserRequestDtoIsBotUser2 value) {
        Utils.checkNotNull(value, "value");
        return new IamUpdateUserRequestDtoIsBotUser(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<IamUpdateUserRequestDtoIsBotUser2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code boolean}</li>
     * <li>{@code com.stackone.stackone_client_java.models.components.IamUpdateUserRequestDtoIsBotUser2}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IamUpdateUserRequestDtoIsBotUser other = (IamUpdateUserRequestDtoIsBotUser) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<IamUpdateUserRequestDtoIsBotUser> {

        public _Deserializer() {
            super(IamUpdateUserRequestDtoIsBotUser.class, false,
                  TypeReferenceWithShape.of(new TypeReference<IamUpdateUserRequestDtoIsBotUser2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(IamUpdateUserRequestDtoIsBotUser.class,
                "value", value);
    }
 
}

