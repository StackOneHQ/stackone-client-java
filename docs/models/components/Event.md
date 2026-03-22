# Event

The event type

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.Event;

Event value = Event.SCREENING_RESULTS_CREATED;

// Open enum: use .of() to create instances from custom string values
Event custom = Event.of("custom_value");
```


## Values

| Name                          | Value                         |
| ----------------------------- | ----------------------------- |
| `SCREENING_RESULTS_CREATED`   | screening.results.created     |
| `SCREENING_RESULTS_UPDATED`   | screening.results.updated     |
| `SCREENING_RESULTS_COMPLETED` | screening.results.completed   |
| `SCREENING_RESULTS_FAILED`    | screening.results.failed      |
| `SCREENING_RESULTS_CANCELLED` | screening.results.cancelled   |