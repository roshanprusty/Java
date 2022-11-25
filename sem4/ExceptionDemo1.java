package com.sem4;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String st[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the class");
        int x=sc.nextInt();
        int y=sc.nextInt();

        try
        {
            int d=x/y;


            System.out.println("result of x/y is"+d);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Happy Learning");


    }
}
