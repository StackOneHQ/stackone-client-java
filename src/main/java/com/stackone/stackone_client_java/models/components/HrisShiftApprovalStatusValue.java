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
 * HrisShiftApprovalStatusValue
 * 
 * <p>The approval status of the shift
 */
@JsonDeserialize(using = HrisShiftApprovalStatusValue._Deserializer.class)
@JsonSerialize(using = HrisShiftApprovalStatusValue._Serializer.class)
public class HrisShiftApprovalStatusValue {

    public static final HrisShiftApprovalStatusValue PENDING = new HrisShiftApprovalStatusValue("pending");
    public static final HrisShiftApprovalStatusValue APPROVED = new HrisShiftApprovalStatusValue("approved");
    public static final HrisShiftApprovalStatusValue REJECTED = new HrisShiftApprovalStatusValue("rejected");
    public static final HrisShiftApprovalStatusValue UNMAPPED_VALUE = new HrisShiftApprovalStatusValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisShiftApprovalStatusValue> values = createValuesMap();
    private static final Map<String, HrisShiftApprovalStatusValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisShiftApprovalStatusValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisShiftApprovalStatusValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisShiftApprovalStatusValue
     */ 
    public static HrisShiftApprovalStatusValue of(String value) {
        synchronized (HrisShiftApprovalStatusValue.class) {
            return values.computeIfAbsent(value, v -> new HrisShiftApprovalStatusValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisShiftApprovalStatusValueEnum> asEnum() {
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
        HrisShiftApprovalStatusValue other = (HrisShiftApprovalStatusValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisShiftApprovalStatusValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisShiftApprovalStatusValue[] values() {
        synchronized (HrisShiftApprovalStatusValue.class) {
            return values.values().toArray(new HrisShiftApprovalStatusValue[] {});
        }
    }

    private static final Map<String, HrisShiftApprovalStatusValue> createValuesMap() {
        Map<String, HrisShiftApprovalStatusValue> map = new LinkedHashMap<>();
        map.put("pending", PENDING);
        map.put("approved", APPROVED);
        map.put("rejected", REJECTED);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, HrisShiftApprovalStatusValueEnum> createEnumsMap() {
        Map<String, HrisShiftApprovalStatusValueEnum> map = new HashMap<>();
        map.put("pending", HrisShiftApprovalStatusValueEnum.PENDING);
        map.put("approved", HrisShiftApprovalStatusValueEnum.APPROVED);
        map.put("rejected", HrisShiftApprovalStatusValueEnum.REJECTED);
        map.put("unmapped_value", HrisShiftApprovalStatusValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisShiftApprovalStatusValue> {

        protected _Serializer() {
            super(HrisShiftApprovalStatusValue.class);
        }

        @Override
        public void serialize(HrisShiftApprovalStatusValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisShiftApprovalStatusValue> {

        protected _Deserializer() {
            super(HrisShiftApprovalStatusValue.class);
        }

        @Override
        public HrisShiftApprovalStatusValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisShiftApprovalStatusValue.of(v);
        }
    }
    
    public enum HrisShiftApprovalStatusValueEnum {

        PENDING("pending"),
        APPROVED("approved"),
        REJECTED("rejected"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private HrisShiftApprovalStatusValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

