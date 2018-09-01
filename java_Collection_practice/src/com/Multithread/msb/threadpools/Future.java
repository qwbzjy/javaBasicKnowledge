package com.Multithread.msb.threadpools;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author created by qwb on 2018/9/1 17:23
 */
public class Future {
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        FutureTask<Integer> task = new FutureTask<>(()->{
            TimeUnit.MICROSECONDS.sleep(500);
            return 1000;
        });//new Callable(){Integer call();}

        new Thread(task).start();

        System.out.println(task.get());//阻塞
//
//        ExecutorService service = Executors.newFixedThreadPool(5);
//        Future<Integer> f =  service.submit(()->{
//            try {
//                TimeUnit.MICROSECONDS.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return 1;
//        });
//
//        System.out.println();



    }
}
