package com.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
//        First in First out
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek()); //1
        System.out.println(queue.remove()); //1
        System.out.println(queue.remove()); //2

    }
//    static void getValue()
}
