package com.heima.cn;

import java.util.Calendar;

public class Example15 {
    public static void main(String[] args){
        /*int a = 20;
        Integer in =new Integer(a);
        System.out.println(in.toString());*/

        /*Integer num = new Integer(20);
        int a =10;
        int sum = num.intValue() + a;
        System.out.println("sum="+sum);*/

       /* Date d1 = new Date();
        Date d2 = new Date(96666666666L);
        System.out.println(d1);
        System.out.println(d2);*/

        /*Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+" "+month+ " "+date+" "+hour+" "+minute+" "+second);*/

        Calendar calendar = Calendar.getInstance();
        calendar.set(2008,7,8);
        calendar.add(Calendar.DATE,100);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int date = calendar.get(Calendar.DATE);
        System.out.println(year+" "+month+" "+date);


    }
}
