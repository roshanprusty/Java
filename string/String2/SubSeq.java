package com.string.String2;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str="abc";
        subseqAscii(str,"");
    }

    static void subseq(String up, String p) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(up.substring(1), ch+p); //taken
        subseq(up.substring(1), p); //ignored
    }

    //using Arraylist
    static ArrayList<String> subseq2(String up, String p) {
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left = subseq2(up.substring(1), ch+p); //taken
        ArrayList<String> right = subseq2(up.substring(1), p); //ignored
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //in Ascii, we have to make 3
        subseqAscii( up.substring(1),p + ch);
        subseqAscii( up.substring(1), p);
        subseqAscii( up.substring(1), p + (ch+0));
    }

    static ArrayList<String> subseqAsciiRet(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(up.substring(1),p + ch);
        ArrayList<String> second = subseqAsciiRet(up.substring(1), p);
        ArrayList<String> third = subseqAsciiRet(up.substring(1), p + (ch+0));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

