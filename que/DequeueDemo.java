package com.que;

import java.util.*;
class DequeueDemo
{
    public static void main(String st[]) {
        Deque<String> q = new ArrayDeque<String>();
        q.addFirst("Lpu");
        q.add("Vertos");
        q.addLast("Jalandhar");

        System.out.println("============");
        for (String s : q) {
            System.out.println(s);
        }
        System.out.println("============");

        System.out.println("============");
        System.out.println(q.peek());
        System.out.println("============");
//System.out.println(q.remove());
//System.out.println(q.removeLast());
//System.out.println(q.remove());
//System.out.println(q.removeLast());
        System.out.println(q.poll());
        System.out.println(q.pollLast());
        System.out.println(q.poll());
        System.out.println(q.pollLast());

    }
}