package com.heima.stream;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("output.txt");
        int data = reader.read();
        while (data!=-1){
            System.out.println((char) data);
            data = reader.read();
        }
        reader.close();
    }
}
