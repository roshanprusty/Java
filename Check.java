//package com;
//
//import java.util.ArrayList;
//
//public class Check {
//    public static void main(String[] args) {
//        int n;
//        System.out.println(n);
//
//    }
//    public static void merge(int[][] intervals) {
//        int totalElements = 0;
//        for (int[] array : intervals) {
//            totalElements += array.length;
//        }
//        int[] mergedArray = new int[totalElements];
//        int index = 0;
//        for (int[] array : intervals) {
//            for (int element : array) {
//                mergedArray[index++] = element;
//            }
//        }
//        ArrayList<Integer> al = new ArrayList<>();
//        for(int i=0; i<totalElements-1; i++){
//            if(mergedArray[i]<=mergedArray[i+1] && i%2!=0){
//                continue;
//            }
//            al.add(mergedArray[i]);
//        }
//        int[][] twoDArray = new int[al.size()/2][];
//        int idx = 0;
//        for (int i = 0; i < al.size()/2; i++) {
//            for (int j = 0; j < 2; j++) {
//                if (idx < al.size()) {
//                    twoDArray[i][j] = al.get(idx++);
//                }
//            }
//        }
//        for (int i = 0; i < al.size()/2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(twoDArray[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
