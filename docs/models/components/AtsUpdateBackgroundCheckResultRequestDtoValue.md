# AtsUpdateBackgroundCheckResultRequestDtoValue

The result of the test.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AtsUpdateBackgroundCheckResultRequestDtoValue;

AtsUpdateBackgroundCheckResultRequestDtoValue value = AtsUpdateBackgroundCheckResultRequestDtoValue.INITIATED;

// Open enum: use .of() to create instances from custom string values
AtsUpdateBackgroundCheckResultRequestDtoValue custom = AtsUpdateBackgroundCheckResultRequestDtoValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `INITIATED`      | initiated        |
| `IN_PROGRESS`    | in_progress      |
| `CANCELLED`      | cancelled        |
| `COMPLETED`      | completed        |
| `EXPIRED`        | expired          |
| `FAILED`         | failed           |
| `PASSED`         | passed           |
| `UNMAPPED_VALUE` | unmapped_value   |