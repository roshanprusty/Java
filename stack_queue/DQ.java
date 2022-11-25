package com.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQ {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(25);
        deque.add(96);
        deque.addLast(55);
        deque.addFirst(44);
        deque.add(111);
        //25
        //25 96
        //25 96 55
        //44 25 96 55
        //44 25 96 55 111
        System.out.println(deque.removeFirst()); //44
        System.out.println(deque.removeLast());  //111
        System.out.println(deque.remove());      //25
    }
}
