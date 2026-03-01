# TicketingDownloadTicketingAttachmentRequest


## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `xAccountId`                       | *String*                           | :heavy_check_mark:                 | The account identifier             |                                    |
| `id`                               | *String*                           | :heavy_check_mark:                 | N/A                                |                                    |
| `subResourceId`                    | *String*                           | :heavy_check_mark:                 | N/A                                |                                    |
| `format`                           | *JsonNullable\<String>*            | :heavy_minus_sign:                 | The format to download the file in | base64                             |
| `exportFormat`                     | *JsonNullable\<String>*            | :heavy_minus_sign:                 | The export format of the file      | text/plain                         |