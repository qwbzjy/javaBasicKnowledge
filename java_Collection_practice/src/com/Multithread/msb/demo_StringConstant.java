package com.Multithread.msb;

/**
 * @author created by qwb on 2018/8/28 19:31
 */
public class demo_StringConstant {

    /**
     * 不要用字符串常量作为锁的对象
     * */
    String s1 = "hello";
    String s2 = "hello";
    void m1(){
        synchronized (s1){}
    }

    void m2(){
        synchronized (s2){

        }
    }
}
