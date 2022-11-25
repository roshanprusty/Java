package com.string;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
        System.out.println("Substring of given name is " + name.substring(0,5));
    }
}
