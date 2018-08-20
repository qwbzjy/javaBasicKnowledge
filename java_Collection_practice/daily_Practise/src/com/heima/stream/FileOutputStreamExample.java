package com.heima.stream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fout = new FileOutputStream("F:\\testout.txt");
//            fout.write(65);
//            fout.close();
//            System.out.println("success....");
//        }catch (Exception e){
//            System.out.println(e);
//        }
        try{
            FileOutputStream fout = new FileOutputStream("F:\\testout2.txt");
            String s = "Welcome to javaPoint";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
