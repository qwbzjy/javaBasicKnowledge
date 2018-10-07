package com.Multithread.msb.threadlocal;

import java.util.concurrent.TimeUnit;

/**
 * ThreadLocal线程局部变量
 * @author created by qwb on 2018/9/1 9:56
 */
public class ThreadLocal1 {
    /*volatile*/ static Person p = new Person();

    public static void main(String[] args) {
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(p.name);
        }).start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            p.name = "lisi";
        }).start();
    }
}
class Person{
    String name = "zhangsan";
}
