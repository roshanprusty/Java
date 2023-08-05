package com.Tree.binarytree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
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
    public static void levelOrder(Node node){
        if (node == null) {
            return; // If the tree is empty, there is nothing to traverse
        }
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        while (!que.isEmpty()){
            Node temp = que.remove();
            if(temp.left!=null) que.add(temp.left);
            if(temp.right!=null) que.add(temp.right);
            System.out.print(temp.data+" ");
        }
    }
    public static ArrayList<Integer> path = new ArrayList<>();
    public static boolean nodeToRoot(Node node, int target){
        if(node==null) return false;
        if(node.data==target){
            path.add(node.data);
            return true;
        }
        boolean finls = nodeToRoot(node.left,target);
        if(finls){
            path.add(node.data);
            return true;
        }
        boolean firs = nodeToRoot(node.right, target);
        if(firs){
            path.add(node.data);
            return true;
        }
        return false;
    }
    public static Node leftCloneTree(Node node){
        if(node==null) return null;

        Node lcr = leftCloneTree(node.left);
        Node rcr = leftCloneTree(node.right);

        Node newNode = new Node(node.data, lcr, null);
        node.left=newNode;
        node.right=rcr;
        return node;

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
        Node ans =leftCloneTree(root);
        display(ans);
    }
}

