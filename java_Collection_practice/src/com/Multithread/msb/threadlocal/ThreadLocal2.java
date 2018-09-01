package com.Multithread.msb.threadlocal;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * ThreadLocal是用空间换时间，synchronized是时间换空间
 * 比如在hibernate中session就用了threadlocal
 * threadlocal可能导致内存泄漏
 * @author created by qwb on 2018/9/1 10:02
 */
public class ThreadLocal2 {
//    volatile static Person p = new Person();
    static ThreadLocal<Person> tl = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(tl.get());
        }).start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tl.set(new Person());
        }).start();
    }
    static class Person{
        String name = "zhangsan";
    }
}
