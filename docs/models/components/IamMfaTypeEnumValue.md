# IamMfaTypeEnumValue

The unified value for the type of multi-factor authentication. If the provider does not send back a type but does specify that MFA is set-up for this user, the value will be set to 'unknown'.'

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.IamMfaTypeEnumValue;

IamMfaTypeEnumValue value = IamMfaTypeEnumValue.SMS;

// Open enum: use .of() to create instances from custom string values
IamMfaTypeEnumValue custom = IamMfaTypeEnumValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `SMS`            | sms              |
| `EMAIL`          | email            |
| `PUSH`           | push             |
| `TOTP`           | totp             |
| `PHONE_CALL`     | phone_call       |
| `QUESTION`       | question         |
| `SOFTWARE_TOKEN` | software_token   |
| `HARDWARE_TOKEN` | hardware_token   |
| `WEB`            | web              |
| `UNKNOWN`        | unknown          |
| `UNMAPPED_VALUE` | unmapped_value   |