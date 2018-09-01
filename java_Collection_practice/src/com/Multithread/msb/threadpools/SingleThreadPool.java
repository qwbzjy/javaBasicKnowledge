package com.Multithread.msb.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author created by qwb on 2018/9/1 17:55
 */
public class SingleThreadPool {
    //保证任务顺序执行
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i=0;i<5;i++){
            final int j = i;
            service.execute(()->{
                System.out.println(j+" "+Thread.currentThread().getName());
            });
        }
    }
}
