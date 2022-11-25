package com.sem4;
import java.util.*;
class LinkListDemo
{
    public static void main(String st[])
    {
        LinkedList<String> l=new LinkedList<String>();
        l.add("lpu");
        l.add("Vertors");
        l.add("jalandhar");//when u use add it will add the element at the last node of linkedList

        l.add("jalandhar");
        for(String s:l)
        {
            System.out.println(s);
        }
        l.add(0,"Think Big");
        for(String s:l)
        {
            System.out.println(s);
        }
        l.addFirst("punjab");
        l.addLast("144001");
        for(String s:l)
        {
            System.out.println(s);
        }
        System.out.println(l.contains("punjab"));
        System.out.println(l.remove());
        for(String s:l)
        {
            System.out.println(s);
        }
        System.out.println(l.indexOf("jalandhar"));
        System.out.println(l.lastIndexOf("jalandhar"));
        System.out.println(l.size());


    }
}