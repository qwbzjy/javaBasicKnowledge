package com.Multithread.msb;

import java.util.concurrent.TimeUnit;

/**
 * @author created by qwb on 2018/8/27 21:40
 */
public class M {
    /*子类调用父类的同步方法*/
    synchronized void m(){
        System.out.println("m start");
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        new MM().m();
    }
}

class MM extends M{
    synchronized void m(){
        System.out.println("child m start");
        super.m();
        System.out.println("child m end");
    }
}
