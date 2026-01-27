# ActionSearchDto


## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `query`                                    | *String*                                   | :heavy_check_mark:                         | Search query for finding connector actions | send a message                             |
| `connector`                                | *Optional\<String>*                        | :heavy_minus_sign:                         | Filter by connector key                    | slack                                      |
| `topK`                                     | *Optional\<Double>*                        | :heavy_minus_sign:                         | Number of results to return                |                                            |