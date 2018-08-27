package com.Multithread.msb;

/**
 * @author created by qwb on 2018/8/27 19:58
 */
public class TTTT {
    /**
     * synchronized用在静态方法上，相当于锁定的T.class
     * */
    private static int count = 10;
    public synchronized static void m(){
        count--;
        System.out.println(Thread.currentThread().getName()+"count = "+count);
    }

    public static void mm(){
        synchronized (T.class){//不能写synchronized(this)
            count--;
        }
    }
}
