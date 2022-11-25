package com.roshan;

public class Fun_oerloading3_9 {
    public static void main(String[] args) {

        /*
        function overloading--- the name of function can be same but the argument has to be different then only function can work otherwise it will throw error
        at compile time it will decide which function to run.
        */
        fun(67);
        fun("roshan");

        /*
        fun() ----> if i don't add anything then which one will it run ?
                ans- it will show an error bcz compiler will be unable to know which one to run (it is known as ambiguities)
        */
    }
    static  void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static  void fun(String a){
        System.out.println("second one");
        System.out.println(a);
    }
}
