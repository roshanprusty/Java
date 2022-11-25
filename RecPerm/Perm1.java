package com.RecPerm;

import java.util.ArrayList;

public class Perm1 {
    public static void main(String[] args) {
        System.out.println(permuntationAL("","abc"));
    }

    static void permuntation(String p,String up) {
        //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permuntation(f+ch+s, up.substring(1));

        }

    }

    static ArrayList<String> permuntationAL(String p,String up) {
        //base condition
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch =up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permuntationAL(f+ch+s,up.substring(1)));
        }
        return ans;

    }

    static int permuntationCount(String p,String up) {
        //base condition
        if(up.isEmpty()){
            return 1;
        }

        int count=0;
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count+=permuntationCount(f+ch+s, up.substring(1));
        }
        return count;

    }
}
