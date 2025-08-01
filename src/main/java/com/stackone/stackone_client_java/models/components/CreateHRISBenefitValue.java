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
 * CreateHRISBenefitValue
 * 
 * <p>The type of the benefit
 */
@JsonDeserialize(using = CreateHRISBenefitValue._Deserializer.class)
@JsonSerialize(using = CreateHRISBenefitValue._Serializer.class)
public class CreateHRISBenefitValue {

    public static final CreateHRISBenefitValue RETIREMENT_SAVINGS = new CreateHRISBenefitValue("retirement_savings");
    public static final CreateHRISBenefitValue HEALTH_SAVINGS = new CreateHRISBenefitValue("health_savings");
    public static final CreateHRISBenefitValue OTHER = new CreateHRISBenefitValue("other");
    public static final CreateHRISBenefitValue HEALTH_INSURANCE = new CreateHRISBenefitValue("health_insurance");
    public static final CreateHRISBenefitValue INSURANCE = new CreateHRISBenefitValue("insurance");
    public static final CreateHRISBenefitValue UNMAPPED_VALUE = new CreateHRISBenefitValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, CreateHRISBenefitValue> values = createValuesMap();
    private static final Map<String, CreateHRISBenefitValueEnum> enums = createEnumsMap();

    private final String value;

    private CreateHRISBenefitValue(String value) {
        this.value = value;
    }

    /**
     * Returns a CreateHRISBenefitValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as CreateHRISBenefitValue
     */ 
    public static CreateHRISBenefitValue of(String value) {
        synchronized (CreateHRISBenefitValue.class) {
            return values.computeIfAbsent(value, v -> new CreateHRISBenefitValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<CreateHRISBenefitValueEnum> asEnum() {
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
        CreateHRISBenefitValue other = (CreateHRISBenefitValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "CreateHRISBenefitValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static CreateHRISBenefitValue[] values() {
        synchronized (CreateHRISBenefitValue.class) {
            return values.values().toArray(new CreateHRISBenefitValue[] {});
        }
    }

    private static final Map<String, CreateHRISBenefitValue> createValuesMap() {
        Map<String, CreateHRISBenefitValue> map = new LinkedHashMap<>();
        map.put("retirement_savings", RETIREMENT_SAVINGS);
        map.put("health_savings", HEALTH_SAVINGS);
        map.put("other", OTHER);
        map.put("health_insurance", HEALTH_INSURANCE);
        map.put("insurance", INSURANCE);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, CreateHRISBenefitValueEnum> createEnumsMap() {
        Map<String, CreateHRISBenefitValueEnum> map = new HashMap<>();
        map.put("retirement_savings", CreateHRISBenefitValueEnum.RETIREMENT_SAVINGS);
        map.put("health_savings", CreateHRISBenefitValueEnum.HEALTH_SAVINGS);
        map.put("other", CreateHRISBenefitValueEnum.OTHER);
        map.put("health_insurance", CreateHRISBenefitValueEnum.HEALTH_INSURANCE);
        map.put("insurance", CreateHRISBenefitValueEnum.INSURANCE);
        map.put("unmapped_value", CreateHRISBenefitValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<CreateHRISBenefitValue> {

        protected _Serializer() {
            super(CreateHRISBenefitValue.class);
        }

        @Override
        public void serialize(CreateHRISBenefitValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<CreateHRISBenefitValue> {

        protected _Deserializer() {
            super(CreateHRISBenefitValue.class);
        }

        @Override
        public CreateHRISBenefitValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return CreateHRISBenefitValue.of(v);
        }
    }
    
    public enum CreateHRISBenefitValueEnum {

        RETIREMENT_SAVINGS("retirement_savings"),
        HEALTH_SAVINGS("health_savings"),
        OTHER("other"),
        HEALTH_INSURANCE("health_insurance"),
        INSURANCE("insurance"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private CreateHRISBenefitValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

