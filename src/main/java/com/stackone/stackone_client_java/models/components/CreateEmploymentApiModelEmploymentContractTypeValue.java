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
@JsonDeserialize(using = CreateEmploymentApiModelEmploymentContractTypeValue._Deserializer.class)
@JsonSerialize(using = CreateEmploymentApiModelEmploymentContractTypeValue._Serializer.class)
public class CreateEmploymentApiModelEmploymentContractTypeValue {

    public static final CreateEmploymentApiModelEmploymentContractTypeValue FULL_TIME = new CreateEmploymentApiModelEmploymentContractTypeValue("full_time");
    public static final CreateEmploymentApiModelEmploymentContractTypeValue SHIFTS = new CreateEmploymentApiModelEmploymentContractTypeValue("shifts");
    public static final CreateEmploymentApiModelEmploymentContractTypeValue PART_TIME = new CreateEmploymentApiModelEmploymentContractTypeValue("part_time");
    public static final CreateEmploymentApiModelEmploymentContractTypeValue UNMAPPED_VALUE = new CreateEmploymentApiModelEmploymentContractTypeValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, CreateEmploymentApiModelEmploymentContractTypeValue> values = createValuesMap();
    private static final Map<String, CreateEmploymentApiModelEmploymentContractTypeValueEnum> enums = createEnumsMap();

    private final String value;

    private CreateEmploymentApiModelEmploymentContractTypeValue(String value) {
        this.value = value;
    }

    /**
     * Returns a CreateEmploymentApiModelEmploymentContractTypeValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as CreateEmploymentApiModelEmploymentContractTypeValue
     */ 
    public static CreateEmploymentApiModelEmploymentContractTypeValue of(String value) {
        synchronized (CreateEmploymentApiModelEmploymentContractTypeValue.class) {
            return values.computeIfAbsent(value, v -> new CreateEmploymentApiModelEmploymentContractTypeValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<CreateEmploymentApiModelEmploymentContractTypeValueEnum> asEnum() {
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
        CreateEmploymentApiModelEmploymentContractTypeValue other = (CreateEmploymentApiModelEmploymentContractTypeValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "CreateEmploymentApiModelEmploymentContractTypeValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static CreateEmploymentApiModelEmploymentContractTypeValue[] values() {
        synchronized (CreateEmploymentApiModelEmploymentContractTypeValue.class) {
            return values.values().toArray(new CreateEmploymentApiModelEmploymentContractTypeValue[] {});
        }
    }

    private static final Map<String, CreateEmploymentApiModelEmploymentContractTypeValue> createValuesMap() {
        Map<String, CreateEmploymentApiModelEmploymentContractTypeValue> map = new LinkedHashMap<>();
        map.put("full_time", FULL_TIME);
        map.put("shifts", SHIFTS);
        map.put("part_time", PART_TIME);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, CreateEmploymentApiModelEmploymentContractTypeValueEnum> createEnumsMap() {
        Map<String, CreateEmploymentApiModelEmploymentContractTypeValueEnum> map = new HashMap<>();
        map.put("full_time", CreateEmploymentApiModelEmploymentContractTypeValueEnum.FULL_TIME);
        map.put("shifts", CreateEmploymentApiModelEmploymentContractTypeValueEnum.SHIFTS);
        map.put("part_time", CreateEmploymentApiModelEmploymentContractTypeValueEnum.PART_TIME);
        map.put("unmapped_value", CreateEmploymentApiModelEmploymentContractTypeValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<CreateEmploymentApiModelEmploymentContractTypeValue> {

        protected _Serializer() {
            super(CreateEmploymentApiModelEmploymentContractTypeValue.class);
        }

        @Override
        public void serialize(CreateEmploymentApiModelEmploymentContractTypeValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<CreateEmploymentApiModelEmploymentContractTypeValue> {

        protected _Deserializer() {
            super(CreateEmploymentApiModelEmploymentContractTypeValue.class);
        }

        @Override
        public CreateEmploymentApiModelEmploymentContractTypeValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return CreateEmploymentApiModelEmploymentContractTypeValue.of(v);
        }
    }
    
    public enum CreateEmploymentApiModelEmploymentContractTypeValueEnum {

        FULL_TIME("full_time"),
        SHIFTS("shifts"),
        PART_TIME("part_time"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private CreateEmploymentApiModelEmploymentContractTypeValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
