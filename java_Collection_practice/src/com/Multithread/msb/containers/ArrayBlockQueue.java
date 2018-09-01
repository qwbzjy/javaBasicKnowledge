package com.Multithread.msb.containers;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/9/1 15:39
 */
public class ArrayBlockQueue {
    //有界队列，容器的容量有限
    static BlockingQueue<String> strs = new ArrayBlockingQueue<>(10);
    static Random r = new Random();

    public static void main(String[] args) throws InterruptedException{
        for (int i=0;i<10;i++){
            strs.put("a"+i);
        }
//        strs.put("aaa");//put方法，满了就会等待，程序阻塞
//        strs.add("aaa");//add方法，报异常
        boolean b = strs.offer("aaa");//不会报异常
//        strs.offer("aaaa",1, TimeUnit.SECONDS);//一段时间段加不进去，就不往里加了

        System.out.println(strs);
    }
}
