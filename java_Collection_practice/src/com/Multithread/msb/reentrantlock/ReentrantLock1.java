package com.Multithread.msb.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author created by qwb on 2018/8/30 21:04
 */
public class ReentrantLock1 {
    /**
     * reentrantlock必须手动释放锁
     * 使用synchronized锁定的话，如果遇到异常,jvm会自动释放锁，但是lock必须手动释放锁，
     * 因此经常再finally中进行锁的释放
     * synchronized手动上锁，自动释放
     * */

    Lock lock = new ReentrantLock();
    void m1(){
        lock.lock();
        for (int i=0; i<10; i++){
            try {
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    void m2(){
        lock.lock();
        System.out.println("m2....");
        lock.unlock();
    }
    public static void main(String[] args) {
        ReentrantLock1 r1 = new ReentrantLock1();
        new Thread(r1::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r1::m2).start();
    }
}
