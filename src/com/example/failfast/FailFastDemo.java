package com.example.failfast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("hello","hey");
        map.put("java","world");
        map.put("book","bag");
        Iterator itr=map.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(map.get(itr.next()));
            map.put("spring","boot");
        }
    }
}
