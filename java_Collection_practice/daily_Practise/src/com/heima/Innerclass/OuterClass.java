package com.heima.Innerclass;

public class OuterClass {
    /**
    *  ��Java���ڲ�����Ҫ��Ϊ��Ա�ڲ��ࡢ�ֲ��ڲ��ࡢ�����ڲ��ࡢ��̬�ڲ��ࡣ
     �ڳ�Ա�ڲ�����Ҫע�����㣬��һ����Ա�ڲ����в��ܴ����κ�static�ı����ͷ������ڶ�����Ա�ڲ�������������Χ��ģ�����ֻ���ȴ�������Χ����ܹ������ڲ��ࡣ
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
