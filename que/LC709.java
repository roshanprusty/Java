package com.que;

public class LC709 {
    public static void main(String[] args) {
        String s="Roshan";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s){
        return s.toLowerCase();
    }
//    static String toLowerCase(String s) {
//        char[] cs = s.toCharArray();
//        for(int i = 0; i < cs.length; i++) {
//            if(cs[i] <= 90 && cs[i] >= 65) {
//                cs[i] += 32;
//            }
//        }
//        return String.valueOf(cs);
//    }
//}
}
