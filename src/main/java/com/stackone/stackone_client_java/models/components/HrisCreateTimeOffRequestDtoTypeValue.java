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
@JsonDeserialize(using = HrisCreateTimeOffRequestDtoTypeValue._Deserializer.class)
@JsonSerialize(using = HrisCreateTimeOffRequestDtoTypeValue._Serializer.class)
public class HrisCreateTimeOffRequestDtoTypeValue {

    public static final HrisCreateTimeOffRequestDtoTypeValue SICK = new HrisCreateTimeOffRequestDtoTypeValue("sick");
    public static final HrisCreateTimeOffRequestDtoTypeValue UNMAPPED_VALUE = new HrisCreateTimeOffRequestDtoTypeValue("unmapped_value");
    public static final HrisCreateTimeOffRequestDtoTypeValue VACATION = new HrisCreateTimeOffRequestDtoTypeValue("vacation");
    public static final HrisCreateTimeOffRequestDtoTypeValue LONG_TERM_DISABILITY = new HrisCreateTimeOffRequestDtoTypeValue("long_term_disability");
    public static final HrisCreateTimeOffRequestDtoTypeValue SHORT_TERM_DISABILITY = new HrisCreateTimeOffRequestDtoTypeValue("short_term_disability");
    public static final HrisCreateTimeOffRequestDtoTypeValue ABSENT = new HrisCreateTimeOffRequestDtoTypeValue("absent");
    public static final HrisCreateTimeOffRequestDtoTypeValue COMP_TIME = new HrisCreateTimeOffRequestDtoTypeValue("comp_time");
    public static final HrisCreateTimeOffRequestDtoTypeValue TRAINING = new HrisCreateTimeOffRequestDtoTypeValue("training");
    public static final HrisCreateTimeOffRequestDtoTypeValue ANNUAL_LEAVE = new HrisCreateTimeOffRequestDtoTypeValue("annual_leave");
    public static final HrisCreateTimeOffRequestDtoTypeValue LEAVE_OF_ABSENCE = new HrisCreateTimeOffRequestDtoTypeValue("leave_of_absence");
    public static final HrisCreateTimeOffRequestDtoTypeValue BREAK = new HrisCreateTimeOffRequestDtoTypeValue("break");
    public static final HrisCreateTimeOffRequestDtoTypeValue CHILD_CARE_LEAVE = new HrisCreateTimeOffRequestDtoTypeValue("child_care_leave");
    public static final HrisCreateTimeOffRequestDtoTypeValue MATERNITY_LEAVE = new HrisCreateTimeOffRequestDtoTypeValue("maternity_leave");
    public static final HrisCreateTimeOffRequestDtoTypeValue JURY_DUTY = new HrisCreateTimeOffRequestDtoTypeValue("jury_duty");
    public static final HrisCreateTimeOffRequestDtoTypeValue SABBATICAL = new HrisCreateTimeOffRequestDtoTypeValue("sabbatical");
    public static final HrisCreateTimeOffRequestDtoTypeValue ACCIDENT = new HrisCreateTimeOffRequestDtoTypeValue("accident");
    public static final HrisCreateTimeOffRequestDtoTypeValue PAID = new HrisCreateTimeOffRequestDtoTypeValue("paid");
    public static final HrisCreateTimeOffRequestDtoTypeValue UNPAID = new HrisCreateTimeOffRequestDtoTypeValue("unpaid");
    public static final HrisCreateTimeOffRequestDtoTypeValue HOLIDAY = new HrisCreateTimeOffRequestDtoTypeValue("holiday");
    public static final HrisCreateTimeOffRequestDtoTypeValue PERSONAL = new HrisCreateTimeOffRequestDtoTypeValue("personal");
    public static final HrisCreateTimeOffRequestDtoTypeValue IN_LIEU = new HrisCreateTimeOffRequestDtoTypeValue("in_lieu");
    public static final HrisCreateTimeOffRequestDtoTypeValue BEREAVEMENT = new HrisCreateTimeOffRequestDtoTypeValue("bereavement");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisCreateTimeOffRequestDtoTypeValue> values = createValuesMap();
    private static final Map<String, HrisCreateTimeOffRequestDtoTypeValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisCreateTimeOffRequestDtoTypeValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisCreateTimeOffRequestDtoTypeValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisCreateTimeOffRequestDtoTypeValue
     */ 
    public static HrisCreateTimeOffRequestDtoTypeValue of(String value) {
        synchronized (HrisCreateTimeOffRequestDtoTypeValue.class) {
            return values.computeIfAbsent(value, v -> new HrisCreateTimeOffRequestDtoTypeValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisCreateTimeOffRequestDtoTypeValueEnum> asEnum() {
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
        HrisCreateTimeOffRequestDtoTypeValue other = (HrisCreateTimeOffRequestDtoTypeValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisCreateTimeOffRequestDtoTypeValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisCreateTimeOffRequestDtoTypeValue[] values() {
        synchronized (HrisCreateTimeOffRequestDtoTypeValue.class) {
            return values.values().toArray(new HrisCreateTimeOffRequestDtoTypeValue[] {});
        }
    }

    private static final Map<String, HrisCreateTimeOffRequestDtoTypeValue> createValuesMap() {
        Map<String, HrisCreateTimeOffRequestDtoTypeValue> map = new LinkedHashMap<>();
        map.put("sick", SICK);
        map.put("unmapped_value", UNMAPPED_VALUE);
        map.put("vacation", VACATION);
        map.put("long_term_disability", LONG_TERM_DISABILITY);
        map.put("short_term_disability", SHORT_TERM_DISABILITY);
        map.put("absent", ABSENT);
        map.put("comp_time", COMP_TIME);
        map.put("training", TRAINING);
        map.put("annual_leave", ANNUAL_LEAVE);
        map.put("leave_of_absence", LEAVE_OF_ABSENCE);
        map.put("break", BREAK);
        map.put("child_care_leave", CHILD_CARE_LEAVE);
        map.put("maternity_leave", MATERNITY_LEAVE);
        map.put("jury_duty", JURY_DUTY);
        map.put("sabbatical", SABBATICAL);
        map.put("accident", ACCIDENT);
        map.put("paid", PAID);
        map.put("unpaid", UNPAID);
        map.put("holiday", HOLIDAY);
        map.put("personal", PERSONAL);
        map.put("in_lieu", IN_LIEU);
        map.put("bereavement", BEREAVEMENT);
        return map;
    }

    private static final Map<String, HrisCreateTimeOffRequestDtoTypeValueEnum> createEnumsMap() {
        Map<String, HrisCreateTimeOffRequestDtoTypeValueEnum> map = new HashMap<>();
        map.put("sick", HrisCreateTimeOffRequestDtoTypeValueEnum.SICK);
        map.put("unmapped_value", HrisCreateTimeOffRequestDtoTypeValueEnum.UNMAPPED_VALUE);
        map.put("vacation", HrisCreateTimeOffRequestDtoTypeValueEnum.VACATION);
        map.put("long_term_disability", HrisCreateTimeOffRequestDtoTypeValueEnum.LONG_TERM_DISABILITY);
        map.put("short_term_disability", HrisCreateTimeOffRequestDtoTypeValueEnum.SHORT_TERM_DISABILITY);
        map.put("absent", HrisCreateTimeOffRequestDtoTypeValueEnum.ABSENT);
        map.put("comp_time", HrisCreateTimeOffRequestDtoTypeValueEnum.COMP_TIME);
        map.put("training", HrisCreateTimeOffRequestDtoTypeValueEnum.TRAINING);
        map.put("annual_leave", HrisCreateTimeOffRequestDtoTypeValueEnum.ANNUAL_LEAVE);
        map.put("leave_of_absence", HrisCreateTimeOffRequestDtoTypeValueEnum.LEAVE_OF_ABSENCE);
        map.put("break", HrisCreateTimeOffRequestDtoTypeValueEnum.BREAK);
        map.put("child_care_leave", HrisCreateTimeOffRequestDtoTypeValueEnum.CHILD_CARE_LEAVE);
        map.put("maternity_leave", HrisCreateTimeOffRequestDtoTypeValueEnum.MATERNITY_LEAVE);
        map.put("jury_duty", HrisCreateTimeOffRequestDtoTypeValueEnum.JURY_DUTY);
        map.put("sabbatical", HrisCreateTimeOffRequestDtoTypeValueEnum.SABBATICAL);
        map.put("accident", HrisCreateTimeOffRequestDtoTypeValueEnum.ACCIDENT);
        map.put("paid", HrisCreateTimeOffRequestDtoTypeValueEnum.PAID);
        map.put("unpaid", HrisCreateTimeOffRequestDtoTypeValueEnum.UNPAID);
        map.put("holiday", HrisCreateTimeOffRequestDtoTypeValueEnum.HOLIDAY);
        map.put("personal", HrisCreateTimeOffRequestDtoTypeValueEnum.PERSONAL);
        map.put("in_lieu", HrisCreateTimeOffRequestDtoTypeValueEnum.IN_LIEU);
        map.put("bereavement", HrisCreateTimeOffRequestDtoTypeValueEnum.BEREAVEMENT);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisCreateTimeOffRequestDtoTypeValue> {

        protected _Serializer() {
            super(HrisCreateTimeOffRequestDtoTypeValue.class);
        }

        @Override
        public void serialize(HrisCreateTimeOffRequestDtoTypeValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisCreateTimeOffRequestDtoTypeValue> {

        protected _Deserializer() {
            super(HrisCreateTimeOffRequestDtoTypeValue.class);
        }

        @Override
        public HrisCreateTimeOffRequestDtoTypeValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisCreateTimeOffRequestDtoTypeValue.of(v);
        }
    }
    
    public enum HrisCreateTimeOffRequestDtoTypeValueEnum {

        SICK("sick"),
        UNMAPPED_VALUE("unmapped_value"),
        VACATION("vacation"),
        LONG_TERM_DISABILITY("long_term_disability"),
        SHORT_TERM_DISABILITY("short_term_disability"),
        ABSENT("absent"),
        COMP_TIME("comp_time"),
        TRAINING("training"),
        ANNUAL_LEAVE("annual_leave"),
        LEAVE_OF_ABSENCE("leave_of_absence"),
        BREAK("break"),
        CHILD_CARE_LEAVE("child_care_leave"),
        MATERNITY_LEAVE("maternity_leave"),
        JURY_DUTY("jury_duty"),
        SABBATICAL("sabbatical"),
        ACCIDENT("accident"),
        PAID("paid"),
        UNPAID("unpaid"),
        HOLIDAY("holiday"),
        PERSONAL("personal"),
        IN_LIEU("in_lieu"),
        BEREAVEMENT("bereavement"),;

        private final String value;

        private HrisCreateTimeOffRequestDtoTypeValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

