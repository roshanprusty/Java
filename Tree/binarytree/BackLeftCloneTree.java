package com.Tree.binarytree;

import java.util.Stack;

public class BackLeftCloneTree {
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
    public static Node backLCT(Node node){
        if(node==null) return null;
        Node l = backLCT(node.left.left);
        Node r = backLCT(node.right);

        node.left=l;
        node.right=r;
        return node;
    }
    public static void main(String[] args) {
        Integer[] arr={50,50, 25, 25, 12, 12, null, null, null, null, 37, 37, 30, 30, null, null, null, null, null, null, 75, 75, 62, 62, null, null, 70, 70, null, null, null, null, 87, 87, null, null, null};

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
        System.out.println("----------------------------------------------------------------------------------");
        display(backLCT(root));
    }
}

