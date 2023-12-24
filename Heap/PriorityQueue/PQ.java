package com.Heap.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQue = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            pQue.add(sc.nextInt());
        }
        System.out.print("Which kth largest element you want: ");
        int kth = sc.nextInt();
        int ans=0;
        for (int i = 0; i < kth; i++) {
            ans=pQue.remove();
        }
        System.out.println(ans);

    }
}
