# UpdateTaskRequestDtoValue

The unified value for the status of the task. If the provider does not specify this status, the value will be set to UnmappedValue

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.UpdateTaskRequestDtoValue;

UpdateTaskRequestDtoValue value = UpdateTaskRequestDtoValue.OPEN;

// Open enum: use .of() to create instances from custom string values
UpdateTaskRequestDtoValue custom = UpdateTaskRequestDtoValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `OPEN`           | open             |
| `IN_PROGRESS`    | in_progress      |
| `BLOCKED`        | blocked          |
| `COMPLETED`      | completed        |
| `CANCELLED`      | cancelled        |
| `UNMAPPED_VALUE` | unmapped_value   |