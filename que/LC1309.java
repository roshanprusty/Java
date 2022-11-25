package com.que;
import java.util.Arrays;
public class LC1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
    static String freqAlphabets(String s){
        String ans="";
        String finalAns="";
        for (int i = s.length()-1; i >=0; i--) {
            int check=(int)s.charAt(i)-48;
            if(check<=9 && s.charAt(i)!='#'){
                ans+=(char)(check+96);
            }else if(s.charAt(i)=='#'){
                String temp="";
                temp+=s.charAt(i-2);
                temp+=s.charAt(i-1);
                ans+=(char)(Integer.parseInt(temp)+96);
                i-=2;
            }
        }

        for (int i=ans.length()-1; i>=0; i--)
        {
            finalAns+= ans.charAt(i);
        }
        return finalAns;
    }
}
