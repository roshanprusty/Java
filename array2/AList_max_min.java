package com.array2;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class AList_max_min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(99);
        al.add(6);
        al.add(85);
        al.add(44);

        System.out.println("the maximum value in given array: "+max(al));
        System.out.println("the minimum value in given array: "+min(al));

    }
    static int max(ArrayList<Integer> al){
        int maxi=0;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)>maxi){
                maxi= al.get(i);
            }
        }
        return maxi;
    }
    static int min(ArrayList<Integer> al){
        int mini= 10369852;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)<mini){
                mini= al.get(i);
            }
        }
        return mini;
    }
}
