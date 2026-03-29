# AtsUpdateJobRequestDtoValue

The status of the job.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AtsUpdateJobRequestDtoValue;

AtsUpdateJobRequestDtoValue value = AtsUpdateJobRequestDtoValue.PUBLISHED;

// Open enum: use .of() to create instances from custom string values
AtsUpdateJobRequestDtoValue custom = AtsUpdateJobRequestDtoValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PUBLISHED`      | published        |
| `DRAFT`          | draft            |
| `PENDING`        | pending          |
| `INTERNAL`       | internal         |
| `ARCHIVED`       | archived         |
| `CLOSED`         | closed           |
| `OPEN`           | open             |
| `DELETED`        | deleted          |
| `ON_HOLD`        | on_hold          |
| `UNMAPPED_VALUE` | unmapped_value   |