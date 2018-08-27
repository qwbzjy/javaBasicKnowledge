package com.Multithread.msb;

/**
 * @author created by qwb on 2018/8/27 20:02
 */
public class demo_005 implements Runnable {
    private  int count = 10;
    public /*synchronized*/ void run(){//synchronized的代码块是原子性的，不可分。
        count--;
        System.out.println(Thread.currentThread().getName()+"count = "+count);
    }

    public static void main(String[] args) {
        demo_005 d = new demo_005();
        for(int i=0; i<5; i++){
            new Thread(d,"THREAD"+i).start();
        }
    }
}
