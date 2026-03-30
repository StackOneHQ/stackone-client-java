# ContentValue

The StackOne unified content type.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.ContentValue;

ContentValue value = ContentValue.VIDEO;

// Open enum: use .of() to create instances from custom string values
ContentValue custom = ContentValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `VIDEO`          | video            |
| `QUIZ`           | quiz             |
| `DOCUMENT`       | document         |
| `AUDIO`          | audio            |
| `ARTICLE`        | article          |
| `UNMAPPED_VALUE` | unmapped_value   |