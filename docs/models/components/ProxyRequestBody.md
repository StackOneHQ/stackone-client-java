# ProxyRequestBody


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `url`                                                      | *JsonNullable\<String>*                                    | :heavy_minus_sign:                                         | The base url of the request                                | https://api.sample-integration.com/v1                      |
| `method`                                                   | [JsonNullable\<Method>](../../models/components/Method.md) | :heavy_minus_sign:                                         | The method of the request                                  |                                                            |
| `path`                                                     | *JsonNullable\<String>*                                    | :heavy_minus_sign:                                         | The path of the request including any query paramters      | /employees/directory                                       |
| `headers`                                                  | Map\<String, *Object*>                                     | :heavy_minus_sign:                                         | The headers to send in the request                         | {<br/>"Content-Type": "application/json"<br/>}             |
| `body`                                                     | Map\<String, *Object*>                                     | :heavy_minus_sign:                                         | The body of the request                                    |                                                            |