# IamRoleValue

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.IamRoleValue;

IamRoleValue value = IamRoleValue.ADMIN;

// Open enum: use .of() to create instances from custom string values
IamRoleValue custom = IamRoleValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `ADMIN`          | admin            |
| `VIEWER`         | viewer           |
| `EDITOR`         | editor           |
| `BASIC`          | basic            |
| `GUEST`          | guest            |
| `UNASSIGNED`     | unassigned       |
| `RESTRICTED`     | restricted       |
| `UNMAPPED_VALUE` | unmapped_value   |