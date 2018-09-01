package com.Multithread.msb.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author created by qwb on 2018/8/30 21:11
 */
public class ReentrantLock2 {
    Lock lock = new ReentrantLock();

    void m1(){
        lock.lock();
        for (int i=0;i<10;i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
    /**
     * 使用trylock进行尝试锁定，不管锁定与否，方法都将继续执行
     * 可以根据trylock的返回值判断是否锁定
     *  也可指定trylock的时间，由于trylock(time)抛出异常，所以要注意unlock的处理，
     *  必须放到finally中
     * */
    void m2(){
        boolean locked = false;
        try {
            locked = lock.tryLock(5,TimeUnit.SECONDS);
            System.out.println("m2...."+locked);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (locked)lock.unlock();
        }

    }

    public static void main(String[] args) {
        ReentrantLock2 r2 = new ReentrantLock2();
        new Thread(r2::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(r2::m2).start();
    }
}
