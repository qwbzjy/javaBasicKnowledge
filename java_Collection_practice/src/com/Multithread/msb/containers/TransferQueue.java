package com.Multithread.msb.containers;

import java.util.concurrent.LinkedTransferQueue;

/**
 * @author created by qwb on 2018/9/1 16:04
 */
public class TransferQueue {
    /**
     *先有消费者，transfer就是生产者直接将任务扔给消费者，不往队列里加,应用于更高的并发场景。
     * */

    public static void main(String[] args) throws InterruptedException{
        LinkedTransferQueue strs = new LinkedTransferQueue();

        new Thread(()->{
            try {
                System.out.println(strs.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        strs.transfer("aaa");

        new Thread(()->{
            try {
                System.out.println(strs.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }
}
