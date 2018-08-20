package com.heima.collections;

class cachePool<T>{
    T temp;
    public void save(T temp){
        this.temp = temp;
    }
    public T get(){
        return temp;
    }

}
public class Type {
    public static void main(String[] args) {
        cachePool<Integer> pool = new cachePool<Integer>();
        pool.save(new Integer(1));
        Integer temp = pool.get();
        System.out.println(temp);
    }
}
