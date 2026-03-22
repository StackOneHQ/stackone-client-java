# IamPermissionValue

The type of the permission, e.g. read, read_write, delete, etc.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.IamPermissionValue;

IamPermissionValue value = IamPermissionValue.READ;

// Open enum: use .of() to create instances from custom string values
IamPermissionValue custom = IamPermissionValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `READ`           | read             |
| `READ_WRITE`     | read_write       |
| `APPROVE`        | approve          |
| `DELETE`         | delete           |
| `USE`            | use              |
| `EXPORT`         | export           |
| `UNMAPPED_VALUE` | unmapped_value   |