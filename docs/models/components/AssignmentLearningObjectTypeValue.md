# AssignmentLearningObjectTypeValue

The StackOne unified learning object type.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.AssignmentLearningObjectTypeValue;

AssignmentLearningObjectTypeValue value = AssignmentLearningObjectTypeValue.CONTENT;

// Open enum: use .of() to create instances from custom string values
AssignmentLearningObjectTypeValue custom = AssignmentLearningObjectTypeValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `CONTENT`        | content          |
| `COURSE`         | course           |
| `COLLECTION`     | collection       |
| `UNMAPPED_VALUE` | unmapped_value   |