package com.array2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
import java.util.*;
it will add all the classes which are there in java
drawback - it will be adding class which we don't need in ongoing file
the more class in the file the more size of the file will be that's why we should avoid writing this
*/

public class ArrayLists {
    public static void main(String[] args) {
        int[] arr={1,9,63,2,4,7};
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<>();

        //add elements
        list.add(0);
        list.add(211);
        list.add(213);
        list.add(33);

        System.out.println(list);  //[0, 211, 213, 33]

        //get elements
        int element=list.get(0);
        System.out.println(element);  //0

        //add element in between
        list.add(1,1);
        System.out.println(list); //[0, 1, 211, 213, 33]

        //set element
        list.set(0,5);
        System.out.println(list); //[5, 1, 211, 213, 33]

        //delete element
        list.remove(0);
        System.out.println(list); //[1, 211, 213, 33


        //size
        System.out.println(list.size()); //4

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " "); //1 211 213 33
        }

        System.out.println();

        //sorting
        Collections.sort(list); //this class is applicable for arraylist only for array it has different
        System.out.println(list); //[1, 33, 211, 213]


    }
}
