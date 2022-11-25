package com.BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
//        path("",3,3);
        boolean[][] board ={{true, true, true},
                           {true, true, true},
                           {true, true, true}};
//        mazeRestriction("",0,0,board);
    }

    //return the no of ways to reach destination
    //direction --> Down & right
    static int maze(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int left= maze(row-1,col);
        int right= maze(row,col-1);
        return left+right;
    }

    //returns the all the possible direction to reach the destination
    //direction --> Down & right
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1) path(p+'D',r-1, c);
        if(c>1) path(p+'R',r, c-1);
    }

    //returns the all the possible direction to reach the destination ----> using Array list
    //direction --> Down & right
    static ArrayList<String> pathRT(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1) ans.addAll(pathRT(p+'D',r-1, c)); //down
        if(c>1) ans.addAll(pathRT(p+'R',r, c-1)); //right
        return ans;
    }

    //returns the all the possible direction to reach the destination ----> using Array list
    //direction --> Diagonal, Down & right
    static ArrayList<String> pathRtDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1 && c>1) ans.addAll(pathRtDiagonal(p+'D',r-1,c-1)); //Diagonal
        if(r>1) ans.addAll(pathRtDiagonal(p+'V',r-1, c)); //vertical
        if(c>1) ans.addAll(pathRtDiagonal(p+'H',r, c-1)); //horizontal
        return ans;
    }

    //if there is any restriction then after what is possible ways to reach the destination
    static void mazeRestriction(String p, int r, int c, boolean[][] maze){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) return;
        if(r<maze.length-1) mazeRestriction(p+'V',r+1, c,maze); //vertical
        if(c<maze[0].length-1) mazeRestriction(p+'H',r, c+1,maze); //horizontal

    }


}
