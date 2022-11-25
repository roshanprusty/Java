package com.OOP3.Inheritance;

public class Main2 {
    public static void main(String[] args) {
        Temp obj = new Temp2();
        obj.belong(); //I belong to Temp2 class
        obj.grett(); //Hello ladies & gentlemen
        obj.abc(); //abc  //it is possible becoz temp2 class has extended temp class
//        obj.xyz(); --> ERROR --> we can't access the function of Temp2 class

        Temp2 obj2 = new Temp2();
        obj2.xyz(); //xyz
        obj2.belong(); //I belong to Temp2 class
        /* It has overridden the Temp1 function */


    }
}
