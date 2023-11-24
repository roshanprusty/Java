package com.OOP6.ShallowAndDeepCopy;

import java.util.Arrays;

public class Shallow {
    public static void main(String[] args) {
        //shallow copy - The object which you have copying, it will not create the new copy, it will just point to that variable.
        int[] arr = {1,2,3};
        int[] nums= new int[arr.length];
        System.arraycopy(arr,0, nums,0, arr.length);
        nums[0]=-1;
        System.out.println(Arrays.toString(arr)); //[100, 2, 3]
        System.out.println(Arrays.toString(nums)); //[100, 2, 3]

        String name="Roshan";
        String lname=name;
        lname="sai";
        System.out.println(name+" "+lname); //sai Roshan
    }
}
//Primitive data type:
// int, short, long, boolean, double, float
//Primitive data types have fixed sizes in memory
//Immutability: Primitive data types are immutable, meaning their values cannot be changed once they are assigned.
             // Operations on primitive types create new values rather than modifying existing ones.

//Non-primitive data type
//array, strings, classes, interfaces, enums,
//Size in Memory: Unlike primitive types, the size of non-primitive types is not fixed and depends on the complexity of the data they represent
//Default Values: Default values for non-primitive types are null. When you declare a non-primitive variable, it is initially set to null until you assign an actual object to it.
//Mutable: Most non-primitive types are mutable, meaning their content can be changed after creation.
//Garbage Collection: Java's garbage collector is responsible for automatically reclaiming memory occupied by objects that are no longer reachable.
