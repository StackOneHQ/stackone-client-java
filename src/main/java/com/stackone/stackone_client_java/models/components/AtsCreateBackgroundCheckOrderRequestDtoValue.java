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
 * AtsCreateBackgroundCheckOrderRequestDtoValue - The status of the application.
 */
@JsonDeserialize(using = AtsCreateBackgroundCheckOrderRequestDtoValue._Deserializer.class)
@JsonSerialize(using = AtsCreateBackgroundCheckOrderRequestDtoValue._Serializer.class)
public class AtsCreateBackgroundCheckOrderRequestDtoValue {

    public static final AtsCreateBackgroundCheckOrderRequestDtoValue ACTIVE = new AtsCreateBackgroundCheckOrderRequestDtoValue("active");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue ASSESSMENT = new AtsCreateBackgroundCheckOrderRequestDtoValue("assessment");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue BACKGROUND_CHECK = new AtsCreateBackgroundCheckOrderRequestDtoValue("background_check");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue CONVERTED = new AtsCreateBackgroundCheckOrderRequestDtoValue("converted");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue DECLINED_BY_CANDIDATE = new AtsCreateBackgroundCheckOrderRequestDtoValue("declined_by_candidate");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue HIRED = new AtsCreateBackgroundCheckOrderRequestDtoValue("hired");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue INTERVIEW = new AtsCreateBackgroundCheckOrderRequestDtoValue("interview");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue LEAD = new AtsCreateBackgroundCheckOrderRequestDtoValue("lead");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue OFFER = new AtsCreateBackgroundCheckOrderRequestDtoValue("offer");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue REFERENCE_CHECK = new AtsCreateBackgroundCheckOrderRequestDtoValue("reference_check");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue REJECTED = new AtsCreateBackgroundCheckOrderRequestDtoValue("rejected");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue REVIEW = new AtsCreateBackgroundCheckOrderRequestDtoValue("review");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue SCREEN = new AtsCreateBackgroundCheckOrderRequestDtoValue("screen");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue NEW = new AtsCreateBackgroundCheckOrderRequestDtoValue("new");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue ONBOARDING = new AtsCreateBackgroundCheckOrderRequestDtoValue("onboarding");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue CREATED = new AtsCreateBackgroundCheckOrderRequestDtoValue("created");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue ACCEPTED = new AtsCreateBackgroundCheckOrderRequestDtoValue("accepted");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue SHORT_LIST = new AtsCreateBackgroundCheckOrderRequestDtoValue("short_list");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue APPROVED = new AtsCreateBackgroundCheckOrderRequestDtoValue("approved");
    public static final AtsCreateBackgroundCheckOrderRequestDtoValue UNMAPPED_VALUE = new AtsCreateBackgroundCheckOrderRequestDtoValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, AtsCreateBackgroundCheckOrderRequestDtoValue> values = createValuesMap();
    private static final Map<String, AtsCreateBackgroundCheckOrderRequestDtoValueEnum> enums = createEnumsMap();

    private final String value;

    private AtsCreateBackgroundCheckOrderRequestDtoValue(String value) {
        this.value = value;
    }

    /**
     * Returns a AtsCreateBackgroundCheckOrderRequestDtoValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as AtsCreateBackgroundCheckOrderRequestDtoValue
     */ 
    public static AtsCreateBackgroundCheckOrderRequestDtoValue of(String value) {
        synchronized (AtsCreateBackgroundCheckOrderRequestDtoValue.class) {
            return values.computeIfAbsent(value, v -> new AtsCreateBackgroundCheckOrderRequestDtoValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<AtsCreateBackgroundCheckOrderRequestDtoValueEnum> asEnum() {
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
        AtsCreateBackgroundCheckOrderRequestDtoValue other = (AtsCreateBackgroundCheckOrderRequestDtoValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "AtsCreateBackgroundCheckOrderRequestDtoValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static AtsCreateBackgroundCheckOrderRequestDtoValue[] values() {
        synchronized (AtsCreateBackgroundCheckOrderRequestDtoValue.class) {
            return values.values().toArray(new AtsCreateBackgroundCheckOrderRequestDtoValue[] {});
        }
    }

    private static final Map<String, AtsCreateBackgroundCheckOrderRequestDtoValue> createValuesMap() {
        Map<String, AtsCreateBackgroundCheckOrderRequestDtoValue> map = new LinkedHashMap<>();
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

    private static final Map<String, AtsCreateBackgroundCheckOrderRequestDtoValueEnum> createEnumsMap() {
        Map<String, AtsCreateBackgroundCheckOrderRequestDtoValueEnum> map = new HashMap<>();
        map.put("active", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.ACTIVE);
        map.put("assessment", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.ASSESSMENT);
        map.put("background_check", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.BACKGROUND_CHECK);
        map.put("converted", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.CONVERTED);
        map.put("declined_by_candidate", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.DECLINED_BY_CANDIDATE);
        map.put("hired", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.HIRED);
        map.put("interview", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.INTERVIEW);
        map.put("lead", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.LEAD);
        map.put("offer", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.OFFER);
        map.put("reference_check", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.REFERENCE_CHECK);
        map.put("rejected", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.REJECTED);
        map.put("review", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.REVIEW);
        map.put("screen", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.SCREEN);
        map.put("new", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.NEW);
        map.put("onboarding", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.ONBOARDING);
        map.put("created", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.CREATED);
        map.put("accepted", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.ACCEPTED);
        map.put("short_list", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.SHORT_LIST);
        map.put("approved", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.APPROVED);
        map.put("unmapped_value", AtsCreateBackgroundCheckOrderRequestDtoValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<AtsCreateBackgroundCheckOrderRequestDtoValue> {

        protected _Serializer() {
            super(AtsCreateBackgroundCheckOrderRequestDtoValue.class);
        }

        @Override
        public void serialize(AtsCreateBackgroundCheckOrderRequestDtoValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<AtsCreateBackgroundCheckOrderRequestDtoValue> {

        protected _Deserializer() {
            super(AtsCreateBackgroundCheckOrderRequestDtoValue.class);
        }

        @Override
        public AtsCreateBackgroundCheckOrderRequestDtoValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return AtsCreateBackgroundCheckOrderRequestDtoValue.of(v);
        }
    }
    
    public enum AtsCreateBackgroundCheckOrderRequestDtoValueEnum {

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

        private AtsCreateBackgroundCheckOrderRequestDtoValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
