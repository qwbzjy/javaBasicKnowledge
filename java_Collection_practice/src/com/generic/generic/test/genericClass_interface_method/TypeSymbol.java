package com.generic.generic.test.genericClass_interface_method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author created by qwb on 2018/10/7 15:51
 */
public class TypeSymbol {
    public static void main(String[] args) {
        List<? super String > c = new ArrayList<String>();
        //c.add("adb");//报错，因为程序无法确定c集合中元素的类型，所以不能向其添加对象。
        // 下面就该引入带限通配符，来确定集合元素中的类型。
       c.add("adb");//设置？的下限通配符是string 的父类或本身，就不报错
        test(c);
        Class c1 = new ArrayList<Integer>().getClass();
        Class c2 = new ArrayList<String>().getClass();
        System.out.println(c1==c2);//true,泛型擦除
        /**
         * 这是因为不管为泛型的类型形参传入哪一种类型实参，对于Java来说，它们依然被当成同一类处理，在内存中也只占用一块内存空间。从Java泛型这一概念提出的目的来看，其只是作用于代码编译阶段，在编译过程中，对于正确检验泛型结果后，会将泛型的相关信息擦出，也就是说，成功编译过后的class文件中是不包含任何泛型信息的。泛型信息不会进入到运行时阶段。
         * */
    }
    public static void test(List<?> c){
        for (int i=0;i<c.size();i++){
            System.out.println(c.get(i));
        }
    }
}
