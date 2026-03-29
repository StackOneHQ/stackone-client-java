# LmsCreateCompletionRequestDtoValue

The StackOne unified result status.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.LmsCreateCompletionRequestDtoValue;

LmsCreateCompletionRequestDtoValue value = LmsCreateCompletionRequestDtoValue.PASS;

// Open enum: use .of() to create instances from custom string values
LmsCreateCompletionRequestDtoValue custom = LmsCreateCompletionRequestDtoValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PASS`           | Pass             |
| `FAIL`           | Fail             |
| `UNMAPPED_VALUE` | unmapped_value   |