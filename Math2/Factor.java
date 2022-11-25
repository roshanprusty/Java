package com.Math2;

import java.util.ArrayList;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        factor(num);
        factor2(num);
    }

    static void factor(int num){
        for (int i = 1; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                if(num/i==i) System.out.println(i);
                else{
                    System.out.print(i+" ");
                    System.out.print(num/i+" ");
                }
            }
        }
    }

    //printed the answer in sorted way :)
    static void factor2(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                if(num/i==i) System.out.println(i);
                else{
                    System.out.print(i+" ");
                    list.add(num/i);
                }
            }
        }
        for (int i = list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
