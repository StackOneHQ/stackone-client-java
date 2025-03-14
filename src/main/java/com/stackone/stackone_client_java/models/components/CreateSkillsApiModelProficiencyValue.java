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
@JsonDeserialize(using = CreateSkillsApiModelProficiencyValue._Deserializer.class)
@JsonSerialize(using = CreateSkillsApiModelProficiencyValue._Serializer.class)
public class CreateSkillsApiModelProficiencyValue {

    public static final CreateSkillsApiModelProficiencyValue ONE = new CreateSkillsApiModelProficiencyValue("1");
    public static final CreateSkillsApiModelProficiencyValue TWO = new CreateSkillsApiModelProficiencyValue("2");
    public static final CreateSkillsApiModelProficiencyValue THREE = new CreateSkillsApiModelProficiencyValue("3");
    public static final CreateSkillsApiModelProficiencyValue FOUR = new CreateSkillsApiModelProficiencyValue("4");
    public static final CreateSkillsApiModelProficiencyValue FIVE = new CreateSkillsApiModelProficiencyValue("5");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, CreateSkillsApiModelProficiencyValue> values = createValuesMap();
    private static final Map<String, CreateSkillsApiModelProficiencyValueEnum> enums = createEnumsMap();

    private final String value;

    private CreateSkillsApiModelProficiencyValue(String value) {
        this.value = value;
    }

    /**
     * Returns a CreateSkillsApiModelProficiencyValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as CreateSkillsApiModelProficiencyValue
     */ 
    public static CreateSkillsApiModelProficiencyValue of(String value) {
        synchronized (CreateSkillsApiModelProficiencyValue.class) {
            return values.computeIfAbsent(value, v -> new CreateSkillsApiModelProficiencyValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<CreateSkillsApiModelProficiencyValueEnum> asEnum() {
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
        CreateSkillsApiModelProficiencyValue other = (CreateSkillsApiModelProficiencyValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "CreateSkillsApiModelProficiencyValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static CreateSkillsApiModelProficiencyValue[] values() {
        synchronized (CreateSkillsApiModelProficiencyValue.class) {
            return values.values().toArray(new CreateSkillsApiModelProficiencyValue[] {});
        }
    }

    private static final Map<String, CreateSkillsApiModelProficiencyValue> createValuesMap() {
        Map<String, CreateSkillsApiModelProficiencyValue> map = new LinkedHashMap<>();
        map.put("1", ONE);
        map.put("2", TWO);
        map.put("3", THREE);
        map.put("4", FOUR);
        map.put("5", FIVE);
        return map;
    }

    private static final Map<String, CreateSkillsApiModelProficiencyValueEnum> createEnumsMap() {
        Map<String, CreateSkillsApiModelProficiencyValueEnum> map = new HashMap<>();
        map.put("1", CreateSkillsApiModelProficiencyValueEnum.ONE);
        map.put("2", CreateSkillsApiModelProficiencyValueEnum.TWO);
        map.put("3", CreateSkillsApiModelProficiencyValueEnum.THREE);
        map.put("4", CreateSkillsApiModelProficiencyValueEnum.FOUR);
        map.put("5", CreateSkillsApiModelProficiencyValueEnum.FIVE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<CreateSkillsApiModelProficiencyValue> {

        protected _Serializer() {
            super(CreateSkillsApiModelProficiencyValue.class);
        }

        @Override
        public void serialize(CreateSkillsApiModelProficiencyValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<CreateSkillsApiModelProficiencyValue> {

        protected _Deserializer() {
            super(CreateSkillsApiModelProficiencyValue.class);
        }

        @Override
        public CreateSkillsApiModelProficiencyValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return CreateSkillsApiModelProficiencyValue.of(v);
        }
    }
    
    public enum CreateSkillsApiModelProficiencyValueEnum {

        ONE("1"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),;

        private final String value;

        private CreateSkillsApiModelProficiencyValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
