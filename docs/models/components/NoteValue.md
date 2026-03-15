# NoteValue

The visibility of the notes.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.NoteValue;

NoteValue value = NoteValue.PRIVATE;

// Open enum: use .of() to create instances from custom string values
NoteValue custom = NoteValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PRIVATE`        | private          |
| `PUBLIC`         | public           |
| `UNMAPPED_VALUE` | unmapped_value   |