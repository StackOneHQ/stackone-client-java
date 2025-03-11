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
import java.util.Objects;

@JsonDeserialize(using = UpdateEmployeeApiModelMaritalStatusSourceValue._Deserializer.class)
public class UpdateEmployeeApiModelMaritalStatusSourceValue {

    @JsonValue
    private TypedObject value;
    
    private UpdateEmployeeApiModelMaritalStatusSourceValue(TypedObject value) {
        this.value = value;
    }

    public static UpdateEmployeeApiModelMaritalStatusSourceValue of(String value) {
        Utils.checkNotNull(value, "value");
        return new UpdateEmployeeApiModelMaritalStatusSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static UpdateEmployeeApiModelMaritalStatusSourceValue of(double value) {
        Utils.checkNotNull(value, "value");
        return new UpdateEmployeeApiModelMaritalStatusSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
    }

    public static UpdateEmployeeApiModelMaritalStatusSourceValue of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new UpdateEmployeeApiModelMaritalStatusSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }

    public static UpdateEmployeeApiModelMaritalStatusSourceValue of(UpdateEmployeeApiModelSourceValueMaritalStatus4 value) {
        Utils.checkNotNull(value, "value");
        return new UpdateEmployeeApiModelMaritalStatusSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<UpdateEmployeeApiModelSourceValueMaritalStatus4>(){}));
    }

    public static UpdateEmployeeApiModelMaritalStatusSourceValue of(List<Object> value) {
        Utils.checkNotNull(value, "value");
        return new UpdateEmployeeApiModelMaritalStatusSourceValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<List<Object>>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code double}</li>
     * <li>{@code boolean}</li>
     * <li>{@code com.stackone.stackone_client_java.models.components.UpdateEmployeeApiModelSourceValueMaritalStatus4}</li>
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
        UpdateEmployeeApiModelMaritalStatusSourceValue other = (UpdateEmployeeApiModelMaritalStatusSourceValue) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<UpdateEmployeeApiModelMaritalStatusSourceValue> {

        public _Deserializer() {
            super(UpdateEmployeeApiModelMaritalStatusSourceValue.class, false,
                  TypeReferenceWithShape.of(new TypeReference<List<Object>>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<UpdateEmployeeApiModelSourceValueMaritalStatus4>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateEmployeeApiModelMaritalStatusSourceValue.class,
                "value", value);
    }
 
}
