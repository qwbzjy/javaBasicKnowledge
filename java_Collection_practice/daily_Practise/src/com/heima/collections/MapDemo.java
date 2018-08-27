package com.heima.collections;

import java.util.*;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
       hashMap();
//        propertites();
    }
    public static void hashMap(){
        Map mp = new HashMap();
        mp.put("1","Jack");
        mp.put("2","Tom");
        mp.put("3","Rose");
        //第一种遍历
        Set keySet = mp.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            Object value = mp.get(obj);
            System.out.println(obj+":"+value);
        }
        //第二种遍历
        Set entrySet = mp.entrySet();
        Iterator esit = entrySet.iterator();
        while (esit.hasNext()){
            Map.Entry entry = (Map.Entry)esit.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+":"+value);
        }
        //第三种遍历方式
        Collection values = mp.values();
        Iterator itc = values.iterator();
        while (itc.hasNext()){
            Object value = itc.next();
            System.out.println(value);
        }

    }
    //properties是hashtable的子类
    public static void propertites(){
        Properties p = new Properties();
        p.setProperty("1","red");
        p.setProperty("2","green");
        p.setProperty("3","yellow");
        Enumeration names = p.propertyNames();
        while(names.hasMoreElements()){
            String key = (String) names.nextElement();
            String value = p.getProperty(key);
            System.out.println(key+"="+value);
        }
    }



}
