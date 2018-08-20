package com.heima.exception;

public class Testfunc {
    /** 从test、smallT和这个例子的运行结果中可以发现，try中的return语句调用的函数先于finally中调用的函数执行，也就是说return语句先执行，finally语句后执行。Return并不是让函数马上返回，而是return语句执行后，将把返回结果放置进函数栈中，此时函数并不是马上返回，它要执行finally语句后才真正开始返回。
     * 以finally中的return为准*/
    public static void main(String[] args) {
        System.out.println((new Testfunc()).test());
    }
    int test(){
        try {
            return func1();
        }finally {
            return func2();
        }
    }
    int func1(){
        System.out.println("func1");
        return 1;
    }
    int func2(){
        System.out.println("func2");
        return 2;
    }
}
