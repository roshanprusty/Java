package com.HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Temp {
    public static void main(String[] args) {
        TreeMap<Character, Integer> hm = new TreeMap<>();
        String name="RoshanR";
        for (int i = 0; i < name.length(); i++) {
            hm.put(name.charAt(i), hm.getOrDefault(name.charAt(i),0)+1);
        }
        for (Character key: hm.keySet()) {
            Integer val =hm.get(key);
            System.out.println(key+ " "+val);
        }
    }
}
