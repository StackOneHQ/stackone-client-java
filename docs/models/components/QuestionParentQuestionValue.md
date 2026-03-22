# QuestionParentQuestionValue

The type of the question's condition

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.QuestionParentQuestionValue;

QuestionParentQuestionValue value = QuestionParentQuestionValue.EQUALS_TO;

// Open enum: use .of() to create instances from custom string values
QuestionParentQuestionValue custom = QuestionParentQuestionValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `EQUALS_TO`      | equals_to        |
| `CONTAINS`       | contains         |
| `UNMAPPED_VALUE` | unmapped_value   |