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
 * HrisUpdateEmploymentRequestDtoSourceValue
 * 
 * <p>The source value of the pay period.
 */
@JsonDeserialize(using = HrisUpdateEmploymentRequestDtoSourceValue._Deserializer.class)
public class HrisUpdateEmploymentRequestDtoSourceValue {

    @JsonValue
    private TypedObject value;
    
    private HrisUpdateEmploymentRequestDtoSourceValue(TypedObject value) {
        this.value = value;
    }

    public static HrisUpdateEmploymentRequestDtoSourceValue of(String value) {
        Utils.checkNotNull(value, "value");
        return new HrisUpdateEmploymentRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static HrisUpdateEmploymentRequestDtoSourceValue of(double value) {
        Utils.checkNotNull(value, "value");
        return new HrisUpdateEmploymentRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
    }

    public static HrisUpdateEmploymentRequestDtoSourceValue of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new HrisUpdateEmploymentRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }

    public static HrisUpdateEmploymentRequestDtoSourceValue of(HrisUpdateEmploymentRequestDtoSourceValue4 value) {
        Utils.checkNotNull(value, "value");
        return new HrisUpdateEmploymentRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HrisUpdateEmploymentRequestDtoSourceValue4>(){}));
    }

    public static HrisUpdateEmploymentRequestDtoSourceValue of(List<Object> value) {
        Utils.checkNotNull(value, "value");
        return new HrisUpdateEmploymentRequestDtoSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<List<Object>>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code double}</li>
     * <li>{@code boolean}</li>
     * <li>{@code com.stackone.stackone_client_java.models.components.HrisUpdateEmploymentRequestDtoSourceValue4}</li>
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
        HrisUpdateEmploymentRequestDtoSourceValue other = (HrisUpdateEmploymentRequestDtoSourceValue) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<HrisUpdateEmploymentRequestDtoSourceValue> {

        public _Deserializer() {
            super(HrisUpdateEmploymentRequestDtoSourceValue.class, false,
                  TypeReferenceWithShape.of(new TypeReference<List<Object>>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<HrisUpdateEmploymentRequestDtoSourceValue4>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisUpdateEmploymentRequestDtoSourceValue.class,
                "value", value);
    }
 
}

