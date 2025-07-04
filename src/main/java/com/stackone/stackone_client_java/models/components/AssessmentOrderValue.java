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
 * AssessmentOrderValue
 * 
 * <p>The status of the application.
 */
@JsonDeserialize(using = AssessmentOrderValue._Deserializer.class)
@JsonSerialize(using = AssessmentOrderValue._Serializer.class)
public class AssessmentOrderValue {

    public static final AssessmentOrderValue ACTIVE = new AssessmentOrderValue("active");
    public static final AssessmentOrderValue ASSESSMENT = new AssessmentOrderValue("assessment");
    public static final AssessmentOrderValue BACKGROUND_CHECK = new AssessmentOrderValue("background_check");
    public static final AssessmentOrderValue CONVERTED = new AssessmentOrderValue("converted");
    public static final AssessmentOrderValue DECLINED_BY_CANDIDATE = new AssessmentOrderValue("declined_by_candidate");
    public static final AssessmentOrderValue HIRED = new AssessmentOrderValue("hired");
    public static final AssessmentOrderValue INTERVIEW = new AssessmentOrderValue("interview");
    public static final AssessmentOrderValue LEAD = new AssessmentOrderValue("lead");
    public static final AssessmentOrderValue OFFER = new AssessmentOrderValue("offer");
    public static final AssessmentOrderValue REFERENCE_CHECK = new AssessmentOrderValue("reference_check");
    public static final AssessmentOrderValue REJECTED = new AssessmentOrderValue("rejected");
    public static final AssessmentOrderValue REVIEW = new AssessmentOrderValue("review");
    public static final AssessmentOrderValue SCREEN = new AssessmentOrderValue("screen");
    public static final AssessmentOrderValue NEW = new AssessmentOrderValue("new");
    public static final AssessmentOrderValue ONBOARDING = new AssessmentOrderValue("onboarding");
    public static final AssessmentOrderValue CREATED = new AssessmentOrderValue("created");
    public static final AssessmentOrderValue ACCEPTED = new AssessmentOrderValue("accepted");
    public static final AssessmentOrderValue SHORT_LIST = new AssessmentOrderValue("short_list");
    public static final AssessmentOrderValue APPROVED = new AssessmentOrderValue("approved");
    public static final AssessmentOrderValue UNMAPPED_VALUE = new AssessmentOrderValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, AssessmentOrderValue> values = createValuesMap();
    private static final Map<String, AssessmentOrderValueEnum> enums = createEnumsMap();

    private final String value;

    private AssessmentOrderValue(String value) {
        this.value = value;
    }

    /**
     * Returns a AssessmentOrderValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as AssessmentOrderValue
     */ 
    public static AssessmentOrderValue of(String value) {
        synchronized (AssessmentOrderValue.class) {
            return values.computeIfAbsent(value, v -> new AssessmentOrderValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<AssessmentOrderValueEnum> asEnum() {
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
        AssessmentOrderValue other = (AssessmentOrderValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "AssessmentOrderValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static AssessmentOrderValue[] values() {
        synchronized (AssessmentOrderValue.class) {
            return values.values().toArray(new AssessmentOrderValue[] {});
        }
    }

    private static final Map<String, AssessmentOrderValue> createValuesMap() {
        Map<String, AssessmentOrderValue> map = new LinkedHashMap<>();
        map.put("active", ACTIVE);
        map.put("assessment", ASSESSMENT);
        map.put("background_check", BACKGROUND_CHECK);
        map.put("converted", CONVERTED);
        map.put("declined_by_candidate", DECLINED_BY_CANDIDATE);
        map.put("hired", HIRED);
        map.put("interview", INTERVIEW);
        map.put("lead", LEAD);
        map.put("offer", OFFER);
        map.put("reference_check", REFERENCE_CHECK);
        map.put("rejected", REJECTED);
        map.put("review", REVIEW);
        map.put("screen", SCREEN);
        map.put("new", NEW);
        map.put("onboarding", ONBOARDING);
        map.put("created", CREATED);
        map.put("accepted", ACCEPTED);
        map.put("short_list", SHORT_LIST);
        map.put("approved", APPROVED);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, AssessmentOrderValueEnum> createEnumsMap() {
        Map<String, AssessmentOrderValueEnum> map = new HashMap<>();
        map.put("active", AssessmentOrderValueEnum.ACTIVE);
        map.put("assessment", AssessmentOrderValueEnum.ASSESSMENT);
        map.put("background_check", AssessmentOrderValueEnum.BACKGROUND_CHECK);
        map.put("converted", AssessmentOrderValueEnum.CONVERTED);
        map.put("declined_by_candidate", AssessmentOrderValueEnum.DECLINED_BY_CANDIDATE);
        map.put("hired", AssessmentOrderValueEnum.HIRED);
        map.put("interview", AssessmentOrderValueEnum.INTERVIEW);
        map.put("lead", AssessmentOrderValueEnum.LEAD);
        map.put("offer", AssessmentOrderValueEnum.OFFER);
        map.put("reference_check", AssessmentOrderValueEnum.REFERENCE_CHECK);
        map.put("rejected", AssessmentOrderValueEnum.REJECTED);
        map.put("review", AssessmentOrderValueEnum.REVIEW);
        map.put("screen", AssessmentOrderValueEnum.SCREEN);
        map.put("new", AssessmentOrderValueEnum.NEW);
        map.put("onboarding", AssessmentOrderValueEnum.ONBOARDING);
        map.put("created", AssessmentOrderValueEnum.CREATED);
        map.put("accepted", AssessmentOrderValueEnum.ACCEPTED);
        map.put("short_list", AssessmentOrderValueEnum.SHORT_LIST);
        map.put("approved", AssessmentOrderValueEnum.APPROVED);
        map.put("unmapped_value", AssessmentOrderValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<AssessmentOrderValue> {

        protected _Serializer() {
            super(AssessmentOrderValue.class);
        }

        @Override
        public void serialize(AssessmentOrderValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<AssessmentOrderValue> {

        protected _Deserializer() {
            super(AssessmentOrderValue.class);
        }

        @Override
        public AssessmentOrderValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return AssessmentOrderValue.of(v);
        }
    }
    
    public enum AssessmentOrderValueEnum {

        ACTIVE("active"),
        ASSESSMENT("assessment"),
        BACKGROUND_CHECK("background_check"),
        CONVERTED("converted"),
        DECLINED_BY_CANDIDATE("declined_by_candidate"),
        HIRED("hired"),
        INTERVIEW("interview"),
        LEAD("lead"),
        OFFER("offer"),
        REFERENCE_CHECK("reference_check"),
        REJECTED("rejected"),
        REVIEW("review"),
        SCREEN("screen"),
        NEW("new"),
        ONBOARDING("onboarding"),
        CREATED("created"),
        ACCEPTED("accepted"),
        SHORT_LIST("short_list"),
        APPROVED("approved"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private AssessmentOrderValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

