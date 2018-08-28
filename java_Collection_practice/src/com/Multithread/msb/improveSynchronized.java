package com.Multithread.msb;

import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/28 19:18
 */
public class improveSynchronized {
    /**
     * synchronized优化，同步代码块中的语句越少越好
     * 比较m1和m2
     * */
    int count = 0;
    synchronized void m1(){//锁的粒度比较粗
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void m2(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this){
            count++; //锁的粒度比较细，并发的效率比m1高不少
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
