package com.pep;

public class prime {
    public static boolean pri(int num){
        if(num==1) return true;
        for (int i = 2; i*i<=num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(pri(23));
    }
}
