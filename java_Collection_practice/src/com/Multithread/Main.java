package com.Multithread;

/**
 * @author created by qwb on 2018/8/27 10:26
 */
public class Main {
    public static void main(String[] args) {
//        Thread1 mTh1 = new Thread1("A");
//        Thread1 mTh2 = new Thread1("B");
//        mTh1.start();
//        mTh2.start();
        new Thread(new Thread2("C")).start();
        new Thread(new Thread2("D")).start();
    }
}

class Thread1 extends Thread{
    private String name;
    public Thread1(String name){
        this.name = name;
    }

    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(name+"????:"+i);
        }
        try {
            sleep((int)Math.random()*10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Thread2 implements Runnable{
    private String name;
    public Thread2(String name){
        this.name = name;
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(name+"????: "+i);
        }
            try{
                Thread.sleep((int)Math.random()*10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

    }
}
