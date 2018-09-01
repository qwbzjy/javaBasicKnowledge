package com.Multithread.msb.ticketSeller;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author created by qwb on 2018/9/1 12:03
 */
public class TicketSeller4 {
    static Queue<String> tickets = new ConcurrentLinkedDeque<>();
    static {
        for (int i=0;i<1000;i++)tickets.add("票编号： "+i);
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(()->{
                while (true){
                    String s = tickets.poll();
                    if(s == null)break;
                    else System.out.println("销售了--"+s);
                }
            }).start();
        }
    }
}
