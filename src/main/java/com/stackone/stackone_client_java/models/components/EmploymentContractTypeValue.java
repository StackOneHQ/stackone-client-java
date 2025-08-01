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
@JsonDeserialize(using = EmploymentContractTypeValue._Deserializer.class)
@JsonSerialize(using = EmploymentContractTypeValue._Serializer.class)
public class EmploymentContractTypeValue {

    public static final EmploymentContractTypeValue FULL_TIME = new EmploymentContractTypeValue("full_time");
    public static final EmploymentContractTypeValue SHIFTS = new EmploymentContractTypeValue("shifts");
    public static final EmploymentContractTypeValue PART_TIME = new EmploymentContractTypeValue("part_time");
    public static final EmploymentContractTypeValue UNMAPPED_VALUE = new EmploymentContractTypeValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, EmploymentContractTypeValue> values = createValuesMap();
    private static final Map<String, EmploymentContractTypeValueEnum> enums = createEnumsMap();

    private final String value;

    private EmploymentContractTypeValue(String value) {
        this.value = value;
    }

    /**
     * Returns a EmploymentContractTypeValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as EmploymentContractTypeValue
     */ 
    public static EmploymentContractTypeValue of(String value) {
        synchronized (EmploymentContractTypeValue.class) {
            return values.computeIfAbsent(value, v -> new EmploymentContractTypeValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<EmploymentContractTypeValueEnum> asEnum() {
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
        EmploymentContractTypeValue other = (EmploymentContractTypeValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "EmploymentContractTypeValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static EmploymentContractTypeValue[] values() {
        synchronized (EmploymentContractTypeValue.class) {
            return values.values().toArray(new EmploymentContractTypeValue[] {});
        }
    }

    private static final Map<String, EmploymentContractTypeValue> createValuesMap() {
        Map<String, EmploymentContractTypeValue> map = new LinkedHashMap<>();
        map.put("full_time", FULL_TIME);
        map.put("shifts", SHIFTS);
        map.put("part_time", PART_TIME);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, EmploymentContractTypeValueEnum> createEnumsMap() {
        Map<String, EmploymentContractTypeValueEnum> map = new HashMap<>();
        map.put("full_time", EmploymentContractTypeValueEnum.FULL_TIME);
        map.put("shifts", EmploymentContractTypeValueEnum.SHIFTS);
        map.put("part_time", EmploymentContractTypeValueEnum.PART_TIME);
        map.put("unmapped_value", EmploymentContractTypeValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<EmploymentContractTypeValue> {

        protected _Serializer() {
            super(EmploymentContractTypeValue.class);
        }

        @Override
        public void serialize(EmploymentContractTypeValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<EmploymentContractTypeValue> {

        protected _Deserializer() {
            super(EmploymentContractTypeValue.class);
        }

        @Override
        public EmploymentContractTypeValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return EmploymentContractTypeValue.of(v);
        }
    }
    
    public enum EmploymentContractTypeValueEnum {

        FULL_TIME("full_time"),
        SHIFTS("shifts"),
        PART_TIME("part_time"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private EmploymentContractTypeValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

