package com.pattern;

import java.util.Scanner;

public class pat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern17(n);

    }
    static void pattern30(int n){
        int noOfSpaces= n;
        for (int row = 1; row <=n; row++) {
            for (int space = 1; space <noOfSpaces; space++) {
                System.out.print(" ");
            }
            noOfSpaces--;
            for (int i = row; i >=1 ; i--) {
                System.out.print(i);
            }
            for (int j = 2; j <=row ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 0; row<2*n; row++) {
            //variable = Expression1 ? Expression2: Expression3
            int totalColsInRow = (row > n) ? ((2 * n) - row) : row;

            int noOfSpaces = n - totalColsInRow;
            for(int s =0; s<noOfSpaces; s++){
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
    static void pattern7(int n){
        int temp=n;
        for (int row = 1; row <=temp; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");
            }
            n--;
            System.out.println();
        }
    }
    static void pattern6(int n){
        int temp=n;
        for (int row = 1; row <=temp; row++) {
            for (int col = 1; col <n; col++) {
                System.out.print(" ");
            }
            for (int print = 1; print <=row; print++) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
    static void pattern5(int n){
        int temp;
        for (int row=1; row <= 2*n-1; row++) {
            temp = row > n ? n - (row - n) : row;
            for (int col = 1; col <= temp ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 0; row <n; row++) {
            for (int col = n-row; col >0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 0; col <=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }




}
