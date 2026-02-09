# GuideSectionMeta


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `title`                                                          | *String*                                                         | :heavy_check_mark:                                               | The title of the section                                         |
| `content`                                                        | *String*                                                         | :heavy_check_mark:                                               | The content of the section, includes markdown formatting         |
| `list`                                                           | List\<*String*>                                                  | :heavy_minus_sign:                                               | List items for the section                                       |
| `steps`                                                          | List\<[GuideStepMeta](../../models/components/GuideStepMeta.md)> | :heavy_minus_sign:                                               | Nested steps within the section                                  |