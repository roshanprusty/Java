package com.roshan;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //take input from user till the user does not press x or X
        int ans=0;
        while(true){
            //take the operator as input
            System.out.print("enter the oprtator: ");
            char op= in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.print("enter the 2 num: ");
                int num1= in.nextInt();
                int num2=in.nextInt();

                if(op == '+'){
                    ans=num1+num2;
                }
                if(op == '-'){
                    ans=num1-num2;
                }
                if(op == '*'){
                    ans=num1*num2;
                }
                if(op == '%'){
                    ans=num1%num2;
                }
                if(op == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }
            }
            else if(op == 'x' || op == 'X')
            {
                System.out.println("----------------------------");
               break;
            }
            else {
                System.out.println("invalid operation");
            }
            System.out.println(ans);
            System.out.println("if you want to exit press 'x' or 'X'");
        }

    }
}
