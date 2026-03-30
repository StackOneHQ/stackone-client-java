# AccountingAccountResultValue

Type of account

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AccountingAccountResultValue;

AccountingAccountResultValue value = AccountingAccountResultValue.ASSET;

// Open enum: use .of() to create instances from custom string values
AccountingAccountResultValue custom = AccountingAccountResultValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `ASSET`          | asset            |
| `LIABILITY`      | liability        |
| `EQUITY`         | equity           |
| `REVENUE`        | revenue          |
| `EXPENSE`        | expense          |
| `UNMAPPED_VALUE` | unmapped_value   |