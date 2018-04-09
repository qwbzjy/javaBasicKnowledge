package com.ioStream;



import java.io.*;

public class hello {
    /*
    * 字节流，读文件内容
    * InputStream、OutputStream、Reader、Writer、FileInputStream、FileOutputStream、FileReader、FileWriter。前四个是抽象类，后四个是操作文件的具体类。而且这八个类分成两组，一组操作字节流，一组操作字符流。很简单的对立分组。
    * InputStreamReader 是沟通字节流和字符流的桥梁。同样的桥梁还用用于输出的 OutputStreamWriter
    *
    * ByteArrayInputStream、StringBufferInputStream、FileInputStream 是三种基本的介质流，它们分别从Byte 数组、StringBuffer、和本地文件中读取数据。PipedInputStream 是从与其它线程共用的管道中读取数据
    *
    * ObjectInputStream 和所有FilterInputStream的子类都是装饰流（装饰器模式的主角）。意思是FileInputStream类可以通过一个String路径名创建一个对象，FileInputStream(String name)。而DataInputStream必须装饰一个类才能返回一个对象，DataInputStream(InputStream in)
    *
    * ByteArrayOutputStream、FileOutputStream是两种基本的介质流，它们分别向Byte 数组、和本地文件中写入数据。PipedOutputStream 是向与其它线程共用的管道中写入数据，

ObjectOutputStream 和所有FilterOutputStream的子类都是装饰流
    * */
    public static void main(String[] args)throws IOException{

        java.lang.String filename = "F:"+ File.separator+"hello.txt";
        File f = new File(filename);
        InputStream in = new FileInputStream(f);
        byte[] b = new byte[1024];
        //in.read(b);
        int len = in.read(b);
        in.close();
        System.out.println("读入的长度为："+len);
        System.out.println(new java.lang.String(b,0,len));
        //System.out.println(new java.lang.String(b));

        //逐字节读取文件
        /*String filename = "F:"+File.separator+"hello.txt";
        File f = new File(filename);
        InputStream in = new FileInputStream(f);
        byte[] b = new byte[(int)f.length()];
        for(int i=0;i<b.length;i++){
            b[i] = (byte)in.read();
        }
        in.close();
        System.out.println(new String(b));*/

        //字节流读取文件,当读到文件末尾的时候会返回-1.正常情况下是不会返回-1的
        /*String filename = "F:"+File.separator+"hello.txt";
        File f = new File(filename);
        InputStream in = new FileInputStream(f);
        byte[] b = new byte[1024];
        int count = 0;
        int temp = 0;
        while((temp = in.read())!= (-1)){
            b[count++] = (byte)temp;
        }
        in.close();
        System.out.println(new String(b));*/

        //字节流，向文件中写入字符串
        /*String filename = "F:"+File.separator+"hello.txt";
        File f = new File(filename);
        OutputStream out = new FileOutputStream(f,true);//true表示追加
        String str = "\r\nhangzhou";
        byte[] b = str.getBytes();
        out.write(b);
        out.close();*/


    }
}
