package com.heima.StringMutipulate;

/**
 * @author created by qwb on 2018/8/24 14:55
 */
public class StringVariableAndArray {
    /**
     * ��java��String����Զ����ַ����������ַ������飬length()������String�ַ�������ĳ��ȣ���length��
     ����String�ַ�������ĳ��ȡ�
     length()����String�ַ����������ַ��ĸ�������length�����ַ����������ж��ٸ��ַ�����
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
