# DownloadHeadersApiModel


## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `contentDisposition`                    | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Value of the Content-Disposition header | attachment; filename="example.pdf"      |
| `contentType`                           | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | MIME type of the file                   | application/pdf                         |
| `contentLength`                         | *JsonNullable\<Double>*                 | :heavy_minus_sign:                      | Size of the content in bytes            | 1024                                    |
| `contentRange`                          | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Range of the content being sent         | bytes 0-1023/2048                       |
| `contentEncoding`                       | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Encoding of the content                 | gzip                                    |
| `transferEncoding`                      | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Transfer encoding type                  | chunked                                 |