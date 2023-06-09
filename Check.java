package com;

public class Check {
    public static void main(String[] args) {
        int[][] grid ={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));

    }
    public static int countNegatives(int[][] grid) {
        int count=0;
        // for (int i=0; i<grid.length; i++) {
        //     for (int j=0; j<grid[0].length; j++) {
        //         if(grid[i][j]<0) count++;
        //     }
        // }
        int idx=0;
        int gridLen = grid.length-1;
        int i=0;
        for(i=(i+1==gridLen)?0:i+1; idx!=gridLen ; i++){
            if(grid[idx][i]<0) count++;
            if(i==gridLen) idx++;

        }
        return count;

    }
}
