package com.Multithread.msb.threadpools;

import java.util.concurrent.Executor;

/**
 * @author created by qwb on 2018/9/1 16:40
 */
public class MyExecutor implements Executor{
    public static void main(String[] args) {
        new MyExecutor().execute(()-> System.out.println("hello executor"));
    }
    @Override
    public void execute(Runnable command){
        command.run();
    }


}
