//package com.RecQue;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LetterCombinations {
//    public static void main(String[] args) {
//        System.out.println(letterCombinations("23"));
//    }
//    static ArrayList<String> letterCombinations(String digits){
//        String[] atz={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//        String str1, str2;
//        ArrayList<String> ans=new ArrayList<>();
//        if(digits.length()>1){
//            str1=atz[digits.charAt(0)-49];
//            str2=atz[digits.charAt(1)-49];
//            return ans=possibleComb(str1,str2);
//        }else if (digits.length()==1){
//            str1=atz[digits.charAt(0)];
//            str2="";
//            return ans=possibleComb(str1,str2);
//        }
//        else return ans;
//
//    }
//    private static ArrayList<String> possibleComb2(String str1, String str2) {
//        //base condition
//        if(str2.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(str1);
//            return list;
//        }
//        ArrayList<String> ans = new ArrayList<>();
//        char ch = str1.charAt(0);
//        for (int i = 0; i < str2.length(); i++) {
//            String f =str2.substring(i,i+1);
//            ans.addAll(possibleComb2(ch+f,str2.substring(1)));
//        }
//        return ans;
//
//    }
//
//    private static ArrayList<String> possibleComb(String p, String str1, String str2) {
//        //base condition
//        if(str2.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        ArrayList<String> ans = new ArrayList<>();
//        for (int i = 0; i < str2.length(); i++) {
//            char ch = str1.charAt(i);
//            String ch2 =str2.substring(0,i+1);
//            possibleComb(ch+ch2,str1,str2.substring(0,1));
//        }
//    }
//}
