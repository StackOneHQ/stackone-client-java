/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.utils;

import java.lang.reflect.Field;

class QueryParamsMetadata {

    String style = "form";
    boolean explode = true;
    String name;
    String serialization;

    // queryParam:style=simple,explode=false,name=apiID
    static QueryParamsMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("queryParam", new QueryParamsMetadata(), field);
    }

    private QueryParamsMetadata() {
    }
}
