package com.Heap;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            heap.insert(sc.nextInt());
        }
        System.out.println(heap.remove());
    }
}
