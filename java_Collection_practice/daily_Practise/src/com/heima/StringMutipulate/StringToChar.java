package com.heima.StringMutipulate;

public class StringToChar {

    public static void main(String[] args) {
//        stringArrayToString();
//        charArrayTostring();
        intTostring();
    }

    public static void stringArrayToString(){
        String[] str = {"a","b","c"};
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
        System.out.println("------×Ö·û´®Êý×éµ½×Ö·û´®--------");
        System.out.println(sb.toString());
    }

    public static void charArrayTostring(){
        String str = "123abc";
        char[] ar = str.toCharArray();
        for(int i=0;i<ar.length;i++){
            System.out.println("------×Ö·û´®µ½×Ö·ûÊý×é---------");
            System.out.println(ar[i]);
        }
        System.out.println("-----×Ö·ûÊý×éµ½×Ö·û´®------");
        System.out.println(new String(ar));

        System.out.println("-------test------------");
        String[] arr = str.split("");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void intTostring(){
        System.out.println(Integer.toString(1));
        System.out.println(Integer.valueOf("a").intValue());

    }
}
