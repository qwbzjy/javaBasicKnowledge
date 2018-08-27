package com.Multithread.msb;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/27 21:15
 */
public class Account {
    String name;
    double balance;
    /**
     * 只对写加锁，没有对读枷锁，会引起脏读现象，解决方法，在get方法前加synchronized
     * */
    public synchronized void set(String name, double balance){
        this.name = name;
//        try{
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        //加上休眠2s后，输出0，0
        this.balance = balance;
    }

    public double getBalance(String name){
        return this.balance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        new Thread(()->a.set("zhangsan",100.0)).start();
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(a.getBalance("zhangsan"));

        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(a.getBalance("zhangsan"));
    }
}
