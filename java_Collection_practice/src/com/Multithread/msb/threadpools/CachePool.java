package com.Multithread.msb.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/9/1 17:54
 */
public class CachePool {
    /**
     *
     * */
    public static void main(String[] args) throws InterruptedException{
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println(service);

        for (int i=0;i<2;i++){
            service.execute(()->{
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }

        System.out.println(service);

        TimeUnit.SECONDS.sleep(20);

        System.out.println(service);
    }
}
