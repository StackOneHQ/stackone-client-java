# AtsJobValue

The status of the job.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AtsJobValue;

AtsJobValue value = AtsJobValue.PUBLISHED;

// Open enum: use .of() to create instances from custom string values
AtsJobValue custom = AtsJobValue.of("custom_value");
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