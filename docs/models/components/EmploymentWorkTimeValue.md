# EmploymentWorkTimeValue

The unified value for the period.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.EmploymentWorkTimeValue;

EmploymentWorkTimeValue value = EmploymentWorkTimeValue.DAY;

// Open enum: use .of() to create instances from custom string values
EmploymentWorkTimeValue custom = EmploymentWorkTimeValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DAY`            | day              |
| `WEEK`           | week             |
| `MONTH`          | month            |
| `YEAR`           | year             |
| `UNMAPPED_VALUE` | unmapped_value   |