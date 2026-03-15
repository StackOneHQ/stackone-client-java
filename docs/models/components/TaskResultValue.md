# TaskResultValue

The unified value for the type of the task. If the provider does not specify this type, the value will be set to UnmappedValue

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.TaskResultValue;

TaskResultValue value = TaskResultValue.ACTION;

// Open enum: use .of() to create instances from custom string values
TaskResultValue custom = TaskResultValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `ACTION`         | action           |
| `REVIEW`         | review           |
| `ACKNOWLEDGMENT` | acknowledgment   |
| `EDIT`           | edit             |
| `APPROVE`        | approve          |
| `UNMAPPED_VALUE` | unmapped_value   |