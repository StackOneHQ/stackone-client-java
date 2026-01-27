# ActionSearchResultDto


## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `actionName`                                         | *String*                                             | :heavy_check_mark:                                   | Unique action identifier                             |
| `connectorKey`                                       | *String*                                             | :heavy_check_mark:                                   | Connector key                                        |
| `similarityScore`                                    | *double*                                             | :heavy_check_mark:                                   | Cosine similarity score (0-1)                        |
| `label`                                              | *String*                                             | :heavy_check_mark:                                   | Human-readable action label                          |
| `description`                                        | *String*                                             | :heavy_check_mark:                                   | Action description                                   |
| `projectId`                                          | *String*                                             | :heavy_check_mark:                                   | Project ID of the action (global for shared actions) |