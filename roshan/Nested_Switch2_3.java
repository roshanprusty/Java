package com.roshan;

import java.util.Scanner;

public class Nested_Switch2_3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the year");
        int year = in.nextInt();
        int marks;

        switch(year) //Switch expression
        {
            //Case statements
            case 1:
                System.out.println("First year students are not eligible for scholarship ");
                break;
            case 2:
                System.out.println("Second year students are not eligible for scholarship");
                break;
            case 3:
                System.out.println("enter the marks");
                marks = in.nextInt();
                switch(marks)
                {
                    case 50:
                        System.out.println("You are not eligible for scholarship");
                        break;
                    case 80:
                        System.out.println("Congrats!!!!! you are eligible for scholarship");
                        break;
                }
                break;
            //Default case statement
            default: System.out.println("Please enter valid year");
        }
    }
}
