package com.heima.Innerclass;

public class OuterClass2 {
    private String str;

    public void outerDisplay(){
        System.out.println("outerClass........");
    }

    public class InnerClass{
        public void innerDisplay(){
            str = "qwb";
            System.out.println(str);
            outerDisplay();
        }
    }

//    public InnerClass getInnerClass(){
//        return new InnerClass();
//    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();


    }
}
