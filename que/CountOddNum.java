package com.que;

public class CountOddNum {
    public static void main(String[] args) {
        int low=1;
        int high=7;
        System.out.println("The no of odds in the given interval "+ countOdds(low,high));
        System.out.println("The no of evens in the given interval "+ countEvens(low,high));

    }
    static int countOdds(int low, int high){
        //to find the no of odds in given interval

        if(low%2==0 && high%2==0)
        {
            return((high-low)/2);
        }

        return(((high-low)/2)+1);
    }
    static int countEvens(int low, int high){
        //to find the no of evens in given interval
        if(low%2!=0 && high%2!=0)
        {
            return((high-low)/2);
        }
        return (high-low)/2+1;
    }
    }

