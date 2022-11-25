package com.roshan;

import java.util.Scanner;

public class Armstrong3_11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int arm=0;
        int digits;
        int temp=num;
        if(num<0){
            digits=num*-1;
        }else{
            digits=(int)(Math.log10(num))+1;
        }
        while(temp>0){
            arm+=Math.pow(temp%10,digits);
            temp/=10;
        }
        if(num==arm){
            System.out.println("the given num "+num+" is armstrong num");
        }else{
            System.out.println("the given num "+num+" is not a armstrong number");
        }

    }
}