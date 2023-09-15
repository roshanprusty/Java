package com.Tree.BinaryTreeQue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class LowestCommonAncestor {
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
    public static List<Integer> path = new ArrayList<>();
    public static int lca(Node node, int p, int q){
        targetPath(node,p);
        List<Integer> pathP=path;
        path.clear();
        targetPath(node,p);
        List<Integer> pathQ=path;
        for(int i=0; i<pathP.size()-1; i++){
            if(pathP.get(i+1)!=pathQ.get(i+1)) return pathP.get(i);
        }
        return -1;
    }

    public static boolean targetPath(Node node, int target){
        if(node==null) return false;
        if(target== node.data) return true;
        boolean left = targetPath(node.left, target);
        if(left) path.add(node.data);
        boolean right = targetPath(node.right, target);
        if(right) path.add(node.data);
        return false;
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
        System.out.println(lca(root,25,87));
    }
}
