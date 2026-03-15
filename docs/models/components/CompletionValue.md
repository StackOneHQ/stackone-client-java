# CompletionValue

The StackOne unified result status.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.CompletionValue;

CompletionValue value = CompletionValue.PASS;

// Open enum: use .of() to create instances from custom string values
CompletionValue custom = CompletionValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PASS`           | Pass             |
| `FAIL`           | Fail             |
| `UNMAPPED_VALUE` | unmapped_value   |