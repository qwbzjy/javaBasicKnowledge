package com.heima.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) throws Exception{
      writerTest();
//        BufferWriterTest();
    }
    public static void writerTest()throws  Exception{
        Writer w = new FileWriter("output.txt");
        String content = "I love my country";
//        w.write(content);
        w.append(content);
        w.close();
        System.out.println("Done");
    }

    public static void BufferWriterTest()throws  Exception{
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("welcome to trc");
        bw.close();
        System.out.println("success");
    }
}
