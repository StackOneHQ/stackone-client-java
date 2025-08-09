# ScreeningResultWebhook


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `event`                                                       | [Event](../../models/components/Event.md)                     | :heavy_check_mark:                                            | The event type                                                | screening.result.completed                                    |
| `data`                                                        | [ScreeningResult](../../models/components/ScreeningResult.md) | :heavy_check_mark:                                            | The result data                                               |                                                               |
| `raw`                                                         | List\<[RawResponse](../../models/components/RawResponse.md)>  | :heavy_minus_sign:                                            | N/A                                                           |                                                               |