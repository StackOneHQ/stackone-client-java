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
 * SmsMessagesValue
 * 
 * <p>The unified message type.
 */
@JsonDeserialize(using = SmsMessagesValue._Deserializer.class)
@JsonSerialize(using = SmsMessagesValue._Serializer.class)
public class SmsMessagesValue {

    public static final SmsMessagesValue EMAIL = new SmsMessagesValue("email");
    public static final SmsMessagesValue SMS = new SmsMessagesValue("sms");
    public static final SmsMessagesValue PUSH = new SmsMessagesValue("push");
    public static final SmsMessagesValue WEB_PUSH = new SmsMessagesValue("web_push");
    public static final SmsMessagesValue IOS_PUSH = new SmsMessagesValue("ios_push");
    public static final SmsMessagesValue ANDROID_PUSH = new SmsMessagesValue("android_push");
    public static final SmsMessagesValue APP_PUSH = new SmsMessagesValue("app_push");
    public static final SmsMessagesValue OMNI_CHANNEL = new SmsMessagesValue("omni_channel");
    public static final SmsMessagesValue CONTENT_BLOCK = new SmsMessagesValue("content_block");
    public static final SmsMessagesValue IN_APP = new SmsMessagesValue("in_app");
    public static final SmsMessagesValue UNKNOWN = new SmsMessagesValue("unknown");
    public static final SmsMessagesValue UNMAPPED_VALUE = new SmsMessagesValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, SmsMessagesValue> values = createValuesMap();
    private static final Map<String, SmsMessagesValueEnum> enums = createEnumsMap();

    private final String value;

    private SmsMessagesValue(String value) {
        this.value = value;
    }

    /**
     * Returns a SmsMessagesValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as SmsMessagesValue
     */ 
    public static SmsMessagesValue of(String value) {
        synchronized (SmsMessagesValue.class) {
            return values.computeIfAbsent(value, v -> new SmsMessagesValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<SmsMessagesValueEnum> asEnum() {
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
        SmsMessagesValue other = (SmsMessagesValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "SmsMessagesValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static SmsMessagesValue[] values() {
        synchronized (SmsMessagesValue.class) {
            return values.values().toArray(new SmsMessagesValue[] {});
        }
    }

    private static final Map<String, SmsMessagesValue> createValuesMap() {
        Map<String, SmsMessagesValue> map = new LinkedHashMap<>();
        map.put("email", EMAIL);
        map.put("sms", SMS);
        map.put("push", PUSH);
        map.put("web_push", WEB_PUSH);
        map.put("ios_push", IOS_PUSH);
        map.put("android_push", ANDROID_PUSH);
        map.put("app_push", APP_PUSH);
        map.put("omni_channel", OMNI_CHANNEL);
        map.put("content_block", CONTENT_BLOCK);
        map.put("in_app", IN_APP);
        map.put("unknown", UNKNOWN);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, SmsMessagesValueEnum> createEnumsMap() {
        Map<String, SmsMessagesValueEnum> map = new HashMap<>();
        map.put("email", SmsMessagesValueEnum.EMAIL);
        map.put("sms", SmsMessagesValueEnum.SMS);
        map.put("push", SmsMessagesValueEnum.PUSH);
        map.put("web_push", SmsMessagesValueEnum.WEB_PUSH);
        map.put("ios_push", SmsMessagesValueEnum.IOS_PUSH);
        map.put("android_push", SmsMessagesValueEnum.ANDROID_PUSH);
        map.put("app_push", SmsMessagesValueEnum.APP_PUSH);
        map.put("omni_channel", SmsMessagesValueEnum.OMNI_CHANNEL);
        map.put("content_block", SmsMessagesValueEnum.CONTENT_BLOCK);
        map.put("in_app", SmsMessagesValueEnum.IN_APP);
        map.put("unknown", SmsMessagesValueEnum.UNKNOWN);
        map.put("unmapped_value", SmsMessagesValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<SmsMessagesValue> {

        protected _Serializer() {
            super(SmsMessagesValue.class);
        }

        @Override
        public void serialize(SmsMessagesValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<SmsMessagesValue> {

        protected _Deserializer() {
            super(SmsMessagesValue.class);
        }

        @Override
        public SmsMessagesValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return SmsMessagesValue.of(v);
        }
    }
    
    public enum SmsMessagesValueEnum {

        EMAIL("email"),
        SMS("sms"),
        PUSH("push"),
        WEB_PUSH("web_push"),
        IOS_PUSH("ios_push"),
        ANDROID_PUSH("android_push"),
        APP_PUSH("app_push"),
        OMNI_CHANNEL("omni_channel"),
        CONTENT_BLOCK("content_block"),
        IN_APP("in_app"),
        UNKNOWN("unknown"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private SmsMessagesValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

