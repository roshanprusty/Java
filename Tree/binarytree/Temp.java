package com.Tree.binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class Temp {
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
    public static void leftView(Node node, int level, ArrayList<Integer> al){
        if(node==null) return;
        if(level==al.size()) {
            System.out.println(node.data);
            al.add(node.data);
        }
        leftView(node.left,level+1, al);
        leftView(node.right,level+1, al);
    }
    public static Node invert(Node node){
        if(node==null) return null;
        Node temp= node.left;
        node.left=node.right;
        node.right=temp;
          invert(node.left);
          invert(node.right);
          return node;
    }
    public static boolean subTree(Node root, Node subRoot){
        if(root==null) return false;
        if(identical(root, subRoot)) return true;
        subTree(root.left,subRoot);
        subTree(root.right,subRoot);
        return false;
    }
    public static boolean identical(Node T1, Node T2){
        if(T1==null || T2==null) return T1==T2;
        return (T1.data==T2.data && identical(T1.left,T2.left) && identical(T1.right,T2.right));
    }
    public static void main(String[] args) {
        Integer[] arr={3,4,1,null,null,2,null,null,5,null,null};

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
//        ArrayList<Integer> al=new ArrayList<>();
//        leftView(root,0, al);
//        display(root);
//        System.out.println("**************************************");
//        display(invert(root));
        System.out.println(subTree(root,));
    }
}

