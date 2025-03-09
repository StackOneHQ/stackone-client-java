# Role

The role of manager


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `id`                                                           | *JsonNullable\<String>*                                        | :heavy_minus_sign:                                             | Unique identifier                                              | 8187e5da-dc77-475e-9949-af0f1fa4e4e3                           |
| `remoteId`                                                     | *JsonNullable\<String>*                                        | :heavy_minus_sign:                                             | Provider's unique identifier                                   | 8187e5da-dc77-475e-9949-af0f1fa4e4e3                           |
| `label`                                                        | *JsonNullable\<String>*                                        | :heavy_minus_sign:                                             | The label of the role type                                     | Admin                                                          |
| `roleType`                                                     | [JsonNullable\<RoleType>](../../models/components/RoleType.md) | :heavy_minus_sign:                                             | The manager role type (e.g., admin, viewer)                    | admin                                                          |