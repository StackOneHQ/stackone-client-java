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
@JsonDeserialize(using = EntitySkillsCreateRequestDtoValue._Deserializer.class)
@JsonSerialize(using = EntitySkillsCreateRequestDtoValue._Serializer.class)
public class EntitySkillsCreateRequestDtoValue {

    public static final EntitySkillsCreateRequestDtoValue ONE = new EntitySkillsCreateRequestDtoValue("1");
    public static final EntitySkillsCreateRequestDtoValue TWO = new EntitySkillsCreateRequestDtoValue("2");
    public static final EntitySkillsCreateRequestDtoValue THREE = new EntitySkillsCreateRequestDtoValue("3");
    public static final EntitySkillsCreateRequestDtoValue FOUR = new EntitySkillsCreateRequestDtoValue("4");
    public static final EntitySkillsCreateRequestDtoValue FIVE = new EntitySkillsCreateRequestDtoValue("5");
    public static final EntitySkillsCreateRequestDtoValue UNMAPPED_VALUE = new EntitySkillsCreateRequestDtoValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, EntitySkillsCreateRequestDtoValue> values = createValuesMap();
    private static final Map<String, EntitySkillsCreateRequestDtoValueEnum> enums = createEnumsMap();

    private final String value;

    private EntitySkillsCreateRequestDtoValue(String value) {
        this.value = value;
    }

    /**
     * Returns a EntitySkillsCreateRequestDtoValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as EntitySkillsCreateRequestDtoValue
     */ 
    public static EntitySkillsCreateRequestDtoValue of(String value) {
        synchronized (EntitySkillsCreateRequestDtoValue.class) {
            return values.computeIfAbsent(value, v -> new EntitySkillsCreateRequestDtoValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<EntitySkillsCreateRequestDtoValueEnum> asEnum() {
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
        EntitySkillsCreateRequestDtoValue other = (EntitySkillsCreateRequestDtoValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "EntitySkillsCreateRequestDtoValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static EntitySkillsCreateRequestDtoValue[] values() {
        synchronized (EntitySkillsCreateRequestDtoValue.class) {
            return values.values().toArray(new EntitySkillsCreateRequestDtoValue[] {});
        }
    }

    private static final Map<String, EntitySkillsCreateRequestDtoValue> createValuesMap() {
        Map<String, EntitySkillsCreateRequestDtoValue> map = new LinkedHashMap<>();
        map.put("1", ONE);
        map.put("2", TWO);
        map.put("3", THREE);
        map.put("4", FOUR);
        map.put("5", FIVE);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, EntitySkillsCreateRequestDtoValueEnum> createEnumsMap() {
        Map<String, EntitySkillsCreateRequestDtoValueEnum> map = new HashMap<>();
        map.put("1", EntitySkillsCreateRequestDtoValueEnum.ONE);
        map.put("2", EntitySkillsCreateRequestDtoValueEnum.TWO);
        map.put("3", EntitySkillsCreateRequestDtoValueEnum.THREE);
        map.put("4", EntitySkillsCreateRequestDtoValueEnum.FOUR);
        map.put("5", EntitySkillsCreateRequestDtoValueEnum.FIVE);
        map.put("unmapped_value", EntitySkillsCreateRequestDtoValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<EntitySkillsCreateRequestDtoValue> {

        protected _Serializer() {
            super(EntitySkillsCreateRequestDtoValue.class);
        }

        @Override
        public void serialize(EntitySkillsCreateRequestDtoValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<EntitySkillsCreateRequestDtoValue> {

        protected _Deserializer() {
            super(EntitySkillsCreateRequestDtoValue.class);
        }

        @Override
        public EntitySkillsCreateRequestDtoValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return EntitySkillsCreateRequestDtoValue.of(v);
        }
    }
    
    public enum EntitySkillsCreateRequestDtoValueEnum {

        ONE("1"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private EntitySkillsCreateRequestDtoValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

