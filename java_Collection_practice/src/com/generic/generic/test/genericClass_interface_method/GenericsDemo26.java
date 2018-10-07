package com.generic.generic.test.genericClass_interface_method;

/**
 * @author created by qwb on 2018/10/7 15:33
 */
public class GenericsDemo26 {
    //泛型方法
    public static void main(String[] args) {
        Demo d = new Demo();
        String str = d.fun("tom");
        int i = d.fun(30);
        System.out.println(str);
        System.out.println(i);
    }
}
class Demo{
    public <T> T fun(T t){//<T>是泛型修饰符
        return t;
    }
}
