package com.OOP5.Interface;

public class PetrolEngine implements Brake, Engine{
    @Override
    public void brake() {
        System.out.println("Brake applied");
    }

    @Override
    public void start() {
        System.out.println("Petrol Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Petrol Engine accelerate");
    }
}
