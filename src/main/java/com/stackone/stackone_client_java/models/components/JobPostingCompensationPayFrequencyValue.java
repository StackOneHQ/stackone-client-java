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
 * JobPostingCompensationPayFrequencyValue - The pay frequency of the job postings.
 */
@JsonDeserialize(using = JobPostingCompensationPayFrequencyValue._Deserializer.class)
@JsonSerialize(using = JobPostingCompensationPayFrequencyValue._Serializer.class)
public class JobPostingCompensationPayFrequencyValue {

    public static final JobPostingCompensationPayFrequencyValue HOURLY = new JobPostingCompensationPayFrequencyValue("hourly");
    public static final JobPostingCompensationPayFrequencyValue WEEKLY = new JobPostingCompensationPayFrequencyValue("weekly");
    public static final JobPostingCompensationPayFrequencyValue BI_WEEKLY = new JobPostingCompensationPayFrequencyValue("bi_weekly");
    public static final JobPostingCompensationPayFrequencyValue FOUR_WEEKLY = new JobPostingCompensationPayFrequencyValue("four_weekly");
    public static final JobPostingCompensationPayFrequencyValue SEMI_MONTHLY = new JobPostingCompensationPayFrequencyValue("semi_monthly");
    public static final JobPostingCompensationPayFrequencyValue MONTHLY = new JobPostingCompensationPayFrequencyValue("monthly");
    public static final JobPostingCompensationPayFrequencyValue BI_MONTHLY = new JobPostingCompensationPayFrequencyValue("bi_monthly");
    public static final JobPostingCompensationPayFrequencyValue QUARTERLY = new JobPostingCompensationPayFrequencyValue("quarterly");
    public static final JobPostingCompensationPayFrequencyValue SEMI_ANNUALLY = new JobPostingCompensationPayFrequencyValue("semi_annually");
    public static final JobPostingCompensationPayFrequencyValue YEARLY = new JobPostingCompensationPayFrequencyValue("yearly");
    public static final JobPostingCompensationPayFrequencyValue THIRTEEN_MONTHLY = new JobPostingCompensationPayFrequencyValue("thirteen_monthly");
    public static final JobPostingCompensationPayFrequencyValue PRO_RATA = new JobPostingCompensationPayFrequencyValue("pro_rata");
    public static final JobPostingCompensationPayFrequencyValue UNMAPPED_VALUE = new JobPostingCompensationPayFrequencyValue("unmapped_value");
    public static final JobPostingCompensationPayFrequencyValue HALF_YEARLY = new JobPostingCompensationPayFrequencyValue("half_yearly");
    public static final JobPostingCompensationPayFrequencyValue DAILY = new JobPostingCompensationPayFrequencyValue("daily");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, JobPostingCompensationPayFrequencyValue> values = createValuesMap();
    private static final Map<String, JobPostingCompensationPayFrequencyValueEnum> enums = createEnumsMap();

    private final String value;

    private JobPostingCompensationPayFrequencyValue(String value) {
        this.value = value;
    }

