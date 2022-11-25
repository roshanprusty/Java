package com.que;

public class AvgSalExcMinMaxSal {
    public static void main(String[] args) {
        int[] salary={1000,2000,3000};
        System.out.println(average(salary));
    }
    static double average(int[] salary){
        int min=salary[0], max=salary[0];
        double avgSal=0;
        for (int i = 0; i < salary.length; i++) {
            if(min>salary[i]){
                min=salary[i];
//                continue;
            }
            if(max<salary[i]){
                max=salary[i];
//                continue;
            }
//            avgSal+=salary[i];
        }
        for (int i = 0; i < salary.length; i++) {
            if(min == salary[i] || max == salary[i]) continue;
            avgSal+=salary[i];
        }
        return avgSal/(salary.length-2);
    }
}
