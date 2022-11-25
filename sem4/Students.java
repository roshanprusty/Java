package com.sem4;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
    int id,rollnum;
    float cgpa;
    Student(int id,int rollnum,float cgpa)
    {
        this.id=id;
        this.rollnum=rollnum;
        this.cgpa=cgpa;
    }
    public String toString()
    {
        return " id of the student "+id+" Roll num of the student "+rollnum+" cgpa of the student "+cgpa ;
    }
    public int compareTo(Student s)
    {
        return this.rollnum-s.rollnum;
    }
    public static void main(String st[])
    {
        ArrayList<Student> obj=new ArrayList<Student>();
        Student b1=new Student(11406575,21,7.7f);
        Student b2=new Student(10803359,2,8.7f);
        Student b3=new Student(10801867,11,9.7f);

        obj.add(b1);
        obj.add(b2);
        obj.add(b3);
        System.out.println(obj);

        Collections.sort(obj);

        System.out.println(obj);

    }
}
