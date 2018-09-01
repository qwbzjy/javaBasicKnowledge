package com.Multithread.msb.reentrantlock;

import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/30 20:59
 */
public class T1 {
    /*reentrantlock用于替代synchronized,复习synchronized功能*/
    synchronized void m1(){
        for (int i=0; i<10; i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    synchronized void m2(){
        System.out.println("m2...");
    }

    public static void main(String[] args) {
        T1 r1 = new T1();
        new Thread(r1::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r1::m2).start();
    }
}
