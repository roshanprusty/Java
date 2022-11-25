package com.stack_queue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Temp {
    public static void main(String[] args) {
        int[] heights ={0,0};
        System.out.println(largestRectangleArea(heights));
    }
    static int largestRectangleArea(int[] heights) {
        if(heights.length==1){
            return heights[0];
        }
        ArrayList<Integer> k= new ArrayList<>();
        for (int i = 0; i < heights.length-1; i++) {
            if(heights[i]<heights[i+1]) k.add(heights[i]);
            if(heights[i]==heights[i+1]) k.add(heights[i]);
        }
        Collections.sort(k); // Sorting ArrayList in ascending Order
        return k.get(k.size()-1)*2;
    }
}
