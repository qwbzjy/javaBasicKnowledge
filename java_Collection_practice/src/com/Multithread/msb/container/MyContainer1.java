package com.Multithread.msb.container;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/30 22:16
 */
public class MyContainer1<T> {
    /**
     * 写一个固定容量的同步容器，拥有put和get方法，以及getCount方法
     * 能够支持2个生产者线程和10个消费者线程
     * 使用wait和notify/notifyAll实现
     * */
    final private LinkedList<T> lists = new LinkedList<>();
    final private int MAX = 10;
    private int count = 0;
    public synchronized void put(T t){
        while (lists.size() == MAX){//为什么不用if循环，while每次都会检查容器是否满，如果使用if就会报错，wait往往和while使用
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lists.add(t);
            ++count;
            this.notifyAll();//通知消费者线程进行消费，如果是notify，有可能唤醒的还是生产者，但是如果是notifyAll，会唤醒所有的线程，包括消费者线程。
        }
    }

    public synchronized T get(){
        T t = null;
        while (lists.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        t = lists.removeFirst();
        count--;
        this.notifyAll();
        return t;
    }

    public static void main(String[] args) {
        MyContainer1<String> c = new MyContainer1<>();
        //启动消费者线程
        for (int i=0;i<10;i++){
            new Thread(()->{
                for (int j=0;j<5;j++) System.out.println(c.get());
            },"c"+i).start();
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //启动生产者线程
        for (int i=0;i<2;i++){
            new Thread(()->{
                for (int j=0;j<25;j++){
                    c.put(Thread.currentThread().getName()+" "+j);
                }
            },"p"+i).start();
        }
    }
}
