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
 * TimeOffPolicyDurationUnitValue
 * 
 * <p>The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown
 */
@JsonDeserialize(using = TimeOffPolicyDurationUnitValue._Deserializer.class)
@JsonSerialize(using = TimeOffPolicyDurationUnitValue._Serializer.class)
public class TimeOffPolicyDurationUnitValue {

    public static final TimeOffPolicyDurationUnitValue MINUTES = new TimeOffPolicyDurationUnitValue("minutes");
    public static final TimeOffPolicyDurationUnitValue HOURS = new TimeOffPolicyDurationUnitValue("hours");
    public static final TimeOffPolicyDurationUnitValue DAYS = new TimeOffPolicyDurationUnitValue("days");
    public static final TimeOffPolicyDurationUnitValue WEEKS = new TimeOffPolicyDurationUnitValue("weeks");
    public static final TimeOffPolicyDurationUnitValue MONTHS = new TimeOffPolicyDurationUnitValue("months");
    public static final TimeOffPolicyDurationUnitValue YEARS = new TimeOffPolicyDurationUnitValue("years");
    public static final TimeOffPolicyDurationUnitValue UNKNOWN = new TimeOffPolicyDurationUnitValue("unknown");
    public static final TimeOffPolicyDurationUnitValue UNMAPPED_VALUE = new TimeOffPolicyDurationUnitValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, TimeOffPolicyDurationUnitValue> values = createValuesMap();
    private static final Map<String, TimeOffPolicyDurationUnitValueEnum> enums = createEnumsMap();

    private final String value;

    private TimeOffPolicyDurationUnitValue(String value) {
        this.value = value;
    }

    /**
     * Returns a TimeOffPolicyDurationUnitValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as TimeOffPolicyDurationUnitValue
     */ 
    public static TimeOffPolicyDurationUnitValue of(String value) {
        synchronized (TimeOffPolicyDurationUnitValue.class) {
            return values.computeIfAbsent(value, v -> new TimeOffPolicyDurationUnitValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<TimeOffPolicyDurationUnitValueEnum> asEnum() {
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
        TimeOffPolicyDurationUnitValue other = (TimeOffPolicyDurationUnitValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "TimeOffPolicyDurationUnitValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static TimeOffPolicyDurationUnitValue[] values() {
        synchronized (TimeOffPolicyDurationUnitValue.class) {
            return values.values().toArray(new TimeOffPolicyDurationUnitValue[] {});
        }
    }

    private static final Map<String, TimeOffPolicyDurationUnitValue> createValuesMap() {
        Map<String, TimeOffPolicyDurationUnitValue> map = new LinkedHashMap<>();
        map.put("minutes", MINUTES);
        map.put("hours", HOURS);
        map.put("days", DAYS);
        map.put("weeks", WEEKS);
        map.put("months", MONTHS);
        map.put("years", YEARS);
        map.put("unknown", UNKNOWN);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, TimeOffPolicyDurationUnitValueEnum> createEnumsMap() {
        Map<String, TimeOffPolicyDurationUnitValueEnum> map = new HashMap<>();
        map.put("minutes", TimeOffPolicyDurationUnitValueEnum.MINUTES);
        map.put("hours", TimeOffPolicyDurationUnitValueEnum.HOURS);
        map.put("days", TimeOffPolicyDurationUnitValueEnum.DAYS);
        map.put("weeks", TimeOffPolicyDurationUnitValueEnum.WEEKS);
        map.put("months", TimeOffPolicyDurationUnitValueEnum.MONTHS);
        map.put("years", TimeOffPolicyDurationUnitValueEnum.YEARS);
        map.put("unknown", TimeOffPolicyDurationUnitValueEnum.UNKNOWN);
        map.put("unmapped_value", TimeOffPolicyDurationUnitValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<TimeOffPolicyDurationUnitValue> {

        protected _Serializer() {
            super(TimeOffPolicyDurationUnitValue.class);
        }

        @Override
        public void serialize(TimeOffPolicyDurationUnitValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<TimeOffPolicyDurationUnitValue> {

        protected _Deserializer() {
            super(TimeOffPolicyDurationUnitValue.class);
        }

        @Override
        public TimeOffPolicyDurationUnitValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return TimeOffPolicyDurationUnitValue.of(v);
        }
    }
    
    public enum TimeOffPolicyDurationUnitValueEnum {

        MINUTES("minutes"),
        HOURS("hours"),
        DAYS("days"),
        WEEKS("weeks"),
        MONTHS("months"),
        YEARS("years"),
        UNKNOWN("unknown"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private TimeOffPolicyDurationUnitValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

