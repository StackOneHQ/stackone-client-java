# TimeOffValue

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.TimeOffValue;

TimeOffValue value = TimeOffValue.APPROVED;

// Open enum: use .of() to create instances from custom string values
TimeOffValue custom = TimeOffValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `APPROVED`       | approved         |
| `CANCELLED`      | cancelled        |
| `REJECTED`       | rejected         |
| `PENDING`        | pending          |
| `DELETED`        | deleted          |
| `DRAFT`          | draft            |
| `UNMAPPED_VALUE` | unmapped_value   |