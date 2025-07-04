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
 * HrisDocumentApiModelValue
 * 
 * <p>The category of the file
 */
@JsonDeserialize(using = HrisDocumentApiModelValue._Deserializer.class)
@JsonSerialize(using = HrisDocumentApiModelValue._Serializer.class)
public class HrisDocumentApiModelValue {

    public static final HrisDocumentApiModelValue APPLICATION = new HrisDocumentApiModelValue("application");
    public static final HrisDocumentApiModelValue ACADEMIC = new HrisDocumentApiModelValue("academic");
    public static final HrisDocumentApiModelValue CONTRACT = new HrisDocumentApiModelValue("contract");
    public static final HrisDocumentApiModelValue CERTIFICATES = new HrisDocumentApiModelValue("certificates");
    public static final HrisDocumentApiModelValue VISA = new HrisDocumentApiModelValue("visa");
    public static final HrisDocumentApiModelValue PASSPORT = new HrisDocumentApiModelValue("passport");
    public static final HrisDocumentApiModelValue DRIVER_LICENSE = new HrisDocumentApiModelValue("driver_license");
    public static final HrisDocumentApiModelValue PAYSLIP = new HrisDocumentApiModelValue("payslip");
    public static final HrisDocumentApiModelValue PAYROLL = new HrisDocumentApiModelValue("payroll");
    public static final HrisDocumentApiModelValue APPRAISAL = new HrisDocumentApiModelValue("appraisal");
    public static final HrisDocumentApiModelValue RESUME = new HrisDocumentApiModelValue("resume");
    public static final HrisDocumentApiModelValue POLICY = new HrisDocumentApiModelValue("policy");
    public static final HrisDocumentApiModelValue COVER_LETTER = new HrisDocumentApiModelValue("cover_letter");
    public static final HrisDocumentApiModelValue OFFER_LETTER = new HrisDocumentApiModelValue("offer_letter");
    public static final HrisDocumentApiModelValue POLICY_AGREEMENT = new HrisDocumentApiModelValue("policy_agreement");
    public static final HrisDocumentApiModelValue HOME_ADDRESS = new HrisDocumentApiModelValue("home_address");
    public static final HrisDocumentApiModelValue NATIONAL_ID = new HrisDocumentApiModelValue("national_id");
    public static final HrisDocumentApiModelValue CONFIDENTIAL = new HrisDocumentApiModelValue("confidential");
    public static final HrisDocumentApiModelValue SIGNED = new HrisDocumentApiModelValue("signed");
    public static final HrisDocumentApiModelValue SHARED = new HrisDocumentApiModelValue("shared");
    public static final HrisDocumentApiModelValue OTHER = new HrisDocumentApiModelValue("other");
    public static final HrisDocumentApiModelValue BENEFIT = new HrisDocumentApiModelValue("benefit");
    public static final HrisDocumentApiModelValue ID_VERIFICATION = new HrisDocumentApiModelValue("id_verification");
    public static final HrisDocumentApiModelValue BACKGROUND_CHECK = new HrisDocumentApiModelValue("background_check");
    public static final HrisDocumentApiModelValue UNMAPPED_VALUE = new HrisDocumentApiModelValue("unmapped_value");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisDocumentApiModelValue> values = createValuesMap();
    private static final Map<String, HrisDocumentApiModelValueEnum> enums = createEnumsMap();

    private final String value;

