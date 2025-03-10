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
@JsonDeserialize(using = EmployeeEthnicityValue._Deserializer.class)
@JsonSerialize(using = EmployeeEthnicityValue._Serializer.class)
public class EmployeeEthnicityValue {

    public static final EmployeeEthnicityValue WHITE = new EmployeeEthnicityValue("white");
    public static final EmployeeEthnicityValue BLACK_OR_AFRICAN_AMERICAN = new EmployeeEthnicityValue("black_or_african_american");
    public static final EmployeeEthnicityValue ASIAN = new EmployeeEthnicityValue("asian");
    public static final EmployeeEthnicityValue HISPANIC_OR_LATINO = new EmployeeEthnicityValue("hispanic_or_latino");
    public static final EmployeeEthnicityValue AMERICAN_INDIAN_OR_ALASKA_NATIVE = new EmployeeEthnicityValue("american_indian_or_alaska_native");
    public static final EmployeeEthnicityValue NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER = new EmployeeEthnicityValue("native_hawaiian_or_pacific_islander");
    public static final EmployeeEthnicityValue TWO_OR_MORE_RACES = new EmployeeEthnicityValue("two_or_more_races");
    public static final EmployeeEthnicityValue NOT_DISCLOSED = new EmployeeEthnicityValue("not_disclosed");
    public static final EmployeeEthnicityValue OTHER = new EmployeeEthnicityValue("other");
    public static final EmployeeEthnicityValue UNMAPPED_VALUE = new EmployeeEthnicityValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, EmployeeEthnicityValue> values = createValuesMap();
    private static final Map<String, EmployeeEthnicityValueEnum> enums = createEnumsMap();

    private final String value;

    private EmployeeEthnicityValue(String value) {
        this.value = value;
    }

    /**
     * Returns a EmployeeEthnicityValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as EmployeeEthnicityValue
     */ 
    public static EmployeeEthnicityValue of(String value) {
        synchronized (EmployeeEthnicityValue.class) {
            return values.computeIfAbsent(value, v -> new EmployeeEthnicityValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<EmployeeEthnicityValueEnum> asEnum() {
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
        EmployeeEthnicityValue other = (EmployeeEthnicityValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "EmployeeEthnicityValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static EmployeeEthnicityValue[] values() {
        synchronized (EmployeeEthnicityValue.class) {
            return values.values().toArray(new EmployeeEthnicityValue[] {});
        }
    }

    private static final Map<String, EmployeeEthnicityValue> createValuesMap() {
        Map<String, EmployeeEthnicityValue> map = new LinkedHashMap<>();
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

    private static final Map<String, EmployeeEthnicityValueEnum> createEnumsMap() {
        Map<String, EmployeeEthnicityValueEnum> map = new HashMap<>();
        map.put("white", EmployeeEthnicityValueEnum.WHITE);
        map.put("black_or_african_american", EmployeeEthnicityValueEnum.BLACK_OR_AFRICAN_AMERICAN);
        map.put("asian", EmployeeEthnicityValueEnum.ASIAN);
        map.put("hispanic_or_latino", EmployeeEthnicityValueEnum.HISPANIC_OR_LATINO);
        map.put("american_indian_or_alaska_native", EmployeeEthnicityValueEnum.AMERICAN_INDIAN_OR_ALASKA_NATIVE);
        map.put("native_hawaiian_or_pacific_islander", EmployeeEthnicityValueEnum.NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER);
        map.put("two_or_more_races", EmployeeEthnicityValueEnum.TWO_OR_MORE_RACES);
        map.put("not_disclosed", EmployeeEthnicityValueEnum.NOT_DISCLOSED);
        map.put("other", EmployeeEthnicityValueEnum.OTHER);
        map.put("unmapped_value", EmployeeEthnicityValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<EmployeeEthnicityValue> {

        protected _Serializer() {
            super(EmployeeEthnicityValue.class);
        }

        @Override
        public void serialize(EmployeeEthnicityValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<EmployeeEthnicityValue> {

        protected _Deserializer() {
            super(EmployeeEthnicityValue.class);
        }

        @Override
        public EmployeeEthnicityValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return EmployeeEthnicityValue.of(v);
        }
    }
    
    public enum EmployeeEthnicityValueEnum {

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

        private EmployeeEthnicityValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
