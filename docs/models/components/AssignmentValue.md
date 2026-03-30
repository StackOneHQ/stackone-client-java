# AssignmentValue

The StackOne unified assignment status.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AssignmentValue;

AssignmentValue value = AssignmentValue.PENDING;

// Open enum: use .of() to create instances from custom string values
AssignmentValue custom = AssignmentValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PENDING`        | pending          |
| `IN_PROGRESS`    | in_progress      |
| `COMPLETED`      | completed        |
| `UNMAPPED_VALUE` | unmapped_value   |