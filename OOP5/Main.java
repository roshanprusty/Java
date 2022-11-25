package com.OOP5;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(12);
        daughter.career();
        daughter.partner();

        Parent.hello();

        son.normal();
    }
}
