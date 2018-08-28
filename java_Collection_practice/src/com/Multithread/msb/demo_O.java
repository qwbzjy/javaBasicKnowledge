package com.Multithread.msb;

import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/28 19:24
 */
public class demo_O {
    /**
     * 锁定某对象o，如果o的属性发生改变，不影响锁的使用
     * 但是如果o变成另外一个对象，则锁定的对象发生改变
     * 应该避免将锁定的对象的引用变成另外的对象
     * 锁的信息记录在堆内存中
     * */
    Object o = new Object();
    void m(){
        synchronized (o){
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        demo_O t = new demo_O();
        new Thread(t::m,"t1").start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(t::m,"t2");
        t.o = new Object();
        t2.start();
    }
}
