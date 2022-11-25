package com.que;

import java.util.Locale;

public class LC2129 {
    public static void main(String[] args) {
//If the length of the word is 1 or 2 letters, change all letters to lowercase.
//Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
        String name ="mr ROShan pRuStY";
        System.out.println(capitalizeTitle(name));
    }
    /*
    logic
    if(length of the word == 1 or == 2 ----> change the word into the lower case
    else first word to capital and rest all word into lower case.
    */
    static String capitalizeTitle(String title){
        int length=0;
        title.toLowerCase();
        aa:
        for (int i = 0; i < title.length(); i++) {
            length++;
            if(title.charAt(i) == ' '){
                if(length>2){
                    //char1 = title.charAt(i-length-1);
                    //Character.toUpperCase(char1);
                    //title.charAt(i-length-1)=char1;
                    Character.toUpperCase(title.charAt(i-length-1));
                    length=0;
                }
            }
        }


        return title;
        }
}
//word got
//