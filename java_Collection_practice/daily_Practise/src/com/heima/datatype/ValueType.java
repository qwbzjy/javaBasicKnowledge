package com.heima.datatype;

/**
 * @author created by qwb on 2018/10/7 9:31
 */
public class ValueType {
    public static void main(String[] args) {
        int a=2;
        int b=2;
        int c=2;
        Integer aa = new Integer(a);
        System.out.println(aa.hashCode());
        System.out.println(System.identityHashCode(aa));
    }
}
