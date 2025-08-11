# LmsListContentQueryParamFilter

LMS Courses Filter


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `updatedAfter`                                                                            | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | Use a string with a date to only select results updated after that given date             | 2020-01-01T00:00:00.000Z                                                                  |
| `active`                                                                                  | [JsonNullable\<QueryParamActive>](../../models/operations/QueryParamActive.md)            | :heavy_minus_sign:                                                                        | Filter to allow filtering of only active content                                          |                                                                                           |