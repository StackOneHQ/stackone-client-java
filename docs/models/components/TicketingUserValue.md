# TicketingUserValue

The type of the user.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.TicketingUserValue;

TicketingUserValue value = TicketingUserValue.AGENT;

// Open enum: use .of() to create instances from custom string values
TicketingUserValue custom = TicketingUserValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `AGENT`          | agent            |
| `CONTACT`        | contact          |
| `BOT`            | bot              |
| `UNMAPPED_VALUE` | unmapped_value   |