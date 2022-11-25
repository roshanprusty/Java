package com.sem4;

import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    String name;
    String author;
    String publisher;
    int quantity;
    int id;
    Book(String name,String author,String publisher,int quantity,int id)
    {
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
        this.id=id;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Book> al=new ArrayList<Book>();
        System.out.println("Enter the number of books");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of book");
            String name=sc.next();
            System.out.println("Enter the author of book");
            String author=sc.next();
            System.out.println("Enter the publisher of book");
            String publisher=sc.next();
            System.out.println("Enter the quantity of book");
            int quantity=sc.nextInt();
            System.out.println("Enter the id of book");
            int id=sc.nextInt();
            Book b=new Book(name,author,publisher,quantity,id);
            al.add(b);
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.println("Name of book is "+al.get(i).name);
            System.out.println("Author of book is "+al.get(i).author);
            System.out.println("Publisher of book is "+al.get(i).publisher);
            System.out.println("Quantity of book is "+al.get(i).quantity);
            System.out.println("Id of book is "+al.get(i).id);
        }
    }
}

