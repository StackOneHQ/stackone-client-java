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
 * HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue
 * 
 * <p>The pay frequency of the job postings.
 */
@JsonDeserialize(using = HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue._Deserializer.class)
@JsonSerialize(using = HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue._Serializer.class)
public class HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue {

    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue HOURLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("hourly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue WEEKLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("weekly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue BI_WEEKLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("bi_weekly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue FOUR_WEEKLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("four_weekly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue SEMI_MONTHLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("semi_monthly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue MONTHLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("monthly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue BI_MONTHLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("bi_monthly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue QUARTERLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("quarterly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue SEMI_ANNUALLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("semi_annually");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue YEARLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("yearly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue THIRTEEN_MONTHLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("thirteen_monthly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue PRO_RATA = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("pro_rata");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue UNMAPPED_VALUE = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("unmapped_value");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue HALF_YEARLY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("half_yearly");
    public static final HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue DAILY = new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue("daily");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue> values = createValuesMap();
    private static final Map<String, HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue
     */ 
    public static HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue of(String value) {
        synchronized (HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue.class) {
            return values.computeIfAbsent(value, v -> new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum> asEnum() {
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
        HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue other = (HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue[] values() {
        synchronized (HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue.class) {
            return values.values().toArray(new HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue[] {});
        }
    }

    private static final Map<String, HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue> createValuesMap() {
        Map<String, HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue> map = new LinkedHashMap<>();
        map.put("hourly", HOURLY);
        map.put("weekly", WEEKLY);
        map.put("bi_weekly", BI_WEEKLY);
        map.put("four_weekly", FOUR_WEEKLY);
        map.put("semi_monthly", SEMI_MONTHLY);
        map.put("monthly", MONTHLY);
        map.put("bi_monthly", BI_MONTHLY);
        map.put("quarterly", QUARTERLY);
        map.put("semi_annually", SEMI_ANNUALLY);
        map.put("yearly", YEARLY);
        map.put("thirteen_monthly", THIRTEEN_MONTHLY);
        map.put("pro_rata", PRO_RATA);
        map.put("unmapped_value", UNMAPPED_VALUE);
        map.put("half_yearly", HALF_YEARLY);
        map.put("daily", DAILY);
        return map;
    }

    private static final Map<String, HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum> createEnumsMap() {
        Map<String, HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum> map = new HashMap<>();
        map.put("hourly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.HOURLY);
        map.put("weekly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.WEEKLY);
        map.put("bi_weekly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.BI_WEEKLY);
        map.put("four_weekly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.FOUR_WEEKLY);
        map.put("semi_monthly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.SEMI_MONTHLY);
        map.put("monthly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.MONTHLY);
        map.put("bi_monthly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.BI_MONTHLY);
        map.put("quarterly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.QUARTERLY);
        map.put("semi_annually", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.SEMI_ANNUALLY);
        map.put("yearly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.YEARLY);
        map.put("thirteen_monthly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.THIRTEEN_MONTHLY);
        map.put("pro_rata", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.PRO_RATA);
        map.put("unmapped_value", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.UNMAPPED_VALUE);
        map.put("half_yearly", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.HALF_YEARLY);
        map.put("daily", HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum.DAILY);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue> {

        protected _Serializer() {
            super(HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue.class);
        }

        @Override
        public void serialize(HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue> {

        protected _Deserializer() {
            super(HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue.class);
        }

        @Override
        public HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValue.of(v);
        }
    }
    
    public enum HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum {

        HOURLY("hourly"),
        WEEKLY("weekly"),
        BI_WEEKLY("bi_weekly"),
        FOUR_WEEKLY("four_weekly"),
        SEMI_MONTHLY("semi_monthly"),
        MONTHLY("monthly"),
        BI_MONTHLY("bi_monthly"),
        QUARTERLY("quarterly"),
        SEMI_ANNUALLY("semi_annually"),
        YEARLY("yearly"),
        THIRTEEN_MONTHLY("thirteen_monthly"),
        PRO_RATA("pro_rata"),
        UNMAPPED_VALUE("unmapped_value"),
        HALF_YEARLY("half_yearly"),
        DAILY("daily"),;

        private final String value;

        private HrisCreateEmployeeRequestDtoEmploymentPayFrequencyValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

