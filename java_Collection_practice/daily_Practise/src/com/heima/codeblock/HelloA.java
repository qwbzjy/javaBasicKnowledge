package com.heima.codeblock;

/**
 * @author created by qwb on 2018/10/7 17:41
 */
public class HelloA {
    /**
     * 对于一个类而言，按照如下顺序执行：

     执行静态代码块
     执行构造代码块
     执行构造函数
     对于静态变量、静态初始化块、变量、初始化块、构造器，它们的初始化顺序依次是（静态变量、静态初始化块）>（变量、初始化块）>构造器。
     * */
    public HelloA(){
        System.out.println("A3的构造函数");
    }
    {
        System.out.println("A2的构造代码块");
    }
    static {
        System.out.println("A1的静态代码块");
    }
    public static void main(String[] args){
        HelloA a = new HelloA();
        HelloA b = new HelloA();
    }
}
