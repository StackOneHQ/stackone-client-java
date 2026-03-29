# TicketingTicketResultValue

The priority of the ticket.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.TicketingTicketResultValue;

TicketingTicketResultValue value = TicketingTicketResultValue.LOWEST;

// Open enum: use .of() to create instances from custom string values
TicketingTicketResultValue custom = TicketingTicketResultValue.of("custom_value");
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