package com.roshan;

import java.util.Scanner;

public class Switch_case2_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int day =in.nextInt();
/*
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("working days!!!");
                break;
            case 6:
            case 7:
                System.out.println("weekend days!!");
                break;
            default:
                System.out.println("Invalid !");
        }
*/
        //enhanced switch statements (go to yellow bulb in switch statement and click on enhanced statements)
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("working days!!!");
            case 6, 7 -> System.out.println("weekend days!!");
            default -> System.out.println("Invalid !");
        }

    }
}
