# HrisShiftResultValue

The status of the shift

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.HrisShiftResultValue;

HrisShiftResultValue value = HrisShiftResultValue.DRAFT;

// Open enum: use .of() to create instances from custom string values
HrisShiftResultValue custom = HrisShiftResultValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `PUBLISHED`      | published        |
| `CONFIRMED`      | confirmed        |
| `CANCELLED`      | cancelled        |
| `UNMAPPED_VALUE` | unmapped_value   |