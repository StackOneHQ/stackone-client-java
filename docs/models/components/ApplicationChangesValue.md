# ApplicationChangesValue

The type of change that occurred to the application

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.ApplicationChangesValue;

ApplicationChangesValue value = ApplicationChangesValue.APPLICATION_STATUS;

// Open enum: use .of() to create instances from custom string values
ApplicationChangesValue custom = ApplicationChangesValue.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `APPLICATION_STATUS` | application_status   |
| `INTERVIEW_STAGE`    | interview_stage      |
| `REJECTED_REASONS`   | rejected_reasons     |
| `UNMAPPED_VALUE`     | unmapped_value       |