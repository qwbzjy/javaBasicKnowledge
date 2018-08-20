package com.heima.collections;

import java.util.*;

public class List {

    public static void main(String[] args) {
        //ctrl+alt+L 格式化代码
        arrayList();
//        linkedList();
//        vectorList();
    }

    public static void arrayList() {
        ArrayList list = new ArrayList();
        list.add("s1");
        list.add("s2");
        list.add("s1");//list允许元素重复
        list.add(3, "s3");

        System.out.println(list.set(0,"s0"));
        //遍历第一种方法
//        for(int i=0;i < list.size();i++){
//            System.out.println(list.get(i));
//        }
////        遍历第二种方法
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);
//        }
//
//        //遍历第三种方法  jdk5以后
//        for (Object obj : list) {
//            System.out.println(obj);
//        }
//        System.out.println("list长度: "+list.size());
//        System.out.println("list第二个位置的元素： "+list.get(2));

    }

    public static void linkedList(){
        LinkedList link = new LinkedList();
        link.add("1");
        link.add("2");
        link.add(2,"stu2");
        link.addFirst("First");
        for(int i=0;i<link.size();i++){
            System.out.println(link.get(i));
        }

        for (Object obj :
                link) {
            System.out.println(obj);
        }

        Iterator it = link.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }

    public static void vectorList(){
        Vector v = new Vector();
        v.add("tom");
        v.add("jaak");
        Enumeration en = v.elements();
        while(en.hasMoreElements()){
            Object obj = en.nextElement();
            System.out.println(obj);
        }
    }

}

