# FieldType

The type of the field

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.FieldType;

FieldType value = FieldType.SHORT_TEXT;

// Open enum: use .of() to create instances from custom string values
FieldType custom = FieldType.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `SHORT_TEXT`     | short_text       |
| `LONG_TEXT`      | long_text        |
| `MULTI_SELECT`   | multi_select     |
| `SINGLE_SELECT`  | single_select    |
| `BOOLEAN`        | boolean          |
| `NUMBER`         | number           |
| `DATE`           | date             |
| `PHONE`          | phone            |
| `EMAIL`          | email            |
| `SCORE`          | score            |
| `LOCATION`       | location         |
| `UNMAPPED_VALUE` | unmapped_value   |