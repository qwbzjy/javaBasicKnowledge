package com.Multithread.msb;

import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/27 21:15
 */
public class demo_008 {
    /**
     * 一个同步方法可以调用另外一个同步方法，一个线程已经拥有某个对象的锁，再次申请的时候任然会得到该对象的锁，也就是说synchronized获得的锁是可重入的。
     * */
    synchronized static void m1(){
        System.out.println("m1 start...");
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        m2();
    }
    synchronized static void m2(){
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("m2");
    }

    public static void main(String[] args) {
        m1();
    }
}