package com.Multithread.msb.containers;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CountDownLatch;

/**
 * @author created by qwb on 2018/9/1 12:13
 */
public class ConcurrentMap {
    public static void main(String[] args) {
//        Map<String, String> map = new ConcurrentHashMap<>();//效率比hashtable高，concurrenthashmap将容器分成了16段，每次只锁定其中一段，并发行更高
//        Map<String, String> map = new ConcurrentSkipListMap<>();//高并发时，数据需要排好序，跳表数据结构，http://blog.csdn.net/sunxianghuang/article/details/52221913

        Map<String, String> map = new Hashtable<>();
//        Map<String, String > map = new HashMap<>(); //Collections.synchronizedXXX
        //TreeMap  非并发，排好顺序
        Random r = new Random();
        Thread[] ths = new Thread[100];
        CountDownLatch latch = new CountDownLatch(ths.length);
        long start = System.currentTimeMillis();
        for (int i=0; i<ths.length;i++){
            ths[i] = new Thread(()->{
                for (int j=0;j<10000;j++){
                    map.put("a"+r.nextInt(100000),"a"+r.nextInt(100000));
                }
                latch.countDown();
            });
        }
        Arrays.asList(ths).forEach(t->t.start());
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    /**
     * 总结
     * 1、不加锁： hashmap  treemap   linkedhashmap  set同理
     *     加锁： hashtable  Collections.synchronizedMap  并发量不高的情况下
     *
     *     并发量比较高
     *          concurrenthashmap

     *     并发量比较高且要求排序
     *          concurrentskiplistmap
     * */
}
