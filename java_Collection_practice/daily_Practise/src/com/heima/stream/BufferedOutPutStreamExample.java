package com.heima.stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutPutStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream ft = new FileOutputStream("F:\\testout.txt");
        BufferedOutputStream bt = new BufferedOutputStream(ft);
        String s = "Welcome to TRC";
        byte[] b = s.getBytes();
        bt.write(b);
        bt.flush();
        bt.close();
        ft.close();
        System.out.println("success..");

    }
}
