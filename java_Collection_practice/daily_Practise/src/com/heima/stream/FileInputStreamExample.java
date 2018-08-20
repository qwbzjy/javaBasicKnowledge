package com.heima.stream;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("F:\\testout2.txt");
            //int i = file.read();
//            System.out.println((char) i);//¶ÁÈ¡µ¥¸ö×Ö·û
            int i=0;
            while ((i=file.read())!=-1){
                System.out.println((char) i);
            }
            file.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
