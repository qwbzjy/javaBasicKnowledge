package com.practices;

import java.util.*;

public class java_Collection {
    public static void main(String[]args){
        //list创建，添加对象，遍历
        List<String> list = new ArrayList<String>();
        list.add("com");
        list.add(".");
        list.add("hello");
        //迭代器遍历
        /*Iterator<String> listIterator = list.iterator();
        while(listIterator.hasNext()){
            String str = listIterator.next();
            System.out.println(str);
        }*/
        //for循环遍历
        /*for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/
        //for循环的另外一种遍历
        /*for(String str:list){
            System.out.println(str);
        }*/

        //Set创建，添加对象，遍历
        /*Set<String> set =new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("web");*/
        //迭代器遍历
          /* Iterator<String> st=set.iterator();
           while(st.hasNext()){
               String s = st.next();
               System.out.println(s);
           }*/
           //for遍历
        /*for(String str:set){
            System.out.println(str);
        }*/


        //Map创建，添加对象，遍历
        Map<Integer,String> map = new HashMap<Integer, String>();
           map.put(1,"A");
           map.put(2,"B");
           map.put(3,"C");
           map.put(4,"D");
           //传统的遍历map集合的方法：keySet()和entrySet()
            Set<Integer> sets = map.keySet();
            Iterator<Integer> it = sets.iterator();
            while(it.hasNext()){
                int key = it.next();
                String value = map.get(key);
                System.out.println(key + ":" +value);
            }
            //keySet()的速度比entrySet()慢了很多，也就是keySet方式遍历Map的性能不如entrySet性能好
        //为了提高性能，以后多考虑用entrySet()方式来进行遍历
        //keySet():迭代后只能通过get()取key
        //entrySet()：迭代后可以e.getKey()，e.getValue()取key和value。返回的是Entry接口
        //通过entrySet()方法将map集合中的映射关系取出（这个关系就是Map.Entry类型）
            //第一种
            Iterator it1 = map.entrySet().iterator();//效率高
            while(it1.hasNext()){
                Map.Entry entry = (Map.Entry)it1.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
            }
            //第二种
        Iterator it2 = map.keySet().iterator();//效率低
            while(it2.hasNext()){
                Object key = it2.next();
                Object vlaue = map.get(key);
            }
            //对于keySet其实是遍历了2次，一次是转为iterator，一次就从hashmap中取出key所对于的value。而entryset只是遍历了第一次，他把key和value都放到了entry中，所以就快了。
            //增强for循环遍历map集合的方法:keySet()和entrySet()
           Set<Integer> st1 = map.keySet();
           for(Object ob:st1){
               System.out.println(map.get(ob));
           }
           //List中放入Map值
            list.add(map.get(1));
            list.add(map.get(2));
            for (String str:list){
                System.out.println(str);
            }
            //向List中直接加入Map
            List ls2 = new ArrayList();
            Map map2= new HashMap<>();
            ls2.add(map2);

            /*
            *
            *
            * **/
    }
}
