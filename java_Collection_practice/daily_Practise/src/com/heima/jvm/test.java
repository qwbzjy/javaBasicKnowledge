package com.heima.jvm;

/**
 * @author created by qwb on 2018/10/6 15:19
 */
public class test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton1 value1: "+ singleton.value1);
        System.out.println("Singleton1: "+singleton.value2);

        Singleton2 singleton2 = Singleton2.getInstance2();
        System.out.println("Singleton2 value1: "+singleton2.value1);
        System.out.println("Singleton2 value2: "+singleton2.value2);
    }
}

class Singleton{
    private static Singleton singleton = new Singleton();
    public static int value1;
    public static int value2= 0;

    private Singleton(){
        value1++;
        value2++;
    }
    public static Singleton getInstance(){
        return singleton;
    }
}

class Singleton2{
    public static int value1;
    public static int value2 = 0;
    private static Singleton2 singleton2 = new Singleton2();//与Singleton1的位置不同

    private Singleton2(){
        value1++;
        value2++;
    }
    public static Singleton2 getInstance2(){
        return singleton2;
    }
}
/**
 * Singleton1 value1: 1
 Singleton1: 0
 Singleton2 value1: 1
 Singleton2 value2: 1
 * */
