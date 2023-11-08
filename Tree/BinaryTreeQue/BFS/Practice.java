package com.Tree.BinaryTreeQue.BFS;

import java.util.*;

public class Practice {
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
        Queue<Node> que = new ArrayDeque<>();
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
    public static void average(Node node){
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        while (!que.isEmpty()){
            int size = que.size();
            int sum=0;
            for (int i = 0; i < size; i++) {
                Node temp = que.remove();
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
                sum+=temp.data;
            }
            System.out.println(sum/size);
        }
    }
    public static int levelOrderSuccessor(Node node, int value){
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        while (!que.isEmpty()){
            Node temp = que.remove();
            if(temp.left!=null){
                que.add(temp.left);
                if(temp.data==value){
                    return que.peek().data;
                }
            }
            if(temp.right!=null){
                que.add(temp.right);
                if(temp.data==value){
                    return que.peek().data;
                }
            }

        }
        return -1;
    }
    public static List<List<Integer>> zigzagLevelOrder(Node node){
//        https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        List<List<Integer>> ans = new ArrayList<>();
        int count=0;
        while (!que.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size= que.size();
            for (int i = 0; i < size; i++) {
                Node remove = que.remove();
                if(remove.left!=null) que.add(remove.left);
                if(remove.right!=null) que.add(remove.right);
                temp.add(remove.data);
            }
            if(count%2!=0){
                Collections.reverse(temp);
            }
            ans.add(temp);
            count++;
        }
        return ans;
    }
    public static List<List<Integer>> zigzagLevelOrderII(Node node){
//        https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        List<List<Integer>> ans = new ArrayList<>();
        int count=0;
        while (!que.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size= que.size();
            for (int i = 0; i < size; i++) {
                Node remove = que.remove();
                if(remove.left!=null) que.add(remove.left);
                if(remove.right!=null) que.add(remove.right);
                temp.add(remove.data);
            }
            ans.add(temp);
            count++;
        }
        Collections.reverse(ans);
        return ans;
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
//        levelWise(root);
//        average(root);
//        System.out.println(levelOrderSuccessor(root, 70));
//        System.out.println(zigzagLevelOrder(root));
//        System.out.println(zigzagLevelOrderII(root));
    }
}


