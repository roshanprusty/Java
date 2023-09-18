package com.Tree.BinaryTreeQue.DFS;

import java.util.ArrayList;
import java.util.Stack;
public class PathExist {
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
    public static void display(Node node){
        if(node == null) return;
        String str= "";
        str+= node.left == null ? "." : node.left.data+"";
        str+="<-"+node.data+"->";
        str+=node.right==null? "." : node.right.data +"";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public static boolean findPath(Node node, int[] arr){
        if (node == null) {
            return false;
        }
        if (node.data == arr[0]) {
            return helper(node, arr, 1);
        }
        // Recursively search in both left and right subtrees
        return findPath(node.left, arr) || findPath(node.right, arr);
    }

    public static boolean helper(Node node, int[] arr, int idx){
        if (idx == arr.length) {
            return true; // All elements in the array have been matched
        }

        boolean found = false;

        if (node.left != null && node.left.data == arr[idx]) {
            found = helper(node.left, arr, idx + 1);
        }

        if (!found && node.right != null && node.right.data == arr[idx]) {
            found = helper(node.right, arr, idx + 1);
        }

        return found;
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
        int[] path = {50, 25, 12};
        System.out.println(findPath(root, path));
    }
}

