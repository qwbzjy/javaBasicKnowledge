package com.generic.generic.test.genericClass_interface_method;

/**
 * @author created by qwb on 2018/10/7 15:41
 */
public class Person<E> {
    public <T> Person(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        /**
         * 因为泛型构造器可以显式指定自己的类型参数（需要用到菱形，放在构造器之前），
         * 而泛型类自己的类型实参也需要指定（菱形放在构造器之后），
         * 这就同时出现了两个菱形了，这就会有一些小问题，
         * */
        Person<String> a = new <Integer>Person<String>(15);//因为类和构造器都是泛型的，
//        Person<String> b = new <Integer>Person<>(15);//报错
    }
}
