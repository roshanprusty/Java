package com.OOP3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(7,8,9);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        Box box2 = new Box(box1);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        BoxWeight box3 = new BoxWeight(4,3,2,1);
        System.out.println(box3.l + " " + box3.w + " " + box3.h + " "+ box3.weight);

        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w);
//        System.out.println(box5.weight); --->error

        //there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i.e, BoxWeight
        //hence, you should have access to weight variable
        //this also means, that the ones you are trying to access should be initialised
        //but here, when the obj itself is of type parent class, how will you call the constructor of child class
        //this is why error
//        BoxWeight box6 = new Box(2,3,4);
//        System.out.println(box6.weight);

        BoxPrice box8 = new BoxPrice(2,3,4,5,6);
        System.out.println(box8.w);

        BoxPrice box9 = new BoxPrice(box1,24,26);
        System.out.println(box9.weight);



    }
}
