package com.sem4;

import java.util.ArrayDeque;

class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();
//below code uses it as a queue
        arrayDeque.offer("Ganga");
        arrayDeque.offer("Yamuna");
        arrayDeque.offer("Narmada");
        System.out.println("after all offers calls : " + arrayDeque);
        System.out.println("poll returns : " + arrayDeque.poll());
        System.out.println("after calling poll : " + arrayDeque);
//below code uses it as a stack
        arrayDeque.push("Krishna");
        arrayDeque.push("Godavari");
        System.out.println("after all push calls : " + arrayDeque);
        System.out.println("pop returns : " + arrayDeque.pop());
        System.out.println("after calling pop : " + arrayDeque);
//below code uses it as a double ended queue
        arrayDeque.offerFirst("Indus");
        arrayDeque.offerLast("Ravi");
        System.out.println("arrayDeque after offerFirst and offerLast calls : " + arrayDeque);
    }
}