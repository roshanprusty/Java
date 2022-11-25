package com.HashMap;

import java.util.HashMap;

public class HighFreqCh {
//    In this question, you are given a string str and are required to find the character with maximum frequency.
    public static void main(String[] args) {
    String str = "abcaabcd";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                int store = hm.get(str.charAt(i));
                hm.put(str.charAt(i),store+1);
            } else hm.put(str.charAt(i),1);
        }
        int maxF=0;
        char ch = 0;
        for(Character key: hm.keySet()){
            if(maxF<hm.get(key)){
                maxF=hm.get(key);
                ch=key.charValue();
            }
        }
        System.out.println(ch + " " +maxF);
    }
}

