package com.LinkedList;

public class Temp {
    public static void main(String[] args) {
        String s="Aa";
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s) {
        if(s.length()==1) return s;

        int l=0;
        boolean flag=false;
        String ans= String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j) && (j-i)>l){
                    //java.lang.CharSequence cannot be converted to java.lang.String
                    //that's why we have to cast
                    flag=isPalindrome((String) s.subSequence(i,j+1));
                }
                if(flag){
                    l=j-i;
                    ans= (String) s.subSequence(i,j+1);
                    flag=false;
                }
            }
        }
        return ans;
    }
    static boolean isPalindrome(String str){

        StringBuffer sb = new StringBuffer(str);
        if(str.equals(sb.reverse().toString())) return true;
        return false;
    }

}
