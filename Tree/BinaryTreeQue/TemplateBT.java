package com.Tree.BinaryTreeQue;

import java.util.ArrayList;
import java.util.Stack;
public class TemplateBT {
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
    public static Node binaryTreePruning(Node node){
        if (node == null) return null;

        // Recursively prune left and right subtrees
        node.left = binaryTreePruning(node.left);
        node.right = binaryTreePruning(node.right);

        // Check and prune the current node
        if (node.data != 1 && node.left == null && node.right == null) {
            return null; // If node has no children and data is not 1, remove it
        }

        return node;
    }

    public static void main(String[] args) {
        Integer[] arr={1, 0, 0, null, null, 0, null, null, 1, 0, null, null, 1, null, null};

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
        display(root);
        display(binaryTreePruning(root));
    }
}

