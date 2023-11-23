package com.OOP6.ExceptionHandling;
//https://youtu.be/OY2lPr8h93U?t=3411
public class TryCatchFinally {
    public static void main(String[] args) {
        int a=5;
        int b=0;
//        System.out.println(a/b); //error
        try{
            divide(a,b);
            //mimcing; sorry I don't know the spelling.
            throw new Exception("just for fun");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("This will also print");
        } catch (Exception e) {
            System.out.println("Normal Exception");
        } finally {
            System.out.println("This will always run, don't care about the result");
        }
    }
    private static void divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Please do not specify the value b=0");
        System.out.println(a/b);
    }
}
