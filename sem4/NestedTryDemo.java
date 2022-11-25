package com.sem4;

//import static sun.security.util.Debug.args;

public class NestedTryDemo {
    public static void main(String args[]) throws InterruptedException {
/*
        try {
            int a = Integer.parseInt(args[0]);
        try {
            int b = Integer.parseInt(args[1]);
            System.out.println(a/b);
            }
       catch (ArithmeticException e)
            {
            System.out.println("Div by zero error!");
            }
            }
       catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Need 2 parameters!");
            }
 */


 /*      System.out.println("Before sleep...");
          Thread.sleep(2000);
         System.out.println("After sleep...");  */

        String text1 = "33";
        String text2 = "44a";
        System.out.println("before parsing text1");
        int value1 = Integer.parseInt(text1);
        System.out.println("value1 = " + value1);
        try {
            int value2 = Integer.parseInt(text2);
            System.out.println("value2 = " + value2);
        } catch (NumberFormatException e) {
            System.out.println("could not parse text2 = " + text2);
        }
    }
}

