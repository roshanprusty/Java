package com.que;

public class LC1790 {
    public static void main(String[] args) {
        String s1="caa", s2="caa";
        System.out.println(areAlmostEqual(s1,s2));
    }
    static boolean areAlmostEqual(String s1, String s2){
        int count = 0;
        char a='-', b='-';
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(count==0){
                    a = s1.charAt(i); //store the unmatched character of s1 string
                    b = s2.charAt(i); //store the unmatched character of s2 string
                    count++;
                }
                else if(count==1){
                    if(a==s2.charAt(i) && b == s1.charAt(i)){
                        count++;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(count == 1){
            return false;
        }
        return true;
    }
}
