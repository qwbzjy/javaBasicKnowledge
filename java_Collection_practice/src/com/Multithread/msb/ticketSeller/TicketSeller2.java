package com.Multithread.msb.ticketSeller;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/9/1 11:56
 */
public class TicketSeller2 {
    static Vector<String> tickets = new Vector<>();
    static {
        for (int i=0; i<1000;i++)tickets.add("票编号: "+i);
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(()->{
                while (tickets.size() > 0){
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("销售了---"+tickets.remove(0));
                    //size()和remove()不是原子性的
                }
            }).start();
        }
    }
}
