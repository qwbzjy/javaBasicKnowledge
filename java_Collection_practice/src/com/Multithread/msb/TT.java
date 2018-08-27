package com.Multithread.msb;

/**
 * @author created by qwb on 2018/8/27 19:56
 */
public class TT {
    private int count = 10;
    public void m(){
        synchronized (this){
            count--;
            System.out.println(Thread.currentThread().getName()+"count = "+count);
        }
    }
}
