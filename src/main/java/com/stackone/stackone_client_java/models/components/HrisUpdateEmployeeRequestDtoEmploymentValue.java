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
 * HrisUpdateEmployeeRequestDtoEmploymentValue
 * 
 * <p>The pay period of the job postings.
 */
@JsonDeserialize(using = HrisUpdateEmployeeRequestDtoEmploymentValue._Deserializer.class)
@JsonSerialize(using = HrisUpdateEmployeeRequestDtoEmploymentValue._Serializer.class)
public class HrisUpdateEmployeeRequestDtoEmploymentValue {

    public static final HrisUpdateEmployeeRequestDtoEmploymentValue HOUR = new HrisUpdateEmployeeRequestDtoEmploymentValue("hour");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue DAY = new HrisUpdateEmployeeRequestDtoEmploymentValue("day");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue WEEK = new HrisUpdateEmployeeRequestDtoEmploymentValue("week");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue EVERY_TWO_WEEKS = new HrisUpdateEmployeeRequestDtoEmploymentValue("every_two_weeks");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue MONTH = new HrisUpdateEmployeeRequestDtoEmploymentValue("month");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue TWICE_A_MONTH = new HrisUpdateEmployeeRequestDtoEmploymentValue("twice_a_month");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue EVERY_TWO_MONTHS = new HrisUpdateEmployeeRequestDtoEmploymentValue("every_two_months");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue QUARTER = new HrisUpdateEmployeeRequestDtoEmploymentValue("quarter");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue EVERY_SIX_MONTHS = new HrisUpdateEmployeeRequestDtoEmploymentValue("every_six_months");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue YEAR = new HrisUpdateEmployeeRequestDtoEmploymentValue("year");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue ONE_OFF = new HrisUpdateEmployeeRequestDtoEmploymentValue("one_off");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue NONE = new HrisUpdateEmployeeRequestDtoEmploymentValue("none");
    public static final HrisUpdateEmployeeRequestDtoEmploymentValue UNMAPPED_VALUE = new HrisUpdateEmployeeRequestDtoEmploymentValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentValue> values = createValuesMap();
    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisUpdateEmployeeRequestDtoEmploymentValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisUpdateEmployeeRequestDtoEmploymentValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisUpdateEmployeeRequestDtoEmploymentValue
     */ 
    public static HrisUpdateEmployeeRequestDtoEmploymentValue of(String value) {
        synchronized (HrisUpdateEmployeeRequestDtoEmploymentValue.class) {
            return values.computeIfAbsent(value, v -> new HrisUpdateEmployeeRequestDtoEmploymentValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisUpdateEmployeeRequestDtoEmploymentValueEnum> asEnum() {
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
        HrisUpdateEmployeeRequestDtoEmploymentValue other = (HrisUpdateEmployeeRequestDtoEmploymentValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisUpdateEmployeeRequestDtoEmploymentValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisUpdateEmployeeRequestDtoEmploymentValue[] values() {
        synchronized (HrisUpdateEmployeeRequestDtoEmploymentValue.class) {
            return values.values().toArray(new HrisUpdateEmployeeRequestDtoEmploymentValue[] {});
        }
    }

    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentValue> createValuesMap() {
        Map<String, HrisUpdateEmployeeRequestDtoEmploymentValue> map = new LinkedHashMap<>();
        map.put("hour", HOUR);
        map.put("day", DAY);
        map.put("week", WEEK);
        map.put("every_two_weeks", EVERY_TWO_WEEKS);
        map.put("month", MONTH);
        map.put("twice_a_month", TWICE_A_MONTH);
        map.put("every_two_months", EVERY_TWO_MONTHS);
        map.put("quarter", QUARTER);
        map.put("every_six_months", EVERY_SIX_MONTHS);
        map.put("year", YEAR);
        map.put("one_off", ONE_OFF);
        map.put("none", NONE);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentValueEnum> createEnumsMap() {
        Map<String, HrisUpdateEmployeeRequestDtoEmploymentValueEnum> map = new HashMap<>();
        map.put("hour", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.HOUR);
        map.put("day", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.DAY);
        map.put("week", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.WEEK);
        map.put("every_two_weeks", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.EVERY_TWO_WEEKS);
        map.put("month", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.MONTH);
        map.put("twice_a_month", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.TWICE_A_MONTH);
        map.put("every_two_months", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.EVERY_TWO_MONTHS);
        map.put("quarter", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.QUARTER);
        map.put("every_six_months", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.EVERY_SIX_MONTHS);
        map.put("year", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.YEAR);
        map.put("one_off", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.ONE_OFF);
        map.put("none", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.NONE);
        map.put("unmapped_value", HrisUpdateEmployeeRequestDtoEmploymentValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisUpdateEmployeeRequestDtoEmploymentValue> {

        protected _Serializer() {
            super(HrisUpdateEmployeeRequestDtoEmploymentValue.class);
        }

        @Override
        public void serialize(HrisUpdateEmployeeRequestDtoEmploymentValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisUpdateEmployeeRequestDtoEmploymentValue> {

        protected _Deserializer() {
            super(HrisUpdateEmployeeRequestDtoEmploymentValue.class);
        }

        @Override
        public HrisUpdateEmployeeRequestDtoEmploymentValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisUpdateEmployeeRequestDtoEmploymentValue.of(v);
        }
    }
    
    public enum HrisUpdateEmployeeRequestDtoEmploymentValueEnum {

        HOUR("hour"),
        DAY("day"),
        WEEK("week"),
        EVERY_TWO_WEEKS("every_two_weeks"),
        MONTH("month"),
        TWICE_A_MONTH("twice_a_month"),
        EVERY_TWO_MONTHS("every_two_months"),
        QUARTER("quarter"),
        EVERY_SIX_MONTHS("every_six_months"),
        YEAR("year"),
        ONE_OFF("one_off"),
        NONE("none"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private HrisUpdateEmployeeRequestDtoEmploymentValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

