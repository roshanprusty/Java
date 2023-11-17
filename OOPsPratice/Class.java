package com.OOPsPratice;

public class Class implements InterfaceA, InterfaceB{
    InterfaceA IA = new InterfaceA() {
        @Override
        public void func() {
            System.out.println("HI from InterfaceA");
        }
    };
    InterfaceA IB = new InterfaceA() {
        @Override
        public void func() {
            System.out.println("HI from InterfaceB");
        }
    };
    public void funcIA(){
        IA.func();
    }
    public void funcIB(){
        IB.func();
    }

    @Override
    public void func() {
        IA.func();
        IB.func();
    }

    @Override
    public void greeting() {
        InterfaceA.super.greeting();
        InterfaceB.super.greeting();
    }

}
