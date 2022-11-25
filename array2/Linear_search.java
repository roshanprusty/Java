package com.array2;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[] arr={2,4,9,66,77,88,99,101,121,131,147,158,196,210,224,225,693};
        int ser;

        System.out.println("enter the element you want to search");
        ser=in.nextInt();
        System.out.println(linear(arr,ser));


    }
    //search in the array : return the index if item found
    //other if item not found return -1
    static int linear(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        //this line will execute if none of the return statements above executed
        // hence the target not found
        return -1;
    }

}

