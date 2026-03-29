# AtsCreateOfferRequestDtoValue

The status of the offer.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AtsCreateOfferRequestDtoValue;

AtsCreateOfferRequestDtoValue value = AtsCreateOfferRequestDtoValue.PENDING;

// Open enum: use .of() to create instances from custom string values
AtsCreateOfferRequestDtoValue custom = AtsCreateOfferRequestDtoValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PENDING`        | pending          |
| `RETRACTED`      | retracted        |
| `ACCEPTED`       | accepted         |
| `REJECTED`       | rejected         |
| `CREATED`        | created          |
| `APPROVED`       | approved         |
| `NOT_APPROVED`   | not_approved     |
| `UNMAPPED_VALUE` | unmapped_value   |