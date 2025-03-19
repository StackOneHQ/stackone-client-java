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
 * HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue - The type of the employment.
 */
@JsonDeserialize(using = HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue._Deserializer.class)
@JsonSerialize(using = HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue._Serializer.class)
public class HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue {

    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue CONTRACTOR = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("contractor");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue INTERN = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("intern");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue PERMANENT = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("permanent");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue APPRENTICE = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("apprentice");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue FREELANCE = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("freelance");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue TERMINATED = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("terminated");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue TEMPORARY = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("temporary");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue SEASONAL = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("seasonal");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue VOLUNTEER = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("volunteer");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue PROBATION = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("probation");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue INTERNAL = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("internal");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue EXTERNAL = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("external");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue EXPATRIATE = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("expatriate");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue EMPLOYER_OF_RECORD = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("employer_of_record");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue CASUAL = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("casual");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue PROGRAMME = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("Programme");
    public static final HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue UNMAPPED_VALUE = new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue> values = createValuesMap();
    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue
     */ 
    public static HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue of(String value) {
        synchronized (HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue.class) {
            return values.computeIfAbsent(value, v -> new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum> asEnum() {
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
        HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue other = (HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue[] values() {
        synchronized (HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue.class) {
            return values.values().toArray(new HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue[] {});
        }
    }

    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue> createValuesMap() {
        Map<String, HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue> map = new LinkedHashMap<>();
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

    private static final Map<String, HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum> createEnumsMap() {
        Map<String, HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum> map = new HashMap<>();
        map.put("contractor", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.CONTRACTOR);
        map.put("intern", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.INTERN);
        map.put("permanent", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.PERMANENT);
        map.put("apprentice", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.APPRENTICE);
        map.put("freelance", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.FREELANCE);
        map.put("terminated", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.TERMINATED);
        map.put("temporary", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.TEMPORARY);
        map.put("seasonal", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.SEASONAL);
        map.put("volunteer", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.VOLUNTEER);
        map.put("probation", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.PROBATION);
        map.put("internal", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.INTERNAL);
        map.put("external", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.EXTERNAL);
        map.put("expatriate", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.EXPATRIATE);
        map.put("employer_of_record", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.EMPLOYER_OF_RECORD);
        map.put("casual", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.CASUAL);
        map.put("Programme", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.PROGRAMME);
        map.put("unmapped_value", HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue> {

        protected _Serializer() {
            super(HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue.class);
        }

        @Override
        public void serialize(HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue> {

        protected _Deserializer() {
            super(HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue.class);
        }

        @Override
        public HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValue.of(v);
        }
    }
    
    public enum HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum {

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

        private HrisUpdateEmployeeRequestDtoEmploymentEmploymentTypeValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
