# JobPostingCompensationValue

The type of the compensation.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.JobPostingCompensationValue;

JobPostingCompensationValue value = JobPostingCompensationValue.SALARY;

// Open enum: use .of() to create instances from custom string values
JobPostingCompensationValue custom = JobPostingCompensationValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `SALARY`         | salary           |
| `HOURLY`         | hourly           |
| `COMMISSION`     | commission       |
| `BONUS`          | bonus            |
| `EQUITY`         | equity           |
| `OTHER`          | other            |
| `UNMAPPED_VALUE` | unmapped_value   |