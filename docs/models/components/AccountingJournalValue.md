# AccountingJournalValue

The journal status

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AccountingJournalValue;

AccountingJournalValue value = AccountingJournalValue.DRAFT;

// Open enum: use .of() to create instances from custom string values
AccountingJournalValue custom = AccountingJournalValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `POSTED`         | posted           |
| `VOID`           | void             |
| `UNMAPPED_VALUE` | unmapped_value   |