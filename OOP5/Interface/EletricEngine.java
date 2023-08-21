package com.OOP5.Interface;

public class EletricEngine implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println("Brake applied");
    }

    @Override
    public void start() {
        System.out.println("Eletric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Eletric Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Eletric Engine accelerate");
    }
}
