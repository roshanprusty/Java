package com.Tree.BinaryTreeQue.DFS;


public class OrderWise {
//      pre: root - left - right
//      in:  left - root - right
//      post: left - right - root
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
    public static Node construct(int[] arr, int lo, int hi){
        if (lo>hi) return null;

        int mid = (lo+hi)/2;

        int data = arr[mid];
        Node lc = construct(arr, lo, mid-1);
        Node rc = construct(arr, mid+1, hi);

        Node node = new Node(data, lc, rc);
        return node;
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
    public static void preOrder(Node node){
        if(node==null) return;
        System.out.print(" "+node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void inOrder(Node node){
        if(node==null) return;
        preOrder(node.left);
        System.out.print(" "+node.data);
        preOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node==null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(" "+node.data);
    }
    public static void main(String[] args) {
        int[] arr ={12, 25, 37, 50, 62, 75, 87};
        Node root = construct(arr, 0, arr.length-1);
//        display(root);
        System.out.print("Pre Order: ");
        preOrder(root);
        System.out.println();
        System.out.print("In Order: ");
        inOrder(root);
        System.out.println();
        System.out.print("Post Order: ");
        postOrder(root);
    }
}

