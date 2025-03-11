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
import java.util.Objects;
/**
 * HrisCreateTimeOffRequestDtoStartHalfDay - True if the start of the time off request begins half way through the day
 */

@JsonDeserialize(using = HrisCreateTimeOffRequestDtoStartHalfDay._Deserializer.class)
public class HrisCreateTimeOffRequestDtoStartHalfDay {

    @JsonValue
    private TypedObject value;
    
    private HrisCreateTimeOffRequestDtoStartHalfDay(TypedObject value) {
        this.value = value;
    }

    public static HrisCreateTimeOffRequestDtoStartHalfDay of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new HrisCreateTimeOffRequestDtoStartHalfDay(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }

    public static HrisCreateTimeOffRequestDtoStartHalfDay of(StartHalfDay2 value) {
        Utils.checkNotNull(value, "value");
        return new HrisCreateTimeOffRequestDtoStartHalfDay(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StartHalfDay2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code boolean}</li>
     * <li>{@code com.stackone.stackone_client_java.models.components.StartHalfDay2}</li>
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
        HrisCreateTimeOffRequestDtoStartHalfDay other = (HrisCreateTimeOffRequestDtoStartHalfDay) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<HrisCreateTimeOffRequestDtoStartHalfDay> {

        public _Deserializer() {
            super(HrisCreateTimeOffRequestDtoStartHalfDay.class, false,
                  TypeReferenceWithShape.of(new TypeReference<StartHalfDay2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisCreateTimeOffRequestDtoStartHalfDay.class,
                "value", value);
    }
 
}
