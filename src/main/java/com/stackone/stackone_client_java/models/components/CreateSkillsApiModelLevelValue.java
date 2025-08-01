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
@JsonDeserialize(using = CreateSkillsApiModelLevelValue._Deserializer.class)
@JsonSerialize(using = CreateSkillsApiModelLevelValue._Serializer.class)
public class CreateSkillsApiModelLevelValue {

    public static final CreateSkillsApiModelLevelValue PRIMARY = new CreateSkillsApiModelLevelValue("primary");
    public static final CreateSkillsApiModelLevelValue SECONDARY = new CreateSkillsApiModelLevelValue("secondary");
    public static final CreateSkillsApiModelLevelValue TERTIARY = new CreateSkillsApiModelLevelValue("tertiary");
    public static final CreateSkillsApiModelLevelValue UNMAPPED_VALUE = new CreateSkillsApiModelLevelValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, CreateSkillsApiModelLevelValue> values = createValuesMap();
    private static final Map<String, CreateSkillsApiModelLevelValueEnum> enums = createEnumsMap();

    private final String value;

    private CreateSkillsApiModelLevelValue(String value) {
        this.value = value;
    }

    /**
     * Returns a CreateSkillsApiModelLevelValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as CreateSkillsApiModelLevelValue
     */ 
    public static CreateSkillsApiModelLevelValue of(String value) {
        synchronized (CreateSkillsApiModelLevelValue.class) {
            return values.computeIfAbsent(value, v -> new CreateSkillsApiModelLevelValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<CreateSkillsApiModelLevelValueEnum> asEnum() {
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
        CreateSkillsApiModelLevelValue other = (CreateSkillsApiModelLevelValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "CreateSkillsApiModelLevelValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static CreateSkillsApiModelLevelValue[] values() {
        synchronized (CreateSkillsApiModelLevelValue.class) {
            return values.values().toArray(new CreateSkillsApiModelLevelValue[] {});
        }
    }

    private static final Map<String, CreateSkillsApiModelLevelValue> createValuesMap() {
        Map<String, CreateSkillsApiModelLevelValue> map = new LinkedHashMap<>();
        map.put("primary", PRIMARY);
        map.put("secondary", SECONDARY);
        map.put("tertiary", TERTIARY);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, CreateSkillsApiModelLevelValueEnum> createEnumsMap() {
        Map<String, CreateSkillsApiModelLevelValueEnum> map = new HashMap<>();
        map.put("primary", CreateSkillsApiModelLevelValueEnum.PRIMARY);
        map.put("secondary", CreateSkillsApiModelLevelValueEnum.SECONDARY);
        map.put("tertiary", CreateSkillsApiModelLevelValueEnum.TERTIARY);
        map.put("unmapped_value", CreateSkillsApiModelLevelValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<CreateSkillsApiModelLevelValue> {

        protected _Serializer() {
            super(CreateSkillsApiModelLevelValue.class);
        }

        @Override
        public void serialize(CreateSkillsApiModelLevelValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<CreateSkillsApiModelLevelValue> {

        protected _Deserializer() {
            super(CreateSkillsApiModelLevelValue.class);
        }

        @Override
        public CreateSkillsApiModelLevelValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return CreateSkillsApiModelLevelValue.of(v);
        }
    }
    
    public enum CreateSkillsApiModelLevelValueEnum {

        PRIMARY("primary"),
        SECONDARY("secondary"),
        TERTIARY("tertiary"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private CreateSkillsApiModelLevelValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

