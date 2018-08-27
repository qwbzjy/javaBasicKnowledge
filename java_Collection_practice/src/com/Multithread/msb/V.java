package com.Multithread.msb;

import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/27 22:16
 */
public class V {
    /**
     * volatile关键字，使一个变量在多个线程间可见
     * A B线程都用到一个变量，JAVA默认是A线程中保留一份copy，这样如果B线程修改了变量，则A线程未必知道
     * 使用volatile关键字，会让所有线程都会读到变量的修改值
     *
     * 下面例子，running存在于堆内存的t对象中，当线程t1开始运行的时候，会把running值从内存中读到t1线程的工作区中，在运行过程中直接使用这个copy，并不会每次都去读取堆内存，这样，当主线程修改running的值后，t1线程感知不到，所以不会停止运行.
     *
     * 使用volatile,将会强制所有线程都去堆内存中读取running的值
     * volatile并不能保证多个线程共同修改running变量时所带来的不一致问题，也就是说volatile不能替代synchronized
     * http://www.cnblogs.com/nexiyi/p/java_memory_model_and_thread.html
     * */
    volatile boolean running = true;//对比有无volatile的结果，可见性，JMM：java内存模型，主内存;volatile的效率比synchronized的效率高很多
    void m(){
        System.out.println("m start");
        while (running){
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("m end!");
    }

    public static void main(String[] args) {
        V v = new V();
        new Thread(v::m,"v1").start();
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        v.running = false;
    }
}
