package com.sem4;

import java.util.*;
class HashSetDemo
{
    public static void main(String st[])
    {
        Set obj=new HashSet();
        obj.add("Neha");
        obj.add("Rakesh");
        obj.add("");
        obj.add("null");
        obj.add("Promila");
        obj.add(null);
        obj.add(null);
        System.out.println(obj);
    }
}