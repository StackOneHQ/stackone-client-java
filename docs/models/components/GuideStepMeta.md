# GuideStepMeta


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `title`                                                  | *String*                                                 | :heavy_check_mark:                                       | The title of the step                                    |
| `content`                                                | *String*                                                 | :heavy_check_mark:                                       | The content of the step, includes markdown formatting    |
| `list`                                                   | List\<*String*>                                          | :heavy_minus_sign:                                       | List items for the step                                  |
| `displayScopes`                                          | *JsonNullable\<Boolean>*                                 | :heavy_minus_sign:                                       | When true, the step should display scopes                |
| `applicableScopes`                                       | List\<*String*>                                          | :heavy_minus_sign:                                       | The scopes for which this step is applicable             |
| `image`                                                  | [JsonNullable\<Image>](../../models/components/Image.md) | :heavy_minus_sign:                                       | An image for the step                                    |