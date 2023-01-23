package com.challenge;

import java.util.Scanner;

public class Check_Alphabet1_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int in = (int)(ch);
        if((in>=65 && in<=90) && (in>=97 && in<=122)) System.out.println("Alphabet");
        else System.out.println("Not Alphabet");
    }
}
