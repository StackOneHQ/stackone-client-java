# JobPostingValue

The status of the job postings.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.JobPostingValue;

JobPostingValue value = JobPostingValue.LIVE;

// Open enum: use .of() to create instances from custom string values
JobPostingValue custom = JobPostingValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `LIVE`           | live             |
| `DRAFT`          | draft            |
| `PENDING`        | pending          |
| `INTERNAL`       | internal         |
| `REJECTED`       | rejected         |
| `CLOSED`         | closed           |
| `ARCHIVED`       | archived         |
| `UNMAPPED_VALUE` | unmapped_value   |