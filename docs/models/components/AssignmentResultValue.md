# AssignmentResultValue

The StackOne unified result status.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AssignmentResultValue;

AssignmentResultValue value = AssignmentResultValue.PASS;

// Open enum: use .of() to create instances from custom string values
AssignmentResultValue custom = AssignmentResultValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PASS`           | Pass             |
| `FAIL`           | Fail             |
| `UNMAPPED_VALUE` | unmapped_value   |