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
 * HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue
 * 
 * <p>The type of the employment.
 */
@JsonDeserialize(using = HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue._Deserializer.class)
@JsonSerialize(using = HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue._Serializer.class)
public class HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue {

    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue CONTRACTOR = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("contractor");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue INTERN = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("intern");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue PERMANENT = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("permanent");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue APPRENTICE = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("apprentice");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue FREELANCE = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("freelance");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue TERMINATED = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("terminated");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue TEMPORARY = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("temporary");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue SEASONAL = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("seasonal");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue VOLUNTEER = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("volunteer");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue PROBATION = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("probation");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue INTERNAL = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("internal");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue EXTERNAL = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("external");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue EXPATRIATE = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("expatriate");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue EMPLOYER_OF_RECORD = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("employer_of_record");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue CASUAL = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("casual");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue PROGRAMME = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("Programme");
    public static final HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue UNMAPPED_VALUE = new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue> values = createValuesMap();
    private static final Map<String, HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue
     */ 
    public static HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue of(String value) {
        synchronized (HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue.class) {
            return values.computeIfAbsent(value, v -> new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum> asEnum() {
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
        HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue other = (HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue[] values() {
        synchronized (HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue.class) {
            return values.values().toArray(new HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue[] {});
        }
    }

    private static final Map<String, HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue> createValuesMap() {
        Map<String, HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue> map = new LinkedHashMap<>();
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

    private static final Map<String, HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum> createEnumsMap() {
        Map<String, HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum> map = new HashMap<>();
        map.put("contractor", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.CONTRACTOR);
        map.put("intern", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.INTERN);
        map.put("permanent", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.PERMANENT);
        map.put("apprentice", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.APPRENTICE);
        map.put("freelance", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.FREELANCE);
        map.put("terminated", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.TERMINATED);
        map.put("temporary", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.TEMPORARY);
        map.put("seasonal", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.SEASONAL);
        map.put("volunteer", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.VOLUNTEER);
        map.put("probation", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.PROBATION);
        map.put("internal", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.INTERNAL);
        map.put("external", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.EXTERNAL);
        map.put("expatriate", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.EXPATRIATE);
        map.put("employer_of_record", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.EMPLOYER_OF_RECORD);
        map.put("casual", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.CASUAL);
        map.put("Programme", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.PROGRAMME);
        map.put("unmapped_value", HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue> {

        protected _Serializer() {
            super(HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue.class);
        }

        @Override
        public void serialize(HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue> {

        protected _Deserializer() {
            super(HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue.class);
        }

        @Override
        public HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValue.of(v);
        }
    }
    
    public enum HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum {

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

        private HrisCreateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

