# DocumentsDownloadFileRequest


## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `xAccountId`                       | *String*                           | :heavy_check_mark:                 | The account identifier             |                                    |
| `xStackoneApiSessionToken`         | *Optional\<String>*                | :heavy_minus_sign:                 | The session token                  |                                    |
| `id`                               | *String*                           | :heavy_check_mark:                 | N/A                                |                                    |
| `format`                           | *JsonNullable\<String>*            | :heavy_minus_sign:                 | The format to download the file in | base64                             |
| `exportFormat`                     | *JsonNullable\<String>*            | :heavy_minus_sign:                 | The export format of the file      | text/plain                         |