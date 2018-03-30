package com.exception;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args){
        System.out.println("--计算器--");
        CMDCalculate();
    }
    public static void CMDCalculate(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rs = devide(n1,n2);
        System.out.println("result: "+rs);
        sc.close();
    }
    public static int devide(int num1, int num2){
        return num1/num2;
    }
    /**
     * try中让可能发生异常的代码，catch用于捕捉异常；
     * try后可以有多个catch块，如发生异常，只会捕捉一个，一般多个catch中的异常类型存在父子类关系，应该将子类异常放在前面，保证每个异常的意义，异常匹配是从上往下寻找的。
     * finally块通常是可选的。无论异常是否发生，异常是否匹配被处理，finally都会执行。一个try至少要有一个catch块，否则， 至少要有1个finally块。但是finally不是用来处理异常的，finally不会捕获异常。
     *
     * finally主要做一些清理工作，如流的关闭，数据库连接的关闭等。
     *
     * 只有一种方法让finally块不执行：System.exit()。
     *
     *
     * Throwable:Error和Exception
     * Error:VirtulMachineError(StackOverFlowError和OutOfMemoryError)和AWTError
     * Exception(IOException[EOFException和FileNotFoundException]和RuntimeExcetption[空值对象引用、除数为零或数组越界]
     *
     * Java的异常(包括Exception和Error)分为可查的异常（checked exceptions）和不可查的异常（unchecked exceptions）
     * 可查异常（编译器要求必须处置的异常）
     * 除了RuntimeException及其子类以外，其他的Exception类及其子类都属于可查异常。这种异常的特点是Java编译器会检查它，也就是说，当程序中可能出现这类异常，要么用try-catch语句捕获它，要么用throws子句声明抛出它，否则编译不会通过
     *
     *
     *
     *
     *
     * */
}
