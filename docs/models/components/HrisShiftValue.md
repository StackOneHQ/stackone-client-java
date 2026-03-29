# HrisShiftValue

The status of the shift

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.HrisShiftValue;

HrisShiftValue value = HrisShiftValue.DRAFT;

// Open enum: use .of() to create instances from custom string values
HrisShiftValue custom = HrisShiftValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `PUBLISHED`      | published        |
| `CONFIRMED`      | confirmed        |
| `CANCELLED`      | cancelled        |
| `UNMAPPED_VALUE` | unmapped_value   |