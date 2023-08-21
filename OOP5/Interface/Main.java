package com.OOP5.Interface;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.start();
//        car.acc();
//        car.stop();

        //how weird
//        Media carMedia = new Car();
//        car.start();

        NewCar car1 = new NewCar();
//        car1.engineStart();
//        car1.accelerate();
//        car1.musicStart();
//        car1.musicStops();
//        car1.engineStops();

        car1.engineStart();
        car1.accelerate();
        car1.engineStops();
        car1.upgradation();
        car1.engineStart();
    }
}
