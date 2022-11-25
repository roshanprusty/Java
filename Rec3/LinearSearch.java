package com.Rec3;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];  //it will create 5 empty spaces not 6.
        for (int i = 0; i <arr.length; i++) {
            System.out.println("value for index "+i);
            arr[i] = in.nextInt();
        }
        System.out.println("enter the value you want to search");
        int value = in.nextInt();

        search(arr,value,0);
        System.out.println(list);

//        System.out.println(search2(arr,value,0, new ArrayList<>()));
    }
    /*
    1- we have to return the index whether it is there or not
    2- if the targeted value is there more than one then return that index also
    so to deal this problem we will use array list concept
    to print array list there is a numerous way lets see --->
    */

    //1st way ->
    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr, int value, int index) {
        if(arr[index]==value) {
            list.add(index);
        }
        //base condition
        if(index == arr.length-1) {
            return;
        }
       search(arr,value,index+1);
    }

    //2nd way->
    static ArrayList<Integer> search2(int[] arr, int value, int index, ArrayList<Integer> list1) {
        if(arr[index]==value) {
            list1.add(index);
        }
        //base condition
        if(index == arr.length-1) {
            return list1;
        }
        return search2(arr,value,index+1,list1);
    }
}
