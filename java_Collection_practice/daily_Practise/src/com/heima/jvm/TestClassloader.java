package com.heima.jvm;

/**
 * @author created by qwb on 2018/10/6 16:00
 */
public class TestClassloader {
    public static void main(String[] args) {
        // String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
        System.out.println(String.class.getClassLoader());
        // Test class is loaded by Application loader
        System.out.println(TestClassloader.class.getClassLoader());
    }
}
/**
 * null
 sun.misc.Launcher$AppClassLoader@18b4aac2
 * */