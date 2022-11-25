package com.array2;

public class Max_wealth {
    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3},{3,5}};
//        richest_coustomer(accounts);
        System.out.println(richest_coustomer(accounts));
    }
    static int richest_coustomer(int[][] acct){
        int max=0,total_Wealth=0;
        for (int i = 0; i < acct.length; i++) {
            int[] ints = acct[i];
            for (int j = 0; j < acct[i].length; j++) {
                total_Wealth += ints[j];
            }
            if (total_Wealth > max)
                max = total_Wealth;
            total_Wealth = 0;
        }
        return max;
    }
}
