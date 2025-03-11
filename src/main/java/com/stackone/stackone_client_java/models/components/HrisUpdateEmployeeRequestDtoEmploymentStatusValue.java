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
@JsonDeserialize(using = HrisUpdateEmployeeRequestDtoEmploymentStatusValue._Deserializer.class)
@JsonSerialize(using = HrisUpdateEmployeeRequestDtoEmploymentStatusValue._Serializer.class)
public class HrisUpdateEmployeeRequestDtoEmploymentStatusValue {

    public static final HrisUpdateEmployeeRequestDtoEmploymentStatusValue ACTIVE = new HrisUpdateEmployeeRequestDtoEmploymentStatusValue("active");
    public static final HrisUpdateEmployeeRequestDtoEmploymentStatusValue PENDING = new HrisUpdateEmployeeRequestDtoEmploymentStatusValue("pending");
    public static final HrisUpdateEmployeeRequestDtoEmploymentStatusValue TERMINATED = new HrisUpdateEmployeeRequestDtoEmploymentStatusValue("terminated");
    public static final HrisUpdateEmployeeRequestDtoEmploymentStatusValue LEAVE = new HrisUpdateEmployeeRequestDtoEmploymentStatusValue("leave");
    public static final HrisUpdateEmployeeRequestDtoEmploymentStatusValue INACTIVE = new HrisUpdateEmployeeRequestDtoEmploymentStatusValue("inactive");
    public static final HrisUpdateEmployeeRequestDtoEmploymentStatusValue UNKNOWN = new HrisUpdateEmployeeRequestDtoEmploymentStatusValue("unknown");
    public static final HrisUpdateEmployeeRequestDtoEmploymentStatusValue UNMAPPED_VALUE = new HrisUpdateEmployeeRequestDtoEmploymentStatusValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentStatusValue> values = createValuesMap();
    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisUpdateEmployeeRequestDtoEmploymentStatusValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisUpdateEmployeeRequestDtoEmploymentStatusValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisUpdateEmployeeRequestDtoEmploymentStatusValue
     */ 
    public static HrisUpdateEmployeeRequestDtoEmploymentStatusValue of(String value) {
        synchronized (HrisUpdateEmployeeRequestDtoEmploymentStatusValue.class) {
            return values.computeIfAbsent(value, v -> new HrisUpdateEmployeeRequestDtoEmploymentStatusValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum> asEnum() {
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
        HrisUpdateEmployeeRequestDtoEmploymentStatusValue other = (HrisUpdateEmployeeRequestDtoEmploymentStatusValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisUpdateEmployeeRequestDtoEmploymentStatusValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisUpdateEmployeeRequestDtoEmploymentStatusValue[] values() {
        synchronized (HrisUpdateEmployeeRequestDtoEmploymentStatusValue.class) {
            return values.values().toArray(new HrisUpdateEmployeeRequestDtoEmploymentStatusValue[] {});
        }
    }

    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentStatusValue> createValuesMap() {
        Map<String, HrisUpdateEmployeeRequestDtoEmploymentStatusValue> map = new LinkedHashMap<>();
        map.put("active", ACTIVE);
        map.put("pending", PENDING);
        map.put("terminated", TERMINATED);
        map.put("leave", LEAVE);
        map.put("inactive", INACTIVE);
        map.put("unknown", UNKNOWN);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum> createEnumsMap() {
        Map<String, HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum> map = new HashMap<>();
        map.put("active", HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum.ACTIVE);
        map.put("pending", HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum.PENDING);
        map.put("terminated", HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum.TERMINATED);
        map.put("leave", HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum.LEAVE);
        map.put("inactive", HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum.INACTIVE);
        map.put("unknown", HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum.UNKNOWN);
        map.put("unmapped_value", HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisUpdateEmployeeRequestDtoEmploymentStatusValue> {

        protected _Serializer() {
            super(HrisUpdateEmployeeRequestDtoEmploymentStatusValue.class);
        }

        @Override
        public void serialize(HrisUpdateEmployeeRequestDtoEmploymentStatusValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisUpdateEmployeeRequestDtoEmploymentStatusValue> {

        protected _Deserializer() {
            super(HrisUpdateEmployeeRequestDtoEmploymentStatusValue.class);
        }

        @Override
        public HrisUpdateEmployeeRequestDtoEmploymentStatusValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisUpdateEmployeeRequestDtoEmploymentStatusValue.of(v);
        }
    }
    
    public enum HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum {

        ACTIVE("active"),
        PENDING("pending"),
        TERMINATED("terminated"),
        LEAVE("leave"),
        INACTIVE("inactive"),
        UNKNOWN("unknown"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private HrisUpdateEmployeeRequestDtoEmploymentStatusValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
