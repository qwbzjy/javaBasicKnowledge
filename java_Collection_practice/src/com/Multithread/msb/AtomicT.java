package com.Multithread.msb;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *解决同样的问题,使用AtomicT具有更高的效率
 * @author created by qwb on 2018/8/28 19:07
 */
public class AtomicT {

    AtomicInteger count = new AtomicInteger(0);
    void m(){
        for(int i=0;i<100000;i++){
            //if count.get()<1000;/*说明AtomicT的多个方法并不构成原子性*/
            count.incrementAndGet();//count++
        }
    }

    public static void main(String[] args) {
        AtomicT t = new AtomicT();
        List<Thread> threads = new ArrayList<Thread>();
        for (int i=0;i<10;i++){
            threads.add(new Thread(t::m,"thread-"+i));
        }
        threads.forEach((o)->o.start());

        threads.forEach((o)->{
            try{
                o.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
    }
}
