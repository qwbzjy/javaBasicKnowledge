package com.collections;


import java.util.HashMap;
import java.util.Map;

public class mapPut {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();

        /*说明：put方法返回值为null或者value；
如果key没有重复，put成功，则返回null，如p1、p2；

如果key重复了，返回的是map.get(key)，也就是当前这个key对应的value，如上面的p3，key="11"，而p1的key也是"11"，p1与p3重复，返回的是p1的value="22"，并且将p3覆盖掉p1
        * */
        String p1 = map.put("11","22");
        System.out.println("p1:"+p1);

        String p2 = map.put("33","44");
        System.out.println("p2:"+p2);

        String value1 = map.get("11");
        System.out.println("value1:"+value1);

        String p3 = map.put("11","44");
        System.out.println("p3:"+p3);

        String value2 = map.get("11");
        System.out.println("value2:"+value2);
    }
}
