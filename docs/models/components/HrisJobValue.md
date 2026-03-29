# HrisJobValue

The status of the job.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.HrisJobValue;

HrisJobValue value = HrisJobValue.DRAFT;

// Open enum: use .of() to create instances from custom string values
HrisJobValue custom = HrisJobValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `PENDING`        | pending          |
| `ARCHIVED`       | archived         |
| `CLOSED`         | closed           |
| `OPEN`           | open             |
| `DELETED`        | deleted          |
| `UNMAPPED_VALUE` | unmapped_value   |