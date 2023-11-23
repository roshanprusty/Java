package com.OOP6.Lambda;

public class New {
    public static void main(String[] args) {
        Operation sum = new Operation() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        Operation subtract = new Operation() {
            @Override
            public int operation(int a, int b) {
                return b-a;
            }
        };
        Operation product = (a,b) -> a*b; //****

        New myCalc= new New();
        System.out.println(myCalc.operate(25,45,sum));
        System.out.println(myCalc.operate(25,45,subtract));
        System.out.println(myCalc.operate(25,45,product));

    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a, int b);
}
