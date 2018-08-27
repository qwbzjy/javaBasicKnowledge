package com.Multithread;

/**
 * @author created by qwb on 2018/8/27 18:47
 */
public class notJoin {
    public static void main(String[] args) {
        //不加join
//        System.out.println(Thread.currentThread().getName()+"主线程运行开始！");
//        Thread1 mTh1 = new Thread1("A");
//        Thread1 mTh2 = new Thread1("B");
//        mTh1.start();
//        mTh2.start();
//        System.out.println(Thread.currentThread().getName()+"主线程运行结束！");

        //加join
        System.out.println(Thread.currentThread().getName()+"主线程运行开始！");
        Thread1 m1 = new Thread1("G");
        Thread m2 = new Thread1("j");
        m1.start();
        m2.start();
        try{
            m1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            m2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"主线程运行结束");
    }

}

//class Thread1 extends Thread{
//    private String name;
//    public Thread1(String name){
//        super(name);
//        this.name = name;
//    }
//    public void run(){
//        System.out.println(Thread.currentThread().getName() + "线程运行开始");
//        for (int i=0;i<5;i++){
//            System.out.println("子线程 "+name+"运行： "+i);
//            try{
//                sleep((int)Math.random()*10);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//        System.out.println(Thread.currentThread().getName()+"线程运行结束!");
//    }
//}
