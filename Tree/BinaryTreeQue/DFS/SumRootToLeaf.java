package com.Tree.BinaryTreeQue.DFS;
import java.util.ArrayList;
import java.util.Stack;
public class SumRootToLeaf {
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
    public static int ans=0;
    public static int sumRootToLeaf(Node root, int sum) {
        if(root==null) return 0;
        sum=10*sum+root.data;
        sumRootToLeaf(root.left,sum);
        if(root.left==null && root.right==null) ans+=sum;
        sumRootToLeaf(root.right, sum);
        return ans;
    }
    public static void main(String[] args) {
        Integer[] arr={1, 2, null, null, 3, null, null};

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
        System.out.println(sumRootToLeaf(root, ans));
    }
}

