package com.ioStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class toLowerCase {
    public static void main(String[] args)throws IOException{
        String str = "HELLO WORLD";
        ByteArrayInputStream input = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int temp = 0;
        while((temp = input.read())!=-1){
            char ch = (char)temp;
            output.write(Character.toLowerCase(ch));
        }
        String outStr = output.toString();
        input.close();
        output.close();
        System.out.println(outStr);
    }
}
