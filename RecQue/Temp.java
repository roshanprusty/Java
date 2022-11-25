package com.RecQue;

import java.util.ArrayList;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
//       lC("","abc","def");
        System.out.println(lC("abc","def"));
    }
    static ArrayList<String> lC(String s1, String s2){
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    ans.add(s1.substring(i, i + 1) + s2.substring(j, j + 1));
            }
        }
        return ans;
    }
}


