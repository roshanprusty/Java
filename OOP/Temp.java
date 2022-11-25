package com.OOP;

public class Temp {
    public static void main(String[] args) {
        int num=24;
        System.out.println(fun(num));
    }
    static int fun(int n)

    {

        int count = 0;

        for (int i = 0; i < n; i++)

            for (int j = i; j > 0; j--)

                count = count + 1;

        return count;

    }

}
