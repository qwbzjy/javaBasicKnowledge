package com.Multithread.msb.containers;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/9/1 15:31
 */
public class LinkedBblockingQueue {

    static BlockingQueue<String> strs = new LinkedBlockingDeque<>();
    static Random r = new Random();

    public static void main(String[] args) {
        new Thread(()->{
            for (int i=0;i<100;i++){
                try {
                    strs.put("a"+i);//如果满了，就会等待
                    TimeUnit.SECONDS.sleep(r.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"p1").start();

        for (int i=0;i<5;i++){
            new Thread(()->{
                for (;;){
                    try {
                        System.out.println(Thread.currentThread().getName()+"take -"+ strs.take());//如果空了，就会等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"c" +i).start();
        }
    }
}
