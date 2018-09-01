package com.Multithread.msb.containers;

import com.Multithread.MyThreadPrinter2;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/9/1 15:47
 */
public class DelayQueue {
    /**
     * 无界队列，每个元素都记录着一个时间，表示还要等待多久才能被消费者消费
     * 可以用来执行定时任务,比如设置电脑2小时后关机
     * */
    static BlockingQueue<MyTask> tasks = new java.util.concurrent.DelayQueue<>();
    static Random r = new Random();

    static class MyTask implements Delayed {
        long runningTime;

        MyTask(long rt){
            this.runningTime = rt;
        }

        public int compareTo(Delayed o){
            if(this.getDelay(TimeUnit.MICROSECONDS) < o.getDelay(TimeUnit.MICROSECONDS))
                return -1;
            else if(this.getDelay(TimeUnit.MICROSECONDS) > o.getDelay(TimeUnit.MICROSECONDS))
                return 1;
            else
                return 0;
        }
        @Override
        public long getDelay(TimeUnit unit){
            return unit.convert(runningTime - System.currentTimeMillis(),TimeUnit.MICROSECONDS);
        }

        @Override
        public String toString(){
            return "" + runningTime;
        }
    }

    public static void main(String[] args) throws InterruptedException{
        long now = System.currentTimeMillis();
        MyTask t1 = new MyTask(now + 1000);
        MyTask t2 = new MyTask(now + 2000);
        MyTask t3 = new MyTask(now + 1500);
        MyTask t4 = new MyTask(now + 2500);
        MyTask t5 = new MyTask(now + 500);

        tasks.put(t1);
        tasks.put(t2);
        tasks.put(t3);
        tasks.put(t4);
        tasks.put(t5);

        System.out.println(tasks);
        for (int i=0;i<5;i++){
            System.out.println(tasks.take());
        }

    }


}
