package com.Multithread.msb;

/**
 * @author created by qwb on 2018/8/27 19:51
 */
public class T {
    private int count = 10;
    private Object o = new Object();

    public void run(){
        synchronized (o){//synchronized锁定的是一个对象，不是代码块
            count--;
            System.out.println(Thread.currentThread().getName()+"count = "+count);
        }
    }

    public static void main(String[] args) {

    }
}
