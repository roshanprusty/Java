package com.OOP5.Interface.DealingMultipleInterface;

import com.OOP5.Interface.Brake;
import com.OOP5.Interface.Engine;
import com.OOP5.Interface.Media;

public class Car implements Brake, Engine, Media {
    Brake brake = new Brake() {
        @Override
        public void brake() {
            System.out.println("My work is to apply brake!");
        }
    };
    Engine engine = new Engine() {
        @Override
        public void start() {
            System.out.println("My work is to start the engine");
        }

        @Override
        public void stop() {
            System.out.println("My work is stop the engine");
        }

        @Override
        public void acc() {
            System.out.println("My work is to accelerate the engine");
        }
    };
    Media media = new Media() {
        @Override
        public void start() {
            System.out.println("My work is to start the Music Media");
        }

        @Override
        public void stop() {
            System.out.println("My work is to stop the Music Media");
        }
    };

    @Override
    public void brake() {
        brake.brake();
    }

    @Override
    public void start() {
        System.out.println("startMedia() for starting the media");
        System.out.println("startEngine() for starting the engine");
    }

    @Override
    public void stop() {
        System.out.println("stopMedia() for stopping the media");
        System.out.println("stopEngine() for stopping the engine");
    }

    @Override
    public void acc() {
        engine.acc();
    }
    public void startMedia(){
        media.start();
    }
    public void stopMedia(){
        media.stop();
    }
    public void startEngine(){
        engine.start();
    }
    public void stopEngine(){
        engine.stop();
    }
}
