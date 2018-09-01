package com.Multithread.msb.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author created by qwb on 2018/8/30 22:07
 */
public class ReentrantLock5 extends Thread{

    /**
     * reentrantlock还可以指定为公平锁,谁等的时间长，谁就得到那把锁
     * */
    private static ReentrantLock lock = new ReentrantLock(true);//true表示公平锁
    public void run(){
        for (int i=0;i<100;i++){
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+"获得锁");
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLock5 r5 = new ReentrantLock5();
        Thread t1 = new Thread(r5);
        Thread t2 = new Thread(r5);
        t1.start();
        t2.start();
    }


}
