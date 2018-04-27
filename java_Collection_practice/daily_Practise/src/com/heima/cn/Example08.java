package com.heima.cn;

public class Example08 {
    public static void main(String[] args){
        System.out.println("1.添加=====");
        add();
        System.out.println("2.删除=====");
        delete();
        System.out.println("3.修改=====");
        alter();
    }
    public static void add(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");
        System.out.println(sb);
        sb.insert(2,"123");
        System.out.println(sb);
    }
    public static void delete(){
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.delete(1,5);
        System.out.println(sb);
        sb.deleteCharAt(2);
        sb.delete(0,sb.length());
        System.out.println(sb);
    }
    public static void alter(){
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.setCharAt(1,'p');
        System.out.println(sb);
        sb.replace(1,3,"qq");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
