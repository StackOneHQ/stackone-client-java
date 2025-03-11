/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.stackone.stackone_client_java.models.components;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


/**
 * <p>Wrapper class for an "open" enum. "Open" enums are those that are expected
 * to evolve (particularly with the addition of enum members over time). If an
 * open enum is used then the appearance of unexpected enum values (say in a 
 * response from an updated an API) will not bring about a runtime error thus 
 * ensuring that non-updated client versions can continue to work without error.
 *
 * <p>Note that instances are immutable and are singletons (an internal thread-safe
 * cache is maintained to ensure that). As a consequence instances created with the 
 * same value will satisfy reference equality (via {@code ==}).
 * 
 * <p>This class is intended to emulate an enum (in terms of common usage and with 
 * reference equality) but with the ability to carry unknown values. Unfortunately
 * Java does not permit the use of an instance in a switch expression but you can 
 * use the {@code asEnum()} method (after dealing with the `Optional` appropriately).
 *
 */
@JsonDeserialize(using = UpdateEmployeeApiModelEthnicityValue._Deserializer.class)
@JsonSerialize(using = UpdateEmployeeApiModelEthnicityValue._Serializer.class)
public class UpdateEmployeeApiModelEthnicityValue {

    public static final UpdateEmployeeApiModelEthnicityValue WHITE = new UpdateEmployeeApiModelEthnicityValue("white");
    public static final UpdateEmployeeApiModelEthnicityValue BLACK_OR_AFRICAN_AMERICAN = new UpdateEmployeeApiModelEthnicityValue("black_or_african_american");
    public static final UpdateEmployeeApiModelEthnicityValue ASIAN = new UpdateEmployeeApiModelEthnicityValue("asian");
    public static final UpdateEmployeeApiModelEthnicityValue HISPANIC_OR_LATINO = new UpdateEmployeeApiModelEthnicityValue("hispanic_or_latino");
    public static final UpdateEmployeeApiModelEthnicityValue AMERICAN_INDIAN_OR_ALASKA_NATIVE = new UpdateEmployeeApiModelEthnicityValue("american_indian_or_alaska_native");
    public static final UpdateEmployeeApiModelEthnicityValue NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER = new UpdateEmployeeApiModelEthnicityValue("native_hawaiian_or_pacific_islander");
    public static final UpdateEmployeeApiModelEthnicityValue TWO_OR_MORE_RACES = new UpdateEmployeeApiModelEthnicityValue("two_or_more_races");
    public static final UpdateEmployeeApiModelEthnicityValue NOT_DISCLOSED = new UpdateEmployeeApiModelEthnicityValue("not_disclosed");
    public static final UpdateEmployeeApiModelEthnicityValue OTHER = new UpdateEmployeeApiModelEthnicityValue("other");
    public static final UpdateEmployeeApiModelEthnicityValue UNMAPPED_VALUE = new UpdateEmployeeApiModelEthnicityValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, UpdateEmployeeApiModelEthnicityValue> values = createValuesMap();
    private static final Map<String, UpdateEmployeeApiModelEthnicityValueEnum> enums = createEnumsMap();

    private final String value;

    private UpdateEmployeeApiModelEthnicityValue(String value) {
        this.value = value;
    }

    /**
     * Returns a UpdateEmployeeApiModelEthnicityValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as UpdateEmployeeApiModelEthnicityValue
     */ 
    public static UpdateEmployeeApiModelEthnicityValue of(String value) {
        synchronized (UpdateEmployeeApiModelEthnicityValue.class) {
            return values.computeIfAbsent(value, v -> new UpdateEmployeeApiModelEthnicityValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<UpdateEmployeeApiModelEthnicityValueEnum> asEnum() {
        return Optional.ofNullable(enums.getOrDefault(value, null));
    }

    public boolean isKnown() {
        return asEnum().isPresent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UpdateEmployeeApiModelEthnicityValue other = (UpdateEmployeeApiModelEthnicityValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "UpdateEmployeeApiModelEthnicityValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static UpdateEmployeeApiModelEthnicityValue[] values() {
        synchronized (UpdateEmployeeApiModelEthnicityValue.class) {
            return values.values().toArray(new UpdateEmployeeApiModelEthnicityValue[] {});
        }
    }

    private static final Map<String, UpdateEmployeeApiModelEthnicityValue> createValuesMap() {
        Map<String, UpdateEmployeeApiModelEthnicityValue> map = new LinkedHashMap<>();
        map.put("white", WHITE);
        map.put("black_or_african_american", BLACK_OR_AFRICAN_AMERICAN);
        map.put("asian", ASIAN);
        map.put("hispanic_or_latino", HISPANIC_OR_LATINO);
        map.put("american_indian_or_alaska_native", AMERICAN_INDIAN_OR_ALASKA_NATIVE);
        map.put("native_hawaiian_or_pacific_islander", NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER);
        map.put("two_or_more_races", TWO_OR_MORE_RACES);
        map.put("not_disclosed", NOT_DISCLOSED);
        map.put("other", OTHER);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, UpdateEmployeeApiModelEthnicityValueEnum> createEnumsMap() {
        Map<String, UpdateEmployeeApiModelEthnicityValueEnum> map = new HashMap<>();
        map.put("white", UpdateEmployeeApiModelEthnicityValueEnum.WHITE);
        map.put("black_or_african_american", UpdateEmployeeApiModelEthnicityValueEnum.BLACK_OR_AFRICAN_AMERICAN);
        map.put("asian", UpdateEmployeeApiModelEthnicityValueEnum.ASIAN);
        map.put("hispanic_or_latino", UpdateEmployeeApiModelEthnicityValueEnum.HISPANIC_OR_LATINO);
        map.put("american_indian_or_alaska_native", UpdateEmployeeApiModelEthnicityValueEnum.AMERICAN_INDIAN_OR_ALASKA_NATIVE);
        map.put("native_hawaiian_or_pacific_islander", UpdateEmployeeApiModelEthnicityValueEnum.NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER);
        map.put("two_or_more_races", UpdateEmployeeApiModelEthnicityValueEnum.TWO_OR_MORE_RACES);
        map.put("not_disclosed", UpdateEmployeeApiModelEthnicityValueEnum.NOT_DISCLOSED);
        map.put("other", UpdateEmployeeApiModelEthnicityValueEnum.OTHER);
        map.put("unmapped_value", UpdateEmployeeApiModelEthnicityValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<UpdateEmployeeApiModelEthnicityValue> {

        protected _Serializer() {
            super(UpdateEmployeeApiModelEthnicityValue.class);
        }

        @Override
        public void serialize(UpdateEmployeeApiModelEthnicityValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<UpdateEmployeeApiModelEthnicityValue> {

        protected _Deserializer() {
            super(UpdateEmployeeApiModelEthnicityValue.class);
        }

        @Override
        public UpdateEmployeeApiModelEthnicityValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return UpdateEmployeeApiModelEthnicityValue.of(v);
        }
    }
    
    public enum UpdateEmployeeApiModelEthnicityValueEnum {

        WHITE("white"),
        BLACK_OR_AFRICAN_AMERICAN("black_or_african_american"),
        ASIAN("asian"),
        HISPANIC_OR_LATINO("hispanic_or_latino"),
        AMERICAN_INDIAN_OR_ALASKA_NATIVE("american_indian_or_alaska_native"),
        NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER("native_hawaiian_or_pacific_islander"),
        TWO_OR_MORE_RACES("two_or_more_races"),
        NOT_DISCLOSED("not_disclosed"),
        OTHER("other"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private UpdateEmployeeApiModelEthnicityValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
