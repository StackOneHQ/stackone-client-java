# RejectedReasonValue

The type of the rejected reason.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.RejectedReasonValue;

RejectedReasonValue value = RejectedReasonValue.REJECTED_BY_CANDIDATE;

// Open enum: use .of() to create instances from custom string values
RejectedReasonValue custom = RejectedReasonValue.of("custom_value");
```


## Values

| Name                       | Value                      |
| -------------------------- | -------------------------- |
| `REJECTED_BY_CANDIDATE`    | rejected_by_candidate      |
| `REJECTED_BY_ORGANIZATION` | rejected_by_organization   |
| `OTHER`                    | other                      |
| `UNKNOWN`                  | unknown                    |
| `UNMAPPED_VALUE`           | unmapped_value             |