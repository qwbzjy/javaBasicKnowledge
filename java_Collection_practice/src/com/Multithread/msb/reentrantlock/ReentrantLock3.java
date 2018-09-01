package com.Multithread.msb.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author created by qwb on 2018/8/30 21:52
 */
public class ReentrantLock3 {

    /**
     * 使用reentrantlock还可以调用lockInterruptibly方法，可以对线程interrupt方法做出响应
     * 在一个线程等待锁的过程中，可以被打断
     * */

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Thread t1 = new Thread(()->{

            try {
                lock.lock();
                System.out.println("t1 start");
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                System.out.println("t1 end");
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }finally {
                lock.unlock();
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            try {
                //lock.lock();//无法被打断
                lock.lockInterruptibly();//可以对interrupt方法作出响应
                System.out.println("t2 start");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }finally {
                lock.unlock();
            }
        });
        t2.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt();//打断线程2的等待
    }
}
