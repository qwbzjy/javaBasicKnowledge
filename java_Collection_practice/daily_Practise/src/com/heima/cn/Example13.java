package com.heima.cn;

public class Example13 {
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        System.out.println(rt.freeMemory()/1024/1024+"M");
        System.out.println(rt.maxMemory()/1024/1024+"M");

    }
}
