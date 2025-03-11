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
@JsonDeserialize(using = HrisCreateTimeOffRequestDtoValue._Deserializer.class)
@JsonSerialize(using = HrisCreateTimeOffRequestDtoValue._Serializer.class)
public class HrisCreateTimeOffRequestDtoValue {

    public static final HrisCreateTimeOffRequestDtoValue APPROVED = new HrisCreateTimeOffRequestDtoValue("approved");
    public static final HrisCreateTimeOffRequestDtoValue CANCELLED = new HrisCreateTimeOffRequestDtoValue("cancelled");
    public static final HrisCreateTimeOffRequestDtoValue REJECTED = new HrisCreateTimeOffRequestDtoValue("rejected");
    public static final HrisCreateTimeOffRequestDtoValue PENDING = new HrisCreateTimeOffRequestDtoValue("pending");
    public static final HrisCreateTimeOffRequestDtoValue UNMAPPED_VALUE = new HrisCreateTimeOffRequestDtoValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisCreateTimeOffRequestDtoValue> values = createValuesMap();
    private static final Map<String, HrisCreateTimeOffRequestDtoValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisCreateTimeOffRequestDtoValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisCreateTimeOffRequestDtoValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisCreateTimeOffRequestDtoValue
     */ 
    public static HrisCreateTimeOffRequestDtoValue of(String value) {
        synchronized (HrisCreateTimeOffRequestDtoValue.class) {
            return values.computeIfAbsent(value, v -> new HrisCreateTimeOffRequestDtoValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisCreateTimeOffRequestDtoValueEnum> asEnum() {
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
        HrisCreateTimeOffRequestDtoValue other = (HrisCreateTimeOffRequestDtoValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisCreateTimeOffRequestDtoValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisCreateTimeOffRequestDtoValue[] values() {
        synchronized (HrisCreateTimeOffRequestDtoValue.class) {
            return values.values().toArray(new HrisCreateTimeOffRequestDtoValue[] {});
        }
    }

    private static final Map<String, HrisCreateTimeOffRequestDtoValue> createValuesMap() {
        Map<String, HrisCreateTimeOffRequestDtoValue> map = new LinkedHashMap<>();
        map.put("approved", APPROVED);
        map.put("cancelled", CANCELLED);
        map.put("rejected", REJECTED);
        map.put("pending", PENDING);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, HrisCreateTimeOffRequestDtoValueEnum> createEnumsMap() {
        Map<String, HrisCreateTimeOffRequestDtoValueEnum> map = new HashMap<>();
        map.put("approved", HrisCreateTimeOffRequestDtoValueEnum.APPROVED);
        map.put("cancelled", HrisCreateTimeOffRequestDtoValueEnum.CANCELLED);
        map.put("rejected", HrisCreateTimeOffRequestDtoValueEnum.REJECTED);
        map.put("pending", HrisCreateTimeOffRequestDtoValueEnum.PENDING);
        map.put("unmapped_value", HrisCreateTimeOffRequestDtoValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisCreateTimeOffRequestDtoValue> {

        protected _Serializer() {
            super(HrisCreateTimeOffRequestDtoValue.class);
        }

        @Override
        public void serialize(HrisCreateTimeOffRequestDtoValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisCreateTimeOffRequestDtoValue> {

        protected _Deserializer() {
            super(HrisCreateTimeOffRequestDtoValue.class);
        }

        @Override
        public HrisCreateTimeOffRequestDtoValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisCreateTimeOffRequestDtoValue.of(v);
        }
    }
    
    public enum HrisCreateTimeOffRequestDtoValueEnum {

        APPROVED("approved"),
        CANCELLED("cancelled"),
        REJECTED("rejected"),
        PENDING("pending"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private HrisCreateTimeOffRequestDtoValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
