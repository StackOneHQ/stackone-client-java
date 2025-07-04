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
/**
 * EmploymentWorkTimeValue
 * 
 * <p>The unified value for the period.
 */
@JsonDeserialize(using = EmploymentWorkTimeValue._Deserializer.class)
@JsonSerialize(using = EmploymentWorkTimeValue._Serializer.class)
public class EmploymentWorkTimeValue {

    public static final EmploymentWorkTimeValue DAY = new EmploymentWorkTimeValue("day");
    public static final EmploymentWorkTimeValue WEEK = new EmploymentWorkTimeValue("week");
    public static final EmploymentWorkTimeValue MONTH = new EmploymentWorkTimeValue("month");
    public static final EmploymentWorkTimeValue YEAR = new EmploymentWorkTimeValue("year");
    public static final EmploymentWorkTimeValue UNMAPPED_VALUE = new EmploymentWorkTimeValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, EmploymentWorkTimeValue> values = createValuesMap();
    private static final Map<String, EmploymentWorkTimeValueEnum> enums = createEnumsMap();

    private final String value;

    private EmploymentWorkTimeValue(String value) {
        this.value = value;
    }

    /**
     * Returns a EmploymentWorkTimeValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as EmploymentWorkTimeValue
     */ 
    public static EmploymentWorkTimeValue of(String value) {
        synchronized (EmploymentWorkTimeValue.class) {
            return values.computeIfAbsent(value, v -> new EmploymentWorkTimeValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<EmploymentWorkTimeValueEnum> asEnum() {
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
        EmploymentWorkTimeValue other = (EmploymentWorkTimeValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "EmploymentWorkTimeValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static EmploymentWorkTimeValue[] values() {
        synchronized (EmploymentWorkTimeValue.class) {
            return values.values().toArray(new EmploymentWorkTimeValue[] {});
        }
    }

    private static final Map<String, EmploymentWorkTimeValue> createValuesMap() {
        Map<String, EmploymentWorkTimeValue> map = new LinkedHashMap<>();
        map.put("day", DAY);
        map.put("week", WEEK);
        map.put("month", MONTH);
        map.put("year", YEAR);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, EmploymentWorkTimeValueEnum> createEnumsMap() {
        Map<String, EmploymentWorkTimeValueEnum> map = new HashMap<>();
        map.put("day", EmploymentWorkTimeValueEnum.DAY);
        map.put("week", EmploymentWorkTimeValueEnum.WEEK);
        map.put("month", EmploymentWorkTimeValueEnum.MONTH);
        map.put("year", EmploymentWorkTimeValueEnum.YEAR);
        map.put("unmapped_value", EmploymentWorkTimeValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<EmploymentWorkTimeValue> {

        protected _Serializer() {
            super(EmploymentWorkTimeValue.class);
        }

        @Override
        public void serialize(EmploymentWorkTimeValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<EmploymentWorkTimeValue> {

        protected _Deserializer() {
            super(EmploymentWorkTimeValue.class);
        }

        @Override
        public EmploymentWorkTimeValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return EmploymentWorkTimeValue.of(v);
        }
    }
    
    public enum EmploymentWorkTimeValueEnum {

        DAY("day"),
        WEEK("week"),
        MONTH("month"),
        YEAR("year"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private EmploymentWorkTimeValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

