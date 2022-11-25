//package com.que;
//
//import java.util.Scanner;
//
//public class LengthOfLongestSubstring {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s= in.nextLine();
//        System.out.println(lengthOfLongestSubstring(s));
//    }
//
//    static int lengthOfLongestSubstring(String s) {
//        int ptr1=0, ptr2=0,count=0,count2=0;
//        String check="";
//        String check2="";
//
//        ptr1=ptr2=s.charAt(0);
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < check.length(); j++) {
//                if(s.charAt(i)!=check.charAt(j)){
//                    check+=s.charAt(i);
//                    count++;
//                }
//                else if(s.charAt(i)==check.charAt(j)){
//                    check2+=s.charAt(i);
//                    count2++;
//                }
//            }
//        }
//    }
//}
