package com.Tree.binarytree;
import java.util.Stack;

public class iterativePrePostInTraversal {
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

    public static void prePostIn(Node node){
        Stack<Pair> stack = new Stack<>();
        Pair rtp= new Pair(node, 1);
        stack.push(rtp);
        String pre ="";
        String in="";
        String post="";
        while (stack.size()>0){
            if(stack.peek().state==1){//pre
                pre+=stack.peek().node.data+" ";
                stack.peek().state++;
                if(stack.peek().node.left!=null) {
                    Pair lp = new Pair(stack.peek().node.left,1);
                    stack.push(lp);
                }
            } else if (stack.peek().state==2) {
                in+=stack.peek().node.data+" ";
                stack.peek().state++;
                if(stack.peek().node.right!=null) {
                    Pair lp = new Pair(stack.peek().node.right,1);
                    stack.push(lp);
                }
            }else {
                post+= stack.peek().node.data+" ";
                stack.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
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
        prePostIn(root);

    }

}
