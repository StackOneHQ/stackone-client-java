# CreateAnswerValue

The type of the answer.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.CreateAnswerValue;

CreateAnswerValue value = CreateAnswerValue.SHORT_TEXT;

// Open enum: use .of() to create instances from custom string values
CreateAnswerValue custom = CreateAnswerValue.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `SHORT_TEXT`      | short_text        |
| `LONG_TEXT`       | long_text         |
| `ATTACHMENT`      | attachment        |
| `MULTI_SELECT`    | multi_select      |
| `SINGLE_SELECT`   | single_select     |
| `BOOLEAN`         | boolean           |
| `NUMBER`          | number            |
| `DATE`            | date              |
| `VIDEO`           | video             |
| `REFERENCE_CHECK` | reference_check   |
| `URL`             | url               |
| `UNMAPPED_VALUE`  | unmapped_value    |