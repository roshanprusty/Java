//package com.Tree.AvlTree;
//
//public class AVL {
//    public static class Node{
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data, Node left, Node right){
//            this.data=data;
//            this.left=left;
//            this.right=right;
//        }
//    }
//    public static Node construct(int[] arr, int lo, int hi){
//        if (lo>hi) return null;
//
//        int mid = (lo+hi)/2;
//
//        int data = arr[mid];
//        Node lc = construct(arr, lo, mid-1);
//        Node rc = construct(arr, mid+1, hi);
//
//        Node node = new Node(data, lc, rc);
//        return node;
//    }
//
//    public static void display(Node node){
//        if(node == null) return;
//        String str= "";
//        str+= node.left == null ? "." : node.left.data+"";
//        str+="<-"+node.data+"->";
//        str+=node.right==null? "." : node.right.data +"";
//        System.out.println(str);
//
//        display(node.left);
//        display(node.right);
//    }
//    public static Node rotate(Node node){
//        //left heavy
//        if(height(node.left)-height(node.right)>1){
//            //left left case
//            if(height(node.left.left) - height(node.left.right) > 0){
//                return rightRotate(node);
//            }
//            //left right case
//            if(height(node.left.left) - height(node.left.right) > 0){
//                node.left=leftRotate(node.left);
//                return rightRotate(node);
//            }
//        }
//    }
//    public static int height(Node node){
//        if(node==null) return 0;
//        int left = height(node.left);
//        int right = height(node.right);
//        return Math.max(left, right)+1;
//    }
//    public static void main(String[] args) {
//        int[] arr ={12, 25, 37, 50, 62, 75, 87};
//        Node root = construct(arr, 0, arr.length-1);
//        display(root);
//    }
//}
//
