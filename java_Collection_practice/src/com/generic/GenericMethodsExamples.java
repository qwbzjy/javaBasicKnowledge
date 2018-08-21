package com.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GenericMethodsExamples {

    public static <T> List<T> fromArrayToList(T[] a){
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T,G> List<G> fromArrayToList(T[] a, Function<T,G> mapperFunction){
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
    }

    public static <T extends Number> List<T> fromArrayToListWithUpperBound(T[] a){
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        List<Integer> list = fromArrayToList(intArray);
        list.forEach(element -> System.out.println(element));

        String[] stringArray = {"hello1","hello2","hello3","hello4","hello5"};
        List<String> strList = fromArrayToList(stringArray);
        strList.forEach(element-> System.out.println(element));

        Integer[] intArr = {1,2,3,4,5};
        List<String> stringList = fromArrayToList(intArr,Object::toString);
        stringList.forEach(element-> System.out.println(element));
    }
}
