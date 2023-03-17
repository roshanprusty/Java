package com;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(countHomogenous(s));
    }
    static int countHomogenous(String s) {
        char charArray[] = s.toCharArray();
        Arrays.sort(charArray);
        char check = charArray[0];
        int count=1;
        int ans=0;
        for(int i=1; i<s.length(); i++){
            if(check!=charArray[i]){
                check=charArray[i];
                count*=count+1;
                ans=count/2;
                count=1;
            }
            count++;
        }
        return ans;
    }
}
