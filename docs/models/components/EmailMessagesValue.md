# EmailMessagesValue

The unified message type.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.EmailMessagesValue;

EmailMessagesValue value = EmailMessagesValue.EMAIL;

// Open enum: use .of() to create instances from custom string values
EmailMessagesValue custom = EmailMessagesValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `EMAIL`          | email            |
| `SMS`            | sms              |
| `PUSH`           | push             |
| `WEB_PUSH`       | web_push         |
| `IOS_PUSH`       | ios_push         |
| `ANDROID_PUSH`   | android_push     |
| `APP_PUSH`       | app_push         |
| `OMNI_CHANNEL`   | omni_channel     |
| `CONTENT_BLOCK`  | content_block    |
| `IN_APP`         | in_app           |
| `UNKNOWN`        | unknown          |
| `UNMAPPED_VALUE` | unmapped_value   |