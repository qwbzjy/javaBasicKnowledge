package com.Multithread.msb.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/28 20:04
 */
public class MyContainer3 {

    volatile List lists = new ArrayList();
    public void add(Object o){
        lists.add(o);
    }

    public int size(){
        return lists.size();
    }

    public static void main(String[] args) {
        MyContainer3 c = new MyContainer3();
        CountDownLatch latch = new CountDownLatch(1);//latch：门闩等待是不需要锁定任何对象的

        new Thread(()->{
            System.out.println("t2启动");
            if(c.size() != 5){
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("t2结束");
        },"t2").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            System.out.println("t1启动");
            for (int i=0;i<10;i++){
                c.add(new Object());
                System.out.println("add "+i);
                if(c.size() == 5){
                    //打开门闩,让t2得以执行
                }

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1").start();
    }

}
