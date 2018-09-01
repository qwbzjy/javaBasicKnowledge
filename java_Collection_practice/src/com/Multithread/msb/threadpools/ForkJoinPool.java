package com.Multithread.msb.threadpools;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.RecursiveAction;

/**
 * @author created by qwb on 2018/9/1 17:55
 */
public class ForkJoinPool {
    static int[] nums = new int[1000000];
    static final int MAX_NUM = 50000;
    static Random r = new Random();

    static{
        for (int i=0;i<nums.length;i++){
            nums[i] = r.nextInt(100);
        }
        System.out.println(Arrays.stream(nums).sum());
    }

    static class AddTask extends RecursiveAction{
        int start,end;

        AddTask(int s, int e){
            start = s;
            end = e;
        }

        @Override
        protected void compute(){
            if(end-start <= MAX_NUM){
                long sum = 0L;
                for (int i=start;i<end;i++)sum+=nums[i];
                System.out.println("from: "+start +"to: "+end+" = "+sum);
            }else {
                int middle = start + (end-start)/2;

                AddTask subTask1 = new AddTask(start,middle);
                AddTask subTask2 = new AddTask(middle,end);
                subTask1.fork();
                subTask2.fork();
            }
        }
    }
}
