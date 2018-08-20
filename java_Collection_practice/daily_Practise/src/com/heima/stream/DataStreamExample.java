package com.heima.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class DataStreamExample {
    public static void main(String[] args)throws Exception{
//       byteArrayTest();
        readExample();
    }
    public static void byteArrayTest()throws  Exception{
        FileOutputStream fout1 = new FileOutputStream("F:\\f1.txt");
        FileOutputStream fout2 = new FileOutputStream("F:\\f2.txt");
        /**Java ByteArrayOutputStream class is used to write common data into multiple files. In this stream, the data is written into a byte array which can be written to multiple streams later.
         *
         */
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();
        System.out.println("Success..");
    }

    public static void readExample(){
        byte[] buf = {35,36,37,38};
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while((k = byt.read())!=-1){
            char ch = (char)k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }

}
