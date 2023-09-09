package com.Tree.BinaryTreeQue.BFS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
public class PopulatingNext {
//    https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
//    Do chect out, Important one
    public static class Node{
        int data;
        Node left;
        Node right;
        Node next;

        Node(int data, Node left, Node right, Node next){
            this.data=data;
            this.left=left;
            this.right=right;
            this.next=next;
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
        str+="<- "+node.data+" ->";
        str+=node.right==null? "." : node.right.data +"";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public static void display2(Node node){
        if(node == null) return;
        String str= "";
        str+= node.left == null ? "." : node.left.data+"";
        str += "<- " + node.data + " (" + (node.next != null ? node.next.data : "null") + ") ->";
        str+=node.right==null? "." : node.right.data +"";
        System.out.println(str);

        display2(node.left);
        display2(node.right);
    }
    public static Node way1(Node node){
        Node start = node;
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        while (mq.size()>0){
            int count = mq.size();
            for (int i = 0; i <count ; i++) {
                node=mq.remove();
                if(i==count-1) node.next=null;
                node.next=mq.peek();
                if(node.left != null) mq.add(node.left);
                if(node.right != null) mq.add(node.right);
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Integer[] arr={50, 25, 12, null, null, 37, 30, null,
                null, null, 75, 62, null, 70, null, null, 87, null, null};

        Node root = new Node(arr[0], null, null, null);
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
                    top.node.left = new Node(arr[idx],null, null, null);
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
                    top.node.right = new Node(arr[idx],null, null, null);
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
        System.out.println("************************************************************");
        display2(way1(root));
    }
}

