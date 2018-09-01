package com.Multithread.msb.containers;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author created by qwb on 2018/9/1 13:01
 */
public class ConcurrentQueue {
    public static void main(String[] args) {
        Queue<String> strs = new ConcurrentLinkedQueue<>();

        for (int i=0;i<10;i++){
            strs.offer("a"+i);//类似add方法,add有容量限制,会抛异常
        }
        System.out.println(strs);

        System.out.println(strs.size());
//
//        System.out.println(strs.poll());
//
//        System.out.println(strs.size());
//        System.out.println(strs);

        System.out.println(strs.peek());

        System.out.println(strs.size());
        System.out.println(strs);
    }
}
