# OfferValue

The status of the offer.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.OfferValue;

OfferValue value = OfferValue.PENDING;

// Open enum: use .of() to create instances from custom string values
OfferValue custom = OfferValue.of("custom_value");
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