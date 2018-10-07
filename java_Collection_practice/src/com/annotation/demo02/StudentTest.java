package com.annotation.demo02;

/**
 * @author created by qwb on 2018/9/14 10:58
 */
public class StudentTest {
    public static void main(String[] args) throws Exception {
        Student stu = new Student();
        stu.init();
        stu.show();
        stu.init("李四", 21, false);
        stu.show();
    }

}
