package com.heima.cn;

import java.util.Random;

public class Example14 {
    public static void main(String[] args){
        /*System.out.println(Math.abs(-1));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.floor(-4.2));
        System.out.println(Math.round(-4.6));
        System.out.println(Math.max(2.1,-2.1));
        System.out.println(Math.min(2.1,-2.1));
        System.out.println(Math.random());*/

       /* Random r = new Random();
        for (int x= 0;x<10;x++){
            System.out.println(r.nextInt(100));
        }*/

        Random r = new Random(13);
        for (int x=0;x<10;x++){
            System.out.println(r.nextInt(100));
        }
    }
}
