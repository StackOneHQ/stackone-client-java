# ScheduledInterviewValue

The status of the interview.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.ScheduledInterviewValue;

ScheduledInterviewValue value = ScheduledInterviewValue.UNSCHEDULED;

// Open enum: use .of() to create instances from custom string values
ScheduledInterviewValue custom = ScheduledInterviewValue.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `UNSCHEDULED`      | unscheduled        |
| `SCHEDULED`        | scheduled          |
| `COMPLETED`        | completed          |
| `CANCELLED`        | cancelled          |
| `PENDING_FEEDBACK` | pending_feedback   |
| `UNMAPPED_VALUE`   | unmapped_value     |