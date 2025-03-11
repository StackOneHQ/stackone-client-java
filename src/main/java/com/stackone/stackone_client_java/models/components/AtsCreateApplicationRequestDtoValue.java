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
 * AtsCreateApplicationRequestDtoValue - The status of the application.
 */
@JsonDeserialize(using = AtsCreateApplicationRequestDtoValue._Deserializer.class)
@JsonSerialize(using = AtsCreateApplicationRequestDtoValue._Serializer.class)
public class AtsCreateApplicationRequestDtoValue {

    public static final AtsCreateApplicationRequestDtoValue ACTIVE = new AtsCreateApplicationRequestDtoValue("active");
    public static final AtsCreateApplicationRequestDtoValue ASSESSMENT = new AtsCreateApplicationRequestDtoValue("assessment");
    public static final AtsCreateApplicationRequestDtoValue BACKGROUND_CHECK = new AtsCreateApplicationRequestDtoValue("background_check");
    public static final AtsCreateApplicationRequestDtoValue CONVERTED = new AtsCreateApplicationRequestDtoValue("converted");
    public static final AtsCreateApplicationRequestDtoValue DECLINED_BY_CANDIDATE = new AtsCreateApplicationRequestDtoValue("declined_by_candidate");
    public static final AtsCreateApplicationRequestDtoValue HIRED = new AtsCreateApplicationRequestDtoValue("hired");
    public static final AtsCreateApplicationRequestDtoValue INTERVIEW = new AtsCreateApplicationRequestDtoValue("interview");
    public static final AtsCreateApplicationRequestDtoValue LEAD = new AtsCreateApplicationRequestDtoValue("lead");
    public static final AtsCreateApplicationRequestDtoValue OFFER = new AtsCreateApplicationRequestDtoValue("offer");
    public static final AtsCreateApplicationRequestDtoValue REFERENCE_CHECK = new AtsCreateApplicationRequestDtoValue("reference_check");
    public static final AtsCreateApplicationRequestDtoValue REJECTED = new AtsCreateApplicationRequestDtoValue("rejected");
    public static final AtsCreateApplicationRequestDtoValue REVIEW = new AtsCreateApplicationRequestDtoValue("review");
    public static final AtsCreateApplicationRequestDtoValue SCREEN = new AtsCreateApplicationRequestDtoValue("screen");
    public static final AtsCreateApplicationRequestDtoValue NEW = new AtsCreateApplicationRequestDtoValue("new");
    public static final AtsCreateApplicationRequestDtoValue ONBOARDING = new AtsCreateApplicationRequestDtoValue("onboarding");
    public static final AtsCreateApplicationRequestDtoValue CREATED = new AtsCreateApplicationRequestDtoValue("created");
    public static final AtsCreateApplicationRequestDtoValue ACCEPTED = new AtsCreateApplicationRequestDtoValue("accepted");
    public static final AtsCreateApplicationRequestDtoValue SHORT_LIST = new AtsCreateApplicationRequestDtoValue("short_list");
    public static final AtsCreateApplicationRequestDtoValue APPROVED = new AtsCreateApplicationRequestDtoValue("approved");
    public static final AtsCreateApplicationRequestDtoValue UNMAPPED_VALUE = new AtsCreateApplicationRequestDtoValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, AtsCreateApplicationRequestDtoValue> values = createValuesMap();
    private static final Map<String, AtsCreateApplicationRequestDtoValueEnum> enums = createEnumsMap();

    private final String value;

    private AtsCreateApplicationRequestDtoValue(String value) {
        this.value = value;
    }

    /**
     * Returns a AtsCreateApplicationRequestDtoValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as AtsCreateApplicationRequestDtoValue
     */ 
    public static AtsCreateApplicationRequestDtoValue of(String value) {
        synchronized (AtsCreateApplicationRequestDtoValue.class) {
            return values.computeIfAbsent(value, v -> new AtsCreateApplicationRequestDtoValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<AtsCreateApplicationRequestDtoValueEnum> asEnum() {
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
        AtsCreateApplicationRequestDtoValue other = (AtsCreateApplicationRequestDtoValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "AtsCreateApplicationRequestDtoValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static AtsCreateApplicationRequestDtoValue[] values() {
        synchronized (AtsCreateApplicationRequestDtoValue.class) {
            return values.values().toArray(new AtsCreateApplicationRequestDtoValue[] {});
        }
    }

    private static final Map<String, AtsCreateApplicationRequestDtoValue> createValuesMap() {
        Map<String, AtsCreateApplicationRequestDtoValue> map = new LinkedHashMap<>();
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

    private static final Map<String, AtsCreateApplicationRequestDtoValueEnum> createEnumsMap() {
        Map<String, AtsCreateApplicationRequestDtoValueEnum> map = new HashMap<>();
        map.put("active", AtsCreateApplicationRequestDtoValueEnum.ACTIVE);
        map.put("assessment", AtsCreateApplicationRequestDtoValueEnum.ASSESSMENT);
        map.put("background_check", AtsCreateApplicationRequestDtoValueEnum.BACKGROUND_CHECK);
        map.put("converted", AtsCreateApplicationRequestDtoValueEnum.CONVERTED);
        map.put("declined_by_candidate", AtsCreateApplicationRequestDtoValueEnum.DECLINED_BY_CANDIDATE);
        map.put("hired", AtsCreateApplicationRequestDtoValueEnum.HIRED);
        map.put("interview", AtsCreateApplicationRequestDtoValueEnum.INTERVIEW);
        map.put("lead", AtsCreateApplicationRequestDtoValueEnum.LEAD);
        map.put("offer", AtsCreateApplicationRequestDtoValueEnum.OFFER);
        map.put("reference_check", AtsCreateApplicationRequestDtoValueEnum.REFERENCE_CHECK);
        map.put("rejected", AtsCreateApplicationRequestDtoValueEnum.REJECTED);
        map.put("review", AtsCreateApplicationRequestDtoValueEnum.REVIEW);
        map.put("screen", AtsCreateApplicationRequestDtoValueEnum.SCREEN);
        map.put("new", AtsCreateApplicationRequestDtoValueEnum.NEW);
        map.put("onboarding", AtsCreateApplicationRequestDtoValueEnum.ONBOARDING);
        map.put("created", AtsCreateApplicationRequestDtoValueEnum.CREATED);
        map.put("accepted", AtsCreateApplicationRequestDtoValueEnum.ACCEPTED);
        map.put("short_list", AtsCreateApplicationRequestDtoValueEnum.SHORT_LIST);
        map.put("approved", AtsCreateApplicationRequestDtoValueEnum.APPROVED);
        map.put("unmapped_value", AtsCreateApplicationRequestDtoValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<AtsCreateApplicationRequestDtoValue> {

        protected _Serializer() {
            super(AtsCreateApplicationRequestDtoValue.class);
        }

        @Override
        public void serialize(AtsCreateApplicationRequestDtoValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<AtsCreateApplicationRequestDtoValue> {

        protected _Deserializer() {
            super(AtsCreateApplicationRequestDtoValue.class);
        }

        @Override
        public AtsCreateApplicationRequestDtoValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return AtsCreateApplicationRequestDtoValue.of(v);
        }
    }
    
    public enum AtsCreateApplicationRequestDtoValueEnum {

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

        private AtsCreateApplicationRequestDtoValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
