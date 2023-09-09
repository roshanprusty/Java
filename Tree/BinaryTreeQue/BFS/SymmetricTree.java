package com.Tree.BinaryTreeQue.BFS;

import java.util.ArrayList;
import java.util.Stack;
public class SymmetricTree {
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
    public static boolean isSymmetric(Node root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }
    public static boolean isSymmetricHelp(Node left, Node right)
    {
        if(left==null || right==null)
        {
            return left==right;
        }
        if(left.data!=right.data)
        {
            return false;
        }
        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }

    public static void main(String[] args) {
        Integer[] arr={1, 2, 3, null, null, 4, null, null, 2, 4, null, null, 3, null, null};

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
        System.out.println(isSymmetric(root));
    }
}

