//Write code to calculate roots of a quadratic equation.
//
//        Write a class QuadraticRoots with main method. The method receives three arguments, write code to parse them into double type.
//
//        For example:
//        if the values 2, 5, 3 are passed as arguments, then the output should be First root is : -1.0 Second root is : -1.5

//        If the values 3, 2, 1 are passed then the output should be Roots are imaginary
//        Similarly, if the values 2, 4, 2 are passed then the output should be Roots are equal and value is : -1.0
//        Note: Make sure to use the print() and not the println() method.
//
//        Note: Please don't change the package name.
package com.roshan;
import java.lang.Math;

public class Quad {
    public static void main(String[] args) {
        double num1=Double.parseDouble(args[0]);
        double num2=Double.parseDouble(args[1]);
        double num3=Double.parseDouble(args[2]);


        double quad1,quad2,imag;

        //imaginary
        imag=(num2*num2) - 4*num1*num3;
        if(imag<0){
            System.out.println("Roots are imaginary");
        }else {
            quad1 = (num2 * num2) - 4 * num1 * num3;
            quad1 = (-num2) + Math.pow(quad1, 0.5);
            quad1 /= 2 * num1;

            quad2 = num2 * num2 - 4 * num1 * num3;
            quad2 = (-num2) - Math.pow(quad2, 0.5);
            quad2 /= 2 * num1;

            if(quad1 == quad2){
                System.out.print(quad1);
            }
            else {

                System.out.print(quad1 + " ");
                System.out.print(quad2);
            }
        }

    }

}
