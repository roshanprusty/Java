package com.string.StringBuffer;

public class SB {
//    String is a in-mutable where as StringBuilder is a mutable
//    mutable means suppose String a = "rnp"; here if we edit it will create new object rather than edit.
//    But in StringBuilder we can do edit in same object, rather than creating another object

//    Advantage: mutable, Efficient, Thread sage

//    capacity: starting it will have 16 character if you add more it will double the size like second time it will become 32

//    There are three type StringBuffer
//    constructor 1:
//    StringBuffer sb = new StringBuffer();
//
//    constructor 2:
//    StringBuffer sb2 = new StringBuffer("Roshan Prusty");
//
//    constructor 3:
//    StringBuffer sb3= new StringBuffer(30); //although size should be 32 after 16 but now size is fixed to 30

//    what is the difference between stringbuffer vs stringbuilder vs normal string
//    String: Strings in Java are immutable, meaning once a string is created, it cannot be modified. Any operation that appears to modify a string actually creates a new string. This immutability ensures that strings cannot be changed after they are created.
//    StringBuffer: StringBuffer is mutable, which means you can modify its content. This makes it suitable for scenarios where you need to perform frequent string manipulations efficiently.
//    StringBuilder: Like StringBuffer, StringBuilder is also mutable, but it is not thread-safe. If you're working in a single-threaded environment and need mutability, StringBuilder is often recommended over StringBuffer due to its better performance.
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Hi, It's Roshan");
        sb.insert(0, "hey "); //hey Hello Hi, It's Roshan
        sb.replace(0, 4, "Hola "); //Hola Hello Hi, It's Roshan
        sb.delete(1, 5); //HHello Hi, It's Roshan
        sb.reverse(); //nahsoR s'tI ,iH olleHH
        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.capacity());
        StringBuffer sb3 = new StringBuffer(25);
        System.out.println(sb3.capacity());

        StringBuilder sbd = new StringBuilder();
        
    }
}
