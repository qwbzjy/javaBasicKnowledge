package com.generic.generic.test.genericClass_interface_method;

/**
 * @author created by qwb on 2018/10/7 15:37
 */
public class GenericConstructor {
    public <T> GenericConstructor(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        new GenericConstructor(22);//隐式
        new<String> GenericConstructor("hello");//显式
    }
}
