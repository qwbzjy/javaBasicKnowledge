package com.heima.cn;

public class Example09 {
    public static void main(String[]args){
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        System.out.println(sb1.equals(sb2));

        String s1 = "a";
        String s2 = "b";
        String s3 = s1 + s2;
        System.out.println(s3);
        StringBuffer b1 = new StringBuffer("a");
        StringBuffer b2 = new StringBuffer("b");
        //StringBuffer b3 = b1 + b2;编译出错

    }
}
