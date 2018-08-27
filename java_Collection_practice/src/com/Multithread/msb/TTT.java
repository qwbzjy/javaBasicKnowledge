package com.Multithread.msb;

/**
 * @author created by qwb on 2018/8/27 19:57
 */
public class TTT {
    private int count = 10;
    public synchronized void m(){
        count--;
        System.out.println(Thread.currentThread().getName()+"count = "+count);
    }
}
