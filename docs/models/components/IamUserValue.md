# IamUserValue

The status of the user, e.g. whether the user is enabled, has been disabled (eg. by an admin), or is pending (ie: awaiting approval by the user or an admin).

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.IamUserValue;

IamUserValue value = IamUserValue.ENABLED;

// Open enum: use .of() to create instances from custom string values
IamUserValue custom = IamUserValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `ENABLED`        | enabled          |
| `DISABLED`       | disabled         |
| `PENDING`        | pending          |
| `UNMAPPED_VALUE` | unmapped_value   |