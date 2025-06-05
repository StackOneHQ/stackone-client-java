# Url

The request URL data


## Fields

| Field                               | Type                                | Required                            | Description                         | Example                             |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `url`                               | *JsonNullable\<String>*             | :heavy_minus_sign:                  | The request URL                     | https://example.com/api/v1/resource |
| `hostname`                          | *JsonNullable\<String>*             | :heavy_minus_sign:                  | The request URL hostname            | example.com                         |
| `path`                              | *JsonNullable\<String>*             | :heavy_minus_sign:                  | The request path                    | /api/v1/resource                    |
| `queryParams`                       | Map\<String, *Object*>              | :heavy_minus_sign:                  | The request query parameters        | {<br/>"page": 1,<br/>"limit": 10<br/>} |