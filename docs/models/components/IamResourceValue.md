# IamResourceValue

The type of the resource, e.g. user, group, permission, etc.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.IamResourceValue;

IamResourceValue value = IamResourceValue.PROJECT;

// Open enum: use .of() to create instances from custom string values
IamResourceValue custom = IamResourceValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PROJECT`        | project          |
| `FILE`           | file             |
| `FOLDER`         | folder           |
| `PRODUCT`        | product          |
| `PROPERTY`       | property         |
| `USER`           | user             |
| `UNMAPPED_VALUE` | unmapped_value   |