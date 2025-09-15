# StackoneMcpPostRequest


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `xAccountId`                                                      | *String*                                                          | :heavy_check_mark:                                                | Account secure id for the target provider account                 |
| `mcpSessionId`                                                    | *Optional\<String>*                                               | :heavy_minus_sign:                                                | Session id; omit for initialize, include for subsequent calls     |
| `jsonRpcMessageDto`                                               | [JsonRpcMessageDto](../../models/components/JsonRpcMessageDto.md) | :heavy_check_mark:                                                | JSON-RPC 2.0 message                                              |