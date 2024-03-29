package com.Tree.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Intro1 {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node, int state){
            this.node=node;
            this.state=state;
        }
    }

    public static int size(Node node){
        //base case
        if(node == null) return 0;
        int ls = size(node.left);
        int rs = size(node.right);
        int ts =  ls+rs+1;
        return ts;
    }
    public static int sum(Node node){
        //base case
        if(node == null) return 0;
        int lsm = sum(node.left);
        int rsm = sum(node.right);
        int tsm =  lsm+rsm+ node.data;
        return tsm;
    }
    public static int max(Node node){
        //base case
        if(node == null) return Integer.MIN_VALUE;
        if(node == null) return 0;
        int lm = max(node.left);
        int rm = max(node.right);
        int tm =  Math.max(node.data, Math.max(lm, rm));
        return tm;
    }
    public static int height(Node node){
        if(node==null) return -1;
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(lh,rh)+1;
        return th;
    }

    
    public static void main(String[] args) {
        Integer[] arr={50, 25, 12, null, null, 37, 30, null,
                null, null, 75, 62, null, 70, null, null, 87, null, null};

        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx=0;

        while (st.size()>0){
            Pair top = st.peek();
            if(top.state==1){
                //left
                idx++;
                if(arr[idx]!=null){
                    top.node.left = new Node(arr[idx],null, null);
                    Pair lp = new Pair(top.node.left,1);
                    st.push(lp);
                }else{
                    top.node.left=null;
                }
                top.state++;
            } else if (top.state==2) {
                //right
                idx++;
                if(arr[idx]!=null){
                    top.node.right = new Node(arr[idx],null, null);
                    Pair rp = new Pair(top.node.right,1);
                    st.push(rp);
                }else{
                    top.node.right=null;
                }
                top.state++;
            }else {
                st.pop();
            }
        }
//        display(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}
