package com.heima.string;

/**
 * @author created by qwb on 2018/10/7 10:42
 */
public class TestString01 {
    public static void main(String[] args) {
        String a = "HelloWorld";
        String b = new String("HelloWorld");
        String c = "Hello"+ new String("World");
        System.out.println( a == b );//false
        System.out.println( a == c );//false
        System.out.println( b == c );//false
    }
}
