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
@JsonDeserialize(using = LinkedAccountMetaCategory._Deserializer.class)
@JsonSerialize(using = LinkedAccountMetaCategory._Serializer.class)
public class LinkedAccountMetaCategory {

    public static final LinkedAccountMetaCategory ATS = new LinkedAccountMetaCategory("ats");
    public static final LinkedAccountMetaCategory HRIS = new LinkedAccountMetaCategory("hris");
    public static final LinkedAccountMetaCategory HRIS_LEGACY = new LinkedAccountMetaCategory("hris-legacy");
    public static final LinkedAccountMetaCategory CRM = new LinkedAccountMetaCategory("crm");
    public static final LinkedAccountMetaCategory IAM = new LinkedAccountMetaCategory("iam");
    public static final LinkedAccountMetaCategory MARKETING = new LinkedAccountMetaCategory("marketing");
    public static final LinkedAccountMetaCategory LMS = new LinkedAccountMetaCategory("lms");
    public static final LinkedAccountMetaCategory STACKONE = new LinkedAccountMetaCategory("stackone");
    public static final LinkedAccountMetaCategory DOCUMENTS = new LinkedAccountMetaCategory("documents");
    public static final LinkedAccountMetaCategory TICKETING = new LinkedAccountMetaCategory("ticketing");
    public static final LinkedAccountMetaCategory SCREENING = new LinkedAccountMetaCategory("screening");
    public static final LinkedAccountMetaCategory MESSAGING = new LinkedAccountMetaCategory("messaging");
    public static final LinkedAccountMetaCategory ACCOUNTING = new LinkedAccountMetaCategory("accounting");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, LinkedAccountMetaCategory> values = createValuesMap();
    private static final Map<String, LinkedAccountMetaCategoryEnum> enums = createEnumsMap();

    private final String value;

    private LinkedAccountMetaCategory(String value) {
        this.value = value;
    }

    /**
     * Returns a LinkedAccountMetaCategory with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as LinkedAccountMetaCategory
     */ 
    public static LinkedAccountMetaCategory of(String value) {
        synchronized (LinkedAccountMetaCategory.class) {
            return values.computeIfAbsent(value, v -> new LinkedAccountMetaCategory(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<LinkedAccountMetaCategoryEnum> asEnum() {
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
        LinkedAccountMetaCategory other = (LinkedAccountMetaCategory) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "LinkedAccountMetaCategory [value=" + value + "]";
    }

    // return an array just like an enum
    public static LinkedAccountMetaCategory[] values() {
        synchronized (LinkedAccountMetaCategory.class) {
            return values.values().toArray(new LinkedAccountMetaCategory[] {});
        }
    }

    private static final Map<String, LinkedAccountMetaCategory> createValuesMap() {
        Map<String, LinkedAccountMetaCategory> map = new LinkedHashMap<>();
        map.put("ats", ATS);
        map.put("hris", HRIS);
        map.put("hris-legacy", HRIS_LEGACY);
        map.put("crm", CRM);
        map.put("iam", IAM);
        map.put("marketing", MARKETING);
        map.put("lms", LMS);
        map.put("stackone", STACKONE);
        map.put("documents", DOCUMENTS);
        map.put("ticketing", TICKETING);
        map.put("screening", SCREENING);
        map.put("messaging", MESSAGING);
        map.put("accounting", ACCOUNTING);
        return map;
    }

    private static final Map<String, LinkedAccountMetaCategoryEnum> createEnumsMap() {
        Map<String, LinkedAccountMetaCategoryEnum> map = new HashMap<>();
        map.put("ats", LinkedAccountMetaCategoryEnum.ATS);
        map.put("hris", LinkedAccountMetaCategoryEnum.HRIS);
        map.put("hris-legacy", LinkedAccountMetaCategoryEnum.HRIS_LEGACY);
        map.put("crm", LinkedAccountMetaCategoryEnum.CRM);
        map.put("iam", LinkedAccountMetaCategoryEnum.IAM);
        map.put("marketing", LinkedAccountMetaCategoryEnum.MARKETING);
        map.put("lms", LinkedAccountMetaCategoryEnum.LMS);
        map.put("stackone", LinkedAccountMetaCategoryEnum.STACKONE);
        map.put("documents", LinkedAccountMetaCategoryEnum.DOCUMENTS);
        map.put("ticketing", LinkedAccountMetaCategoryEnum.TICKETING);
        map.put("screening", LinkedAccountMetaCategoryEnum.SCREENING);
        map.put("messaging", LinkedAccountMetaCategoryEnum.MESSAGING);
        map.put("accounting", LinkedAccountMetaCategoryEnum.ACCOUNTING);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<LinkedAccountMetaCategory> {

        protected _Serializer() {
            super(LinkedAccountMetaCategory.class);
        }

        @Override
        public void serialize(LinkedAccountMetaCategory value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<LinkedAccountMetaCategory> {

        protected _Deserializer() {
            super(LinkedAccountMetaCategory.class);
        }

        @Override
        public LinkedAccountMetaCategory deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return LinkedAccountMetaCategory.of(v);
        }
    }
    
    public enum LinkedAccountMetaCategoryEnum {

        ATS("ats"),
        HRIS("hris"),
        HRIS_LEGACY("hris-legacy"),
        CRM("crm"),
        IAM("iam"),
        MARKETING("marketing"),
        LMS("lms"),
        STACKONE("stackone"),
        DOCUMENTS("documents"),
        TICKETING("ticketing"),
        SCREENING("screening"),
        MESSAGING("messaging"),
        ACCOUNTING("accounting"),;

        private final String value;

        private LinkedAccountMetaCategoryEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

