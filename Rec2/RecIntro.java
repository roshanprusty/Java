package com.Rec2;

import java.util.Scanner;

public class RecIntro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        print(num);
    }

    static void print(int num) {
        //base condition
        if(num==0){
            return;
        }
        print(num-1);
        System.out.println(num);
    }
}
