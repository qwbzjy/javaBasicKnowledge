package com.heima.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author created by qwb on 2018/10/6 15:50
 */
public class TestClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Class c1 = s1.getClass();
        Class c2 = s2.getClass();
        System.out.println(c1.getName());
        System.out.println(c1==c2);
        Method[] m = c1.getDeclaredMethods();
        for (Method method:m){
            System.out.println(method.getName());
        }

        Field[] f = c1.getDeclaredFields();
        for (Field field:f){
            System.out.println(field.getName());
        }
    }


}

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    private int roll_No;


}
