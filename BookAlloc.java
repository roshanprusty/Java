//package com;
//
//import com.array2.searching.BinarySearch;
//
//public class BookAlloc {
//    public static void main(String[] args) {
//
//    }
//    public static long ayushGivesNinjatest(int n, int m, int[] time) {
//        // Write your code here.
//        //n: days
//        //m: chapters
//        double pair = Math.ceil(m/n);
//        int temp = (int)(Math.ceil(time.length / pair));
//        int[] newtime = new int[temp];
//        int prefix = time[0];
//        int count=1;
//        int newc =0;
//        int max=0;
//        for (int i = 1; i <temp; i++) {
//            prefix += time[i];
//            count++;
//            if (count == 2) {
//                if(prefix>max) max = time[i];
//                newtime[newc] = prefix;
//                count = 0;
//                newc++;
//                prefix = 0;
//            }
//        }
//        int ans = binarySearch(time,max);
//
//    }
//    static int binarySearch(int[] arr, int target){
//        int start=0;
//        int end=arr.length-1;
//
//        while (start<=end){
//
//            int mid = start + (end- start)/2;
//            if(target<arr[mid]){
//                end=mid-1;
//
//            }else if(target>arr[mid]){
//                start=mid+1;
//            }else {
//                return mid;
//            }
//        }
//        return -1;
//
//    }
//}
////
////package com;
////
////public class BookAlloc {
////    public static void main(String[] args) {
////
////    }
////    public static long ayushGivesNinjatest(int n, int m, int[] time) {
////        // Write your code here.
////        //n: days
////        //m: chapters
////        double pair = Math.ceil(m/n);
////        int temp = (int)(Math.ceil(time.length / pair));
////        int[] newtime = new int[(int)(time.length / pair)];
////    }
////}
