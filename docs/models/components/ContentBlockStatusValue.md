# ContentBlockStatusValue

The Status of the content blocks.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.ContentBlockStatusValue;

ContentBlockStatusValue value = ContentBlockStatusValue.DRAFT;

// Open enum: use .of() to create instances from custom string values
ContentBlockStatusValue custom = ContentBlockStatusValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `LIVE`           | live             |
| `ARCHIVED`       | archived         |
| `UNMAPPED_VALUE` | unmapped_value   |