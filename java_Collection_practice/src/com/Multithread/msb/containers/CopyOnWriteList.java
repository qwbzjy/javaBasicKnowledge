package com.Multithread.msb.containers;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author created by qwb on 2018/9/1 12:42
 */
public class CopyOnWriteList {
    //写时复制容器，多线程环境下，写时效率低，读时效率高。
    //往里添加元素的时候，会把这个容器复制一份，然后指向新的容器，读的效率特别高且不用枷锁，适用于写的很少，读的很多，如事件监听器。写的效率特别低

    public static void main(String[] args) {
        List<String> lists =
//                new ArrayList<>();//这个会出现并发问题
//                    new Vector<>();
                        new CopyOnWriteArrayList<>();
        Random r = new Random();
        Thread[] ths = new Thread[100];

        for (int i=0;i<ths.length;i++){
            Runnable task = new Runnable(){
                @Override
                public void run() {
                    for (int i=0;i<1000;i++)lists.add("a"+r.nextInt(10000));
                }
            };
            ths[i] = new Thread(task);
            runAndComputeTime(ths);
            System.out.println(lists.size());
        }
    }
    static void runAndComputeTime(Thread[] ths){
        long s1 = System.currentTimeMillis();
        Arrays.asList(ths).forEach(t->t.start());
        Arrays.asList(ths).forEach(t->{
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long s2 = System.currentTimeMillis();
        System.out.println(s2-s1);
    }


}
