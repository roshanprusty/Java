package com.String2;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("roshan favourite app fruit is applemango"));
    }
    static String skipWord(String up){
        if(up.isEmpty()) return "";
        if(up.startsWith("apple")){
            return skipWord(up.substring(5));
        }else{
            return up.charAt(0) + skipWord(up.substring(1));
        }
    }
    //Skip a string when if it's not a required string.
    //skip app if it's not apple
    static String skipAppNotApple(String up){
        //base condition
        if(up.isEmpty()) return "";

        if(up.startsWith("app") && !up.startsWith("apple")){
           return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
