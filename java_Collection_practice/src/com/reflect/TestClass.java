package com.reflect;

import java.util.Date;

/**
 * @author created by qwb on 2018/10/7 17:05
 */
public class TestClass {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        Class c1 = date1.getClass();
        Class c2 = date2.getClass();
        System.out.println(c1.getName());
        System.out.println(c1==c2);

        Class clazz = String.class;
        System.out.println(clazz.getName());

        try {
            Class cls = Class.forName("java.lang.String");
            System.out.println(cls.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
