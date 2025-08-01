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
 * JobPostingEmploymentTypeValue
 * 
 * <p>The type of the employment.
 */
@JsonDeserialize(using = JobPostingEmploymentTypeValue._Deserializer.class)
@JsonSerialize(using = JobPostingEmploymentTypeValue._Serializer.class)
public class JobPostingEmploymentTypeValue {

    public static final JobPostingEmploymentTypeValue CONTRACTOR = new JobPostingEmploymentTypeValue("contractor");
    public static final JobPostingEmploymentTypeValue INTERN = new JobPostingEmploymentTypeValue("intern");
    public static final JobPostingEmploymentTypeValue PERMANENT = new JobPostingEmploymentTypeValue("permanent");
    public static final JobPostingEmploymentTypeValue APPRENTICE = new JobPostingEmploymentTypeValue("apprentice");
    public static final JobPostingEmploymentTypeValue FREELANCE = new JobPostingEmploymentTypeValue("freelance");
    public static final JobPostingEmploymentTypeValue TERMINATED = new JobPostingEmploymentTypeValue("terminated");
    public static final JobPostingEmploymentTypeValue TEMPORARY = new JobPostingEmploymentTypeValue("temporary");
    public static final JobPostingEmploymentTypeValue SEASONAL = new JobPostingEmploymentTypeValue("seasonal");
    public static final JobPostingEmploymentTypeValue VOLUNTEER = new JobPostingEmploymentTypeValue("volunteer");
    public static final JobPostingEmploymentTypeValue PROBATION = new JobPostingEmploymentTypeValue("probation");
    public static final JobPostingEmploymentTypeValue INTERNAL = new JobPostingEmploymentTypeValue("internal");
    public static final JobPostingEmploymentTypeValue EXTERNAL = new JobPostingEmploymentTypeValue("external");
    public static final JobPostingEmploymentTypeValue EXPATRIATE = new JobPostingEmploymentTypeValue("expatriate");
    public static final JobPostingEmploymentTypeValue EMPLOYER_OF_RECORD = new JobPostingEmploymentTypeValue("employer_of_record");
    public static final JobPostingEmploymentTypeValue CASUAL = new JobPostingEmploymentTypeValue("casual");
    public static final JobPostingEmploymentTypeValue PROGRAMME = new JobPostingEmploymentTypeValue("Programme");
    public static final JobPostingEmploymentTypeValue UNMAPPED_VALUE = new JobPostingEmploymentTypeValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, JobPostingEmploymentTypeValue> values = createValuesMap();
    private static final Map<String, JobPostingEmploymentTypeValueEnum> enums = createEnumsMap();

    private final String value;

    private JobPostingEmploymentTypeValue(String value) {
        this.value = value;
    }

    /**
     * Returns a JobPostingEmploymentTypeValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as JobPostingEmploymentTypeValue
     */ 
    public static JobPostingEmploymentTypeValue of(String value) {
        synchronized (JobPostingEmploymentTypeValue.class) {
            return values.computeIfAbsent(value, v -> new JobPostingEmploymentTypeValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<JobPostingEmploymentTypeValueEnum> asEnum() {
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
        JobPostingEmploymentTypeValue other = (JobPostingEmploymentTypeValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "JobPostingEmploymentTypeValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static JobPostingEmploymentTypeValue[] values() {
        synchronized (JobPostingEmploymentTypeValue.class) {
            return values.values().toArray(new JobPostingEmploymentTypeValue[] {});
        }
    }

    private static final Map<String, JobPostingEmploymentTypeValue> createValuesMap() {
        Map<String, JobPostingEmploymentTypeValue> map = new LinkedHashMap<>();
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

    private static final Map<String, JobPostingEmploymentTypeValueEnum> createEnumsMap() {
        Map<String, JobPostingEmploymentTypeValueEnum> map = new HashMap<>();
        map.put("contractor", JobPostingEmploymentTypeValueEnum.CONTRACTOR);
        map.put("intern", JobPostingEmploymentTypeValueEnum.INTERN);
        map.put("permanent", JobPostingEmploymentTypeValueEnum.PERMANENT);
        map.put("apprentice", JobPostingEmploymentTypeValueEnum.APPRENTICE);
        map.put("freelance", JobPostingEmploymentTypeValueEnum.FREELANCE);
        map.put("terminated", JobPostingEmploymentTypeValueEnum.TERMINATED);
        map.put("temporary", JobPostingEmploymentTypeValueEnum.TEMPORARY);
        map.put("seasonal", JobPostingEmploymentTypeValueEnum.SEASONAL);
        map.put("volunteer", JobPostingEmploymentTypeValueEnum.VOLUNTEER);
        map.put("probation", JobPostingEmploymentTypeValueEnum.PROBATION);
        map.put("internal", JobPostingEmploymentTypeValueEnum.INTERNAL);
        map.put("external", JobPostingEmploymentTypeValueEnum.EXTERNAL);
        map.put("expatriate", JobPostingEmploymentTypeValueEnum.EXPATRIATE);
        map.put("employer_of_record", JobPostingEmploymentTypeValueEnum.EMPLOYER_OF_RECORD);
        map.put("casual", JobPostingEmploymentTypeValueEnum.CASUAL);
        map.put("Programme", JobPostingEmploymentTypeValueEnum.PROGRAMME);
        map.put("unmapped_value", JobPostingEmploymentTypeValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<JobPostingEmploymentTypeValue> {

        protected _Serializer() {
            super(JobPostingEmploymentTypeValue.class);
        }

        @Override
        public void serialize(JobPostingEmploymentTypeValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<JobPostingEmploymentTypeValue> {

        protected _Deserializer() {
            super(JobPostingEmploymentTypeValue.class);
        }

        @Override
        public JobPostingEmploymentTypeValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return JobPostingEmploymentTypeValue.of(v);
        }
    }
    
    public enum JobPostingEmploymentTypeValueEnum {

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

        private JobPostingEmploymentTypeValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

