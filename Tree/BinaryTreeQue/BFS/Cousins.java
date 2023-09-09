package com.Tree.BinaryTreeQue.BFS;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Cousins {
    //IMPORTANT
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
    public static boolean cousin(Node root, int x, int y){
        if (root == null) {
            return false;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundX = false, foundY = false;
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current.data == x) {
                    foundX = true;
                }
                if (current.data == y) {
                    foundY = true;
                }
                if (current.left != null && current.right != null) {
                    if ((current.left.data == x && current.right.data == y) || (current.left.data == y && current.right.data == x)) {
                        return false;
                    }
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            if (foundX && foundY) {
                return true;
            }

            if (foundX || foundY) {
                return false;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Integer[] arr={1, 2, 4, null, null, null, 3, null, null};

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
        System.out.println(cousin(root,2,3));
    }
}


