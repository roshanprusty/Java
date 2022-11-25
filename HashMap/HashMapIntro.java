package com.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",140);
        hm.put("UAE",45);
        hm.put("USA",25);
        hm.put("Russia",75);
        hm.put("France",65);
        hm.put("Israel",90);
        System.out.println(hm);
        hm.put("Russia",71);
        hm.put("Japan",75);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Australia"));
        System.out.println(hm.containsKey("Japan"));
        Set<String> keys =hm.keySet();
        System.out.println(keys);
        for(String key: hm.keySet()){
            Integer val =hm.get(key);
            System.out.println(key+ " "+val);
        }

    }
}
