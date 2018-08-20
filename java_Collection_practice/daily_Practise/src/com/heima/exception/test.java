package com.heima.exception;

public class test {
    public static void main(String[] args) {
        System.out.println((new test()).test());
    }
    static int test(){
        int x=1;
        try{
            return x;
        }finally {
            ++x;
        }
    }
}
