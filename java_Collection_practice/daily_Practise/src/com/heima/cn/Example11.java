package com.heima.cn;

public class Example11 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i<100000000;i++){
            sum +=i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
