package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String,Integer> map= new HashMap<>();
        map.put("sudheer",1234);
        map.put("surendra",45678);
        map.put(null,123);
        map.put(null,456);

       //boolean result= map.containsKey("surendra");

       if(map.containsKey("surendra")){
           System.out.println("surendra is present in the map");
       }

       if(map.containsValue(456)){
           System.out.println("123 is present in the map");
       }

       //based on key if you want to get value then we use get(key)

       Integer i= map.get("sudheer")+1;

        System.out.println("value of i ="+i);

        System.out.println(map);
        System.out.println(map.size());




    }
}
