package com.Multithread.msb.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author created by qwb on 2018/9/1 13:00
 */
public class SynchronizedList {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        List<String> strsSync = Collections.synchronizedList(strs);
    }
}
