package com.OOP2;

public class InnerClass {

    //having class as static ~ It means Test does not depend upon class InnerClass
    //but internally they can dependent with each other (main - test)
    static class Test{
        static String name="For now, no name has been inserted";
        public Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("roshan");
        Test b = new Test("rohit");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(Test.name);

    }
}

