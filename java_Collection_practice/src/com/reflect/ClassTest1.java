package com.reflect;

import java.lang.reflect.Method;

/**
 * @author created by qwb on 2018/10/7 17:14
 */
public class ClassTest1 {
    public ClassTest1(){}

    public static void main(String[] args)throws Exception {
        ClassTest1 test = new ClassTest1();
        ClassTest1 test1 = test.getClass().newInstance();
        System.out.println(test==test1);
        System.out.println(test.getClass()==test1.getClass());
        test.printMessage();
        test1.printMessage();
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());

        Method[] methods = test1.getClass().getMethods();
        for (Method m:methods){
            System.out.println(m.getDeclaringClass());
            System.out.println(m.getName());
        }
    }
    public void printMessage(){
        System.out.println("created successful!");
    }
}
