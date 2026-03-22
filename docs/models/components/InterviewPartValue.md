# InterviewPartValue

The type of the interview.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.InterviewPartValue;

InterviewPartValue value = InterviewPartValue.SCREENING;

// Open enum: use .of() to create instances from custom string values
InterviewPartValue custom = InterviewPartValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `SCREENING`      | screening        |
| `LUNCH`          | lunch            |
| `ON_SITE`        | on_site          |
| `PRESENTATION`   | presentation     |
| `SELL`           | sell             |
| `CULTURE`        | culture          |
| `INFORMAL`       | informal         |
| `TEST`           | test             |
| `PHONE`          | phone            |
| `VIDEO`          | video            |
| `UNMAPPED_VALUE` | unmapped_value   |