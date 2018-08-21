package com.generic;

public class GenType<T> {
    private T t;
    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t = t1;
    }
}
