package com.Tree.BinaryTreeQue;

import com.Tree.BinaryTreeQue.BFS.BFS;
import com.stack_queue.Q;

import java.util.*;

public class Demo {
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
    public static List<ArrayList<Integer>> DFS(Node node){
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        boolean flag = false;
        List<ArrayList<Integer>> list = new ArrayList<>();
        while (!que.isEmpty()){
            int size=que.size();
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node remove = que.remove();
                if(remove.left!=null) que.add(remove.left);
                if(remove.right!=null) que.add(remove.right);
                al.add(remove.data);
            }
            if(flag) {
                Collections.reverse(al);
                flag =false;
                list.add(al);
                continue;
            }
            list.add(al);
            flag=true;
        }
        return list;
    }
    public static void levelWise(Node node){
        Queue<Node> que = new ArrayDeque<>();
//        Use ArrayDeque if you need a queue with good performance for adding and removing elements from both ends of the queue (front and back) and don't require additional list operations.
//        Use LinkedList if you need a queue with similar performance characteristics but also require additional list-related operations (e.g., inserting elements at specific positions) or if you need to iterate through the queue frequently.
        que.add(node);
        while (!que.isEmpty()){
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Node temp = que.remove();
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
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
        System.out.println(DFS(root));
    }
}