    /**
     * Returns a JobPostingCompensationPayFrequencyValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as JobPostingCompensationPayFrequencyValue
     */ 
    public static JobPostingCompensationPayFrequencyValue of(String value) {
        synchronized (JobPostingCompensationPayFrequencyValue.class) {
            return values.computeIfAbsent(value, v -> new JobPostingCompensationPayFrequencyValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<JobPostingCompensationPayFrequencyValueEnum> asEnum() {
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
        JobPostingCompensationPayFrequencyValue other = (JobPostingCompensationPayFrequencyValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "JobPostingCompensationPayFrequencyValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static JobPostingCompensationPayFrequencyValue[] values() {
        synchronized (JobPostingCompensationPayFrequencyValue.class) {
            return values.values().toArray(new JobPostingCompensationPayFrequencyValue[] {});
        }
    }

    private static final Map<String, JobPostingCompensationPayFrequencyValue> createValuesMap() {
        Map<String, JobPostingCompensationPayFrequencyValue> map = new LinkedHashMap<>();
        map.put("hourly", HOURLY);
        map.put("weekly", WEEKLY);
        map.put("bi_weekly", BI_WEEKLY);
        map.put("four_weekly", FOUR_WEEKLY);
        map.put("semi_monthly", SEMI_MONTHLY);
        map.put("monthly", MONTHLY);
        map.put("bi_monthly", BI_MONTHLY);
        map.put("quarterly", QUARTERLY);
        map.put("semi_annually", SEMI_ANNUALLY);
        map.put("yearly", YEARLY);
        map.put("thirteen_monthly", THIRTEEN_MONTHLY);
        map.put("pro_rata", PRO_RATA);
        map.put("unmapped_value", UNMAPPED_VALUE);
        map.put("half_yearly", HALF_YEARLY);
        map.put("daily", DAILY);
        return map;
    }

    private static final Map<String, JobPostingCompensationPayFrequencyValueEnum> createEnumsMap() {
        Map<String, JobPostingCompensationPayFrequencyValueEnum> map = new HashMap<>();
        map.put("hourly", JobPostingCompensationPayFrequencyValueEnum.HOURLY);
        map.put("weekly", JobPostingCompensationPayFrequencyValueEnum.WEEKLY);
        map.put("bi_weekly", JobPostingCompensationPayFrequencyValueEnum.BI_WEEKLY);
        map.put("four_weekly", JobPostingCompensationPayFrequencyValueEnum.FOUR_WEEKLY);
        map.put("semi_monthly", JobPostingCompensationPayFrequencyValueEnum.SEMI_MONTHLY);
        map.put("monthly", JobPostingCompensationPayFrequencyValueEnum.MONTHLY);
        map.put("bi_monthly", JobPostingCompensationPayFrequencyValueEnum.BI_MONTHLY);
        map.put("quarterly", JobPostingCompensationPayFrequencyValueEnum.QUARTERLY);
        map.put("semi_annually", JobPostingCompensationPayFrequencyValueEnum.SEMI_ANNUALLY);
        map.put("yearly", JobPostingCompensationPayFrequencyValueEnum.YEARLY);
        map.put("thirteen_monthly", JobPostingCompensationPayFrequencyValueEnum.THIRTEEN_MONTHLY);
        map.put("pro_rata", JobPostingCompensationPayFrequencyValueEnum.PRO_RATA);
        map.put("unmapped_value", JobPostingCompensationPayFrequencyValueEnum.UNMAPPED_VALUE);
        map.put("half_yearly", JobPostingCompensationPayFrequencyValueEnum.HALF_YEARLY);
        map.put("daily", JobPostingCompensationPayFrequencyValueEnum.DAILY);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<JobPostingCompensationPayFrequencyValue> {

        protected _Serializer() {
            super(JobPostingCompensationPayFrequencyValue.class);
        }

        @Override
        public void serialize(JobPostingCompensationPayFrequencyValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<JobPostingCompensationPayFrequencyValue> {

        protected _Deserializer() {
            super(JobPostingCompensationPayFrequencyValue.class);
        }

        @Override
        public JobPostingCompensationPayFrequencyValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return JobPostingCompensationPayFrequencyValue.of(v);
        }
    }
    
    public enum JobPostingCompensationPayFrequencyValueEnum {

        HOURLY("hourly"),
        WEEKLY("weekly"),
        BI_WEEKLY("bi_weekly"),
        FOUR_WEEKLY("four_weekly"),
        SEMI_MONTHLY("semi_monthly"),
        MONTHLY("monthly"),
        BI_MONTHLY("bi_monthly"),
        QUARTERLY("quarterly"),
        SEMI_ANNUALLY("semi_annually"),
        YEARLY("yearly"),
        THIRTEEN_MONTHLY("thirteen_monthly"),
        PRO_RATA("pro_rata"),
        UNMAPPED_VALUE("unmapped_value"),
        HALF_YEARLY("half_yearly"),
        DAILY("daily"),;

        private final String value;

        private JobPostingCompensationPayFrequencyValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
