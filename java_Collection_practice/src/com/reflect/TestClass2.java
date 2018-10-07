package com.reflect;

/**
 * @author created by qwb on 2018/10/7 17:23
 */
public class TestClass2 {
    public static void main(String[] args)throws Exception {
//        Class testTypeForname = Class.forName("TestClassType");
//        System.out.println("testForName----"+testTypeForname);

        Class testTypeClass = TestClassType.class;
        System.out.println("testTypeClass---"+testTypeClass);

        TestClassType testGetClass = new TestClassType();
        System.out.println("testGetClass---"+testGetClass.getClass());
    }
}
class TestClassType{
    public TestClassType(){
        System.out.println("构造函数-----------");
    }
    static {
        System.out.println("静态的参数初始化-------");
    }
    {
        System.out.println("非静态的参数初始化--------");
    }
}
