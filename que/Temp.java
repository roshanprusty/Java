package com.que;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(ans(input));
    }
    static int ans(String input){
        Integer[] arr={0,0,0,0,0};
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='c') {
                arr[0] += 1;
                continue;
            }
            if(input.charAt(i)=='o') {
                arr[1] += 1;
                continue;
            }
            if(input.charAt(i)=='v') {
                arr[2] += 1;
                continue;
            }
            if(input.charAt(i)=='i') {
                arr[3] += 1;
                continue;
            }
            if(input.charAt(i)=='d') {
                arr[4] += 1;
                continue;
            }
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[4];
    }





//    static int ans(String input){
//        // String[] arr= input.split("");
//        String ans="     ";
//        String flag="";
//        int count=0,check=0;
//        for(int i= 0; i<input.length(); i++){
//            if(input.charAt(i)=='c'){
//                ans+=input.charAt(0);
//                flag+=i;
//                continue;
//            }
//            if(input.charAt(i)=='o'){
//                flag+=i;
//                ans+=input.charAt(1);
//                continue;
//            }
//            if(input.charAt(i)=='v'){
//                flag+=i;
//                ans+=input.charAt(3);
//                continue;
//            }
//            if(input.charAt(i)=='i'){
//                flag+=i;
//                ans+=input.charAt(3);
//                continue;
//            }
//            if(input.charAt(i)=='d'){
//                flag+=i;
//                ans+=input.charAt(4);
//                continue;
//            }
//            if(ans=="covid") {
//                for (int j = 0; j < flag.length(); j++) {
//                    input=input.substring(0, flag.charAt(j)) + input.substring(flag.charAt(j) + 1);
//                    flag="";
//                    ans="     ";
//                }
//                count++;
//            }
//
//        }
//        return count;
//    }
}
