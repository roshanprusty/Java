package com.roshan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
/*
        int a=0,b=1,fab=0;
        for (int i=1;i<7;i++)
        {
            fab=a+b;
            a=b;
            b=fab;
        }
        System.out.println(fab);
    }
*/
        Scanner in = new Scanner(System.in);
        int fab = in.nextInt();
//        int x = 0;
//        int y = 1;
//
//        do
//        {
//            System.out.println(x);
//            y = x + y;
//            if (y < fab)
//            {
//                System.out.println(y);
//            }
//            x = x + y;
//        } while (x < fab);
//    }
        int ft = 0;
        int st = 1, nxt = 0;
        do {
            System.out.print(ft + " ");
            nxt = ft + st;
            ft = st;
            st = nxt;
        } while (nxt <= fab);
        System.out.println(ft);
    }
}