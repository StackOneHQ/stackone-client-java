# TicketingReadTicketValue

The priority of the ticket.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.TicketingReadTicketValue;

TicketingReadTicketValue value = TicketingReadTicketValue.LOWEST;

// Open enum: use .of() to create instances from custom string values
TicketingReadTicketValue custom = TicketingReadTicketValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `LOWEST`         | lowest           |
| `LOW`            | low              |
| `MEDIUM`         | medium           |
| `HIGH`           | high             |
| `HIGHEST`        | highest          |
| `UNMAPPED_VALUE` | unmapped_value   |