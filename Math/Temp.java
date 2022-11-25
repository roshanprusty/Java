package com.Math;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int newNum;

        //find the perfect square
        int check1 = (int)(Math.sqrt(num) * Math.sqrt(num));
        int check2 = (int)((Math.sqrt(num)+1) * (Math.sqrt(num)+1));
        if((num-check1)<(check2-num)){
            newNum = check1;
        }else newNum =check2;
        System.out.println(checkPrime(newNum));
    }

    static boolean checkPrime(int newNum) {
        for (int i = 2; i <=Math.sqrt(newNum); i++) {
            for (int j = 2; j < i/2; j++) {
                if(i%j==0)
                    return false;
            }
        }
        return true;
    }
}
