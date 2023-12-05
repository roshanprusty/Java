package com.rangeQuery;

import java.util.Arrays;

public class SqrtDecomposition {
    //info
    //TC: o(sqrt(n))
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        int n = arr.length;
        int sqrt = (int)Math.sqrt(n);
        int[] blocks= new int[sqrt+1];
        int countBlocks=-1;
        for (int i = 0; i < n; i++) {
            if(i%sqrt==0){
                countBlocks++;
            }
            blocks[countBlocks]+=arr[i];
        }
        System.out.println(Arrays.toString(blocks));
        System.out.println(query(3,8, sqrt, arr, blocks));
    }
    public static int query(int l, int r, int sqrt, int[] arr, int[] blocks){
        int ans=0;

        //left part
        while (l!=0 && l%sqrt!=0 && l<r){
            ans+=arr[l];
            l++;
        }

        //middle part
        while (l+sqrt<=r){
            ans=blocks[l/sqrt]; //*
            l+=sqrt;
        }

        //right part
        while (l<=r){
            ans+=arr[l];
            l++;
        }

        return ans;
    }
}
