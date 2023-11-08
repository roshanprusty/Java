package com.OOP5;

public class Main {
    public static void main(String[] args) {
        Parent kishor = new StepDaughter(2, 22);
        kishor.partner();
        kishor.greetings();

        Temp t = new Temp2("Roshan", 22);
        t.hello();
    }
}
