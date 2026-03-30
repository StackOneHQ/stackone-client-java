# CreateSkillsApiModelValue

The unified skill level. For write operations: provide one of the listed enum values, or omit/set to "unmapped_value" to use source_value instead.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.CreateSkillsApiModelValue;

CreateSkillsApiModelValue value = CreateSkillsApiModelValue.PRIMARY;

// Open enum: use .of() to create instances from custom string values
CreateSkillsApiModelValue custom = CreateSkillsApiModelValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PRIMARY`        | primary          |
| `SECONDARY`      | secondary        |
| `TERTIARY`       | tertiary         |
| `UNMAPPED_VALUE` | unmapped_value   |