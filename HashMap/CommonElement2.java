package com.HashMap;

import java.util.HashMap;

public class CommonElement2 {
    public static void main(String[] args) {
        String st1="qqqq";
        String str2="cqqc";
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i = 0; i < st1.length(); i++) {
            if(hm.containsKey(st1.charAt(i))){
                int store = hm.get(st1.charAt(i));
                hm.put(st1.charAt(i),store+1);
            }else hm.put(st1.charAt(i),1);
        }
        for (int i = 0; i < str2.length(); i++) {
            int store=1;
            if(hm.containsKey(str2.charAt(i))){
                store=hm.get(str2.charAt(i));
               if((store)<=0) hm.remove(str2.charAt(i));
               else{
                   hm.put(str2.charAt(i),store-1);
                   System.out.print(str2.charAt(i));
               }
            }


        }
    }
}
