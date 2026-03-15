# TaskValue

The unified value for the type of the task. If the provider does not specify this type, the value will be set to UnmappedValue

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.TaskValue;

TaskValue value = TaskValue.ACTION;

// Open enum: use .of() to create instances from custom string values
TaskValue custom = TaskValue.of("custom_value");
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