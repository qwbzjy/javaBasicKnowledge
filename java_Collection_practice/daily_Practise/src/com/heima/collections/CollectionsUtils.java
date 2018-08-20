package com.heima.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtils {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //集合只能存储引用类型
//        Collections.addAll(list,"c","E","G","A");
//        System.out.println("排序前："+list);
//
//        Collections.reverse(list);
//        System.out.println("反转后："+list);
//
//        Collections.sort(list);
//        System.out.println("自然顺序排序后:"+list);
//
//        Collections.shuffle(list);
//        System.out.println("洗牌后："+list);

        Collections.addAll(list,-3,2,9,5,8);
        System.out.println("集合中的元素： "+list);
        System.out.println("集合中最大的元素："+Collections.max(list));
        System.out.println("几何中最小的元素："+Collections.min(list));

        Collections.replaceAll(list,8,0);
        System.out.println("替换后的集合："+list);


    }
}
