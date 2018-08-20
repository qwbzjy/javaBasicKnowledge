package com.heima.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInPutStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("F:\\testout.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while((i=bin.read())!=-1){
            System.out.println((char) i);
        }
        bin.close();
        fin.close();
    }
}
