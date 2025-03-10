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
 * EmployeeEmploymentTypeValue - The type of the employment.
 */
@JsonDeserialize(using = EmployeeEmploymentTypeValue._Deserializer.class)
@JsonSerialize(using = EmployeeEmploymentTypeValue._Serializer.class)
public class EmployeeEmploymentTypeValue {

    public static final EmployeeEmploymentTypeValue CONTRACTOR = new EmployeeEmploymentTypeValue("contractor");
    public static final EmployeeEmploymentTypeValue INTERN = new EmployeeEmploymentTypeValue("intern");
    public static final EmployeeEmploymentTypeValue PERMANENT = new EmployeeEmploymentTypeValue("permanent");
    public static final EmployeeEmploymentTypeValue APPRENTICE = new EmployeeEmploymentTypeValue("apprentice");
    public static final EmployeeEmploymentTypeValue FREELANCE = new EmployeeEmploymentTypeValue("freelance");
    public static final EmployeeEmploymentTypeValue TERMINATED = new EmployeeEmploymentTypeValue("terminated");
    public static final EmployeeEmploymentTypeValue TEMPORARY = new EmployeeEmploymentTypeValue("temporary");
    public static final EmployeeEmploymentTypeValue SEASONAL = new EmployeeEmploymentTypeValue("seasonal");
    public static final EmployeeEmploymentTypeValue VOLUNTEER = new EmployeeEmploymentTypeValue("volunteer");
    public static final EmployeeEmploymentTypeValue PROBATION = new EmployeeEmploymentTypeValue("probation");
    public static final EmployeeEmploymentTypeValue INTERNAL = new EmployeeEmploymentTypeValue("internal");
    public static final EmployeeEmploymentTypeValue EXTERNAL = new EmployeeEmploymentTypeValue("external");
    public static final EmployeeEmploymentTypeValue EXPATRIATE = new EmployeeEmploymentTypeValue("expatriate");
    public static final EmployeeEmploymentTypeValue EMPLOYER_OF_RECORD = new EmployeeEmploymentTypeValue("employer_of_record");
    public static final EmployeeEmploymentTypeValue CASUAL = new EmployeeEmploymentTypeValue("casual");
    public static final EmployeeEmploymentTypeValue PROGRAMME = new EmployeeEmploymentTypeValue("Programme");
    public static final EmployeeEmploymentTypeValue UNMAPPED_VALUE = new EmployeeEmploymentTypeValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, EmployeeEmploymentTypeValue> values = createValuesMap();
    private static final Map<String, EmployeeEmploymentTypeValueEnum> enums = createEnumsMap();

    private final String value;

    private EmployeeEmploymentTypeValue(String value) {
        this.value = value;
    }

    /**
     * Returns a EmployeeEmploymentTypeValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as EmployeeEmploymentTypeValue
     */ 
    public static EmployeeEmploymentTypeValue of(String value) {
        synchronized (EmployeeEmploymentTypeValue.class) {
            return values.computeIfAbsent(value, v -> new EmployeeEmploymentTypeValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<EmployeeEmploymentTypeValueEnum> asEnum() {
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
        EmployeeEmploymentTypeValue other = (EmployeeEmploymentTypeValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "EmployeeEmploymentTypeValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static EmployeeEmploymentTypeValue[] values() {
        synchronized (EmployeeEmploymentTypeValue.class) {
            return values.values().toArray(new EmployeeEmploymentTypeValue[] {});
        }
    }

    private static final Map<String, EmployeeEmploymentTypeValue> createValuesMap() {
        Map<String, EmployeeEmploymentTypeValue> map = new LinkedHashMap<>();
        map.put("contractor", CONTRACTOR);
        map.put("intern", INTERN);
        map.put("permanent", PERMANENT);
        map.put("apprentice", APPRENTICE);
        map.put("freelance", FREELANCE);
        map.put("terminated", TERMINATED);
        map.put("temporary", TEMPORARY);
        map.put("seasonal", SEASONAL);
        map.put("volunteer", VOLUNTEER);
        map.put("probation", PROBATION);
        map.put("internal", INTERNAL);
        map.put("external", EXTERNAL);
        map.put("expatriate", EXPATRIATE);
        map.put("employer_of_record", EMPLOYER_OF_RECORD);
        map.put("casual", CASUAL);
        map.put("Programme", PROGRAMME);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, EmployeeEmploymentTypeValueEnum> createEnumsMap() {
        Map<String, EmployeeEmploymentTypeValueEnum> map = new HashMap<>();
        map.put("contractor", EmployeeEmploymentTypeValueEnum.CONTRACTOR);
        map.put("intern", EmployeeEmploymentTypeValueEnum.INTERN);
        map.put("permanent", EmployeeEmploymentTypeValueEnum.PERMANENT);
        map.put("apprentice", EmployeeEmploymentTypeValueEnum.APPRENTICE);
        map.put("freelance", EmployeeEmploymentTypeValueEnum.FREELANCE);
        map.put("terminated", EmployeeEmploymentTypeValueEnum.TERMINATED);
        map.put("temporary", EmployeeEmploymentTypeValueEnum.TEMPORARY);
        map.put("seasonal", EmployeeEmploymentTypeValueEnum.SEASONAL);
        map.put("volunteer", EmployeeEmploymentTypeValueEnum.VOLUNTEER);
        map.put("probation", EmployeeEmploymentTypeValueEnum.PROBATION);
        map.put("internal", EmployeeEmploymentTypeValueEnum.INTERNAL);
        map.put("external", EmployeeEmploymentTypeValueEnum.EXTERNAL);
        map.put("expatriate", EmployeeEmploymentTypeValueEnum.EXPATRIATE);
        map.put("employer_of_record", EmployeeEmploymentTypeValueEnum.EMPLOYER_OF_RECORD);
        map.put("casual", EmployeeEmploymentTypeValueEnum.CASUAL);
        map.put("Programme", EmployeeEmploymentTypeValueEnum.PROGRAMME);
        map.put("unmapped_value", EmployeeEmploymentTypeValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<EmployeeEmploymentTypeValue> {

        protected _Serializer() {
            super(EmployeeEmploymentTypeValue.class);
        }

        @Override
        public void serialize(EmployeeEmploymentTypeValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<EmployeeEmploymentTypeValue> {

        protected _Deserializer() {
            super(EmployeeEmploymentTypeValue.class);
        }

        @Override
        public EmployeeEmploymentTypeValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return EmployeeEmploymentTypeValue.of(v);
        }
    }
    
    public enum EmployeeEmploymentTypeValueEnum {

        CONTRACTOR("contractor"),
        INTERN("intern"),
        PERMANENT("permanent"),
        APPRENTICE("apprentice"),
        FREELANCE("freelance"),
        TERMINATED("terminated"),
        TEMPORARY("temporary"),
        SEASONAL("seasonal"),
        VOLUNTEER("volunteer"),
        PROBATION("probation"),
        INTERNAL("internal"),
        EXTERNAL("external"),
        EXPATRIATE("expatriate"),
        EMPLOYER_OF_RECORD("employer_of_record"),
        CASUAL("casual"),
        PROGRAMME("Programme"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private EmployeeEmploymentTypeValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
