# MessageMessageType

Stackone enum identifying the type of message associated with the content.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `value`                                                                            | [JsonNullable\<MessageValue>](../../models/components/MessageValue.md)             | :heavy_minus_sign:                                                                 | The unified message type.                                                          | email                                                                              |
| `sourceValue`                                                                      | [JsonNullable\<MessageSourceValue>](../../models/components/MessageSourceValue.md) | :heavy_minus_sign:                                                                 | The original value from the provider used to derive the unified message type.      | Email                                                                              |