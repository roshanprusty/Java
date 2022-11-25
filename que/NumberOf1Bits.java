package com.que;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n=1011111;
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n){
        int count=0;
        // returns the string representation of the unsigned int value
        // represented by the argument in binary (base 2)
        String s =Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1') count++;
        }
        return count;
    }
}

