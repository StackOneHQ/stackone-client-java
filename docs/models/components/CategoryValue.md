# CategoryValue

The unified category level. For write operations: provide one of the listed enum values, or omit/set to "unmapped_value" to use source_value instead.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.CategoryValue;

CategoryValue value = CategoryValue.PRIMARY;

// Open enum: use .of() to create instances from custom string values
CategoryValue custom = CategoryValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PRIMARY`        | primary          |
| `SECONDARY`      | secondary        |
| `TERTIARY`       | tertiary         |
| `UNMAPPED_VALUE` | unmapped_value   |