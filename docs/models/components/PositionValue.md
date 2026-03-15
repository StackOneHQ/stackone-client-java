# PositionValue

The status of the position.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.PositionValue;

PositionValue value = PositionValue.OPEN;

// Open enum: use .of() to create instances from custom string values
PositionValue custom = PositionValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `OPEN`           | open             |
| `DRAFT`          | draft            |
| `CLOSED`         | closed           |
| `PAUSED`         | paused           |
| `UNMAPPED_VALUE` | unmapped_value   |