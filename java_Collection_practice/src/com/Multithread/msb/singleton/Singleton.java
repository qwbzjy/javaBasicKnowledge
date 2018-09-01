package com.Multithread.msb.singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

/**
 * http://www.cnblogs.com/xudong-bupt/p/3233643.html
 * 更好的是采用下面的方式，既不枷锁，也能实现懒加载（当我们需要的时候，才会创建）
 * @author created by qwb on 2018/9/1 11:22
 */
public class Singleton {
    private Singleton(){
        System.out.println("single");
    }
    private static class Inner{
        private static Singleton s = new Singleton();
    }

    public static Singleton getSingle(){
        return Inner.s;
    }

    public static void main(String[] args) {
        Thread[] ths = new Thread[200];
        for (int i=0;i<ths.length;i++){
            ths[i] = new Thread(()->{
               Singleton.getSingle();
            });
        }
        Arrays.asList(ths).forEach(o->o.start());
    }
}
