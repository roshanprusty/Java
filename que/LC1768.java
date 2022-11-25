package com.que;

public class LC1768 {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
    static String mergeAlternately(String word1, String word2){
        String temp="";
        int total;
        if(word1.length()>word2.length()) total=word1.length();
        else total=word2.length();
        for (int i = 0; i < total; i++) {
            if (i<word1.length()) temp+=word1.charAt(i);
            if (i<word2.length()) temp+=word2.charAt(i);
        }
        return temp;
    }
}
