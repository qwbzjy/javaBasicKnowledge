package com.heima.codeblock;

/**
 * @author created by qwb on 2018/10/7 17:49
 */
  class HelloC {
    public HelloC(){
        System.out.println("C的构造函数");
    }
    {
        System.out.println("C的构造代码块");
    }
    static {
        System.out.println("C的静态代码块");
    }
}
 public  class HelloD extends HelloC{
    public HelloD(){
        System.out.println("D 的构造函数");
    }
    {
        System.out.println("D的构造代码块");
    }
    static {
        System.out.println("D的静态代码块");
    }

    public static void main(String[] args) {
        HelloD d = new HelloD();
    }
}
