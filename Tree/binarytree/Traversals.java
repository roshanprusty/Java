package com.Tree.binarytree;

import java.util.Stack;

public class Traversals {
    public static class Node{
        int data;
        Intro1.Node left;
        Intro1.Node right;

        Node(int data, Intro1.Node left, Intro1.Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static class Pair{
        Intro1.Node node;
        int state;
        Pair(Intro1.Node node, int state){
            this.node=node;
            this.state=state;
        }
    }

    public static void display(Intro1.Node node){
        if(node == null) return;
        String str= "";
        str+= node.left == null ? "." : node.left.data+"";
        str+="<-"+node.data+"->";
        str+=node.right==null? "." : node.right.data +"";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Integer[] arr={50, 25, 12, null, null, 37, 30, null,
                null, null, 75, 62, null, 70, null, null, 87, null, null};

        Intro1.Node root = new Intro1.Node(arr[0], null, null);
        Intro1.Pair rtp = new Intro1.Pair(root, 1);
        Stack<Intro1.Pair> st = new Stack<>();
        st.push(rtp);

        int idx=0;

        while (st.size()>0){
            Intro1.Pair top = st.peek();
            if(top.state==1){
                //left
                idx++;
                if(arr[idx]!=null){
                    top.node.left = new Intro1.Node(arr[idx],null, null);
                    Intro1.Pair lp = new Intro1.Pair(top.node.left,1);
                    st.push(lp);
                }else{
                    top.node.left=null;
                }
                top.state++;
            } else if (top.state==2) {
                //right
                idx++;
                if(arr[idx]!=null){
                    top.node.right = new Intro1.Node(arr[idx],null, null);
                    Intro1.Pair rp = new Intro1.Pair(top.node.right,1);
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
        
    }
}