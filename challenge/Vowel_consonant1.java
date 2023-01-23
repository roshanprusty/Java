package com.challenge;

import java.util.Scanner;

public class Vowel_consonant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        //Ascii vale
        //65-90 (A-Z)
        //97-122 (a-z)
        int in = (int)(input);
        in = (in>=97 && in<=122) ? (in-32) : (in);
        if(in == 65 || in == 69 ||in == 73|| in == 79 || in == 85) System.out.println("Vowel");
        else if(in>=65 && in<=90) System.out.println("Consonant");
        else System.out.println("Invalid Syntax");
    }
}
