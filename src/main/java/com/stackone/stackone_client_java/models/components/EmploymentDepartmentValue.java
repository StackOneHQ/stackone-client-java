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
@JsonDeserialize(using = EmploymentDepartmentValue._Deserializer.class)
@JsonSerialize(using = EmploymentDepartmentValue._Serializer.class)
public class EmploymentDepartmentValue {

    public static final EmploymentDepartmentValue WORKSPACE = new EmploymentDepartmentValue("workspace");
    public static final EmploymentDepartmentValue TEAM = new EmploymentDepartmentValue("team");
    public static final EmploymentDepartmentValue DEPARTMENT = new EmploymentDepartmentValue("department");
    public static final EmploymentDepartmentValue GROUP = new EmploymentDepartmentValue("group");
    public static final EmploymentDepartmentValue ORGANIZATION = new EmploymentDepartmentValue("organization");
    public static final EmploymentDepartmentValue UNMAPPED_VALUE = new EmploymentDepartmentValue("unmapped_value");
    public static final EmploymentDepartmentValue COST_CENTER = new EmploymentDepartmentValue("cost_center");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, EmploymentDepartmentValue> values = createValuesMap();
    private static final Map<String, EmploymentDepartmentValueEnum> enums = createEnumsMap();

    private final String value;

    private EmploymentDepartmentValue(String value) {
        this.value = value;
    }

    /**
     * Returns a EmploymentDepartmentValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as EmploymentDepartmentValue
     */ 
    public static EmploymentDepartmentValue of(String value) {
        synchronized (EmploymentDepartmentValue.class) {
            return values.computeIfAbsent(value, v -> new EmploymentDepartmentValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<EmploymentDepartmentValueEnum> asEnum() {
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
        EmploymentDepartmentValue other = (EmploymentDepartmentValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "EmploymentDepartmentValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static EmploymentDepartmentValue[] values() {
        synchronized (EmploymentDepartmentValue.class) {
            return values.values().toArray(new EmploymentDepartmentValue[] {});
        }
    }

    private static final Map<String, EmploymentDepartmentValue> createValuesMap() {
        Map<String, EmploymentDepartmentValue> map = new LinkedHashMap<>();
        map.put("workspace", WORKSPACE);
        map.put("team", TEAM);
        map.put("department", DEPARTMENT);
        map.put("group", GROUP);
        map.put("organization", ORGANIZATION);
        map.put("unmapped_value", UNMAPPED_VALUE);
        map.put("cost_center", COST_CENTER);
        return map;
    }

    private static final Map<String, EmploymentDepartmentValueEnum> createEnumsMap() {
        Map<String, EmploymentDepartmentValueEnum> map = new HashMap<>();
        map.put("workspace", EmploymentDepartmentValueEnum.WORKSPACE);
        map.put("team", EmploymentDepartmentValueEnum.TEAM);
        map.put("department", EmploymentDepartmentValueEnum.DEPARTMENT);
        map.put("group", EmploymentDepartmentValueEnum.GROUP);
        map.put("organization", EmploymentDepartmentValueEnum.ORGANIZATION);
        map.put("unmapped_value", EmploymentDepartmentValueEnum.UNMAPPED_VALUE);
        map.put("cost_center", EmploymentDepartmentValueEnum.COST_CENTER);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<EmploymentDepartmentValue> {

        protected _Serializer() {
            super(EmploymentDepartmentValue.class);
        }

        @Override
        public void serialize(EmploymentDepartmentValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<EmploymentDepartmentValue> {

        protected _Deserializer() {
            super(EmploymentDepartmentValue.class);
        }

        @Override
        public EmploymentDepartmentValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return EmploymentDepartmentValue.of(v);
        }
    }
    
    public enum EmploymentDepartmentValueEnum {

        WORKSPACE("workspace"),
        TEAM("team"),
        DEPARTMENT("department"),
        GROUP("group"),
        ORGANIZATION("organization"),
        UNMAPPED_VALUE("unmapped_value"),
        COST_CENTER("cost_center"),;

        private final String value;

        private EmploymentDepartmentValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
