package com.Multithread.msb;

import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/27 21:45
 */
public class exception_Demo {
    /**
     * 程序在执行的过程中，如果出现异常，默认情况锁会被释放
     * 所以，在并发处理的过程中，多个servlet线程共同访问同一个资源，这时如果异常处理不合适，
     * 在第一个线程中抛出异常，其他线程就会进入同步代码块，有可能会访问到异常产生时的数据
     * 因此要非常小心的处理同步业务逻辑中的异常
     * */
    int count = 0;
    synchronized void m(){
        System.out.println(Thread.currentThread().getName()+" start");
        while (true){
            count++;
            System.out.println(Thread.currentThread().getName()+"count = "+count);
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            try{
                if(count == 5){
                    int i = 1/0;
                }
            }catch (ArithmeticException e){
                e.printStackTrace();
            }

        }
    }
    /**
     * 线程抛出异常后，锁会被释放，如果你不想释放锁，那就try...catch异常
     * */
    public static void main(String[] args) {
        exception_Demo t = new exception_Demo();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                t.m();
            }
        };
        new Thread(r,"t1").start();

        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        new Thread(r,"t2").start();
    }
}
