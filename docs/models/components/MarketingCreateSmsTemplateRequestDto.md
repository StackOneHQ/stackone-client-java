# MarketingCreateSmsTemplateRequestDto


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `name`                                                       | *JsonNullable\<String>*                                      | :heavy_minus_sign:                                           | N/A                                                          |                                                              |
| `tags`                                                       | List\<*String*>                                              | :heavy_minus_sign:                                           | N/A                                                          |                                                              |
| `messages`                                                   | List\<[SmsMessages](../../models/components/SmsMessages.md)> | :heavy_minus_sign:                                           | N/A                                                          |                                                              |
| `passthrough`                                                | Map\<String, *Object*>                                       | :heavy_minus_sign:                                           | Value to pass through to the provider                        | {<br/>"other_known_names": "John Doe"<br/>}                  |