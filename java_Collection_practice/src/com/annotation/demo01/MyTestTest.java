package com.annotation.demo01;

/**
 * @author created by qwb on 2018/9/14 10:38
 */
public class MyTestTest {
    @MyTest
    public void f1(){
        System.out.println("f1方法执行了~~~~");
    }

    public void f2(){
        System.out.println("f2方法执行了~~~~");
    }

    @MyTest
    public void f3(){
        System.out.println("f3方法执行了~~~~");
    }

}
