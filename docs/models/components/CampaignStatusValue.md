# CampaignStatusValue

The Status of the campaign.

## Example Usage

```java
import com.stackone.stackone_client_java.models.components.CampaignStatusValue;

CampaignStatusValue value = CampaignStatusValue.DRAFT;

// Open enum: use .of() to create instances from custom string values
CampaignStatusValue custom = CampaignStatusValue.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `ARCHIVED`       | archived         |
| `LIVE`           | live             |
| `UNMAPPED_VALUE` | unmapped_value   |