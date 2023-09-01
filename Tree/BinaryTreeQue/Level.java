package com.Tree.BinaryTreeQue;


import java.util.*;

public class Level {
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
    public static void levelWise(Node node){
        //R P A (remove print add)
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        while (mq.size()>0){
            int count = mq.size();
            for (int i = 0; i <count ; i++) {
                node=mq.remove(); //remove
                System.out.print(node.data+" "); //print
                if(node.left != null) mq.add(node.left); //left child added
                if(node.right != null) mq.add(node.right); //right child added
            }
            System.out.println();
        }
    }
    public static List<Double> avgDouble(Node node){
        List<Double> list = new ArrayList<>();
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        while (mq.size()>0){
            int count = mq.size();
            double sum=0;
            for (int i = 0; i <count ; i++) {
                node=mq.remove();
                sum+=node.data;
                if(node.left != null){
                    mq.add(node.left);
                }
                if(node.right != null){
                    mq.add(node.right);
                }
            }
            list.add((double)sum/count);
        }
        return list;
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
        levelWise(root);
        System.out.println(avgDouble(root));

    }
}