# HrisListEmployeeTimeOffBalancesQueryParamFilter

HRIS Time Off Balance filters


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `updatedAfter`                                                                            | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | Use a string with a date to only select results updated after that given date             | 2020-01-01T00:00:00.000Z                                                                  |
| `policyIds`                                                                               | List\<*String*>                                                                           | :heavy_minus_sign:                                                                        | List of policy ids to filter time off balances by.                                        |                                                                                           |