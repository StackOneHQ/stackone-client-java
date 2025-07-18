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
@JsonDeserialize(using = CustomFieldDefinitionValue._Deserializer.class)
@JsonSerialize(using = CustomFieldDefinitionValue._Serializer.class)
public class CustomFieldDefinitionValue {

    public static final CustomFieldDefinitionValue DATE = new CustomFieldDefinitionValue("date");
    public static final CustomFieldDefinitionValue FLOAT = new CustomFieldDefinitionValue("float");
    public static final CustomFieldDefinitionValue INTEGER = new CustomFieldDefinitionValue("integer");
    public static final CustomFieldDefinitionValue LIST = new CustomFieldDefinitionValue("list");
    public static final CustomFieldDefinitionValue CHECKBOX = new CustomFieldDefinitionValue("checkbox");
    public static final CustomFieldDefinitionValue TEXT = new CustomFieldDefinitionValue("text");
    public static final CustomFieldDefinitionValue BOOLEAN = new CustomFieldDefinitionValue("boolean");
    public static final CustomFieldDefinitionValue SINGLE_SELECT = new CustomFieldDefinitionValue("single_select");
    public static final CustomFieldDefinitionValue MULTI_SELECT = new CustomFieldDefinitionValue("multi_select");
    public static final CustomFieldDefinitionValue URL = new CustomFieldDefinitionValue("url");
    public static final CustomFieldDefinitionValue OTHER = new CustomFieldDefinitionValue("other");
    public static final CustomFieldDefinitionValue UNMAPPED_VALUE = new CustomFieldDefinitionValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, CustomFieldDefinitionValue> values = createValuesMap();
    private static final Map<String, CustomFieldDefinitionValueEnum> enums = createEnumsMap();

    private final String value;

    private CustomFieldDefinitionValue(String value) {
        this.value = value;
    }

    /**
     * Returns a CustomFieldDefinitionValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as CustomFieldDefinitionValue
     */ 
    public static CustomFieldDefinitionValue of(String value) {
        synchronized (CustomFieldDefinitionValue.class) {
            return values.computeIfAbsent(value, v -> new CustomFieldDefinitionValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<CustomFieldDefinitionValueEnum> asEnum() {
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
        CustomFieldDefinitionValue other = (CustomFieldDefinitionValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "CustomFieldDefinitionValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static CustomFieldDefinitionValue[] values() {
        synchronized (CustomFieldDefinitionValue.class) {
            return values.values().toArray(new CustomFieldDefinitionValue[] {});
        }
    }

    private static final Map<String, CustomFieldDefinitionValue> createValuesMap() {
        Map<String, CustomFieldDefinitionValue> map = new LinkedHashMap<>();
        map.put("date", DATE);
        map.put("float", FLOAT);
        map.put("integer", INTEGER);
        map.put("list", LIST);
        map.put("checkbox", CHECKBOX);
        map.put("text", TEXT);
        map.put("boolean", BOOLEAN);
        map.put("single_select", SINGLE_SELECT);
        map.put("multi_select", MULTI_SELECT);
        map.put("url", URL);
        map.put("other", OTHER);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, CustomFieldDefinitionValueEnum> createEnumsMap() {
        Map<String, CustomFieldDefinitionValueEnum> map = new HashMap<>();
        map.put("date", CustomFieldDefinitionValueEnum.DATE);
        map.put("float", CustomFieldDefinitionValueEnum.FLOAT);
        map.put("integer", CustomFieldDefinitionValueEnum.INTEGER);
        map.put("list", CustomFieldDefinitionValueEnum.LIST);
        map.put("checkbox", CustomFieldDefinitionValueEnum.CHECKBOX);
        map.put("text", CustomFieldDefinitionValueEnum.TEXT);
        map.put("boolean", CustomFieldDefinitionValueEnum.BOOLEAN);
        map.put("single_select", CustomFieldDefinitionValueEnum.SINGLE_SELECT);
        map.put("multi_select", CustomFieldDefinitionValueEnum.MULTI_SELECT);
        map.put("url", CustomFieldDefinitionValueEnum.URL);
        map.put("other", CustomFieldDefinitionValueEnum.OTHER);
        map.put("unmapped_value", CustomFieldDefinitionValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<CustomFieldDefinitionValue> {

        protected _Serializer() {
            super(CustomFieldDefinitionValue.class);
        }

        @Override
        public void serialize(CustomFieldDefinitionValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<CustomFieldDefinitionValue> {

        protected _Deserializer() {
            super(CustomFieldDefinitionValue.class);
        }

        @Override
        public CustomFieldDefinitionValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return CustomFieldDefinitionValue.of(v);
        }
    }
    
    public enum CustomFieldDefinitionValueEnum {

        DATE("date"),
        FLOAT("float"),
        INTEGER("integer"),
        LIST("list"),
        CHECKBOX("checkbox"),
        TEXT("text"),
        BOOLEAN("boolean"),
        SINGLE_SELECT("single_select"),
        MULTI_SELECT("multi_select"),
        URL("url"),
        OTHER("other"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private CustomFieldDefinitionValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

