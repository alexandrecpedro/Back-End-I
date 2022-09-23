package com.example.ecommerce.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CommerceUtils {
    /** Attributes **/
    private static ObjectMapper mapper = new ObjectMapper();

    /** Methods **/
    // Convert Object to JSON
    public static String asJsonString(final Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    // Convert JSON to Object
    public static <T> T objectFromString(Class<T> aClass, String value) {
        try {
            return mapper.readValue(value, aClass);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
