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
 * ContentBlockValue - The type of the content blocks.
 */
@JsonDeserialize(using = ContentBlockValue._Deserializer.class)
@JsonSerialize(using = ContentBlockValue._Serializer.class)
public class ContentBlockValue {

    public static final ContentBlockValue TEXT = new ContentBlockValue("text");
    public static final ContentBlockValue HTML = new ContentBlockValue("html");
    public static final ContentBlockValue IMAGE = new ContentBlockValue("image");
    public static final ContentBlockValue CODE_SNIPPET = new ContentBlockValue("code-snippet");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, ContentBlockValue> values = createValuesMap();
    private static final Map<String, ContentBlockValueEnum> enums = createEnumsMap();

    private final String value;

    private ContentBlockValue(String value) {
        this.value = value;
    }

    /**
     * Returns a ContentBlockValue with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as ContentBlockValue
     */ 
    public static ContentBlockValue of(String value) {
        synchronized (ContentBlockValue.class) {
            return values.computeIfAbsent(value, v -> new ContentBlockValue(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<ContentBlockValueEnum> asEnum() {
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
        ContentBlockValue other = (ContentBlockValue) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "ContentBlockValue [value=" + value + "]";
    }

    // return an array just like an enum
    public static ContentBlockValue[] values() {
        synchronized (ContentBlockValue.class) {
            return values.values().toArray(new ContentBlockValue[] {});
        }
    }

    private static final Map<String, ContentBlockValue> createValuesMap() {
        Map<String, ContentBlockValue> map = new LinkedHashMap<>();
        map.put("text", TEXT);
        map.put("html", HTML);
        map.put("image", IMAGE);
        map.put("code-snippet", CODE_SNIPPET);
        return map;
    }

    private static final Map<String, ContentBlockValueEnum> createEnumsMap() {
        Map<String, ContentBlockValueEnum> map = new HashMap<>();
        map.put("text", ContentBlockValueEnum.TEXT);
        map.put("html", ContentBlockValueEnum.HTML);
        map.put("image", ContentBlockValueEnum.IMAGE);
        map.put("code-snippet", ContentBlockValueEnum.CODE_SNIPPET);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<ContentBlockValue> {

        protected _Serializer() {
            super(ContentBlockValue.class);
        }

        @Override
        public void serialize(ContentBlockValue value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<ContentBlockValue> {

        protected _Deserializer() {
            super(ContentBlockValue.class);
        }

        @Override
        public ContentBlockValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return ContentBlockValue.of(v);
        }
    }
    
    public enum ContentBlockValueEnum {

        TEXT("text"),
        HTML("html"),
        IMAGE("image"),
        CODE_SNIPPET("code-snippet"),;

        private final String value;

        private ContentBlockValueEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
