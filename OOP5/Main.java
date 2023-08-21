package com.OOP5;

public class Main {
    public static void main(String[] args) {
       Son son = new Son(23);
       son.carrer();
       son.partner();
        System.out.println(son.age);

       Parent daughter = new Daughter(33);
       daughter.carrer();
       daughter.partner();
        System.out.println(daughter.age);

//        Parent mom = new Parent(); //error: for abstract classes you cannot object

        Parent.greetings();

    }
}
