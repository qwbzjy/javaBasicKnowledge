package com.Multithread.msb;

import java.util.ArrayList;
import java.util.List;

/**
 * @author created by qwb on 2018/8/27 22:42
 */
public class VV {
    /**
     * synchronized：原子性和可见性
     * volatile:只保证可见性
     * */

    volatile int count = 0;
    void m(){
        for(int i=0;i<10000;i++)count++;
    }

    public static void main(String[] args) {
        VV v = new VV();
        List<Thread> threads = new ArrayList<Thread>();
        for(int i=0;i<10;i++){
            threads.add(new Thread(v::m,"thread-"+i));
        }
        threads.forEach((o)->o.start());

        threads.forEach((o)->{
            try{
                o.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        System.out.println(v.count);

    }
}
