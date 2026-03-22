# ScreeningResultStatus

Result status

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.ScreeningResultStatus;

ScreeningResultStatus value = ScreeningResultStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
ScreeningResultStatus custom = ScreeningResultStatus.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PENDING`        | pending          |
| `IN_PROGRESS`    | in_progress      |
| `COMPLETED`      | completed        |
| `FAILED`         | failed           |
| `CANCELLED`      | cancelled        |
| `UNMAPPED_VALUE` | unmapped_value   |