package com.roshan;

import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max=a;
//        if(b>max)
//        {
//            System.out.println("b is greater!");
//        }
//        else if(c>max){
//            System.out.println("c is greater!");
//        }else{
//            System.out.println("a is greater!");
//        }

        int max=Math.max(a,Math.max(b,c));
        System.out.println(max);
}
}