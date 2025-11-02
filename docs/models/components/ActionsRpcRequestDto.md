# ActionsRpcRequestDto


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `action`                                                 | *String*                                                 | :heavy_check_mark:                                       | The action to execute                                    | create_employee                                          |
| `path`                                                   | Map\<String, *Object*>                                   | :heavy_minus_sign:                                       | Path parameters for the action                           | {<br/>"id": "123"<br/>}                                  |
| `query`                                                  | [JsonNullable\<Query>](../../models/components/Query.md) | :heavy_minus_sign:                                       | Query parameters for the action                          |                                                          |
| `headers`                                                | Map\<String, *Object*>                                   | :heavy_minus_sign:                                       | Headers for the action                                   | {<br/>"Content-Type": "application/json"<br/>}           |
| `body`                                                   | Map\<String, *Object*>                                   | :heavy_minus_sign:                                       | Request body for the action                              | {<br/>"data": "example"<br/>}                            |