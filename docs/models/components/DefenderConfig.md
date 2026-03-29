# DefenderConfig

Per-request defender configuration. Takes precedence over defender_enabled and project settings.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `enabled`                                                          | *JsonNullable\<Boolean>*                                           | :heavy_minus_sign:                                                 | Whether to run defender at all                                     | true                                                               |
| `blockHighRisk`                                                    | *JsonNullable\<Boolean>*                                           | :heavy_minus_sign:                                                 | Whether to block tool execution when a HIGH risk score is detected | false                                                              |
| `useTier1Classification`                                           | *JsonNullable\<Boolean>*                                           | :heavy_minus_sign:                                                 | Whether to run tier 1 pattern-based detection                      | true                                                               |
| `useTier2Classification`                                           | *JsonNullable\<Boolean>*                                           | :heavy_minus_sign:                                                 | Whether to run tier 2 ML-based detection                           | true                                                               |