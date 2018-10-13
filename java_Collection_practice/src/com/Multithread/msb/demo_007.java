package com.Multithread.msb;

/**
 * @author created by qwb on 2018/8/27 20:08
 */
public class demo_007 {
    /**
     * 在synchronized方法执行过程中，非synchronized方法可以执行
     * */

    public synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+ "  m1 start....");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ "  m1 end...");
    }

    public void m2(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"  m2 start....");
    }

    public static void main(String[] args) {
        demo_007 d7 = new demo_007();
        new Thread(()->d7.m1(),"t1").start();
        new Thread(()->d7.m2(),"t2").start();//java8中的lamda表达式
//        new Thread(new Runnable(){
//            @Override
//            public void run(){
//                new demo_007().m1();
//            }
//        });
    }

}
