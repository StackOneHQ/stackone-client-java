# CampaignValue

The schedule type of the campaign.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.CampaignValue;

CampaignValue value = CampaignValue.IMMEDIATE;

// Open enum: use .of() to create instances from custom string values
CampaignValue custom = CampaignValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `IMMEDIATE`      | immediate        |
| `SCHEDULED`      | scheduled        |
| `RECURRING`      | recurring        |
| `CUSTOM`         | custom           |
| `TRIGGERED`      | triggered        |
| `UNMAPPED_VALUE` | unmapped_value   |