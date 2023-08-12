package com;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Temp {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,4,5};
        int ans=0;
        for(int i:arr){
            ans^=i;
        }
        System.out.println(ans);
    }
}
