package com.heima.Innerclass;

public class OuterClass {
    /**
    *  在Java中内部类主要分为成员内部类、局部内部类、匿名内部类、静态内部类。
     在成员内部类中要注意两点，第一：成员内部类中不能存在任何static的变量和方法；第二：成员内部类是依附于外围类的，所以只有先创建了外围类才能够创建内部类。
    * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public class InnerClass{
        public InnerClass(){
            name = "qwb";
            age = 20;
        }
        public void display(){
            System.out.println("name: "+getName()+";age: "+getAge());
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }
}
