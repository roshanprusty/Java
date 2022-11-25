package com.OOP3;

class A{
    public  void show(){
        System.out.println("A");
    }
}
class B extends A{
    public final void show(){
        System.out.println("B");
    }

}
public class Temp {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
//        B obj1 = new A(); -----> It will throw error

    }
}
