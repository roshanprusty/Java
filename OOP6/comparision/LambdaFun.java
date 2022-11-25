package com.OOP6.comparision;

import java.util.ArrayList;

public class LambdaFun {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        //item represent every item in arr one by one
        arr.forEach((item)-> System.out.println(item*2));
    }

}
