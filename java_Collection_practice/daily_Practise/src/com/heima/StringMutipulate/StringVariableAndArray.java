package com.heima.StringMutipulate;

/**
 * @author created by qwb on 2018/8/24 14:55
 */
public class StringVariableAndArray {
    /**
     * 在java中String类可以定义字符串变量和字符串数组，length()用于求String字符串对象的长度，而length用
     于求String字符串数组的长度。
     length()是求String字符串对象中字符的个数，而length是求字符串数组中有多少个字符串。
     */
    public static void main(String[] args) {
//        variableAndArray();
        stringBuilderToString();
    }

    public static void variableAndArray(){
        String s1 = new String("abecdef");
        String[] s2 = {"aae","bbdfd","ccss"};
        int t1 = s1.length();
        int t2 = s2.length;
        System.out.println(t1);
        System.out.println("----------");
        System.out.println(t2);
        System.out.println(s2[1].length());
    }

    public static void stringBuilderToString(){
        StringBuilder sb = new StringBuilder("i am a braver!");
        sb.append(0);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
