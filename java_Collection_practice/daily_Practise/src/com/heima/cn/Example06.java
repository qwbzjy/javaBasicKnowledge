package com.heima.cn;

public class Example06 {
    public static void main(String[] args){
        String str = "羽毛球-篮球-乒乓球";
        System.out.println(str.substring(4));
        System.out.println(str.substring(4,6));
        System.out.println("分割后的字符串数组中的元素依次为:");
        String[] strArray = str.split("-");
        for (int i=0;i<strArray.length;i++){
            if (i != strArray.length - 1) {
                System.out.println(strArray[i]+",");
            }else{
                System.out.println(strArray[i]);
            }
        }

        }
}
