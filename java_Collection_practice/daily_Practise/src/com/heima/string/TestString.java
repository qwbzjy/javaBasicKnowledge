package com.heima.string;

/**
 * @author created by qwb on 2018/10/7 10:38
 */
public class TestString {
    public static void main(String[] args) {
        String a = "Hello World!";
        String b = "Hello World!";
        String c = new String("Hello World!");
        String d = "Hello"+" "+"World!";
        System.out.println(a == b);//true
        System.out.println(a == c);//false
        System.out.println(a == d);//true
        /**
         * true
         false
         true
         * */
    }
}
