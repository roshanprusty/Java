package com.Math;

import java.util.Scanner;

public class PascalTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        System.out.println(sumOfRow(row));
    }

    static int sumOfRow(int row) {
        return 1<<(row-1); //1 has been left shifting (row-1) times
    }
}
