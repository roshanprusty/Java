package com.que;

public class LC389 {
    public static void main(String[] args) {
        String s="abc";
        String t="cabd";
        System.out.println(findTheDifference(s,t));
    }
    static char findTheDifference(String s, String t) {
        int totalS=0;
        int totalT=0;
        for (int i = 0; i < s.length(); i++) {
            totalS+=s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            totalT+=t.charAt(i);
        }
        return (char) (totalT-totalS);
    }
}
