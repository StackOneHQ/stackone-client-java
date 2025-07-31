# HrisListTimeOffPoliciesQueryParamFilter

HRIS Time-Off Policies filters


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `updatedAfter`                                                                            | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | Use a string with a date to only select results updated after that given date             | 2020-01-01T00:00:00.000Z                                                                  |
| `type`                                                                                    | [JsonNullable\<Type>](../../models/operations/Type.md)                                    | :heavy_minus_sign:                                                                        | Filter to select time-off policies by type                                                |                                                                                           |