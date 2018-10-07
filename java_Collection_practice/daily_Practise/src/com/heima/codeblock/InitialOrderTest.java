package com.heima.codeblock;

/**
 * @author created by qwb on 2018/10/7 17:46
 */
public class InitialOrderTest {
    public static String staticField = "静态变量";
    public String field = "变量";

    static{
        System.out.println(staticField);
        System.out.println("静态初始化块");
    }
    {
        System.out.println(field);
        System.out.println("构造初始化块");
    }
    public InitialOrderTest(){
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        new InitialOrderTest();
    }

}
