package com.roshan;
import java.util.Scanner;
public class Switch_case2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits =in.next();



/*
        switch (fruits) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            case "grapes":
                System.out.println("a small fruits");
                break;
            default:
                System.out.println("pls enter a valid fruit");
                break;
        }
*/
        //enhanced switch statements (go to yellow bulb in switch statement and click on enhanced statements)
        switch (fruits) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("a small fruits");
            default -> System.out.println("pls enter a valid fruit");
        }



    }
}
