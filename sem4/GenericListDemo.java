package com.sem4;

import java.util.ArrayList;
import java.util.List;

public class GenericListDemo {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(new Integer(72));
        numbersList.add(78);
        numbersList.add(81);
        int total = 0;
        for (int number : numbersList) {
            total = total + number;
        }
        System.out.println("total = " + total);
        List numwithoutgen = new ArrayList();
        numwithoutgen.add(new Integer(72));
        numwithoutgen.add(8.8f);
        numwithoutgen.add(81.1);
        numwithoutgen.add("lpu");
        System.out.println(numwithoutgen);




    }
}