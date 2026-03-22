# TicketingTicketCreateRequestDtoValue

The priority of the ticket.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.TicketingTicketCreateRequestDtoValue;

TicketingTicketCreateRequestDtoValue value = TicketingTicketCreateRequestDtoValue.LOWEST;

// Open enum: use .of() to create instances from custom string values
TicketingTicketCreateRequestDtoValue custom = TicketingTicketCreateRequestDtoValue.of("custom_value");
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