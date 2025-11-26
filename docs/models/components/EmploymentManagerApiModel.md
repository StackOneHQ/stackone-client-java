# EmploymentManagerApiModel


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `id`                                                   | *JsonNullable\<String>*                                | :heavy_minus_sign:                                     | Unique identifier                                      | 8187e5da-dc77-475e-9949-af0f1fa4e4e3                   |
| `remoteId`                                             | *JsonNullable\<String>*                                | :heavy_minus_sign:                                     | Provider's unique identifier                           | 8187e5da-dc77-475e-9949-af0f1fa4e4e3                   |
| `name`                                                 | *JsonNullable\<String>*                                | :heavy_minus_sign:                                     | The manager name                                       | John Doe                                               |
| `email`                                                | *JsonNullable\<String>*                                | :heavy_minus_sign:                                     | The manager email                                      | john.doe@example.com                                   |
| `role`                                                 | [JsonNullable\<Role>](../../models/components/Role.md) | :heavy_minus_sign:                                     | The role of manager                                    |                                                        |