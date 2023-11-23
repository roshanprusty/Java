package com.OOP6.ObjectCloning;

public class Main {
    public static void main(String[] args) {
        //object cloning
        Sample rnp = new Sample("Roshan", 21);
        Sample sai = new Sample(rnp);
        System.out.println(sai.name);
    }
}
