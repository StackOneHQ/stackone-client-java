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
 * InterviewPartValue
 * 
 * <p>The type of the interview.
 */
@JsonDeserialize(using = InterviewPartValue._Deserializer.class)
@JsonSerialize(using = InterviewPartValue._Serializer.class)
public class InterviewPartValue {

    public static final InterviewPartValue SCREENING = new InterviewPartValue("screening");
    public static final InterviewPartValue LUNCH = new InterviewPartValue("lunch");
    public static final InterviewPartValue ON_SITE = new InterviewPartValue("on_site");
    public static final InterviewPartValue PRESENTATION = new InterviewPartValue("presentation");
    public static final InterviewPartValue SELL = new InterviewPartValue("sell");
    public static final InterviewPartValue CULTURE = new InterviewPartValue("culture");
    public static final InterviewPartValue INFORMAL = new InterviewPartValue("informal");
    public static final InterviewPartValue TEST = new InterviewPartValue("test");
    public static final InterviewPartValue PHONE = new InterviewPartValue("phone");
    public static final InterviewPartValue VIDEO = new InterviewPartValue("video");
    public static final InterviewPartValue UNMAPPED_VALUE = new InterviewPartValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, InterviewPartValue> values = createValuesMap();
    private static final Map<String, InterviewPartValueEnum> enums = createEnumsMap();

    private final String value;

    private InterviewPartValue(String value) {
        this.value = value;
    }

    /**
     * Returns a InterviewPartValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as InterviewPartValue
     */ 
    public static InterviewPartValue of(String value) {
        synchronized (InterviewPartValue.class) {
            return values.computeIfAbsent(value, v -> new InterviewPartValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<InterviewPartValueEnum> asEnum() {
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
        InterviewPartValue other = (InterviewPartValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "InterviewPartValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static InterviewPartValue[] values() {
        synchronized (InterviewPartValue.class) {
            return values.values().toArray(new InterviewPartValue[] {});
        }
    }

    private static final Map<String, InterviewPartValue> createValuesMap() {
        Map<String, InterviewPartValue> map = new LinkedHashMap<>();
        map.put("screening", SCREENING);
        map.put("lunch", LUNCH);
        map.put("on_site", ON_SITE);
        map.put("presentation", PRESENTATION);
        map.put("sell", SELL);
        map.put("culture", CULTURE);
        map.put("informal", INFORMAL);
        map.put("test", TEST);
        map.put("phone", PHONE);
        map.put("video", VIDEO);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, InterviewPartValueEnum> createEnumsMap() {
        Map<String, InterviewPartValueEnum> map = new HashMap<>();
        map.put("screening", InterviewPartValueEnum.SCREENING);
        map.put("lunch", InterviewPartValueEnum.LUNCH);
        map.put("on_site", InterviewPartValueEnum.ON_SITE);
        map.put("presentation", InterviewPartValueEnum.PRESENTATION);
        map.put("sell", InterviewPartValueEnum.SELL);
        map.put("culture", InterviewPartValueEnum.CULTURE);
        map.put("informal", InterviewPartValueEnum.INFORMAL);
        map.put("test", InterviewPartValueEnum.TEST);
        map.put("phone", InterviewPartValueEnum.PHONE);
        map.put("video", InterviewPartValueEnum.VIDEO);
        map.put("unmapped_value", InterviewPartValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<InterviewPartValue> {

        protected _Serializer() {
            super(InterviewPartValue.class);
        }

        @Override
        public void serialize(InterviewPartValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<InterviewPartValue> {

        protected _Deserializer() {
            super(InterviewPartValue.class);
        }

        @Override
        public InterviewPartValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return InterviewPartValue.of(v);
        }
    }
    
    public enum InterviewPartValueEnum {

        SCREENING("screening"),
        LUNCH("lunch"),
        ON_SITE("on_site"),
        PRESENTATION("presentation"),
        SELL("sell"),
        CULTURE("culture"),
        INFORMAL("informal"),
        TEST("test"),
        PHONE("phone"),
        VIDEO("video"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private InterviewPartValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

