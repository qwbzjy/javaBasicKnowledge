package com.generic.generic.test.genericClass_interface_method;

/**
 * @author created by qwb on 2018/10/7 15:29
 */
public class Container<K,V> {
    private K key;
    private V value;

    public Container(K k,V v){
        key = k;
        value = v;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public void setKey(K key){
        this.key = key;
    }
    public void setValue(V value){
        this.value = value;
    }

    public static void main(String[] args){
        Container<String,String> c1=new Container<String ,String>("name","hello");
        Container<String,Integer> c2=new Container<String,Integer>("age",22);
        Container<Double,Double> c3=new Container<Double,Double>(1.1,1.3);
        System.out.println(c1.getKey() + " : " + c1.getValue());
        System.out.println(c2.getKey() + " : " + c2.getValue());
        System.out.println(c3.getKey() + " : " + c3.getValue());
    }

}
