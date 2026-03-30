# ApplicationAttachmentValue

The content type of the attachment.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.ApplicationAttachmentValue;

ApplicationAttachmentValue value = ApplicationAttachmentValue.TEXT;

// Open enum: use .of() to create instances from custom string values
ApplicationAttachmentValue custom = ApplicationAttachmentValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `TEXT`           | text             |
| `PDF`            | pdf              |
| `VIDEO`          | video            |
| `OTHER`          | other            |
| `UNMAPPED_VALUE` | unmapped_value   |