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
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

/**
 * AtsCreateJobRequestDtoSourceValue
 * 
 * <p>The source value of the job status.
 */
@JsonDeserialize(using = AtsCreateJobRequestDtoSourceValue._Deserializer.class)
public class AtsCreateJobRequestDtoSourceValue {

    @JsonValue
    private TypedObject value;
    
    private AtsCreateJobRequestDtoSourceValue(TypedObject value) {
        this.value = value;
    }

    public static AtsCreateJobRequestDtoSourceValue of(String value) {
        Utils.checkNotNull(value, "value");
        return new AtsCreateJobRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static AtsCreateJobRequestDtoSourceValue of(double value) {
        Utils.checkNotNull(value, "value");
        return new AtsCreateJobRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
    }

    public static AtsCreateJobRequestDtoSourceValue of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new AtsCreateJobRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }

    public static AtsCreateJobRequestDtoSourceValue of(AtsCreateJobRequestDtoSourceValue4 value) {
        Utils.checkNotNull(value, "value");
        return new AtsCreateJobRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AtsCreateJobRequestDtoSourceValue4>(){}));
    }

    public static AtsCreateJobRequestDtoSourceValue of(List<Object> value) {
        Utils.checkNotNull(value, "value");
        return new AtsCreateJobRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<List<Object>>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code double}</li>
     * <li>{@code boolean}</li>
     * <li>{@code com.stackone.stackone_client_java.models.components.AtsCreateJobRequestDtoSourceValue4}</li>
     * <li>{@code java.util.List<java.lang.Object>}</li>
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
        AtsCreateJobRequestDtoSourceValue other = (AtsCreateJobRequestDtoSourceValue) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<AtsCreateJobRequestDtoSourceValue> {

        public _Deserializer() {
            super(AtsCreateJobRequestDtoSourceValue.class, false,
                  TypeReferenceWithShape.of(new TypeReference<List<Object>>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AtsCreateJobRequestDtoSourceValue4>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsCreateJobRequestDtoSourceValue.class,
                "value", value);
    }
 
}

