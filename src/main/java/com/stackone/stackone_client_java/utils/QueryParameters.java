/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QueryParameters {
    public static <T extends Object> List<QueryParameter> parseQueryParams(Class<T> type, T queryParams,
            Globals globals) throws Exception {
        List<QueryParameter> allParams = new ArrayList<>();

        Field[] fields = type.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }
            
            Object value = queryParams != null ? field.get(queryParams) : null;
            value = Utils.resolveStringShape(type, field.getName(), value); 
            value = Utils.resolveOptionals(value);
            
            value = Utils.populateGlobal(value, field.getName(), "queryParam", globals);
            if (value == null) {
                continue;
            }

            QueryParamsMetadata queryParamsMetadata = QueryParamsMetadata.parse(field);
            if (queryParamsMetadata == null) {
                continue;
            }

            if (queryParamsMetadata.serialization != null && !queryParamsMetadata.serialization.isBlank()) {
                List<QueryParameter> params = parseSerializedParams(queryParamsMetadata, value);
                allParams.addAll(params);
            } else {
                switch (queryParamsMetadata.style) {
                    case "form":
                        List<QueryParameter> formParams = parseDelimitedParams(queryParamsMetadata, value, ",");
                        allParams.addAll(formParams);
                        break;
                    case "deepObject":
                        List<QueryParameter> deepObjectParams = parseDeepObjectParams(queryParamsMetadata, value);
                        allParams.addAll(deepObjectParams);
                        break;
                    case "pipeDelimited":
                        List<QueryParameter> pipeDelimitedParams = parseDelimitedParams(queryParamsMetadata, value, "|");
                        allParams.addAll(pipeDelimitedParams);
                        break;
                    default:
                        break;
                }
            }
        }

        // include all global params in pathParams if not already present
        if (globals != null) {
            Set<String> allParamNames = allParams.stream()
                .map(QueryParameter::name)
                .collect(Collectors.toSet());
            globals.queryParamsAsStream()
                .filter(entry -> !allParamNames.contains(entry.getKey()))
                .forEach(entry ->      
                        allParams.add(QueryParameter.of(entry.getKey(), 
                            entry.getValue(), false)));
        }
        
        return allParams;
    }

    private static List<QueryParameter> parseSerializedParams(QueryParamsMetadata queryParamsMetadata, Object value)
            throws JsonProcessingException {
        List<QueryParameter> params = new ArrayList<>();
        switch (queryParamsMetadata.serialization) {
            case "json":
                ObjectMapper mapper = JSON.getMapper();
                String json = mapper.writeValueAsString(value);
                params.add(QueryParameter.of(queryParamsMetadata.name, json, queryParamsMetadata.allowReserved));
                break;
            default:
                break;
        }
        return params;
    }

    private static List<QueryParameter> parseDelimitedParams(QueryParamsMetadata queryParamsMetadata, Object value, String delimiter)
            throws IllegalArgumentException, IllegalAccessException {
        List<QueryParameter> params = new ArrayList<>();

        switch (Types.getType(value.getClass())) {
            case ARRAY: {
                final List<?> array = Utils.toList(value);
                List<String> values = new ArrayList<>();
                List<String> items = new ArrayList<>();

                for (Object v : array) {
                    if (queryParamsMetadata.explode) {
                        values.add(Utils.valToString(v));
                    } else {
                        items.add(Utils.valToString(v));
                    }
                }

                if (items.size() > 0) {
                    values.add(String.join(delimiter, items));
                }

                params.addAll(values.stream().map(v -> QueryParameter.of(queryParamsMetadata.name, v, queryParamsMetadata.allowReserved))
                        .collect(Collectors.toList()));
                break;
            }
            case MAP: {
                Map<?, ?> map = (Map<?, ?>) value;

                List<String> items = new ArrayList<>();

                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    String key = Utils.valToString(entry.getKey());
                    String val = Utils.valToString(entry.getValue());

                    if (queryParamsMetadata.explode) {
                        params.add(QueryParameter.of(key, val, queryParamsMetadata.allowReserved));
                    } else {
                        items.add(String.format("%s%s%s", key, delimiter, val));
                    }
                }

                if (items.size() > 0) {
                    params.add(QueryParameter.of(queryParamsMetadata.name, String.join(delimiter, items), queryParamsMetadata.allowReserved));
                }
                break;
            }
            case OBJECT: {
                if (!Utils.allowIntrospection(value.getClass())) {
                    params.add(QueryParameter.of(queryParamsMetadata.name, Utils.valToString(value), queryParamsMetadata.allowReserved));
                    break;
                }
                Field[] fields = value.getClass().getDeclaredFields();

                List<String> items = new ArrayList<>();

                for (Field field : fields) {
                    field.setAccessible(true);
                    Object val = field.get(value);
                    val = Utils.resolveOptionals(val);
                    if (val == null) {
                        continue;
                    }

                    QueryParamsMetadata metadata = QueryParamsMetadata.parse(field);
                    if (metadata == null) {
                        continue;
                    }

                    if (queryParamsMetadata.explode) {
                        params.add(QueryParameter.of(metadata.name, Utils.valToString(val), metadata.allowReserved));
                    } else {
                        items.add(String.format("%s%s%s", metadata.name, delimiter, Utils.valToString(val)));
                    }
                }

                if (items.size() > 0) {
                    params.add(QueryParameter.of(queryParamsMetadata.name, String.join(delimiter, items), queryParamsMetadata.allowReserved));
                }
                break;
            }
            default:
                params.add(QueryParameter.of(queryParamsMetadata.name, Utils.valToString(value), queryParamsMetadata.allowReserved));
                break;
        }

        return params;
    }

    private static List<QueryParameter> parseDeepObjectParams(QueryParamsMetadata queryParamsMetadata, Object value) 
        throws Exception {
        
        List<QueryParameter> params = new ArrayList<>();

        switch (Types.getType(value.getClass())) {
            case MAP: {
                Map<?, ?> map = (Map<?, ?>) value;

                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    String key = Utils.valToString(entry.getKey());
                    Object val = Utils.resolveOptionals(entry.getValue());

                    if (val instanceof List || val.getClass().isArray()) {
                        for (Object v : Utils.toList(val)) {
                            params.add(QueryParameter.of(String.format("%s[%s]", queryParamsMetadata.name, key),
                                    Utils.valToString(v), queryParamsMetadata.allowReserved));
                        }
                    } else {
                        params.add(QueryParameter.of(String.format("%s[%s]", queryParamsMetadata.name, key),
                                Utils.valToString(val), queryParamsMetadata.allowReserved));
                    }
                }

                return params;
            }
            case OBJECT: {
                if (!Utils.allowIntrospection(value.getClass())) {
                    throw new RuntimeException("DeepObject style only supports Map and Object types, not " + value.getClass());
                }
                Field[] fields = value.getClass().getDeclaredFields();

                for (Field field : fields) {
                    field.setAccessible(true);
                    Object val = field.get(value);
                    val = Utils.resolveOptionals(val);
                    if (val == null) {
                        continue;
                    }

                    QueryParamsMetadata metadata = QueryParamsMetadata.parse(field);
                    if (metadata == null) {
                        continue;
                    }

                    if (val instanceof List || val.getClass().isArray()) {
                        for (Object v : Utils.toList(val)) {
                            params.add(QueryParameter.of(
                                    String.format("%s[%s]", queryParamsMetadata.name, metadata.name),
                                    Utils.valToString(v), metadata.allowReserved));
                        }
                    } else {
                        params.add(
                                QueryParameter.of(String.format("%s[%s]", queryParamsMetadata.name, metadata.name),
                                        Utils.valToString(val), metadata.allowReserved));
                    }
                }

                return params;
            }
            default:
                throw new RuntimeException("DeepObject style only supports Map and Object types");
        }
    }
}
