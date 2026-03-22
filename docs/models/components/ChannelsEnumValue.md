# ChannelsEnumValue

The Channels of the campaign.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.ChannelsEnumValue;

ChannelsEnumValue value = ChannelsEnumValue.EMAIL;

// Open enum: use .of() to create instances from custom string values
ChannelsEnumValue custom = ChannelsEnumValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `EMAIL`          | email            |
| `SMS`            | sms              |
| `WEB_PUSH`       | web_push         |
| `IOS_PUSH`       | ios_push         |
| `ANDROID_PUSH`   | android_push     |
| `UNKNOWN`        | unknown          |
| `UNMAPPED_VALUE` | unmapped_value   |