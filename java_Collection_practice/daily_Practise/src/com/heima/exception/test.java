package com.heima.exception;

public class test {
    public static void main(String[] args) {
        System.out.println((new test()).test());
    }
    static int test(){
        int x=1;
        try{
            return x;
//            x+=2; //3
//            return x+=2; //3
        }finally {
//            ++x;  //1
//            x = 2; //1
//            return 2; //2
//            return ++x;  //2
//            x+=2; //1
//            return x+=2;
            return x++; //1
        }
    }
}
