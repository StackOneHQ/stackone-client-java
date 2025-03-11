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
 * TimeOffBalancesPolicyValue - The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown
 */
@JsonDeserialize(using = TimeOffBalancesPolicyValue._Deserializer.class)
@JsonSerialize(using = TimeOffBalancesPolicyValue._Serializer.class)
public class TimeOffBalancesPolicyValue {

    public static final TimeOffBalancesPolicyValue MINUTES = new TimeOffBalancesPolicyValue("minutes");
    public static final TimeOffBalancesPolicyValue HOURS = new TimeOffBalancesPolicyValue("hours");
    public static final TimeOffBalancesPolicyValue DAYS = new TimeOffBalancesPolicyValue("days");
    public static final TimeOffBalancesPolicyValue WEEKS = new TimeOffBalancesPolicyValue("weeks");
    public static final TimeOffBalancesPolicyValue MONTHS = new TimeOffBalancesPolicyValue("months");
    public static final TimeOffBalancesPolicyValue YEARS = new TimeOffBalancesPolicyValue("years");
    public static final TimeOffBalancesPolicyValue UNKNOWN = new TimeOffBalancesPolicyValue("unknown");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, TimeOffBalancesPolicyValue> values = createValuesMap();
    private static final Map<String, TimeOffBalancesPolicyValueEnum> enums = createEnumsMap();

    private final String value;

    private TimeOffBalancesPolicyValue(String value) {
        this.value = value;
    }

    /**
     * Returns a TimeOffBalancesPolicyValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as TimeOffBalancesPolicyValue
     */ 
    public static TimeOffBalancesPolicyValue of(String value) {
        synchronized (TimeOffBalancesPolicyValue.class) {
            return values.computeIfAbsent(value, v -> new TimeOffBalancesPolicyValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<TimeOffBalancesPolicyValueEnum> asEnum() {
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
        TimeOffBalancesPolicyValue other = (TimeOffBalancesPolicyValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "TimeOffBalancesPolicyValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static TimeOffBalancesPolicyValue[] values() {
        synchronized (TimeOffBalancesPolicyValue.class) {
            return values.values().toArray(new TimeOffBalancesPolicyValue[] {});
        }
    }

    private static final Map<String, TimeOffBalancesPolicyValue> createValuesMap() {
        Map<String, TimeOffBalancesPolicyValue> map = new LinkedHashMap<>();
        map.put("minutes", MINUTES);
        map.put("hours", HOURS);
        map.put("days", DAYS);
        map.put("weeks", WEEKS);
        map.put("months", MONTHS);
        map.put("years", YEARS);
        map.put("unknown", UNKNOWN);
        return map;
    }

    private static final Map<String, TimeOffBalancesPolicyValueEnum> createEnumsMap() {
        Map<String, TimeOffBalancesPolicyValueEnum> map = new HashMap<>();
        map.put("minutes", TimeOffBalancesPolicyValueEnum.MINUTES);
        map.put("hours", TimeOffBalancesPolicyValueEnum.HOURS);
        map.put("days", TimeOffBalancesPolicyValueEnum.DAYS);
        map.put("weeks", TimeOffBalancesPolicyValueEnum.WEEKS);
        map.put("months", TimeOffBalancesPolicyValueEnum.MONTHS);
        map.put("years", TimeOffBalancesPolicyValueEnum.YEARS);
        map.put("unknown", TimeOffBalancesPolicyValueEnum.UNKNOWN);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<TimeOffBalancesPolicyValue> {

        protected _Serializer() {
            super(TimeOffBalancesPolicyValue.class);
        }

        @Override
        public void serialize(TimeOffBalancesPolicyValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<TimeOffBalancesPolicyValue> {

        protected _Deserializer() {
            super(TimeOffBalancesPolicyValue.class);
        }

        @Override
        public TimeOffBalancesPolicyValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return TimeOffBalancesPolicyValue.of(v);
        }
    }
    
    public enum TimeOffBalancesPolicyValueEnum {

        MINUTES("minutes"),
        HOURS("hours"),
        DAYS("days"),
        WEEKS("weeks"),
        MONTHS("months"),
        YEARS("years"),
        UNKNOWN("unknown"),;

        private final String value;

        private TimeOffBalancesPolicyValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
