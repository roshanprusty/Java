package com.OOP2;

public class Human {
    void grett(){
        System.out.println("hello");
    }
        static class Student{
            static int rn;
            String name;
            int std;

            public Student(int rn, String name, int std) {
                this.rn = rn;
                this.name = name;
                this.std = std;
            }
        }

    public static void main(String[] args) {
        Human b = new Human();
//        a.Student(24,"sai",4);
        b.grett();
        Human.Student.rn=44;

        Student.rn=24; //now it's fine bcz rn is static! ---> it will throw error when it will non-static.
        /*
         we are making the object, although it is static class bcz the given variable & function
         inside the class which is non-static to access them we are making object of a whole class
          --- so now by using this object we can access the function & variable.
        */
        Student a = new Student(24,"roshan",4);



    }
}