    private HrisDocumentApiModelValue(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisDocumentApiModelValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisDocumentApiModelValue
     */ 
    public static HrisDocumentApiModelValue of(String value) {
        synchronized (HrisDocumentApiModelValue.class) {
            return values.computeIfAbsent(value, v -> new HrisDocumentApiModelValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisDocumentApiModelValueEnum> asEnum() {
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
        HrisDocumentApiModelValue other = (HrisDocumentApiModelValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisDocumentApiModelValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisDocumentApiModelValue[] values() {
        synchronized (HrisDocumentApiModelValue.class) {
            return values.values().toArray(new HrisDocumentApiModelValue[] {});
        }
    }

    private static final Map<String, HrisDocumentApiModelValue> createValuesMap() {
        Map<String, HrisDocumentApiModelValue> map = new LinkedHashMap<>();
        map.put("application", APPLICATION);
        map.put("academic", ACADEMIC);
        map.put("contract", CONTRACT);
        map.put("certificates", CERTIFICATES);
        map.put("visa", VISA);
        map.put("passport", PASSPORT);
        map.put("driver_license", DRIVER_LICENSE);
        map.put("payslip", PAYSLIP);
        map.put("payroll", PAYROLL);
        map.put("appraisal", APPRAISAL);
        map.put("resume", RESUME);
        map.put("policy", POLICY);
        map.put("cover_letter", COVER_LETTER);
        map.put("offer_letter", OFFER_LETTER);
        map.put("policy_agreement", POLICY_AGREEMENT);
        map.put("home_address", HOME_ADDRESS);
        map.put("national_id", NATIONAL_ID);
        map.put("confidential", CONFIDENTIAL);
        map.put("signed", SIGNED);
        map.put("shared", SHARED);
        map.put("other", OTHER);
        map.put("benefit", BENEFIT);
        map.put("id_verification", ID_VERIFICATION);
        map.put("background_check", BACKGROUND_CHECK);
        map.put("unmapped_value", UNMAPPED_VALUE);
        return map;
    }

    private static final Map<String, HrisDocumentApiModelValueEnum> createEnumsMap() {
        Map<String, HrisDocumentApiModelValueEnum> map = new HashMap<>();
        map.put("application", HrisDocumentApiModelValueEnum.APPLICATION);
        map.put("academic", HrisDocumentApiModelValueEnum.ACADEMIC);
        map.put("contract", HrisDocumentApiModelValueEnum.CONTRACT);
        map.put("certificates", HrisDocumentApiModelValueEnum.CERTIFICATES);
        map.put("visa", HrisDocumentApiModelValueEnum.VISA);
        map.put("passport", HrisDocumentApiModelValueEnum.PASSPORT);
        map.put("driver_license", HrisDocumentApiModelValueEnum.DRIVER_LICENSE);
        map.put("payslip", HrisDocumentApiModelValueEnum.PAYSLIP);
        map.put("payroll", HrisDocumentApiModelValueEnum.PAYROLL);
        map.put("appraisal", HrisDocumentApiModelValueEnum.APPRAISAL);
        map.put("resume", HrisDocumentApiModelValueEnum.RESUME);
        map.put("policy", HrisDocumentApiModelValueEnum.POLICY);
        map.put("cover_letter", HrisDocumentApiModelValueEnum.COVER_LETTER);
        map.put("offer_letter", HrisDocumentApiModelValueEnum.OFFER_LETTER);
        map.put("policy_agreement", HrisDocumentApiModelValueEnum.POLICY_AGREEMENT);
        map.put("home_address", HrisDocumentApiModelValueEnum.HOME_ADDRESS);
        map.put("national_id", HrisDocumentApiModelValueEnum.NATIONAL_ID);
        map.put("confidential", HrisDocumentApiModelValueEnum.CONFIDENTIAL);
        map.put("signed", HrisDocumentApiModelValueEnum.SIGNED);
        map.put("shared", HrisDocumentApiModelValueEnum.SHARED);
        map.put("other", HrisDocumentApiModelValueEnum.OTHER);
        map.put("benefit", HrisDocumentApiModelValueEnum.BENEFIT);
        map.put("id_verification", HrisDocumentApiModelValueEnum.ID_VERIFICATION);
        map.put("background_check", HrisDocumentApiModelValueEnum.BACKGROUND_CHECK);
        map.put("unmapped_value", HrisDocumentApiModelValueEnum.UNMAPPED_VALUE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisDocumentApiModelValue> {

        protected _Serializer() {
            super(HrisDocumentApiModelValue.class);
        }

        @Override
        public void serialize(HrisDocumentApiModelValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisDocumentApiModelValue> {

        protected _Deserializer() {
            super(HrisDocumentApiModelValue.class);
        }

        @Override
        public HrisDocumentApiModelValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisDocumentApiModelValue.of(v);
        }
    }
    
    public enum HrisDocumentApiModelValueEnum {

        APPLICATION("application"),
        ACADEMIC("academic"),
        CONTRACT("contract"),
        CERTIFICATES("certificates"),
        VISA("visa"),
        PASSPORT("passport"),
        DRIVER_LICENSE("driver_license"),
        PAYSLIP("payslip"),
        PAYROLL("payroll"),
        APPRAISAL("appraisal"),
        RESUME("resume"),
        POLICY("policy"),
        COVER_LETTER("cover_letter"),
        OFFER_LETTER("offer_letter"),
        POLICY_AGREEMENT("policy_agreement"),
        HOME_ADDRESS("home_address"),
        NATIONAL_ID("national_id"),
        CONFIDENTIAL("confidential"),
        SIGNED("signed"),
        SHARED("shared"),
        OTHER("other"),
        BENEFIT("benefit"),
        ID_VERIFICATION("id_verification"),
        BACKGROUND_CHECK("background_check"),
        UNMAPPED_VALUE("unmapped_value"),;

        private final String value;

        private HrisDocumentApiModelValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

