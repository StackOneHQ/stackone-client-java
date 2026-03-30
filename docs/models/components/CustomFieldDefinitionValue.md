# CustomFieldDefinitionValue

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.CustomFieldDefinitionValue;

CustomFieldDefinitionValue value = CustomFieldDefinitionValue.DATE;

// Open enum: use .of() to create instances from custom string values
CustomFieldDefinitionValue custom = CustomFieldDefinitionValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DATE`           | date             |
| `FLOAT`          | float            |
| `INTEGER`        | integer          |
| `LIST`           | list             |
| `CHECKBOX`       | checkbox         |
| `TEXT`           | text             |
| `BOOLEAN`        | boolean          |
| `SINGLE_SELECT`  | single_select    |
| `MULTI_SELECT`   | multi_select     |
| `URL`            | url              |
| `OTHER`          | other            |
| `UNMAPPED_VALUE` | unmapped_value   |