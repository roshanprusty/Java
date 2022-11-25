package com.sem4;

import java.io.IOException;

public class ThrowDemo {
    public static void main(String[] args) {
        try
        {
            check(13);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void check(int age)throws IOException
    {

        if(age<18)
        {
            throw new IOException("Age not valid");

        }
        else
        {
            System.out.println("Welcome to Voting System");
        }
    }
}
