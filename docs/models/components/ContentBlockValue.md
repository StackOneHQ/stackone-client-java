# ContentBlockValue

The type of the content blocks.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.ContentBlockValue;

ContentBlockValue value = ContentBlockValue.TEXT;

// Open enum: use .of() to create instances from custom string values
ContentBlockValue custom = ContentBlockValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `TEXT`           | text             |
| `HTML`           | html             |
| `IMAGE`          | image            |
| `CODE_SNIPPET`   | code-snippet     |
| `UNMAPPED_VALUE` | unmapped_value   |