package com.heima.refect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    public static void main(String[] args) {
        givenObject_whenGetsFieldNamesAtRuntime_thenCorrect();
    }
    public static void givenObject_whenGetsFieldNamesAtRuntime_thenCorrect(){
        Object person = new Person();
        Field[] fileds = person.getClass().getDeclaredFields();

        List<String> actualFieldNames = getFieldNames(fileds);
        for(String str:actualFieldNames)
            System.out.println(str);
//        assertTrue(Arrays.asList("name","age").containsAll(actualFieldNames));
    }

    private static List<String> getFieldNames(Field[] fields){
        List<String> fieldNames = new ArrayList<>();
        for(Field field:fields){
            fieldNames.add(field.getName());
        }
        return fieldNames;
    }
}
