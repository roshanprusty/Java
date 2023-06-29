package com.Tree.binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class KLevelFar {
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
    public static ArrayList<Integer> al = new ArrayList<>();
    public static boolean nodeToRoot(Node node, int value){
        if(node==null) return false;
        if(node.data==value) return true;
        boolean fils = nodeToRoot(node.left, value);
        if(fils){
            al.add(node.data);
            return true;
        }
        boolean firs=nodeToRoot(node.right, value);
        if(firs){
            al.add(node.data);
            return true;
        }
        return false;
    }
    public static void kLevelFar(Node node, int value){
        //Node to root
        nodeToRoot(node, value);
        if(al.isEmpty()) System.out.println("Value not found");
        ArrayList<Integer> ans = new ArrayList<>();
        


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
    }
}

