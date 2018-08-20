package com.heima.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
//        hashSet();
        treeSet();
    }
    public static void hashSet(){
        HashSet set = new HashSet();
        set.add("Jack");
        set.add("Rose");
        set.add("tom");//set无序
        set.add("Rose");//set不允许重复


        Student stu1 = new Student("1","Jack");
        Student stu2 = new Student("2","tom");
        Student stu3 = new Student("3","rose");
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        Iterator it = set.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }

    public static void treeSet(){
        TreeSet ts = new TreeSet();
        ts.add("Jack");
        ts.add("Helena");
        ts.add("Helena");
        ts.add("Eve");
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class Student{
    String id;
    String name;
    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return id+":"+name;
    }
}
