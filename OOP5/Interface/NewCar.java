package com.OOP5.Interface;

public class NewCar {
    private Engine Engine;
    private CDPlayer musicPlayer=new CDPlayer();
    public NewCar(){
        Engine=new PetrolEngine();
    }

    void engineStart(){
        Engine.start();
    }
    void engineStops(){
        Engine.stop();
    }
    void accelerate(){
        Engine.acc();
    }
//    void brake(){
//        Engine.brake();
//    }
    void musicStart(){
        musicPlayer.start();
    }
    void musicStops(){
        musicPlayer.stop();
    }
    void upgradation(){
        this.Engine=new EletricEngine();
    }
}
