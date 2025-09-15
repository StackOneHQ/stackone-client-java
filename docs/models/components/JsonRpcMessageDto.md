# JsonRpcMessageDto


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `jsonrpc`                                              | *String*                                               | :heavy_check_mark:                                     | JSON-RPC protocol version                              | 2.0                                                    |
| `method`                                               | *String*                                               | :heavy_check_mark:                                     | JSON-RPC method name                                   | initialize                                             |
| `params`                                               | [Optional\<Params>](../../models/components/Params.md) | :heavy_minus_sign:                                     | Method parameters (arbitrary JSON)                     |                                                        |
| `id`                                                   | [Optional\<Id>](../../models/components/Id.md)         | :heavy_minus_sign:                                     | Request id (arbitrary JSON scalar)                     |                                                        |