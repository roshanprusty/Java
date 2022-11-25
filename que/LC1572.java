package com.que;

public class LC1572 {
    public static void main(String[] args) {
       int[][] mat =  {{5}};
//               {{1,1,1,1},
//                      {1,1,1,1},
//                      {1,1,1,1},
//                      {1,1,1,1}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat){
        int sumPD=0;
        int sumSD=0;
        int countPD=0;
        int countSD= mat[0].length-1;
        for (int i = 0; i < mat[0].length; i++) {
            aa:
            for (int j=0; j < mat.length; j++) {
                if (countPD<mat[0].length){
                    sumPD+=mat[i][countPD];
                    countPD++;
                    }
                if (countSD>=0 && mat[0].length/2 !=1){
                    sumSD+=mat[i][countSD];
                    countSD--;
                    break aa;
                }
            }
        }
        return (sumPD+sumSD);
            }
}
