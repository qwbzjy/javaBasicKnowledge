package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClass_1 {
    public static void main(String[] args)throws ClassNotFoundException {
        //什么时候要在方法后面加异常处理
        /*throws声明：如果一个方法内部的代码会抛出检查异常（checked exception），而方法自己又没有完全处理掉，则javac保证你必须在方法的签名上使用throws关键字声明这些可能抛出的异常，否则编译不通过。
        *
        * hrows是另一种处理异常的方式，它不同于try…catch…finally，throws仅仅是将函数中可能出现的异常向调用者声明，而自己则不具体处理
        * **/
        Class clasz = Class.forName("java.lang.String");
        Field[] field = clasz.getDeclaredFields();
        System.out.println("-----------显示类的属性-------------");
        for(Field f:field){
            System.out.println(f.getName() +"    "+f.getType());
        }
        System.out.println("------------显示类的方法------------");
        Method[] method = clasz.getDeclaredMethods();
        for(Method m:method){
            System.out.println(m.getName());
        }
        System.out.println("-----------显示类的构造方法---------------");
        Constructor[] cons = clasz.getConstructors();
        for(Constructor c:cons){
            System.out.println(c);
        }
        System.out.println("-------获取类的相关信息------------");
        System.out.println("类所在的包: "+clasz.getPackage().getName());
        System.out.println("类名： "+clasz.getName());
        System.out.println("父类的名称: "+clasz.getSuperclass().getName());
    }
}
