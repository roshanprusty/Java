package com.pep;

public class GCD_LCM {
    public static int gcd(int a, int b){
        //The greatest common divisor (GCD) of two or more numbers is the greatest common factor number that divides them,
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public static int lcm(int a, int b) {
        // a*b = gcd(a,b) * lcm(a,b);
        // lcm(a*b) = (a*b) / gcd(a,b);
        int gcd = gcd(a, b);
        return a * b / gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcd(22,26));
        System.out.println(lcm(22,26));
    }
}
