# ActionsRpcResponse


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `next`                                                                                     | *JsonNullable\<String>*                                                                    | :heavy_minus_sign:                                                                         | Cursor for fetching the next page of results                                               |
| `data`                                                                                     | [JsonNullable\<ActionsRpcResponseData>](../../models/components/ActionsRpcResponseData.md) | :heavy_minus_sign:                                                                         | The response data from the action RPC call                                                 |