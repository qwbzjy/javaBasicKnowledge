package com.reflect;

/**
 * @author created by qwb on 2018/10/7 16:58
 */
public class TestDemo {
    public static void main(String[] args) {
        Class mClass = MyClass.class;
        try {
            MyClass mMyClass = (MyClass)mClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    //有参构造方法，会覆盖默认的无参构造方法
    public MyClass(){};
    public MyClass(String s){}
}
