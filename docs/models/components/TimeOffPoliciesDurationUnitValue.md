# TimeOffPoliciesDurationUnitValue

The unified value for the duration unit. If the provider does not specify this unit, the value will be set to unknown

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.TimeOffPoliciesDurationUnitValue;

TimeOffPoliciesDurationUnitValue value = TimeOffPoliciesDurationUnitValue.MINUTES;

// Open enum: use .of() to create instances from custom string values
TimeOffPoliciesDurationUnitValue custom = TimeOffPoliciesDurationUnitValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `MINUTES`        | minutes          |
| `HOURS`          | hours            |
| `DAYS`           | days             |
| `WEEKS`          | weeks            |
| `MONTHS`         | months           |
| `YEARS`          | years            |
| `UNKNOWN`        | unknown          |
| `UNMAPPED_VALUE` | unmapped_value   |