package com.Multithread.msb.ticketSeller;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/9/1 11:52
 */
public class TicketSeller3 {
    static List<String> tickets = new LinkedList<>();
    static {
        for (int i = 0; i<10000; i++)tickets.add("票编号： "+i);
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            new Thread(()->{
                while (true){
                    synchronized (tickets){
                        if (tickets.size() <= 0 )break;
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("销售了--"+tickets.remove(0));
                        //size()和remove()是原子性的
                    }
                }
            }).start();
        }
    }
}
