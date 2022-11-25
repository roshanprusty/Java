package com.OOP6.comparision;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main{
    public static void main(String[] args) {
        Student rahul = new Student(59,69.36f);
        Student raj = new Student(5,96.36f);
        Student piyush = new Student(51,90.36f);
        Student karan = new Student(25,86.36f);
        Student sanjay = new Student(10,59.36f);


        //here compiler will be confused bcz here 2 arguments are there.
        //to solve this problem we have to implement comparable in class file.
        //so to compare the value this is not the convenient way.
//        if(raj.marks>rahul.marks){
//            System.out.println("raj has more marks");
//        }

        Student[] list ={rahul, raj, piyush, karan, sanjay};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));;

//        if(raj.compareTo(rahul)>0){
//            System.out.println("raj has more marks");
//        }
    }
}
