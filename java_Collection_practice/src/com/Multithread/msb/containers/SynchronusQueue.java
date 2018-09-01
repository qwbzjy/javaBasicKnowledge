package com.Multithread.msb.containers;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author created by qwb on 2018/9/1 16:09
 */
public class SynchronusQueue {
    /**
     * 同步队列,它是一种特殊的transferQueue
     * 容量为0
     * */
    public static void main(String[] args) throws InterruptedException{
        BlockingQueue<String> strs = new SynchronousQueue<>();

        new Thread(()->{
            try {
                System.out.println(strs.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

//        strs.add("aaa");//报错
        strs.put("aaa"); //阻塞等待消费者消费

        System.out.println(strs.size());
    }
}
