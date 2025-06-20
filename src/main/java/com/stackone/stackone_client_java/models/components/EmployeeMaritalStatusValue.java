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
@JsonDeserialize(using = EmployeeMaritalStatusValue._Deserializer.class)
@JsonSerialize(using = EmployeeMaritalStatusValue._Serializer.class)
public class EmployeeMaritalStatusValue {

    public static final EmployeeMaritalStatusValue SINGLE = new EmployeeMaritalStatusValue("single");
    public static final EmployeeMaritalStatusValue MARRIED = new EmployeeMaritalStatusValue("married");
    public static final EmployeeMaritalStatusValue COMMON_LAW = new EmployeeMaritalStatusValue("common_law");
    public static final EmployeeMaritalStatusValue DIVORCED = new EmployeeMaritalStatusValue("divorced");
    public static final EmployeeMaritalStatusValue WIDOWED = new EmployeeMaritalStatusValue("widowed");
    public static final EmployeeMaritalStatusValue DOMESTIC_PARTNERSHIP = new EmployeeMaritalStatusValue("domestic_partnership");
    public static final EmployeeMaritalStatusValue SEPARATED = new EmployeeMaritalStatusValue("separated");
    public static final EmployeeMaritalStatusValue OTHER = new EmployeeMaritalStatusValue("other");
    public static final EmployeeMaritalStatusValue NOT_DISCLOSED = new EmployeeMaritalStatusValue("not_disclosed");
    public static final EmployeeMaritalStatusValue UNMAPPED_VALUE = new EmployeeMaritalStatusValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, EmployeeMaritalStatusValue> values = createValuesMap();
    private static final Map<String, EmployeeMaritalStatusValueEnum> enums = createEnumsMap();

    private final String value;

    private EmployeeMaritalStatusValue(String value) {
        this.value = value;
    }

    /**
     * Returns a EmployeeMaritalStatusValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as EmployeeMaritalStatusValue
     */ 
    public static EmployeeMaritalStatusValue of(String value) {
        synchronized (EmployeeMaritalStatusValue.class) {
            return values.computeIfAbsent(value, v -> new EmployeeMaritalStatusValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<EmployeeMaritalStatusValueEnum> asEnum() {
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
        EmployeeMaritalStatusValue other = (EmployeeMaritalStatusValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "EmployeeMaritalStatusValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static EmployeeMaritalStatusValue[] values() {
        synchronized (EmployeeMaritalStatusValue.class) {
            return values.values().toArray(new EmployeeMaritalStatusValue[] {});
        }
    }

    private static final Map<String, EmployeeMaritalStatusValue> createValuesMap() {
        Map<String, EmployeeMaritalStatusValue> map = new LinkedHashMap<>();
        map.put("single", SINGLE);
        map.put("married", MARRIED);
        map.put("common_law", COMMON_LAW);
        map.put("divorced", DIVORCED);
        map.put("widowed", WIDOWED);
        map.put("domestic_partnership", DOMESTIC_PARTNERSHIP);
        map.put("separated", SEPARATED);
        map.put("other", OTHER);
        map.put("not_disclosed", NOT_DISCLOSED);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, EmployeeMaritalStatusValueEnum> createEnumsMap() {
        Map<String, EmployeeMaritalStatusValueEnum> map = new HashMap<>();
        map.put("single", EmployeeMaritalStatusValueEnum.SINGLE);
        map.put("married", EmployeeMaritalStatusValueEnum.MARRIED);
        map.put("common_law", EmployeeMaritalStatusValueEnum.COMMON_LAW);
        map.put("divorced", EmployeeMaritalStatusValueEnum.DIVORCED);
        map.put("widowed", EmployeeMaritalStatusValueEnum.WIDOWED);
        map.put("domestic_partnership", EmployeeMaritalStatusValueEnum.DOMESTIC_PARTNERSHIP);
        map.put("separated", EmployeeMaritalStatusValueEnum.SEPARATED);
        map.put("other", EmployeeMaritalStatusValueEnum.OTHER);
        map.put("not_disclosed", EmployeeMaritalStatusValueEnum.NOT_DISCLOSED);
        map.put("unmapped_value", EmployeeMaritalStatusValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<EmployeeMaritalStatusValue> {

        protected _Serializer() {
            super(EmployeeMaritalStatusValue.class);
        }

        @Override
        public void serialize(EmployeeMaritalStatusValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<EmployeeMaritalStatusValue> {

        protected _Deserializer() {
            super(EmployeeMaritalStatusValue.class);
        }

        @Override
        public EmployeeMaritalStatusValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return EmployeeMaritalStatusValue.of(v);
        }
    }
    
    public enum EmployeeMaritalStatusValueEnum {

        SINGLE("single"),
        MARRIED("married"),
        COMMON_LAW("common_law"),
        DIVORCED("divorced"),
        WIDOWED("widowed"),
        DOMESTIC_PARTNERSHIP("domestic_partnership"),
        SEPARATED("separated"),
        OTHER("other"),
        NOT_DISCLOSED("not_disclosed"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private EmployeeMaritalStatusValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

